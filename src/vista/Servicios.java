package vista;

import comp.Carrusel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javaswingdev.message.MessageDialog;
import javax.swing.JPanel;
import negocio.ServiciosControl;

public class Servicios extends javax.swing.JFrame 
{
    int contador = 0;
    String texto = "";
    String nombre, duracion, costo, descuento, tipo;
    
    Vector<String> nombres = new Vector<String>();
    Vector<String> horas = new Vector<String>();
    Vector<String> costos = new Vector<String>();
    Vector<String> descuentos = new Vector<String>();
    Vector<String> tipos = new Vector<String>();
    
    RealizarCita cita = new RealizarCita();
    Fondo fondo = new Fondo();
    private final ServiciosControl CONTROL;

    public Servicios() 
    {
        setContentPane(fondo);
        initComponents();
        CONTROL = new ServiciosControl();
        Icono(new ImageIcon(getClass().getResource("/img/iconos/Close.png")), lblClose);
        lblTitulo.setText(texto);
        
        setLocationRelativeTo(null);
        btnCerrarG.setVisible(false);
        Carrusel.setVisible(false);
    }
    
    public void Listar(String texto)
    {
        tblServicios.setModel(CONTROL.ListarServicios(texto));
    }
    
    public String getTexto()
    {
        return texto;
    }
    
    public void setTexto(String texto)
    {
        this.texto = texto;
        lblTitulo.setText(texto);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        btnGaleria = new javax.swing.JButton();
        Carrusel = new comp.Carrusel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServicios = new rojeru_san.complementos.RSTableMetro();
        btnCerrarG = new javax.swing.JButton();
        btnCita = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(960, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, 30));

        btnGaleria.setBackground(new java.awt.Color(191, 166, 161));
        btnGaleria.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btnGaleria.setForeground(new java.awt.Color(98, 88, 88));
        btnGaleria.setText("Activar Galería");
        btnGaleria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGaleria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGaleria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGaleriaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGaleriaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGaleriaMouseReleased(evt);
            }
        });
        getContentPane().add(btnGaleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 390, 90));

        Carrusel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarruselMouseClicked(evt);
            }
        });
        getContentPane().add(Carrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblServicios.setColorBackgoundHead(new java.awt.Color(225, 214, 212));
        tblServicios.setColorBordeFilas(new java.awt.Color(98, 88, 88));
        tblServicios.setColorBordeHead(new java.awt.Color(98, 88, 88));
        tblServicios.setColorFilasBackgound2(new java.awt.Color(225, 214, 212));
        tblServicios.setColorFilasForeground1(new java.awt.Color(67, 63, 63));
        tblServicios.setColorFilasForeground2(new java.awt.Color(67, 63, 63));
        tblServicios.setColorForegroundHead(new java.awt.Color(67, 63, 63));
        tblServicios.setColorSelBackgound(new java.awt.Color(208, 195, 195));
        tblServicios.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblServicios.setFuenteFilas(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tblServicios.setFuenteFilasSelect(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tblServicios.setFuenteHead(new java.awt.Font("Consolas", 1, 23)); // NOI18N
        tblServicios.setRowHeight(30);
        tblServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServiciosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblServicios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 880, 146));

        btnCerrarG.setBackground(new java.awt.Color(225, 214, 212));
        btnCerrarG.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnCerrarG.setForeground(new java.awt.Color(98, 88, 88));
        btnCerrarG.setText("Cerrar Galería");
        btnCerrarG.setFocusPainted(false);
        btnCerrarG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarGMouseClicked(evt);
            }
        });
        getContentPane().add(btnCerrarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 610, 190, -1));

        btnCita.setBackground(new java.awt.Color(225, 214, 212));
        btnCita.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnCita.setForeground(new java.awt.Color(98, 88, 88));
        btnCita.setText("Realizar Cita");
        btnCita.setFocusPainted(false);
        btnCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitaMouseClicked(evt);
            }
        });
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 190, -1));

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(98, 88, 88));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("\"\"");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 65, 500, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnGaleriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaleriaMouseClicked
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(tblServicios.getSelectedRowCount() == 1)
        {
            String nombre = String.valueOf(tblServicios.getValueAt(tblServicios.getSelectedRow(), 0));
            Carrusel(nombre, Carrusel);
            Carrusel.setVisible(true);
            btnGaleria.setVisible(false);
            btnCerrarG.setVisible(true);
        }
        else
            OptionPane.showMessage("Galería", "Debes seleccionar un servicio para mostrarte la galería", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnGaleriaMouseClicked

    private void btnGaleriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaleriaMousePressed
        btnGaleria.setForeground(Color.white);
    }//GEN-LAST:event_btnGaleriaMousePressed

    private void btnGaleriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaleriaMouseReleased
        btnGaleria.setForeground(new Color(98, 88, 88));
    }//GEN-LAST:event_btnGaleriaMouseReleased

    private void btnCerrarGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarGMouseClicked
        btnGaleria.setVisible(true);
        Carrusel.setVisible(false);
        btnCerrarG.setVisible(false);
        tblServicios.clearSelection();
    }//GEN-LAST:event_btnCerrarGMouseClicked

    private void btnCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitaMouseClicked
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(tblServicios.getSelectedRowCount() == 1)
        {
            String datoTabla = String.valueOf(tblServicios.getValueAt(tblServicios.getSelectedRow(), 0));
            if(!nombres.contains(datoTabla))
            {
                nombre = String.valueOf(tblServicios.getValueAt(tblServicios.getSelectedRow(), 0));            
                nombres.add(nombre);
                duracion = String.valueOf(tblServicios.getValueAt(tblServicios.getSelectedRow(), 1));            
                horas.add(duracion);
                costo = String.valueOf(tblServicios.getValueAt(tblServicios.getSelectedRow(), 2));
                costos.add(costo);
                descuento = String.valueOf(tblServicios.getValueAt(tblServicios.getSelectedRow(), 3));
                descuentos.add(descuento);
                tipo = getTipo();
                tipos.add(tipo);

                contador++;
                    cita.setNombres(nombres);
                    cita.setHoras(horas);
                    cita.setTipos(tipos);
                    cita.setDescuentos(descuentos);
                    cita.setCostos(costos);
                    cita.Datos(nombre, duracion, tipo, costo, contador);

                cita.setVisible(true);
                setVisible(false);
            }
            else
                OptionPane.showMessage("Realizar Cita", "Este servicio ya se encuentra seleccionado en la cita", "/img/iconos/Close.png");
        }
        else
            OptionPane.showMessage("Realizar Cita", "Debes seleccionar un servicio de la tabla", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnCitaMouseClicked

    private void CarruselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarruselMouseClicked
        
    }//GEN-LAST:event_CarruselMouseClicked

    private void tblServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServiciosMouseClicked
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(btnGaleria.isVisible() == false)
        {
            if(tblServicios.getSelectedRowCount() == 1)
            {
                String nombre = String.valueOf(tblServicios.getValueAt(tblServicios.getSelectedRow(), 0));
                Carrusel(nombre, Carrusel);
                Carrusel.setVisible(true);
                btnGaleria.setVisible(false);
                btnCerrarG.setVisible(true);
            }
            else
            OptionPane.showMessage("Galería", "Debes seleccionar un servicio para mostrarte la galería", "/img/iconos/Close.png");
        }
    }//GEN-LAST:event_tblServiciosMouseClicked

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
    }//GEN-LAST:event_btnCitaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
    }

    public int getContador() 
    {
        return contador;
    }

    public void setContador(int contador) 
    {
        this.contador = contador;
    }
    
    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }
    
    public void Carrusel(String texto, Carrusel car)
    {
        List<String[]> rutas = CONTROL.Imagen(texto);
        String[] rutasServicio = rutas.get(0);
        car.setRuta1(rutasServicio[0]);
        car.setRuta2(rutasServicio[1]);
        car.setRuta3(rutasServicio[2]);
        car.setRuta4(rutasServicio[3]);
        car.setRuta5(rutasServicio[4]);
        car.setRuta6(rutasServicio[5]);
        car.setRuta7(rutasServicio[6]);
        car.setRuta8(rutasServicio[7]);
    }
    
    class Fondo extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/img/Fondo_opc.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
    public void Icono(ImageIcon icono, JLabel label)
    {
        Image image = icono.getImage();
        image = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        icono = new ImageIcon(image);
        label.setIcon(icono);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private comp.Carrusel Carrusel;
    private javax.swing.JButton btnCerrarG;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnGaleria;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblTitulo;
    private rojeru_san.complementos.RSTableMetro tblServicios;
    // End of variables declaration//GEN-END:variables
}
