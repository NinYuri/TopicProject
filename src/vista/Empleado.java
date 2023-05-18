package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javaswingdev.message.MessageDialog;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import libreriaproyecto.Contrasena;
import libreriaproyecto.Registrarse;
import negocio.EmpleadosControl;

public class Empleado extends javax.swing.JFrame 
{
    String datos[] = new String[5];
    FondoPanel fondo = new FondoPanel();
    private final EmpleadosControl CONTROL;
    
    public Empleado() 
    {
        setContentPane(fondo);
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        CONTROL = new EmpleadosControl();  
        Icono(new ImageIcon(getClass().getResource("/img/iconos/Clientes.png")), lblImagen);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/blindC.png")), lblSee);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/seeC.png")), lblBlind);
        lblSee.setVisible(false);
        txtTelefono.setVisible(false);
        txtDireccion.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSee = new javax.swing.JLabel();
        lblBlind = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        pssContrasena = new javax.swing.JPasswordField();
        btnDatos = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blind.png"))); // NOI18N
        lblSee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSeeMouseClicked(evt);
            }
        });
        getContentPane().add(lblSee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 456, -1, 35));

        lblBlind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/see.png"))); // NOI18N
        lblBlind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBlind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBlindMouseClicked(evt);
            }
        });
        getContentPane().add(lblBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 463, -1, -1));

        lblImagen.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 190, 180));

        jLabel1.setBackground(new java.awt.Color(193, 175, 170, 170));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(177, 152, 147), 2, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 648, 60));

        jLabel2.setBackground(new java.awt.Color(193, 175, 170, 170));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(177, 152, 147), 2, true));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 703, 648, 60));

        txtNombre.setBackground(new java.awt.Color(193, 175, 170, 110));
        txtNombre.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(98, 88, 88));
        txtNombre.setText("Nombre de empleado(a)");
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 540, 45));

        txtTelefono.setBackground(new java.awt.Color(193, 175, 170, 110));
        txtTelefono.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(98, 88, 88));
        txtTelefono.setText("Teléfono");
        txtTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 540, 45));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(98, 88, 88));
        jLabel3.setText("DATOS PERSONALES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 580, 90));

        txtDireccion.setBackground(new java.awt.Color(193, 175, 170, 110));
        txtDireccion.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(98, 88, 88));
        txtDireccion.setText("Dirección");
        txtDireccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDireccionMouseClicked(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 540, 45));

        pssContrasena.setBackground(new java.awt.Color(193, 175, 170, 110));
        pssContrasena.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        pssContrasena.setForeground(new java.awt.Color(98, 88, 88));
        pssContrasena.setText("Contraseña");
        pssContrasena.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pssContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pssContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pssContrasenaFocusLost(evt);
            }
        });
        getContentPane().add(pssContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 540, 45));

        btnDatos.setBackground(new java.awt.Color(225, 214, 212));
        btnDatos.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnDatos.setForeground(new java.awt.Color(98, 88, 88));
        btnDatos.setText("OBTENER DATOS");
        btnDatos.setFocusPainted(false);
        btnDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatosMouseClicked(evt);
            }
        });
        getContentPane().add(btnDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 190, 40));

        btnModificar.setBackground(new java.awt.Color(225, 214, 212));
        btnModificar.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(98, 88, 88));
        btnModificar.setText("MODIFICAR");
        btnModificar.setFocusPainted(false);
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 190, 40));

        btnCancelar.setBackground(new java.awt.Color(225, 214, 212));
        btnCancelar.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(98, 88, 88));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusPainted(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if(txtNombre.getText().equals("Nombre de empleado(a)"))
        {
            txtNombre.setText("");
            txtNombre.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if(txtNombre.getText().isEmpty())
        {
            txtNombre.setText("Nombre de empleado(a)");
            txtNombre.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if(txtTelefono.getText().equals("Teléfono"))
        {
            txtTelefono.setText("");
            txtTelefono.setForeground(new Color(98,88,88));
        }        
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if(txtTelefono.getText().isEmpty())
        {
            txtTelefono.setText("Teléfono");
            txtTelefono.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        if(txtDireccion.getText().equals("Dirección"))
        {
            txtDireccion.setText("");
            txtDireccion.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        if(txtDireccion.getText().isEmpty())
        {
            txtDireccion.setText("Dirección");
            txtDireccion.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionMouseClicked

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void pssContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssContrasenaFocusGained
        if(String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
        {
            pssContrasena.setText("");
            pssContrasena.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_pssContrasenaFocusGained

    private void pssContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssContrasenaFocusLost
        if(String.valueOf(pssContrasena.getPassword()).equals(""))
        {
            pssContrasena.setText("Contraseña");
            pssContrasena.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_pssContrasenaFocusLost

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        Contrasena contrasena = new Contrasena(String.valueOf(pssContrasena.getPassword()));
        Registrarse obr = new Registrarse();
        String resp;
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(txtTelefono.isVisible() == true && txtDireccion.isVisible() == true)
            if(!txtNombre.getText().isEmpty() && !txtNombre.getText().equals("Nombre de empleado(a)"))
                if(!txtDireccion.getText().isEmpty() && !txtDireccion.getText().equals("Dirección"))                
                    if(!txtTelefono.getText().isEmpty() && !txtTelefono.getText().equals("Teléfono"))
                        if(obr.valTelefono(txtTelefono.getText().trim()) == false)
                        {
                            OptionPane.showMessage("Modificar Datos de Empleado(a)", obr.Mensaje(), "/img/iconos/Close.png");
                            txtTelefono.setText("");
                        }
                        else
                            if(!String.valueOf(pssContrasena.getPassword()).isEmpty() && !String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
                                if(contrasena.ValidarContrasena() == true)
                                {
                                    resp = CONTROL.ActualizarE(txtNombre.getText(), txtNombre.getText(), String.valueOf(pssContrasena.getPassword()), txtDireccion.getText(), txtTelefono.getText());
                                                
                                    if(resp.equals("OK"))
                                    {
                                        OptionPane.showMessage("Modificar Datos de Empleado(a)", "Datos actualizados con éxito", "/img/iconos/Info.png");
                                        txtDireccion.setVisible(false);
                                        txtTelefono.setVisible(false);
                                    }
                                    else
                                        OptionPane.showMessage("Modificar Datos de Empleado(a)", "Hubo un error en la actualización", "/img/iconos/Close.png");                                                    
                                }
                                else
                                {
                                    OptionPane.showMessage("Modificar Datos de Empleado(a)", contrasena.Error(), "/img/iconos/Close.png");
                                    pssContrasena.setText("Contraseña");
                                }
                            else
                                OptionPane.showMessage("Modificar Datos de Empleado(a)", "Debes escribir tu Contraseña", "/img/iconos/Close.png");
                    else
                        OptionPane.showMessage("Modificar Datos de Empleado(a)", "Debes escribir un Número de Teléfono", "/img/iconos/Close.png");
                else
                    OptionPane.showMessage("Modificar Datos de Empleado(a)", "Debes ingresar tu Dirección", "/img/iconos/Close.png");
            else
                OptionPane.showMessage("Modificar Datos de Empleado(a)", "Debes escribir un Nombre de empleado(a)", "/img/iconos/Close.png");
        else
            OptionPane.showMessage("Modificar Datos de Empleado(a)", "Debes obtener tus datos primero", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        txtNombre.setText("Nombre de empleado(a)");
        pssContrasena.setText("Contraseña");
        txtDireccion.setText("Dirección");
        txtTelefono.setText("Teléfono");
        dispose();
        PrinEmpleada principal = new PrinEmpleada();
        principal.setVisible(true);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatosMouseClicked
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(CONTROL.Existe(txtNombre.getText()) == true)
        {
            if(!String.valueOf(pssContrasena.getPassword()).isEmpty() && !String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
                if(CONTROL.Comparar(txtNombre.getText(), String.valueOf(pssContrasena.getPassword())) == true)
                {
                    txtDireccion.setVisible(true);
                    txtTelefono.setVisible(true);
                    datos = CONTROL.Datos(txtNombre.getText());
                    txtDireccion.setText(datos[3]);                    
                    txtTelefono.setText(datos[4]);
                }
                else
                {             
                    OptionPane.showMessage("Datos Personales", "Contraseña Incorrecta", "/img/iconos/Close.png");
                    pssContrasena.setText("");
                }
            else
            {
                OptionPane.showMessage("Datos Personales", "Debes escribir una Contraseña", "/img/iconos/Close.png");
                pssContrasena.setText("");
            }
        }
        else
        {
            if(txtNombre.getText().isEmpty() || txtNombre.getText().equals("Nombre de empleado(a)"))
                OptionPane.showMessage("Datos Personales", "Debes escribir un Nombre de Empleado(a)", "/img/iconos/Close.png");
            if(String.valueOf(pssContrasena.getPassword()).isEmpty() || String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
                OptionPane.showMessage("Datos Personales", "Debes escribir una Contraseña", "/img/iconos/Close.png");
            else
            {
                OptionPane.showMessage("Datos Personales", "Empleado Incorrecto", "/img/iconos/Close.png");
                txtNombre.setText("");                 
            }
        }
    }//GEN-LAST:event_btnDatosMouseClicked

    private void lblSeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeeMouseClicked
        lblBlind.setVisible(true);
        lblSee.setVisible(false);
        pssContrasena.setEchoChar('*');
    }//GEN-LAST:event_lblSeeMouseClicked

    private void lblBlindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBlindMouseClicked
        lblBlind.setVisible(false);
        lblSee.setVisible(true);
        pssContrasena.setEchoChar((char)0);
    }//GEN-LAST:event_lblBlindMouseClicked

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Empleado().setVisible(true);
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
            imagen = new ImageIcon(getClass().getResource("/img/principal/Fondo_usuarios.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBlind;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblSee;
    private javax.swing.JPasswordField pssContrasena;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
