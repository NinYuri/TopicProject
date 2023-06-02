package entidades;

public class Pago 
{
    private int idPago;
    private int idCliente;
    private int idCita;
    private String fechaPago;
    private String metodoPago;
    private double montoPago;
    private String estadoPago;

    public Pago(int idPago, int idCliente, int idCita, String fechaPago, String metodoPago, double montoPago, String estadoPago) {
        this.idPago = idPago;
        this.idCliente = idCliente;
        this.idCita = idCita;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.montoPago = montoPago;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", idCliente=" + idCliente + ", idCita=" + idCita + ", fechaPago=" + fechaPago + ", metodoPago=" + metodoPago + ", montoPago=" + montoPago + ", estadoPago=" + estadoPago + '}';
    }
}
