package negocio;

import datos.PagosDAO;
import entidades.Pago;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PagosControl 
{
    private final PagosDAO DATOS;
    private Pago obj;
    private DefaultTableModel modeloTabla;
    
    public PagosControl()
    {
        DATOS = new PagosDAO();
        obj = new Pago();
    }
    
    public String Insertar(int idCliente, int idCita, String fechaPago, String metodoPago, double montoPago, String estadoPago)
    {
        if(DATOS.existe(idCita))
            return "El pago ya se ha realizado";
        else
        {
            obj.setIdCliente(idCliente);
            obj.setIdCita(idCita);
            obj.setFechaPago(fechaPago);
            obj.setMetodoPago(metodoPago);
            obj.setMontoPago(montoPago);
            obj.setEstadoPago(estadoPago);
            
            if(DATOS.insertar(obj))
                return "OK";
            else
                return "Error en la inserción del pago";
        }
    }
}