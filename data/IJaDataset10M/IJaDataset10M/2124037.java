package openfield;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Francis
 */
public class TiposDePropiedadForm extends JPanel {

    public TiposDePropiedadForm() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(openfield.OpenFieldApp.class).getContext().getResourceMap(TiposDePropiedadForm.class);
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(resourceMap.getString("entityManager.persistenceUnit")).createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery(resourceMap.getString("query.query"));
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        descripcionLabel = new javax.swing.JLabel();
        descripcionField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        FormListener formListener = new FormListener();
        setName("Form");
        masterScrollPane.setName("masterScrollPane");
        masterTable.setName("masterTable");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descripcion}"));
        columnBinding.setColumnName("Descripcion");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        masterScrollPane.setViewportView(masterTable);
        descripcionLabel.setText(resourceMap.getString("descripcionLabel.text"));
        descripcionLabel.setName("descripcionLabel");
        descripcionField.setName("descripcionField");
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.descripcion}"), descripcionField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), descripcionField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        saveButton.setText(resourceMap.getString("saveButton.text"));
        saveButton.setName("saveButton");
        saveButton.addActionListener(formListener);
        refreshButton.setText(resourceMap.getString("refreshButton.text"));
        refreshButton.setName("refreshButton");
        refreshButton.addActionListener(formListener);
        newButton.setText(resourceMap.getString("newButton.text"));
        newButton.setName("newButton");
        newButton.addActionListener(formListener);
        deleteButton.setText(resourceMap.getString("deleteButton.text"));
        deleteButton.setName("deleteButton");
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        deleteButton.addActionListener(formListener);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(newButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(deleteButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(refreshButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(saveButton).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(descripcionLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(descripcionField, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE).addContainerGap()));
        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { deleteButton, newButton, refreshButton, saveButton });
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(descripcionLabel).addComponent(descripcionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(saveButton).addComponent(refreshButton).addComponent(deleteButton).addComponent(newButton)).addContainerGap()));
        bindingGroup.bind();
    }

    private class FormListener implements java.awt.event.ActionListener {

        FormListener() {
        }

        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                TiposDePropiedadForm.this.saveButtonActionPerformed(evt);
            } else if (evt.getSource() == refreshButton) {
                TiposDePropiedadForm.this.refreshButtonActionPerformed(evt);
            } else if (evt.getSource() == newButton) {
                TiposDePropiedadForm.this.newButtonActionPerformed(evt);
            } else if (evt.getSource() == deleteButton) {
                TiposDePropiedadForm.this.deleteButtonActionPerformed(evt);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int[] selected = masterTable.getSelectedRows();
        List<openfield.ADO.TiposPropiedad> toRemove = new ArrayList<openfield.ADO.TiposPropiedad>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            openfield.ADO.TiposPropiedad t = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(t);
            entityManager.remove(t);
        }
        list.removeAll(toRemove);
    }

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {
        openfield.ADO.TiposPropiedad t = new openfield.ADO.TiposPropiedad();
        entityManager.persist(t);
        list.add(t);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<openfield.ADO.TiposPropiedad> merged = new ArrayList<openfield.ADO.TiposPropiedad>(list.size());
            for (openfield.ADO.TiposPropiedad t : list) {
                merged.add(entityManager.merge(t));
            }
            list.clear();
            list.addAll(merged);
        }
    }

    private javax.swing.JButton deleteButton;

    private javax.swing.JTextField descripcionField;

    private javax.swing.JLabel descripcionLabel;

    private javax.persistence.EntityManager entityManager;

    private java.util.List<openfield.ADO.TiposPropiedad> list;

    private javax.swing.JScrollPane masterScrollPane;

    private javax.swing.JTable masterTable;

    private javax.swing.JButton newButton;

    private javax.persistence.Query query;

    private javax.swing.JButton refreshButton;

    private javax.swing.JButton saveButton;

    private org.jdesktop.beansbinding.BindingGroup bindingGroup;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new TiposDePropiedadForm());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}