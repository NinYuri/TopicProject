package datos;

import database.Conexion;
import datos.interfaces.CrudCitas;
import entidades.Cita;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
                registros.add(new Cita(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7)));
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
        try
        {
            sql = "insert into Citas(idCliente, idEmpleada, fechaCita, horaCita, cantidadServicios, observacionesCita)\n" +
                "values(?, ?, ?, ?, ?, ?);";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setInt(1, obj.getIdCliente());
            ps.setInt(2, obj.getIdEmpleada());
            ps.setString(3, obj.getFechaCita());
            ps.setString(4, obj.getHoraCita());
            ps.setInt(5, obj.getCantidadServicios());
            ps.setString(6, obj.getObservacionesCita());
            
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
    public boolean actualizar(Cita obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Citas \n" +
        "set idEmpleada = ?, fechaCita = ?, horaCita = ?, cantidadServicios = ?, observacionesCita = ? \n" +
        "where idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setInt(1, obj.getIdEmpleada());
            ps.setString(2, obj.getFechaCita());
            ps.setString(3, obj.getHoraCita());
            ps.setInt(4, obj.getCantidadServicios());
            ps.setString(5, obj.getObservacionesCita());
            ps.setInt(7, obj.getIdCita());
            
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
    public boolean borrar(int id) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "delete from Citas where idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, id);
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
    public boolean existe(String texto) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "select idCita from Citas where fechaCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, texto);
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
}