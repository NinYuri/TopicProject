package negocio;

import datos.CitasDAO;
import entidades.Cita;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CitasControl 
{
    private final CitasDAO DATOS;
    private Cita obj;
    private DefaultTableModel modeloTabla;
    
    public CitasControl()
    {
        DATOS = new CitasDAO();
        obj = new Cita();
    }
    
    public String[] Datos(int idCliente, String fecha)
    {
        List<Cita> lista = new ArrayList();
        lista.addAll(DATOS.datos(idCliente, fecha));
        String[] registro = new String[5];
        
        for(Cita item:lista)
        {
            registro[0] = String.valueOf(item.getIdCita());
            registro[1] = item.getHoraCita();
            registro[2] = item.getDuracionCita();
            registro[3] = item.getObservacionesCita();
        }
        return registro;
    }
    
    public DefaultTableModel Listar(int id)
    {
        List<Cita> lista = new ArrayList();
        lista.addAll(DATOS.listar(id));
        String[] titulos = {"ID", "Cliente", "Empleada", "Fecha", "Hora", "Duración", "Costo", "Detalles"};
        String[] registro = new String[8];
        modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Cita item:lista)
        {
            registro[0] = String.valueOf(item.getIdCita());
            registro[1] = String.valueOf(item.getIdCliente());
            registro[2] = String.valueOf(item.getIdEmpleada());
            registro[3] = item.getFechaCita();
            registro[4] = item.getHoraCita();
            registro[5] = item.getDuracionCita();
            registro[6] = String.valueOf(item.getCostoCita());
            registro[7] = item.getObservacionesCita();
            modeloTabla.addRow(registro);
        }
        return modeloTabla;
    }
    
    public String Insertar(int idCliente, int idEmpleada, String fechaCita, String horaCita, String duracionCita, double costoCita, String observacionesCita)
    {
        obj.setIdCliente(idCliente);
        obj.setIdEmpleada(idEmpleada);
        obj.setFechaCita(fechaCita);
        obj.setHoraCita(horaCita);
        obj.setDuracionCita(duracionCita);
        obj.setCostoCita(costoCita);
        obj.setObservacionesCita(observacionesCita);
        
        if(DATOS.insertar(obj))
            return "OK";
        else
            return "Error en la agenda de la cita";
    }
    
    public String Actualizar(int id, String fecha, String hora, String observaciones)
    {
        obj.setIdCita(id);
        obj.setFechaCita(fecha);
        obj.setHoraCita(hora);
        obj.setObservacionesCita(observaciones);
        
        if(DATOS.actualizar(obj))
            return "OK";
        else
            return "Error en la actualización";
    }
    
    public int GetId(String fecha, int idCliente, String hora)
    {
        if(DATOS.existe(fecha, idCliente, hora))
            return DATOS.id(fecha, idCliente, hora);
        else
            return 0;
    }
    
    public boolean Borrar(int id)
    {
        if(DATOS.existeId(id))
        {
            DATOS.borrar(id);
            return true;
        }
        else
            return false;      
    }
}