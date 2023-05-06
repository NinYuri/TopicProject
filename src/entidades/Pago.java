package entidades;

public class Pago 
{
    private int idPago;
    private int idCita;
    private String fechaPago;
    private String horaPago;
    private double montoPago;
    private String metodoPago;
    private String estadoPago;

    public Pago(int idPago, int idCita, String fechaPago, String horaPago, double montoPago, String metodoPago, String estadoPago) {
        this.idPago = idPago;
        this.idCita = idCita;
        this.fechaPago = fechaPago;
        this.horaPago = horaPago;
        this.montoPago = montoPago;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
    }

    public Pago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }
    
    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(String horaPago) {
        this.horaPago = horaPago;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    @Override
    public String toString() {
        return "Pagos{" + "idPago=" + idPago + ", idCita=" + idCita + ", fechaPago=" + fechaPago + ", horaPago=" + horaPago + ", montoPago=" + montoPago + ", metodoPago=" + metodoPago + ", estadoPago=" + estadoPago + '}';
    }
}