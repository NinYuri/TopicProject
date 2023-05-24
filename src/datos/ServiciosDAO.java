package datos;

import database.Conexion;
import datos.interfaces.CrudServicios;
import entidades.Servicio;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ServiciosDAO implements CrudServicios<Servicio>
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public ServiciosDAO()
    {
        CON = Conexion.getInstancia();
    }
    
    @Override
    public List<Servicio> listar(String texto) 
    {
        List<Servicio> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select * from Servicios;";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Servicio(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)));
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
    public List<Servicio> listarServicio(String texto) 
    {
        List<Servicio> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select * from Servicios where tipoServicio = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, texto);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Servicio(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)));
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
    public boolean insertar(Servicio obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "insert into Servicios(nombreServicio, duracionServicio, costoServicio, descuentoServicio, tipoServicio,"
                    + "ruta1, ruta2, ruta3, ruta4, ruta5, ruta6, ruta7, ruta8) \n" +
                    "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setString(1, obj.getNombreServicio());
            ps.setString(2, obj.getDuracionServicio());
            ps.setDouble(3, obj.getCostoServicio());
            ps.setInt(4, obj.getDescuentoServicio());
            ps.setString(5, obj.getTipoServicio());
            ps.setString(6, obj.getRuta1());
            ps.setString(7, obj.getRuta2());
            ps.setString(8, obj.getRuta3());
            ps.setString(9, obj.getRuta4());
            ps.setString(10, obj.getRuta5());
            ps.setString(11, obj.getRuta6());
            ps.setString(12, obj.getRuta7());
            ps.setString(13, obj.getRuta8());
            
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
    public boolean actualizar(Servicio obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Servicios \n" +
        "set nombreServicio = ?, duracionServicio = ?, costoServicio = ?, descuentoServicio = ?, tipoServicio = ?, ruta1 = ?, ruta2 = ?, ruta3 = ?, ruta4 = ?, ruta5 = ?, ruta6 = ?, ruta7 = ?, ruta8 = ? \n" +
        "where idServicio = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setString(1, obj.getNombreServicio());
            ps.setString(2, obj.getDuracionServicio());
            ps.setDouble(3, obj.getCostoServicio());
            ps.setInt(4, obj.getDescuentoServicio());
            ps.setString(5, obj.getTipoServicio());
            ps.setString(6, obj.getRuta1());
            ps.setString(7, obj.getRuta2());
            ps.setString(8, obj.getRuta3());
            ps.setString(9, obj.getRuta4());
            ps.setString(10, obj.getRuta5());
            ps.setString(11, obj.getRuta6());
            ps.setString(12, obj.getRuta7());
            ps.setString(13, obj.getRuta8());
            ps.setInt(14, obj.getIdServicio());
            
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
    public boolean borrar(String texto) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "delete from Servicios where nombreServicio = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, texto);
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
            sql = "select idServicio from Servicios where nombreServicio = ?;";
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

    @Override
    public List<String[]> imagen(String texto) 
    {
        List<String[]> rutas = new ArrayList();
        String sql;
        try
        {
            sql = "select ruta1, ruta2, ruta3, ruta4, ruta5, ruta6, ruta7, ruta8 from Servicios where nombreServicio = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, texto);
            rs = ps.executeQuery();
            while(rs.next())
            {
                String imagen[] = new String[8];
                imagen[0] = rs.getString(1);
                imagen[1] = rs.getString(2);
                imagen[2] = rs.getString(3);
                imagen[3] = rs.getString(4);
                imagen[4] = rs.getString(5);
                imagen[5] = rs.getString(6);
                imagen[6] = rs.getString(7);
                imagen[7] = rs.getString(8);
                rutas.add(imagen);
            }
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
        return rutas;
    }
    
    public int id(String texto)
    {
        int id = 0;
        String sql;
        try
        {
            sql = "select idServicio from Servicios where nombreServicio = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, texto);
            rs = ps.executeQuery();
            if(rs.next())
                id = rs.getInt(1);
            ps.close();
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
}