package datos.interfaces;

import java.util.List;

public interface CrudCitas <T>
{
    public List<T> listar(int id);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean borrar(String estado, int id);
    public boolean existe(String fecha, int idCliente, String hora);
    public List<T> datos(int idCliente, String fecha);
    public List<T> datosemp(int idEmpleada, String fecha);
}