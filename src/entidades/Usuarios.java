package entidades;

public class Usuarios 
{
    private int idUsuario;
    private String nombreUsuario;
    private String passwordUsuario;

    public Usuarios(int idUsuario, String nombreUsuario, String passwordUsuario) 
    {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public Usuarios() 
    {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", passwordUsuario=" + passwordUsuario + '}';
    }
}