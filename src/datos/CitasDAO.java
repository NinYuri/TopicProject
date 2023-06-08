package datos;

import java.sql.Connection;
import java.sql.Statement;
import database.Conexion;
import datos.interfaces.CrudCitas;
import entidades.Cita;
import entidades.SerSolicitado;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CitasDAO implements CrudCitas<Cita>
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public CitasDAO()
    {
        CON = Conexion.getInstancia();
    }

    @Override
    public List<Cita> listar(int id) 
    {
        List<Cita> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select * from Citas where idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Cita(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getString(8)));
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return registros;
    }

    @Override
    public boolean insertar(Cita obj) 
    {
        String sql;
        resp = false;
        Connection conn = null;
        try
        {
            conn = CON.Conectar();
            conn.setAutoCommit(false);
            sql = "INSERT INTO Citas(idCliente, idEmpleada, fechaCita, horaCita, duracionCita, costoCita, observacionesCita, estadoCita)";
            sql = sql + "VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
            
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, obj.getIdCliente());
            ps.setInt(2, obj.getIdEmpleada());
            ps.setString(3, obj.getFechaCita());
            ps.setString(4, obj.getHoraCita());
            ps.setString(5, obj.getDuracionCita());
            ps.setDouble(6, obj.getCostoCita());
            ps.setString(7, obj.getObservacionesCita());
            ps.setString(8, obj.getEstadoCita());
            
            int filasAfect = ps.executeUpdate();
            int idCitaGenerada = 0;
            
            //Obtener el IDCita
            rs = ps.getGeneratedKeys();
            if(rs.next())
                idCitaGenerada = rs.getInt(1);
            if(filasAfect == 1)
            {
                String sqlDetalles = "INSERT INTO ServiciosSol(idCita, idServicio, costoServicio, descuento, imagenServicio)";
                sqlDetalles += "VALUES(?, ?, ?, ?, ?);";
                ps = conn.prepareStatement(sqlDetalles);
                for(SerSolicitado item : obj.getDetalles())
                {
                    ps.setInt(1, idCitaGenerada);
                    ps.setInt(2, item.getIdServicio());
                    ps.setDouble(3, item.getCostoServicio());
                    ps.setDouble(4, item.getDescuento());
                    ps.setString(5, item.getImagenServicio());
                    
                    if(ps.executeUpdate() > 0)
                        resp = true;
                }
                //Cometer la transacción
                conn.commit();
            }
            else
            {
                conn.rollback();
            }
        }
        catch(SQLException e)
        {
            try
            {
                if(conn != null)
                    conn.rollback();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            catch(SQLException ex)
            {
                Logger.getLogger(CitasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        finally
        {
            try
            {
                if(rs != null)
                    rs.close();
                if(ps != null)
                    ps.close();
                if(conn != null)
                    conn.close();
            }
            catch(SQLException ex)
            {
                Logger.getLogger(CitasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resp;
    }

    @Override
    public boolean actualizar(Cita obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Citas \n" +
        "set fechaCita = ?, horaCita = ?, observacionesCita = ?, estadoCita = ? \n" +
        "where idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setString(1, obj.getFechaCita());
            ps.setString(2, obj.getHoraCita());
            ps.setString(3, obj.getObservacionesCita());
            ps.setString(4, obj.getEstadoCita());
            ps.setInt(5, obj.getIdCita());
            
            if(ps.executeUpdate() > 0)
                resp = true;
            ps.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean borrar(String estado, int id) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Citas set estadoCita = ? where idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, id);
            if(ps.executeUpdate() > 0)
                resp = true;
            ps.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean existe(String fecha, int idCliente, String hora) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "select idCita from Citas where fechaCita = ? and idCliente = ? and horaCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, fecha);
            ps.setInt(2, idCliente);
            ps.setString(3, hora);
            rs = ps.executeQuery();
            if(rs.next())
                resp = true;
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return resp;
    }
    
    public boolean existeId(int id)
    {
        String sql;
        resp = false;
        try
        {
            sql = "select fechaCita from Citas where idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next())
                resp = true;
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return resp;
    }
    
    public int id(String fecha, int idCliente, String hora)
    {
        int id = 0;
        String sql;
        try
        {
            sql = "select idCita from Citas where fechaCita = ? and idCliente = ? and horaCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, fecha);
            ps.setInt(2, idCliente);
            ps.setString(3, hora);
            rs = ps.executeQuery();
            if(rs.next())
                id = rs.getInt(1);
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return id;
    }

    @Override
    public List<Cita> datos(int idCliente, String fecha)
    {
        List<Cita> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select idCita, horaCita, duracionCita, observacionesCita from Citas \n" +
               "where idCliente = ? and fechaCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.setString(2, fecha);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Cita(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return registros;
    }
    
    @Override
    public List<Cita> datosemp(int idEmpleada, String fecha)
    {
        List<Cita> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select idCita, horaCita, duracionCita, observacionesCita from Citas \n" +
               "where idEmpleada = ? and fechaCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idEmpleada);
            ps.setString(2, fecha);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Cita(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return registros;
    }
    
    public double costo(int id)
    {
        double costo = 0;
        String sql;
        try
        {
            sql = "select costoCita from Citas where idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next())
                costo = rs.getInt(1);
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return costo;
    }
    
    public List<Cita> fechasCitas(int idCliente, String estadoCita)
    {
        List<Cita> fechas = new ArrayList();
        String sql;
        try
        {
            sql = "select fechaCita from Citas where idCliente = ? and estadoCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.setString(2, estadoCita);
            rs = ps.executeQuery();
            while(rs.next())
                fechas.add(new Cita(rs.getString(1)));
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return fechas;
    }
    
    public boolean fechaOcupada(String fecha)
    {
        String sql;
        resp = false;
        try
        {
            sql = "select idCita from Citas where fechaCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, fecha);
            rs = ps.executeQuery();
            if(rs.next())
                resp = true;
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return resp;
    }
    
    public List<Cita> fechasTrabajo(int idEmpleada, String estadoCita)
    {
        List<Cita> fechas = new ArrayList();
        String sql;
        try
        {
            sql = "select fechaCita from Citas where idEmpleada = ? and estadoCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idEmpleada);
            ps.setString(2, estadoCita);
            rs = ps.executeQuery();
            while(rs.next())
                fechas.add(new Cita(rs.getString(1)));
            ps.close();
            rs.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return fechas;
    }
}