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
    
    public DefaultTableModel Listar(String texto)
    {
        List<Servicio> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        String[] titulos = {"ID", "Descripción", "Duración", "Costo", "Descuento", "Tipo"};
        String[] registro = new String[6];
        modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Servicio item:lista)
        {
            registro[0] = String.valueOf(item.getIdServicio());
            registro[1] = item.getNombreServicio();
            registro[2] = item.getDuracionServicio();
            registro[3] = "$" + String.valueOf(item.getCostoServicio());
            registro[4] = String.valueOf(item.getDescuentoServicio()) + "%";
            registro[5] = String.valueOf(item.getTipoServicio());
            modeloTabla.addRow(registro);
        }
        return modeloTabla;
    }
    
    public DefaultTableModel ListarServicios(String texto)
    {
        List<Servicio> lista = new ArrayList();
        lista.addAll(DATOS.listarServicio(texto));
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
    
    public String Insertar(String nombre, String duracion, double costo, int descuento, String tipo, String ruta1, String ruta2, String ruta3, String ruta4, String ruta5, String ruta6, String ruta7, String ruta8)
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
            obj.setRuta1(ruta1);
            obj.setRuta2(ruta2);
            obj.setRuta3(ruta3);
            obj.setRuta4(ruta4);
            obj.setRuta5(ruta5);
            obj.setRuta6(ruta6);
            obj.setRuta7(ruta7);
            obj.setRuta8(ruta8);
            
            if(DATOS.insertar(obj))
                return "OK";
            else
                return "Error en la inserción del servicio";
        }
    }
    
    public List<String[]> Imagen(int id, String nombre)
    {
        if(DATOS.existe(nombre))
            return DATOS.imagenes(id);
        else
           return null;
    }
    
    public String Borrar(String nombre)
    {
        if(DATOS.borrar(nombre))
            return "OK";
        else
         return "No se puede desactivar el registro";
    }
    
    public String Actualizar(int id, String nombre, String nombreAnt, String duracion, double costo, int descuento, String tipo, String ruta1, String ruta2, String ruta3, String ruta4, String ruta5, String ruta6, String ruta7, String ruta8)
    {
        if(nombre.equals(nombreAnt))
        {
            obj.setIdServicio(id);
            obj.setNombreServicio(nombre);
            obj.setDuracionServicio(duracion);
            obj.setCostoServicio(costo);
            obj.setDescuentoServicio(descuento);
            obj.setTipoServicio(tipo);
            obj.setRuta1(ruta1);
            obj.setRuta2(ruta2);
            obj.setRuta3(ruta3);
            obj.setRuta4(ruta4);
            obj.setRuta5(ruta5);
            obj.setRuta6(ruta6);
            obj.setRuta7(ruta7);
            obj.setRuta8(ruta8);
            
            if(DATOS.actualizar(obj))
                return "OK";
            else
                return "Error en la actualización";
        }
        else
        {
            if(DATOS.existe(nombre))
                return "Ya existe el servicio.";
            else
            {
                obj.setIdServicio(id);
                obj.setNombreServicio(nombre);
                obj.setDuracionServicio(duracion);
                obj.setCostoServicio(costo);
                obj.setDescuentoServicio(descuento);
                obj.setTipoServicio(tipo);
                obj.setRuta1(ruta1);
                obj.setRuta2(ruta2);
                obj.setRuta3(ruta3);
                obj.setRuta4(ruta4);
                obj.setRuta5(ruta5);
                obj.setRuta6(ruta6);
                obj.setRuta7(ruta7);
                obj.setRuta8(ruta8);
                
                if(DATOS.actualizar(obj))
                    return "OK";
                else
                    return "Error en la actualización";
            }
        }
    }
    
    public int GetId(String nombre)
    {
        if(DATOS.existe(nombre))
            return DATOS.id(nombre);
        else
            return 0;
    }
    
    public double GetCosto(int id, String nombre)
    {
        if(DATOS.existe(nombre))
            return DATOS.costo(id);
        else
            return 0;
    }
    
    public double GetDescuento(int id, String nombre)
    {
        if(DATOS.existe(nombre))
            return DATOS.descuento(id);
        else
            return 0;
    }
}