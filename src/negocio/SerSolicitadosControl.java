package negocio;

import datos.SerSolicitadosDAO;
import entidades.SerSolicitado;

public class SerSolicitadosControl 
{
    private final SerSolicitadosDAO DATOS;
    private SerSolicitado obj;
    
    public SerSolicitadosControl()
    {
        DATOS = new SerSolicitadosDAO();
        obj = new SerSolicitado();
    }
    
    public String Insertar(int idCita, int idServicio, double costoServicio)
    {
        obj.setIdCita(idCita);
        obj.setIdServicio(idServicio);
        obj.setCostoServicio(costoServicio);
        
        if(DATOS.insertar(obj))
            return "OK";
        else
            return "Error en la agenda de los servicios de la cita";
    }
    
}
