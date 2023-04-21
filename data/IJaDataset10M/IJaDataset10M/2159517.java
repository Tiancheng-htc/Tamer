package carassius.GUI;

import carassius.BLL.Events.Animal.AnimalAddedListener;
import carassius.BLL.Events.Animal.AnimalRemovedListener;
import carassius.DAL.AnimalRow;
import carassius.DAL.AquariumRow;
import carassius.DAL.Database;
import carassius.DAL.OrganismListRow;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collection;
import java.util.ResourceBundle;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author siebz0r
 */
public class AddAnimalToAquariumForm extends javax.swing.JDialog implements AnimalAddedListener, AnimalRemovedListener {

    private AquariumRow _aquariumRow;

    public AddAnimalToAquariumForm(Window parent, AquariumRow aquariumRow) {
        super(parent, ModalityType.APPLICATION_MODAL);
        _aquariumRow = aquariumRow;
        initComponents();
        uxImportButton.setVisible(false);
        uxAquariumLabel.setText(aquariumRow.getName());
        Database.getAnimalTable().addAnimalAddedEventListener(this);
        Database.getAnimalTable().addAnimalRemovedEventListener(this);
        try {
            Collection<AnimalRow> animals = Database.getAnimalTable().getAll();
            DefaultListModel model = new DefaultListModel();
            for (AnimalRow row : animals) {
                model.addElement(row);
            }
            uxAnimalList.setModel(model);
        } catch (SQLException ex) {
        }
    }

    @Override
    public void dispose() {
        Database.getAnimalTable().removeAnimalAddedEventListener(this);
        Database.getAnimalTable().removeAnimalRemovedEventListener(this);
        super.dispose();
    }

    /** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        uxAquariumPrefixLabel = new javax.swing.JLabel();
        uxAquariumLabel = new javax.swing.JLabel();
        uxAnimalScrollPane = new javax.swing.JScrollPane();
        uxAnimalList = new javax.swing.JList();
        uxButtonPanel = new javax.swing.JPanel();
        uxImportButton = new javax.swing.JButton();
        uxNewButton = new javax.swing.JButton();
        uxAddButton = new javax.swing.JButton();
        uxCancelButton = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(new StringBuilder(java.util.ResourceBundle.getBundle("carassius/GUI/resources/AddAnimalToAquariumForm").getString("Form.title")).append(_aquariumRow.getName()).toString());
        setName("Form");
        getContentPane().setLayout(new java.awt.GridBagLayout());
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(carassius.CarassiusApp.class).getContext().getResourceMap(AddAnimalToAquariumForm.class);
        uxAquariumPrefixLabel.setText(resourceMap.getString("uxAquariumPrefixLabel.text"));
        uxAquariumPrefixLabel.setName("uxAquariumPrefixLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(uxAquariumPrefixLabel, gridBagConstraints);
        uxAquariumLabel.setText(resourceMap.getString("uxAquariumLabel.text"));
        uxAquariumLabel.setName("uxAquariumLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        getContentPane().add(uxAquariumLabel, gridBagConstraints);
        uxAnimalScrollPane.setName("uxAnimalScrollPane");
        uxAnimalList.setName("uxAnimalList");
        uxAnimalList.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uxAnimalListMouseClicked(evt);
            }
        });
        uxAnimalList.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent evt) {
                uxAnimalListKeyPressed(evt);
            }
        });
        uxAnimalScrollPane.setViewportView(uxAnimalList);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(uxAnimalScrollPane, gridBagConstraints);
        uxButtonPanel.setName("uxButtonPanel");
        uxImportButton.setText(resourceMap.getString("uxImportButton.text"));
        uxImportButton.setName("uxImportButton");
        uxImportButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uxImportButtonActionPerformed(evt);
            }
        });
        uxButtonPanel.add(uxImportButton);
        uxNewButton.setText(resourceMap.getString("uxNewButton.text"));
        uxNewButton.setName("uxNewButton");
        uxNewButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uxNewButtonActionPerformed(evt);
            }
        });
        uxButtonPanel.add(uxNewButton);
        uxAddButton.setText(resourceMap.getString("uxAddButton.text"));
        uxAddButton.setName("uxAddButton");
        uxAddButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uxAddButtonActionPerformed(evt);
            }
        });
        uxButtonPanel.add(uxAddButton);
        uxCancelButton.setText(resourceMap.getString("uxCancelButton.text"));
        uxCancelButton.setName("uxCancelButton");
        uxCancelButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uxCancelButtonActionPerformed(evt);
            }
        });
        uxButtonPanel.add(uxCancelButton);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        getContentPane().add(uxButtonPanel, gridBagConstraints);
        pack();
    }

    private void uxCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void uxAnimalListMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            Object selectedValue = uxAnimalList.getSelectedValue();
            if (selectedValue instanceof AnimalRow) {
                AnimalForm af = new AnimalForm(this, (AnimalRow) selectedValue);
                af.setVisible(true);
            }
        }
    }

    private void uxAnimalListKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Object selectedValue = uxAnimalList.getSelectedValue();
            if (selectedValue instanceof AnimalRow) {
                AnimalForm af = new AnimalForm(this, (AnimalRow) selectedValue);
                af.setVisible(true);
            }
        }
    }

    private void uxAddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Object[] selectedValues = uxAnimalList.getSelectedValues();
        if (selectedValues != null && selectedValues.length > 0) {
            boolean result = true;
            try {
                for (Object selectedValue : selectedValues) {
                    if (result && selectedValue instanceof AnimalRow) {
                        AnimalRow row = (AnimalRow) selectedValue;
                        OrganismListRow existingRow = Database.getOrganismListTable().getByPrimaryKey(new SimpleEntry<Integer, Integer>(_aquariumRow.getId(), row.getId()));
                        if (existingRow == null) {
                            if (Database.getOrganismListTable().add(_aquariumRow, row, 1) == null) {
                                result = false;
                                break;
                            }
                        } else {
                            result = existingRow.setAmount(existingRow.getAmount() + 1);
                        }
                    } else {
                        result = false;
                        break;
                    }
                }
            } catch (SQLException ex) {
                result = false;
            }
            if (result) {
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("carassius.resources.Messages").getString("AddedAnimalToAquarium"), ResourceBundle.getBundle("carassius.resources.Messages").getString("AddedAnimalToAquariumTitle"), JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("carassius.resources.Messages").getString("AddAnimalToAquariumError"), ResourceBundle.getBundle("carassius.resources.Messages").getString("AddAnimalToAquariumErrorTitle"), JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void uxNewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AnimalForm form = new AnimalForm(this);
        form.setVisible(true);
    }

    private void uxImportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        OnlineAnimalImporterForm form = new OnlineAnimalImporterForm(this);
        form.setVisible(true);
    }

    private javax.swing.JButton uxAddButton;

    private javax.swing.JList uxAnimalList;

    private javax.swing.JScrollPane uxAnimalScrollPane;

    private javax.swing.JLabel uxAquariumLabel;

    private javax.swing.JLabel uxAquariumPrefixLabel;

    private javax.swing.JPanel uxButtonPanel;

    private javax.swing.JButton uxCancelButton;

    private javax.swing.JButton uxImportButton;

    private javax.swing.JButton uxNewButton;

    @Override
    public void animalAdded(AnimalRow row) {
        DefaultListModel model = (DefaultListModel) uxAnimalList.getModel();
        model.addElement(row);
    }

    @Override
    public void animalRemoved(AnimalRow row) {
        DefaultListModel model = (DefaultListModel) uxAnimalList.getModel();
        model.removeElement(row);
    }
}