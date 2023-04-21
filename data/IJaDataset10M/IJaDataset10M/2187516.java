package csa.jportal.match.display;

import csa.util.syntax.Syntax.HighlightedDocument;
import javax.swing.*;
import csa.jportal.card.*;
import csa.jportal.*;
import javax.swing.text.*;
import java.awt.*;
import csa.jportal.config.*;
import csa.jportal.gui.Blacker;
import java.awt.*;
import csa.jportal.script.*;

/**
 *
 * @author Malban
 */
public class CardDetailPanel extends javax.swing.JPanel {

    private HighlightedDocument document;

    /** The text pane displaying the document. */
    private String mTemplateType = "";

    private String mTemplateAbility = "";

    private Scriptable mProvider = null;

    private int mClassSetting = 0;

    private Card mCard = null;

    private JPortalView mMainDisplay = null;

    /** Creates new form CardDetailPanel */
    public CardDetailPanel() {
        initComponents();
        Blacker.saveDefault(this);
        Image image = Card.getBackImageTrueSize();
        jLabel1.setIcon(new ImageIcon(image));
        document = new HighlightedDocument();
        jTextPaneScript.setDocument(document);
        document.setHighlightStyle(HighlightedDocument.JAVA_STYLE);
        setTabs(jTextPaneScript, 2);
        resetConfigPool(false, "");
        jButtonScriptPanel.setVisible(false);
    }

    public void deinit() {
        document.deinit();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldId1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldType1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextFieldSubType1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldName1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldPower1 = new javax.swing.JTextField();
        jTextFieldToughness1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldMana1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldScannedAbilities = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxName = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneScript = new javax.swing.JTextPane();
        jButtonScriptPanel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        setPreferredSize(new java.awt.Dimension(215, 320));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(105, 100));
        jTabbedPane1.setName("jTabbedPane1");
        jPanel1.setName("jPanel1");
        jPanel1.setLayout(new java.awt.BorderLayout());
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setName("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);
        jTabbedPane1.addTab("Image", jPanel1);
        jPanel2.setName("jPanel2");
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 11));
        jLabel24.setText("ID");
        jLabel24.setName("jLabel24");
        jTextFieldId1.setEditable(false);
        jTextFieldId1.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextFieldId1.setName("jTextFieldId1");
        jLabel29.setFont(new java.awt.Font("Dialog", 1, 11));
        jLabel29.setText("Type");
        jLabel29.setName("jLabel29");
        jTextFieldType1.setEditable(false);
        jTextFieldType1.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextFieldType1.setName("jTextFieldType1");
        jLabel28.setFont(new java.awt.Font("Dialog", 1, 11));
        jLabel28.setText("Subtype");
        jLabel28.setName("jLabel28");
        jTextFieldSubType1.setEditable(false);
        jTextFieldSubType1.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextFieldSubType1.setName("jTextFieldSubType1");
        jLabel25.setFont(new java.awt.Font("Dialog", 1, 11));
        jLabel25.setText("Name");
        jLabel25.setName("jLabel25");
        jTextFieldName1.setEditable(false);
        jTextFieldName1.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextFieldName1.setName("jTextFieldName1");
        jLabel26.setFont(new java.awt.Font("Dialog", 1, 11));
        jLabel26.setText("P/T");
        jLabel26.setName("jLabel26");
        jTextFieldPower1.setEditable(false);
        jTextFieldPower1.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextFieldPower1.setName("jTextFieldPower1");
        jTextFieldToughness1.setEditable(false);
        jTextFieldToughness1.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextFieldToughness1.setName("jTextFieldToughness1");
        jLabel27.setFont(new java.awt.Font("Dialog", 1, 11));
        jLabel27.setText("Mana");
        jLabel27.setName("jLabel27");
        jTextFieldMana1.setEditable(false);
        jTextFieldMana1.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextFieldMana1.setName("jTextFieldMana1");
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11));
        jLabel3.setText("Text");
        jLabel3.setName("jLabel3");
        jScrollPane1.setName("jScrollPane1");
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setName("jTextArea1");
        jScrollPane1.setViewportView(jTextArea1);
        jLabel30.setFont(new java.awt.Font("Dialog", 1, 11));
        jLabel30.setText("Scanned abilities");
        jLabel30.setName("jLabel30");
        jTextFieldScannedAbilities.setEditable(false);
        jTextFieldScannedAbilities.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextFieldScannedAbilities.setToolTipText("Scanned from spoilertext");
        jTextFieldScannedAbilities.setName("jTextFieldScannedAbilities");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE).addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel28).addComponent(jLabel29).addComponent(jLabel25).addComponent(jLabel24).addComponent(jLabel27)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTextFieldMana1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE).addComponent(jTextFieldName1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE).addComponent(jTextFieldSubType1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jTextFieldId1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel26).addGap(3, 3, 3).addComponent(jTextFieldPower1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTextFieldToughness1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jTextFieldType1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTextFieldScannedAbilities, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))).addGap(11, 11, 11)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jTextFieldName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel25)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel24).addComponent(jTextFieldId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel26).addComponent(jTextFieldPower1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jTextFieldToughness1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(6, 6, 6).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel29).addComponent(jTextFieldType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel28).addComponent(jTextFieldSubType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel27).addComponent(jTextFieldMana1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel30).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTextFieldScannedAbilities, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)));
        jTabbedPane1.addTab("Text", jPanel2);
        jPanel3.setName("jPanel3");
        jComboBoxName.setName("jComboBoxName");
        jComboBoxName.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNameActionPerformed(evt);
            }
        });
        jLabel2.setText("Key");
        jLabel2.setName("jLabel2");
        jScrollPane2.setName("jScrollPane2");
        jTextPaneScript.setFont(new java.awt.Font("Courier New", 0, 10));
        jTextPaneScript.setName("jTextPaneScript");
        jScrollPane2.setViewportView(jTextPaneScript);
        jButtonScriptPanel.setText("!");
        jButtonScriptPanel.setToolTipText("Open Scriptwindow for current card - with match Info!");
        jButtonScriptPanel.setMargin(new java.awt.Insets(2, 2, 2, 0));
        jButtonScriptPanel.setName("jButtonScriptPanel");
        jButtonScriptPanel.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScriptPanelActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jComboBoxName, 0, 143, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButtonScriptPanel).addGap(4, 4, 4)).addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false).addComponent(jComboBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel2).addComponent(jButtonScriptPanel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)));
        jTabbedPane1.addTab("Script", jPanel3);
        jPanel4.setName("jPanel4");
        jScrollPane3.setName("jScrollPane3");
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 11));
        jTextArea2.setRows(5);
        jTextArea2.setName("jTextArea2");
        jScrollPane3.setViewportView(jTextArea2);
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE));
        jTabbedPane1.addTab("Tmp", jPanel4);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE));
    }

    private void jComboBoxNameActionPerformed(java.awt.event.ActionEvent evt) {
        if (mClassSetting > 0) return;
        if (mCard == null) return;
        if (jComboBoxName.getSelectedIndex() == -1) {
            jTextPaneScript.setText("");
        } else {
            String key = (String) jComboBoxName.getSelectedItem();
            jTextPaneScript.setText(mCard.getScript(key));
        }
    }

    public void setScriptButtonEnabled(boolean b) {
        jButtonScriptPanel.setVisible(b);
    }

    private void jButtonScriptPanelActionPerformed(java.awt.event.ActionEvent evt) {
        if (mMainDisplay != null) {
            mMainDisplay.openDebugCardScriptWindow(mCard);
        }
    }

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            if (evt.isControlDown()) {
                if (mCard != null) {
                    mMainDisplay.displayFullCard(mCard);
                    return;
                }
            }
        }
    }

    public void setTabs(JTextPane textPane, int charactersPerTab) {
        FontMetrics fm = textPane.getFontMetrics(textPane.getFont());
        int charWidth = fm.charWidth('w');
        int tabWidth = charWidth * charactersPerTab;
        TabStop[] tabs = new TabStop[10];
        for (int j = 0; j < tabs.length; j++) {
            int tab = j + 1;
            tabs[j] = new TabStop(tab * tabWidth);
        }
        TabSet tabSet = new TabSet(tabs);
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        StyleConstants.setTabSet(attributes, tabSet);
        int length = textPane.getDocument().getLength();
        textPane.getStyledDocument().setParagraphAttributes(0, length, attributes, false);
    }

    private void resetConfigPool(boolean select, String name) {
        select = false;
        if (mCard == null) return;
        mClassSetting++;
        jComboBoxName.removeAllItems();
        if (mProvider == null) {
            jComboBoxName.setSelectedIndex(-1);
            Image image = Card.getBackImageTrueSize();
            jLabel1.setIcon(new ImageIcon(image));
            jTextPaneScript.setText("");
            mClassSetting--;
            return;
        }
        String[] keys = mProvider.getSituations().getSituationKeys();
        for (int i = 0; i < keys.length; i++) {
            jComboBoxName.addItem(keys[i]);
            if (select) {
                if ((name != null) && (name.length() > 0)) {
                    if (name.equals(keys[i])) {
                        jComboBoxName.setSelectedIndex(i);
                    }
                } else if (i == 0) {
                    jComboBoxName.setSelectedIndex(i);
                }
            }
        }
        if (!select) {
            jComboBoxName.setSelectedIndex(-1);
            jTextPaneScript.setText("");
            Image image = Card.getBackImageTrueSize();
            jLabel1.setIcon(new ImageIcon(image));
        }
        mClassSetting--;
    }

    private javax.swing.JButton jButtonScriptPanel;

    private javax.swing.JComboBox jComboBoxName;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel24;

    private javax.swing.JLabel jLabel25;

    private javax.swing.JLabel jLabel26;

    private javax.swing.JLabel jLabel27;

    private javax.swing.JLabel jLabel28;

    private javax.swing.JLabel jLabel29;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel30;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JPanel jPanel3;

    private javax.swing.JPanel jPanel4;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JScrollPane jScrollPane2;

    private javax.swing.JScrollPane jScrollPane3;

    private javax.swing.JTabbedPane jTabbedPane1;

    private javax.swing.JTextArea jTextArea1;

    private javax.swing.JTextArea jTextArea2;

    private javax.swing.JTextField jTextFieldId1;

    private javax.swing.JTextField jTextFieldMana1;

    private javax.swing.JTextField jTextFieldName1;

    private javax.swing.JTextField jTextFieldPower1;

    private javax.swing.JTextField jTextFieldScannedAbilities;

    private javax.swing.JTextField jTextFieldSubType1;

    private javax.swing.JTextField jTextFieldToughness1;

    private javax.swing.JTextField jTextFieldType1;

    private javax.swing.JTextPane jTextPaneScript;

    public void setCard(Card card) {
        mClassSetting++;
        if ((card == null) || (card.getType().trim().length() == 0)) {
            Image image = Card.getBackImageTrueSize();
            jLabel1.setIcon(new ImageIcon(image));
            mClassSetting--;
            return;
        }
        mCard = card;
        mProvider = mCard;
        resetConfigPool(false, "");
        jTextFieldId1.setText("" + mCard.getId());
        jTextFieldName1.setText(mCard.getName());
        jTextFieldMana1.setText(mCard.getMana());
        jTextFieldPower1.setText("" + mCard.getNowPower());
        jTextFieldToughness1.setText("" + mCard.getNowToughness());
        jTextFieldType1.setText(mCard.getType());
        jTextFieldSubType1.setText(mCard.getSubtype());
        jTextArea1.setText(mCard.getText());
        jTextArea2.setText(mCard.getVolatileInfo());
        jTextArea2.setCaretPosition(0);
        jTextFieldScannedAbilities.setText(mCard.getNowCardAbilities().toString());
        Image image = mCard.getImageTrueSize();
        jLabel1.setIcon(new ImageIcon(image));
        jTextArea1.setCaretPosition(0);
        mClassSetting--;
    }

    int mX = 0;

    int mY = 0;

    public void setMyPrefferedSize(int x, int y) {
        mX = x;
        mY = y;
        setPreferredSize(new Dimension(x, y));
    }

    private int getSizeX() {
        return mX - 8;
    }

    private int getSizeY() {
        return mY - 30;
    }

    public void scaleChanged() {
        setCard(mCard);
    }

    public void setDebugNeeds(JPortalView mainDisplay) {
        mMainDisplay = mainDisplay;
    }

    Color mBackColor;

    Color mForColor;

    void saveDefault() {
        mBackColor = getBackground();
        mForColor = getForeground();
    }

    public void setBlack(boolean b) {
        if (b) {
            Blacker.setBlack((JComponent) this);
            setBackground(new Color(0, 0, 0, 0));
            setOpaque(false);
        } else {
            Blacker.setDefault((JComponent) this);
        }
    }

    @Override
    public void paintComponent(java.awt.Graphics g) {
        if (isOpaque()) {
            super.paintComponent(g);
            return;
        }
        setOpaque(true);
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
        setOpaque(false);
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    public void disableButtons() {
        jButtonScriptPanel.setEnabled(false);
    }
}