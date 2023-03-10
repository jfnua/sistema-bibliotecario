/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import BD.StmtSQL;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author fresh-fresh
 */
public class RegistrarPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form ModificarLibro
     */
    public RegistrarPrestamo(StmtSQL cxn) {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(128, 142, 159)));
        this.setIconImage(new ImageIcon(this.getClass().getResource("../icons/icons8_literature_25px_1.png")).getImage());
        this.cxn = cxn;
        this.setTitle("Registrar préstamo");
        new TextPrompt("  Seleccionar libro -----> ", txtf_tituloLibro);
        new TextPrompt("  Seleccionar miembro ----> ", txtf_nombreMiembro); 
        dc_fechaPrestamoLibro.setDate(new java.util.Date());
        dc_fechaEntregaLibro.setDate(new java.util.Date());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panelRegistroLibro = new javax.swing.JPanel();
        panel_windowOpRegistroLibro = new javax.swing.JPanel();
        btn_exitRegistrarLibro = new javax.swing.JLabel();
        btn_minimizeRegistrarLibro = new javax.swing.JLabel();
        lbl_titleRegistroPrestamo = new javax.swing.JLabel();
        panel_formulario = new javax.swing.JPanel();
        line_tituloLibro = new javax.swing.JSeparator();
        txtf_tituloLibro = new javax.swing.JTextField();
        line_nombrePrestatario = new javax.swing.JSeparator();
        txtf_nombreMiembro = new javax.swing.JTextField();
        dc_fechaPrestamoLibro = new com.toedter.calendar.JDateChooser();
        lbl_fechaPrestamo = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        dc_fechaEntregaLibro = new com.toedter.calendar.JDateChooser();
        lbl_fecheEntrega = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_infoFechasPrestamo = new javax.swing.JLabel();
        btn_selectLibro = new javax.swing.JLabel();
        btn_selectUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(360, 335));

        main_panelRegistroLibro.setBackground(new java.awt.Color(71, 91, 116));
        main_panelRegistroLibro.setPreferredSize(new java.awt.Dimension(360, 335));
        main_panelRegistroLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_windowOpRegistroLibro.setBackground(new java.awt.Color(31, 51, 76));
        panel_windowOpRegistroLibro.setPreferredSize(new java.awt.Dimension(420, 30));
        panel_windowOpRegistroLibro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_windowOpRegistroLibroMouseDragged(evt);
            }
        });
        panel_windowOpRegistroLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_windowOpRegistroLibroMousePressed(evt);
            }
        });

        btn_exitRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconCloseOff.png"))); // NOI18N
        btn_exitRegistrarLibro.setToolTipText("Cerrar");
        btn_exitRegistrarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exitRegistrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitRegistrarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitRegistrarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitRegistrarLibroMouseExited(evt);
            }
        });

        btn_minimizeRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconMinimize.png"))); // NOI18N
        btn_minimizeRegistrarLibro.setToolTipText("Minimizar");
        btn_minimizeRegistrarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizeRegistrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizeRegistrarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minimizeRegistrarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minimizeRegistrarLibroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_windowOpRegistroLibroLayout = new javax.swing.GroupLayout(panel_windowOpRegistroLibro);
        panel_windowOpRegistroLibro.setLayout(panel_windowOpRegistroLibroLayout);
        panel_windowOpRegistroLibroLayout.setHorizontalGroup(
            panel_windowOpRegistroLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_windowOpRegistroLibroLayout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(btn_minimizeRegistrarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exitRegistrarLibro)
                .addGap(64, 64, 64))
        );
        panel_windowOpRegistroLibroLayout.setVerticalGroup(
            panel_windowOpRegistroLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_minimizeRegistrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(btn_exitRegistrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_exitRegistrarLibro.getAccessibleContext().setAccessibleName("Cerrar Ventana");
        btn_minimizeRegistrarLibro.getAccessibleContext().setAccessibleName("Minimizar Ventana");

        main_panelRegistroLibro.add(panel_windowOpRegistroLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 30));

        lbl_titleRegistroPrestamo.setBackground(new java.awt.Color(51, 71, 96));
        lbl_titleRegistroPrestamo.setFont(new java.awt.Font("Kristen ITC", 0, 16)); // NOI18N
        lbl_titleRegistroPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titleRegistroPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_petition_25px.png"))); // NOI18N
        lbl_titleRegistroPrestamo.setText("Registro Préstamo");
        lbl_titleRegistroPrestamo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 121, 146), 2, true));
        lbl_titleRegistroPrestamo.setOpaque(true);
        main_panelRegistroLibro.add(lbl_titleRegistroPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 30));

        panel_formulario.setBackground(new java.awt.Color(51, 71, 96));
        panel_formulario.setPreferredSize(new java.awt.Dimension(350, 350));

        line_tituloLibro.setBackground(new java.awt.Color(131, 151, 176));
        line_tituloLibro.setForeground(new java.awt.Color(0, 0, 0));

        txtf_tituloLibro.setEditable(false);
        txtf_tituloLibro.setBackground(new java.awt.Color(51, 71, 96));
        txtf_tituloLibro.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtf_tituloLibro.setForeground(new java.awt.Color(255, 255, 255));
        txtf_tituloLibro.setBorder(null);
        txtf_tituloLibro.setCaretColor(new java.awt.Color(255, 255, 255));
        txtf_tituloLibro.setOpaque(false);
        txtf_tituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_tituloLibroActionPerformed(evt);
            }
        });
        txtf_tituloLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtf_tituloLibroKeyTyped(evt);
            }
        });

        line_nombrePrestatario.setBackground(new java.awt.Color(131, 151, 176));
        line_nombrePrestatario.setForeground(new java.awt.Color(0, 0, 0));

        txtf_nombreMiembro.setEditable(false);
        txtf_nombreMiembro.setBackground(new java.awt.Color(51, 71, 96));
        txtf_nombreMiembro.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtf_nombreMiembro.setForeground(new java.awt.Color(255, 255, 255));
        txtf_nombreMiembro.setBorder(null);
        txtf_nombreMiembro.setCaretColor(new java.awt.Color(255, 255, 255));
        txtf_nombreMiembro.setOpaque(false);
        txtf_nombreMiembro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtf_nombreMiembroKeyTyped(evt);
            }
        });

        dc_fechaPrestamoLibro.setBackground(new java.awt.Color(151, 171, 196));
        dc_fechaPrestamoLibro.setDateFormatString("yyyy-MM-dd");

        lbl_fechaPrestamo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        lbl_fechaPrestamo.setForeground(new java.awt.Color(153, 153, 153));
        lbl_fechaPrestamo.setText("Fecha Préstamo");

        btn_guardar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_save_17px.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        dc_fechaEntregaLibro.setBackground(new java.awt.Color(151, 171, 196));
        dc_fechaEntregaLibro.setDateFormatString("yyyy-MM-dd");

        lbl_fecheEntrega.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        lbl_fecheEntrega.setForeground(new java.awt.Color(153, 153, 153));
        lbl_fecheEntrega.setText("Fecha Entrega");

        btn_cancelar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cancel_17px.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseClicked(evt);
            }
        });

        btn_infoFechasPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_info_15px.png"))); // NOI18N
        btn_infoFechasPrestamo.setToolTipText("Se aplicará multa economica pasando el día de entrega ($5.99 MXN por dia).");
        btn_infoFechasPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_selectLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_book_30px.png"))); // NOI18N
        btn_selectLibro.setToolTipText("Seleccionar Libro");
        btn_selectLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_selectLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_selectLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_selectLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_selectLibroMouseExited(evt);
            }
        });

        btn_selectUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_30px.png"))); // NOI18N
        btn_selectUser.setToolTipText("Seleccionar Usuario");
        btn_selectUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_selectUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_selectUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_selectUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_selectUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_formularioLayout = new javax.swing.GroupLayout(panel_formulario);
        panel_formulario.setLayout(panel_formularioLayout);
        panel_formularioLayout.setHorizontalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(line_nombrePrestatario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addComponent(txtf_nombreMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_selectUser))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addComponent(txtf_tituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_selectLibro))
                    .addComponent(line_tituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fechaPrestamo)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dc_fechaPrestamoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_fecheEntrega)
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addComponent(dc_fechaEntregaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_infoFechasPrestamo))
                            .addComponent(btn_cancelar))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panel_formularioLayout.setVerticalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtf_tituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selectLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_tituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtf_nombreMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selectUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_nombrePrestatario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fechaPrestamo)
                    .addComponent(lbl_fecheEntrega))
                .addGap(4, 4, 4)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_infoFechasPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dc_fechaPrestamoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(dc_fechaEntregaLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_cancelar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        main_panelRegistroLibro.add(panel_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panelRegistroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panelRegistroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpiar(){
        txtf_nombreMiembro.setText("");
        txtf_tituloLibro.setText("");
        dc_fechaPrestamoLibro.setDate(new java.util.Date());
        dc_fechaEntregaLibro.setDate(new java.util.Date());
    }
    
    private void btn_exitRegistrarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitRegistrarLibroMouseClicked
        limpiar();
        this.dispose();
    }//GEN-LAST:event_btn_exitRegistrarLibroMouseClicked

    private void btn_exitRegistrarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitRegistrarLibroMouseEntered
        btn_exitRegistrarLibro.setIcon(new ImageIcon(this.getClass().getResource("../icons/iconClose.png")));
    }//GEN-LAST:event_btn_exitRegistrarLibroMouseEntered

    private void btn_exitRegistrarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitRegistrarLibroMouseExited
        btn_exitRegistrarLibro.setIcon(new ImageIcon(this.getClass().getResource("../icons/iconCloseOff.png")));
    }//GEN-LAST:event_btn_exitRegistrarLibroMouseExited

    private void btn_minimizeRegistrarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeRegistrarLibroMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizeRegistrarLibroMouseClicked

    private void btn_minimizeRegistrarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeRegistrarLibroMouseEntered
        btn_minimizeRegistrarLibro.setIcon(new ImageIcon(this.getClass().getResource("../icons/iconMinimizeOn.png")));
    }//GEN-LAST:event_btn_minimizeRegistrarLibroMouseEntered

    private void btn_minimizeRegistrarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeRegistrarLibroMouseExited
        btn_minimizeRegistrarLibro.setIcon(new ImageIcon(this.getClass().getResource("../icons/iconMinimize.png")));
    }//GEN-LAST:event_btn_minimizeRegistrarLibroMouseExited

    private void panel_windowOpRegistroLibroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_windowOpRegistroLibroMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_panel_windowOpRegistroLibroMouseDragged

    private void panel_windowOpRegistroLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_windowOpRegistroLibroMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panel_windowOpRegistroLibroMousePressed

    private void txtf_tituloLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtf_tituloLibroKeyTyped
        if(txtf_tituloLibro.getText().length() >= 100)
            evt.consume();
    }//GEN-LAST:event_txtf_tituloLibroKeyTyped

    private void txtf_nombreMiembroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtf_nombreMiembroKeyTyped
        if(txtf_nombreMiembro.getText().length() >= 50)
        evt.consume();
    }//GEN-LAST:event_txtf_nombreMiembroKeyTyped

    private void txtf_tituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_tituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_tituloLibroActionPerformed

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        limpiar();
        this.dispose();
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void btn_selectLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selectLibroMouseEntered
        btn_selectLibro.setIcon(new ImageIcon(this.getClass().getResource("../icons/icons8_book_30px_1.png")));
    }//GEN-LAST:event_btn_selectLibroMouseEntered

    private void btn_selectLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selectLibroMouseExited
        btn_selectLibro.setIcon(new ImageIcon(this.getClass().getResource("../icons/icons8_book_30px.png")));
    }//GEN-LAST:event_btn_selectLibroMouseExited

    private void btn_selectUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selectUserMouseEntered
        btn_selectUser.setIcon(new ImageIcon(this.getClass().getResource("../icons/icons8_user_30px_1.png")));
    }//GEN-LAST:event_btn_selectUserMouseEntered

    private void btn_selectUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selectUserMouseExited
        btn_selectUser.setIcon(new ImageIcon(this.getClass().getResource("../icons/icons8_user_30px.png")));
    }//GEN-LAST:event_btn_selectUserMouseExited

    public void establecerLibro(String tituloLibro){
        txtf_tituloLibro.setText(tituloLibro);
    }
    
    private void btn_selectLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selectLibroMouseClicked
        SeleccionLibro vSelectLibro = new SeleccionLibro(cxn, this);
        vSelectLibro.setVisible(true);
    }//GEN-LAST:event_btn_selectLibroMouseClicked

    public void establecerMiembro(String nombreMiembro){
        txtf_nombreMiembro.setText(nombreMiembro);
    }
    
    private void btn_selectUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selectUserMouseClicked
        SeleccionMiembro vSelectMiembro = new SeleccionMiembro(cxn, this);
        vSelectMiembro.setVisible(true);
    }//GEN-LAST:event_btn_selectUserMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        nPrestamo[0] = sLibro;
        nPrestamo[1] = sMiembro;
        Calendar f1 = dc_fechaPrestamoLibro.getCalendar();
        Calendar f2 = dc_fechaEntregaLibro.getCalendar();        
        nPrestamo[2] = f1.get(Calendar.YEAR)+"-"+(f1.get(Calendar.MONTH)+1)+"-"+f1.get(Calendar.DATE);
        nPrestamo[3] = f2.get(Calendar.YEAR)+"-"+(f2.get(Calendar.MONTH)+1)+"-"+f2.get(Calendar.DATE);
        try {
            cxn.registrarPrestamo(nPrestamo);
            JOptionPane.showMessageDialog(null, "Se ha registrado un nuevo Préstamo.", "Codex",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: "+ex.getMessage(), "Codex",1);
        }
        limpiar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel btn_exitRegistrarLibro;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel btn_infoFechasPrestamo;
    private javax.swing.JLabel btn_minimizeRegistrarLibro;
    private javax.swing.JLabel btn_selectLibro;
    private javax.swing.JLabel btn_selectUser;
    private com.toedter.calendar.JDateChooser dc_fechaEntregaLibro;
    private com.toedter.calendar.JDateChooser dc_fechaPrestamoLibro;
    private javax.swing.JLabel lbl_fechaPrestamo;
    private javax.swing.JLabel lbl_fecheEntrega;
    private javax.swing.JLabel lbl_titleRegistroPrestamo;
    private javax.swing.JSeparator line_nombrePrestatario;
    private javax.swing.JSeparator line_tituloLibro;
    private javax.swing.JPanel main_panelRegistroLibro;
    private javax.swing.JPanel panel_formulario;
    private javax.swing.JPanel panel_windowOpRegistroLibro;
    private javax.swing.JTextField txtf_nombreMiembro;
    private javax.swing.JTextField txtf_tituloLibro;
    // End of variables declaration//GEN-END:variables
    private int x;
    private int y;
    StmtSQL cxn;
    public String sMiembro;
    public String sLibro;    
    String[] nPrestamo = new String[4];
    String[] libro = new String[2];
}
