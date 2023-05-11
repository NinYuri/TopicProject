package vista;

import comp.Carrusel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.JTableHeader;
import negocio.ServiciosControl;

public class SCortes extends javax.swing.JFrame 
{
    Fondo fondo = new Fondo();
    private final ServiciosControl CONTROL;

    public SCortes() 
    {
        setContentPane(fondo);
        initComponents();
        CONTROL = new ServiciosControl();
        Listar("Corte");
        Icono(new ImageIcon(getClass().getResource("/img/iconos/Close.png")), lblClose);
        
        setLocationRelativeTo(null);
        btnCerrarG.setVisible(false);
        Carrusel.setVisible(false);
    }
    
    private void Listar(String texto)
    {
        tblServicios.setModel(CONTROL.ListarServicios(texto));
        Tabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        btnGaleria = new javax.swing.JButton();
        Carrusel = new comp.Carrusel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        btnCerrarG = new javax.swing.JButton();
        btnCita = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(960, 670));
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
        getContentPane().add(Carrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        tblServicios.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tblServicios.setForeground(new java.awt.Color(67, 63, 63));
        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblServicios.setRowHeight(30);
        tblServicios.setSelectionBackground(new java.awt.Color(225, 214, 212));
        tblServicios.setSelectionForeground(new java.awt.Color(67, 63, 63));
        tblServicios.setShowGrid(false);
        tblServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServiciosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblServicios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 870, 130));

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
        getContentPane().add(btnCerrarG, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 590, 190, -1));

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
        getContentPane().add(btnCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 190, -1));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(98, 88, 88));
        jLabel1.setText("Menú Cortes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 65, 300, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnGaleriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaleriaMouseClicked
        if(tblServicios.getSelectedRowCount() == 1)
        {
            String nombre = String.valueOf(tblServicios.getValueAt(tblServicios.getSelectedRow(), 0));
            Carrusel(nombre, Carrusel);
            Carrusel.setVisible(true);
            btnGaleria.setVisible(false);
            btnCerrarG.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(this, "Debes seleccionar un servicio para mostrarte la galería", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGaleriaMouseClicked

    private void btnGaleriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaleriaMousePressed
        btnGaleria.setForeground(Color.white);
    }//GEN-LAST:event_btnGaleriaMousePressed

    private void btnGaleriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaleriaMouseReleased
        btnGaleria.setForeground(new Color(98, 88, 88));
    }//GEN-LAST:event_btnGaleriaMouseReleased

    private void tblServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServiciosMouseClicked
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
            JOptionPane.showMessageDialog(this, "Debes seleccionar un servicio para mostrarte la galería", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tblServiciosMouseClicked

    private void btnCerrarGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarGMouseClicked
        btnGaleria.setVisible(true);
        Carrusel.setVisible(false);
        btnCerrarG.setVisible(false);
    }//GEN-LAST:event_btnCerrarGMouseClicked

    private void btnCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCitaMouseClicked

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
            java.util.logging.Logger.getLogger(SCortes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SCortes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SCortes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SCortes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SCortes().setVisible(true);
            }
        });
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
    
    public void Tabla()
    {
        JTableHeader theader = tblServicios.getTableHeader();
        theader.setBackground(Color.red);
        theader.setFont(new Font("Consolas", Font.BOLD, 20));
        theader.setForeground(new Color(67,63,63));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private comp.Carrusel Carrusel;
    private javax.swing.JButton btnCerrarG;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnGaleria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JTable tblServicios;
    // End of variables declaration//GEN-END:variables
}
