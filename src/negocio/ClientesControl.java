package negocio;

import datos.ClientesDAO;
import entidades.Cliente;

public class ClientesControl 
{
    private final ClientesDAO DATOS;
    private Cliente obj;
    
    public ClientesControl()
    {
        DATOS = new ClientesDAO();
        obj = new Cliente();
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
                return "Error en la inserción del registro";
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
}