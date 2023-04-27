package datos;

import database.Conexion;
import datos.interfaces.CrudUsuarios;
import entidades.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDAO implements CrudUsuarios<Usuarios>
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public UsuariosDAO()
    {
        CON = Conexion.getInstancia();
    }
    
    @Override
    public boolean insertar(Usuarios obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "insert into Usuarios(nombreUsuario, passwordUsuario)\n" +
                    "values(?, ?);";
            ps = CON.Conectar().prepareStatement(sql);
            //Pasar los valores a la consulta sql
            ps.setString(1, obj.getNombreUsuario());
            ps.setString(2, obj.getPasswordUsuario());
            //Verificar si se insertó el registro
            if(ps.executeUpdate() > 0)
                resp = true;
            ps.close(); // Se manejan como archivos
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
            sql = "select idUsuario from Usuarios where nombreUsuario = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            // Pasar los valores a la consulta sql
            ps.setString(1, texto);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            // El puntero se mueve de regitro en registro, por lo tanto:
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
    public String contrasena(String texto) 
    {
        String contrasena = "";
        String sql;
        try
        {
            sql = "select passwordUsuario from Usuarios where nombreUsuario = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            // Pasar los valores a la consulta sql
            ps.setString(1, texto);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            // El puntero se mueve de regitro en registro, por lo tanto:
            if(rs.next())
                contrasena = rs.getString(1);
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
        return contrasena;
    }

    @Override
    public boolean comparar(String usu, String pass) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "select nombreUsuario from Usuarios where passwordUsuario = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            // Pasar los valores a la consulta sql
            ps.setString(1, pass);
            // Ejecuta la consulta
            rs = ps.executeQuery();
            // El puntero se mueve de regitro en registro, por lo tanto:
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