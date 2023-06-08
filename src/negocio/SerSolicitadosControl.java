package negocio;

import datos.SerSolicitadosDAO;
import entidades.SerSolicitado;
import java.util.ArrayList;
import java.util.List;

public class SerSolicitadosControl 
{
    private final SerSolicitadosDAO DATOS;
    private SerSolicitado obj;
    
    public SerSolicitadosControl()
    {
        DATOS = new SerSolicitadosDAO();
        obj = new SerSolicitado();
    }
    
    public List<SerSolicitado> ListarNombser(int idCita)
    {
        List<SerSolicitado> lista = new ArrayList();
        lista.addAll(DATOS.listar(idCita));
        List<SerSolicitado> servicios = new ArrayList();
        
        for(SerSolicitado item:lista)
        {
            servicios.add(new SerSolicitado(item.getNombreServicio(), item.getImagenServicio()));
        }
        return servicios;
    }
}
