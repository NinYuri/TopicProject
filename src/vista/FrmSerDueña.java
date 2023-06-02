package vista;

import comp.Carrusel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javaswingdev.message.MessageDialog;
import negocio.ServiciosControl;

public class FrmSerDueña extends javax.swing.JFrame 
{
    Fondo fondo = new Fondo();
    private final ServiciosControl CONTROL;
    String nombreAnt;
    
    public FrmSerDueña() 
    {
        setContentPane(fondo);
        initComponents();
        CONTROL = new ServiciosControl();
        Listar("");
        btnOcultar.setVisible(false);
        Carrusel.setVisible(false);
        lblNombre.setVisible(false);
        pnlFondo.setVisible(false);
        
        Icono(new ImageIcon(getClass().getResource("/img/iconos/InfoW.png")), lblIconDetalles);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/SalirW.png")), lblIconSalir);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/NuevoW.png")), lblIconNuevo);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/BorrarW.png")), lblIconEliminar);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/EditarW.png")), lblIconEditar);
        Icono(new ImageIcon(getClass().getResource("/img/iconos/Refresh.png")), lblIconAct);

        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void Listar(String texto)
    {
        tblSerPrincipal.setModel(CONTROL.Listar(texto));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblIconSalir = new javax.swing.JLabel();
        lblIconAct = new javax.swing.JLabel();
        Carrusel = new comp.Carrusel();
        tab = new javax.swing.JScrollPane();
        tblSerPrincipal = new rojeru_san.complementos.RSTableMetro();
        btnDetalles = new javax.swing.JLabel();
        lblDetalles = new javax.swing.JLabel();
        lblIconDetalles = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JLabel();
        lblNuevo = new javax.swing.JLabel();
        lblIconNuevo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        lblIconEliminar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblIconEditar = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        pnlFondo = new javax.swing.JPanel();
        btnOcultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 60));

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setText("Salir");
        getContentPane().add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 50));
        getContentPane().add(lblIconSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 60));

        lblIconAct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIconAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconActMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconActMousePressed(evt);
            }
        });
        getContentPane().add(lblIconAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 70, 60));
        getContentPane().add(Carrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        tblSerPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSerPrincipal.setColorBackgoundHead(new java.awt.Color(225, 214, 212));
        tblSerPrincipal.setColorBordeFilas(new java.awt.Color(98, 88, 88));
        tblSerPrincipal.setColorBordeHead(new java.awt.Color(98, 88, 88));
        tblSerPrincipal.setColorFilasBackgound2(new java.awt.Color(225, 214, 212));
        tblSerPrincipal.setColorFilasForeground1(new java.awt.Color(67, 63, 63));
        tblSerPrincipal.setColorFilasForeground2(new java.awt.Color(67, 63, 63));
        tblSerPrincipal.setColorForegroundHead(new java.awt.Color(67, 63, 63));
        tblSerPrincipal.setColorSelBackgound(new java.awt.Color(208, 195, 195));
        tblSerPrincipal.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblSerPrincipal.setFuenteFilas(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tblSerPrincipal.setFuenteFilasSelect(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        tblSerPrincipal.setFuenteHead(new java.awt.Font("Consolas", 1, 23)); // NOI18N
        tblSerPrincipal.setGridColor(new java.awt.Color(255, 255, 255));
        tblSerPrincipal.setRowHeight(30);
        tblSerPrincipal.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tab.setViewportView(tblSerPrincipal);

        getContentPane().add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 970, 260));

        btnDetalles.setBackground(new java.awt.Color(204, 204, 255));
        btnDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDetallesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDetallesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDetallesMouseReleased(evt);
            }
        });
        getContentPane().add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 280, 60));

        lblDetalles.setBackground(new java.awt.Color(255, 255, 255));
        lblDetalles.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        lblDetalles.setForeground(new java.awt.Color(255, 255, 255));
        lblDetalles.setText("Detalles");
        getContentPane().add(lblDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, -1, 50));
        getContentPane().add(lblIconDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 70, 60));

        btnNuevo.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNuevoMouseReleased(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 280, 60));

        lblNuevo.setBackground(new java.awt.Color(255, 255, 255));
        lblNuevo.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        lblNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevo.setText("Añadir");
        getContentPane().add(lblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, -1, 50));
        getContentPane().add(lblIconNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 70, 60));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 280, 60));

        lblEliminar.setBackground(new java.awt.Color(255, 255, 255));
        lblEliminar.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setText("Eliminar");
        getContentPane().add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, -1, 50));
        getContentPane().add(lblIconEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 70, 60));

        btnEditar.setBackground(new java.awt.Color(204, 204, 255));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarMouseReleased(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 280, 60));

        lblEditar.setBackground(new java.awt.Color(255, 255, 255));
        lblEditar.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");
        getContentPane().add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 770, -1, 50));
        getContentPane().add(lblIconEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, 70, 60));

        lblNombre.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(98, 88, 88));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 480, 100));

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOcultar.setBackground(new java.awt.Color(225, 214, 212));
        btnOcultar.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnOcultar.setForeground(new java.awt.Color(98, 88, 88));
        btnOcultar.setText("Ocultar Información");
        btnOcultar.setFocusPainted(false);
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });
        pnlFondo.add(btnOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 270, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 850, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        PrinDueña obd = new PrinDueña();
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

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        Nuevo obn = new Nuevo();
        obn.setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMousePressed
        btnNuevo.setBorder(BorderFactory.createLoweredBevelBorder());
        lblNuevo.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/NuevoB.png")), lblIconNuevo);
    }//GEN-LAST:event_btnNuevoMousePressed

    private void btnNuevoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseReleased
        btnNuevo.setBorder(null);
        lblNuevo.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/NuevoW.png")), lblIconNuevo);
    }//GEN-LAST:event_btnNuevoMouseReleased

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(tblSerPrincipal.getSelectedRowCount() == 1)
        {
            String servicio = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 1));
            if(JOptionPane.showConfirmDialog(this, "¿Desea eliminar el servicio " + servicio + "?", "Eliminar",JOptionPane.YES_NO_OPTION) == 0)
            {
                String resp = CONTROL.Borrar(servicio);
                if(resp.equals("OK"))
                {
                    OptionPane.showMessage("Eliminar", "Servicio eliminado", "/img/iconos/Info.png");
                    Listar("");
                }
                else
                    OptionPane.showMessage("Eliminar", "Error al eliminar el servicio", "/img/iconos/Close.png");
            }
        }
        else
            OptionPane.showMessage("Eliminar", "Debes seleccionar un servicio para eliminar", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        btnEliminar.setBorder(BorderFactory.createLoweredBevelBorder());
        lblEliminar.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/BorrarB.png")), lblIconEliminar);
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        btnEliminar.setBorder(null);
        lblEliminar.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/BorrarW.png")), lblIconEliminar);
    }//GEN-LAST:event_btnEliminarMouseReleased

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        MessageDialog OptionPane = new MessageDialog(this);
        Editar obe = new Editar();
        
        if(tblSerPrincipal.getSelectedRowCount() == 1)
        {
            String id = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 0));
            String nombre = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 1));
            nombreAnt = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 1));
            String duracion = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 2));
            String costo = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 3));
            String descuento = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 4));
            String tipo = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 5));
            
            obe.Variables(id, nombre, nombreAnt, duracion, costo, descuento, tipo);
            obe.setVisible(true);
        }
        else
            OptionPane.showMessage("Editar", "Debes seleccionar un servicio para editar", "/img/iconos/Close.png");
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        btnEditar.setBorder(BorderFactory.createLoweredBevelBorder());
        lblEditar.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/EditarB.png")), lblIconEditar);
    }//GEN-LAST:event_btnEditarMousePressed

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        btnEditar.setBorder(null);
        lblEditar.setForeground(new Color(255, 255, 255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/EditarW.png")), lblIconEditar);
    }//GEN-LAST:event_btnEditarMouseReleased

    private void btnDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetallesMouseClicked
        MessageDialog OptionPane = new MessageDialog(this);
        
        if(tblSerPrincipal.getSelectedRowCount() == 1)
        {
            String id = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 0));
            String nombre = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 1));
            nombreAnt = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 1));
            String duracion = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 2));
            String costo = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 3));
            String descuento = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 4));
            String tipo = String.valueOf(tblSerPrincipal.getValueAt(tblSerPrincipal.getSelectedRow(), 5));
            
            tab.setVisible(false);
            pnlFondo.setVisible(true);
            Carrusel.setVisible(true);
            Carrusel(nombre, Carrusel);
            btnOcultar.setVisible(true);
            lblNombre.setVisible(true);
            lblNombre.setText(nombre);
        }
        else
            OptionPane.showMessage("Detalles", "Debes seleccionar un servicio para mostrarte", "/img/iconos/Close.png");            
    }//GEN-LAST:event_btnDetallesMouseClicked

    private void btnDetallesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetallesMousePressed
        btnDetalles.setBorder(BorderFactory.createLoweredBevelBorder());
        lblDetalles.setForeground(new Color(98, 88, 88));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/InfoB.png")), lblIconDetalles);
    }//GEN-LAST:event_btnDetallesMousePressed

    private void btnDetallesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetallesMouseReleased
        btnDetalles.setBorder(null);
        lblDetalles.setForeground(new Color(255,255,255));
        Icono(new ImageIcon(getClass().getResource("/img/iconos/InfoW.png")), lblIconDetalles);
    }//GEN-LAST:event_btnDetallesMouseReleased

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked
        tab.setVisible(true);
        pnlFondo.setVisible(false);
        Carrusel.setVisible(false);
        btnOcultar.setVisible(false);
        lblNombre.setVisible(false);
    }//GEN-LAST:event_btnOcultarMouseClicked

    private void lblIconActMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconActMousePressed
        
    }//GEN-LAST:event_lblIconActMousePressed

    private void lblIconActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconActMouseClicked
        Listar("");
    }//GEN-LAST:event_lblIconActMouseClicked

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
            java.util.logging.Logger.getLogger(FrmSerDueña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSerDueña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSerDueña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSerDueña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSerDueña().setVisible(true);
            }
        });
    }
    
    public void Carrusel(String texto, Carrusel car)
    {
        List<String[]> rutas = CONTROL.Imagen(texto);
        String[] rutasServicio = rutas.get(0);
        car.setRuta1(rutasServicio[0]);
        car.setRuta2(rutasServicio[1]);
        car.setRuta3(rutasServicio[2]);
        car.setRuta4(rutasServicio[3]);
        car.setRuta5(rutasServicio[4]);
        car.setRuta6(rutasServicio[5]);
        car.setRuta7(rutasServicio[6]);
        car.setRuta8(rutasServicio[7]);
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
            imagen = new ImageIcon(getClass().getResource("/img/Fondo_dueña.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private comp.Carrusel Carrusel;
    private javax.swing.JLabel btnDetalles;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JButton btnOcultar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel lblDetalles;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblIconAct;
    private javax.swing.JLabel lblIconDetalles;
    private javax.swing.JLabel lblIconEditar;
    private javax.swing.JLabel lblIconEliminar;
    private javax.swing.JLabel lblIconNuevo;
    private javax.swing.JLabel lblIconSalir;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JScrollPane tab;
    private rojeru_san.complementos.RSTableMetro tblSerPrincipal;
    // End of variables declaration//GEN-END:variables
}
