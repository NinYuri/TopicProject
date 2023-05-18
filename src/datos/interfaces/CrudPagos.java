package datos.interfaces;

import java.util.List;

public interface CrudPagos <T>
{
    public List<T> listar(String texto);
    public boolean insertar(T obj);
    public boolean borrar(T obj);
    public boolean existe(int idPago);
}
