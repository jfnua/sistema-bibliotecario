/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import BD.StmtSQL;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author fresh-fresh
 */
public class Devoluciones extends javax.swing.JPanel {

    /**
     * Creates new form Libros
     */
    public Devoluciones(StmtSQL cxn) {
        initComponents();
        setSize(630,460);
        this.cxn = cxn;
        new TextPrompt("   Buscar Devolución... ", txtf_buscadorDevolucion);
        configTable();
        setTableData("");
    }
    
    private void configTable(){
        model.addColumn("ID");
        model.addColumn("ID_MIEMBRO");        
        model.addColumn("ID_LIBRO");
        model.addColumn("NOMBRE_MIEMBRO");
        model.addColumn("TITULO_LIBRO");
        model.addColumn("FECHA_PRESTAMO");
        model.addColumn("FECHA_DEVOLUCION");
        model.addColumn("DIAS_RETRASO");
        model.addColumn("MULTA");
        table_devoluciones.setModel(model);
        TableColumnModel columnModel = table_devoluciones.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(35);
        columnModel.getColumn(1).setPreferredWidth(110);
        columnModel.getColumn(2).setPreferredWidth(110);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(150);
        columnModel.getColumn(5).setPreferredWidth(150);
        columnModel.getColumn(6).setPreferredWidth(150);
        columnModel.getColumn(7).setPreferredWidth(110);
        columnModel.getColumn(8).setPreferredWidth(75);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_buscadorPrestamo = new javax.swing.JPanel();
        txtf_buscadorDevolucion = new javax.swing.JTextField();
        btn_buscarDevolucion = new javax.swing.JLabel();
        cmb_ordenar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_devoluciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(101, 121, 146));
        setPreferredSize(new java.awt.Dimension(630, 460));

        panel_buscadorPrestamo.setBackground(new java.awt.Color(71, 91, 116));

        txtf_buscadorDevolucion.setBackground(new java.awt.Color(161, 181, 206));
        txtf_buscadorDevolucion.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        txtf_buscadorDevolucion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtf_buscadorDevolucion.setToolTipText("Buscar por nombre prestatario (miembro).");
        txtf_buscadorDevolucion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtf_buscadorDevolucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtf_buscadorDevolucionKeyTyped(evt);
            }
        });

        btn_buscarDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_25px_3.png"))); // NOI18N
        btn_buscarDevolucion.setToolTipText("Buscar");
        btn_buscarDevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscarDevolucionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarDevolucionMouseExited(evt);
            }
        });

        cmb_ordenar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmb_ordenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar por", "Titulo libro", "Nombre Prestatario", "Fecha de préstamo", "Fecha devolución" }));

        javax.swing.GroupLayout panel_buscadorPrestamoLayout = new javax.swing.GroupLayout(panel_buscadorPrestamo);
        panel_buscadorPrestamo.setLayout(panel_buscadorPrestamoLayout);
        panel_buscadorPrestamoLayout.setHorizontalGroup(
            panel_buscadorPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscadorPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtf_buscadorDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscarDevolucion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(cmb_ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_buscadorPrestamoLayout.setVerticalGroup(
            panel_buscadorPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panel_buscadorPrestamoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_buscadorPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_buscadorPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtf_buscadorDevolucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscarDevolucion, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );

        table_devoluciones.setBackground(new java.awt.Color(161, 181, 206));
        table_devoluciones.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        table_devoluciones.setModel(new javax.swing.table.DefaultTableModel(
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
        table_devoluciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(table_devoluciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_buscadorPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_buscadorPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void returnPreButtonStyle(javax.swing.JLabel btn, String filename, String font, int styleFont, int textSize, Color col){
        btn.setIcon(new ImageIcon(this.getClass().getResource(filename)));
        btn.setFont(new Font(font, styleFont, textSize));
        btn.setBackground(col);
    }
    
    private void btn_buscarDevolucionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarDevolucionMouseEntered
        btn_buscarDevolucion.setIcon(new ImageIcon(this.getClass().getResource("../icons/icons8_search_25px_1.png")));
    }//GEN-LAST:event_btn_buscarDevolucionMouseEntered

    private void btn_buscarDevolucionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarDevolucionMouseExited
        btn_buscarDevolucion.setIcon(new ImageIcon(this.getClass().getResource("../icons/icons8_search_25px_3.png")));
    }//GEN-LAST:event_btn_buscarDevolucionMouseExited

    private void setTableData(String texto){
        model.setRowCount(0);
        try {
            ResultSet rs = cxn.consultarDevoluciones(texto+"%");
            while(rs.next()){
                data[0] = rs.getString(1);
                data[2] = rs.getString(2);
                data[1] = rs.getString(3);
                data[4] = rs.getString(4);
                data[3] = rs.getString(5);
                data[5] = rs.getString(6);
                data[6] = rs.getString(7);
                data[7] = rs.getString(8);
                data[8] = rs.getString(9);
                model.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
    private void txtf_buscadorDevolucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtf_buscadorDevolucionKeyTyped
        if((int)evt.getKeyChar() != 8)
            textoBuscador = txtf_buscadorDevolucion.getText() + evt.getKeyChar();
        else
            textoBuscador = txtf_buscadorDevolucion.getText();
        setTableData(textoBuscador);
        if(txtf_buscadorDevolucion.getText().length() >= 150)
            evt.consume();
    }//GEN-LAST:event_txtf_buscadorDevolucionKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_buscarDevolucion;
    private javax.swing.JComboBox<String> cmb_ordenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_buscadorPrestamo;
    private javax.swing.JTable table_devoluciones;
    private javax.swing.JTextField txtf_buscadorDevolucion;
    // End of variables declaration//GEN-END:variables
    String[] data = new String[9];
    StmtSQL cxn;
    String textoBuscador;
    DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
}
