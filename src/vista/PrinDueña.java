package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrinDueña extends javax.swing.JFrame 
{
    FondoPanel fondo = new FondoPanel();
    
    public PrinDueña() 
    {
        setContentPane(fondo);
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
        Icono(new ImageIcon(getClass().getResource("/img/principal/Menu.jpg")), lblImagen);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/SalirW.png")), lblExit);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCalendario = new comp.Opcion();
        btnServicios = new comp.Opcion();
        lblExit = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/principal/log.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, 160));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 175, 170));
        jLabel2.setText("\"Transformamos tu imagen, realzamos tu belleza\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 290, 790, 70));

        btnCalendario.setBackground(new java.awt.Color(227, 227, 227));
        btnCalendario.setColor(new java.awt.Color(191, 166, 161));
        btnCalendario.setRoundBottomLeft(5);
        btnCalendario.setRoundBottomRight(5);
        btnCalendario.setRoundTopLeft(5);
        btnCalendario.setRoundTopRight(5);
        btnCalendario.setRuta(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\Clientes.png"));
        btnCalendario.setText("EMPLEADOS");
        btnCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalendarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 210, 220));

        btnServicios.setBackground(new java.awt.Color(211, 199, 196));
        btnServicios.setColor(new java.awt.Color(98, 88, 88));
        btnServicios.setRoundBottomLeft(5);
        btnServicios.setRoundBottomRight(5);
        btnServicios.setRoundTopLeft(5);
        btnServicios.setRoundTopRight(5);
        btnServicios.setRuta(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\Servicios.png"));
        btnServicios.setText("SERVICIOS");
        btnServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnServiciosMouseClicked(evt);
            }
        });
        getContentPane().add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 210, 220));

        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        getContentPane().add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        lblImagen.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 490, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseClicked
        FrmSerDueña ser = new FrmSerDueña();
        ser.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnServiciosMouseClicked

    private void btnCalendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalendarioMouseClicked
        FrmEmpDueña ser = new FrmEmpDueña();
        ser.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCalendarioMouseClicked

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
            java.util.logging.Logger.getLogger(PrinDueña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrinDueña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrinDueña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrinDueña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrinDueña().setVisible(true);
            }
        });
    }
    
    public void Icono(ImageIcon icono, JLabel label)
    {
        Image image = icono.getImage();
        image = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        icono = new ImageIcon(image);
        label.setIcon(icono);
    }
    
    class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/img/Fondo_users.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private comp.Opcion btnCalendario;
    private comp.Opcion btnServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
