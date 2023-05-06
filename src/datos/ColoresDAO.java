package datos;

import database.Conexion;
import datos.interfaces.CrudServiciosEsp;
import entidades.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ColoresDAO implements CrudServiciosEsp<Color>
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ColoresDAO() {
        CON = Conexion.getInstancia();
    }
    
    @Override
    public List<Color> listar(String texto) 
    {
        List<Color> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select * from Color;";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Color(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
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
    public boolean insertar(Color obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "insert into Color(nombreSclervicio, duracionSclervicio, costoSclervicio) \n" + 
                    "values(?, ?, ?);";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, obj.getNombreSclervicio());
            ps.setString(2, obj.getDuracionSclervicio());
            ps.setDouble(3, obj.getCostoSclervicio());
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
    public boolean actualizar(Color obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Color \n" +
                "set nombreSclervicio = ?, duracionSclervicio = ?, costoSclervicio = ? \n" +
                "where idColor = ?; ";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, obj.getNombreSclervicio());
            ps.setString(2, obj.getDuracionSclervicio());
            ps.setDouble(3, obj.getCostoSclervicio());
            
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
            sql = "delete from Color where idColor = ?;";
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
}