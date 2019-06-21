package ventanas;

import codigo.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar David
 */
public class VentanaDetallesEmp extends javax.swing.JFrame {

    public int anios[] = new int[80];
    public static Conexion cn = new Conexion();
    public static int numEmp = 0;
    public static String nombre= "";
    public static String diaN= "";
    public static String mesN= "";
    public static String anioN= "";
    public static String fechaN= "";
    public static String descrip = "";
    
    public VentanaDetallesEmp() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        inicializar();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpMesAnio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSelect = new javax.swing.JButton();
        cmbMotivo = new javax.swing.JComboBox();
        cmbDiaDetalle = new javax.swing.JComboBox();
        cmbMesDetalle = new javax.swing.JComboBox();
        cmbAnioDetalle = new javax.swing.JComboBox();
        btnCancelarDetalle = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescrip = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        lblOblig104 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        rbtnMes = new javax.swing.JRadioButton();
        rbtnAnio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        lblOblig103 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHorasExt = new javax.swing.JTextField();
        txtTempRetraso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblOblig102 = new javax.swing.JLabel();
        lblOblig101 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblOblig100 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumEmp = new javax.swing.JTextField();
        lblOblig105 = new javax.swing.JLabel();
        btnGuardarDetalle = new javax.swing.JButton();
        lblOblig106 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSelect.setText("Seleccionar");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 110, 25));

        cmbMotivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Alergia", "Inasistencia", "Amonestación", "Bono de mes", "Bono anual", "Retraso", "Horas extras", "Otro" }));
        jPanel1.add(cmbMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, -1));

        cmbDiaDetalle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDiaDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        cmbMesDetalle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(cmbMesDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        cmbAnioDetalle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel1.add(cmbAnioDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        btnCancelarDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnCancelarDetalle.setText("Cancelar");
        btnCancelarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDetalleActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, 44));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 50, 44));

        areaDescrip.setColumns(20);
        areaDescrip.setRows(5);
        jScrollPane1.setViewportView(areaDescrip);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 210, 120));

        jLabel5.setText("Descrición");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        lblOblig104.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig104.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig104.setText("*");
        jPanel1.add(lblOblig104, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 20, -1));
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 80, -1));

        btnGrpMesAnio.add(rbtnMes);
        rbtnMes.setText("Mes");
        jPanel1.add(rbtnMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        btnGrpMesAnio.add(rbtnAnio);
        rbtnAnio.setText("Año");
        jPanel1.add(rbtnAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel4.setText("Monto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lblOblig103.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig103.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig103.setText("*");
        jPanel1.add(lblOblig103, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 225, 20, -1));

        jLabel3.setText("Horas Extra");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 225, -1, -1));
        jPanel1.add(txtHorasExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 225, 80, -1));
        jPanel1.add(txtTempRetraso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 80, -1));

        jLabel1.setText("Tiempo de Retraso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lblOblig102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig102.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig102.setText("*");
        jPanel1.add(lblOblig102, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 20, -1));

        lblOblig101.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig101.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig101.setText("*");
        jPanel1.add(lblOblig101, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 20, -1));

        jLabel2.setText("Motivo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel24.setText("Fecha");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblOblig100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig100.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig100.setText("*");
        jPanel1.add(lblOblig100, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, -1));

        jLabel6.setText("Numero expediente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 20));
        jPanel1.add(txtNumEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 90, -1));

        lblOblig105.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig105.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig105.setText("*");
        jPanel1.add(lblOblig105, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 20, -1));

        btnGuardarDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diskette.png"))); // NOI18N
        btnGuardarDetalle.setText("Guardar");
        btnGuardarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDetalleActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, 44));

        lblOblig106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig106.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig106.setText("*");
        jPanel1.add(lblOblig106, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 20, -1));

        jLabel7.setText("Nombre");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ocultarCampObligDetalles(){
        lblOblig100.setVisible(false);
        lblOblig101.setVisible(false);
        lblOblig102.setVisible(false);
        lblOblig103.setVisible(false);
        lblOblig104.setVisible(false);
        lblOblig105.setVisible(false);       
        lblOblig106.setVisible(false);
    }
    
    private void mostrarCampObligSeleccion(){
        lblOblig100.setVisible(true);
        lblOblig101.setVisible(true);
        lblOblig105.setVisible(true);
    }
    
    private void limpiarCamposDetalles(){
        cmbDiaDetalle.setSelectedIndex(0);
        cmbMesDetalle.setSelectedIndex(0);
        cmbAnioDetalle.setSelectedIndex(0);
        cmbMotivo.setSelectedIndex(0);
        btnGrpMesAnio.clearSelection();
        txtTempRetraso.setText(null);
        txtHorasExt.setText(null);
        txtMonto.setText(null);
        areaDescrip.setText(null);
        txtNumEmp.setText(null);
        txtNombre.setText(null);
    }

    private void inicializar(){
        ocultarCampObligDetalles();
        txtNombre.setEnabled(false);
        txtTempRetraso.setEnabled(false);
        txtHorasExt.setEnabled(false);
        txtMonto.setEnabled(false);
        rbtnMes.setEnabled(false);
        rbtnAnio.setEnabled(false);
        areaDescrip.setEnabled(false);
        btnGuardarDetalle.setEnabled(false);
        llenarcmbAnios();
    }
    
    private void llenarcmbAnios(){
        
        for (int i = 1940; i < 2020; i++) {
            cmbAnioDetalle.addItem(i);
        }
    }
    
    private String asigMes(String mes){
        
        String mesAsignado="";
        
        switch(mes){
            case "Enero":mesAsignado="1";
                break;
            case "Febrero":mesAsignado="2";
                break;
            case "Marzo":mesAsignado="3";
                break;
            case "Abril":mesAsignado="4";
                break;
            case "Mayo":mesAsignado="5";
                break;
            case "Junio":mesAsignado="6";
                break;
            case "Julio":mesAsignado="7";
                break;
            case "Agosto":mesAsignado="8";
                break;
            case "Semptiembre":mesAsignado="9";
                break;
            case "Octubre":mesAsignado="10";
                break;
            case "Noviembre":mesAsignado="11";
                break;
            case "Diciembre":mesAsignado="12";
                break;
        }
        
        return mesAsignado;
    }
    
    private void captarDatos(){
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        int numEmp = Integer.parseInt(txtNumEmp.getText());
        String nombre2= txtNombre.getText().toUpperCase();
        String dia= cmbDiaDetalle.getSelectedItem().toString();
        String mes= asigMes(cmbMesDetalle.getSelectedItem().toString());
        String anio= cmbAnioDetalle.getSelectedItem().toString();
        String fecha= dia+'/'+mes+'/'+anio;
        String descrip2 = areaDescrip.getText().toUpperCase();
        System.out.println(numEmp+' '+nombre2+' '+fecha+' '+descrip2);
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        VentanaPrincipal principal = new VentanaPrincipal();
        
        this.dispose();
        principal.setVisible(true);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        
        String motivo = cmbMotivo.getSelectedItem().toString();
        
        inicializar();
        
        if ((txtNumEmp.getText().equals("")) || (cmbMotivo.getSelectedIndex() == 0) || 
                (cmbDiaDetalle.getSelectedIndex() == 0) || (cmbMesDetalle.getSelectedIndex() == 0) || 
                (cmbAnioDetalle.getSelectedIndex() == 0)){
            JOptionPane.showMessageDialog(null, "Ingrese todos los campops obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            mostrarCampObligSeleccion();
        }else{
            switch (motivo){
                case "Retraso": txtTempRetraso.setEnabled(true);areaDescrip.setEnabled(true);btnGuardarDetalle.setEnabled(true);
                    break;

                case "Horas extras": txtHorasExt.setEnabled(true);areaDescrip.setEnabled(true);btnGuardarDetalle.setEnabled(true);
                    break;

                case "Bono de mes": txtMonto.setEnabled(true); rbtnMes.setSelected(true);rbtnMes.setEnabled(true);areaDescrip.setEnabled(true);btnGuardarDetalle.setEnabled(true);
                    break;

                case "Bono anual": txtMonto.setEnabled(true); rbtnAnio.setSelected(true);rbtnAnio.setEnabled(true);areaDescrip.setEnabled(true);btnGuardarDetalle.setEnabled(true);
                    break;

                default: txtNombre.setEnabled(true);areaDescrip.setEnabled(true);btnGuardarDetalle.setEnabled(true);
                    break;
            }
        }
        
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnCancelarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDetalleActionPerformed
        limpiarCamposDetalles();
        ocultarCampObligDetalles();
        inicializar();
    }//GEN-LAST:event_btnCancelarDetalleActionPerformed

    private void btnGuardarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDetalleActionPerformed
        
        String motivo = cmbMotivo.getSelectedItem().toString();
        
        switch (motivo){
            case "Retraso": captarDatos();
                limpiarCamposDetalles();
                ocultarCampObligDetalles();
                inicializar();
                break;

            case "Horas extras": limpiarCamposDetalles();
                ocultarCampObligDetalles();
                inicializar();
                break;

            case "Bono de mes": limpiarCamposDetalles();
                                ocultarCampObligDetalles();
                                inicializar();
                break;

            case "Bono anual": limpiarCamposDetalles();
                                ocultarCampObligDetalles();
                                inicializar();
                break;

            default: captarDatos();
                {
                    try {
                        cn.ejecutarInsertCondMed(nombre, motivo, descrip);
                    } catch (SQLException ex) {
                        Logger.getLogger(VentanaDetallesEmp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                limpiarCamposDetalles();
                ocultarCampObligDetalles();
                inicializar();
                break;
        }
        
    }//GEN-LAST:event_btnGuardarDetalleActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDetallesEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDetallesEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDetallesEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDetallesEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDetallesEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescrip;
    private javax.swing.JButton btnCancelarDetalle;
    private javax.swing.ButtonGroup btnGrpMesAnio;
    private javax.swing.JButton btnGuardarDetalle;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox cmbAnioDetalle;
    private javax.swing.JComboBox cmbDiaDetalle;
    private javax.swing.JComboBox cmbMesDetalle;
    private javax.swing.JComboBox cmbMotivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOblig100;
    private javax.swing.JLabel lblOblig101;
    private javax.swing.JLabel lblOblig102;
    private javax.swing.JLabel lblOblig103;
    private javax.swing.JLabel lblOblig104;
    private javax.swing.JLabel lblOblig105;
    private javax.swing.JLabel lblOblig106;
    private javax.swing.JRadioButton rbtnAnio;
    private javax.swing.JRadioButton rbtnMes;
    private javax.swing.JTextField txtHorasExt;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumEmp;
    private javax.swing.JTextField txtTempRetraso;
    // End of variables declaration//GEN-END:variables
}
