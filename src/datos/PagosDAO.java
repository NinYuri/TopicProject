package datos;

import database.Conexion;
import entidades.Pago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PagosDAO
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public PagosDAO()
    {
        CON = Conexion.getInstancia();
    }

    public boolean insertar(Pago obj) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "insert into Pagos(idCliente, idCita, fechaPago, metodoPago, montoPago, estadoPago) \n" +
                 "values(?, ?, ?, ?, ?, ?)";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setInt(1, obj.getIdCliente());
            ps.setInt(2, obj.getIdCita());
            ps.setString(3, obj.getFechaPago());
            ps.setString(4, obj.getMetodoPago());
            ps.setDouble(5, obj.getMontoPago());
            ps.setString(6, obj.getEstadoPago());
            
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

    public boolean existe(int idCita) 
    {
        String sql;
        resp = false;
        try
        {
            sql = "select idPago from Pagos where idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idCita);
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
