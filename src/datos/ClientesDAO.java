package datos;

import database.Conexion;
import datos.interfaces.CrudClientes;
import entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}