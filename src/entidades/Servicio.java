package entidades;

public class Servicio 
{
    private int idServicio;
    private int idScorte;

    public Servicio(int idServicio, int idScorte) {
        this.idServicio = idServicio;
        this.idScorte = idScorte;
    }

    public Servicio() {
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdScorte() {
        return idScorte;
    }

    public void setIdScorte(int idScorte) {
        this.idScorte = idScorte;
    }

    @Override
    public String toString() {
        return "Servicios{" + "idServicio=" + idServicio + ", idScorte=" + idScorte + '}';
    }
}