package datos;

import database.Conexion;
import entidades.Corte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import datos.interfaces.CrudServiciosEsp;

public class CortesDAO implements CrudServiciosEsp<Corte>
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public CortesDAO() {
        CON = Conexion.getInstancia();
    }
    
    @Override
    public List<Corte> listar(String texto) 
    {
        List<Corte> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select * from Cortes;";
            ps = CON.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
                registros.add(new Corte(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
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
    public boolean insertar(Corte obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "insert into Cortes(nombreScervicio, duracionScervicio, costoScervicio) \n" + 
                    "values(?, ?, ?);";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, obj.getNombreScervicio());
            ps.setString(2, obj.getDuracionScervicio());
            ps.setDouble(3, obj.getCostoScervicio());
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
    public boolean actualizar(Corte obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "update Cortes \n" +
                "set nombreScervicio = ?, duracionScervicio = ?, costoScervicio = ? \n" +
                "where idCorte = ?; ";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setString(1, obj.getNombreScervicio());
            ps.setString(2, obj.getDuracionScervicio());
            ps.setDouble(3, obj.getCostoScervicio());
            
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
            sql = "delete from Cortes where idCorte = ?;";
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