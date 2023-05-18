package datos.interfaces;

import java.util.List;

public interface CrudEmpleados <T>
{
    public List<T> datos(String texto);
    public boolean insertar(T obj);
    public boolean existe(String texto);
    public boolean comparar(String usu, String pass);
    public boolean actualizarD(T obj);
    public boolean actualizarE(T obj);
    public boolean despedir(String texto);
}