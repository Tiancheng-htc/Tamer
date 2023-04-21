package hospitalpets.vista;

import hospitalpets.control.admin.ControlAdministraMedico;
import hospitalpets.control.admin.ControlAdministraPaciente;
import hospitalpets.control.admin.ControlAdministraPropietario;
import hospitalpets.modelo.Medico;
import hospitalpets.modelo.Paciente;
import hospitalpets.modelo.Paciente.RAZAS;
import hospitalpets.modelo.Persona;
import hospitalpets.modelo.Propietario;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author EDU
 */
public class VtnPacientCrear extends javax.swing.JDialog {

    /** Creates new form VtnPacientCrear */
    public VtnPacientCrear(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        propietario = new Propietario();
        medico = new Medico();
        Vector<Paciente.RAZAS> d = new Vector<RAZAS>();
        d.add(Paciente.RAZAS.BOXER);
        d.add(Paciente.RAZAS.CHIHUAHUA);
        d.add(Paciente.RAZAS.DALMATA);
        d.add(Paciente.RAZAS.DOVERMAN);
        d.add(Paciente.RAZAS.GRAN_DANES);
        d.add(Paciente.RAZAS.LABRADOR);
        d.add(Paciente.RAZAS.PASTOR_ALEMAN);
        d.add(Paciente.RAZAS.PITBULL);
        d.add(Paciente.RAZAS.POODLE);
        d.add(Paciente.RAZAS.ROTTWEILER);
        d.add(Paciente.RAZAS.SAN_BERNARDO);
        d.add(Paciente.RAZAS.SHAR_PEI);
        cbxRaza.setModel(new DefaultComboBoxModel(d));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        pnlDatosPaciente = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProcedencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtParroquia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxRaza = new javax.swing.JComboBox();
        cbxSexo = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        txtApellidoProp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccionProp = new javax.swing.JTextField();
        txtNombreProp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCedulaProp = new javax.swing.JTextField();
        txttelefonoProp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtApellidoDoc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCedulaDoc = new javax.swing.JTextField();
        txtNombreDoc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pswPasswordDoc = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Paciente");
        pnlDatosPaciente.setBackground(new java.awt.Color(204, 255, 204));
        pnlDatosPaciente.setMinimumSize(new java.awt.Dimension(620, 450));
        pnlDatosPaciente.setPreferredSize(new java.awt.Dimension(636, 450));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel12.setForeground(new java.awt.Color(0, 153, 102));
        jLabel12.setText("Datos del Paciente");
        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 102)), "Datos Obligatorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 102)));
        jLabel4.setText("Especie:");
        txtEspecie.setEditable(false);
        txtEspecie.setText("Canino");
        txtEspecie.setOpaque(false);
        txtEspecie.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecieActionPerformed(evt);
            }
        });
        jLabel3.setText("Parroquia:");
        txtProcedencia.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcedenciaActionPerformed(evt);
            }
        });
        jLabel7.setText("Fecha de Nacimiento:");
        jLabel9.setText("Paciente:");
        txtBarrio.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarrioActionPerformed(evt);
            }
        });
        jLabel6.setText("Sexo:");
        jLabel5.setText("Raza:");
        jLabel8.setText("Peso:");
        txtPeso.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        txtPaciente.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacienteActionPerformed(evt);
            }
        });
        jLabel2.setText("Barrio:");
        txtParroquia.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParroquiaActionPerformed(evt);
            }
        });
        jLabel1.setText("Procedencia:");
        cbxRaza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MACHO", "HEMBRA" }));
        cbxSexo.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoActionPerformed(evt);
            }
        });
        jLabel20.setText("Kg.");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1).addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE).addComponent(jLabel7)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(txtProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jLabel2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(18, 18, 18).addComponent(jLabel8).addGap(13, 13, 13))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel20)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(txtBarrio, javax.swing.GroupLayout.Alignment.LEADING).addComponent(cbxRaza, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3).addComponent(jLabel6).addComponent(jLabel9)).addGap(4, 4, 4).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(txtParroquia).addComponent(cbxSexo, 0, 126, Short.MAX_VALUE).addComponent(txtPaciente, javax.swing.GroupLayout.Alignment.TRAILING)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(txtParroquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(17, 17, 17).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(txtProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel1).addComponent(jLabel2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(cbxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4).addComponent(jLabel5)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel20)).addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))).addContainerGap()));
        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 102)));
        txtApellidoProp.setEnabled(false);
        txtApellidoProp.setOpaque(false);
        jLabel10.setText("Apellido:");
        txtDireccionProp.setEnabled(false);
        txtDireccionProp.setOpaque(false);
        txtNombreProp.setEnabled(false);
        txtNombreProp.setOpaque(false);
        jLabel11.setText("Dirección:");
        jLabel13.setText("Nombre:");
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 102)), "Ingrese el número de cedula del Propietario:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 102)));
        jPanel3.setOpaque(false);
        jLabel14.setText("Nro Cedula:");
        txtCedulaProp.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaPropActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel14).addGap(30, 30, 30).addComponent(txtCedulaProp, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(txtCedulaProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel14)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        txttelefonoProp.setEnabled(false);
        txttelefonoProp.setOpaque(false);
        jLabel15.setText("Telefono:");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel11).addComponent(jLabel13).addComponent(jLabel10)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtDireccionProp, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE).addComponent(txtApellidoProp, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE).addComponent(txtNombreProp, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel15).addGap(18, 18, 18).addComponent(txttelefonoProp, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(txtNombreProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(txtApellidoProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(txtDireccionProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(txttelefonoProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 102)));
        txtApellidoDoc.setEnabled(false);
        txtApellidoDoc.setOpaque(false);
        jLabel16.setText("Apellido:");
        txtCedulaDoc.setEnabled(false);
        txtCedulaDoc.setOpaque(false);
        txtNombreDoc.setEnabled(false);
        txtNombreDoc.setOpaque(false);
        jLabel17.setText("Nro Cedula:");
        jLabel18.setText("Nombre:");
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 102)), "Ingrese la clave del medico:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 102)));
        jPanel5.setOpaque(false);
        jLabel19.setText("Password:");
        pswPasswordDoc.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswPasswordDocActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel19).addGap(18, 18, 18).addComponent(pswPasswordDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE).addContainerGap()));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(pswPasswordDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel17).addComponent(jLabel18).addComponent(jLabel16)).addGap(18, 18, 18).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtNombreDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE).addComponent(txtCedulaDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE).addComponent(txtApellidoDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)))).addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE).addGap(18, 18, 18).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(txtCedulaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(txtNombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(txtApellidoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(25, 25, 25)));
        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalpets/imagenes/nuevo.png")));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalpets/imagenes/guardar.png")));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalpets/imagenes/eliminar.png")));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(163, 163, 163).addComponent(btnNuevo).addGap(51, 51, 51).addComponent(btnGuardar).addGap(48, 48, 48).addComponent(btnsalir).addContainerGap(160, Short.MAX_VALUE)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnNuevo).addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        javax.swing.GroupLayout pnlDatosPacienteLayout = new javax.swing.GroupLayout(pnlDatosPaciente);
        pnlDatosPaciente.setLayout(pnlDatosPacienteLayout);
        pnlDatosPacienteLayout.setHorizontalGroup(pnlDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(pnlDatosPacienteLayout.createSequentialGroup().addContainerGap().addGroup(pnlDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(pnlDatosPacienteLayout.createSequentialGroup().addGap(256, 256, 256).addComponent(jLabel12)).addGroup(pnlDatosPacienteLayout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(24, 24, 24).addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addContainerGap()));
        pnlDatosPacienteLayout.setVerticalGroup(pnlDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(pnlDatosPacienteLayout.createSequentialGroup().addContainerGap().addComponent(jLabel12).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(12, Short.MAX_VALUE)));
        getContentPane().add(pnlDatosPaciente, java.awt.BorderLayout.PAGE_END);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 729) / 2, (screenSize.height - 488) / 2, 729, 488);
    }

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void txtProcedenciaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtBarrioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtParroquiaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtEspecieActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtPacienteActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtCedulaPropActionPerformed(java.awt.event.ActionEvent evt) {
        if (!Persona.validarCedula(txtCedulaProp.getText())) {
            JOptionPane.showMessageDialog(this, "El número de cedula ingresado no es valido ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            txtCedulaProp.setText("");
        } else {
            propietario = ControlAdministraPropietario.cargarPropietario(txtCedulaProp.getText());
            if (propietario != null) {
                txtApellidoProp.setText(propietario.getApellido());
                txtDireccionProp.setText(propietario.getDireccion());
                txtNombreProp.setText(propietario.getNombre());
                txttelefonoProp.setText(propietario.getTelefono());
            } else {
                txtApellidoProp.setText("");
                txtNombreProp.setText("");
                txttelefonoProp.setText("");
                txtDireccionProp.setText("");
                JOptionPane.showMessageDialog(this, "El propietario no existe");
            }
        }
    }

    private void pswPasswordDocActionPerformed(java.awt.event.ActionEvent evt) {
        medico = ControlAdministraMedico.cargarMedico(pswPasswordDoc.getText());
        if (medico != null) {
            txtApellidoDoc.setText(medico.getApellido());
            txtCedulaDoc.setText(medico.getCedula());
            txtNombreDoc.setText(medico.getNombre());
        } else {
            txtApellidoDoc.setText("");
            txtCedulaDoc.setText("");
            txtNombreDoc.setText("");
        }
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        if (medico != null) {
            if (propietario != null) {
                if (ControlAdministraPaciente.crearPaciente(txtPaciente.getText(), (Paciente.RAZAS) cbxRaza.getSelectedItem(), fechaNacimiento.getDate(), medico, propietario, txtProcedencia.getText(), txtParroquia.getText(), txtBarrio.getText(), Double.parseDouble(txtPeso.getText()), cbxSexo.getSelectedIndex())) {
                    JOptionPane.showMessageDialog(this, "Los datos se guardaron correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al intentar guardar los datos");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un propietario primero");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un médico primero");
        }
    }

    private void cbxSexoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        txtApellidoDoc.setText("");
        txtApellidoProp.setText("");
        txtBarrio.setText("");
        txtCedulaDoc.setText("");
        txtCedulaProp.setText("");
        txtDireccionProp.setText("");
        txtNombreDoc.setText("");
        txtNombreProp.setText("");
        txtPaciente.setText("");
        txtPeso.setText("");
        txtParroquia.setText("");
        txtProcedencia.setText("");
        txttelefonoProp.setText("");
        cbxRaza.setSelectedIndex(0);
        cbxSexo.setSelectedIndex(0);
        fechaNacimiento.setDate(null);
        pswPasswordDoc.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                VtnPacientCrear dialog = new VtnPacientCrear(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnGuardar;

    private javax.swing.JButton btnNuevo;

    private javax.swing.JButton btnsalir;

    private javax.swing.JComboBox cbxRaza;

    private javax.swing.JComboBox cbxSexo;

    private com.toedter.calendar.JDateChooser fechaNacimiento;

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

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

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

    private javax.swing.JPanel pnlDatosPaciente;

    private javax.swing.JPasswordField pswPasswordDoc;

    private javax.swing.JTextField txtApellidoDoc;

    private javax.swing.JTextField txtApellidoProp;

    private javax.swing.JTextField txtBarrio;

    private javax.swing.JTextField txtCedulaDoc;

    private javax.swing.JTextField txtCedulaProp;

    private javax.swing.JTextField txtDireccionProp;

    private javax.swing.JTextField txtEspecie;

    private javax.swing.JTextField txtNombreDoc;

    private javax.swing.JTextField txtNombreProp;

    private javax.swing.JTextField txtPaciente;

    private javax.swing.JTextField txtParroquia;

    private javax.swing.JTextField txtPeso;

    private javax.swing.JTextField txtProcedencia;

    private javax.swing.JTextField txttelefonoProp;

    private Propietario propietario;

    private Medico medico;
}