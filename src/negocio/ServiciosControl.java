package negocio;

import datos.ServiciosDAO;
import entidades.Servicio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ServiciosControl 
{
    private final ServiciosDAO DATOS;
    private Servicio obj;
    private DefaultTableModel modeloTabla;
    
    public ServiciosControl()
    {
        DATOS = new ServiciosDAO();
        obj = new Servicio();
    }
    
    public DefaultTableModel ListarCortes(String texto)
    {
        List<Servicio> lista = new ArrayList();
        lista.addAll(DATOS.listarCortes(texto));
        String[] titulos = {"Descripción", "Duración", "Costo", "Descuento"};
        String[] registro = new String[4];
        modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Servicio item:lista)
        {
            registro[0] = item.getNombreServicio();
            registro[1] = item.getDuracionServicio();
            registro[2] = "$" + String.valueOf(item.getCostoServicio());
            registro[3] = String.valueOf(item.getDescuentoServicio()) + "%";
            modeloTabla.addRow(registro);
        }
        return modeloTabla;
    }
    
    public String Insertar(String nombre, String duracion, double costo, int descuento, String tipo)
    {
        if(DATOS.existe(nombre))
            return "El servicio " + nombre + " ya existe";
        else
        {
            obj.setNombreServicio(nombre);
            obj.setDuracionServicio(duracion);
            obj.setCostoServicio(costo);
            obj.setDescuentoServicio(descuento);
            obj.setTipoServicio(tipo);
            
            if(DATOS.insertar(obj))
                return "OK";
            else
                return "Error en la inserción del servicio";
        }
    }
    
}