package datos.interfaces;

import java.util.List;

public interface CrudServicios <T>
{
    public List<T> listar(String texto);
    public List<T> listarServicio(String texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean borrar(String texto);
    public boolean existe(String texto);
    public List<String[]> imagen(String texto);
}