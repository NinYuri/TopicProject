package datos;

import database.Conexion;
import datos.interfaces.CrudEmpleados;
import entidades.Empleada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadosDAO implements CrudEmpleados<Empleada>
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public EmpleadosDAO()
    {
        CON = Conexion.getInstancia();
    }
    
    @Override
    public List<Empleada> datos(String texto) 
    {
        List<Empleada> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select idEmpleada, nombreEmpleada, passwordEmpleada, direccionEmpleada, telefonoEmpleada from Empleadas \n" +
                "where nombreEmpleada = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, texto);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Empleada(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
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
    public boolean insertar(Empleada obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "insert into Empleadas(nombreEmpleada, passwordEmpleada, direccionEmpleada, telefonoEmpleada, horarioEmpleada, sueldoEmpleada, imagenEmpleada)\n" +
                "values(?, ?, ?, ?, ?, ?, ?);";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setString(1, obj.getNombreEmpleada());
            ps.setString(2, obj.getPasswordEmpleada());
            ps.setString(3, obj.getDireccionEmpleada());
            ps.setString(4, obj.getTelefonoEmpleada());
            ps.setString(5, obj.getHorarioEmpleada());
            ps.setDouble(6, obj.getSueldoEmpleada());
            ps.setString(7, obj.getImagenEmpleada());
            
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
            sql = "select idEmpleada from Empleadas where nombreEmpleada = ?;";
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
    public boolean comparar(String usu, String pass) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "select nombreEmpleada from Empleadas where passwordEmpleada = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, pass);
            rs = ps.executeQuery();
            if(rs.next())
                if(rs.getString(1).equals(usu))
                    resp = true;
                else
                    resp = false;
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
    public boolean actualizarD(Empleada obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Empleadas \n" +
        "set horarioEmpleada = ?, sueldoEmpleada = ?, imagenEmpleada = ? \n" +
        "where nombreEmpleada = ?;";
            ps = CON.Conectar().prepareStatement(sql);

            ps.setString(1, obj.getHorarioEmpleada());
            ps.setDouble(2, obj.getSueldoEmpleada());
            ps.setString(3, obj.getImagenEmpleada());
            ps.setString(4, obj.getNombreEmpleada());
            
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
    public boolean actualizarE(Empleada obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Empleadas \n" +
        "set nombreEmpleada = ?, passwordEmpleada = ?, direccionEmpleada = ?, telefonoEmpleada = ? \n" +
        "where nombreEmpleada = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setString(1, obj.getNombreEmpleada());
            ps.setString(2, obj.getPasswordEmpleada());
            ps.setString(3, obj.getDireccionEmpleada());
            ps.setString(4, obj.getTelefonoEmpleada());
            ps.setString(5, obj.getNombreEmpleada());
            
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
    public boolean despedir(String texto) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "delete from Empleadas where nombreEmpleada = ?;";
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
    
    public String imagen(String nombre)
    {
        String imagen = "";
        String sql;
        try
        {
            sql = "select imagenEmpleada from Empleadas where nombreEmpleada = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if(rs.next())
                imagen = rs.getString(1);
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
        return imagen;
    }
    
    public int id(String texto)
    {
        int id = 0;
        String sql;
        try
        {
            sql = "select idEmpleada from Empleadas where nombreEmpleada = ?;";
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