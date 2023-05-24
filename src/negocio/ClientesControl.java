package negocio;

import datos.ClientesDAO;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClientesControl 
{
    private final ClientesDAO DATOS;
    private Cliente obj;
    
    public ClientesControl()
    {
        DATOS = new ClientesDAO();
        obj = new Cliente();
    }
    
    public String[] Datos(String texto)
    {
        List<Cliente> lista = new ArrayList();
        lista.addAll(DATOS.datos(texto));
        String[] registro = new String[6];
        
        for(Cliente item:lista)
        {
            registro[0] = String.valueOf(item.getIdCliente());
            registro[1] = item.getNombreCliente();
            registro[2] = item.getPasswordCliente();
            registro[3] = item.getTelefonoCliente();
            registro[4] = item.getGeneroCliente();
            registro[5] = String.valueOf(item.getEdadCliente());
        }
        return registro;
    }
    
    public boolean Existe(String cliente)
    {
        if(DATOS.existe(cliente))
            return true;
        else
            return false;
    }
    
    public String Insertar(String cliente, String password, String telefono, String genero, int edad)
    {
        if(DATOS.existe(cliente))
            return "El cliente " + cliente + " ya existe";
        else
        {
            obj.setNombreCliente(cliente);
            obj.setPasswordCliente(password);
            obj.setTelefonoCliente(telefono);
            obj.setGeneroCliente(genero);
            obj.setEdadCliente(edad);
            
            if(DATOS.insertar(obj))
                return "OK";
            else
                return "Error en la inserción del cliente";
        }
    }
    
    public boolean Comparar(String cliente, String password)
    {
        if(DATOS.existe(cliente))
            if(DATOS.comparar(cliente, password))
                return true;
            else
                return false;
        else
            return false;
    }
    
    public String Actualizar(String nombre, String nombreAnt, String password, String telefono, String genero, int edad)
    {
        if(nombre.equals(nombreAnt))
        {
            //obj.setIdCliente(id);
            obj.setNombreCliente(nombre);
            obj.setPasswordCliente(password);
            obj.setTelefonoCliente(telefono);
            obj.setGeneroCliente(genero);
            obj.setEdadCliente(edad);
            
            if(DATOS.actualizar(obj))
                return "OK";
            else
                return "Error en la actualización";
        }
        else
        {
            if(DATOS.existe(nombre))
                return "El cliente ya existe";
            else
            {
                //obj.setIdCliente(id);
                obj.setNombreCliente(nombre);
                obj.setPasswordCliente(password);
                obj.setTelefonoCliente(telefono);
                obj.setGeneroCliente(genero);
                obj.setEdadCliente(edad);
                
                if(DATOS.actualizar(obj))
                    return "OK";
                else
                    return "Error en la actualización";
            }
        }
    }
    
    public String Borrar(String nombre)
    {
        if(DATOS.borrar(nombre))
            return "OK";
        else
            return "No se puede borrar el cliente registrado";
    }
    
    public int GetId(String nombre)
    {
        if(DATOS.existe(nombre))
            return DATOS.id(nombre);
        else
            return 0;
    }
}