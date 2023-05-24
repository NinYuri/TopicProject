package entidades;

public class Cita 
{
    private int idCita;
    private int idCliente;
    private int idEmpleada;
    private String fechaCita;
    private String horaCita;
    private String duracionCita;
    private String observacionesCita;

    public Cita(int idCita, int idCliente, int idEmpleada, String fechaCita, String horaCita, String duracionCita, String observacionesCita) {
        this.idCita = idCita;
        this.idCliente = idCliente;
        this.idEmpleada = idEmpleada;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.duracionCita = duracionCita;
        this.observacionesCita = observacionesCita;
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

    public int getIdEmpleada() {
        return idEmpleada;
    }

    public void setIdEmpleada(int idEmpleada) {
        this.idEmpleada = idEmpleada;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getDuracionCita() {
        return duracionCita;
    }

    public void setDuracionCita(String duracionCita) {
        this.duracionCita = duracionCita;
    }

    public String getObservacionesCita() {
        return observacionesCita;
    }

    public void setObservacionesCita(String observacionesCita) {
        this.observacionesCita = observacionesCita;
    }

    @Override
    public String toString() {
        return "Cita{" + "idCita=" + idCita + ", idCliente=" + idCliente + ", idEmpleada=" + idEmpleada + ", fechaCita=" + fechaCita + ", horaCita=" + horaCita + ", duracionCita=" + duracionCita + ", observacionesCita=" + observacionesCita + '}';
    }
}