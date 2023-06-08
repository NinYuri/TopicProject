package datos;

import database.Conexion;
import datos.interfaces.CrudClientes;
import entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDAO implements CrudClientes<Cliente>
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public ClientesDAO()
    {
        CON = Conexion.getInstancia();
    }
    
    @Override
    public List<Cliente> datos(String texto)
    {
        List<Cliente> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select * from Clientes where nombreCliente = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, texto);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
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
    public boolean insertar(Cliente obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "insert into Clientes(nombreCliente, passwordCliente, telefonoCliente, generoCliente, edadCliente)\n" +
                "values(?, ?, ?, ?, ?);";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setString(1, obj.getNombreCliente());
            ps.setString(2, obj.getPasswordCliente());
            ps.setString(3, obj.getTelefonoCliente());
            ps.setString(4, obj.getGeneroCliente());
            ps.setInt(5, obj.getEdadCliente());
            
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
            sql = "select idCliente from Clientes where nombreCliente = ?;";
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
            sql = "select nombreCliente from Clientes where passwordCliente = ?;";
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
    public boolean actualizar(Cliente obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Clientes \n" +
        "set nombreCliente = ?, passwordCliente = ?, telefonoCliente = ?, generoCliente = ?, edadCliente = ? \n" +
        "where nombreCliente = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setString(1, obj.getNombreCliente());
            ps.setString(2, obj.getPasswordCliente());
            ps.setString(3, obj.getTelefonoCliente());
            ps.setString(4, obj.getGeneroCliente());
            ps.setInt(5, obj.getEdadCliente());
            ps.setString(6, obj.getNombreCliente());
            
            if(ps.executeUpdate() > 0)
                resp  = true;
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
            sql = "delete from Clientes where nombreCliente = ?;";
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
    
    public int id(String texto)
    {
        int id = 0;
        String sql;
        try
        {
            sql = "select idCliente from Clientes where nombreCliente = ?;";
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
    
    public boolean borrarCitas(int idCliente)
    {
        resp = false;
        String sql;
        try
        {
            sql = "delete from Citas where idCliente = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idCliente);
            //rs = ps.executeQuery();
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
            rs = null;
            CON.desconectar();
        }
        return resp;
    }
    
    public boolean tenerCitasActivas(int idCliente, String estado)
    {
        resp = false;
        String sql;
        try
        {
            sql = "select * from Citas where idCliente = ? and estadoCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.setString(2, estado);
            rs = ps.executeQuery();
            if(rs.next())
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
            rs = null;
            CON.desconectar();
        }
        return resp;
    }
    
    public boolean tenerCitas(int idCliente)
    {
        resp = false;
        String sql;
        try
        {
            sql = "select * from Citas where idCliente = ?";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idCliente);
            rs = ps.executeQuery();
            if(rs.next())
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
            rs = null;
            CON.desconectar();
        }
        return resp;
    }
}