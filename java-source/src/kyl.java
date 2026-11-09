/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class kyl
extends JFrame {
    private kyr qkM = null;
    private Vector qkN = new Vector();
    private JComboBox qkO;
    private JComboBox qkP;
    private JComboBox qkQ;
    private JTextField qkR;
    private JCheckBox qkS;
    private JList qkT;
    private DefaultListModel qkU;

    public kyl(kyr kyr2, kyk[] kykArray) {
        this.qkM = kyr2;
        if (kykArray != null) {
            for (int i2 = 0; i2 < kykArray.length; ++i2) {
                this.qkN.add(kykArray[i2].eiM());
            }
        }
        this.init();
    }

    private void init() {
        JLabel jLabel = new JLabel("FilterType");
        this.qkO = new JComboBox<String>(kyk.eiO());
        this.qkO.setEditable(false);
        JLabel jLabel2 = new JLabel("CheckType");
        this.qkP = new JComboBox<String>(kyk.eiN());
        this.qkP.setEditable(false);
        JLabel jLabel3 = new JLabel("Minimum LogLevel");
        this.qkQ = new JComboBox<String>(kyk.eiP());
        this.qkQ.setEditable(false);
        JLabel jLabel4 = new JLabel("Expression");
        this.qkR = new JTextField(25);
        this.qkR.setEditable(true);
        this.qkS = new JCheckBox("Enabled", true);
        JButton jButton = new JButton("Add Filter");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ kyl qkV;
            {
                this.qkV = kyl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = (String)kyl.a(this.qkV).getSelectedItem();
                if (string == null) {
                    lfn.b(5, "AddButton", "actionPerformed() FilterTypeName is invalid");
                    return;
                }
                String string2 = (String)kyl.b(this.qkV).getSelectedItem();
                if (string2 == null) {
                    lfn.b(5, "AddButton", "actionPerformed() CheckTypeName is invalid");
                    return;
                }
                int n = kyk.xI((String)kyl.c(this.qkV).getSelectedItem());
                if (n < 0) {
                    lfn.b(5, "AddButton", "actionPerformed() MinLogLevel is invalid");
                    return;
                }
                String string3 = kyl.d(this.qkV).getText();
                kyk kyk2 = new kyk();
                kyk2.a(kyk.b.valueOf(string));
                kyk2.a(kyk.a.valueOf(string2));
                kyk2.abj(n);
                kyk2.setExpression(string3);
                kyk2.setEnabled(kyl.e(this.qkV).isSelected());
                kyl.f(this.qkV).add(kyk2);
                kyl.g(this.qkV).addElement(kyk2);
                kyl.h(this.qkV).setSelectedIndex(kyl.f(this.qkV).size() - 1);
            }
        });
        JButton jButton2 = new JButton("Change Filter");
        jButton2.addActionListener(new AbstractAction(this){
            final /* synthetic */ kyl qkV;
            {
                this.qkV = kyl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kyk kyk2 = (kyk)kyl.h(this.qkV).getSelectedValue();
                if (kyk2 == null) {
                    return;
                }
                String string = (String)kyl.a(this.qkV).getSelectedItem();
                if (string == null) {
                    lfn.b(5, "ChangeButton", "actionPerformed() FilterTypeName is invalid");
                    return;
                }
                String string2 = (String)kyl.b(this.qkV).getSelectedItem();
                if (string2 == null) {
                    lfn.b(5, "ChangeButton", "actionPerformed() CheckTypeName is invalid");
                    return;
                }
                int n = kyk.xI((String)kyl.c(this.qkV).getSelectedItem());
                if (n < 0) {
                    lfn.b(5, "ChangeButton", "actionPerformed() MinLogLevel is invalid");
                    return;
                }
                String string3 = kyl.d(this.qkV).getText();
                kyk2.a(kyk.b.valueOf(string));
                kyk2.a(kyk.a.valueOf(string2));
                kyk2.abj(n);
                kyk2.setExpression(string3);
                kyk2.setEnabled(kyl.e(this.qkV).isSelected());
                int n2 = kyl.h(this.qkV).getSelectedIndex();
                kyl.g(this.qkV).removeElementAt(n2);
                kyl.g(this.qkV).add(n2, kyk2);
                kyl.h(this.qkV).setSelectedIndex(n2);
            }
        });
        JButton jButton3 = new JButton("Remove Filter");
        jButton3.addActionListener(new AbstractAction(this){
            final /* synthetic */ kyl qkV;
            {
                this.qkV = kyl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kyk kyk2 = (kyk)kyl.h(this.qkV).getSelectedValue();
                if (kyk2 == null) {
                    return;
                }
                int n = kyl.h(this.qkV).getSelectedIndex();
                kyl.f(this.qkV).remove(n);
                kyl.g(this.qkV).remove(n);
            }
        });
        JButton jButton4 = new JButton("Save Filters");
        jButton4.addActionListener(new AbstractAction(this){
            final /* synthetic */ kyl qkV;
            {
                this.qkV = kyl2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                kyk[] kykArray = kyl.f(this.qkV).toArray(new kyk[kyl.f(this.qkV).size()]);
                kyl.i(this.qkV).a(kykArray);
                this.qkV.setVisible(false);
            }
        });
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        this.qkT = new JList();
        this.qkT.setSelectionMode(0);
        this.qkT.setLayoutOrientation(0);
        this.qkT.setMinimumSize(new Dimension(100, 50));
        this.qkT.addListSelectionListener(new ListSelectionListener(this){
            final /* synthetic */ kyl qkV;
            {
                this.qkV = kyl2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (kyl.h(this.qkV).getSelectedIndex() == -1) {
                    kyl.a(this.qkV).setSelectedIndex(0);
                    kyl.b(this.qkV).setSelectedIndex(0);
                    kyl.c(this.qkV).setSelectedIndex(0);
                    kyl.d(this.qkV).setText(null);
                    kyl.e(this.qkV).setSelected(false);
                } else {
                    kyk kyk2 = (kyk)kyl.h(this.qkV).getSelectedValue();
                    kyl.a(this.qkV).setSelectedIndex(kyk2.eiJ().ordinal());
                    kyl.b(this.qkV).setSelectedIndex(kyk2.eiK().ordinal());
                    kyl.c(this.qkV).setSelectedIndex(kyk2.eiL());
                    kyl.d(this.qkV).setText(kyk2.getExpression());
                    kyl.e(this.qkV).setSelected(kyk2.isEnabled());
                }
            }
        });
        this.qkU = new DefaultListModel();
        if (!this.qkN.isEmpty()) {
            for (int i2 = 0; i2 < this.qkN.size(); ++i2) {
                this.qkU.addElement(this.qkN.get(i2));
            }
        }
        this.qkT.setModel(this.qkU);
        JScrollPane jScrollPane = new JScrollPane(this.qkT);
        jScrollPane.setMinimumSize(new Dimension(300, 150));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add("North", jPanel);
        jPanel2.add("Center", jScrollPane);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        JPanel jPanel3 = (JPanel)this.getContentPane();
        jPanel3.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel3.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add((Component)this.qkO, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        jPanel3.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel3.add((Component)this.qkP, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        jPanel3.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel3.add((Component)this.qkQ, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.0;
        jPanel3.add((Component)jLabel4, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 2;
        jPanel3.add((Component)this.qkR, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.0;
        jPanel3.add((Component)this.qkS, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 1;
        jPanel3.add((Component)jPanel2, gridBagConstraints);
        this.setSize(500, 500);
    }

    static /* synthetic */ JComboBox a(kyl kyl2) {
        return kyl2.qkO;
    }

    static /* synthetic */ JComboBox b(kyl kyl2) {
        return kyl2.qkP;
    }

    static /* synthetic */ JComboBox c(kyl kyl2) {
        return kyl2.qkQ;
    }

    static /* synthetic */ JTextField d(kyl kyl2) {
        return kyl2.qkR;
    }

    static /* synthetic */ JCheckBox e(kyl kyl2) {
        return kyl2.qkS;
    }

    static /* synthetic */ Vector f(kyl kyl2) {
        return kyl2.qkN;
    }

    static /* synthetic */ DefaultListModel g(kyl kyl2) {
        return kyl2.qkU;
    }

    static /* synthetic */ JList h(kyl kyl2) {
        return kyl2.qkT;
    }

    static /* synthetic */ kyr i(kyl kyl2) {
        return kyl2.qkM;
    }
}

