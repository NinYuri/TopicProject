package entidades;

public class SerSolicitado 
{
    private int idSSol;
    private int idCita;
    private int idServicio;
    private double costoServicio;
    private double descuento;

    public SerSolicitado(int idSSol, int idCita, int idServicio, double costoServicio, double descuento) {
        this.idSSol = idSSol;
        this.idCita = idCita;
        this.idServicio = idServicio;
        this.costoServicio = costoServicio;
        this.descuento = descuento;
    }

    public SerSolicitado(int idServicio, double costoServicio, double descuento) {
        this.idServicio = idServicio;
        this.costoServicio = costoServicio;
        this.descuento = descuento;
    }
    
    public SerSolicitado() {
    }

    public int getIdSSol() {
        return idSSol;
    }

    public void setIdSSol(int idSSol) {
        this.idSSol = idSSol;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public double getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "SerSolicitado{" + "idSSol=" + idSSol + ", idCita=" + idCita + ", idServicio=" + idServicio + ", costoServicio=" + costoServicio + ", descuento=" + descuento + '}';
    }
}
