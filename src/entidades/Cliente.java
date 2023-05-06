package entidades;

public class Cliente 
{
    private int idCliente;
    private int idUsuario;
    private String nombreCliente;
    private String telefonoCliente;
    private char generoCliente;
    private int edadCliente;
    private String preferenciaCliente;

    public Cliente(int idCliente, int idUsuario, String nombreCliente, String telefonoCliente, char generoCliente, int edadCliente, String preferenciaCliente) {
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.generoCliente = generoCliente;
        this.edadCliente = edadCliente;
        this.preferenciaCliente = preferenciaCliente;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public char getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(char generoCliente) {
        this.generoCliente = generoCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getPreferenciaCliente() {
        return preferenciaCliente;
    }

    public void setPreferenciaCliente(String preferenciaCliente) {
        this.preferenciaCliente = preferenciaCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", idUsuario=" + idUsuario + ", nombreCliente=" + nombreCliente + ", telefonoCliente=" + telefonoCliente + ", generoCliente=" + generoCliente + ", edadCliente=" + edadCliente + ", preferenciaCliente=" + preferenciaCliente + '}';
    }
}