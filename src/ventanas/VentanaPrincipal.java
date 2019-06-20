package ventanas;

import codigo.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar David
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    public static Conexion cn = new Conexion();
    public int numEmp = 1;
    
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Ceramicas Royale");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        incializacion();
        cn.conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumExp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblOblig3 = new javax.swing.JLabel();
        lblOblig7 = new javax.swing.JLabel();
        lblOblig2 = new javax.swing.JLabel();
        lblOblig6 = new javax.swing.JLabel();
        lblOblig4 = new javax.swing.JLabel();
        cmbDiaFecNac = new javax.swing.JComboBox();
        cmbMesFecNac = new javax.swing.JComboBox();
        cmbAnioFecNac = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cmbTsangre = new javax.swing.JComboBox();
        lblOblig5 = new javax.swing.JLabel();
        lblOblig8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txtTlf1 = new javax.swing.JTextField();
        lblOblig10 = new javax.swing.JLabel();
        cmbCodTlf = new javax.swing.JComboBox();
        lblOblig11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbEstudios = new javax.swing.JComboBox();
        lblOblig9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbEdoCivil = new javax.swing.JComboBox();
        lblOblig1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmbDiaFec = new javax.swing.JComboBox();
        cmbMesFec = new javax.swing.JComboBox();
        cmbAnioFec = new javax.swing.JComboBox();
        lblOblig12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox();
        lblOblig13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox();
        lblOblig14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnEliminiarEmp = new javax.swing.JButton();
        btnAgregarEmp = new javax.swing.JButton();
        btnBuscarEmp = new javax.swing.JButton();
        btnDetallesEmp = new javax.swing.JButton();
        btnModificarEmp = new javax.swing.JButton();
        btnCancelarEmp = new javax.swing.JButton();
        btnListarEmp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        lblOblig41 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNumSupervisor = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        lblOblig15 = new javax.swing.JLabel();
        cmbDiaReu = new javax.swing.JComboBox();
        cmbMesReu = new javax.swing.JComboBox();
        cmbAnioReu = new javax.swing.JComboBox();
        lblOblig17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtHoraF = new javax.swing.JTextField();
        txtHoraI = new javax.swing.JTextField();
        lblOblig18 = new javax.swing.JLabel();
        lblOblig16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMinutas = new javax.swing.JTextArea();
        btnBuscarReu = new javax.swing.JButton();
        lblOblig19 = new javax.swing.JLabel();
        btnAgregarReu = new javax.swing.JButton();
        btnCancelarReu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listReuniones = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        cmbTipoPieza = new javax.swing.JComboBox<String>();
        lblOblig35 = new javax.swing.JLabel();
        lblOblig36 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblOblig37 = new javax.swing.JLabel();
        lblOblig38 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lblOblig39 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lblOblig40 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        cmbTipoPlato = new javax.swing.JComboBox<String>();
        txtTipoPlato = new javax.swing.JTextField();
        txtTamanio = new javax.swing.JTextField();
        cmbTipoTaza = new javax.swing.JComboBox<String>();
        txtTipoTaza = new javax.swing.JTextField();
        cmbVolumen = new javax.swing.JComboBox<String>();
        txtVolumen = new javax.swing.JTextField();
        cmbCantPersonas = new javax.swing.JComboBox<String>();
        txtCantPersonas = new javax.swing.JTextField();
        btnCancelarPieza = new javax.swing.JButton();
        btnBuscarPieza = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnAgregarPieza = new javax.swing.JButton();
        btnEliminarPieza = new javax.swing.JButton();
        btnModificarPieza = new javax.swing.JButton();
        btnListarPieza = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblOblig20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblOblig21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtRIF = new javax.swing.JTextField();
        lblOblig22 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        lblOblig23 = new javax.swing.JLabel();
        txtTlf2 = new javax.swing.JTextField();
        cmbCodTlf2 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        lblOblig24 = new javax.swing.JLabel();
        cmbDiaContra = new javax.swing.JComboBox();
        cmbMesContra = new javax.swing.JComboBox();
        cmbAnioContra = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        txtFecCaducidad = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnCancelarContra = new javax.swing.JButton();
        btnEliminarContra = new javax.swing.JButton();
        btnAgregarClien = new javax.swing.JButton();
        btnModificarClien = new javax.swing.JButton();
        btnBuscarClien = new javax.swing.JButton();
        btnEliminarClien = new javax.swing.JButton();
        btnCancelarClien = new javax.swing.JButton();
        lblOblig25 = new javax.swing.JLabel();
        btnGenerarContra = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList();
        btnListarClien = new javax.swing.JButton();
        btnGurardarContra = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblOblig26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNumPedido = new javax.swing.JTextField();
        lblOblig27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cmbDiaPedido = new javax.swing.JComboBox();
        cmbMesPedido = new javax.swing.JComboBox();
        cmbAnioPedido = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        txtNomCliente1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cmbPais1 = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        txtRIF1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        cmbCodTlf3 = new javax.swing.JComboBox();
        txtTlf3 = new javax.swing.JTextField();
        lblOblig28 = new javax.swing.JLabel();
        lblOblig29 = new javax.swing.JLabel();
        lblOblig30 = new javax.swing.JLabel();
        lblOblig31 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox();
        lblOblig32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtDescuento2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGenerarPedido = new javax.swing.JButton();
        bntCancelarPedido = new javax.swing.JButton();
        btnGenerarFactura = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        lblTotalPedido = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lblFechaEntrega = new javax.swing.JLabel();
        cmbPiezaPedido = new javax.swing.JComboBox<String>();
        jLabel54 = new javax.swing.JLabel();
        lblOblig42 = new javax.swing.JLabel();
        lblOblig43 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        cmbCantPedido = new javax.swing.JComboBox<String>();
        cmbCantPedido1 = new javax.swing.JComboBox<String>();
        jLabel56 = new javax.swing.JLabel();
        lblOblig44 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cmbDiaFactura = new javax.swing.JComboBox();
        lblOblig33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        cmbMesFactura = new javax.swing.JComboBox();
        cmbAnioFactura = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        lblNumFactura = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lblTotalFactura = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtNumPedidoFact = new javax.swing.JTextField();
        btnLimpiarFact = new javax.swing.JButton();
        lblOblig34 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lblPaisClie = new javax.swing.JLabel();
        lblTlfClie = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lblNombreClie = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lblTlfClie1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnBuscarFact = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Numero expediente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel1.add(txtNumExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, -1));

        jLabel2.setText("Primer Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, -1));
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 170, -1));

        jLabel3.setText("Primer Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, -1));
        jPanel1.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        jLabel4.setText("Segundo Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, -1));
        jPanel1.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 170, -1));

        jLabel5.setText("Segundo Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 100, -1));
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 170, -1));

        jLabel6.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblOblig3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig3.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig3.setText("*");
        jPanel1.add(lblOblig3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 20, -1));

        lblOblig7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig7.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig7.setText("*");
        jPanel1.add(lblOblig7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 20, -1));

        lblOblig2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig2.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig2.setText("*");
        jPanel1.add(lblOblig2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, -1));

        lblOblig6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig6.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig6.setText("*");
        jPanel1.add(lblOblig6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, -1));

        lblOblig4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig4.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig4.setText("*");
        jPanel1.add(lblOblig4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 20, -1));

        cmbDiaFecNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDiaFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        cmbMesFecNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(cmbMesFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 90, -1));

        cmbAnioFecNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        cmbAnioFecNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioFecNacActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAnioFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 70, -1));

        jLabel12.setText("Tipo de Sangre");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        cmbTsangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(cmbTsangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        lblOblig5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig5.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig5.setText("*");
        jPanel1.add(lblOblig5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 20, -1));

        lblOblig8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig8.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig8.setText("*");
        jPanel1.add(lblOblig8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 20, -1));

        jLabel15.setText("Género");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Masc", "Feme", "Otro" }));
        jPanel1.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        jLabel16.setText("Telefono");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 60, -1));
        jPanel1.add(txtTlf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 130, -1));

        lblOblig10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig10.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig10.setText("*");
        jPanel1.add(lblOblig10, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 190, 20, -1));

        cmbCodTlf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "0414", "0424", "0412", "0416", "0426", "0212" }));
        jPanel1.add(cmbCodTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        lblOblig11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig11.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig11.setText("*");
        jPanel1.add(lblOblig11, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 190, 20, -1));

        jLabel19.setText("Estudios");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 50, -1));

        cmbEstudios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Bachiller", "Ing. Mecánico", "Ing. Químico", "Ing. Industrial", "Ing. Producción", "Geológo" }));
        jPanel1.add(cmbEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 120, -1));

        lblOblig9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig9.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig9.setText("*");
        jPanel1.add(lblOblig9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 20, -1));

        jLabel21.setText("Estado Cívil");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, -1));

        cmbEdoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Soltero", "Casado", "Divorciado", "Viudo" }));
        jPanel1.add(cmbEdoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 130, -1));

        lblOblig1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig1.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig1.setText("*");
        jPanel1.add(lblOblig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 20, -1));

        jLabel23.setText("Fecha");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, -1));

        cmbDiaFec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDiaFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        cmbMesFec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(cmbMesFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        cmbAnioFec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel1.add(cmbAnioFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 70, -1));

        lblOblig12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig12.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig12.setText("*");
        jPanel1.add(lblOblig12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 20, -1));

        jLabel25.setText("Cargo");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 60, -1));

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Gerente", "Secretaria", "Supervisor", "Hornero", "Op Generales", "Eléctricista", "Mecánico", "Inspector" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 110, -1));

        lblOblig13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig13.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig13.setText("*");
        jPanel1.add(lblOblig13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 20, -1));

        jLabel27.setText("Turno");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "1", "2", "3" }));
        jPanel1.add(cmbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 60, -1));

        lblOblig14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig14.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig14.setText("*");
        jPanel1.add(lblOblig14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 20, -1));

        jLabel29.setText("Salario");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 50, -1));
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 80, -1));

        btnEliminiarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deleteEmp.png"))); // NOI18N
        btnEliminiarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminiarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminiarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 70, 50));

        btnAgregarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aggEmp.png"))); // NOI18N
        btnAgregarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, 50));

        btnBuscarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 70, 50));

        btnDetallesEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        btnDetallesEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetallesEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 70, 50));

        btnModificarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editEmp.png"))); // NOI18N
        btnModificarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 70, 50));

        btnCancelarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnCancelarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 70, 50));

        btnListarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listEmp.png"))); // NOI18N
        btnListarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 70, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 730, 10));

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Primer Nombre", "Primer Apellido", "Segundo Apellido", "Fecha Ingreso", "Departamento", "Cargo", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 690, 150));

        lblOblig41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig41.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig41.setText("*");
        jPanel1.add(lblOblig41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 20, -1));

        jLabel57.setText("Departamento");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, -1));

        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Gerencia Gral.", "Gerencia Pta.", "Secretaria", "Gerencia Téc.", "Ctr Calidad", "Mantenimiento", "Almc. Insumos", "Almc. Prod.", "Selección", "Decoración", "Refinado", "Yesería", "Rotomoldeo", "Prep. Pasta", "Hornos" }));
        jPanel1.add(cmbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 110, -1));

        jTabbedPane1.addTab("Empleado", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Número Empleado \nSupervisor");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 180, 30));
        jPanel2.add(txtNumSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 100, -1));

        jLabel24.setText("Fecha");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblOblig15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig15.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig15.setText("*");
        jPanel2.add(lblOblig15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 20, -1));

        cmbDiaReu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(cmbDiaReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        cmbMesReu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel2.add(cmbMesReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        cmbAnioReu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel2.add(cmbAnioReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 60, -1));

        lblOblig17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig17.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig17.setText("*");
        jPanel2.add(lblOblig17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 20, -1));

        jLabel8.setText("Hora Fin");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel9.setText("Hora Inicio");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel2.add(txtHoraF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 100, -1));
        jPanel2.add(txtHoraI, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 100, -1));

        lblOblig18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig18.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig18.setText("*");
        jPanel2.add(lblOblig18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 20, -1));

        lblOblig16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig16.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig16.setText("*");
        jPanel2.add(lblOblig16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 20, -1));

        jLabel10.setText("Minutas");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        areaMinutas.setColumns(20);
        areaMinutas.setRows(5);
        jScrollPane2.setViewportView(areaMinutas);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 430, 190));

        btnBuscarReu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarReu.setText("Buscar");
        btnBuscarReu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReuActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 130, 50));

        lblOblig19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig19.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig19.setText("*");
        jPanel2.add(lblOblig19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 20, -1));

        btnAgregarReu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aggDoc.png"))); // NOI18N
        btnAgregarReu.setText("Guardar");
        btnAgregarReu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarReuActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 50));

        btnCancelarReu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnCancelarReu.setText("Cancelar");
        btnCancelarReu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReuActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 130, 50));

        jScrollPane3.setViewportView(listReuniones);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 160, 170));

        jTabbedPane1.addTab("Reunión", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setText("Pieza");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 40, 20));

        cmbTipoPieza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Jarra", "Tetera", "Azucarero", "Cazuela", "Bandeja", "Plato", "Ensaladera", "Taza" }));
        jPanel3.add(cmbTipoPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 110, -1));

        lblOblig35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig35.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig35.setText("*");
        jPanel3.add(lblOblig35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 20, 20));

        lblOblig36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig36.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig36.setText("*");
        jPanel3.add(lblOblig36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 20, 20));

        jLabel48.setText("Tipo de plato");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, 20));

        jLabel49.setText("Tamaño");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 20));

        lblOblig37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig37.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig37.setText("*");
        jPanel3.add(lblOblig37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 20, 20));

        lblOblig38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig38.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig38.setText("*");
        jPanel3.add(lblOblig38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 20, 20));

        jLabel50.setText("Tipo de Taza");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 20));

        lblOblig39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig39.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig39.setText("*");
        jPanel3.add(lblOblig39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 20, 20));

        jLabel51.setText("Volumen");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 20));

        lblOblig40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig40.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig40.setText("*");
        jPanel3.add(lblOblig40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 20, 20));

        jLabel52.setText("Cantidad de Personas");
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 140, 20));

        cmbTipoPlato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Hondo", "Llano", "Postre", "Presentación", "Taza Moka", "Pasta" }));
        jPanel3.add(cmbTipoPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, -1));
        jPanel3.add(txtTipoPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, -1));
        jPanel3.add(txtTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 110, -1));

        cmbTipoTaza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Café Cp", "Café Sp", "Té Cp", "Té Sp", "Moka Cp", "Moka Sp" }));
        jPanel3.add(cmbTipoTaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 90, -1));
        jPanel3.add(txtTipoTaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, -1));

        cmbVolumen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "1", "1.5" }));
        jPanel3.add(cmbVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, -1));
        jPanel3.add(txtVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 110, -1));

        cmbCantPersonas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "2", "6" }));
        jPanel3.add(cmbCantPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, -1));
        jPanel3.add(txtCantPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 110, -1));

        btnCancelarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnCancelarPieza.setText("Cancelar");
        btnCancelarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPiezaActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 140, 40));

        btnBuscarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarPieza.setText("Buscar");
        btnBuscarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPiezaActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 370, 140, 40));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Pieza"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable3);

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 230, 300));

        btnAgregarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addProd.png"))); // NOI18N
        btnAgregarPieza.setText("Agregar");
        btnAgregarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPiezaActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 40));

        btnEliminarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deleteProd.png"))); // NOI18N
        btnEliminarPieza.setText("Eliminar");
        btnEliminarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPiezaActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 430, 140, 40));

        btnModificarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifyProd.png"))); // NOI18N
        btnModificarPieza.setText("Modificar");
        btnModificarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPiezaActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 140, 40));

        btnListarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list.png"))); // NOI18N
        btnListarPieza.setText("Listar");
        btnListarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPiezaActionPerformed(evt);
            }
        });
        jPanel3.add(btnListarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 140, 40));

        jTabbedPane1.addTab("Piezas", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOblig20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig20.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig20.setText("*");
        jPanel4.add(lblOblig20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, -1));

        jLabel11.setText("Nombre");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));
        jPanel4.add(txtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 180, -1));

        jLabel13.setText("País");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lblOblig21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig21.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig21.setText("*");
        jPanel4.add(lblOblig21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 20, -1));

        jLabel14.setText("RIF");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        jPanel4.add(txtRIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, -1));

        lblOblig22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig22.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig22.setText("*");
        jPanel4.add(lblOblig22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 20, -1));

        cmbPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Colombia", "Estados Unidos", "Rep. Dominicana", "Venezuela" }));
        jPanel4.add(cmbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, -1));

        jLabel17.setText("Teléfono");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        lblOblig23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig23.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig23.setText("*");
        jPanel4.add(lblOblig23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 20, -1));
        jPanel4.add(txtTlf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, -1));

        cmbCodTlf2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "0414", "0424", "0412", "0416", "0426", "0212" }));
        jPanel4.add(cmbCodTlf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 670, 10));

        jLabel26.setText("Fecha de Contrato");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lblOblig24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig24.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig24.setText("*");
        jPanel4.add(lblOblig24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 20, -1));

        cmbDiaContra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel4.add(cmbDiaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        cmbMesContra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel4.add(cmbMesContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        cmbAnioContra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel4.add(cmbAnioContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 70, -1));

        jLabel18.setText("Fecha de Caducidad");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        txtFecCaducidad.setEditable(false);
        jPanel4.add(txtFecCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 150, -1));

        jLabel20.setText("Duración");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));
        jPanel4.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 60, 10));

        jLabel22.setText("Descuento");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));
        jPanel4.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 50, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("%");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        btnCancelarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnCancelarContra.setText("Cancelar");
        btnCancelarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarContraActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 130, 40));

        btnEliminarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deleteDoc.png"))); // NOI18N
        btnEliminarContra.setText("Eliminar");
        btnEliminarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContraActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 130, 40));

        btnAgregarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agg.png"))); // NOI18N
        btnAgregarClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 40));

        btnModificarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        btnModificarClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 40));

        btnBuscarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 40));

        btnEliminarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminarClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 40));

        btnCancelarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnCancelarClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, 40));

        lblOblig25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig25.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig25.setText("*");
        jPanel4.add(lblOblig25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 20, -1));

        btnGenerarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Report.gif"))); // NOI18N
        btnGenerarContra.setText("Generar Contrato");
        btnGenerarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarContraActionPerformed(evt);
            }
        });
        jPanel4.add(btnGenerarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 170, -1));

        jScrollPane5.setViewportView(listClientes);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 160, 170));

        btnListarClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list.png"))); // NOI18N
        btnListarClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClienActionPerformed(evt);
            }
        });
        jPanel4.add(btnListarClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 60, 40));

        btnGurardarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aggDoc.png"))); // NOI18N
        btnGurardarContra.setText("Guardar");
        btnGurardarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGurardarContraActionPerformed(evt);
            }
        });
        jPanel4.add(btnGurardarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 130, 40));

        jTabbedPane1.addTab("Clientes", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOblig26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig26.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig26.setText("*");
        jPanel5.add(lblOblig26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 20, -1));

        jLabel30.setText("Numero de Pedido");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel5.add(txtNumPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, -1));

        lblOblig27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig27.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig27.setText("*");
        jPanel5.add(lblOblig27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 20, -1));

        jLabel31.setText("Fecha de Emisión");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        cmbDiaPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel5.add(cmbDiaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        cmbMesPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel5.add(cmbMesPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 90, -1));

        cmbAnioPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel5.add(cmbAnioPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 70, -1));

        jLabel32.setText("Nombre");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtNomCliente1.setEditable(false);
        jPanel5.add(txtNomCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 160, -1));

        jLabel33.setText("País");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        cmbPais1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Colombia", "Estados Unidos", "Rep. Dominicana", "Venezuela" }));
        jPanel5.add(cmbPais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, -1));

        jLabel34.setText("RIF");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtRIF1.setEditable(false);
        jPanel5.add(txtRIF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, -1));

        jLabel35.setText("Teléfono");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        cmbCodTlf3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "0414", "0424", "0412", "0416", "0426", "0212" }));
        jPanel5.add(cmbCodTlf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        txtTlf3.setEditable(false);
        jPanel5.add(txtTlf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 180, -1));

        lblOblig28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig28.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig28.setText("*");
        jPanel5.add(lblOblig28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 20, -1));

        lblOblig29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig29.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig29.setText("*");
        jPanel5.add(lblOblig29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 20, -1));

        lblOblig30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig30.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig30.setText("*");
        jPanel5.add(lblOblig30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 20, -1));

        lblOblig31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig31.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig31.setText("*");
        jPanel5.add(lblOblig31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 20, -1));

        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Nuevo Cliente" }));
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });
        jPanel5.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, -1));

        lblOblig32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig32.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig32.setText("*");
        jPanel5.add(lblOblig32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 20, -1));

        jLabel36.setText(" Descuento");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        txtDescuento2.setEditable(false);
        jPanel5.add(txtDescuento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 50, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("%");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pieza", "Cantidad", "Precio Unit.", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 540, 170));

        btnGenerarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Report.gif"))); // NOI18N
        btnGenerarPedido.setText("Generar Pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });
        jPanel5.add(btnGenerarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 160, 40));

        bntCancelarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        bntCancelarPedido.setText("Cancelar");
        bntCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarPedidoActionPerformed(evt);
            }
        });
        jPanel5.add(bntCancelarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 160, 40));

        btnGenerarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturar.png"))); // NOI18N
        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });
        jPanel5.add(btnGenerarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 180, 40));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Monto Total ");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, 30));

        lblTotalPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(lblTotalPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 100, 40));

        jLabel53.setText("Fecha est. entrega");
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 65, 110, -1));
        jPanel5.add(lblFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 65, 150, 20));

        cmbPiezaPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel5.add(cmbPiezaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 100, -1));

        jLabel54.setText("Pieza");
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 50, -1));

        lblOblig42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig42.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig42.setText("*");
        jPanel5.add(lblOblig42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 20, -1));

        lblOblig43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig43.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig43.setText("*");
        jPanel5.add(lblOblig43, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 20, -1));

        jLabel55.setText("Cantidad");
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 70, -1));

        cmbCantPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel5.add(cmbCantPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 100, -1));

        cmbCantPedido1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel5.add(cmbCantPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 100, -1));

        jLabel56.setText("Tipo");
        jPanel5.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 50, -1));

        lblOblig44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig44.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig44.setText("*");
        jPanel5.add(lblOblig44, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 20, -1));

        jTabbedPane1.addTab("Pedidos", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbDiaFactura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel6.add(cmbDiaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        lblOblig33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig33.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig33.setText("*");
        jPanel6.add(lblOblig33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 20, 20));

        jLabel39.setText("Fecha de Emisión");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        cmbMesFactura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel6.add(cmbMesFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 90, -1));

        cmbAnioFactura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jPanel6.add(cmbAnioFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 70, -1));

        jLabel40.setText("Número Factura");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));
        jPanel6.add(lblNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Monto Total");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 130, 30));
        jPanel6.add(lblTotalFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 140, 30));

        jLabel41.setText("Número Pedido");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 20));
        jPanel6.add(txtNumPedidoFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));

        btnLimpiarFact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        btnLimpiarFact.setText("Cancelar");
        btnLimpiarFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarFactActionPerformed(evt);
            }
        });
        jPanel6.add(btnLimpiarFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 120, 40));

        lblOblig34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOblig34.setForeground(new java.awt.Color(255, 0, 0));
        lblOblig34.setText("*");
        jPanel6.add(lblOblig34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 20, -1));

        jLabel43.setText("Nombre");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, -1));

        jLabel44.setText("País");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 30, -1));
        jPanel6.add(lblPaisClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 190, 20));
        jPanel6.add(lblTlfClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 190, 20));

        jLabel45.setText("Teléfono");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 20));
        jPanel6.add(lblNombreClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, 20));

        jLabel46.setText("Teléfono");
        jPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));
        jPanel6.add(lblTlfClie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable2);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 640, 210));

        btnBuscarFact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscarFact.setText("Buscar");
        btnBuscarFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFactActionPerformed(evt);
            }
        });
        jPanel6.add(btnBuscarFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 120, 40));

        jTabbedPane1.addTab("Factura", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void incializacion(){
        ocultarCampOblig();
        cmbTurno.setEnabled(false);
        txtNumExp.setEditable(false);
        txtNumExp.setText(String.valueOf(numEmp));
        cmbPais1.setEnabled(false);
        txtRIF1.setEnabled(false);
        cmbCodTlf3.setEnabled(false);
        txtTlf3.setEnabled(false);
        llenarcmbAnios();
    }
    
    private void llenarcmbAnios(){
        
        for (int i = 1940; i < 2020; i++) {
            cmbAnioFec.addItem(i);
            cmbAnioFecNac.addItem(i);
            cmbAnioReu.addItem(i);
            cmbAnioContra.addItem(i);
            cmbAnioPedido.addItem(i);
            cmbAnioFactura.addItem(i);
        }
    }
    
    private void ocultarCampOblig(){
        ocultarCampObligEmp();
        ocultarCampObligReu();
        ocultarCampObligPiezas();
        ocultarCampObligClie();
        ocultarCampObligPedido();
        ocultarCampObligFactura();
    }
    
    private void ocultarCampObligEmp(){
        lblOblig1.setVisible(false);
        lblOblig2.setVisible(false);
        lblOblig3.setVisible(false);
        lblOblig4.setVisible(false);
        lblOblig5.setVisible(false);
        lblOblig6.setVisible(false);
        lblOblig7.setVisible(false);
        lblOblig8.setVisible(false);
        lblOblig9.setVisible(false);
        lblOblig10.setVisible(false);
        lblOblig11.setVisible(false);
        lblOblig12.setVisible(false);
        lblOblig13.setVisible(false);
        lblOblig14.setVisible(false);
        lblOblig41.setVisible(false);
    }
    
    private void mostrarCampObligEmp(){
        lblOblig1.setVisible(true);
        lblOblig2.setVisible(true);
        lblOblig3.setVisible(true);
        lblOblig4.setVisible(true);
        lblOblig5.setVisible(true);
        lblOblig6.setVisible(true);
        lblOblig7.setVisible(true);
        lblOblig8.setVisible(true);
        lblOblig9.setVisible(true);
        lblOblig10.setVisible(true);
        lblOblig11.setVisible(true);
        lblOblig12.setVisible(true);
        lblOblig13.setVisible(true);
        lblOblig14.setVisible(true);
        lblOblig41.setVisible(true);
    }
    
    private void limpiarCamposEmp(){
        txtNombre1.setText(null);
        txtApellido1.setText(null);
        txtNombre2.setText(null);
        txtApellido2.setText(null);
        txtTlf1.setText(null);
        cmbDiaFec.setSelectedIndex(0);
        cmbMesFec.setSelectedIndex(0);
        cmbAnioFec.setSelectedIndex(0);
        cmbDiaFecNac.setSelectedIndex(0);
        cmbMesFecNac.setSelectedIndex(0);
        cmbAnioFecNac.setSelectedIndex(0);
        cmbTsangre.setSelectedIndex(0);
        cmbGenero.setSelectedIndex(0);
        cmbEdoCivil.setSelectedIndex(0);
        cmbCodTlf.setSelectedIndex(0);
        cmbEstudios.setSelectedIndex(0);
        cmbDepartamento.setSelectedIndex(0);
        cmbCargo.setSelectedIndex(0);
        cmbTurno.setSelectedIndex(0);
        txtSalario.setText(null);
    }
    
    private void deshabilitarCampEmp(){
        txtNumExp.setEditable(false);
        txtNombre1.setEditable(false);
        txtNombre2.setEditable(false);
        txtApellido1.setEditable(false);
        txtApellido2.setEditable(false);
        txtTlf1.setEditable(false);
        txtSalario.setEditable(false);
    }
    
    private void ocultarCampObligReu(){
        lblOblig15.setVisible(false);
        lblOblig16.setVisible(false);
        lblOblig17.setVisible(false);
        lblOblig18.setVisible(false);
        lblOblig19.setVisible(false);
    }
    
    private void mostrarCampObligReu(){
        lblOblig15.setVisible(true);
        lblOblig16.setVisible(true);
        lblOblig17.setVisible(true);
        lblOblig18.setVisible(true);
        lblOblig19.setVisible(true);
    }
    
    private void limpiarCamposReu(){
        txtNumSupervisor.setText(null);
        txtHoraI.setText(null);
        txtHoraF.setText(null);
        areaMinutas.setText(null);
        cmbDiaReu.setSelectedIndex(0);
        cmbMesReu.setSelectedIndex(0);
        cmbAnioReu.setSelectedIndex(0);
    }
    
    private void mostrarCampObligPiezas(){
        lblOblig35.setVisible(true);
        lblOblig36.setVisible(true);
        lblOblig37.setVisible(true);
        lblOblig38.setVisible(true);
        lblOblig39.setVisible(true);
        lblOblig40.setVisible(true);
    }
    
    private void ocultarCampObligPiezas(){
        lblOblig35.setVisible(false);
        lblOblig36.setVisible(false);
        lblOblig37.setVisible(false);
        lblOblig38.setVisible(false);
        lblOblig39.setVisible(false);
        lblOblig40.setVisible(false);
    }
    
    private void limpiarCamposPiezas(){
        txtTipoPlato.setText(null);
        txtTamanio.setText(null);
        txtApellido1.setText(null);
        txtTipoTaza.setText(null);
        txtVolumen.setText(null);
        txtCantPersonas.setText(null);
        cmbTipoPieza.setSelectedIndex(0);
        cmbTipoPlato.setSelectedIndex(0);
        cmbTipoTaza.setSelectedIndex(0);
        cmbVolumen.setSelectedIndex(0);
        cmbCantPersonas.setSelectedIndex(0);
    }
    
    private void ocultarCampObligClie(){
        lblOblig20.setVisible(false);
        lblOblig21.setVisible(false);
        lblOblig22.setVisible(false);
        lblOblig23.setVisible(false);
        lblOblig24.setVisible(false);
        lblOblig25.setVisible(false);
    }
    
    private void mostrarCampObligClie(){
        lblOblig20.setVisible(true);
        lblOblig21.setVisible(true);
        lblOblig22.setVisible(true);
        lblOblig23.setVisible(true);
        lblOblig24.setVisible(true);
        lblOblig25.setVisible(true);
    }
    
    private void limpiarCamposClie(){
        txtNomCliente.setText(null);
        cmbPais.setSelectedIndex(0);
        txtRIF.setText(null);
        cmbCodTlf2.setSelectedIndex(0);
        txtTlf2.setText(null);
        txtDescuento.setText(null);
    }
    
    private void ocultarCampObligPedido(){
        lblOblig26.setVisible(false);
        lblOblig27.setVisible(false);
        lblOblig28.setVisible(false);
        lblOblig29.setVisible(false);
        lblOblig30.setVisible(false);
        lblOblig31.setVisible(false);
        lblOblig32.setVisible(false);
        lblOblig42.setVisible(false);
        lblOblig43.setVisible(false);
        lblOblig44.setVisible(false);
    }
    
    private void mostrarCampObligPedido(){
        lblOblig26.setVisible(true);
        lblOblig27.setVisible(true);
        lblOblig28.setVisible(true);
        lblOblig29.setVisible(true);
        lblOblig30.setVisible(true);
        lblOblig31.setVisible(true);
        lblOblig32.setVisible(true);
    }
    
    private void limpiarCamposPedido(){
        txtNumPedido.setText(null);
        cmbClientes.setSelectedIndex(0);
        cmbPais1.setSelectedIndex(0);
        cmbCodTlf3.setSelectedIndex(0);
        cmbDiaPedido.setSelectedIndex(0);
        cmbMesPedido.setSelectedIndex(0);
        cmbAnioPedido.setSelectedIndex(0);
    }
    
    private void nuevoClientePedido(){
        txtNomCliente1.setEnabled(true);
        cmbPais1.setEnabled(true);
        cmbCodTlf3.setEnabled(true);
        txtTlf3.setEnabled(true);
    }
    
    private void ocultarCampObligFactura(){
        lblOblig33.setVisible(false);
        lblOblig34.setVisible(false);
    }
    
    private void mostrarCampObligFactura(){
        lblOblig33.setVisible(true);
        lblOblig34.setVisible(true);
    }
    
    private void limpiarCamposFactura(){
        txtNumPedidoFact.setText(null);
        cmbDiaFactura.setSelectedIndex(0);
        cmbMesFactura.setSelectedIndex(0);
        cmbAnioFactura.setSelectedIndex(0);
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
    
    private void insertTableLista(ResultSet resultado) throws SQLException{
        ResultSet result = resultado;
        DefaultTableModel modeloTabla = new DefaultTableModel();
        Object[] registro = new Object[6];
        
        tblEmpleados.setModel(modeloTabla);
        modeloTabla.addColumn("Primer Nombre");
        modeloTabla.addColumn("Primer Apellido");
        modeloTabla.addColumn("Segundo Apellido");
        modeloTabla.addColumn("Fecha Ingreso");
        modeloTabla.addColumn("Departamento");
        modeloTabla.addColumn("Cargo");

        while (result.next()) {
            registro[0] = result.getString("PRI_NOMBRE");
            registro[1] = result.getString("PRI_APELLIDO");
            registro[2] = result.getString("SEG_APELLIDO");
            registro[3] = result.getString("FECHAI");
            registro[4] = result.getString("NOMBRE");
            registro[5] = result.getString("CARGO");
            modeloTabla.addRow(registro);
        }
    }
    
    private void insertTableBuscar(ResultSet resultado) throws SQLException{
        ResultSet result = resultado;
        DefaultTableModel modeloTabla = new DefaultTableModel();
        Object[] registro = new Object[7];
        
        tblEmpleados.setModel(modeloTabla);
        modeloTabla.addColumn("Primer Nombre");
        modeloTabla.addColumn("Primer Apellido");
        modeloTabla.addColumn("Segundo Apellido");
        modeloTabla.addColumn("Fecha Ingreso");
        modeloTabla.addColumn("Departamento");
        modeloTabla.addColumn("Cargo");

        while (result.next()) {
            registro[0] = result.getString("PRI_NOMBRE");
            registro[1] = result.getString("PRI_APELLIDO");
            registro[2] = result.getString("SEG_APELLIDO");
            registro[3] = result.getString("FECHAI");
            registro[4] = result.getString("NOMBRE");
            registro[5] = result.getString("CARGO");
            modeloTabla.addRow(registro);
        }
    }
    
    //MÓDULO EMPLEADO
    private void btnAgregarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpActionPerformed
        
        if ((txtNombre1.getText().equals("")) || (txtNombre2.getText().equals("")) || 
                (txtApellido1.getText().equals("")) || (txtApellido2.getText().equals("")) || 
                (txtNombre2.getText().equals("")) || (cmbDiaFec.getSelectedItem().toString().equals("--")) ||
                (cmbMesFec.getSelectedItem().toString().equals("--")) || (cmbAnioFec.getSelectedItem().toString().equals("--")) ||
                (cmbDiaFec.getSelectedItem().toString().equals("--")) ||  (cmbDiaFecNac.getSelectedItem().toString().equals("--")) || 
                (cmbMesFecNac.getSelectedItem().toString().equals("--")) ||  (cmbAnioFecNac.getSelectedItem().toString().equals("--")) ||
                (cmbDiaFec.getSelectedItem().toString().equals("--")) || (cmbTsangre.getSelectedItem().toString().equals("--")) || 
                (cmbGenero.getSelectedItem().toString().equals("--")) || (cmbEdoCivil.getSelectedItem().toString().equals("--")) || 
                (cmbCodTlf.getSelectedItem().toString().equals("--")) || (txtTlf1.getText().equals("")) || 
                (cmbEstudios.getSelectedItem().toString().equals("--")) || (cmbDepartamento.getSelectedItem().toString().equals("--")) || 
                (cmbCargo.getSelectedItem().toString().equals("--")) || (txtSalario.getText().equals("--"))
            ){
            
            //Faltan Campos Obligatorios
            JOptionPane.showMessageDialog(null, "Ingrese todos los campops obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            mostrarCampObligEmp();
 
        } else if (!((txtNombre1.getText().equals("")) || (txtNombre2.getText().equals("")) || 
                (txtApellido1.getText().equals("")) || (txtApellido2.getText().equals("")) || 
                (txtNombre2.getText().equals("")) || (cmbDiaFec.getSelectedItem().toString().equals("--")) ||
                (cmbMesFec.getSelectedItem().toString().equals("--")) || (cmbAnioFec.getSelectedItem().toString().equals("--")) ||
                (cmbDiaFec.getSelectedItem().toString().equals("--")) ||  (cmbDiaFecNac.getSelectedItem().toString().equals("--")) || 
                (cmbMesFecNac.getSelectedItem().toString().equals("--")) ||  (cmbAnioFecNac.getSelectedItem().toString().equals("--")) ||
                (cmbDiaFec.getSelectedItem().toString().equals("--")) || (cmbTsangre.getSelectedItem().toString().equals("--")) || 
                (cmbGenero.getSelectedItem().toString().equals("--")) || (cmbEdoCivil.getSelectedItem().toString().equals("--")) || 
                (cmbCodTlf.getSelectedItem().toString().equals("--")) || (txtTlf1.getText().equals("")) || 
                (cmbEstudios.getSelectedItem().toString().equals("--")) || (cmbDepartamento.getSelectedItem().toString().equals("--")) || 
                (cmbCargo.getSelectedItem().toString().equals("--")) || (txtSalario.getText().equals("--")))){
                
                //Agregó los campos necesarios
                
                String nom1= txtNombre1.getText().toUpperCase();
                String ape1= txtApellido1.getText().toUpperCase();
                String nom2= txtNombre2.getText().toUpperCase();
                String ape2= txtApellido2.getText().toUpperCase();
                String dia= cmbDiaFec.getSelectedItem().toString();
                String mes= asigMes(cmbMesFec.getSelectedItem().toString());
                String anio= cmbAnioFec.getSelectedItem().toString();
                String fechai= dia+'/'+mes+'/'+anio;
                String diaN= cmbDiaFec.getSelectedItem().toString();
                String mesN= asigMes(cmbMesFec.getSelectedItem().toString());
                String anioN= cmbAnioFec.getSelectedItem().toString();
                String fechaN= diaN+'/'+mesN+'/'+anioN;
                String tsangre= cmbTsangre.getSelectedItem().toString();
                String genero= cmbGenero.getSelectedItem().toString().toUpperCase();
                String civil= cmbEdoCivil.getSelectedItem().toString().toUpperCase();
                String estudios= cmbEstudios.getSelectedItem().toString().toUpperCase();
                String dep= cmbDepartamento.getSelectedItem().toString().toUpperCase();
                String cargo = cmbCargo.getSelectedItem().toString().toUpperCase();
                String turno= cmbTurno.getSelectedItem().toString();
                String cod = cmbCodTlf.getSelectedItem().toString();
                String num = txtTlf1.getText();
                double sal = Double.parseDouble(txtSalario.getText());
                System.out.println(nom1+' '+ nom2+' '+ape1+' '+ape2);
                System.out.println(fechai+' '+ fechaN+' '+ dep+' '+sal);
                System.out.println(tsangre+' '+ genero+' '+civil+' '+estudios);
                System.out.println(cod+ ' '+ num);

                
                try {
                    if(!(cargo.equals("HORNERO"))){
                        cn.ejecutarInsertEmp(numEmp, nom1, ape1, ape2, fechaN, tsangre, genero, civil, estudios, nom2);
                        cn.ejecutarInsertEmpTlf(cod, num, numEmp);
                        cn.ejecutarInsertEmpHisTra(fechai, sal, cargo, dep, numEmp);
                    }else{
                        cn.ejecutarInsertEmp(numEmp, nom1, ape1, ape2, fechaN, tsangre, genero, civil, estudios, nom2);
                        cn.ejecutarInsertEmpTlf(cod, num, numEmp);
                        cn.ejecutarInsertEmpHisTra(fechai, sal, cargo, dep, numEmp);
                        cn.ejecutarInsertEmpHisTur(fechai, turno, numEmp);
                        System.out.println("es HORNERO");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
                JOptionPane.showMessageDialog(null, "Empleado agregado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                limpiarCamposEmp();
                ocultarCampObligEmp();
                numEmp++;
                txtNumExp.setText(String.valueOf(numEmp));
        }
        
    }//GEN-LAST:event_btnAgregarEmpActionPerformed

    private void btnBuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpActionPerformed
        
        String empleado= JOptionPane.showInputDialog("Indique el empleado que desea buscar");
        
        if(empleado!= null){
            int empBuscar = Integer.parseInt(empleado);
       
            txtNumExp.setText(empleado);
            
            try {
                
                ResultSet result= cn.ejecutarSelectEmp(empBuscar);
                
                while(result.next()){
                    txtNombre1.setText(result.getString("PRI_NOMBRE")); 
                    txtNombre2.setText(result.getString("SEG_NOMBRE"));
                    txtApellido1.setText(result.getString("PRI_APELLIDO")); 
                    txtApellido2.setText(result.getString("SEG_APELLIDO")); 
                    txtTlf1.setText(result.getString("NUMERO")); 
                    txtSalario.setText(result.getString("SALARIO")); 
                }
                
                deshabilitarCampEmp();
                
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println(empleado);
        }
        
    }//GEN-LAST:event_btnBuscarEmpActionPerformed

    private void btnModificarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpActionPerformed
       
        if ((txtNombre1.getText().equals("")) || (txtNombre2.getText().equals("")) || 
                (txtApellido1.getText().equals("")) || (txtApellido2.getText().equals("")) || 
                (txtNombre2.getText().equals("")) || (cmbDiaFec.getSelectedItem().toString().equals("--")) ||
                (cmbMesFec.getSelectedItem().toString().equals("--")) || (cmbAnioFec.getSelectedItem().toString().equals("--")) ||
                (cmbDiaFec.getSelectedItem().toString().equals("--")) ||  (cmbDiaFecNac.getSelectedItem().toString().equals("--")) || 
                (cmbMesFecNac.getSelectedItem().toString().equals("--")) ||  (cmbAnioFecNac.getSelectedItem().toString().equals("--")) ||
                (cmbDiaFec.getSelectedItem().toString().equals("--")) || (cmbTsangre.getSelectedItem().toString().equals("--")) || 
                (cmbGenero.getSelectedItem().toString().equals("--")) || (cmbEdoCivil.getSelectedItem().toString().equals("--")) || 
                (cmbCodTlf.getSelectedItem().toString().equals("--")) || (txtTlf1.getText().equals("")) || 
                (cmbEstudios.getSelectedItem().toString().equals("--")) || (cmbCargo.getSelectedItem().toString().equals("--")) || 
                (txtSalario.getText().equals("--"))
            ){
            
            //Faltan Campos Obligatorios
            JOptionPane.showMessageDialog(null, "Ingrese todos los campops obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            mostrarCampObligEmp();
 
        } else if (!((txtNombre1.getText().equals("")) && (txtNombre2.getText().equals("")) && 
                (txtApellido1.getText().equals("")) && (txtApellido2.getText().equals("")) && 
                (txtNombre2.getText().equals("")) && (cmbDiaFec.getSelectedItem().toString().equals("--")) &&
                (cmbMesFec.getSelectedItem().toString().equals("--")) && (cmbAnioFec.getSelectedItem().toString().equals("--")) &&
                (cmbDiaFec.getSelectedItem().toString().equals("--")) &&  (cmbDiaFecNac.getSelectedItem().toString().equals("--")) && 
                (cmbMesFecNac.getSelectedItem().toString().equals("--")) && (cmbAnioFecNac.getSelectedItem().toString().equals("--")) &&
                (cmbDiaFec.getSelectedItem().toString().equals("--")) && (cmbTsangre.getSelectedItem().toString().equals("--")) && 
                (cmbGenero.getSelectedItem().toString().equals("--")) && (cmbEdoCivil.getSelectedItem().toString().equals("--")) && 
                (cmbCodTlf.getSelectedItem().toString().equals("--")) && (txtTlf1.getText().equals("")) && 
                (cmbEstudios.getSelectedItem().toString().equals("--")) && (cmbCargo.getSelectedItem().toString().equals("--")) && 
                (txtSalario.getText().equals("--")))) {
                //Agrego los campos necesarios
                
                String nom1= txtNombre1.getText().toUpperCase();
                String ape1= txtApellido1.getText().toUpperCase();
                String nom2= txtNombre2.getText().toUpperCase();
                String ape2= txtApellido2.getText().toUpperCase();
                String dia= cmbDiaFec.getSelectedItem().toString();
                String mes= asigMes(cmbMesFec.getSelectedItem().toString());
                String anio= cmbAnioFec.getSelectedItem().toString();
                String fechai= dia+'/'+mes+'/'+anio;
                String diaN= cmbDiaFec.getSelectedItem().toString();
                String mesN= asigMes(cmbMesFec.getSelectedItem().toString());
                String anioN= cmbAnioFec.getSelectedItem().toString();
                String fechaN= diaN+'/'+mesN+'/'+anioN;
                String tsangre= cmbTsangre.getSelectedItem().toString();
                String genero= cmbGenero.getSelectedItem().toString().toUpperCase();
                String civil= cmbEdoCivil.getSelectedItem().toString().toUpperCase();
                String estudios= cmbEstudios.getSelectedItem().toString().toUpperCase();
                String dep= cmbDepartamento.getSelectedItem().toString().toUpperCase();
                String cargo = cmbCargo.getSelectedItem().toString().toUpperCase();
                String turno= cmbTurno.getSelectedItem().toString();
                String cod = cmbCodTlf.getSelectedItem().toString();
                String num = txtTlf1.getText();
                double sal = Double.parseDouble(txtSalario.getText());
                System.out.println(nom1+' '+ nom2+' '+ape1+' '+ape2);
                System.out.println(fechai+' '+ fechaN+' '+ dep+' '+sal);
                System.out.println(tsangre+' '+ genero+' '+civil+' '+estudios);
                System.out.println(cod+ ' '+ num);
                
                try {
                    if(!(cargo.equals("HORNERO"))){
                        cn.ejecutarUpdateEmp(numEmp, nom1, ape1, ape2, fechaN, tsangre, genero, civil, estudios, nom2);
                        cn.ejecutarUpdateEmpTlf(cod, num, numEmp);
                        cn.ejecutarUpdateEmpHisTra(fechai, sal, cargo, dep, numEmp);
                    }else{
                        cn.ejecutarUpdateEmp(numEmp, nom1, ape1, ape2, fechaN, tsangre, genero, civil, estudios, nom2);
                        cn.ejecutarUpdateEmpTlf(cod, num, numEmp);
                        cn.ejecutarUpdateEmpHisTra(fechai, sal, cargo, dep, numEmp);
                        cn.ejecutarUpdateEmpHisTur(fechai, turno, numEmp);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
                JOptionPane.showMessageDialog(null, "Empleado modificado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                limpiarCamposEmp();
                ocultarCampObligEmp();
        }
    }//GEN-LAST:event_btnModificarEmpActionPerformed

    private void btnEliminiarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminiarEmpActionPerformed
        
        String empleado= JOptionPane.showInputDialog("Indique el empleado que desea eliminar");
        
        if(empleado!= null){
            int empEliminar = Integer.parseInt(empleado);
            
            try {
                cn.ejecutarDeleteEmp(empEliminar);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(empEliminar);   
        }else{
            System.out.println(empleado);
        }
        
    }//GEN-LAST:event_btnEliminiarEmpActionPerformed

    private void btnCancelarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmpActionPerformed
        ocultarCampObligEmp();
        limpiarCamposEmp();
    }//GEN-LAST:event_btnCancelarEmpActionPerformed

    private void btnListarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmpActionPerformed
        
        try {

                ResultSet result = cn.ejecutarSelectEmpleados();

                insertTableLista(result);

            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_btnListarEmpActionPerformed

    private void btnDetallesEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesEmpActionPerformed
        
        VentanaDetallesEmp detalles = new VentanaDetallesEmp();
        
        this.dispose();
        detalles.setVisible(true);
        
    }//GEN-LAST:event_btnDetallesEmpActionPerformed

    //MÓDULO REUNIÓN
    private void btnAgregarReuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarReuActionPerformed
        
        if(txtNumSupervisor.getText().equals("") || (cmbDiaReu.getSelectedIndex()==0) || (cmbMesReu.getSelectedIndex()==0) || (cmbAnioReu.getSelectedIndex()==0) || areaMinutas.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Ingrese todos los campops obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
          mostrarCampObligReu();
       }else{
           JOptionPane.showMessageDialog(null, "Reunión guardada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
           limpiarCamposReu();
           ocultarCampObligReu();
       }
    }//GEN-LAST:event_btnAgregarReuActionPerformed

    private void btnCancelarReuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReuActionPerformed
        ocultarCampObligReu();
        limpiarCamposReu();
    }//GEN-LAST:event_btnCancelarReuActionPerformed

    private void btnBuscarReuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReuActionPerformed
       
       if(txtNumSupervisor.getText().equals("") || (cmbDiaReu.getSelectedIndex()==0) || (cmbMesReu.getSelectedIndex()==0) || (cmbAnioReu.getSelectedIndex()==0)){
          JOptionPane.showMessageDialog(null, "Ingrese todos los campops obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
          mostrarCampObligReu();
       }else{
           
           int numSupervisor = Integer.parseInt(txtNumSupervisor.getText());
           String diaReu= cmbDiaReu.getSelectedItem().toString();
           String mesReu= cmbMesReu.getSelectedItem().toString();
           String anioReu= cmbAnioReu.getSelectedItem().toString();
           String fecha= diaReu+'/'+ mesReu+'/'+anioReu;

           System.out.println("Se va a buscar la reunion del supervisor "+numSupervisor+" en el dia"+fecha); 
       }
        
    }//GEN-LAST:event_btnBuscarReuActionPerformed

    //MÓDULO PIEZA
    private void btnAgregarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarPiezaActionPerformed

    private void btnModificarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarPiezaActionPerformed

    private void btnBuscarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarPiezaActionPerformed

    private void btnEliminarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarPiezaActionPerformed

    private void btnListarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarPiezaActionPerformed

    private void btnCancelarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPiezaActionPerformed
        limpiarCamposPiezas();
        ocultarCampObligPiezas();
    }//GEN-LAST:event_btnCancelarPiezaActionPerformed

    //MÓDULO CLIENTE
    private void btnAgregarClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarClienActionPerformed

    private void btnModificarClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarClienActionPerformed

    private void btnBuscarClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienActionPerformed

    private void btnEliminarClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarClienActionPerformed

    private void btnCancelarClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienActionPerformed
        ocultarCampObligClie();
        limpiarCamposClie();
    }//GEN-LAST:event_btnCancelarClienActionPerformed

    private void btnListarClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarClienActionPerformed

    private void btnGenerarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarContraActionPerformed

    private void btnGurardarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGurardarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGurardarContraActionPerformed

    private void btnEliminarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarContraActionPerformed

    private void btnCancelarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarContraActionPerformed
        
    }//GEN-LAST:event_btnCancelarContraActionPerformed
    
    //MÓDULO PEDIDO
    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

    private void bntCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarPedidoActionPerformed
        ocultarCampObligPedido();
        limpiarCamposPedido();
    }//GEN-LAST:event_bntCancelarPedidoActionPerformed

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    //MÓDULO FACTURA
    private void btnBuscarFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarFactActionPerformed

    private void btnLimpiarFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarFactActionPerformed
        limpiarCamposFactura();
        ocultarCampObligFactura();
    }//GEN-LAST:event_btnLimpiarFactActionPerformed

    //VALIDACIONES DE INTERFAZ
    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        
        String cargo = cmbCargo.getSelectedItem().toString();
        if(cmbAnioFecNac.getSelectedIndex() != 0){
            int edad= Integer.parseInt(cmbAnioFecNac.getSelectedItem().toString());
            
            switch (cargo){
            case "Hornero": cmbTurno.setEnabled(true);
                break;
                
            case "Gerente": if(edad>1984){
                               JOptionPane.showMessageDialog(null, "La persona es muy joven para el cargo.", "Error", JOptionPane.ERROR_MESSAGE); 
                               cmbCargo.setSelectedIndex(0);
                            }
                break;
                
            default: cmbTurno.setEnabled(false);
                break;
            }
        }
        
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void cmbAnioFecNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioFecNacActionPerformed
        
        if(cmbAnioFecNac.getSelectedIndex() != 0){
            int menorEdad= Integer.parseInt(cmbAnioFecNac.getSelectedItem().toString());
        
            if (menorEdad > 1999){
                JOptionPane.showMessageDialog(null, "La persona es menor de edad.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            cmbAnioFecNac.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_cmbAnioFecNacActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        
        String opcion = cmbClientes.getSelectedItem().toString();
        
        if(opcion.equals("Nuevo Cliente")){
            nuevoClientePedido();
        }
    }//GEN-LAST:event_cmbClientesActionPerformed

       
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMinutas;
    private javax.swing.JButton bntCancelarPedido;
    private javax.swing.JButton btnAgregarClien;
    private javax.swing.JButton btnAgregarEmp;
    private javax.swing.JButton btnAgregarPieza;
    private javax.swing.JButton btnAgregarReu;
    private javax.swing.JButton btnBuscarClien;
    private javax.swing.JButton btnBuscarEmp;
    private javax.swing.JButton btnBuscarFact;
    private javax.swing.JButton btnBuscarPieza;
    private javax.swing.JButton btnBuscarReu;
    private javax.swing.JButton btnCancelarClien;
    private javax.swing.JButton btnCancelarContra;
    private javax.swing.JButton btnCancelarEmp;
    private javax.swing.JButton btnCancelarPieza;
    private javax.swing.JButton btnCancelarReu;
    private javax.swing.JButton btnDetallesEmp;
    private javax.swing.JButton btnEliminarClien;
    private javax.swing.JButton btnEliminarContra;
    private javax.swing.JButton btnEliminarPieza;
    private javax.swing.JButton btnEliminiarEmp;
    private javax.swing.JButton btnGenerarContra;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JButton btnGurardarContra;
    private javax.swing.JButton btnLimpiarFact;
    private javax.swing.JButton btnListarClien;
    private javax.swing.JButton btnListarEmp;
    private javax.swing.JButton btnListarPieza;
    private javax.swing.JButton btnModificarClien;
    private javax.swing.JButton btnModificarEmp;
    private javax.swing.JButton btnModificarPieza;
    private javax.swing.JComboBox cmbAnioContra;
    private javax.swing.JComboBox cmbAnioFactura;
    private javax.swing.JComboBox cmbAnioFec;
    private javax.swing.JComboBox cmbAnioFecNac;
    private javax.swing.JComboBox cmbAnioPedido;
    private javax.swing.JComboBox cmbAnioReu;
    private javax.swing.JComboBox<String> cmbCantPedido;
    private javax.swing.JComboBox<String> cmbCantPedido1;
    private javax.swing.JComboBox<String> cmbCantPersonas;
    private javax.swing.JComboBox cmbCargo;
    private javax.swing.JComboBox cmbClientes;
    private javax.swing.JComboBox cmbCodTlf;
    private javax.swing.JComboBox cmbCodTlf2;
    private javax.swing.JComboBox cmbCodTlf3;
    private javax.swing.JComboBox cmbDepartamento;
    private javax.swing.JComboBox cmbDiaContra;
    private javax.swing.JComboBox cmbDiaFactura;
    private javax.swing.JComboBox cmbDiaFec;
    private javax.swing.JComboBox cmbDiaFecNac;
    private javax.swing.JComboBox cmbDiaPedido;
    private javax.swing.JComboBox cmbDiaReu;
    private javax.swing.JComboBox cmbEdoCivil;
    private javax.swing.JComboBox cmbEstudios;
    private javax.swing.JComboBox cmbGenero;
    private javax.swing.JComboBox cmbMesContra;
    private javax.swing.JComboBox cmbMesFactura;
    private javax.swing.JComboBox cmbMesFec;
    private javax.swing.JComboBox cmbMesFecNac;
    private javax.swing.JComboBox cmbMesPedido;
    private javax.swing.JComboBox cmbMesReu;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JComboBox cmbPais1;
    private javax.swing.JComboBox<String> cmbPiezaPedido;
    private javax.swing.JComboBox<String> cmbTipoPieza;
    private javax.swing.JComboBox<String> cmbTipoPlato;
    private javax.swing.JComboBox<String> cmbTipoTaza;
    private javax.swing.JComboBox cmbTsangre;
    private javax.swing.JComboBox cmbTurno;
    private javax.swing.JComboBox<String> cmbVolumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblNombreClie;
    private javax.swing.JLabel lblNumFactura;
    private javax.swing.JLabel lblOblig1;
    private javax.swing.JLabel lblOblig10;
    private javax.swing.JLabel lblOblig11;
    private javax.swing.JLabel lblOblig12;
    private javax.swing.JLabel lblOblig13;
    private javax.swing.JLabel lblOblig14;
    private javax.swing.JLabel lblOblig15;
    private javax.swing.JLabel lblOblig16;
    private javax.swing.JLabel lblOblig17;
    private javax.swing.JLabel lblOblig18;
    private javax.swing.JLabel lblOblig19;
    private javax.swing.JLabel lblOblig2;
    private javax.swing.JLabel lblOblig20;
    private javax.swing.JLabel lblOblig21;
    private javax.swing.JLabel lblOblig22;
    private javax.swing.JLabel lblOblig23;
    private javax.swing.JLabel lblOblig24;
    private javax.swing.JLabel lblOblig25;
    private javax.swing.JLabel lblOblig26;
    private javax.swing.JLabel lblOblig27;
    private javax.swing.JLabel lblOblig28;
    private javax.swing.JLabel lblOblig29;
    private javax.swing.JLabel lblOblig3;
    private javax.swing.JLabel lblOblig30;
    private javax.swing.JLabel lblOblig31;
    private javax.swing.JLabel lblOblig32;
    private javax.swing.JLabel lblOblig33;
    private javax.swing.JLabel lblOblig34;
    private javax.swing.JLabel lblOblig35;
    private javax.swing.JLabel lblOblig36;
    private javax.swing.JLabel lblOblig37;
    private javax.swing.JLabel lblOblig38;
    private javax.swing.JLabel lblOblig39;
    private javax.swing.JLabel lblOblig4;
    private javax.swing.JLabel lblOblig40;
    private javax.swing.JLabel lblOblig41;
    private javax.swing.JLabel lblOblig42;
    private javax.swing.JLabel lblOblig43;
    private javax.swing.JLabel lblOblig44;
    private javax.swing.JLabel lblOblig5;
    private javax.swing.JLabel lblOblig6;
    private javax.swing.JLabel lblOblig7;
    private javax.swing.JLabel lblOblig8;
    private javax.swing.JLabel lblOblig9;
    private javax.swing.JLabel lblPaisClie;
    private javax.swing.JLabel lblTlfClie;
    private javax.swing.JLabel lblTlfClie1;
    private javax.swing.JLabel lblTotalFactura;
    private javax.swing.JLabel lblTotalPedido;
    private javax.swing.JList listClientes;
    private javax.swing.JList listReuniones;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCantPersonas;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDescuento2;
    private javax.swing.JTextField txtFecCaducidad;
    private javax.swing.JTextField txtHoraF;
    private javax.swing.JTextField txtHoraI;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtNomCliente1;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNumExp;
    private javax.swing.JTextField txtNumPedido;
    private javax.swing.JTextField txtNumPedidoFact;
    private javax.swing.JTextField txtNumSupervisor;
    private javax.swing.JTextField txtRIF;
    private javax.swing.JTextField txtRIF1;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTamanio;
    private javax.swing.JTextField txtTipoPlato;
    private javax.swing.JTextField txtTipoTaza;
    private javax.swing.JTextField txtTlf1;
    private javax.swing.JTextField txtTlf2;
    private javax.swing.JTextField txtTlf3;
    private javax.swing.JTextField txtVolumen;
    // End of variables declaration//GEN-END:variables
}
