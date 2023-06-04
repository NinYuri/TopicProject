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
    
    int conGeneral = 0;
    int contador1 = 1;
    int contador2 = 1;
    int contador3 = 1;
    int contador4 = 1;
    int contador5 = 1;
    int contador6 = 1;
    int contador7 = 1;
    
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
        contador5 = 1;
        contador6 = 1;
        contador7 = 1;
        lblIcon1.setIcon(null);
        lblNombre1.setText("");
        lblTipo1.setText("");
        lblDuracion1.setText("");
        lblPrecio1.setText("$");
        lblDurTotal.setText("00:00");
        lblCantTotal.setText("$");
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
        C1 = new fondos.RoundPanel();
        lblDesc1 = new javax.swing.JLabel();
        C2 = new fondos.RoundPanel();
        lblDesc2 = new javax.swing.JLabel();
        C3 = new fondos.RoundPanel();
        lblDesc3 = new javax.swing.JLabel();
        C4 = new fondos.RoundPanel();
        lblDesc4 = new javax.swing.JLabel();
        C5 = new fondos.RoundPanel();
        lblDesc5 = new javax.swing.JLabel();
        C6 = new fondos.RoundPanel();
        lblDesc6 = new javax.swing.JLabel();
        C7 = new fondos.RoundPanel();
        lblDesc7 = new javax.swing.JLabel();
        lblIcon1 = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        lblIcon3 = new javax.swing.JLabel();
        lblIcon4 = new javax.swing.JLabel();
        lblIcon5 = new javax.swing.JLabel();
        lblIcon6 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();
        lblNombre6 = new javax.swing.JLabel();
        lblTipo1 = new javax.swing.JLabel();
        lblTipo2 = new javax.swing.JLabel();
        lblTipo3 = new javax.swing.JLabel();
        lblTipo4 = new javax.swing.JLabel();
        lblTipo5 = new javax.swing.JLabel();
        lblTipo6 = new javax.swing.JLabel();
        lblDuracion1 = new javax.swing.JLabel();
        lblDuracion2 = new javax.swing.JLabel();
        lblDuracion3 = new javax.swing.JLabel();
        lblDuracion4 = new javax.swing.JLabel();
        lblDuracion5 = new javax.swing.JLabel();
        lblDuracion6 = new javax.swing.JLabel();
        btnUp1 = new javax.swing.JButton();
        btnUp2 = new javax.swing.JButton();
        btnUp3 = new javax.swing.JButton();
        btnUp4 = new javax.swing.JButton();
        btnUp5 = new javax.swing.JButton();
        btnUp6 = new javax.swing.JButton();
        btnDown1 = new javax.swing.JButton();
        btnDown2 = new javax.swing.JButton();
        btnDown3 = new javax.swing.JButton();
        btnDown4 = new javax.swing.JButton();
        btnDown5 = new javax.swing.JButton();
        btnDown6 = new javax.swing.JButton();
        lblCan1 = new javax.swing.JLabel();
        lblCan2 = new javax.swing.JLabel();
        lblCan3 = new javax.swing.JLabel();
        lblCan4 = new javax.swing.JLabel();
        lblCan5 = new javax.swing.JLabel();
        lblCan6 = new javax.swing.JLabel();
        lblPrecio1 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        lblPrecio4 = new javax.swing.JLabel();
        lblPrecio5 = new javax.swing.JLabel();
        lblPrecio6 = new javax.swing.JLabel();
        lblIcon7 = new javax.swing.JLabel();
        lblNombre7 = new javax.swing.JLabel();
        btnUp7 = new javax.swing.JButton();
        lblPrecio7 = new javax.swing.JLabel();
        lblDuracion7 = new javax.swing.JLabel();
        lblTipo7 = new javax.swing.JLabel();
        lblCan7 = new javax.swing.JLabel();
        btnDown7 = new javax.swing.JButton();

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

        C1.setBackground(new java.awt.Color(98, 88, 88));
        C1.setRoundBottomLeft(100);
        C1.setRoundBottomRight(100);
        C1.setRoundTopLeft(100);
        C1.setRoundTopRight(100);

        lblDesc1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblDesc1.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc1.setText("%");

        javax.swing.GroupLayout C1Layout = new javax.swing.GroupLayout(C1);
        C1.setLayout(C1Layout);
        C1Layout.setHorizontalGroup(
            C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        C1Layout.setVerticalGroup(
            C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblDesc1)
                .addGap(14, 14, 14))
        );

        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 90, 80));

        C2.setBackground(new java.awt.Color(98, 88, 88));
        C2.setRoundBottomLeft(100);
        C2.setRoundBottomRight(100);
        C2.setRoundTopLeft(100);
        C2.setRoundTopRight(100);

        lblDesc2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblDesc2.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc2.setText("%");

        javax.swing.GroupLayout C2Layout = new javax.swing.GroupLayout(C2);
        C2.setLayout(C2Layout);
        C2Layout.setHorizontalGroup(
            C2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesc2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        C2Layout.setVerticalGroup(
            C2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblDesc2)
                .addGap(14, 14, 14))
        );

        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 90, 80));

        C3.setBackground(new java.awt.Color(98, 88, 88));
        C3.setRoundBottomLeft(100);
        C3.setRoundBottomRight(100);
        C3.setRoundTopLeft(100);
        C3.setRoundTopRight(100);

        lblDesc3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblDesc3.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc3.setText("%");

        javax.swing.GroupLayout C3Layout = new javax.swing.GroupLayout(C3);
        C3.setLayout(C3Layout);
        C3Layout.setHorizontalGroup(
            C3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesc3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        C3Layout.setVerticalGroup(
            C3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblDesc3)
                .addGap(14, 14, 14))
        );

        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 90, 80));

        C4.setBackground(new java.awt.Color(98, 88, 88));
        C4.setRoundBottomLeft(100);
        C4.setRoundBottomRight(100);
        C4.setRoundTopLeft(100);
        C4.setRoundTopRight(100);

        lblDesc4.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblDesc4.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc4.setText("%");

        javax.swing.GroupLayout C4Layout = new javax.swing.GroupLayout(C4);
        C4.setLayout(C4Layout);
        C4Layout.setHorizontalGroup(
            C4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesc4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        C4Layout.setVerticalGroup(
            C4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblDesc4)
                .addGap(14, 14, 14))
        );

        jPanel1.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 90, 80));

        C5.setBackground(new java.awt.Color(98, 88, 88));
        C5.setRoundBottomLeft(100);
        C5.setRoundBottomRight(100);
        C5.setRoundTopLeft(100);
        C5.setRoundTopRight(100);

        lblDesc5.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblDesc5.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc5.setText("%");

        javax.swing.GroupLayout C5Layout = new javax.swing.GroupLayout(C5);
        C5.setLayout(C5Layout);
        C5Layout.setHorizontalGroup(
            C5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesc5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        C5Layout.setVerticalGroup(
            C5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblDesc5)
                .addGap(14, 14, 14))
        );

        jPanel1.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 770, 90, 80));

        C6.setBackground(new java.awt.Color(98, 88, 88));
        C6.setRoundBottomLeft(100);
        C6.setRoundBottomRight(100);
        C6.setRoundTopLeft(100);
        C6.setRoundTopRight(100);

        lblDesc6.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblDesc6.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc6.setText("%");

        javax.swing.GroupLayout C6Layout = new javax.swing.GroupLayout(C6);
        C6.setLayout(C6Layout);
        C6Layout.setHorizontalGroup(
            C6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesc6, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        C6Layout.setVerticalGroup(
            C6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C6Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblDesc6)
                .addGap(14, 14, 14))
        );

        jPanel1.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 960, 90, 80));

        C7.setBackground(new java.awt.Color(98, 88, 88));
        C7.setRoundBottomLeft(100);
        C7.setRoundBottomRight(100);
        C7.setRoundTopLeft(100);
        C7.setRoundTopRight(100);

        lblDesc7.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblDesc7.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc7.setText("%");

        javax.swing.GroupLayout C7Layout = new javax.swing.GroupLayout(C7);
        C7.setLayout(C7Layout);
        C7Layout.setHorizontalGroup(
            C7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesc7, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        C7Layout.setVerticalGroup(
            C7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, C7Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblDesc7)
                .addGap(14, 14, 14))
        );

        jPanel1.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1150, 90, 80));

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

        lblIcon5.setBackground(new java.awt.Color(255, 204, 255));
        lblIcon5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblIcon5.setForeground(new java.awt.Color(98, 88, 88));
        lblIcon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon5.setText("Cargar Imagen");
        lblIcon5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(98, 88, 88), 2, true));
        lblIcon5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 150, 150));

        lblIcon6.setBackground(new java.awt.Color(255, 204, 255));
        lblIcon6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblIcon6.setForeground(new java.awt.Color(98, 88, 88));
        lblIcon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon6.setText("Cargar Imagen");
        lblIcon6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(98, 88, 88), 2, true));
        lblIcon6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblIcon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 990, 150, 150));

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

        lblNombre5.setFont(new java.awt.Font("Consolas", 1, 38)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 810, 450, 50));

        lblNombre6.setFont(new java.awt.Font("Consolas", 1, 38)); // NOI18N
        lblNombre6.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1000, 450, 50));

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

        lblTipo5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTipo5.setForeground(new java.awt.Color(98, 88, 88));
        lblTipo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTipo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 870, 160, 50));

        lblTipo6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTipo6.setForeground(new java.awt.Color(98, 88, 88));
        lblTipo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTipo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1060, 160, 50));

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

        lblDuracion5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblDuracion5.setForeground(new java.awt.Color(98, 88, 88));
        lblDuracion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblDuracion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 870, 160, 50));

        lblDuracion6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblDuracion6.setForeground(new java.awt.Color(98, 88, 88));
        lblDuracion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblDuracion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1060, 160, 50));

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

        btnUp5.setBackground(new java.awt.Color(225, 214, 212));
        btnUp5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnUp5.setForeground(new java.awt.Color(98, 88, 88));
        btnUp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Up.png"))); // NOI18N
        btnUp5.setFocusPainted(false);
        btnUp5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUp5MouseClicked(evt);
            }
        });
        btnUp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 810, 70, 30));

        btnUp6.setBackground(new java.awt.Color(225, 214, 212));
        btnUp6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnUp6.setForeground(new java.awt.Color(98, 88, 88));
        btnUp6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Up.png"))); // NOI18N
        btnUp6.setFocusPainted(false);
        btnUp6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUp6MouseClicked(evt);
            }
        });
        btnUp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1000, 70, 30));

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

        btnDown5.setBackground(new java.awt.Color(225, 214, 212));
        btnDown5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnDown5.setForeground(new java.awt.Color(98, 88, 88));
        btnDown5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Down.png"))); // NOI18N
        btnDown5.setFocusPainted(false);
        btnDown5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDown5MouseClicked(evt);
            }
        });
        btnDown5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDown5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 910, 70, 30));

        btnDown6.setBackground(new java.awt.Color(225, 214, 212));
        btnDown6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnDown6.setForeground(new java.awt.Color(98, 88, 88));
        btnDown6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Down.png"))); // NOI18N
        btnDown6.setFocusPainted(false);
        btnDown6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDown6MouseClicked(evt);
            }
        });
        btnDown6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDown6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1100, 70, 30));

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

        lblCan5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCan5.setForeground(new java.awt.Color(98, 88, 88));
        lblCan5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCan5.setText("1");
        jPanel1.add(lblCan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 850, 50, 50));

        lblCan6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCan6.setForeground(new java.awt.Color(98, 88, 88));
        lblCan6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCan6.setText("1");
        jPanel1.add(lblCan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 1040, 50, 50));

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

        lblPrecio5.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblPrecio5.setForeground(new java.awt.Color(98, 88, 88));
        lblPrecio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio5.setText("$");
        jPanel1.add(lblPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 810, 150, 130));

        lblPrecio6.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblPrecio6.setForeground(new java.awt.Color(98, 88, 88));
        lblPrecio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio6.setText("$");
        jPanel1.add(lblPrecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1000, 150, 130));

        lblIcon7.setBackground(new java.awt.Color(255, 204, 255));
        lblIcon7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblIcon7.setForeground(new java.awt.Color(98, 88, 88));
        lblIcon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon7.setText("Cargar Imagen");
        lblIcon7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(98, 88, 88), 2, true));
        lblIcon7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblIcon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1180, 150, 150));

        lblNombre7.setFont(new java.awt.Font("Consolas", 1, 38)); // NOI18N
        lblNombre7.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1190, 450, 50));

        btnUp7.setBackground(new java.awt.Color(225, 214, 212));
        btnUp7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnUp7.setForeground(new java.awt.Color(98, 88, 88));
        btnUp7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Up.png"))); // NOI18N
        btnUp7.setFocusPainted(false);
        btnUp7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUp7MouseClicked(evt);
            }
        });
        btnUp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1190, 70, 30));

        lblPrecio7.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblPrecio7.setForeground(new java.awt.Color(98, 88, 88));
        lblPrecio7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio7.setText("$");
        jPanel1.add(lblPrecio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1190, 150, 130));

        lblDuracion7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblDuracion7.setForeground(new java.awt.Color(98, 88, 88));
        lblDuracion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblDuracion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1250, 160, 50));

        lblTipo7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTipo7.setForeground(new java.awt.Color(98, 88, 88));
        lblTipo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTipo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1250, 160, 50));

        lblCan7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCan7.setForeground(new java.awt.Color(98, 88, 88));
        lblCan7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCan7.setText("1");
        jPanel1.add(lblCan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 1230, 50, 50));

        btnDown7.setBackground(new java.awt.Color(225, 214, 212));
        btnDown7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnDown7.setForeground(new java.awt.Color(98, 88, 88));
        btnDown7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/Down.png"))); // NOI18N
        btnDown7.setFocusPainted(false);
        btnDown7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDown7MouseClicked(evt);
            }
        });
        btnDown7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDown7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1290, 70, 30));

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
            
            if(descuentos.get(0).equals("0%"))
            {
                lblPrecio1.setText("$" + String.valueOf(restaCostos(contador1, 0)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(0))));
            }
            else
            {
                double por = Porcentaje(descuentos.get(0));
                double precio = convertirCostos(costos.get(0));
                double cantidad = precio - (por*precio);
                lblPrecio1.setText("$" + String.valueOf(restaCostDescuento(contador1, cantidad)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - cantidad));
            }
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
        
        if(descuentos.get(0).equals("0%"))
        {
            lblPrecio1.setText("$" + String.valueOf(sumaCostos(contador1, 0)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(0))));
        }
        else
        {
            double por = Porcentaje(descuentos.get(0));
            double precio = convertirCostos(costos.get(0));
            double cantidad = precio - (por*precio);
            lblPrecio1.setText("$" + String.valueOf(sumaCostDescuento(contador1, cantidad)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));            
        }
    }//GEN-LAST:event_btnUp1ActionPerformed

    private void btnUp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp2MouseClicked

    }//GEN-LAST:event_btnUp2MouseClicked

    private void btnUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp2ActionPerformed
        contador2++;
        lblCan2.setText(String.valueOf(contador2));
        
        lblDuracion2.setText(sumaHoras(contador2, 1));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(1)));
        
        if(descuentos.get(1).equals("0%"))
        {
            lblPrecio2.setText("$" + String.valueOf(sumaCostos(contador2, 1)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(1))));
        }
        else
        {
            double por = Porcentaje(descuentos.get(1));
            double precio = convertirCostos(costos.get(1));
            double cantidad = precio - (por*precio);
            lblPrecio2.setText("$" + String.valueOf(restaCostDescuento(contador2, cantidad)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));            
        }
    }//GEN-LAST:event_btnUp2ActionPerformed

    private void btnUp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp3MouseClicked

    }//GEN-LAST:event_btnUp3MouseClicked

    private void btnUp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp3ActionPerformed
        contador3++;
        lblCan3.setText(String.valueOf(contador3));
        
        lblDuracion3.setText(sumaHoras(contador3, 2));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(2)));
        
        if(descuentos.get(2).equals("0%"))
        {
            lblPrecio3.setText("$" + String.valueOf(sumaCostos(contador3, 2)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(2))));
        }
        else
        {
            double por = Porcentaje(descuentos.get(2));
            double precio = convertirCostos(costos.get(2));
            double cantidad = precio - (por*precio);
            lblPrecio3.setText("$" + String.valueOf(sumaCostDescuento(contador3, cantidad)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));
        }
    }//GEN-LAST:event_btnUp3ActionPerformed

    private void btnUp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp4MouseClicked

    }//GEN-LAST:event_btnUp4MouseClicked

    private void btnUp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp4ActionPerformed
        contador4++;
        lblCan4.setText(String.valueOf(contador4));
        
        lblDuracion4.setText(sumaHoras(contador4, 3));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(3)));
        
        if(descuentos.get(3).equals("0%"))
        {
            lblPrecio4.setText("$" + String.valueOf(sumaCostos(contador4, 3)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(3))));
        }
        else
        {
            double por = Porcentaje(descuentos.get(3));
            double precio = convertirCostos(costos.get(3));
            double cantidad = precio - (por*precio);
            lblPrecio4.setText("$" + String.valueOf(sumaCostDescuento(contador4, cantidad)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));            
        }
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
            
            if(descuentos.get(1).equals("0%"))
            {
                lblPrecio2.setText("$" + String.valueOf(restaCostos(contador2, 1)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(1))));
            }
            else
            {
                double por = Porcentaje(descuentos.get(1));
                double precio = convertirCostos(costos.get(1));
                double cantidad = precio - (por*precio);
                lblPrecio2.setText("$" + String.valueOf(restaCostDescuento(contador2, cantidad)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - cantidad));
            }
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
            
            if(descuentos.get(2).equals("0%"))
            {
                lblPrecio3.setText("$" + String.valueOf(restaCostos(contador3, 2)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(2))));
            }
            else
            {
                double por = Porcentaje(descuentos.get(2));
                double precio = convertirCostos(costos.get(2));
                double cantidad = precio - (por*precio);
                lblPrecio3.setText("$" + String.valueOf(restaCostDescuento(contador3, cantidad)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - cantidad));
            }
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
            
            if(descuentos.get(3).equals("0%"))
            {
                lblPrecio4.setText("$" + String.valueOf(restaCostos(contador4, 3)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(3))));
            }
            else
            {
                double por = Porcentaje(descuentos.get(3));
                double precio = convertirCostos(costos.get(3));
                double cantidad = precio - (por*precio);
                lblPrecio4.setText("$" + String.valueOf(restaCostDescuento(contador4, cantidad)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - cantidad));
            }
        }
        else
            OptionPane.showMessage("Servicios", "Se tiene que tener seleccionado el servicio por lo menos una vez", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDown4ActionPerformed

    private void btnAgServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgServicioActionPerformed
        
    }//GEN-LAST:event_btnAgServicioActionPerformed

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
        String valorSinDolar = lblCantTotal.getText().replace("$", "");
        double costo = Double.parseDouble(valorSinDolar);
        setVisible(false);
        cita.setDuracionCita(lblDurTotal.getText());
        cita.setNombres(nombres);        
        cita.setMontoCita(costo);
        Invisible();
        Limpiar();
        Revisar();
        cita.setVisible(true);
    }//GEN-LAST:event_btnCitaActionPerformed

    private void btnUp5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp5MouseClicked
    }//GEN-LAST:event_btnUp5MouseClicked

    private void btnUp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp5ActionPerformed
        contador5++;
        lblCan5.setText(String.valueOf(contador5));
        
        lblDuracion5.setText(sumaHoras(contador5, 4));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(4)));
        
        if(descuentos.get(4).equals("0%"))
        {
            lblPrecio5.setText("$" + String.valueOf(sumaCostos(contador5, 4)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(4))));
        }
        else
        {
            double por = Porcentaje(descuentos.get(4));
            double precio = convertirCostos(costos.get(4));
            double cantidad = precio - (por*precio);
            lblPrecio5.setText("$" + String.valueOf(sumaCostDescuento(contador5, cantidad)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));            
        }
    }//GEN-LAST:event_btnUp5ActionPerformed

    private void btnDown5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDown5MouseClicked
    }//GEN-LAST:event_btnDown5MouseClicked

    private void btnDown5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown5ActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(contador5 > 1)
        {
            contador5--;

            lblCan5.setText(String.valueOf(contador5));
            lblDuracion5.setText(restaHoras(lblDuracion5, 4));
            lblDurTotal.setText(convResHoras(lblDurTotal.getText(), horas.get(4)));
            
            if(descuentos.get(4).equals("0%"))
            {
                lblPrecio5.setText("$" + String.valueOf(restaCostos(contador5, 4)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(4))));
            }
            else
            {
                double por = Porcentaje(descuentos.get(4));
                double precio = convertirCostos(costos.get(4));
                double cantidad = precio - (por*precio);
                lblPrecio5.setText("$" + String.valueOf(restaCostDescuento(contador5, cantidad)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - cantidad));
            }
        }
        else
            OptionPane.showMessage("Servicios", "Se tiene que tener seleccionado el servicio por lo menos una vez", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDown5ActionPerformed

    private void btnUp6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp6MouseClicked
    }//GEN-LAST:event_btnUp6MouseClicked

    private void btnUp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp6ActionPerformed
        contador6++;
        lblCan6.setText(String.valueOf(contador6));
        
        lblDuracion6.setText(sumaHoras(contador6, 5));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(5)));
        
        if(descuentos.get(5).equals("0%"))
        {
            lblPrecio6.setText("$" + String.valueOf(sumaCostos(contador6, 5)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(5))));
        }
        else
        {
            double por = Porcentaje(descuentos.get(5));
            double precio = convertirCostos(costos.get(5));
            double cantidad = precio - (por*precio);
            lblPrecio6.setText("$" + String.valueOf(sumaCostDescuento(contador6, cantidad)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));            
        }
    }//GEN-LAST:event_btnUp6ActionPerformed

    private void btnDown6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDown6MouseClicked
    }//GEN-LAST:event_btnDown6MouseClicked

    private void btnDown6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown6ActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(contador6 > 1)
        {
            contador6--;

            lblCan6.setText(String.valueOf(contador6));
            lblDuracion6.setText(restaHoras(lblDuracion6, 5));
            lblDurTotal.setText(convResHoras(lblDurTotal.getText(), horas.get(5)));
            
            if(descuentos.get(5).equals("0%"))
            {
                lblPrecio6.setText("$" + String.valueOf(restaCostos(contador6, 5)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(5))));
            }
            else
            {
                double por = Porcentaje(descuentos.get(5));
                double precio = convertirCostos(costos.get(5));
                double cantidad = precio - (por*precio);
                lblPrecio6.setText("$" + String.valueOf(restaCostDescuento(contador6, cantidad)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - cantidad));
            }
        }
        else
            OptionPane.showMessage("Servicios", "Se tiene que tener seleccionado el servicio por lo menos una vez", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDown6ActionPerformed

    private void btnUp7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUp7MouseClicked
    }//GEN-LAST:event_btnUp7MouseClicked

    private void btnUp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp7ActionPerformed
        contador7++;
        lblCan7.setText(String.valueOf(contador7));
        
        lblDuracion7.setText(sumaHoras(contador7, 6));
        lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), horas.get(6)));
        
        if(descuentos.get(6).equals("0%"))
        {
            lblPrecio7.setText("$" + String.valueOf(sumaCostos(contador7, 6)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costos.get(6))));
        }
        else
        {
            double por = Porcentaje(descuentos.get(6));
            double precio = convertirCostos(costos.get(6));
            double cantidad = precio - (por*precio);
            lblPrecio7.setText("$" + String.valueOf(sumaCostDescuento(contador7, cantidad)));
            lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));            
        }
    }//GEN-LAST:event_btnUp7ActionPerformed

    private void btnDown7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDown7MouseClicked
    }//GEN-LAST:event_btnDown7MouseClicked

    private void btnDown7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown7ActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(contador7 > 1)
        {
            contador7--;

            lblCan7.setText(String.valueOf(contador7));
            lblDuracion7.setText(restaHoras(lblDuracion7, 6));
            lblDurTotal.setText(convResHoras(lblDurTotal.getText(), horas.get(6)));
            
            if(descuentos.get(6).equals("0%"))
            {
                lblPrecio7.setText("$" + String.valueOf(restaCostos(contador7, 6)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - convertirCostos(costos.get(6))));
            }
            else
            {
                double por = Porcentaje(descuentos.get(6));
                double precio = convertirCostos(costos.get(6));
                double cantidad = precio - (por*precio);
                lblPrecio7.setText("$" + String.valueOf(restaCostDescuento(contador7, cantidad)));
                lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) - cantidad));
            }
        }
        else
            OptionPane.showMessage("Servicios", "Se tiene que tener seleccionado el servicio por lo menos una vez", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDown7ActionPerformed

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
    
    public double Porcentaje(String porc)
    {
        int intpor = Integer.parseInt(porc.replace("%", ""));
        double porcentaje = (double)intpor/100;
        return porcentaje;
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
    
    public double sumaCostDescuento(int contador, double can)
    {
        double valorInicial = can;
        double restaTotal = 0.0f;

        for (int i = 0; i < contador; i++) 
        {
            restaTotal += valorInicial;
        }
        return Math.abs(restaTotal);
    }
    
    public double restaCostDescuento(int contador, double can)
    {
        double valorInicial = can;
        double restaTotal = 0.0f;

        for (int i = 0; i < contador; i++) 
        {
            restaTotal -= valorInicial;
        }
        return Math.abs(restaTotal);
    }
    
    public double convertirCostos(String costo)
    {
        String valorNumerico = costo.substring(1);
        if(!valorNumerico.isEmpty())
        {
            double costoDouble = Double.parseDouble(valorNumerico);
            return costoDouble;
        }
        else
            return 0;
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
    
    public void Contador()
    {
        conGeneral++;
    }
    
    public void Revisar()
    {
        conGeneral = 0;
    }

    public void Datos(String nombre, String dur, String tipo, String costo) 
    {
        switch(conGeneral)
        {
            case 1:
                lblNombre1.setText(nombre);
                lblDuracion1.setText(dur);
                lblTipo1.setText(tipo);
                lblDurTotal.setText(dur);
                if(!descuentos.get(0).equals("0%"))
                {
                    C1.setVisible(true);
                    lblDesc1.setText(descuentos.get(0));
                    double por = Porcentaje(descuentos.get(0));
                    double precio = convertirCostos(costos.get(0));
                    double cantidad = precio - (por*precio);
                    lblPrecio1.setText("$" + cantidad);
                    lblCantTotal.setText("$" + cantidad);
                }
                else
                {
                    lblPrecio1.setText(costo);
                    lblCantTotal.setText(costo);                    
                }    
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
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));
                lblPrecio2.setVisible(true);
                if(!descuentos.get(1).equals("0%"))
                {
                    C2.setVisible(true);
                    lblDesc2.setText(descuentos.get(1));
                    double por = Porcentaje(descuentos.get(1));
                    double precio = convertirCostos(costos.get(1));
                    double cantidad = precio - (por*precio);
                    lblPrecio2.setText("$" + cantidad);                    
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));
                }
                else
                {
                    lblPrecio2.setText(costo);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));
                } 
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
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));                
                lblPrecio3.setVisible(true);
                if(!descuentos.get(2).equals("0%"))
                {
                    C3.setVisible(true);
                    lblDesc3.setText(descuentos.get(2));
                    double por = Porcentaje(descuentos.get(2));
                    double precio = convertirCostos(costos.get(2));
                    double cantidad = precio - (por*precio);
                    lblPrecio3.setText("$" + cantidad);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));
                }
                else
                {
                    lblPrecio3.setText(costo);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));
                } 
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
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));                                
                lblPrecio4.setVisible(true);
                if(!descuentos.get(3).equals("0%"))
                {
                    C4.setVisible(true);
                    lblDesc4.setText(descuentos.get(3));
                    double por = Porcentaje(descuentos.get(3));
                    double precio = convertirCostos(costos.get(3));
                    double cantidad = precio - (por*precio);
                    lblPrecio4.setText("$" + cantidad);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));
                }
                else
                {
                    lblPrecio4.setText(costo);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));
                } 
                break;
            case 5:   
                lblIcon5.setVisible(true);
                lblNombre5.setVisible(true);
                lblNombre5.setText(nombre);
                lblDuracion5.setVisible(true);
                lblDuracion5.setText(dur);
                lblTipo5.setVisible(true);
                lblTipo5.setText(tipo);
                btnUp5.setVisible(true);
                btnDown5.setVisible(true);
                lblCan5.setVisible(true);
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));                                
                lblPrecio5.setVisible(true);
                if(!descuentos.get(4).equals("0%"))
                {
                    C5.setVisible(true);
                    lblDesc5.setText(descuentos.get(4));
                    double por = Porcentaje(descuentos.get(4));
                    double precio = convertirCostos(costos.get(4));
                    double cantidad = precio - (por*precio);
                    lblPrecio5.setText("$" + cantidad);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));
                }
                else
                {
                    lblPrecio5.setText(costo);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));
                } 
                break;
            case 6:   
                lblIcon6.setVisible(true);
                lblNombre6.setVisible(true);
                lblNombre6.setText(nombre);
                lblDuracion6.setVisible(true);
                lblDuracion6.setText(dur);
                lblTipo6.setVisible(true);
                lblTipo6.setText(tipo);
                btnUp6.setVisible(true);
                btnDown6.setVisible(true);
                lblCan6.setVisible(true);
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));                                
                lblPrecio6.setVisible(true);
                if(!descuentos.get(5).equals("0%"))
                {
                    C6.setVisible(true);
                    lblDesc6.setText(descuentos.get(5));
                    double por = Porcentaje(descuentos.get(5));
                    double precio = convertirCostos(costos.get(5));
                    double cantidad = precio - (por*precio);
                    lblPrecio6.setText("$" + cantidad);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));
                }
                else
                {
                    lblPrecio6.setText(costo);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));
                } 
                break;
            case 7:   
                lblIcon7.setVisible(true);
                lblNombre7.setVisible(true);
                lblNombre7.setText(nombre);
                lblDuracion7.setVisible(true);
                lblDuracion7.setText(dur);
                lblTipo7.setVisible(true);
                lblTipo7.setText(tipo);
                btnUp7.setVisible(true);
                btnDown7.setVisible(true);
                lblCan7.setVisible(true);
                lblDurTotal.setText(convSumHoras(lblDurTotal.getText(), dur));                                
                lblPrecio7.setVisible(true);
                if(!descuentos.get(6).equals("0%"))
                {
                    C7.setVisible(true);
                    lblDesc7.setText(descuentos.get(6));
                    double por = Porcentaje(descuentos.get(6));
                    double precio = convertirCostos(costos.get(6));
                    double cantidad = precio - (por*precio);
                    lblPrecio7.setText("$" + cantidad);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + cantidad));
                }
                else
                {
                    lblPrecio7.setText(costo);
                    lblCantTotal.setText("$" + String.valueOf(convertirCostos(lblCantTotal.getText()) + convertirCostos(costo)));
                } 
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
    
    private void Invisible()
    {
        C1.setVisible(false);
        C2.setVisible(false);
        C3.setVisible(false);
        C4.setVisible(false);
        C5.setVisible(false);
        C6.setVisible(false);
        C7.setVisible(false);
        lblIcon2.setVisible(false);
        lblIcon3.setVisible(false);
        lblIcon4.setVisible(false);
        lblIcon5.setVisible(false);
        lblIcon6.setVisible(false);
        lblIcon7.setVisible(false);
        lblNombre2.setVisible(false);
        lblNombre3.setVisible(false);
        lblNombre4.setVisible(false);
        lblNombre5.setVisible(false);
        lblNombre6.setVisible(false);
        lblNombre7.setVisible(false);
        lblTipo2.setVisible(false);
        lblTipo3.setVisible(false);
        lblTipo4.setVisible(false);
        lblTipo5.setVisible(false);
        lblTipo6.setVisible(false);
        lblTipo7.setVisible(false);
        lblDuracion2.setVisible(false);
        lblDuracion3.setVisible(false);
        lblDuracion4.setVisible(false);
        lblDuracion5.setVisible(false);
        lblDuracion6.setVisible(false);
        lblDuracion7.setVisible(false);
        btnUp2.setVisible(false);
        btnUp3.setVisible(false);
        btnUp4.setVisible(false);
        btnUp5.setVisible(false);
        btnUp6.setVisible(false);
        btnUp7.setVisible(false);
        btnDown2.setVisible(false);
        btnDown3.setVisible(false);
        btnDown4.setVisible(false);
        btnDown5.setVisible(false);
        btnDown6.setVisible(false);
        btnDown7.setVisible(false);
        lblCan2.setVisible(false);
        lblCan3.setVisible(false);
        lblCan4.setVisible(false);
        lblCan5.setVisible(false);
        lblCan6.setVisible(false);
        lblCan7.setVisible(false);
        lblPrecio2.setVisible(false);
        lblPrecio3.setVisible(false);
        lblPrecio4.setVisible(false);
        lblPrecio5.setVisible(false);
        lblPrecio6.setVisible(false);
        lblPrecio7.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fondos.RoundPanel C1;
    private fondos.RoundPanel C2;
    private fondos.RoundPanel C3;
    private fondos.RoundPanel C4;
    private fondos.RoundPanel C5;
    private fondos.RoundPanel C6;
    private fondos.RoundPanel C7;
    private javax.swing.JButton btnAgServicio;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnDown1;
    private javax.swing.JButton btnDown2;
    private javax.swing.JButton btnDown3;
    private javax.swing.JButton btnDown4;
    private javax.swing.JButton btnDown5;
    private javax.swing.JButton btnDown6;
    private javax.swing.JButton btnDown7;
    private javax.swing.JButton btnUp1;
    private javax.swing.JButton btnUp2;
    private javax.swing.JButton btnUp3;
    private javax.swing.JButton btnUp4;
    private javax.swing.JButton btnUp5;
    private javax.swing.JButton btnUp6;
    private javax.swing.JButton btnUp7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCan1;
    private javax.swing.JLabel lblCan2;
    private javax.swing.JLabel lblCan3;
    private javax.swing.JLabel lblCan4;
    private javax.swing.JLabel lblCan5;
    private javax.swing.JLabel lblCan6;
    private javax.swing.JLabel lblCan7;
    private javax.swing.JLabel lblCantTotal;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDesc1;
    private javax.swing.JLabel lblDesc2;
    private javax.swing.JLabel lblDesc3;
    private javax.swing.JLabel lblDesc4;
    private javax.swing.JLabel lblDesc5;
    private javax.swing.JLabel lblDesc6;
    private javax.swing.JLabel lblDesc7;
    private javax.swing.JLabel lblDurTotal;
    private javax.swing.JLabel lblDuracion1;
    private javax.swing.JLabel lblDuracion2;
    private javax.swing.JLabel lblDuracion3;
    private javax.swing.JLabel lblDuracion4;
    private javax.swing.JLabel lblDuracion5;
    private javax.swing.JLabel lblDuracion6;
    private javax.swing.JLabel lblDuracion7;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblIcon5;
    private javax.swing.JLabel lblIcon6;
    private javax.swing.JLabel lblIcon7;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrecio4;
    private javax.swing.JLabel lblPrecio5;
    private javax.swing.JLabel lblPrecio6;
    private javax.swing.JLabel lblPrecio7;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JLabel lblTipo2;
    private javax.swing.JLabel lblTipo3;
    private javax.swing.JLabel lblTipo4;
    private javax.swing.JLabel lblTipo5;
    private javax.swing.JLabel lblTipo6;
    private javax.swing.JLabel lblTipo7;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
