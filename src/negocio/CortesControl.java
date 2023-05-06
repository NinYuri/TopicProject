package negocio;

import datos.CortesDAO;
import entidades.Corte;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CortesControl 
{
    private final CortesDAO DATOS;
    private Corte obj;
    private DefaultTableModel modelo;
    
    public CortesControl()
    {
        DATOS = new CortesDAO();
        obj = new Corte();
    }
    
    public DefaultTableModel Listar(String texto)
    {
        List<Corte> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        String[] titulos = {"Servicio", "Duración", "Costo"};
        String[] registro = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        for(Corte item:lista)
        {
            registro[0] = item.getNombreScervicio();
            registro[1] = item.getDuracionScervicio();
            registro[2] = "$" + Double.toString(item.getCostoScervicio());
            modelo.addRow(registro);
        }
        return modelo;
    }
}