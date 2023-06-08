package negocio;

import datos.CitasDAO;
import datos.ClientesDAO;
import entidades.Cita;
import entidades.SerSolicitado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CitasControl 
{
    private final CitasDAO DATOS;
    private final ClientesDAO DATOSC;
    private Cita obj;
    private DefaultTableModel modeloTabla;
    
    public CitasControl()
    {
        DATOS = new CitasDAO();
        DATOSC = new ClientesDAO();
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
    
    public String[] DatosEmpleada(int idEmpleada, String fecha)
    {
        List<Cita> lista = new ArrayList();
        lista.addAll(DATOS.datosemp(idEmpleada, fecha));
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
    
    public DefaultTableModel Listar(int idEmpleada, String estado)
    {
        List<Cita> lista = new ArrayList();
        lista.addAll(DATOS.listar(idEmpleada, estado));
        String[] titulos = {"ID", "Cliente", "Empleada", "Fecha", "Hora", "Duración", "Costo", "Notas"};
        String[] registro = new String[8];
        modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Cita item:lista)
        {
            registro[0] = String.valueOf(item.getIdCita());
            registro[1] = DATOSC.nombre(item.getIdCliente());
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
    
    public String Insertar(int idCliente, int idEmpleada, String fechaCita, String horaCita, String duracionCita, double costoCita, String observacionesCita, String estadoCita, List<SerSolicitado> detalles)
    {
        if(DATOS.fechaOcupada(fechaCita) == false)
        {
            obj.setIdCliente(idCliente);
            obj.setIdEmpleada(idEmpleada);
            obj.setFechaCita(fechaCita);
            obj.setHoraCita(horaCita);
            obj.setDuracionCita(duracionCita);
            obj.setCostoCita(costoCita);
            obj.setObservacionesCita(observacionesCita);
            obj.setEstadoCita(estadoCita);
            obj.setDetalles(detalles);

            if(DATOS.insertar(obj))
                return "OK";
            else
                return "Error en la agenda de la cita";
        }
        else
            return "Fecha Ocupada";
    }
    
    public String Actualizar(int id, String fecha, String fechaAnterior, String hora, String observaciones, String estado)
    {
        if(fecha.equals(fechaAnterior))
        {
            obj.setIdCita(id);
            obj.setFechaCita(fecha);
            obj.setHoraCita(hora);
            obj.setObservacionesCita(observaciones);
            obj.setEstadoCita(estado);
            
            if(DATOS.actualizar(obj))
                return "OK";
            else
                return "Error en la actualización";
        }
        else
            if(DATOS.fechaOcupada(fecha) == false)
            {
                obj.setIdCita(id);
                obj.setFechaCita(fecha);
                obj.setHoraCita(hora);
                obj.setObservacionesCita(observaciones);
                obj.setEstadoCita(estado);

                if(DATOS.actualizar(obj))
                    return "OK";
                else
                    return "Error en la actualización";
            }
            else
               return "Fecha Ocupada";
    }
    
    public int GetId(String fecha, int idCliente, String hora)
    {
        if(DATOS.existe(fecha, idCliente, hora))
            return DATOS.id(fecha, idCliente, hora);
        else
            return 0;
    }
    
    public boolean Borrar(String estado, int id)
    {
        if(DATOS.existeId(id))
        {
            DATOS.borrar(estado, id);
            return true;
        }
        else
            return false;
    }
    
    public double GetCosto(String fecha, int idCliente, String hora)
    {
        if(DATOS.existe(fecha, idCliente, hora))
        {
            int id = DATOS.id(fecha, idCliente, hora);
            return DATOS.costo(id);
        }
        else
            return 0;
    }

    public DefaultTableModel Fechas(int idCliente, String estado)
    {
        List<Cita> lista = new ArrayList();
        lista.addAll(DATOS.fechasCitas(idCliente, estado));
        String[] titulos = {"Fechas de Citas"};
        String[] registro = new String[1];
        modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Cita item:lista)
        {
            registro[0] = String.valueOf(item.getFechaCita());
            modeloTabla.addRow(registro);
        }
        return modeloTabla;
    }
    
    public DefaultTableModel FechasTrabajo(int idEmpleada, String estado)
    {
        List<Cita> lista = new ArrayList();
        lista.addAll(DATOS.fechasTrabajo(idEmpleada, estado));
        String[] titulos = {"Fechas Agendadas"};
        String[] registro = new String[1];
        modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Cita item:lista)
        {
            registro[0] = String.valueOf(item.getFechaCita());
            modeloTabla.addRow(registro);
        }
        return modeloTabla;
    }
}