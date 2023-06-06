package vista;

import entidades.SerSolicitado;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javaswingdev.message.MessageDialog;
import javax.swing.JPanel;
import negocio.CitasControl;
import negocio.ClientesControl;
import negocio.EmpleadosControl;
import negocio.ServiciosControl;

public class Citas extends javax.swing.JFrame 
{
    String imagen;
    String duracionCita;
    double montoCita;
    
    Vector<String> nombres = new Vector<String>();
    Vector<String> costos = new Vector<String>();
    Vector<String> descuentos = new Vector<String>();
    
    List<SerSolicitado> detalles = new ArrayList();
    String sernom[] = new String[11];
    
    private final ClientesControl CONTROL;
    private final EmpleadosControl CONTROLEMP;
    private final ServiciosControl CONTROLSER;
    private final CitasControl CONTROLCIT;
    
    
    Fondo fondo = new Fondo();

    public Citas() 
    {
        setContentPane(fondo);
        initComponents();
        CONTROL = new ClientesControl();
        CONTROLEMP = new EmpleadosControl();
        CONTROLSER = new ServiciosControl();
        CONTROLCIT = new CitasControl();
        Icono(new ImageIcon(getClass().getResource("/img/iconos/Close.png")), lblClose);
        pnlPago.setVisible(false);
        
        setBounds(380, 170, 600, 613);
        imagen = CONTROLEMP.Imagen(lblNombreEmp.getText());
        Dibujar(imagen);
    }
    
    private void Invisible()
    {
       lblEmpleada.setVisible(false);
       lblEmp.setVisible(false);
       lblNombreEmp.setVisible(false);
       txtUsuario.setVisible(false);
       lblDate.setVisible(false);
       txtHora.setVisible(false);
       txtObservaciones.setVisible(false);
       btnFinCita.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        btnFinCita = new javax.swing.JButton();
        txtHora = new javax.swing.JTextField();
        lblDate = new rojeru_san.componentes.RSDateChooser();
        txtUsuario = new javax.swing.JTextField();
        lblEmpleada = new javax.swing.JLabel();
        lblEmp = new javax.swing.JLabel();
        lblNombreEmp = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        pnlPago = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 30, 30));

        btnFinCita.setBackground(new java.awt.Color(225, 214, 212));
        btnFinCita.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnFinCita.setForeground(new java.awt.Color(98, 88, 88));
        btnFinCita.setText("Finalizar Cita");
        btnFinCita.setFocusPainted(false);
        btnFinCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinCitaMouseClicked(evt);
            }
        });
        btnFinCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinCitaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 545, 200, -1));

        txtHora.setBackground(new java.awt.Color(255, 255, 255, 110));
        txtHora.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        txtHora.setForeground(new java.awt.Color(98, 88, 88));
        txtHora.setText("Hora");
        txtHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212)));
        txtHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraFocusLost(evt);
            }
        });
        txtHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHoraMouseClicked(evt);
            }
        });
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 540, 50));

        lblDate.setColorBackground(new java.awt.Color(225, 214, 212));
        lblDate.setColorButtonHover(new java.awt.Color(98, 88, 88));
        lblDate.setColorForeground(new java.awt.Color(57, 46, 46));
        lblDate.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        lblDate.setFuente(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 540, 50));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255, 110));
        txtUsuario.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(98, 88, 88));
        txtUsuario.setText("Nombre de Usuario");
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212)));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 540, 50));

        lblEmpleada.setBackground(new java.awt.Color(255, 204, 255));
        lblEmpleada.setOpaque(true);
        getContentPane().add(lblEmpleada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 90, 90));

        lblEmp.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblEmp.setForeground(new java.awt.Color(98, 88, 88));
        lblEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmp.setText("Empleada Asignada");
        getContentPane().add(lblEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 240, 40));

        lblNombreEmp.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblNombreEmp.setForeground(new java.awt.Color(98, 88, 88));
        lblNombreEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreEmp.setText("Yuriana");
        getContentPane().add(lblNombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 240, 50));

        txtObservaciones.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(98, 88, 88));
        txtObservaciones.setText("Observaciones");
        txtObservaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212)));
        txtObservaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtObservacionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionesFocusLost(evt);
            }
        });
        getContentPane().add(txtObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 540, 90));

        pnlPago.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pnlPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 580, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnFinCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinCitaMouseClicked
    }//GEN-LAST:event_btnFinCitaMouseClicked

    private void btnFinCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinCitaActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        String fechasql, obs;
        String resp, respss = "";
        
        if(!txtUsuario.getText().isEmpty() && !txtUsuario.getText().equals("Nombre de Usuario"))
            if(CONTROL.Existe(txtUsuario.getText()))
            {
                Date fecha = lblDate.getDatoFecha();
                if(fecha != null)
                    if(!txtHora.getText().isEmpty() && !txtHora.getText().equals("Hora"))
                        if(validarFormatoHora(txtHora.getText()))
                        {
                            fechasql = convertirFecha(String.valueOf(lblDate.getDatoFecha()));
                            
                            if(!txtObservaciones.getText().isBlank() && !txtObservaciones.getText().equals("Observaciones"))
                                obs = txtObservaciones.getText();
                            else
                                obs = "";
                                                        
                            resp = CONTROLCIT.Insertar(CONTROL.GetId(txtUsuario.getText()), CONTROLEMP.GetId(lblNombreEmp.getText()), fechasql, txtHora.getText(), duracionCita, montoCita, obs, agendarDetalle());
                            
                            if(resp.equals("OK"))
                            {
                                Invisible();
                                pnlPago.setVisible(true);
                            }
                            else
                                OptionPane.showMessage("Agendar Cita", "Hubo un error en la agenda de la cita", "/img/iconos/Close.png");
                        }
                        else
                            OptionPane.showMessage("Agendar Cita", "Error en la estructura de dato 00:00", "/img/iconos/Close.png");
                    else
                        OptionPane.showMessage("Agendar Cita", "Debes escribir una Hora", "/img/iconos/Close.png");
                else
                    OptionPane.showMessage("Agendar Cita", "Debes escribir una Fecha", "/img/iconos/Close.png");
            }
            else
                OptionPane.showMessage("Agendar Cita", "Debes escribir un nombre de usuario registrado", "/img/iconos/Close.png");                            
        else
            OptionPane.showMessage("Agendar Cita", "Debes escribir tu Nombre de Usuario", "/img/iconos/Close.png");            
    }//GEN-LAST:event_btnFinCitaActionPerformed

    private void txtHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFocusGained
        if(txtHora.getText().equals("Hora"))
        {
            txtHora.setText("");
            txtHora.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtHoraFocusGained

    private void txtHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFocusLost
        if(txtHora.getText().isEmpty())
        {
            txtHora.setText("Hora");
            txtHora.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtHoraFocusLost

    private void txtHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraMouseClicked

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if(txtUsuario.getText().equals("Nombre de Usuario"))
        {
            txtUsuario.setText("");
            txtUsuario.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if(txtUsuario.getText().isEmpty())
        {
            txtUsuario.setText("Nombre de Usuario");
            txtUsuario.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtObservacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesFocusGained
        if(txtObservaciones.getText().equals("Observaciones"))
        {
            txtObservaciones.setText("");
            txtObservaciones.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtObservacionesFocusGained

    private void txtObservacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionesFocusLost
        if(txtObservaciones.getText().isEmpty())
        {
            txtObservaciones.setText("Observaciones");
            txtObservaciones.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtObservacionesFocusLost

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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Citas().setVisible(true);
            }
        });
    }
    
    public List agendarDetalle()
    {
        for(int i = 0; i < sernom.length; i++)
            if(sernom[i] != null)
            {
                int id = CONTROLSER.GetId(sernom[i]);
                Double costo = CONTROLSER.GetCosto(CONTROLSER.GetId(sernom[i]), sernom[i]);
                Double descuento = CONTROLSER.GetDescuento(CONTROLSER.GetId(sernom[i]), sernom[i]);
                detalles.add(new SerSolicitado(id, costo, descuento));
            }
        return detalles;
    }

    public double getMontoCita() 
    {
        return montoCita;
    }

    public void setMontoCita(double montoCita) 
    {
        this.montoCita = montoCita;
    }
    
    public Vector<String> getNombres() 
    {
        return nombres;
    }
    
    public void setNombres(Vector<String> nombres) 
    {
        int con = 0;
        this.nombres = nombres;
        for(String elemento:this.nombres)
        {
            sernom[con] = elemento;
            con++;
        }
    }
    
    public String getDuracionCita() {
        return duracionCita;
    }

    public void setDuracionCita(String duracionCita) {
        this.duracionCita = duracionCita;
    }
    
    public String convertirFecha(String fechaCal)
    {
        String formatoFechaEntrada = "E MMM dd HH:mm:ss zzz yyyy";
        String formatoFechaSalida = "yyyy/MM/dd";
        String fechaFormateada = "";

        SimpleDateFormat sdfEntrada = new SimpleDateFormat(formatoFechaEntrada, Locale.US);
        SimpleDateFormat sdfSalida = new SimpleDateFormat(formatoFechaSalida);

        try 
        {
            Date fecha = sdfEntrada.parse(fechaCal);
            fechaFormateada = sdfSalida.format(fecha);
        }
        catch (ParseException e) 
        {
            System.out.println("Error al analizar la fecha: " + e.getMessage());
        }
        return fechaFormateada;
    }
    
    public boolean validarFormatoHora(String hora) 
    {
        String formatoHora = "HH:mm";

        try 
        {
            SimpleDateFormat sdf = new SimpleDateFormat(formatoHora);
            sdf.setLenient(false);
            sdf.parse(hora);
            return true;
        }
        catch (ParseException e) 
        {
            return false;
        }
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
    
    private void Dibujar(String ruta)
    {
        ImageIcon icono = new ImageIcon(ruta);
        Image image = icono.getImage();
        image = image.getScaledInstance(lblEmpleada.getWidth(), lblEmpleada.getHeight(), Image.SCALE_SMOOTH);
        icono = new ImageIcon(image);
        lblEmpleada.setIcon(icono);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinCita;
    private javax.swing.JLabel lblClose;
    private rojeru_san.componentes.RSDateChooser lblDate;
    private javax.swing.JLabel lblEmp;
    private javax.swing.JLabel lblEmpleada;
    private javax.swing.JLabel lblNombreEmp;
    private javax.swing.JPanel pnlPago;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
