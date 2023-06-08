package vista;

import entidades.SerSolicitado;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javaswingdev.message.MessageDialog;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import negocio.CitasControl;
import negocio.ClientesControl;
import negocio.EmpleadosControl;
import negocio.PagosControl;
import negocio.SerSolicitadosControl;

public class FrmCadrEmpleada extends javax.swing.JFrame 
{
    String datos[] = new String[5];
    int contador = 1;
    
    ClientesControl CONTROL;
    EmpleadosControl CONTROLEMP;
    CitasControl CONTROLCIT;
    SerSolicitadosControl CONTROLSER;
    PagosControl CONTROLPAG;
    
    Fondo fondo = new Fondo();
        
    public FrmCadrEmpleada() 
    {
        setContentPane(fondo);
        initComponents();
        CONTROL = new ClientesControl();
        CONTROLEMP = new EmpleadosControl();
        CONTROLCIT = new CitasControl();
        CONTROLSER = new SerSolicitadosControl();
        CONTROLPAG = new PagosControl();
        
        setExtendedState(MAXIMIZED_BOTH);
        lblMenu.setIcon(new ImageIcon(getClass().getResource("/img/Fondo.png")));
        lblMenu1.setIcon(new ImageIcon(getClass().getResource("/img/Fondo.png")));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/SalirW.png")), lblIconSalir);
        Invisible();
        btnRegresar.setVisible(false);
    }
    
    public void Listar(int idEmpleada, String estado)
    {
        tblFechas.setModel(CONTROLCIT.FechasTrabajo(idEmpleada, estado));
    }
    
    public void Invisible()
    {
        tabla.setVisible(false);
        btnDetalles.setVisible(false);
        txtId.setVisible(false);
        lblNota.setVisible(false);
        pnlFondo2.setVisible(false);
        servicios.setVisible(false);
        btnRegresarServ.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JLabel();
        lblIconSalir = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblMenu1 = new javax.swing.JLabel();
        lblTitulos2 = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        cmpCalendar = new rojeru_san.componentes.RSCalendar();
        txtEmpleada = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnDetalles = new javax.swing.JButton();
        btnRegresarServ = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnObtCitas = new javax.swing.JButton();
        tabla = new javax.swing.JScrollPane();
        tblFechas = new rojeru_san.complementos.RSTableMetro();
        servicios = new javax.swing.JScrollPane();
        pnlFondo3 = new javax.swing.JPanel();
        lblNombre1 = new javax.swing.JLabel();
        lblIcon1 = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblIcon3 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblIcon4 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblIcon5 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();
        lblIcon6 = new javax.swing.JLabel();
        lblNombre6 = new javax.swing.JLabel();
        lblIcon7 = new javax.swing.JLabel();
        lblNombre7 = new javax.swing.JLabel();
        lblIcon8 = new javax.swing.JLabel();
        lblNombre8 = new javax.swing.JLabel();
        lblIcon9 = new javax.swing.JLabel();
        lblNombre9 = new javax.swing.JLabel();
        lblIcon10 = new javax.swing.JLabel();
        lblNombre10 = new javax.swing.JLabel();
        pnlFondo2 = new javax.swing.JPanel();
        txtDurCita = new javax.swing.JTextField();
        txtFecCita = new javax.swing.JTextField();
        txtHorCita = new javax.swing.JTextField();
        lblNota1 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        btnServicios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2736, 50));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lblTitulos2.setFont(new java.awt.Font("Consolas", 1, 65)); // NOI18N
        lblTitulos2.setForeground(new java.awt.Color(98, 88, 88));
        lblTitulos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulos2.setText("CITAS");
        getContentPane().add(lblTitulos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 470, 70));

        lblNota.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblNota.setForeground(new java.awt.Color(98, 88, 88));
        lblNota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota.setText("ID DE CITA:");
        getContentPane().add(lblNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 265, 250, 40));

        cmpCalendar.setAltoFilas(90);
        cmpCalendar.setAltoHead(90);
        cmpCalendar.setColorBackground(new java.awt.Color(225, 214, 212));
        cmpCalendar.setColorButtonHover(new java.awt.Color(98, 88, 88));
        cmpCalendar.setColorForeground(new java.awt.Color(57, 46, 46));
        cmpCalendar.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        cmpCalendar.setFuenteFilas(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        cmpCalendar.setFuenteHead(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        getContentPane().add(cmpCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 690, 730));

        txtEmpleada.setBackground(new java.awt.Color(191, 166, 161, 90));
        txtEmpleada.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtEmpleada.setForeground(new java.awt.Color(98, 88, 88));
        txtEmpleada.setText("Nombre de Empleada(o)");
        txtEmpleada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212)));
        txtEmpleada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmpleadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmpleadaFocusLost(evt);
            }
        });
        txtEmpleada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpleadaMouseClicked(evt);
            }
        });
        txtEmpleada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmpleada, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 350, 550, 50));

        txtId.setBackground(new java.awt.Color(255, 255, 255, 110));
        txtId.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(98, 88, 88));
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setText("Id Cita");
        txtId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212)));
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 80, 50));

        btnDetalles.setBackground(new java.awt.Color(225, 214, 212));
        btnDetalles.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnDetalles.setForeground(new java.awt.Color(98, 88, 88));
        btnDetalles.setText("Obtener Detalles de Cita");
        btnDetalles.setFocusPainted(false);
        btnDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDetallesMouseClicked(evt);
            }
        });
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, 300, 40));

        btnRegresarServ.setBackground(new java.awt.Color(225, 214, 212));
        btnRegresarServ.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRegresarServ.setForeground(new java.awt.Color(98, 88, 88));
        btnRegresarServ.setText("Regresar");
        btnRegresarServ.setFocusPainted(false);
        btnRegresarServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarServMouseClicked(evt);
            }
        });
        btnRegresarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarServActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 780, 130, 40));

        btnRegresar.setBackground(new java.awt.Color(225, 214, 212));
        btnRegresar.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(98, 88, 88));
        btnRegresar.setText("Regresar");
        btnRegresar.setFocusPainted(false);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 780, 130, 40));

        btnObtCitas.setBackground(new java.awt.Color(225, 214, 212));
        btnObtCitas.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnObtCitas.setForeground(new java.awt.Color(98, 88, 88));
        btnObtCitas.setText("Obtener Citas");
        btnObtCitas.setFocusPainted(false);
        btnObtCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnObtCitasMouseClicked(evt);
            }
        });
        btnObtCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtCitasActionPerformed(evt);
            }
        });
        getContentPane().add(btnObtCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 190, 40));

        tblFechas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tblFechas.setColorBackgoundHead(new java.awt.Color(225, 214, 212));
        tblFechas.setColorBordeFilas(new java.awt.Color(98, 88, 88));
        tblFechas.setColorBordeHead(new java.awt.Color(98, 88, 88));
        tblFechas.setColorFilasBackgound2(new java.awt.Color(225, 214, 212));
        tblFechas.setColorFilasForeground1(new java.awt.Color(67, 63, 63));
        tblFechas.setColorFilasForeground2(new java.awt.Color(67, 63, 63));
        tblFechas.setColorForegroundHead(new java.awt.Color(67, 63, 63));
        tblFechas.setColorSelBackgound(new java.awt.Color(208, 195, 195));
        tblFechas.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblFechas.setFuenteFilas(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tblFechas.setFuenteFilasSelect(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tblFechas.setFuenteHead(new java.awt.Font("Consolas", 1, 23)); // NOI18N
        tblFechas.setGridColor(new java.awt.Color(255, 255, 255));
        tblFechas.setRowHeight(30);
        tblFechas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabla.setViewportView(tblFechas);

        getContentPane().add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 540, 180));

        pnlFondo3.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre1.setText("\"\"");
        pnlFondo3.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 280, -1));

        lblIcon1.setOpaque(true);
        pnlFondo3.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 120));

        lblIcon2.setOpaque(true);
        pnlFondo3.add(lblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 120));

        lblNombre2.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre2.setText("\"\"");
        pnlFondo3.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 280, -1));

        lblIcon3.setOpaque(true);
        pnlFondo3.add(lblIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 120));

        lblNombre3.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre3.setText("\"\"");
        pnlFondo3.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 280, -1));

        lblIcon4.setOpaque(true);
        pnlFondo3.add(lblIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 120, 120));

        lblNombre4.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre4.setText("\"\"");
        pnlFondo3.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 280, -1));

        lblIcon5.setOpaque(true);
        pnlFondo3.add(lblIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, 120));

        lblNombre5.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre5.setText("\"\"");
        pnlFondo3.add(lblNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 280, -1));

        lblIcon6.setOpaque(true);
        pnlFondo3.add(lblIcon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 120, 120));

        lblNombre6.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre6.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre6.setText("\"\"");
        pnlFondo3.add(lblNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 280, -1));

        lblIcon7.setOpaque(true);
        pnlFondo3.add(lblIcon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 800, 120, 120));

        lblNombre7.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre7.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre7.setText("\"\"");
        pnlFondo3.add(lblNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 840, 280, -1));

        lblIcon8.setOpaque(true);
        pnlFondo3.add(lblIcon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 930, 120, 120));

        lblNombre8.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre8.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre8.setText("\"\"");
        pnlFondo3.add(lblNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 970, 280, -1));

        lblIcon9.setOpaque(true);
        pnlFondo3.add(lblIcon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1060, 120, 120));

        lblNombre9.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre9.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre9.setText("\"\"");
        pnlFondo3.add(lblNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1100, 280, -1));

        lblIcon10.setOpaque(true);
        pnlFondo3.add(lblIcon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1190, 120, 120));

        lblNombre10.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblNombre10.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre10.setText("\"\"");
        pnlFondo3.add(lblNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1230, 280, -1));

        servicios.setViewportView(pnlFondo3);

        getContentPane().add(servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 630, 430));

        pnlFondo2.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDurCita.setBackground(new java.awt.Color(191, 166, 161, 90));
        txtDurCita.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtDurCita.setForeground(new java.awt.Color(98, 88, 88));
        txtDurCita.setText("Duración Cita");
        txtDurCita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212)));
        txtDurCita.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDurCitaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDurCitaFocusLost(evt);
            }
        });
        txtDurCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDurCitaMouseClicked(evt);
            }
        });
        txtDurCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurCitaActionPerformed(evt);
            }
        });
        pnlFondo2.add(txtDurCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 150, 50));

        txtFecCita.setBackground(new java.awt.Color(191, 166, 161, 90));
        txtFecCita.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtFecCita.setForeground(new java.awt.Color(98, 88, 88));
        txtFecCita.setText("Fecha Cita");
        txtFecCita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212)));
        txtFecCita.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFecCitaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFecCitaFocusLost(evt);
            }
        });
        txtFecCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFecCitaMouseClicked(evt);
            }
        });
        txtFecCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecCitaActionPerformed(evt);
            }
        });
        pnlFondo2.add(txtFecCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 50));

        txtHorCita.setBackground(new java.awt.Color(191, 166, 161, 90));
        txtHorCita.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtHorCita.setForeground(new java.awt.Color(98, 88, 88));
        txtHorCita.setText("Hora Cita");
        txtHorCita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212), new java.awt.Color(225, 214, 212)));
        txtHorCita.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHorCitaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHorCitaFocusLost(evt);
            }
        });
        txtHorCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHorCitaMouseClicked(evt);
            }
        });
        txtHorCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorCitaActionPerformed(evt);
            }
        });
        pnlFondo2.add(txtHorCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 150, 50));

        lblNota1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        lblNota1.setForeground(new java.awt.Color(98, 88, 88));
        lblNota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota1.setText("Duración Cita:");
        pnlFondo2.add(lblNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 15, 130, 30));

        txtObservaciones.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
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
        pnlFondo2.add(txtObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 550, 150));

        btnServicios.setBackground(new java.awt.Color(225, 214, 212));
        btnServicios.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(98, 88, 88));
        btnServicios.setText("Ver Servicios de la Cita");
        btnServicios.setFocusPainted(false);
        btnServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnServiciosMouseClicked(evt);
            }
        });
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        pnlFondo2.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 309, 300, -1));

        getContentPane().add(pnlFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 395, 620, 360));

        jLabel1.setBackground(new java.awt.Color(191, 166, 161, 90));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(177, 152, 147), 2, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 163, 680, 90));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 680, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        PrinEmpleada obd = new PrinEmpleada();
        obd.setVisible(true);
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

    private void btnDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetallesMouseClicked
    }//GEN-LAST:event_btnDetallesMouseClicked

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(tblFechas.getSelectedRowCount() == 1)
        {
            btnDetalles.setVisible(false);
            lblNota.setVisible(true);
            txtId.setVisible(true);
            btnRegresar.setVisible(true);
            String fecha = String.valueOf(tblFechas.getValueAt(tblFechas.getSelectedRow(), 0));
            tabla.setVisible(false);
            pnlFondo2.setVisible(true);
            
            datos = CONTROLCIT.DatosEmpleada(CONTROLEMP.GetId(txtEmpleada.getText()), fecha);
            
            txtFecCita.setText(fecha);
            txtId.setText(datos[0]);
            txtHorCita.setText(datos[1]);
            txtDurCita.setText(datos[2]);
            txtObservaciones.setText(datos[3]);
            txtFecCita.setEditable(false);
            txtId.setEditable(false);
            txtHorCita.setEditable(false);
            txtDurCita.setEditable(false);
            txtEmpleada.setEditable(false);
            txtObservaciones.setEditable(false);
        }   
        else
            OptionPane.showMessage("Detalle de Cita", "Debes seleccionar una fecha de la tabla", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void txtEmpleadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpleadaFocusGained
        if(txtEmpleada.getText().equals("Nombre de Empleada(o)"))
        {
            txtEmpleada.setText("");
            txtEmpleada.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtEmpleadaFocusGained

    private void txtEmpleadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpleadaFocusLost
        if(txtEmpleada.getText().isEmpty())
        {
            txtEmpleada.setText("Nombre de Empleada(o)");
            txtEmpleada.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtEmpleadaFocusLost

    private void txtEmpleadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleadaMouseClicked
    }//GEN-LAST:event_txtEmpleadaMouseClicked

    private void txtEmpleadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadaActionPerformed
    }//GEN-LAST:event_txtEmpleadaActionPerformed

    private void txtIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusGained
    }//GEN-LAST:event_txtIdFocusGained

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
    }//GEN-LAST:event_txtIdFocusLost

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
    }//GEN-LAST:event_txtIdMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnObtCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObtCitasMouseClicked
    }//GEN-LAST:event_btnObtCitasMouseClicked

    private void btnObtCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtCitasActionPerformed
        MessageDialog OptionPane = new MessageDialog(this);

        if(!txtEmpleada.getText().isEmpty() && !txtEmpleada.getText().equals("Nombre de Empleada(o)"))
            if(CONTROLEMP.Existe(txtEmpleada.getText()) == true)
                if(CONTROLEMP.TenerCitas(CONTROLEMP.GetId(txtEmpleada.getText()), txtEmpleada.getText(), "Agendada"))
                {
                    btnObtCitas.setVisible(false);
                    btnDetalles.setVisible(true);
                    btnRegresar.setVisible(true);
                    tabla.setVisible(true);
                    Listar(CONTROLEMP.GetId(txtEmpleada.getText()), "Agendada");
                }
                else
                    OptionPane.showMessage("Obtener Citas", "El cliente no tiene citas registradas", "/img/iconos/Close.png");                                          
            else
                OptionPane.showMessage("Obtener Citas", "Debes escribir un Nombre de Empleada(o) que se encuentre registrado en el sistema", "/img/iconos/Close.png");                           
        else
            OptionPane.showMessage("Obtener Citas", "Debes escribir un Nombre de Empleada(o)", "/img/iconos/Close.png");            
    }//GEN-LAST:event_btnObtCitasActionPerformed

    private void txtDurCitaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDurCitaFocusGained
    }//GEN-LAST:event_txtDurCitaFocusGained

    private void txtDurCitaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDurCitaFocusLost
    }//GEN-LAST:event_txtDurCitaFocusLost

    private void txtDurCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDurCitaMouseClicked
    }//GEN-LAST:event_txtDurCitaMouseClicked

    private void txtDurCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurCitaActionPerformed
    }//GEN-LAST:event_txtDurCitaActionPerformed

    private void txtFecCitaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFecCitaFocusGained
        if(txtFecCita.getText().equals("Fecha Cita"))
        {
            txtFecCita.setText("");
            txtFecCita.setForeground(new Color(98,88,88));
        } 
    }//GEN-LAST:event_txtFecCitaFocusGained

    private void txtFecCitaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFecCitaFocusLost
        if(txtFecCita.getText().isEmpty())
        {
            txtFecCita.setText("Fecha Cita");
            txtFecCita.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtFecCitaFocusLost

    private void txtFecCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFecCitaMouseClicked
    }//GEN-LAST:event_txtFecCitaMouseClicked

    private void txtFecCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecCitaActionPerformed
    }//GEN-LAST:event_txtFecCitaActionPerformed

    private void txtHorCitaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorCitaFocusGained
        if(txtHorCita.getText().equals("Hora Cita"))
        {
            txtHorCita.setText("");
            txtHorCita.setForeground(new Color(98,88,88));
        } 
    }//GEN-LAST:event_txtHorCitaFocusGained

    private void txtHorCitaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorCitaFocusLost
        if(txtHorCita.getText().isEmpty())
        {
            txtHorCita.setText("Hora Cita");
            txtHorCita.setForeground(new Color(98,88,88));
        }
    }//GEN-LAST:event_txtHorCitaFocusLost

    private void txtHorCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHorCitaMouseClicked
    }//GEN-LAST:event_txtHorCitaMouseClicked

    private void txtHorCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorCitaActionPerformed
    }//GEN-LAST:event_txtHorCitaActionPerformed

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

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Invisible();
        btnObtCitas.setVisible(true);
        btnRegresar.setVisible(false);
        txtEmpleada.setVisible(true);            
        txtEmpleada.setEditable(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseClicked
    }//GEN-LAST:event_btnServiciosMouseClicked

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        pnlFondo2.setVisible(false);
        ServiciosInv();
        txtEmpleada.setVisible(false);
        servicios.setVisible(true);
        btnRegresar.setVisible(false);
        btnRegresarServ.setVisible(true);
        
        List<SerSolicitado> detalles = CONTROLSER.ListarNombser(Integer.parseInt(txtId.getText()));
        for(SerSolicitado item:detalles)
        {
            switch(contador)
            {
                case 1:
                    lblNombre1.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon1);
                break;
                case 2:
                    lblIcon2.setVisible(true);
                    lblNombre2.setVisible(true);
                    lblNombre2.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon2);
                break;
                case 3:
                    lblIcon3.setVisible(true);
                    lblNombre3.setVisible(true);
                    lblNombre3.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon3);
                break;
                case 4:
                    lblIcon4.setVisible(true);
                    lblNombre4.setVisible(true);
                    lblNombre4.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon4);
                break;
                case 5:
                    lblIcon5.setVisible(true);
                    lblNombre5.setVisible(true);
                    lblNombre5.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon5);
                break;
                case 6:
                    lblIcon6.setVisible(true);
                    lblNombre6.setVisible(true);
                    lblNombre6.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon6);
                break;
                case 7:
                    lblIcon7.setVisible(true);
                    lblNombre7.setVisible(true);
                    lblNombre7.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon7);
                break;
                case 8:
                    lblIcon8.setVisible(true);
                    lblNombre8.setVisible(true);
                    lblNombre8.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon8);
                break;
                case 9:
                    lblIcon9.setVisible(true);
                    lblNombre9.setVisible(true);
                    lblNombre9.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon9);
                break;
                case 10:
                    lblIcon10.setVisible(true);
                    lblNombre10.setVisible(true);
                    lblNombre10.setText(item.getNombreServicio());
                    Dibujar(item.getImagenServicio(), lblIcon10);
                break;
            }
            contador++;
        }
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnRegresarServMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarServMouseClicked
    }//GEN-LAST:event_btnRegresarServMouseClicked

    private void btnRegresarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarServActionPerformed
        servicios.setVisible(false);
        btnRegresarServ.setVisible(false);
        pnlFondo2.setVisible(true);
        txtEmpleada.setVisible(true);
        btnRegresar.setVisible(true);
    }//GEN-LAST:event_btnRegresarServActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadrEmpleada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadrEmpleada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadrEmpleada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadrEmpleada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmCadrEmpleada().setVisible(true);
            }
        });
    }
    
    private void Dibujar(String ruta, JLabel label)
    {
        ImageIcon icono = new ImageIcon(ruta);
        Image image = icono.getImage();
        image = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        icono = new ImageIcon(image);
        label.setIcon(icono);
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

    
    public void Icono(ImageIcon icono, JLabel label)
    {
        Image image = icono.getImage();
        image = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
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
    
    private void ServiciosInv()
    {
        lblIcon2.setVisible(false);
        lblNombre2.setVisible(false);
        lblIcon3.setVisible(false);
        lblNombre3.setVisible(false);
        lblIcon4.setVisible(false);
        lblNombre4.setVisible(false);
        lblIcon5.setVisible(false);
        lblNombre5.setVisible(false);
        lblIcon6.setVisible(false);
        lblNombre6.setVisible(false);
        lblIcon7.setVisible(false);
        lblNombre7.setVisible(false);
        lblIcon8.setVisible(false);
        lblNombre8.setVisible(false);
        lblIcon9.setVisible(false);
        lblNombre9.setVisible(false);
        lblIcon10.setVisible(false);
        lblNombre10.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnObtCitas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresarServ;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JButton btnServicios;
    private rojeru_san.componentes.RSCalendar cmpCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon10;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblIcon5;
    private javax.swing.JLabel lblIcon6;
    private javax.swing.JLabel lblIcon7;
    private javax.swing.JLabel lblIcon8;
    private javax.swing.JLabel lblIcon9;
    private javax.swing.JLabel lblIconSalir;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenu1;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre10;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblNombre8;
    private javax.swing.JLabel lblNombre9;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTitulos2;
    private javax.swing.JPanel pnlFondo2;
    private javax.swing.JPanel pnlFondo3;
    private javax.swing.JScrollPane servicios;
    private javax.swing.JScrollPane tabla;
    private rojeru_san.complementos.RSTableMetro tblFechas;
    private javax.swing.JTextField txtDurCita;
    private javax.swing.JTextField txtEmpleada;
    private javax.swing.JTextField txtFecCita;
    private javax.swing.JTextField txtHorCita;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
