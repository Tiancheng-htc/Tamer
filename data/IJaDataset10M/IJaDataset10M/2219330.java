package org.yccheok.jstock.gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.yccheok.jstock.internationalization.MessagesBundle;

/**
 *
 * @author yccheok
 */
public class CaptchaInputJDialog extends javax.swing.JDialog {

    /** Creates new form CaptchaInputJDialog */
    public CaptchaInputJDialog(java.awt.Frame parent, Image image, boolean modal) {
        super(parent, modal);
        this.image = image;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/yccheok/jstock/data/gui");
        setTitle(bundle.getString("CaptchaInputJDialog_Title"));
        setResizable(false);
        jPanel2.setLayout(new java.awt.BorderLayout(5, 5));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/apply.png")));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/button_cancel.png")));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jPanel2.add(jPanel1, java.awt.BorderLayout.SOUTH);
        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("CaptchaInputJDialog_Captcha")));
        jPanel4.setLayout(new java.awt.BorderLayout(5, 5));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if (null != image) {
            this.jLabel1.setIcon(new ImageIcon(image));
        }
        jPanel4.add(jLabel1, java.awt.BorderLayout.CENTER);
        jLabel2.setText(bundle.getString("CaptchaInputJDialog_TypeTheCharactersYouSeeAbove"));
        jPanel5.add(jLabel2);
        jPanel4.add(jPanel5, java.awt.BorderLayout.NORTH);
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        this.jTextField1.requestFocus();
        jPanel4.add(jPanel3, java.awt.BorderLayout.SOUTH);
        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);
        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        this.dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextField1.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, MessagesBundle.getString("warning_message_characters_cannot_be_empty"), MessagesBundle.getString("warning_title_characters_cannot_be_empty"), JOptionPane.WARNING_MESSAGE);
            this.jTextField1.requestFocus();
            return;
        }
        this.captcha = jTextField1.getText().trim();
        this.setVisible(false);
        this.dispose();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
    }

    public String getCaptcha() {
        return this.captcha;
    }

    private volatile String captcha = null;

    private Image image = null;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JPanel jPanel3;

    private javax.swing.JPanel jPanel4;

    private javax.swing.JPanel jPanel5;

    private javax.swing.JTextField jTextField1;
}