package com.welma.des3per.gui.dialogs;

import com.welma.des3per.data.Des3PerRuleBranch;
import com.welma.des3per.rules.Des3PerRule;
import com.welma.des3per.rules.Des3PerSequenceRule;
import java.awt.Window;
import java.util.List;
import java.util.Vector;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Rafael
 */
public class Des3PerSequenceRuleDialog extends javax.swing.JDialog {

    private Des3PerSequenceRule rule;

    private Des3PerRuleBranch selectedItem;

    /** Creates new form Des3PerSequenceRuleDialog */
    public Des3PerSequenceRuleDialog(Window parent, Des3PerSequenceRule rule) {
        super(parent, ModalityType.DOCUMENT_MODAL);
        this.rule = rule;
        initComponents();
        firePropertyChange("rule", null, rule);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();
        des3PerBasicRulePanel1 = new com.welma.des3per.gui.panels.Des3PerBasicRulePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(rule.getName());
        des3PerBasicRulePanel1.setName("des3PerBasicRulePanel1");
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${rule}"), des3PerBasicRulePanel1, org.jdesktop.beansbinding.BeanProperty.create("rule"));
        bindingGroup.addBinding(binding);
        jScrollPane1.setName("jScrollPane1");
        jTable1.setName("jTable1");
        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${sequenceItems}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${position}"));
        columnBinding.setColumnName("Posición");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rule.ruleName}"));
        columnBinding.setColumnName("Regla");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${selectedItem}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);
        jScrollPane1.setViewportView(jTable1);
        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setName("jToolBar1");
        jButton2.setText("NR");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setName("jButton2");
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jButton4.setText("SU");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setName("jButton4");
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jSeparator2.setName("jSeparator2");
        jToolBar1.add(jSeparator2);
        jButton5.setText("UP");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setName("jButton5");
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);
        jButton6.setText("DW");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setName("jButton6");
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);
        jPanel1.setName("jPanel1");
        jButton1.setText("Cerrar");
        jButton1.setName("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jSeparator1.setName("jSeparator1");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(367, Short.MAX_VALUE).addComponent(jButton1).addContainerGap()).addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jButton1).addContainerGap()));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE).addComponent(des3PerBasicRulePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE).addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)).addContainerGap()).addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(des3PerBasicRulePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE).addGap(0, 0, 0).addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        bindingGroup.bind();
        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width - dialogSize.width) / 2, (screenSize.height - dialogSize.height) / 2);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Des3PerModelRulesSelectionDialog dialog = new Des3PerModelRulesSelectionDialog(this, (rule == null ? null : rule.getModel()));
        dialog.setVisible(true);
        Des3PerRule selected = dialog.getSelectedRule();
        if (selected != null) {
            Des3PerRuleBranch item = new Des3PerRuleBranch(rule.getModel(), rule.getBranchesCount() + 1, selected);
            rule.addBranchedItem(item);
            firePropertyChange("sequenceItems", null, getSequenceItems());
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (selectedItem != null) {
            rule.removeBranchedItem(selectedItem);
            firePropertyChange("sequenceItems", null, getSequenceItems());
        }
    }

    private com.welma.des3per.gui.panels.Des3PerBasicRulePanel des3PerBasicRulePanel1;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton4;

    private javax.swing.JButton jButton5;

    private javax.swing.JButton jButton6;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JSeparator jSeparator1;

    private javax.swing.JToolBar.Separator jSeparator2;

    private javax.swing.JTable jTable1;

    private javax.swing.JToolBar jToolBar1;

    private org.jdesktop.beansbinding.BindingGroup bindingGroup;

    public Des3PerSequenceRule getRule() {
        return rule;
    }

    public void setRule(Des3PerSequenceRule rule) {
        Des3PerSequenceRule oldRule = this.rule;
        this.rule = rule;
        firePropertyChange("rule", oldRule, rule);
    }

    public Des3PerRuleBranch getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Des3PerRuleBranch selectedItem) {
        Des3PerRuleBranch oldSelectedItem = this.selectedItem;
        this.selectedItem = selectedItem;
        firePropertyChange("selectedItem", oldSelectedItem, selectedItem);
    }

    public List<Des3PerRuleBranch> getSequenceItems() {
        Vector<Des3PerRuleBranch> vector = rule.getBranches();
        if (vector == null) vector = new Vector<Des3PerRuleBranch>();
        return ObservableCollections.observableList(vector);
    }
}