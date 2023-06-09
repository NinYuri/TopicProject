package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmSerClientes extends javax.swing.JFrame 
{
    Servicios ser = new Servicios();
    RealizarCita cita = new RealizarCita();
    Citas cerrarCita = new Citas();
    Fondo fondo = new Fondo();
    
    public FrmSerClientes() 
    {
        setContentPane(fondo);
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        lblMenu.setIcon(new ImageIcon(getClass().getResource("/img/Fondo.png")));
        lblMenu1.setIcon(new ImageIcon(getClass().getResource("/img/Fondo.png")));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/CortesW.png")), lblIconCortes);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/ColorW.png")), lblIconColor);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/PeinadoW.png")), lblIconPeinado);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/UñasW.png")), lblIconUñas);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/MaquillajeW.png")), lblIconMaquillaje);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/CeraW.png")), lblIconEpilacion);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/SalirW.png")), lblIconSalir);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCortes = new javax.swing.JLabel();
        lblIconCortes = new javax.swing.JLabel();
        lblCortes = new javax.swing.JLabel();
        btnColor = new javax.swing.JLabel();
        lblIconColor = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        btnPeinado = new javax.swing.JLabel();
        lblIconPeinado = new javax.swing.JLabel();
        lblPeinado = new javax.swing.JLabel();
        btnUñas = new javax.swing.JLabel();
        lblIconUñas = new javax.swing.JLabel();
        lblUñas = new javax.swing.JLabel();
        btnMaquillaje = new javax.swing.JLabel();
        lblIconMaquillaje = new javax.swing.JLabel();
        lblMaquillaje = new javax.swing.JLabel();
        btnEpilacion = new javax.swing.JLabel();
        lblIconEpilacion = new javax.swing.JLabel();
        lblEpilacion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        lblIconSalir = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblMenu1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2736, 50));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCortes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCortes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCortesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCortesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCortesMouseReleased(evt);
            }
        });
        getContentPane().add(btnCortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 60));
        getContentPane().add(lblIconCortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 60, 50));

        lblCortes.setBackground(new java.awt.Color(255, 255, 255));
        lblCortes.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCortes.setForeground(new java.awt.Color(255, 255, 255));
        lblCortes.setText("Cortes");
        getContentPane().add(lblCortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 9, -1, 50));

        btnColor.setBackground(new java.awt.Color(204, 204, 255));
        btnColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnColorMouseReleased(evt);
            }
        });
        getContentPane().add(btnColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 160, 60));
        getContentPane().add(lblIconColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 5, 60, 50));

        lblColor.setBackground(new java.awt.Color(255, 255, 255));
        lblColor.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Color");
        getContentPane().add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 9, -1, 50));

        btnPeinado.setBackground(new java.awt.Color(204, 204, 255));
        btnPeinado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeinado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPeinadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPeinadoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPeinadoMouseReleased(evt);
            }
        });
        getContentPane().add(btnPeinado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 180, 60));
        getContentPane().add(lblIconPeinado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 5, 60, 50));

        lblPeinado.setBackground(new java.awt.Color(255, 255, 255));
        lblPeinado.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblPeinado.setForeground(new java.awt.Color(255, 255, 255));
        lblPeinado.setText("Peinado");
        getContentPane().add(lblPeinado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 9, -1, 50));

        btnUñas.setBackground(new java.awt.Color(204, 204, 255));
        btnUñas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUñas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUñasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUñasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUñasMouseReleased(evt);
            }
        });
        getContentPane().add(btnUñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 150, 60));
        getContentPane().add(lblIconUñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 5, 60, 50));

        lblUñas.setBackground(new java.awt.Color(255, 255, 255));
        lblUñas.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblUñas.setForeground(new java.awt.Color(255, 255, 255));
        lblUñas.setText("Uñas");
        getContentPane().add(lblUñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 9, -1, 50));

        btnMaquillaje.setBackground(new java.awt.Color(204, 204, 255));
        btnMaquillaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaquillaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaquillajeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaquillajeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMaquillajeMouseReleased(evt);
            }
        });
        getContentPane().add(btnMaquillaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 220, 60));
        getContentPane().add(lblIconMaquillaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 5, 60, 50));

        lblMaquillaje.setBackground(new java.awt.Color(255, 255, 255));
        lblMaquillaje.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblMaquillaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMaquillaje.setText("Maquillaje");
        getContentPane().add(lblMaquillaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 9, -1, 50));

        btnEpilacion.setBackground(new java.awt.Color(204, 204, 255));
        btnEpilacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEpilacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEpilacionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEpilacionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEpilacionMouseReleased(evt);
            }
        });
        getContentPane().add(btnEpilacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 210, 60));
        getContentPane().add(lblIconEpilacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 5, 60, 50));

        lblEpilacion.setBackground(new java.awt.Color(255, 255, 255));
        lblEpilacion.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblEpilacion.setForeground(new java.awt.Color(255, 255, 255));
        lblEpilacion.setText("Epilación");
        getContentPane().add(lblEpilacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 9, -1, 50));

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSalirMouseReleased(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 160, 60));
        getContentPane().add(lblIconSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 5, 60, 50));

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setText("Salir");
        getContentPane().add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 9, -1, 50));

        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMenu.setPreferredSize(new java.awt.Dimension(2736, 50));
        getContentPane().add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2300, 60));

        lblMenu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenu1.setPreferredSize(new java.awt.Dimension(2736, 50));
        getContentPane().add(lblMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCortesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCortesMouseClicked
        ser.setTexto("Menú Cortes");
        ser.Listar("Corte");
        ser.setTipo("Corte");
        ser.setVisible(true);
    }//GEN-LAST:event_btnCortesMouseClicked

    private void btnCortesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCortesMousePressed
        btnCortes.setBorder(BorderFactory.createLoweredBevelBorder());
        lblCortes.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/CortesB.png")), lblIconCortes);
    }//GEN-LAST:event_btnCortesMousePressed

    private void btnCortesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCortesMouseReleased
        btnCortes.setBorder(null);
        lblCortes.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/CortesW.png")), lblIconCortes);
    }//GEN-LAST:event_btnCortesMouseReleased

    private void btnColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMouseClicked
        ser.setTexto("Menú Color");
        ser.Listar("Color");
        ser.setTipo("Color");
        ser.setVisible(true);
    }//GEN-LAST:event_btnColorMouseClicked

    private void btnColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMousePressed
        btnColor.setBorder(BorderFactory.createLoweredBevelBorder());
        lblColor.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/ColorB.png")), lblIconColor);
    }//GEN-LAST:event_btnColorMousePressed

    private void btnColorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMouseReleased
        btnColor.setBorder(null);
        lblColor.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/ColorW.png")), lblIconColor);
    }//GEN-LAST:event_btnColorMouseReleased

    private void btnPeinadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeinadoMouseClicked
        ser.setTexto("Menú Peinado");
        ser.Listar("Peinado");
        ser.setTipo("Color");
        ser.setVisible(true);
    }//GEN-LAST:event_btnPeinadoMouseClicked

    private void btnPeinadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeinadoMousePressed
        btnPeinado.setBorder(BorderFactory.createLoweredBevelBorder());
        lblPeinado.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/PeinadoB.png")), lblIconPeinado);
    }//GEN-LAST:event_btnPeinadoMousePressed

    private void btnPeinadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeinadoMouseReleased
        btnPeinado.setBorder(null);
        lblPeinado.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/PeinadoW.png")), lblIconPeinado);
    }//GEN-LAST:event_btnPeinadoMouseReleased

    private void btnUñasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUñasMouseClicked
        ser.setTexto("Menú Uñas");
        ser.Listar("Uñas");
        ser.setTipo("Uñas");
        ser.setVisible(true);
    }//GEN-LAST:event_btnUñasMouseClicked

    private void btnUñasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUñasMousePressed
        btnUñas.setBorder(BorderFactory.createLoweredBevelBorder());
        lblUñas.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/UñasB.png")), lblIconUñas);
    }//GEN-LAST:event_btnUñasMousePressed

    private void btnUñasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUñasMouseReleased
        btnUñas.setBorder(null);
        lblUñas.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/UñasW.png")), lblIconUñas);
    }//GEN-LAST:event_btnUñasMouseReleased

    private void btnMaquillajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaquillajeMouseClicked
        ser.setTexto("Menú Maquillaje");
        ser.Listar("Maquillaje");
        ser.setTipo("Maquillaje");
        ser.setVisible(true);
    }//GEN-LAST:event_btnMaquillajeMouseClicked

    private void btnMaquillajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaquillajeMousePressed
        btnMaquillaje.setBorder(BorderFactory.createLoweredBevelBorder());
        lblMaquillaje.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/MaquillajeB.png")), lblIconMaquillaje);
    }//GEN-LAST:event_btnMaquillajeMousePressed

    private void btnMaquillajeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaquillajeMouseReleased
        btnMaquillaje.setBorder(null);
        lblMaquillaje.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/MaquillajeW.png")), lblIconMaquillaje);
    }//GEN-LAST:event_btnMaquillajeMouseReleased

    private void btnEpilacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEpilacionMouseClicked
        ser.setTexto("Menú Epilación");
        ser.Listar("Epilacion");
        ser.setTipo("Epilación");
        ser.setVisible(true);
    }//GEN-LAST:event_btnEpilacionMouseClicked

    private void btnEpilacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEpilacionMousePressed
        btnEpilacion.setBorder(BorderFactory.createLoweredBevelBorder());
        lblEpilacion.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/CeraB.png")), lblIconEpilacion);
    }//GEN-LAST:event_btnEpilacionMousePressed

    private void btnEpilacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEpilacionMouseReleased
        btnEpilacion.setBorder(null);
        lblEpilacion.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/CeraW.png")), lblIconEpilacion);
    }//GEN-LAST:event_btnEpilacionMouseReleased

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        PrinCliente obd = new PrinCliente();
        obd.setVisible(true);
        ser.dispose();
        cita.dispose();
        cerrarCita.dispose();
        dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        btnSalir.setBorder(BorderFactory.createLoweredBevelBorder());
        lblSalir.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/SalirB.png")), lblIconSalir);
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseReleased
        btnSalir.setBorder(null);
        lblSalir.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/SalirW.png")), lblIconSalir);
    }//GEN-LAST:event_btnSalirMouseReleased

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
            java.util.logging.Logger.getLogger(FrmSerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSerClientes().setVisible(true);
            }
        });
    }
    
    public void Icono(ImageIcon icono, JLabel label)
    {
        Image image = icono.getImage();
        image = image.getScaledInstance(60, 50, Image.SCALE_SMOOTH);
        icono = new ImageIcon(image);
        label.setIcon(icono);
    }
    
    class Fondo extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/img/Fondo_men.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnColor;
    private javax.swing.JLabel btnCortes;
    private javax.swing.JLabel btnEpilacion;
    private javax.swing.JLabel btnMaquillaje;
    private javax.swing.JLabel btnPeinado;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnUñas;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblCortes;
    private javax.swing.JLabel lblEpilacion;
    private javax.swing.JLabel lblIconColor;
    private javax.swing.JLabel lblIconCortes;
    private javax.swing.JLabel lblIconEpilacion;
    private javax.swing.JLabel lblIconMaquillaje;
    private javax.swing.JLabel lblIconPeinado;
    private javax.swing.JLabel lblIconSalir;
    private javax.swing.JLabel lblIconUñas;
    private javax.swing.JLabel lblMaquillaje;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenu1;
    private javax.swing.JLabel lblPeinado;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUñas;
    // End of variables declaration//GEN-END:variables
}
