package datos.interfaces;

import java.util.List;

public interface CrudCitas <T>
{
    public List<T> listar(int id);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean borrar(int id);
    public boolean existe(String texto);
}