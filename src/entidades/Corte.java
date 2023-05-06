package entidades;

public class Corte 
{
    private int idCorte;
    private String nombreScervicio;
    private String duracionScervicio;
    private double costoScervicio;

    public Corte(int idCorte, String nombreScervicio, String duracionScervicio, double costoScervicio) {
        this.idCorte = idCorte;
        this.nombreScervicio = nombreScervicio;
        this.duracionScervicio = duracionScervicio;
        this.costoScervicio = costoScervicio;
    }

    public Corte() {
    }

    public int getIdCorte() {
        return idCorte;
    }

    public void setIdCorte(int idCorte) {
        this.idCorte = idCorte;
    }

    public String getNombreScervicio() {
        return nombreScervicio;
    }

    public void setNombreScervicio(String nombreScervicio) {
        this.nombreScervicio = nombreScervicio;
    }

    public String getDuracionScervicio() {
        return duracionScervicio;
    }

    public void setDuracionScervicio(String duracionScervicio) {
        this.duracionScervicio = duracionScervicio;
    }

    public double getCostoScervicio() {
        return costoScervicio;
    }

    public void setCostoScervicio(double costoScervicio) {
        this.costoScervicio = costoScervicio;
    }

    @Override
    public String toString() {
        return "Cortes{" + "idCorte=" + idCorte + ", nombreScervicio=" + nombreScervicio + ", duracionScervicio=" + duracionScervicio + ", costoScervicio=" + costoScervicio + '}';
    }
}