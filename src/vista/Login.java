package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import libreriaproyecto.Contrasena;
import libreriaproyecto.Generar;
import libreriaproyecto.Recordar;
import libreriaproyecto.Registrarse;
import negocio.ClientesControl;

public class Login extends javax.swing.JFrame 
{
    FondoPanel fondo = new FondoPanel();
    private final ClientesControl CONTROL;

    public Login()
    {
        setContentPane(fondo);
        initComponents();
        CONTROL = new ClientesControl();
        lblSee.setVisible(false);
        lblSeeReg.setVisible(false);
        lblSeeReg1.setVisible(false);
        pnlRegistro.setVisible(false);

        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlRegistro = new RoundedPanel(50);
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSeeReg = new javax.swing.JLabel();
        lblBlindReg = new javax.swing.JLabel();
        lblSeeReg1 = new javax.swing.JLabel();
        lblBlindReg1 = new javax.swing.JLabel();
        txtUsuarioN = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        pssConfCont = new javax.swing.JPasswordField();
        lblCrearC = new javax.swing.JLabel();
        pssContrasenaReg = new javax.swing.JPasswordField();
        lblGenerar = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        pnlIniSes = new RoundedPanel(50);
        lblSee = new javax.swing.JLabel();
        lblBlind = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pssContrasena = new javax.swing.JPasswordField();
        lblIniSes = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoW.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 260, 230));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 95)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STAY FASHION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 25, 580, 170));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 95)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("STAY FASHION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 25, 580, 170));

        pnlRegistro.setBackground(new java.awt.Color(217, 217, 217, 140));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail.png"))); // NOI18N
        pnlRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 55, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Telefono.png"))); // NOI18N
        pnlRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Age.png"))); // NOI18N
        pnlRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 205, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Genero.png"))); // NOI18N
        pnlRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 205, -1, -1));

        lblSeeReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blind.png"))); // NOI18N
        lblSeeReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSeeReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSeeRegMouseClicked(evt);
            }
        });
        pnlRegistro.add(lblSeeReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 282, -1, -1));

        lblBlindReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/see.png"))); // NOI18N
        lblBlindReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBlindReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBlindRegMouseClicked(evt);
            }
        });
        pnlRegistro.add(lblBlindReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 282, -1, -1));

        lblSeeReg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blind.png"))); // NOI18N
        lblSeeReg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSeeReg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSeeReg1MouseClicked(evt);
            }
        });
        pnlRegistro.add(lblSeeReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 356, -1, -1));

        lblBlindReg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/see.png"))); // NOI18N
        lblBlindReg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBlindReg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBlindReg1MouseClicked(evt);
            }
        });
        pnlRegistro.add(lblBlindReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 356, -1, -1));

        txtUsuarioN.setBackground(new java.awt.Color(191, 166, 161, 170));
        txtUsuarioN.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        txtUsuarioN.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioN.setText("Nombre de usuario");
        txtUsuarioN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUsuarioN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioNFocusLost(evt);
            }
        });
        txtUsuarioN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioNMouseClicked(evt);
            }
        });
        txtUsuarioN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioNActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtUsuarioN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, 540, 45));

        txtTelefono.setBackground(new java.awt.Color(191, 166, 161, 170));
        txtTelefono.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
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
        pnlRegistro.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 540, 45));

        pssConfCont.setBackground(new java.awt.Color(191, 166, 161, 170));
        pssConfCont.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        pssConfCont.setForeground(new java.awt.Color(255, 255, 255));
        pssConfCont.setText("Confirmar contraseña");
        pssConfCont.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pssConfCont.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pssConfContFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pssConfContFocusLost(evt);
            }
        });
        pnlRegistro.add(pssConfCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 345, 540, 45));

        lblCrearC.setBackground(new java.awt.Color(170, 145, 138));
        lblCrearC.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCrearC.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrearC.setText("Crear Cuenta");
        lblCrearC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCrearC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrearC.setOpaque(true);
        lblCrearC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearCMouseClicked(evt);
            }
        });
        pnlRegistro.add(lblCrearC, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 445, 430, 55));

        pssContrasenaReg.setBackground(new java.awt.Color(191, 166, 161, 170));
        pssContrasenaReg.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        pssContrasenaReg.setForeground(new java.awt.Color(255, 255, 255));
        pssContrasenaReg.setText("Contraseña");
        pssContrasenaReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pssContrasenaReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pssContrasenaRegFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pssContrasenaRegFocusLost(evt);
            }
        });
        pnlRegistro.add(pssContrasenaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 540, 45));

        lblGenerar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblGenerar.setForeground(new java.awt.Color(140, 91, 87));
        lblGenerar.setText("Generar contraseña segura");
        lblGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGenerarMouseClicked(evt);
            }
        });
        pnlRegistro.add(lblGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 393, -1, 30));

        txtGenero.setBackground(new java.awt.Color(191, 166, 161, 170));
        txtGenero.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));
        txtGenero.setText("Femenino/Masculino");
        txtGenero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtGenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGeneroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGeneroFocusLost(evt);
            }
        });
        txtGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGeneroMouseClicked(evt);
            }
        });
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 195, 300, 45));

        txtEdad.setBackground(new java.awt.Color(191, 166, 161, 170));
        txtEdad.setFont(new java.awt.Font("Consolas", 1, 19)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setText("Edad");
        txtEdad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEdadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdadFocusLost(evt);
            }
        });
        txtEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEdadMouseClicked(evt);
            }
        });
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 195, 190, 45));

        getContentPane().add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 255, 580, 530));

        pnlIniSes.setBackground(new java.awt.Color(217, 217, 217, 140));
        pnlIniSes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blind.png"))); // NOI18N
        lblSee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSeeMouseClicked(evt);
            }
        });
        pnlIniSes.add(lblSee, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        lblBlind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/see.png"))); // NOI18N
        lblBlind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBlind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBlindMouseClicked(evt);
            }
        });
        pnlIniSes.add(lblBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail.png"))); // NOI18N
        pnlIniSes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(191, 166, 161, 170));
        txtUsuario.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Nombre de usuario");
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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
        pnlIniSes.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 540, 50));

        pssContrasena.setBackground(new java.awt.Color(191, 166, 161, 170));
        pssContrasena.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        pssContrasena.setForeground(new java.awt.Color(255, 255, 255));
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
        pnlIniSes.add(pssContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 145, 540, 50));

        lblIniSes.setBackground(new java.awt.Color(170, 145, 138));
        lblIniSes.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblIniSes.setForeground(new java.awt.Color(255, 255, 255));
        lblIniSes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniSes.setText("Iniciar Sesión");
        lblIniSes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblIniSes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniSes.setOpaque(true);
        lblIniSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniSesMouseClicked(evt);
            }
        });
        pnlIniSes.add(lblIniSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 420, 60));

        lblRegistro.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(140, 91, 87));
        lblRegistro.setText("Regístrate");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });
        pnlIniSes.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(140, 91, 87));
        jLabel6.setText("¿No tienes cuenta?");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        pnlIniSes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 330, -1, -1));

        getContentPane().add(pnlIniSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 345, 580, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if(txtUsuario.getText().equals("Nombre de usuario"))
        {
            txtUsuario.setText("");
            txtUsuario.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if(txtUsuario.getText().isEmpty())
        {
            txtUsuario.setText("Nombre de usuario");
            txtUsuario.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void pssContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssContrasenaFocusGained
        if(String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
        {
            pssContrasena.setText("");
            pssContrasena.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pssContrasenaFocusGained

    private void pssContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssContrasenaFocusLost
        if(String.valueOf(pssContrasena.getPassword()).equals(""))
        {
            pssContrasena.setText("Contraseña");
            pssContrasena.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pssContrasenaFocusLost

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void lblIniSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniSesMouseClicked
        Recordar obc = new Recordar();
        
        if(txtUsuario.getText().equals("Susana"))
        {
            if(!String.valueOf(pssContrasena.getPassword()).isEmpty() && !String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
                if(obc.comparar(txtUsuario.getText(), String.valueOf(pssContrasena.getPassword())) == true)
                {
                    PrinDueña frmPrincipal = new PrinDueña();
                    frmPrincipal.setVisible(true);
                    dispose();
                }
                else
                {             
                    JOptionPane.showMessageDialog(this, "Contraseña Incorrecta", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                    pssContrasena.setText("");
                }
            else
            {             
                JOptionPane.showMessageDialog(this, "Debes escribir una Contraseña", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                pssContrasena.setText("");
            } 
        }
        else
            if(txtUsuario.getText().equals("Yuriana"))
            {
                if(!String.valueOf(pssContrasena.getPassword()).isEmpty() && !String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
                    if(obc.comparar(txtUsuario.getText(), String.valueOf(pssContrasena.getPassword())) == true)
                    {
                        PrinEmpleada frmPrincipal = new PrinEmpleada();
                        frmPrincipal.setVisible(true);
                        dispose();
                    }
                    else
                    {             
                        JOptionPane.showMessageDialog(this, "Contraseña Incorrecta", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                        pssContrasena.setText("");
                    }
                else
                {
                    JOptionPane.showMessageDialog(this, "Debes escribir una Contraseña", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                    pssContrasena.setText("");
                }
            }
            else
                if(CONTROL.Existe(txtUsuario.getText()) == true)
                {
                    if(!String.valueOf(pssContrasena.getPassword()).isEmpty() && !String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
                        if(CONTROL.Comparar(txtUsuario.getText(), String.valueOf(pssContrasena.getPassword())) == true)
                        {
                            PrinCliente frmPrincipal = new PrinCliente();
                            frmPrincipal.setVisible(true);
                            dispose();
                        }
                        else
                        {             
                            JOptionPane.showMessageDialog(this, "Contraseña Incorrecta", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                            pssContrasena.setText("");
                        }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Debes escribir una Contraseña", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                        pssContrasena.setText("");
                    }
                }
                else
                {
                    if(txtUsuario.getText().isEmpty() || txtUsuario.getText().equals("Nombre de usuario"))
                        JOptionPane.showMessageDialog(this, "Debes escribir un Nombre de Usuario", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                    if(String.valueOf(pssContrasena.getPassword()).isEmpty() || String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
                        JOptionPane.showMessageDialog(this, "Debes escribir una Contraseña", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Usuario Incorrecto", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
                        txtUsuario.setText("");                 
                    }
                }    
    }//GEN-LAST:event_lblIniSesMouseClicked

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        pnlIniSes.setVisible(false);
        pnlRegistro.setVisible(true);
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void lblBlindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBlindMouseClicked
        lblBlind.setVisible(false);
        lblSee.setVisible(true);
        pssContrasena.setEchoChar((char)0);
    }//GEN-LAST:event_lblBlindMouseClicked

    private void lblSeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeeMouseClicked
        lblBlind.setVisible(true);
        lblSee.setVisible(false);
        pssContrasena.setEchoChar('*');
    }//GEN-LAST:event_lblSeeMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void lblSeeRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeeRegMouseClicked
        lblBlindReg.setVisible(true);
        lblSeeReg.setVisible(false);
        pssContrasenaReg.setEchoChar('*');
    }//GEN-LAST:event_lblSeeRegMouseClicked

    private void lblBlindRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBlindRegMouseClicked
        lblBlindReg.setVisible(false);
        lblSeeReg.setVisible(true);
        pssContrasenaReg.setEchoChar((char)0);
    }//GEN-LAST:event_lblBlindRegMouseClicked

    private void txtUsuarioNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioNFocusGained
        if(txtUsuarioN.getText().equals("Nombre de usuario"))
        {
            txtUsuarioN.setText("");
            txtUsuarioN.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtUsuarioNFocusGained

    private void txtUsuarioNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioNFocusLost
        if(txtUsuarioN.getText().isEmpty())
        {
            txtUsuarioN.setText("Nombre de usuario");
            txtUsuarioN.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtUsuarioNFocusLost

    private void txtUsuarioNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioNMouseClicked

    private void txtUsuarioNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioNActionPerformed

    private void pssConfContFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssConfContFocusGained
        if(String.valueOf(pssConfCont.getPassword()).equals("Confirmar contraseña"))
        {
            pssConfCont.setText("");
            pssConfCont.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pssConfContFocusGained

    private void pssConfContFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssConfContFocusLost
        if(String.valueOf(pssConfCont.getPassword()).equals(""))
        {
            pssConfCont.setText("Confirmar contraseña");
            pssConfCont.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pssConfContFocusLost

    private void lblCrearCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCMouseClicked
        Contrasena contrasena = new Contrasena(String.valueOf(pssContrasenaReg.getPassword()));
        Registrarse obr = new Registrarse();
        String resp;
        
        if(!txtUsuarioN.getText().isEmpty() && !txtUsuarioN.getText().equals("Nombre de usuario"))
            if(CONTROL.Existe(txtUsuarioN.getText()) == true)
            {
                JOptionPane.showMessageDialog(this, "El usuario ya se encuentra registrado en el sistema", "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
                txtUsuarioN.setText("");
                pssContrasenaReg.setText("Contraseña");
                pssConfCont.setText("Confirmar contraseña");
            }
            else
                if(!txtTelefono.getText().isEmpty() && !txtTelefono.getText().equals("Teléfono"))
                    if(obr.valTelefono(txtTelefono.getText().trim()) == false)
                    {
                        JOptionPane.showMessageDialog(this, obr.Mensaje(), "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
                        txtTelefono.setText("");
                    }
                    else
                        if(!txtGenero.getText().isEmpty() && !txtGenero.getText().equals("Femenino/Masculino"))
                            if(obr.valGenero(txtGenero.getText().trim()) == false)
                            {
                                JOptionPane.showMessageDialog(this, obr.Mensaje(), "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
                                txtGenero.setText("");
                            }
                            else
                                if(!txtEdad.getText().isBlank() && !txtEdad.getText().equals("Edad"))
                                    if(obr.valEdad(txtEdad.getText()) == false)
                                    {
                                        JOptionPane.showMessageDialog(this, obr.Mensaje(), "Registro en el Sistema", JOptionPane.ERROR_MESSAGE);
                                        txtEdad.setText("");
                                    }
                                    else
                                        if(!String.valueOf(pssContrasenaReg.getPassword()).isEmpty() && !String.valueOf(pssContrasenaReg.getPassword()).equals("Contraseña"))
                                            if(!String.valueOf(pssConfCont.getPassword()).isEmpty() && !String.valueOf(pssConfCont.getPassword()).equals("Confirmar contraseña"))
                                            {
                                                if(String.valueOf(pssContrasenaReg.getPassword()).equals(String.valueOf(pssConfCont.getPassword())))
                                                {
                                                    if(contrasena.ValidarContrasena() == true)
                                                    {
                                                        resp = CONTROL.Insertar(txtUsuarioN.getText(), String.valueOf(pssContrasenaReg.getPassword()), txtTelefono.getText(), txtGenero.getText(), Integer.parseInt(txtEdad.getText()));
                                                        JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente, por favor ingrese con su nueva cuenta", "Registro en el Sistema...", JOptionPane.INFORMATION_MESSAGE);
                                                        txtUsuarioN.setText("Nombre de usuario");
                                                        txtTelefono.setText("Teléfono");
                                                        txtGenero.setText("Femenino/Masculino");
                                                        txtEdad.setText("Edad");
                                                        pssContrasenaReg.setText("Contraseña");
                                                        pssConfCont.setText("Confirmar contraseña");
                                                        pnlRegistro.setVisible(false);
                                                        pnlIniSes.setVisible(true);
                                                    }
                                                    else
                                                    {
                                                        JOptionPane.showMessageDialog(this, contrasena.Error(), "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
                                                        pssContrasenaReg.setText("Contraseña");
                                                        pssConfCont.setText("Confirmar contraseña");
                                                    }    
                                                }
                                                else
                                                {
                                                    JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
                                                    pssConfCont.setText("");
                                                }
                                            }
                                            else
                                                JOptionPane.showMessageDialog(this, "Y confirmar tu Contraseña", "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
                                        else
                                            JOptionPane.showMessageDialog(this, "Debes escribir una Contraseña", "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
                                else
                                    JOptionPane.showMessageDialog(this, "Debes escribir tu Edad", "Registro en el Sistema", JOptionPane.ERROR_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(this, "Debes ingresar tu Género", "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this, "Debes escribir un Número de Teléfono", "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Debes escribir un Nombre de usuario", "Registro en el Sistema...", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_lblCrearCMouseClicked

    private void pssContrasenaRegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssContrasenaRegFocusGained
        if(String.valueOf(pssContrasenaReg.getPassword()).equals("Contraseña"))
        {
            pssContrasenaReg.setText("");
            pssContrasenaReg.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pssContrasenaRegFocusGained

    private void pssContrasenaRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssContrasenaRegFocusLost
        if(String.valueOf(pssContrasenaReg.getPassword()).equals(""))
        {
            pssContrasenaReg.setText("Contraseña");
            pssContrasenaReg.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pssContrasenaRegFocusLost

    private void lblSeeReg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeeReg1MouseClicked
        lblBlindReg1.setVisible(true);
        lblSeeReg1.setVisible(false);
        pssConfCont.setEchoChar('*');
    }//GEN-LAST:event_lblSeeReg1MouseClicked

    private void lblBlindReg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBlindReg1MouseClicked
        lblBlindReg1.setVisible(false);
        lblSeeReg1.setVisible(true);
        pssConfCont.setEchoChar((char)0);
    }//GEN-LAST:event_lblBlindReg1MouseClicked

    private void lblGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerarMouseClicked
        Generar obg = new Generar();
        String contseg = obg.Generador();
        pssContrasenaReg.setText(contseg);
        pssConfCont.setText(contseg);
    }//GEN-LAST:event_lblGenerarMouseClicked

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if(txtTelefono.getText().equals("Teléfono"))
        {
            txtTelefono.setText("");
            txtTelefono.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if(txtTelefono.getText().isEmpty())
        {
            txtTelefono.setText("Teléfono");
            txtTelefono.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtGeneroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGeneroFocusGained
        if(txtGenero.getText().equals("Femenino/Masculino"))
        {
            txtGenero.setText("");
            txtGenero.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtGeneroFocusGained

    private void txtGeneroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGeneroFocusLost
        if(txtGenero.getText().isEmpty())
        {
            txtGenero.setText("Femenino/Masculino");
            txtGenero.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtGeneroFocusLost

    private void txtGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGeneroMouseClicked
    }//GEN-LAST:event_txtGeneroMouseClicked

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusGained
        if(txtEdad.getText().equals("Edad"))
        {
            txtEdad.setText("");
            txtEdad.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtEdadFocusGained

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        if(txtEdad.getText().isEmpty())
        {
            txtEdad.setText("Edad");
            txtEdad.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtEdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadMouseClicked

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/img/Fondo.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
 
        public RoundedPanel(int radius) 
        {
            super();
            cornerRadius = radius;   
        }
         
        @Override
        protected void paintComponent(Graphics g) 
        {
            Image imagen;
            imagen = new ImageIcon(getClass().getResource("/img/Fondo.png")).getImage();
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            if (backgroundColor != null) 
                graphics.setColor(backgroundColor);
            else
                graphics.setColor(getBackground());
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
        }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBlind;
    private javax.swing.JLabel lblBlindReg;
    private javax.swing.JLabel lblBlindReg1;
    private javax.swing.JLabel lblCrearC;
    private javax.swing.JLabel lblGenerar;
    private javax.swing.JLabel lblIniSes;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblSee;
    private javax.swing.JLabel lblSeeReg;
    private javax.swing.JLabel lblSeeReg1;
    private javax.swing.JPanel pnlIniSes;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPasswordField pssConfCont;
    private javax.swing.JPasswordField pssContrasena;
    private javax.swing.JPasswordField pssContrasenaReg;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioN;
    // End of variables declaration//GEN-END:variables
}
