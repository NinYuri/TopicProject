package datos;

import database.Conexion;
import datos.interfaces.CrudCitas;
import entidades.SerSolicitado;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SerSolicitadosDAO 
{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public SerSolicitadosDAO()
    {
        CON = Conexion.getInstancia();
    }
    
    public boolean insertar(SerSolicitado obj)
    {
        String sql;
        resp = false;
        try
        {
            sql = "insert into ServiciosSol(idCita, idServicio)\n" +
                "values(?,?);";
            ps = CON.Conectar().prepareStatement(sql);
            
            ps.setInt(1, obj.getIdCita());
            ps.setInt(2, obj.getIdServicio());
            
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
