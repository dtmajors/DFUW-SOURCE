/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  kzx
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lad
extends JPanel {
    private kzx qoZ = null;
    private JCheckBox qqN;
    private JCheckBox qqO;
    private JComboBox qqP;
    private JComboBox qqQ;
    private JComboBox qqR;
    private JComboBox qqS;
    private JTextField qqT;
    private JTextField qqU;
    private les aqN = lea.enZ();

    public lad(kzx kzx2) {
        this.qoZ = kzx2;
        this.init();
    }

    private void init() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.add((Component)this.ekX(), gridBagConstraints);
        gridBagConstraints.gridy = 1;
        this.add((Component)this.ekY(), gridBagConstraints);
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        this.add(Box.createVerticalGlue(), gridBagConstraints);
    }

    private JPanel ekX() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Configure Attribute"));
        JLabel jLabel = new JLabel("AttributeName");
        this.qqP = new JComboBox<String>(this.getAttributeNames());
        this.qqP.setEditable(false);
        this.qqP.addItemListener(new ItemListener(this){
            final /* synthetic */ lad qqV;
            {
                this.qqV = lad2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                String string = (String)itemEvent.getItem();
                int n = ep.as((String)string);
                if (!ep.aR((int)n)) {
                    lad.a(this.qqV).setSelectedIndex(0);
                }
            }
        });
        JLabel jLabel2 = new JLabel("AttributeRelationName");
        this.qqQ = new JComboBox<String>(this.ela());
        this.qqQ.setEditable(false);
        JLabel jLabel3 = new JLabel("AttributeValue");
        this.qqT = new JTextField(30);
        this.qqT.setEditable(true);
        this.qqT.setText(null);
        JLabel jLabel4 = new JLabel("AddValue");
        this.qqO = new JCheckBox("", false);
        JButton jButton = new JButton("Send AttributeMessage");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ lad qqV;
            {
                this.qqV = lad2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n;
                String string;
                String string2 = (String)lad.b(this.qqV).getSelectedItem();
                int n2 = ep.as((String)string2);
                if (n2 <= 0) {
                    lfn.b(5, "SFXMLGamelogicConfigPropertyView.SendMessageButton", "actionPerformed() AttributeName '" + string2 + "' is invalid.");
                    return;
                }
                if (ep.aR((int)n2)) {
                    string = (String)lad.a(this.qqV).getSelectedItem();
                    n = 0;
                    if (string.equals("Plain")) {
                        n = 0;
                    } else if (string.equals("Min")) {
                        n = 1;
                    } else if (string.equals("Max")) {
                        n = 2;
                    } else if (string.equals("MaxMax")) {
                        n = 4;
                    } else {
                        lfn.b(5, "SFXMLGamelogicConfigPropertyView", "createAttributePane() AttributeRelationName '" + string + "' is invalid.");
                        return;
                    }
                    n2 = ep.k((int)n2, (int)n);
                }
                if ((string = lad.c(this.qqV).getText()) == null || string.trim().equals("")) {
                    lfn.b(5, "SFXMLGamelogicConfigPropertyView.SendMessageButton", "actionPerformed() AttributeValue '" + string + "' is invalid.");
                    return;
                }
                n = lad.d(this.qqV).isSelected();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add((Component)jButton, "East");
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qqP, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qqQ, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qqT, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel4, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qqO, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel ekY() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Configure SkillProperty"));
        JLabel jLabel = new JLabel("ServerSkill");
        this.qqN = new JCheckBox("", false);
        JLabel jLabel2 = new JLabel("SkillName");
        this.qqR = new JComboBox<String>(this.elb());
        this.qqR.setEditable(false);
        JLabel jLabel3 = new JLabel("PropertyName");
        this.qqS = new JComboBox<String>(this.getPropertyNames());
        this.qqS.setEditable(false);
        JLabel jLabel4 = new JLabel("PropertyValue");
        this.qqU = new JTextField(30);
        this.qqU.setEditable(true);
        this.qqU.setText(null);
        JButton jButton = new JButton("Send SkillMessage");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ lad qqV;
            {
                this.qqV = lad2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = (String)lad.e(this.qqV).getSelectedItem();
                int n = lad.f(this.qqV).getType(string);
                if (n <= 0) {
                    lfn.b(5, "SFXMLGamelogicConfigPropertyView.SendMessageButton", "actionPerformed() SkillName '" + string + "' is invalid.");
                    return;
                }
                String string2 = (String)lad.g(this.qqV).getSelectedItem();
                String string3 = lad.h(this.qqV).getText();
                if (string3 == null || string3.trim().equals("")) {
                    lfn.b(5, "SFXMLGamelogicConfigPropertyView.SendMessageButton", "actionPerformed() PropertyValue '" + string3 + "' is invalid.");
                    return;
                }
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add((Component)jButton, "East");
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qqN, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qqR, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qqS, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel4, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        jPanel.add((Component)this.qqU, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel ekZ() {
        return null;
    }

    private String[] getAttributeNames() {
        ArrayList<String> arrayList = lcn.emv();
        Iterator iterator = ep.fz().values().iterator();
        eo eo2 = null;
        while (iterator.hasNext()) {
            eo2 = (eo)iterator.next();
            if (!ep.aE((int)eo2.Type)) continue;
            arrayList.add(eo2.Name);
        }
        Collections.sort(arrayList);
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private String[] ela() {
        String[] stringArray = new String[]{"Plain", "Min", "Max", "MaxMax"};
        return stringArray;
    }

    private String[] elb() {
        String[] stringArray = new String[]{"s_Archery", "s_Swordplay"};
        return stringArray;
    }

    private String[] getPropertyNames() {
        String[] stringArray = new String[]{"DelayTimerLength", "DurationTimerLength", "BlockingTimerLength"};
        return stringArray;
    }

    static /* synthetic */ JComboBox a(lad lad2) {
        return lad2.qqQ;
    }

    static /* synthetic */ JComboBox b(lad lad2) {
        return lad2.qqP;
    }

    static /* synthetic */ JTextField c(lad lad2) {
        return lad2.qqT;
    }

    static /* synthetic */ JCheckBox d(lad lad2) {
        return lad2.qqO;
    }

    static /* synthetic */ JComboBox e(lad lad2) {
        return lad2.qqR;
    }

    static /* synthetic */ les f(lad lad2) {
        return lad2.aqN;
    }

    static /* synthetic */ JComboBox g(lad lad2) {
        return lad2.qqS;
    }

    static /* synthetic */ JTextField h(lad lad2) {
        return lad2.qqU;
    }
}

