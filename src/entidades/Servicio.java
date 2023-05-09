package entidades;

public class Servicio 
{
    private int idServicio;
    private String nombreServicio;
    private String duracionServicio;
    private double costoServicio;
    private int descuentoServicio;
    private String tipoServicio;

    public Servicio(int idServicio, String nombreServicio, String duracionServicio, double costoServicio, int descuentoServicio, String tipoServicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.duracionServicio = duracionServicio;
        this.costoServicio = costoServicio;
        this.descuentoServicio = descuentoServicio;
        this.tipoServicio = tipoServicio;
    }

    public Servicio() {
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
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

    public int getDescuentoServicio() {
        return descuentoServicio;
    }

    public void setDescuentoServicio(int descuentoServicio) {
        this.descuentoServicio = descuentoServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "idServicio=" + idServicio + ", nombreServicio=" + nombreServicio + ", duracionServicio=" + duracionServicio + ", costoServicio=" + costoServicio + ", descuentoServicio=" + descuentoServicio + ", tipoServicio=" + tipoServicio + '}';
    }
}