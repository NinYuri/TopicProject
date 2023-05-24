package entidades;

public class SerSolicitado 
{
    private int idCita;
    private int idServicio;

    public SerSolicitado(int idCita, int idServicio) {
        this.idCita = idCita;
        this.idServicio = idServicio;
    }

    public SerSolicitado() {
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

    @Override
    public String toString() {
        return "SerSolicitados{" + "idCita=" + idCita + ", idServicio=" + idServicio + '}';
    }
}
