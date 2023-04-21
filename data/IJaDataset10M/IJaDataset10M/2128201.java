package de.goesberserk.xmpp.jru;

/**
 *
 * @author till.klocke
 */
public class AdvancedConnectionsSettings extends javax.swing.JPanel {

    private JavaRosterUtility parent;

    /** Creates new form AdvancedConnectionsSettings */
    public AdvancedConnectionsSettings(JavaRosterUtility parent) {
        this.parent = parent;
        initComponents();
        this.jCheckBox1.setSelected(parent.getSSL());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox1.setText("use SSL on old port 5223");
        jCheckBox1.setName("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jCheckBox1).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jCheckBox1).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        parent.setSSL(this.jCheckBox1.isSelected());
    }

    private javax.swing.JCheckBox jCheckBox1;
}