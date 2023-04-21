package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PrinDue extends javax.swing.JFrame 
{
    FondoPanel fondo = new FondoPanel();
    
    public PrinDue() 
    {
        setContentPane(fondo);
        initComponents();
        
        setLocationRelativeTo(null);
        setSize(870,602);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opcEmpleados = new comp.Opcion();
        opcServicios = new comp.Opcion();
        opcFinanzas = new comp.Opcion();
        lblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/principal/log.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 160));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 175, 170));
        jLabel2.setText("\"Transformamos tu imagen, realzamos tu belleza\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 790, 70));

        opcEmpleados.setBackground(new java.awt.Color(227, 227, 227));
        opcEmpleados.setColor(new java.awt.Color(191, 166, 161));
        opcEmpleados.setRoundBottomLeft(5);
        opcEmpleados.setRoundBottomRight(5);
        opcEmpleados.setRoundTopLeft(5);
        opcEmpleados.setRoundTopRight(5);
        opcEmpleados.setRuta(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\Clientes.png"));
        opcEmpleados.setText("EMPLEADOS");
        getContentPane().add(opcEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, 220));

        opcServicios.setBackground(new java.awt.Color(211, 199, 196));
        opcServicios.setColor(new java.awt.Color(98, 88, 88));
        opcServicios.setRoundBottomLeft(5);
        opcServicios.setRoundBottomRight(5);
        opcServicios.setRoundTopLeft(5);
        opcServicios.setRoundTopRight(5);
        opcServicios.setRuta(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\Servicios.png"));
        opcServicios.setText("SERVICIOS");
        opcServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcServiciosMouseClicked(evt);
            }
        });
        getContentPane().add(opcServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 210, 220));

        opcFinanzas.setBackground(new java.awt.Color(227, 227, 227));
        opcFinanzas.setColor(new java.awt.Color(191, 166, 161));
        opcFinanzas.setRoundBottomLeft(5);
        opcFinanzas.setRoundBottomRight(5);
        opcFinanzas.setRoundTopLeft(5);
        opcFinanzas.setRoundTopRight(5);
        opcFinanzas.setRuta(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\Finanzas.png"));
        opcFinanzas.setText("FINANZAS");
        getContentPane().add(opcFinanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 210, 220));

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/principal/Exit.png"))); // NOI18N
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        getContentPane().add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcServiciosMouseClicked
        FrmServicios ser = new FrmServicios();
        ser.setVisible(true);
        dispose();
    }//GEN-LAST:event_opcServiciosMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblExitMouseClicked

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
            java.util.logging.Logger.getLogger(PrinDue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrinDue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrinDue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrinDue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrinDue().setVisible(true);
            }
        });
    }
    
    class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/img/Background.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblExit;
    private comp.Opcion opcEmpleados;
    private comp.Opcion opcFinanzas;
    private comp.Opcion opcServicios;
    // End of variables declaration//GEN-END:variables
}
