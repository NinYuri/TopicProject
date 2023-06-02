package datos;

import database.Conexion;
import datos.interfaces.CrudPagos;
import entidades.Pago;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PagosDAO implements CrudPagos<Pago>
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public PagosDAO()
    {
        CON = Conexion.getInstancia();
    }

    @Override
    public List<Pago> listar(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
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

    @Override
    public boolean borrar(Pago obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
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

    @Override
    public boolean actualizar(Pago obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
