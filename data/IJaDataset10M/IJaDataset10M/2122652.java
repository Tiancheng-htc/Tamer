package org.galab.frame;

import javax.swing.*;

/**
 *
 * @author  andy
 * @version 
 */
public class BrainLabProperties extends javax.swing.JFrame {

    /** Creates new form BrainLabProperties */
    public BrainLabProperties(BrainLab newCaller) {
        caller = newCaller;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    private void initComponents() {
        labComponentType = new javax.swing.JLabel();
        comComponentType = new javax.swing.JLabel();
        labVariable = new javax.swing.JLabel();
        comVariable = new javax.swing.JComboBox();
        labValue = new javax.swing.JLabel();
        texValue = new javax.swing.JTextField();
        labEvolvability = new javax.swing.JLabel();
        comEvolvability = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labFitnessMethod = new javax.swing.JLabel();
        comFitnessMethod = new javax.swing.JComboBox();
        labFitnessVariable = new javax.swing.JLabel();
        comFitnessVariable = new javax.swing.JComboBox();
        labFitnessValue = new javax.swing.JLabel();
        texFitnessValue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        butDeleteFitnessMethod = new javax.swing.JButton();
        getContentPane().setLayout(new java.awt.GridLayout(9, 2, 2, 5));
        setName("");
        setTitle("Properties");
        setBackground(java.awt.Color.white);
        labComponentType.setPreferredSize(new java.awt.Dimension(100, 25));
        labComponentType.setMinimumSize(new java.awt.Dimension(100, 25));
        labComponentType.setText("Component Type:");
        labComponentType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labComponentType.setFont(new java.awt.Font("Dialog", 0, 12));
        labComponentType.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(labComponentType);
        comComponentType.setPreferredSize(new java.awt.Dimension(130, 25));
        comComponentType.setBorder(new javax.swing.border.EtchedBorder());
        comComponentType.setMinimumSize(new java.awt.Dimension(130, 25));
        comComponentType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comComponentType.setFont(new java.awt.Font("Dialog", 0, 12));
        comComponentType.setMaximumSize(new java.awt.Dimension(130, 25));
        getContentPane().add(comComponentType);
        labVariable.setPreferredSize(new java.awt.Dimension(100, 25));
        labVariable.setMinimumSize(new java.awt.Dimension(100, 25));
        labVariable.setText("Variable:");
        labVariable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labVariable.setFont(new java.awt.Font("Dialog", 0, 12));
        labVariable.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(labVariable);
        comVariable.setMinimumSize(new java.awt.Dimension(130, 25));
        comVariable.setFont(new java.awt.Font("Dialog", 0, 12));
        comVariable.setMaximumSize(new java.awt.Dimension(130, 25));
        comVariable.setOpaque(false);
        comVariable.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comVariableActionPerformed(evt);
            }
        });
        getContentPane().add(comVariable);
        labValue.setPreferredSize(new java.awt.Dimension(100, 25));
        labValue.setMinimumSize(new java.awt.Dimension(100, 25));
        labValue.setText("Value:");
        labValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labValue.setFont(new java.awt.Font("Dialog", 0, 12));
        labValue.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(labValue);
        texValue.setPreferredSize(new java.awt.Dimension(130, 25));
        texValue.setBorder(new javax.swing.border.BevelBorder(1));
        texValue.setMaximumSize(new java.awt.Dimension(130, 25));
        texValue.setFont(new java.awt.Font("Dialog", 0, 12));
        texValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texValue.setMinimumSize(new java.awt.Dimension(130, 25));
        texValue.setAutoscrolls(false);
        texValue.setOpaque(false);
        texValue.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texValueActionPerformed(evt);
            }
        });
        getContentPane().add(texValue);
        labEvolvability.setPreferredSize(new java.awt.Dimension(100, 25));
        labEvolvability.setMinimumSize(new java.awt.Dimension(100, 25));
        labEvolvability.setText("Evolvability:");
        labEvolvability.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEvolvability.setFont(new java.awt.Font("Dialog", 0, 12));
        labEvolvability.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(labEvolvability);
        comEvolvability.setMinimumSize(new java.awt.Dimension(130, 25));
        comEvolvability.setFont(new java.awt.Font("Dialog", 0, 12));
        comEvolvability.setMaximumSize(new java.awt.Dimension(130, 25));
        comEvolvability.setOpaque(false);
        comEvolvability.addItem("Set and Fixed");
        comEvolvability.addItem("Set and Evolvable");
        comEvolvability.addItem("Random and Evolvable");
        comEvolvability.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comEvolvabilityActionPerformed(evt);
            }
        });
        getContentPane().add(comEvolvability);
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 25));
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel2);
        getContentPane().add(jLabel3);
        labFitnessMethod.setPreferredSize(new java.awt.Dimension(100, 25));
        labFitnessMethod.setMinimumSize(new java.awt.Dimension(100, 25));
        labFitnessMethod.setText("Fitness Method:");
        labFitnessMethod.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labFitnessMethod.setFont(new java.awt.Font("Dialog", 0, 12));
        labFitnessMethod.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(labFitnessMethod);
        comFitnessMethod.setMinimumSize(new java.awt.Dimension(130, 25));
        comFitnessMethod.setFont(new java.awt.Font("Dialog", 0, 12));
        comFitnessMethod.setMaximumSize(new java.awt.Dimension(130, 25));
        comFitnessMethod.setOpaque(false);
        comFitnessMethod.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comFitnessMethodActionPerformed(evt);
            }
        });
        getContentPane().add(comFitnessMethod);
        labFitnessVariable.setPreferredSize(new java.awt.Dimension(100, 25));
        labFitnessVariable.setMinimumSize(new java.awt.Dimension(100, 25));
        labFitnessVariable.setText("Variable:");
        labFitnessVariable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labFitnessVariable.setFont(new java.awt.Font("Dialog", 0, 12));
        labFitnessVariable.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(labFitnessVariable);
        comFitnessVariable.setMinimumSize(new java.awt.Dimension(130, 25));
        comFitnessVariable.setFont(new java.awt.Font("Dialog", 0, 12));
        comFitnessVariable.setMaximumSize(new java.awt.Dimension(130, 25));
        comFitnessVariable.setOpaque(false);
        comFitnessVariable.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comFitnessVariableActionPerformed(evt);
            }
        });
        getContentPane().add(comFitnessVariable);
        labFitnessValue.setPreferredSize(new java.awt.Dimension(100, 25));
        labFitnessValue.setMinimumSize(new java.awt.Dimension(100, 25));
        labFitnessValue.setText("Value:");
        labFitnessValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labFitnessValue.setFont(new java.awt.Font("Dialog", 0, 12));
        labFitnessValue.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(labFitnessValue);
        texFitnessValue.setPreferredSize(new java.awt.Dimension(130, 25));
        texFitnessValue.setBorder(new javax.swing.border.BevelBorder(1));
        texFitnessValue.setMaximumSize(new java.awt.Dimension(130, 25));
        texFitnessValue.setFont(new java.awt.Font("Dialog", 0, 12));
        texFitnessValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texFitnessValue.setMinimumSize(new java.awt.Dimension(130, 25));
        texFitnessValue.setAutoscrolls(false);
        texFitnessValue.setOpaque(false);
        texFitnessValue.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texFitnessValueActionPerformed(evt);
            }
        });
        getContentPane().add(texFitnessValue);
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 25));
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 25));
        getContentPane().add(jLabel4);
        butDeleteFitnessMethod.setPreferredSize(new java.awt.Dimension(130, 25));
        butDeleteFitnessMethod.setMaximumSize(new java.awt.Dimension(130, 25));
        butDeleteFitnessMethod.setFont(new java.awt.Font("Dialog", 0, 12));
        butDeleteFitnessMethod.setText("Delete Method");
        butDeleteFitnessMethod.setMinimumSize(new java.awt.Dimension(130, 25));
        butDeleteFitnessMethod.setOpaque(false);
        butDeleteFitnessMethod.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteFitnessMethodActionPerformed(evt);
            }
        });
        getContentPane().add(butDeleteFitnessMethod);
        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width - dialogSize.width) / 2, (screenSize.height - dialogSize.height) / 2);
    }

    private void butDeleteFitnessMethodActionPerformed(java.awt.event.ActionEvent evt) {
        caller.butDeleteFitnessMethodActionPerformed(evt);
    }

    private void comFitnessMethodActionPerformed(java.awt.event.ActionEvent evt) {
        caller.comFitnessMethodActionPerformed(evt);
    }

    private void comFitnessVariableActionPerformed(java.awt.event.ActionEvent evt) {
        caller.comFitnessVariableActionPerformed(evt);
    }

    private void texFitnessValueActionPerformed(java.awt.event.ActionEvent evt) {
        caller.texFitnessValueActionPerformed(evt);
    }

    private void texValueActionPerformed(java.awt.event.ActionEvent evt) {
        caller.texVariableValueActionPerformed(evt);
    }

    private void comEvolvabilityActionPerformed(java.awt.event.ActionEvent evt) {
        caller.comValueTypeActionPerformed(evt);
    }

    private void comVariableActionPerformed(java.awt.event.ActionEvent evt) {
        caller.comVariableTypeActionPerformed(evt);
    }

    private void comComponentTypeActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public JLabel getComComponentType() {
        return comComponentType;
    }

    public JComboBox getComVariable() {
        return comVariable;
    }

    public JTextField getTexValue() {
        return texValue;
    }

    public JComboBox getComEvolvability() {
        return comEvolvability;
    }

    public JComboBox getComFitnessVariable() {
        return comFitnessVariable;
    }

    public JComboBox getComFitnessMethod() {
        return comFitnessMethod;
    }

    public JTextField getTexFitnessValue() {
        return texFitnessValue;
    }

    public JButton getbutDeleteFitnessMethod() {
        return butDeleteFitnessMethod;
    }

    private javax.swing.JLabel labComponentType;

    private javax.swing.JLabel comComponentType;

    private javax.swing.JLabel labVariable;

    private javax.swing.JComboBox comVariable;

    private javax.swing.JLabel labValue;

    private javax.swing.JTextField texValue;

    private javax.swing.JLabel labEvolvability;

    private javax.swing.JComboBox comEvolvability;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel labFitnessMethod;

    private javax.swing.JComboBox comFitnessMethod;

    private javax.swing.JLabel labFitnessVariable;

    private javax.swing.JComboBox comFitnessVariable;

    private javax.swing.JLabel labFitnessValue;

    private javax.swing.JTextField texFitnessValue;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JButton butDeleteFitnessMethod;

    public BrainLab caller;
}