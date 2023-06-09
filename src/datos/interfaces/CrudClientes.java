package datos.interfaces;

import java.util.List;

public interface CrudClientes <T>
{
    public List<T> datos(String texto);
    public boolean insertar(T obj);
    public boolean existe(String texto);
    public boolean comparar(String usu, String pass);
    public boolean actualizar(T obj);
    public boolean borrar(String texto);
}