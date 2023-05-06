package datos.interfaces;

import java.util.List;

public interface CrudServiciosEsp <T>
{
    public List<T> listar(String texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean borrar(int id);
}
