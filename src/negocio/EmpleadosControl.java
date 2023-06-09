package negocio;

import datos.EmpleadosDAO;
import entidades.Empleada;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EmpleadosControl 
{
    private final EmpleadosDAO DATOS;
    private Empleada obj;
    private DefaultTableModel modeloTabla;
    
    public EmpleadosControl()
    {
        DATOS = new EmpleadosDAO();
        obj = new Empleada();
    }
    
    public DefaultTableModel Listar(String texto)
    {
        List<Empleada> lista = new ArrayList();
        lista.addAll(DATOS.listaremp(texto));
        String[] titulos = {"ID", "Nombre", "Dirección", "Teléfono", "Horario", "Sueldo"};
        String[] registro = new String[6];
        modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Empleada item:lista)
        {
            registro[0] = String.valueOf(item.getIdEmpleada());
            registro[1] = item.getNombreEmpleada();
            registro[2] = item.getDireccionEmpleada();
            registro[3] = item.getTelefonoEmpleada();
            registro[4] = item.getHorarioEmpleada();
            registro[5] = "$" + String.valueOf(item.getSueldoEmpleada());
            modeloTabla.addRow(registro);
        }
        return modeloTabla;
    }
    
    public String[] Datos(String texto)
    {
        List<Empleada> lista = new ArrayList();
        lista.addAll(DATOS.datos(texto));
        String[] registro = new String[8];
        
        for(Empleada item:lista)
        {
            registro[0] = String.valueOf(item.getIdEmpleada());
            registro[1] = item.getNombreEmpleada();
            registro[2] = item.getPasswordEmpleada();
            registro[3] = item.getDireccionEmpleada();
            registro[4] = item.getTelefonoEmpleada();
        }
        return registro;
    }
    
    public boolean Existe(String empleada)
    {
        if(DATOS.existe(empleada))
            return true;
        else
            return false;
    }
    
    public boolean Comparar(String empleada, String password)
    {
        if(DATOS.existe(empleada))
            if(DATOS.comparar(empleada, password))
                return true;
            else
                return false;
        else
            return false;
    }
    
    public String Insertar(String empleada, String password, String direccion, String telefono, String horario, double sueldo, String imagen)
    {
        if(DATOS.existe(empleada))
            return "El empleado(a) " + empleada + " ya existe";
        else
        {
            obj.setNombreEmpleada(empleada);
            obj.setPasswordEmpleada(password);
            obj.setDireccionEmpleada(direccion);
            obj.setTelefonoEmpleada(telefono);
            obj.setHorarioEmpleada(horario);
            obj.setSueldoEmpleada(sueldo);
            obj.setImagenEmpleada(imagen);
            
            if(DATOS.insertar(obj))
                return "OK";
            else
                return "Error en la inserción del empleado";
        }
    }
    
    public String ActualizarD(String nombre, String nombreAnt, String horario, double sueldo, String imagen)
    {
        if(nombre.equals(nombreAnt))
        {
            obj.setNombreEmpleada(nombre);
            obj.setHorarioEmpleada(horario);
            obj.setSueldoEmpleada(sueldo);
            obj.setImagenEmpleada(imagen);
            
            if(DATOS.actualizarD(obj))
                return "OK";
            else
                return "Error en la actualización";
        }
        else
        {
            if(DATOS.existe(nombre))
                return "El empleado(a) ya existe";
            else
            {
                obj.setNombreEmpleada(nombre);
                obj.setHorarioEmpleada(horario);
                obj.setSueldoEmpleada(sueldo);
                obj.setImagenEmpleada(imagen);
                
                if(DATOS.actualizarD(obj))
                    return "OK";
                else
                    return "Error en la actualización";
            }
        }
    }
    
    public String ActualizarE(String nombre, String nombreAnt, String password, String direccion, String telefono)
    {
        if(nombre.equals(nombreAnt))
        {
            obj.setNombreEmpleada(nombre);
            obj.setPasswordEmpleada(password);
            obj.setDireccionEmpleada(direccion);
            obj.setTelefonoEmpleada(telefono);
            
            if(DATOS.actualizarE(obj))
                return "OK";
            else
                return "Error en la actualización";
        }
        else
        {
            if(DATOS.existe(nombre))
                return "El empleado(a) ya existe";
            else
            {
                obj.setNombreEmpleada(nombre);
                obj.setPasswordEmpleada(password);
                obj.setDireccionEmpleada(direccion);
                obj.setTelefonoEmpleada(telefono);
                
                if(DATOS.actualizarE(obj))
                    return "OK";
                else
                    return "Error en la actualización";
            }
        }
    }
    
    public String Despedir(String nombre)
    {
        if(DATOS.despedir(nombre))
            return "OK";
        else
            return "No se puede borrar el empleado registrado";
    }
    
    public String Imagen(String nombre)
    {
        if(DATOS.existe(nombre))
            return DATOS.imagen(nombre);
        else
            return null;
    }
    
    public int GetId(String nombre)
    {
        if(DATOS.existe(nombre))
            return DATOS.id(nombre);
        else
            return 0;
    }
    
    public boolean TenerCitas(int idEmpleada, String nombre, String estado)
    {
        if(DATOS.existe(nombre))
            if(DATOS.tenerCitasActivas(idEmpleada, estado))
                return true;
            else
                return false;
        else
            return false;
    }
    
    public String Borrar(String nombre)
    {
        if(DATOS.existe(nombre))
            if(DATOS.despedir(nombre))
                return "OK";
            else
                return "Hubo un error en el despido";
        else
            return "El empleado no existe";
    }
}