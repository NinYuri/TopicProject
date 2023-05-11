package entidades;

public class Servicio 
{
    private int idServicio;
    private String nombreServicio;
    private String duracionServicio;
    private double costoServicio;
    private int descuentoServicio;
    private String tipoServicio;
    private String ruta1;
    private String ruta2;
    private String ruta3;
    private String ruta4;
    private String ruta5;
    private String ruta6;
    private String ruta7;
    private String ruta8;

    public Servicio(int idServicio, String nombreServicio, String duracionServicio, double costoServicio, int descuentoServicio, String tipoServicio, String ruta1, String ruta2, String ruta3, String ruta4, String ruta5, String ruta6, String ruta7, String ruta8) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.duracionServicio = duracionServicio;
        this.costoServicio = costoServicio;
        this.descuentoServicio = descuentoServicio;
        this.tipoServicio = tipoServicio;
        this.ruta1 = ruta1;
        this.ruta2 = ruta2;
        this.ruta3 = ruta3;
        this.ruta4 = ruta4;
        this.ruta5 = ruta5;
        this.ruta6 = ruta6;
        this.ruta7 = ruta7;
        this.ruta8 = ruta8;
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

    public String getRuta1() {
        return ruta1;
    }

    public void setRuta1(String ruta1) {
        this.ruta1 = ruta1;
    }

    public String getRuta2() {
        return ruta2;
    }

    public void setRuta2(String ruta2) {
        this.ruta2 = ruta2;
    }

    public String getRuta3() {
        return ruta3;
    }

    public void setRuta3(String ruta3) {
        this.ruta3 = ruta3;
    }

    public String getRuta4() {
        return ruta4;
    }

    public void setRuta4(String ruta4) {
        this.ruta4 = ruta4;
    }

    public String getRuta5() {
        return ruta5;
    }

    public void setRuta5(String ruta5) {
        this.ruta5 = ruta5;
    }

    public String getRuta6() {
        return ruta6;
    }

    public void setRuta6(String ruta6) {
        this.ruta6 = ruta6;
    }

    public String getRuta7() {
        return ruta7;
    }

    public void setRuta7(String ruta7) {
        this.ruta7 = ruta7;
    }

    public String getRuta8() {
        return ruta8;
    }

    public void setRuta8(String ruta8) {
        this.ruta8 = ruta8;
    }

    @Override
    public String toString() {
        return "Servicio{" + "idServicio=" + idServicio + ", nombreServicio=" + nombreServicio + ", duracionServicio=" + duracionServicio + ", costoServicio=" + costoServicio + ", descuentoServicio=" + descuentoServicio + ", tipoServicio=" + tipoServicio + ", ruta1=" + ruta1 + ", ruta2=" + ruta2 + ", ruta3=" + ruta3 + ", ruta4=" + ruta4 + ", ruta5=" + ruta5 + ", ruta6=" + ruta6 + ", ruta7=" + ruta7 + ", ruta8=" + ruta8 + '}';
    }
}