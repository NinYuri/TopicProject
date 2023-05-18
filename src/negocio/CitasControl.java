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
    
    public DefaultTableModel Listar(int id)
    {
        List<Cita> lista = new ArrayList();
        lista.addAll(DATOS.listar(id));
        String[] titulos = {"ID", "Cliente", "Empleada", "Fecha", "Hora", "Cantidad", "Detalles"};
        String[] registro = new String[7];
        modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Cita item:lista)
        {
            registro[0] = String.valueOf(item.getIdCita());
            registro[1] = String.valueOf(item.getIdCliente());
            registro[2] = String.valueOf(item.getIdEmpleada());
            registro[3] = item.getFechaCita();
            registro[4] = item.getHoraCita();
            registro[5] = String.valueOf(item.getCantidadServicios());
            registro[6] = item.getObservacionesCita();
            modeloTabla.addRow(registro);
        }
        return modeloTabla;
    }
    
}