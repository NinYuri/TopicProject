package datos.interfaces;

public interface CrudUsuarios <T>
{
    public boolean insertar(T obj);
    public boolean existe(String texto);
    public boolean comparar(String usu, String pass);
}