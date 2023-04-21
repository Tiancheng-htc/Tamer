package cz.cvut.fel.mvod.gui.settings.panels;

import cz.cvut.fel.mvod.global.GlobalSettingsAndNotifier;
import cz.cvut.fel.mvod.global.Notifiable;

/**
 *
 * @author Radovan Murin
 */
public class GlobalSettingsPanel extends javax.swing.JPanel implements Notifiable {

    /** Creates new form GlobalSettingsPanel */
    public GlobalSettingsPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        securityPanel1 = new cz.cvut.fel.mvod.gui.settings.panels.SecurityPanel();
        connectionInfo1 = new cz.cvut.fel.mvod.gui.settings.panels.ConnectionInfo();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText(GlobalSettingsAndNotifier.singleton.messages.getString("mainSettingsLabel"));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)).addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(connectionInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(securityPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(20, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(8, 8, 8).addComponent(connectionInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(securityPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(29, Short.MAX_VALUE)));
    }

    private cz.cvut.fel.mvod.gui.settings.panels.ConnectionInfo connectionInfo1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JSeparator jSeparator1;

    private cz.cvut.fel.mvod.gui.settings.panels.SecurityPanel securityPanel1;

    @Override
    public void notifyOfChange() {
    }
}