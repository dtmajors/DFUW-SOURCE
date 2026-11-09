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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class laq
extends JPanel {
    private JTextField qtl;
    private JTextField qtm;
    private JButton qtn;
    private JButton qto;
    private JTextField qtp;
    private JTextField qtq;
    private JButton qtr;
    private JButton qts;
    private JButton qtt;
    private kzx qoZ = null;
    private Color qqG = Color.red;
    private Color qqH = Color.white;
    private String qqI = "";
    private les nOR = lea.enS();

    public laq(kzx kzx2) {
        this.qoZ = kzx2;
        this.init();
    }

    public void yb(boolean bl) {
        this.qtr.setEnabled(bl);
        this.qts.setEnabled(!bl);
        this.qtt.setEnabled(!bl);
        this.qqI = "";
        this.qtm.setBackground(this.qqH);
        this.qtm.select(0, 0);
        this.qoZ.yr(this.qqI);
    }

    public String[] ekT() {
        String[] stringArray = new String[]{this.qtl.getText(), this.qtm.getText(), this.qtp.getText(), this.qtq.getText()};
        return stringArray;
    }

    public void Q(String[] stringArray) {
        this.qtl.setText(stringArray[0]);
        this.qtm.setText(stringArray[1]);
        this.qtp.setText(stringArray[2]);
        this.qtq.setText(stringArray[3]);
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
        this.add((Component)this.elH(), gridBagConstraints);
        gridBagConstraints.gridy = 1;
        this.add((Component)this.elI(), gridBagConstraints);
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        this.add(Box.createVerticalGlue(), gridBagConstraints);
    }

    private JPanel elH() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Skill Properties"));
        JLabel jLabel = new JLabel("Skill");
        this.qtl = new JTextField(20);
        this.qtl.setEditable(true);
        JLabel jLabel2 = new JLabel("ParentSkill");
        this.qtm = new JTextField(20);
        this.qtm.setBackground(this.qqH);
        this.qtm.setEditable(false);
        this.qtm.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ laq qtu;
            {
                this.qtu = laq2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (laq.a(this.qtu) == "ParentSkill") {
                        laq.a(this.qtu, "");
                        laq.c(this.qtu).setBackground(laq.b(this.qtu));
                        laq.c(this.qtu).select(0, 0);
                    } else {
                        laq.a(this.qtu, "ParentSkill");
                        laq.c(this.qtu).setBackground(laq.d(this.qtu));
                        laq.c(this.qtu).select(0, 0);
                    }
                    laq.e(this.qtu).yr(laq.a(this.qtu));
                }
            }
        });
        this.qtn = new JButton("Change SkillName");
        this.qtn.addActionListener(new AbstractAction(this){
            final /* synthetic */ laq qtu;
            {
                this.qtu = laq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = laq.f(this.qtu).getText();
                if (string != null && string.trim() != "") {
                    laq.e(this.qtu).yh(string);
                }
            }
        });
        this.qto = new JButton("Move Skill");
        this.qto.addActionListener(new AbstractAction(this){
            final /* synthetic */ laq qtu;
            {
                this.qtu = laq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = laq.c(this.qtu).getText();
                if (string != null && string.trim() != "") {
                    laq.e(this.qtu).yi(string);
                }
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qtn);
        jPanel2.add(this.qto);
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
        jPanel.add((Component)this.qtl, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qtm, gridBagConstraints);
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

    private JPanel elI() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("ActionSkill Mapping"));
        JLabel jLabel = new JLabel("Action");
        this.qtp = new JTextField(20);
        this.qtp.setBackground(this.qqH);
        this.qtp.setEditable(false);
        this.qtp.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ laq qtu;
            {
                this.qtu = laq2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (laq.a(this.qtu) == "AS_Action") {
                        laq.a(this.qtu, "");
                        laq.g(this.qtu).setBackground(laq.b(this.qtu));
                        laq.g(this.qtu).select(0, 0);
                    } else {
                        laq.a(this.qtu, "AS_Action");
                        laq.g(this.qtu).setBackground(laq.d(this.qtu));
                        laq.g(this.qtu).select(0, 0);
                    }
                    laq.e(this.qtu).yn(laq.a(this.qtu));
                }
            }
        });
        JLabel jLabel2 = new JLabel("Skill");
        this.qtq = new JTextField(20);
        this.qtq.setBackground(this.qqH);
        this.qtq.setEditable(false);
        this.qtq.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ laq qtu;
            {
                this.qtu = laq2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (laq.a(this.qtu) == "AS_Skill") {
                        laq.a(this.qtu, "");
                        laq.h(this.qtu).setBackground(laq.b(this.qtu));
                        laq.h(this.qtu).select(0, 0);
                    } else {
                        laq.a(this.qtu, "AS_Skill");
                        laq.h(this.qtu).setBackground(laq.d(this.qtu));
                        laq.h(this.qtu).select(0, 0);
                    }
                    laq.e(this.qtu).yr(laq.a(this.qtu));
                }
            }
        });
        this.qtr = new JButton("Add Mapping");
        this.qtr.addActionListener(new AbstractAction(this){
            final /* synthetic */ laq qtu;
            {
                this.qtu = laq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = laq.g(this.qtu).getText();
                String string2 = laq.h(this.qtu).getText();
            }
        });
        this.qts = new JButton("Change Mapping");
        this.qts.addActionListener(new AbstractAction(this){
            final /* synthetic */ laq qtu;
            {
                this.qtu = laq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = laq.g(this.qtu).getText();
                String string2 = laq.h(this.qtu).getText();
            }
        });
        this.qtt = new JButton("Delete Mapping");
        this.qtt.addActionListener(new AbstractAction(this){
            final /* synthetic */ laq qtu;
            {
                this.qtu = laq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = laq.g(this.qtu).getText();
                String string2 = laq.h(this.qtu).getText();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qtr);
        jPanel2.add(this.qts);
        jPanel2.add(this.qtt);
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
        jPanel.add((Component)this.qtp, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qtq, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    static /* synthetic */ String a(laq laq2) {
        return laq2.qqI;
    }

    static /* synthetic */ String a(laq laq2, String string) {
        laq2.qqI = string;
        return laq2.qqI;
    }

    static /* synthetic */ Color b(laq laq2) {
        return laq2.qqH;
    }

    static /* synthetic */ JTextField c(laq laq2) {
        return laq2.qtm;
    }

    static /* synthetic */ Color d(laq laq2) {
        return laq2.qqG;
    }

    static /* synthetic */ kzx e(laq laq2) {
        return laq2.qoZ;
    }

    static /* synthetic */ JTextField f(laq laq2) {
        return laq2.qtl;
    }

    static /* synthetic */ JTextField g(laq laq2) {
        return laq2.qtp;
    }

    static /* synthetic */ JTextField h(laq laq2) {
        return laq2.qtq;
    }
}

