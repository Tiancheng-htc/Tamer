package org.semtinel.core.experiments;

import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.util.ChangeSupport;
import org.semtinel.core.experiments.api.Experiment;

/**
 *
 * @author kai
 */
public class ExperimentDataPanel extends javax.swing.JPanel {

    /** Creates new form ExperimentDataPanel */
    private Logger log = Logger.getLogger(getClass().getName());

    private Experiment experiment;

    public ExperimentDataPanel() {
        initComponents();
    }

    public void setExperiment(Experiment experiment) {
        Experiment old = getExperiment();
        this.experiment = experiment;
        registerDropper1.setRegisterSet(experiment.getRegisterSet());
        firePropertyChange("experiment", old, experiment);
        ChangeListener popButtonListener = new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                firePropertyChange("popButtonEnabled", !isPopButtonEnabled(), isPopButtonEnabled());
                firePropertyChange("popButtonIcon", null, getPopButtonIcon());
            }
        };
        experiment.addAnalysisChangeListener(popButtonListener);
        experiment.addDataproviderChangeListener(popButtonListener);
        experiment.addRegisterSetChangeListener(popButtonListener);
    }

    public Experiment getExperiment() {
        return experiment;
    }

    public void setAnalysisName(String name) {
        String old = analysisTextField.getText();
        analysisTextField.setText(name);
        firePropertyChange("analysisName", old, name);
    }

    public void setDataproviderName(String name) {
        String old = providerTextField.getText();
        providerTextField.setText(name);
        firePropertyChange("dataproviderName", old, name);
    }

    public boolean isPopButtonEnabled() {
        return experiment != null && experiment.getAnalysis() != null && experiment.getAnalysis().supportsPopulation();
    }

    private Icon noPopIcon = null;

    private Icon yesPopIcon = null;

    private Icon needsPopIcon = null;

    public Icon getPopButtonIcon() {
        if (noPopIcon == null) {
            noPopIcon = new ImageIcon(getClass().getResource("flag_black.png"));
            yesPopIcon = new ImageIcon(getClass().getResource("flag_green.png"));
            needsPopIcon = new ImageIcon(getClass().getResource("flag_red.png"));
        }
        if (experiment == null) return noPopIcon;
        if (experiment.getAnalysis() == null) return noPopIcon;
        if (experiment.getAnalysis().needsPopulation(experiment.getRegisterSet())) return needsPopIcon;
        if (experiment.getAnalysis().supportsPopulation()) return yesPopIcon;
        return noPopIcon;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        analysisTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        providerTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        populateButton = new javax.swing.JButton();
        registerDropper1 = new org.semtinel.core.register.RegisterDropper();
        jLabel1.setText(org.openide.util.NbBundle.getMessage(ExperimentDataPanel.class, "ExperimentDataPanel.jLabel1.text"));
        nameField.setText(org.openide.util.NbBundle.getMessage(ExperimentDataPanel.class, "ExperimentDataPanel.nameField.text"));
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {

            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameFieldKeyReleased(evt);
            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });
        jLabel3.setText(org.openide.util.NbBundle.getMessage(ExperimentDataPanel.class, "ExperimentDataPanel.jLabel3.text"));
        analysisTextField.setText(org.openide.util.NbBundle.getMessage(ExperimentDataPanel.class, "ExperimentDataPanel.analysisTextField.text"));
        analysisTextField.setEnabled(false);
        jLabel2.setText(org.openide.util.NbBundle.getMessage(ExperimentDataPanel.class, "ExperimentDataPanel.jLabel2.text"));
        providerTextField.setText(org.openide.util.NbBundle.getMessage(ExperimentDataPanel.class, "ExperimentDataPanel.providerTextField.text"));
        providerTextField.setEnabled(false);
        jLabel4.setText(org.openide.util.NbBundle.getMessage(ExperimentDataPanel.class, "ExperimentDataPanel.jLabel4.text"));
        populateButton.setText(org.openide.util.NbBundle.getMessage(ExperimentDataPanel.class, "ExperimentDataPanel.populateButton.text"));
        populateButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        populateButton.setMaximumSize(new java.awt.Dimension(50, 50));
        populateButton.setMinimumSize(new java.awt.Dimension(50, 50));
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${popButtonEnabled}"), populateButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${popButtonIcon}"), populateButton, org.jdesktop.beansbinding.BeanProperty.create("icon"));
        bindingGroup.addBinding(binding);
        populateButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1).addComponent(jLabel2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(analysisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(populateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(providerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)).addComponent(registerDropper1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4).addComponent(analysisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3).addComponent(providerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(populateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(registerDropper1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))));
        bindingGroup.bind();
    }

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {
        nameChangeSupport.fireChange();
    }

    private void nameFieldKeyReleased(java.awt.event.KeyEvent evt) {
        nameChangeSupport.fireChange();
    }

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {
        nameChangeSupport.fireChange();
    }

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {
        nameField.setSelectionStart(0);
        nameField.setSelectionEnd(getExperimentName().length());
    }

    private void populateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (experiment.getAnalysis().supportsPopulation()) {
            experiment.getAnalysis().populate(experiment.getRegisterSet());
            firePropertyChange("popButtonEnabled", !isPopButtonEnabled(), isPopButtonEnabled());
            firePropertyChange("popButtonIcon", null, getPopButtonIcon());
        }
    }

    public String getExperimentName() {
        return nameField.getText();
    }

    private javax.swing.JTextField analysisTextField;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JTextField nameField;

    private javax.swing.JButton populateButton;

    private javax.swing.JTextField providerTextField;

    private org.semtinel.core.register.RegisterDropper registerDropper1;

    private org.jdesktop.beansbinding.BindingGroup bindingGroup;

    ChangeSupport nameChangeSupport = new ChangeSupport(this);

    public void addNameChangeListener(ChangeListener listener) {
        nameChangeSupport.addChangeListener(listener);
    }

    public void removeNameChangeListener(ChangeListener listener) {
        nameChangeSupport.removeChangeListener(listener);
    }
}