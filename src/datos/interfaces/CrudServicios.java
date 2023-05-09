package datos.interfaces;

import java.util.List;

public interface CrudServicios <T>
{
    public List<T> listarCortes(String texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean borrar(int id);
    public boolean existe(String texto);
}