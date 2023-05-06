package negocio;

import datos.UsuariosDAO;
import entidades.Usuario;


public class UsuariosControl 
{
    private final UsuariosDAO DATOS; // Tiene comunicación con la capa de datos
    private Usuario obj;
    
    public UsuariosControl()
    {
        DATOS = new UsuariosDAO();
        obj = new Usuario();
    }
    
    public boolean Existe(String usuario)
    {
        if(DATOS.existe(usuario))
            return true;
        else
            return false;
    }
    
    public String Insertar(String usuario, String password)
    {
        // Verificar que la categoria a insertar no exista
        if(DATOS.existe(usuario))
            return "El usuario " + usuario + " ya existe";
        else
        {
            // Llenamos el objeto
            obj.setNombreUsuario(usuario);
            obj.setPasswordUsuario(password);

            // Insertar en la BD
            if(DATOS.insertar(obj))
                return "OK";
            else
                return "Error en la inserción del registro";
        }
    }
    
    public boolean Comparar(String usuario, String password)
    {
        if(DATOS.existe(usuario))
            if(DATOS.comparar(usuario,password))
                return true;
            else
                return false;
        else
            return false;
    }
    
}