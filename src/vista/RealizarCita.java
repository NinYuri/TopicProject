package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javaswingdev.message.MessageDialog;
import javax.swing.JPanel;

public class RealizarCita extends javax.swing.JFrame 
{
    Vector<String> nombres = new Vector<String>();
    Vector<String> horas = new Vector<String>();
    Vector<String> costos = new Vector<String>();
    Vector<String> descuentos = new Vector<String>();
    Vector<String> tipos = new Vector<String>();
    
    int contador1 = 1;
    int contador2 = 1;
    int contador3 = 1;
    int contador4 = 1;
    
    Fondo fondo = new Fondo();
    Citas cita = new Citas();

    public RealizarCita() 
    {
        setContentPane(fondo);
        initComponents();
        Icono(new ImageIcon(getClass().getResource("/img/iconos/Close.png")), lblClose);
        
        setBounds(200, 80, 980, 800);
        Invisible();
    }
    
    private void Invisible()
    {
        lblIcon2.setVisible(false);
        lblIcon3.setVisible(false);
        lblIcon4.setVisible(false);
        lblNombre2.setVisible(false);
        lblNombre3.setVisible(false);
        lblNombre4.setVisible(false);
        lblTipo2.setVisible(false);
        lblTipo3.setVisible(false);
        lblTipo4.setVisible(false);
        lblDuracion2.setVisible(false);
        lblDuracion3.setVisible(false);
        lblDuracion4.setVisible(false);
        btnUp2.setVisible(false);
        btnUp3.setVisible(false);
        btnUp4.setVisible(false);
        btnDown2.setVisible(false);
        btnDown3.setVisible(false);
        btnDown4.setVisible(false);
        lblCan2.setVisible(false);
        lblCan3.setVisible(false);
        lblCan4.setVisible(false);
        lblPrecio2.setVisible(false);
        lblPrecio3.setVisible(false);
        lblPrecio4.setVisible(false);
    }
    
    private void Limpiar()
    {
        nombres.clear();
        horas.clear();
        costos.clear();
        descuentos.clear();
        tipos.clear();
        contador1 = 1;
        contador2 = 1;
        contador3 = 1;
        contador4 = 1;
        lblIcon1.setIcon(null);
        lblNombre1.setText("");
        lblTipo1.setText("");
        lblDuracion1.setText("");
        lblPrecio1.setText("$");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        btnCita = new javax.swing.JButton();
        btnAgServicio = new javax.swing.JButton();
        lblCantTotal = new javax.swing.JLabel();
        lblDurTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblIcon1 = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        lblIcon3 = new javax.swing.JLabel();
        lblIcon4 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblTipo1 = new javax.swing.JLabel();
        lblTipo2 = new javax.swing.JLabel();
        lblTipo3 = new javax.swing.JLabel();
        lblTipo4 = new javax.swing.JLabel();
        lblDuracion1 = new javax.swing.JLabel();
        lblDuracion2 = new javax.swing.JLabel();
        lblDuracion3 = new javax.swing.JLabel();
        lblDuracion4 = new javax.swing.JLabel();
        btnUp1 = new javax.swing.JButton();
        btnUp2 = new javax.swing.JButton();
        btnUp3 = new javax.swing.JButton();
        btnUp4 = new javax.swing.JButton();
        btnDown1 = new javax.swing.JButton();
        btnDown2 = new javax.swing.JButton();
        btnDown3 = new javax.swing.JButton();
        btnDown4 = new javax.swing.JButton();
        lblCan1 = new javax.swing.JLabel();
        lblCan2 = new javax.swing.JLabel();
        lblCan3 = new javax.swing.JLabel();
        lblCan4 = new javax.swing.JLabel();
        lblPrecio1 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        lblPrecio4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(960, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 30, 30));

        btnCita.setBackground(new java.awt.Color(225, 214, 212));
        btnCita.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnCita.setForeground(new java.awt.Color(98, 88, 88));
        btnCita.setText("Concluir Cita");
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
        getContentPane().add(btnCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 210, -1));

        btnAgServicio.setBackground(new java.awt.Color(225, 214, 212));
        btnAgServicio.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnAgServicio.setForeground(new java.awt.Color(98, 88, 88));
        btnAgServicio.setText("Agregar otro Servicio");
        btnAgServicio.setFocusPainted(false);
        btnAgServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgServicioMouseClicked(evt);
            }
        });
        btnAgServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgServicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, 280, -1));

        lblCantTotal.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblCantTotal.setForeground(new java.awt.Color(98, 88, 88));
        lblCantTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantTotal.setText("$");
        getContentPane().add(lblCantTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 720, 150, 50));

        lblDurTotal.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblDurTotal.setForeground(new java.awt.Color(98, 88, 88));
        lblDurTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDurTotal.setText("00:00");
        getContentPane().add(lblDurTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 720, 150, 50));

        lblTotal.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(98, 88, 88));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("TOTAL");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 690, 150, 30));

        lblHoras.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblHoras.setForeground(new java.awt.Color(98, 88, 88));
        lblHoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoras.setText("DURACIÓN");
        getContentPane().add(lblHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, 150, 30));

        jScrollPane1.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon1.setBackground(new java.awt.Color(255, 204, 255));
        lblIcon1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblIcon1.setForeground(new java.awt.Color(98, 88, 88));
        lblIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon1.setText("Cargar Imagen");
        lblIcon1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(98, 88, 88), 2, true));
        lblIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 150));

        lblIcon2.setBackground(new java.awt.Color(255, 204, 255));
        lblIcon2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblIcon2.setForeground(new java.awt.Color(98, 88, 88));
        lblIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon2.setText("Cargar Imagen");
        lblIcon2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(98, 88, 88), 2, true));
        lblIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 150));

        lblIcon3.setBackground(new java.awt.Color(255, 204, 255));
        lblIcon3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblIcon3.setForeground(new java.awt.Color(98, 88, 88));
        lblIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon3.setText("Cargar Imagen");
        lblIcon3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(98, 88, 88), 2, true));
        lblIcon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 150, 150));

        lblIcon4.setBackground(new java.awt.Color(255, 204, 255));
        lblIcon4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblIcon4.setForeground(new java.awt.Color(98, 88, 88));
        lblIcon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon4.setText("Cargar Imagen");
        lblIcon4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(98, 88, 88), 2, true));
        lblIcon4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 150, 150));

        lblNombre1.setFont(new java.awt.Font("Consolas", 1, 38)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre1.setText("\"\"");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 450, 50));

        lblNombre2.setFont(new java.awt.Font("Consolas", 1, 38)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 450, 50));

        lblNombre3.setFont(new java.awt.Font("Consolas", 1, 38)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 450, 50));

        lblNombre4.setFont(new java.awt.Font("Consolas", 1, 38)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 450, 50));

        lblTipo1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTipo1.setForeground(new java.awt.Color(98, 88, 88));
        lblTipo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo1.setText("\"\"");
        jPanel1.add(lblTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 160, 50));

        lblTipo2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTipo2.setForeground(new java.awt.Color(98, 88, 88));
        lblTipo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 160, 50));

        lblTipo3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTipo3.setForeground(new java.awt.Color(98, 88, 88));
        lblTipo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 160, 50));

        lblTipo4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTipo4.setForeground(new java.awt.Color(98, 88, 88));
        lblTipo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, 160, 50));

        lblDuracion1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblDuracion1.setForeground(new java.awt.Color(98, 88, 88));
        lblDuracion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDuracion1.setText("\"\"");
        jPanel1.add(lblDuracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 50));

        lblDuracion2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblDuracion2.setForeground(new java.awt.Color(98, 88, 88));
        lblDuracion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblDuracion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 160, 50));

        lblDuracion3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblDuracion3.setForeground(new java.awt.Color(98, 88, 88));
        lblDuracion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblDuracion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 160, 50));

        lblDuracion4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblDuracion4.setForeground(new java.awt.Color(98, 88, 88));
        lblDuracion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblDuracion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 160, 50));

        btnUp1.setBackground(new java.awt.Color(225, 214, 212));
        btnUp1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnUp1.setForeground(new java.awt.Color(98, 88, 88));
        btnUp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Up.png"))); // NOI18N
        btnUp1.setFocusPainted(false);
        btnUp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUp1MouseClicked(evt);
            }
        });
        btnUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 70, 30));

        btnUp2.setBackground(new java.awt.Color(225, 214, 212));
        btnUp2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnUp2.setForeground(new java.awt.Color(98, 88, 88));
        btnUp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Up.png"))); // NOI18N
        btnUp2.setFocusPainted(false);
        btnUp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUp2MouseClicked(evt);
            }
        });
        btnUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 70, 30));

        btnUp3.setBackground(new java.awt.Color(225, 214, 212));
        btnUp3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnUp3.setForeground(new java.awt.Color(98, 88, 88));
        btnUp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Up.png"))); // NOI18N
        btnUp3.setFocusPainted(false);
        btnUp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUp3MouseClicked(evt);
            }
        });
        btnUp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 70, 30));

        btnUp4.setBackground(new java.awt.Color(225, 214, 212));
        btnUp4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnUp4.setForeground(new java.awt.Color(98, 88, 88));
        btnUp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Up.png"))); // NOI18N
        btnUp4.setFocusPainted(false);
        btnUp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUp4MouseClicked(evt);
            }
        });
        btnUp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 70, 30));

        btnDown1.setBackground(new java.awt.Color(225, 214, 212));
        btnDown1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnDown1.setForeground(new java.awt.Color(98, 88, 88));
        btnDown1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Down.png"))); // NOI18N
        btnDown1.setFocusPainted(false);
        btnDown1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDown1MouseClicked(evt);
            }
        });
        btnDown1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDown1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 70, 30));

        btnDown2.setBackground(new java.awt.Color(225, 214, 212));
        btnDown2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnDown2.setForeground(new java.awt.Color(98, 88, 88));
        btnDown2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Down.png"))); // NOI18N
        btnDown2.setFocusPainted(false);
        btnDown2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDown2MouseClicked(evt);
            }
        });
        btnDown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDown2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 70, 30));

        btnDown3.setBackground(new java.awt.Color(225, 214, 212));
        btnDown3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnDown3.setForeground(new java.awt.Color(98, 88, 88));
        btnDown3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Down.png"))); // NOI18N
        btnDown3.setFocusPainted(false);
        btnDown3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDown3MouseClicked(evt);
            }
        });
        btnDown3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDown3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 70, 30));

        btnDown4.setBackground(new java.awt.Color(225, 214, 212));
        btnDown4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnDown4.setForeground(new java.awt.Color(98, 88, 88));
        btnDown4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Down.png"))); // NOI18N
        btnDown4.setFocusPainted(false);
        btnDown4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDown4MouseClicked(evt);
            }
        });
        btnDown4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDown4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 720, 70, 30));

        lblCan1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCan1.setForeground(new java.awt.Color(98, 88, 88));
        lblCan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCan1.setText("1");
        jPanel1.add(lblCan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 50, 50));

        lblCan2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCan2.setForeground(new java.awt.Color(98, 88, 88));
        lblCan2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCan2.setText("1");
        jPanel1.add(lblCan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 50, 50));

        lblCan3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCan3.setForeground(new java.awt.Color(98, 88, 88));
        lblCan3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCan3.setText("1");
        jPanel1.add(lblCan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 50, 50));

        lblCan4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCan4.setForeground(new java.awt.Color(98, 88, 88));
        lblCan4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCan4.setText("1");
        jPanel1.add(lblCan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, 50, 50));

        lblPrecio1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblPrecio1.setForeground(new java.awt.Color(98, 88, 88));
        lblPrecio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio1.setText("$");
        jPanel1.add(lblPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 150, 130));

        lblPrecio2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblPrecio2.setForeground(new java.awt.Color(98, 88, 88));
        lblPrecio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio2.setText("$");
        jPanel1.add(lblPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 150, 130));

        lblPrecio3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblPrecio3.setForeground(new java.awt.Color(98, 88, 88));
        lblPrecio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio3.setText("$");
        jPanel1.add(lblPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 150, 130));

        lblPrecio4.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblPrecio4.setForeground(new java.awt.Color(98, 88, 88));
        lblPrecio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio4.setText("$");
        jPanel1.add(lblPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 150, 130));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 940, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitaMouseClicked

    }//GEN-LAST:event_btnCitaMouseClicked

    private void btnAgServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgServicioMouseClicked
        setVisible(false);
    }//GEN-LAST:event_btnAgServicioMouseClicked

    private void btnDown1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDown1MouseClicked
        
    }//GEN-LAST:event_btnDown1MouseClicked

    private void btnDown1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown1ActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(contador1 > 1)
        {
            contador1--;

            lblCan1.setText(String.valueOf(contador1));
            lblDuracion1.setText(restaHoras(lblDuracion1, 0));
            lblDurTotal.setText(convResHoras(lblDurTotal.getText(), horas.get(0)));
            lblPrecio1.setText("$" + String.valueOf(restaCostos(contador1, 0)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(0))));
        }
        else
            OptionPane.showMessage("Servicios", "Se tiene que tener seleccionado el servicio por lo menos una vez", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDown1ActionPerformed

    private void btnUp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp1MouseClicked

    }//GEN-LAST:event_btnUp1MouseClicked

    private void btnUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp1ActionPerformed
        contador1++;
        lblCan1.setText(String.valueOf(contador1));
        
        lblDuracion1.setText(sumaHoras(contador1, 0));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(0)));
        lblPrecio1.setText("$" + String.valueOf(sumaCostos(contador1, 0)));
        lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(0))));
    }//GEN-LAST:event_btnUp1ActionPerformed

    private void btnUp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp2MouseClicked

    }//GEN-LAST:event_btnUp2MouseClicked

    private void btnUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp2ActionPerformed
        contador2++;
        lblCan2.setText(String.valueOf(contador2));
        
        lblDuracion2.setText(sumaHoras(contador2, 1));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(1)));
        lblPrecio2.setText("$" + String.valueOf(sumaCostos(contador2, 1)));
        lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(1))));        
    }//GEN-LAST:event_btnUp2ActionPerformed

    private void btnUp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp3MouseClicked

    }//GEN-LAST:event_btnUp3MouseClicked

    private void btnUp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp3ActionPerformed
        contador3++;
        lblCan3.setText(String.valueOf(contador3));
        
        lblDuracion3.setText(sumaHoras(contador3, 2));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(2)));
        lblPrecio3.setText("$" + String.valueOf(sumaCostos(contador3, 2)));
        lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(2))));
    }//GEN-LAST:event_btnUp3ActionPerformed

    private void btnUp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp4MouseClicked

    }//GEN-LAST:event_btnUp4MouseClicked

    private void btnUp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp4ActionPerformed
        contador4++;
        lblCan4.setText(String.valueOf(contador4));
        
        lblDuracion4.setText(sumaHoras(contador4, 3));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(3)));
        lblPrecio4.setText("$" + String.valueOf(sumaCostos(contador4, 3)));   
        lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(3))));
    }//GEN-LAST:event_btnUp4ActionPerformed

    private void btnDown2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDown2MouseClicked
    }//GEN-LAST:event_btnDown2MouseClicked

    private void btnDown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown2ActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(contador2 > 1)
        {
            contador2--;

            lblCan2.setText(String.valueOf(contador2));
            lblDuracion2.setText(restaHoras(lblDuracion2, 1));
            lblDurTotal.setText(convResHoras(lblDurTotal.getText(), horas.get(1)));
            lblPrecio2.setText("$" + String.valueOf(restaCostos(contador2, 1)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(1))));
        }
        else
            OptionPane.showMessage("Servicios", "Se tiene que tener seleccionado el servicio por lo menos una vez", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDown2ActionPerformed

    private void btnDown3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDown3MouseClicked
    }//GEN-LAST:event_btnDown3MouseClicked

    private void btnDown3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown3ActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(contador3 > 1)
        {
            contador3--;

            lblCan3.setText(String.valueOf(contador3));
            lblDuracion3.setText(restaHoras(lblDuracion3, 2));
            lblDurTotal.setText(convResHoras(lblDurTotal.getText(), horas.get(2)));            
            lblPrecio3.setText("$" + String.valueOf(restaCostos(contador3, 2)));            
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(2))));        
        }
        else
            OptionPane.showMessage("Servicios", "Se tiene que tener seleccionado el servicio por lo menos una vez", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDown3ActionPerformed

    private void btnDown4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDown4MouseClicked
    }//GEN-LAST:event_btnDown4MouseClicked

    private void btnDown4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown4ActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(contador4 > 1)
        {
            contador4--;

            lblCan4.setText(String.valueOf(contador4));
            lblDuracion4.setText(restaHoras(lblDuracion4, 3));
            lblDurTotal.setText(convResHoras(lblDurTotal.getText(), horas.get(3)));            
            lblPrecio4.setText("$" + String.valueOf(restaCostos(contador4, 3)));            
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(3))));        
        }
        else
            OptionPane.showMessage("Servicios", "Se tiene que tener seleccionado el servicio por lo menos una vez", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDown4ActionPerformed

    private void btnAgServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgServicioActionPerformed
        
    }//GEN-LAST:event_btnAgServicioActionPerformed

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
        setVisible(false);
        cita.setDuracionCita(lblDurTotal.getText());
        cita.setNombres(nombres);
        Invisible();
        Limpiar();
        cita.setVisible(true);
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
            java.util.logging.Logger.getLogger(RealizarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RealizarCita().setVisible(true);
            }
        });
    }
    
    public String sumaHoras(int contador, int indice)
    {
        String resultado = "00:00";

        for (int i = 0; i < contador; i++) 
        {
            String hora = horas.get(indice);
            
            String[] partesHora = hora.split(":");
            int horas = Integer.parseInt(partesHora[0]);
            int minutos = Integer.parseInt(partesHora[1]);

            String[] partesResultado = resultado.split(":");
            int horasResultado = Integer.parseInt(partesResultado[0]);
            int minutosResultado = Integer.parseInt(partesResultado[1]);

            int sumaHoras = horasResultado + horas;
            int sumaMinutos = minutosResultado + minutos;

            // Manejar el acarreo de los minutos si se superan los 60
            if (sumaMinutos >= 60) 
            {
                sumaHoras += sumaMinutos / 60;
                sumaMinutos = sumaMinutos % 60;
            }

            resultado = sumaHoras + ":" + (sumaMinutos < 10 ? "0" + sumaMinutos : sumaMinutos);
        }
        return resultado;
    }
    
    public String restaHoras(JLabel lblD, int indice)
    {
        String resultado = "00:00";
        
        String horaInicial = lblD.getText();
        String horaResta = horas.get(indice);

        String[] partesHoraInicial = horaInicial.split(":");
        int horasInicial = Integer.parseInt(partesHoraInicial[0]);
        int minutosInicial = Integer.parseInt(partesHoraInicial[1]);

        String[] partesHora2 = horaResta.split(":");
        int horas2 = Integer.parseInt(partesHora2[0]);
        int minutos2 = Integer.parseInt(partesHora2[1]);

        int restaHoras = horasInicial - horas2;
        int restaMinutos = minutosInicial - minutos2;

        // Manejar el acarreo de los minutos si son negativos
        if (restaMinutos < 0) 
        {
            restaHoras--;
            restaMinutos = 60 + restaMinutos;
        }
        resultado = restaHoras + ":" + (restaMinutos < 10 ? "0" + restaMinutos : restaMinutos);
        return resultado;    
    }
    
    public double sumaCostos(int contador, int indice)
    {
        String costoInicial = costos.get(indice);
        double sumaTotal = 0.0f;

        for (int i = 0; i < contador; i++) 
        {
            String valorNumerico = costoInicial.substring(1);
            double costoDouble = Double.parseDouble(valorNumerico);
            sumaTotal += costoDouble;
        }
        return sumaTotal;
    }
    
    public double restaCostos(int contador, int indice)
    {
        String costoInicial = costos.get(indice);
        double restaTotal = 0.0f;

        for (int i = 0; i < contador; i++) 
        {
            String valorNumerico = costoInicial.substring(1);
            double costoDouble = Double.parseDouble(valorNumerico);
            restaTotal -= costoDouble;
        }
        return Math.abs(restaTotal);
    }
    
    public double convertirCostos(String costo)
    {
        String valorNumerico = costo.substring(1);
        double costoDouble = Double.parseDouble(valorNumerico);
        return costoDouble;
    }
    
    private String convSumHoras(String duracion, String horaSumar)
    {
        int horasTotal = 0;
        int minutosTotal = 0;

        String[] partesHora = duracion.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);
        horasTotal += horas;
        minutosTotal += minutos;

        String[] partesHoraAdicional = horaSumar.split(":");
        int horasAdicional = Integer.parseInt(partesHoraAdicional[0]);
        int minutosAdicional = Integer.parseInt(partesHoraAdicional[1]);

        horasTotal += horasAdicional;
        minutosTotal += minutosAdicional;

        horasTotal += minutosTotal / 60;
        minutosTotal %= 60;
        String horaTotal = String.format("%02d:%02d", horasTotal, minutosTotal);

        return horaTotal;
    }
    
    private String convResHoras(String duracion, String horaRestar)
    {
        int horasTotal = 0;
        int minutosTotal = 0;

        String[] partesHora = duracion.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);
        horasTotal += horas;
        minutosTotal += minutos;

        String[] partesHoraRestar = horaRestar.split(":");
        int horasRestar = Integer.parseInt(partesHoraRestar[0]);
        int minutosRestar = Integer.parseInt(partesHoraRestar[1]);

        horasTotal -= horasRestar;
        minutosTotal -= minutosRestar;

        if (minutosTotal < 0) 
        {
            minutosTotal += 60;
            horasTotal--;
        }
        String horaTotal = String.format("%02d:%02d", horasTotal, minutosTotal);

        return horaTotal;
    }

    public void Datos(String nombre, String dur, String tipo, String costo, int con) 
    {
        switch(con)
        {
            case 1:
                lblNombre1.setText(nombre);
                lblDuracion1.setText(dur);
                lblTipo1.setText(tipo);
                lblPrecio1.setText(costo);
                lblCantTotal.setText(costo);
                lblDurTotal.setText(dur);
                break;
            case 2:
                lblIcon2.setVisible(true);
                lblNombre2.setVisible(true);
                lblNombre2.setText(nombre);
                lblDuracion2.setVisible(true);
                lblDuracion2.setText(dur);
                lblTipo2.setVisible(true);
                lblTipo2.setText(tipo);
                btnUp2.setVisible(true);
                btnDown2.setVisible(true);
                lblCan2.setVisible(true);
                lblPrecio2.setVisible(true);
                lblPrecio2.setText(costo);
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));
                System.out.print(lblDurTotal.getText());
                break;
            case 3:
                lblIcon3.setVisible(true);
                lblNombre3.setVisible(true);
                lblNombre3.setText(nombre);
                lblDuracion3.setVisible(true);
                lblDuracion3.setText(dur);
                lblTipo3.setVisible(true);
                lblTipo3.setText(tipo);
                btnUp3.setVisible(true);
                btnDown3.setVisible(true);
                lblCan3.setVisible(true);
                lblPrecio3.setVisible(true);
                lblPrecio3.setText(costo);
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));
                break;
            case 4:
                lblIcon4.setVisible(true);
                lblNombre4.setVisible(true);
                lblNombre4.setText(nombre);
                lblDuracion4.setVisible(true);
                lblDuracion4.setText(dur);
                lblTipo4.setVisible(true);
                lblTipo4.setText(tipo);
                btnUp4.setVisible(true);
                btnDown4.setVisible(true);
                lblCan4.setVisible(true);
                lblPrecio4.setVisible(true);
                lblPrecio4.setText(costo);
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));                
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));                
                break;
            default:
                break;
        }
    }

    public Vector<String> getNombres() 
    {
        return nombres;
    }

    public void setNombres(Vector<String> nombres) 
    {
        this.nombres = nombres;
    }

    public Vector<String> getHoras() 
    {
        return horas;
    }

    public void setHoras(Vector<String> horas) 
    {
        this.horas = horas;
    }

    public Vector<String> getCostos() 
    {
        return costos;
    }

    public void setCostos(Vector<String> costos) 
    {
        this.costos = costos;
    }

    public Vector<String> getDescuentos() 
    {
        return descuentos;
    }

    public void setDescuentos(Vector<String> descuentos) 
    {
        this.descuentos = descuentos;
    }

    public Vector<String> getTipos() 
    {
        return tipos;
    }

    public void setTipos(Vector<String> tipos) 
    {
        this.tipos = tipos;
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
    private javax.swing.JButton btnAgServicio;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnDown1;
    private javax.swing.JButton btnDown2;
    private javax.swing.JButton btnDown3;
    private javax.swing.JButton btnDown4;
    private javax.swing.JButton btnUp1;
    private javax.swing.JButton btnUp2;
    private javax.swing.JButton btnUp3;
    private javax.swing.JButton btnUp4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCan1;
    private javax.swing.JLabel lblCan2;
    private javax.swing.JLabel lblCan3;
    private javax.swing.JLabel lblCan4;
    private javax.swing.JLabel lblCantTotal;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDurTotal;
    private javax.swing.JLabel lblDuracion1;
    private javax.swing.JLabel lblDuracion2;
    private javax.swing.JLabel lblDuracion3;
    private javax.swing.JLabel lblDuracion4;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrecio4;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JLabel lblTipo2;
    private javax.swing.JLabel lblTipo3;
    private javax.swing.JLabel lblTipo4;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
