package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Servicios extends javax.swing.JFrame 
{
    Fondo fondo = new Fondo();

    public Servicios() 
    {
        setContentPane(fondo);
        initComponents();
        Icono(new ImageIcon(getClass().getResource("/img/iconos/Close.png")), lblClose);

        
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        carrusel1 = new comp.Carrusel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, 30));

        carrusel1.setRuta1(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\CarMakeup\\MK1.jpg"));
        carrusel1.setRuta2(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\CarMakeup\\MK2.jpg"));
        carrusel1.setRuta3(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\CarMakeup\\MK3.jpg"));
        carrusel1.setRuta4(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\CarMakeup\\MK4.jpg"));
        carrusel1.setRuta5(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\CarMakeup\\MK5.jpg"));
        carrusel1.setRuta6(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\CarMakeup\\MK6.jpg"));
        carrusel1.setRuta7(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\CarMakeup\\MK7.jpg"));
        carrusel1.setRuta8(new java.io.File("C:\\Users\\Developer\\OneDrive\\Documentos\\University\\Archivos\\PDF's\\Tópicos\\Proyecto_img\\CarMakeup\\MK4.jpg"));
        getContentPane().add(carrusel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
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
    private comp.Carrusel carrusel1;
    private javax.swing.JLabel lblClose;
    // End of variables declaration//GEN-END:variables
}
