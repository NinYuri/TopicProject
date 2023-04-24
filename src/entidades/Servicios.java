package entidades;

public class Servicios 
{
    private int idEmpleada;
    private String nombreServicio;
    private String descripcionServicio;
    private String comboServicio;
    private String duracionServicio;
    private double costoServicio;
    private double descuentoServicio;
    private String imagenServicios;

    public Servicios(int idEmpleada, String nombreServicio, String descripcionServicio, String comboServicio, String duracionServicio, double costoServicio, double descuentoServicio, String imagenServicios) {
        this.idEmpleada = idEmpleada;
        this.nombreServicio = nombreServicio;
        this.descripcionServicio = descripcionServicio;
        this.comboServicio = comboServicio;
        this.duracionServicio = duracionServicio;
        this.costoServicio = costoServicio;
        this.descuentoServicio = descuentoServicio;
        this.imagenServicios = imagenServicios;
    }

    public Servicios() {
    }

    public int getIdEmpleada() {
        return idEmpleada;
    }

    public void setIdEmpleada(int idEmpleada) {
        this.idEmpleada = idEmpleada;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public String getComboServicio() {
        return comboServicio;
    }

    public void setComboServicio(String comboServicio) {
        this.comboServicio = comboServicio;
    }

    public String getDuracionServicio() {
        return duracionServicio;
    }

    public void setDuracionServicio(String duracionServicio) {
        this.duracionServicio = duracionServicio;
    }

    public double getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }

    public double getDescuentoServicio() {
        return descuentoServicio;
    }

    public void setDescuentoServicio(double descuentoServicio) {
        this.descuentoServicio = descuentoServicio;
    }

    public String getImagenServicios() {
        return imagenServicios;
    }

    public void setImagenServicios(String imagenServicios) {
        this.imagenServicios = imagenServicios;
    }

    @Override
    public String toString() {
        return "Servicios{" + "idEmpleada=" + idEmpleada + ", nombreServicio=" + nombreServicio + ", descripcionServicio=" + descripcionServicio + ", comboServicio=" + comboServicio + ", duracionServicio=" + duracionServicio + ", costoServicio=" + costoServicio + ", descuentoServicio=" + descuentoServicio + ", imagenServicios=" + imagenServicios + '}';
    }   
}