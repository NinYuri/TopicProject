package entidades;

public class Cita 
{
    private int idCita;
    private int idCliente;
    private int idServicio;
    private String horaCita;
    private String fechaCita;
    private String servicioCita;
    private String estadoCita;
    private String informacionCita;

    public Cita(int idCita, int idCliente, int idServicio, String horaCita, String fechaCita, String servicioCita, String estadoCita, String informacionCita) {
        this.idCita = idCita;
        this.idCliente = idCliente;
        this.idServicio = idServicio;
        this.horaCita = horaCita;
        this.fechaCita = fechaCita;
        this.servicioCita = servicioCita;
        this.estadoCita = estadoCita;
        this.informacionCita = informacionCita;
    }

    public Cita() {
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getServicioCita() {
        return servicioCita;
    }

    public void setServicioCita(String servicioCita) {
        this.servicioCita = servicioCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public String getInformacionCita() {
        return informacionCita;
    }

    public void setInformacionCita(String informacionCita) {
        this.informacionCita = informacionCita;
    }

    @Override
    public String toString() {
        return "Citas{" + "idCita=" + idCita + ", idCliente=" + idCliente + ", idServicio=" + idServicio + ", horaCita=" + horaCita + ", fechaCita=" + fechaCita + ", servicioCita=" + servicioCita + ", estadoCita=" + estadoCita + ", informacionCita=" + informacionCita + '}';
    }
}