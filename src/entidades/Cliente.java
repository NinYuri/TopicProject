package entidades;

public class Cliente 
{
    private int idCliente;
    private String nombreCliente;
    private String passwordCliente;
    private String telefonoCliente;
    private String generoCliente;
    private int edadCliente;

    public Cliente(int idCliente, String nombreCliente, String passwordCliente, String telefonoCliente, String generoCliente, int edadCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.passwordCliente = passwordCliente;
        this.telefonoCliente = telefonoCliente;
        this.generoCliente = generoCliente;
        this.edadCliente = edadCliente;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPasswordCliente() {
        return passwordCliente;
    }

    public void setPasswordCliente(String passwordCliente) {
        this.passwordCliente = passwordCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", passwordCliente=" + passwordCliente + ", telefonoCliente=" + telefonoCliente + ", generoCliente=" + generoCliente + ", edadCliente=" + edadCliente + '}';
    }
}