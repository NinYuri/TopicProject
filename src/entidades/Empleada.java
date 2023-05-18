package entidades;

public class Empleada 
{
    private int idEmpleada;
    private String nombreEmpleada;
    private String passwordEmpleada;
    private String direccionEmpleada;
    private String telefonoEmpleada;
    private String horarioEmpleada;
    private double sueldoEmpleada;
    private String imagenEmpleada;

    public Empleada(int idEmpleada, String nombreEmpleada, String passwordEmpleada, String direccionEmpleada, String telefonoEmpleada, String horarioEmpleada, double sueldoEmpleada, String imagenEmpleada) {
        this.idEmpleada = idEmpleada;
        this.nombreEmpleada = nombreEmpleada;
        this.passwordEmpleada = passwordEmpleada;
        this.direccionEmpleada = direccionEmpleada;
        this.telefonoEmpleada = telefonoEmpleada;
        this.horarioEmpleada = horarioEmpleada;
        this.sueldoEmpleada = sueldoEmpleada;
        this.imagenEmpleada = imagenEmpleada;
    }

    public Empleada(int idEmpleada, String nombreEmpleada, String passwordEmpleada, String direccionEmpleada, String telefonoEmpleada) {
        this.idEmpleada = idEmpleada;
        this.nombreEmpleada = nombreEmpleada;
        this.passwordEmpleada = passwordEmpleada;
        this.direccionEmpleada = direccionEmpleada;
        this.telefonoEmpleada = telefonoEmpleada;
    }
    
    public Empleada() {
    }

    public int getIdEmpleada() {
        return idEmpleada;
    }

    public void setIdEmpleada(int idEmpleada) {
        this.idEmpleada = idEmpleada;
    }

    public String getNombreEmpleada() {
        return nombreEmpleada;
    }

    public void setNombreEmpleada(String nombreEmpleada) {
        this.nombreEmpleada = nombreEmpleada;
    }

    public String getPasswordEmpleada() {
        return passwordEmpleada;
    }

    public void setPasswordEmpleada(String passwordEmpleada) {
        this.passwordEmpleada = passwordEmpleada;
    }

    public String getDireccionEmpleada() {
        return direccionEmpleada;
    }

    public void setDireccionEmpleada(String direccionEmpleada) {
        this.direccionEmpleada = direccionEmpleada;
    }

    public String getTelefonoEmpleada() {
        return telefonoEmpleada;
    }

    public void setTelefonoEmpleada(String telefonoEmpleada) {
        this.telefonoEmpleada = telefonoEmpleada;
    }

    public String getHorarioEmpleada() {
        return horarioEmpleada;
    }

    public void setHorarioEmpleada(String horarioEmpleada) {
        this.horarioEmpleada = horarioEmpleada;
    }

    public double getSueldoEmpleada() {
        return sueldoEmpleada;
    }

    public void setSueldoEmpleada(double sueldoEmpleada) {
        this.sueldoEmpleada = sueldoEmpleada;
    }

    public String getImagenEmpleada() {
        return imagenEmpleada;
    }

    public void setImagenEmpleada(String imagenEmpleada) {
        this.imagenEmpleada = imagenEmpleada;
    }

    @Override
    public String toString() {
        return "Empleada{" + "idEmpleada=" + idEmpleada + ", nombreEmpleada=" + nombreEmpleada + ", passwordEmpleada=" + passwordEmpleada + ", direccionEmpleada=" + direccionEmpleada + ", telefonoEmpleada=" + telefonoEmpleada + ", horarioEmpleada=" + horarioEmpleada + ", sueldoEmpleada=" + sueldoEmpleada + ", imagenEmpleada=" + imagenEmpleada + '}';
    }
}