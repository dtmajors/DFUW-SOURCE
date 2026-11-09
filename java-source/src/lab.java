/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kzx
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class lab
extends JPanel {
    private JTextField qqq;
    private JTextField qqr;
    private JButton qqs;
    private JButton qqt;
    private JTextField qqu;
    private JTextField qqv;
    private JComboBox qqw;
    private JComboBox qqx;
    private JButton qqy;
    private JButton qqz;
    private JButton qqA;
    private JTextField qqB;
    private JComboBox qqC;
    private JButton qqD;
    private JButton qqE;
    private JButton qqF;
    private kzx qoZ;
    private Color qqG = Color.red;
    private Color qqH = Color.white;
    private String qqI = "";

    public lab(kzx kzx2) {
        this.qoZ = kzx2;
        this.init();
    }

    public void xZ(boolean bl) {
        this.qqy.setEnabled(bl);
        this.qqz.setEnabled(!bl);
        this.qqA.setEnabled(!bl);
    }

    public void ya(boolean bl) {
        this.qqD.setEnabled(bl);
        this.qqE.setEnabled(!bl);
        this.qqF.setEnabled(!bl);
        this.qqI = "";
        this.qqr.setBackground(this.qqH);
        this.qqr.select(0, 0);
        this.qoZ.yo(this.qqI);
    }

    public String[] ekT() {
        String[] stringArray = new String[]{this.qqq.getText(), this.qqr.getText(), (String)this.qqw.getSelectedItem(), this.qqu.getText(), (String)this.qqx.getSelectedItem(), this.qqv.getText(), this.qqB.getText(), (String)this.qqC.getSelectedItem()};
        return stringArray;
    }

    public void Q(String[] stringArray) {
        this.qqq.setText(stringArray[0]);
        this.qqr.setText(stringArray[1]);
        this.qqw.setSelectedItem(stringArray[2]);
        this.qqu.setText(stringArray[3]);
        this.qqx.setSelectedItem(stringArray[4]);
        this.qqv.setText(stringArray[5]);
        this.qqB.setText(stringArray[6]);
        this.qqC.setSelectedItem(stringArray[7]);
    }

    public void bw(Object[] objectArray) {
        String string = (String)this.qqC.getSelectedItem();
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel)this.qqC.getModel();
        defaultComboBoxModel.removeAllElements();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            defaultComboBoxModel.addElement(objectArray[i2]);
        }
        this.qqC.setSelectedItem(string);
    }

    private void init() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.add((Component)this.ekU(), gridBagConstraints);
        gridBagConstraints.gridy = 1;
        this.add((Component)this.ekV(), gridBagConstraints);
        gridBagConstraints.gridy = 2;
        this.add((Component)this.ekW(), gridBagConstraints);
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        this.add(Box.createVerticalGlue(), gridBagConstraints);
    }

    private JPanel ekU() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Function Properties"));
        JLabel jLabel = new JLabel("Function");
        this.qqq = new JTextField(20);
        this.qqq.setEditable(true);
        JLabel jLabel2 = new JLabel("ParentFunction");
        this.qqr = new JTextField(20);
        this.qqr.setBackground(this.qqH);
        this.qqr.setEditable(false);
        this.qqr.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (lab.a(this.qqJ) == "ParentFunction") {
                        lab.a(this.qqJ, "");
                        lab.c(this.qqJ).setBackground(lab.b(this.qqJ));
                        lab.c(this.qqJ).select(0, 0);
                    } else {
                        lab.a(this.qqJ, "ParentFunction");
                        lab.c(this.qqJ).setBackground(lab.d(this.qqJ));
                        lab.c(this.qqJ).select(0, 0);
                        lab.e(this.qqJ).setBackground(lab.b(this.qqJ));
                    }
                    lab.f(this.qqJ).yo(lab.a(this.qqJ));
                }
            }
        });
        this.qqs = new JButton("Change FunctionName");
        this.qqs.addActionListener(new AbstractAction(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lab.g(this.qqJ).getText();
                if (string != null && string.trim() != "") {
                    lab.f(this.qqJ).yd(string);
                }
            }
        });
        this.qqt = new JButton("Move Function");
        this.qqt.addActionListener(new AbstractAction(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lab.c(this.qqJ).getText();
                if (string != null && string.trim() != "") {
                    lab.f(this.qqJ).ye(string);
                }
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qqs);
        jPanel2.add(this.qqt);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qqq, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qqr, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 0;
        gridBagConstraints.anchor = 13;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel ekV() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("ObjectFunction Mapping"));
        JLabel jLabel = new JLabel("ObjectType");
        this.qqw = new JComboBox<String>(this.qoZ.ekC());
        this.qqw.setBackground(this.qqH);
        this.qqw.setEditable(false);
        this.qqw.addItemListener(new ItemListener(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                if (itemEvent.getStateChange() == 1) {
                    lab.f(this.qqJ).ekv();
                }
            }
        });
        JLabel jLabel2 = new JLabel("Function");
        this.qqu = new JTextField(20);
        this.qqu.setBackground(this.qqH);
        this.qqu.setEditable(false);
        JLabel jLabel3 = new JLabel("FunctionObjectType");
        this.qqx = new JComboBox<String>(bkd.a.getFunctionObjectNames());
        this.qqx.setBackground(this.qqH);
        this.qqx.setEditable(false);
        JLabel jLabel4 = new JLabel("ReactionFunction");
        this.qqv = new JTextField(20);
        this.qqv.setBackground(this.qqH);
        this.qqv.setEditable(false);
        this.qqv.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (lab.a(this.qqJ) == "OF_ReactionFunction") {
                        lab.a(this.qqJ, "");
                        lab.e(this.qqJ).setBackground(lab.b(this.qqJ));
                        lab.e(this.qqJ).select(0, 0);
                    } else {
                        lab.a(this.qqJ, "OF_ReactionFunction");
                        lab.e(this.qqJ).setBackground(lab.d(this.qqJ));
                        lab.e(this.qqJ).select(0, 0);
                        lab.c(this.qqJ).setBackground(lab.b(this.qqJ));
                    }
                    lab.f(this.qqJ).yo(lab.a(this.qqJ));
                }
            }
        });
        this.qqy = new JButton("Add Mapping");
        this.qqy.addActionListener(new AbstractAction(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = (String)lab.h(this.qqJ).getSelectedItem();
                String string2 = lab.i(this.qqJ).getText();
                String string3 = (String)lab.j(this.qqJ).getSelectedItem();
                String string4 = lab.e(this.qqJ).getText();
                lab.f(this.qqJ).d(string, string2, string3, string4);
            }
        });
        this.qqz = new JButton("Change Mapping");
        this.qqz.addActionListener(new AbstractAction(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = (String)lab.h(this.qqJ).getSelectedItem();
                String string2 = lab.i(this.qqJ).getText();
                String string3 = (String)lab.j(this.qqJ).getSelectedItem();
                String string4 = lab.e(this.qqJ).getText();
                lab.f(this.qqJ).e(string, string2, string3, string4);
            }
        });
        this.qqA = new JButton("Delete Mapping");
        this.qqA.addActionListener(new AbstractAction(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                lab.f(this.qqJ).ekB();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qqy);
        jPanel2.add(this.qqz);
        jPanel2.add(this.qqA);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qqw, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qqu, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qqx, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel4, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qqv, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel ekW() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("FunctionAction Mapping"));
        JLabel jLabel = new JLabel("Function");
        this.qqB = new JTextField(20);
        this.qqB.setBackground(this.qqH);
        this.qqB.setEditable(false);
        this.qqB.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (lab.a(this.qqJ) == "FA_Function") {
                        lab.a(this.qqJ, "");
                        lab.k(this.qqJ).setBackground(lab.b(this.qqJ));
                        lab.k(this.qqJ).select(0, 0);
                    } else {
                        lab.a(this.qqJ, "FA_Function");
                        lab.k(this.qqJ).setBackground(lab.d(this.qqJ));
                        lab.k(this.qqJ).select(0, 0);
                    }
                    lab.f(this.qqJ).yo(lab.a(this.qqJ));
                }
            }
        });
        JLabel jLabel2 = new JLabel("Action");
        this.qqC = new JComboBox<Object>(this.qoZ.ekE());
        this.qqC.setBackground(this.qqH);
        this.qqC.setEditable(false);
        this.qqC.addItemListener(new ItemListener(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                if (itemEvent.getStateChange() != 1 || !lab.l(this.qqJ).getSelectedItem().equals("")) {
                    // empty if block
                }
            }
        });
        this.qqD = new JButton("Add Mapping");
        this.qqD.addActionListener(new AbstractAction(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lab.g(this.qqJ).getText();
                String string2 = (String)lab.l(this.qqJ).getSelectedItem();
            }
        });
        this.qqE = new JButton("Change Mapping");
        this.qqE.addActionListener(new AbstractAction(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lab.g(this.qqJ).getText();
                String string2 = (String)lab.l(this.qqJ).getSelectedItem();
            }
        });
        this.qqF = new JButton("Delete Mapping");
        this.qqF.addActionListener(new AbstractAction(this){
            final /* synthetic */ lab qqJ;
            {
                this.qqJ = lab2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lab.g(this.qqJ).getText();
                String string2 = (String)lab.l(this.qqJ).getSelectedItem();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qqD);
        jPanel2.add(this.qqE);
        jPanel2.add(this.qqF);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qqB, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qqC, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    static /* synthetic */ String a(lab lab2) {
        return lab2.qqI;
    }

    static /* synthetic */ String a(lab lab2, String string) {
        lab2.qqI = string;
        return lab2.qqI;
    }

    static /* synthetic */ Color b(lab lab2) {
        return lab2.qqH;
    }

    static /* synthetic */ JTextField c(lab lab2) {
        return lab2.qqr;
    }

    static /* synthetic */ Color d(lab lab2) {
        return lab2.qqG;
    }

    static /* synthetic */ JTextField e(lab lab2) {
        return lab2.qqv;
    }

    static /* synthetic */ kzx f(lab lab2) {
        return lab2.qoZ;
    }

    static /* synthetic */ JTextField g(lab lab2) {
        return lab2.qqq;
    }

    static /* synthetic */ JComboBox h(lab lab2) {
        return lab2.qqw;
    }

    static /* synthetic */ JTextField i(lab lab2) {
        return lab2.qqu;
    }

    static /* synthetic */ JComboBox j(lab lab2) {
        return lab2.qqx;
    }

    static /* synthetic */ JTextField k(lab lab2) {
        return lab2.qqB;
    }

    static /* synthetic */ JComboBox l(lab lab2) {
        return lab2.qqC;
    }
}

