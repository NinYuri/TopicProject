package datos;

import database.Conexion;
import entidades.SerSolicitado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<SerSolicitado> listar(int idCita)
    {
        List<SerSolicitado> registros = new ArrayList();
        String sql;
        try
        {
            sql = "select S.nombreServicio, SS.imagenServicio from ServiciosSol SS inner join Servicios S on S.idServicio = SS.idServicio where SS.idCita = ?;";
            ps = CON.Conectar().prepareStatement(sql);
            ps.setInt(1, idCita);
            rs = ps.executeQuery(); 
            while(rs.next())
                registros.add(new SerSolicitado(rs.getString(1), rs.getString(2)));
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
            rs= null;
            CON.desconectar();
        }
        return registros;
    }
}
