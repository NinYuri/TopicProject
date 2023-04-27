package negocio;

import datos.UsuariosDAO;
import entidades.Usuarios;


public class UsuariosControl 
{
    private final UsuariosDAO DATOS; // Tiene comunicación con la capa de datos
    private Usuarios obj;
    
    public UsuariosControl()
    {
        DATOS = new UsuariosDAO();
        obj = new Usuarios();
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
    
    public String Contrasena(String usuario)
    {
        if(DATOS.existe(usuario))
            return DATOS.contrasena(usuario);
        else
            return "Null";
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