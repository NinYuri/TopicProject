package login;

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
        setSize(872,600);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opcion1 = new comp.Opcion();
        opcion2 = new comp.Opcion();
        opcion3 = new comp.Opcion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/principal/log.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 160));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 175, 170));
        jLabel2.setText("\"Transformamos tu imagen, realzamos tu belleza\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 790, 70));

        opcion1.setBackground(new java.awt.Color(227, 227, 227));
        opcion1.setColor(new java.awt.Color(191, 166, 161));
        opcion1.setRoundBottomLeft(5);
        opcion1.setRoundBottomRight(5);
        opcion1.setRoundTopLeft(5);
        opcion1.setRoundTopRight(5);
        opcion1.setRuta(new java.io.File("C:\\Users\\Developer\\Downloads\\Clientes.png"));
        opcion1.setText("EMPLEADOS");
        getContentPane().add(opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, 220));

        opcion2.setBackground(new java.awt.Color(211, 199, 196));
        opcion2.setColor(new java.awt.Color(98, 88, 88));
        opcion2.setText("SERVICIOS");
        getContentPane().add(opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 210, 220));

        opcion3.setBackground(new java.awt.Color(227, 227, 227));
        opcion3.setColor(new java.awt.Color(191, 166, 161));
        opcion3.setRoundBottomLeft(5);
        opcion3.setRoundBottomRight(5);
        opcion3.setRoundTopLeft(5);
        opcion3.setRoundTopRight(5);
        opcion3.setRuta(new java.io.File("C:\\Users\\Developer\\Downloads\\Clientes.png"));
        opcion3.setText("FINANZAS");
        getContentPane().add(opcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 210, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private comp.Opcion opcion1;
    private comp.Opcion opcion2;
    private comp.Opcion opcion3;
    // End of variables declaration//GEN-END:variables
}
