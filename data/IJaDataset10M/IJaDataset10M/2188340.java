package panel;

public class AffinityGraphModePanel extends javax.swing.JPanel {

    private AffinityPanelController pc;

    public AffinityGraphModePanel(AffinityPanelController pc) {
        this.pc = pc;
        initComponents();
        pc.setDirecedGraphRadio(directedModeRadio);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        graphModeGroup = new javax.swing.ButtonGroup();
        graphModePanel = new javax.swing.JPanel();
        directedModeRadio = new javax.swing.JRadioButton();
        undirectedModeRadio = new javax.swing.JRadioButton();
        graphModePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Graph mode"));
        graphModePanel.setMaximumSize(new java.awt.Dimension(280, 32767));
        graphModePanel.setName("graphModePanel");
        graphModeGroup.add(directedModeRadio);
        directedModeRadio.setText("Directed edges");
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("panel/ui_properties");
        directedModeRadio.setToolTipText(bundle.getString("DirectedOption.Tooltip"));
        directedModeRadio.setName("directedModeRadio");
        graphModeGroup.add(undirectedModeRadio);
        undirectedModeRadio.setSelected(true);
        undirectedModeRadio.setText("Undirected edges");
        undirectedModeRadio.setToolTipText(bundle.getString("UndirectedOption.Tooltip"));
        undirectedModeRadio.setName("undirectedModeRadio");
        javax.swing.GroupLayout graphModePanelLayout = new javax.swing.GroupLayout(graphModePanel);
        graphModePanel.setLayout(graphModePanelLayout);
        graphModePanelLayout.setHorizontalGroup(graphModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(graphModePanelLayout.createSequentialGroup().addContainerGap().addComponent(undirectedModeRadio).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE).addComponent(directedModeRadio).addGap(36, 36, 36)));
        graphModePanelLayout.setVerticalGroup(graphModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(graphModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(undirectedModeRadio).addComponent(directedModeRadio)));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(graphModePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(graphModePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
    }

    private javax.swing.JRadioButton directedModeRadio;

    private javax.swing.ButtonGroup graphModeGroup;

    private javax.swing.JPanel graphModePanel;

    private javax.swing.JRadioButton undirectedModeRadio;
}