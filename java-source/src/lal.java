/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ep
 *  kzx
 */
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lal
extends JPanel {
    private final String qrY = "CRAFTINGPANE";
    private final String qrZ = "ENCHANTINGPANE";
    private final String qsa = "INGREDIENTPANE";
    private final String qsb = "REQUIREDSKILLPANE";
    private final String qsc = "ENCHANTMENTCONFIGURATIONPANE";
    private kzx qoZ = null;
    private JPanel qrz;
    private CardLayout qmq;
    private Color qqH = Color.WHITE;
    private JTextField qsd;
    private JTextField qse;
    private JTextField qsf;
    private JTextField qsg;
    private JTextField qsh;
    private JTextField qsi;
    private JTextField qsj;
    private JTextField qsk;
    private JTextField qsl;
    private JTextField qsm;
    private JTextField qsn;
    private JTextField qso;
    private JTextField qsp;
    private JTextField qsq;
    private JTextField qsr;
    private JTextField qss;
    private JTextField qst;
    private JTextField qsu;
    private JCheckBox qsv;
    private JComboBox qsw;
    private JComboBox qsx;
    private JComboBox qsy;
    private JComboBox qsz;
    private JButton qsA;
    private JButton qsB;
    private JButton qsC;
    private les DX = lea.enT();
    private les ResourceTree = lea.enW();
    private les aqN = lea.enZ();
    private Map qsD = null;
    private ctu qsE = null;
    private ctv qsF = null;
    private ctm qsG = null;
    private ctz qsH = null;
    private all qsI = null;

    public lal(kzx kzx2) {
        this.qoZ = kzx2;
        this.init();
    }

    public void i(ctu ctu2) {
        this.qsE = ctu2;
        if (this.qsE != null) {
            this.qsd.setText(this.qsE.pa());
            this.qse.setText("" + this.qsE.vf());
            this.qsf.setText("" + this.qsE.bbF());
            this.qsg.setText("" + this.qsE.bbG());
            this.qsh.setText(this.qsE.DF());
        } else {
            this.qsd.setText(null);
            this.qse.setText(null);
            this.qsf.setText(null);
            this.qsg.setText(null);
            this.qsh.setText(null);
        }
        this.qmq.show(this.qrz, "CRAFTINGPANE");
    }

    public void b(ctv ctv2) {
    }

    public void b(all all2) {
        this.qsI = all2;
        if (this.qsI != null) {
            this.qsw.setSelectedItem(all2.DJ());
            this.qsx.setSelectedItem(all2.DK());
            switch (all2.DG()) {
                case 1: {
                    this.qsy.setSelectedItem(null);
                    this.qsz.setSelectedItem(null);
                    this.qsr.setText(all2.CE());
                    this.qss.setText(null);
                    this.qst.setText(all2.Bu());
                    this.qsu.setText("" + all2.DD());
                    break;
                }
                case 2: {
                    this.qsy.setSelectedItem(null);
                    this.qsz.setSelectedItem(null);
                    this.qsr.setText(null);
                    this.qss.setText(null);
                    this.qst.setText(all2.Bu());
                    this.qsu.setText("" + all2.DD());
                    break;
                }
                case 3: {
                    this.qsy.setSelectedItem(null);
                    this.qsz.setSelectedItem(null);
                    this.qsr.setText(null);
                    this.qss.setText(all2.pa());
                    this.qst.setText(null);
                    this.qsu.setText("" + all2.DD());
                    break;
                }
                case 4: {
                    this.qsy.setSelectedItem(all2.DL());
                    this.qsz.setSelectedItem(all2.DM());
                    this.qsr.setText(null);
                    this.qss.setText(null);
                    this.qst.setText(null);
                    this.qsu.setText("" + all2.DD());
                    break;
                }
                case 5: {
                    this.qsy.setSelectedItem(all2.DL());
                    this.qsz.setSelectedItem(all2.DM());
                    this.qsr.setText(null);
                    this.qss.setText(null);
                    this.qst.setText(null);
                    this.qsu.setText("" + all2.DD());
                    break;
                }
                case 6: {
                    this.qsy.setSelectedItem(null);
                    this.qsz.setSelectedItem(null);
                    this.qsr.setText(null);
                    this.qss.setText(null);
                    this.qst.setText(all2.Bu());
                    this.qsu.setText(null);
                    break;
                }
                default: {
                    assert (false);
                    break;
                }
            }
            this.abx(all2.DG());
        } else {
            this.qsw.setSelectedItem(null);
            this.qsy.setSelectedItem(null);
            this.qsz.setSelectedItem(null);
            this.qsr.setText(null);
            this.qss.setText(null);
            this.qst.setText(null);
            this.qsu.setText(null);
            this.abx(0);
        }
        this.qmq.show(this.qrz, "ENCHANTMENTCONFIGURATIONPANE");
    }

    public void e(ctm ctm2) {
        this.qsG = ctm2;
        if (this.qsG != null) {
            this.qsl.setText(this.qsG.pa());
            this.qsm.setText("" + this.qsG.asi);
            this.qsn.setText("" + this.qsG.fgb);
        } else {
            this.qsl.setText(null);
            this.qsm.setText(null);
            this.qsn.setText(null);
        }
        this.qmq.show(this.qrz, "INGREDIENTPANE");
    }

    public void d(ctz ctz2) {
        this.qsH = ctz2;
        if (ctz2 != null) {
            this.qso.setText(this.qsH.Bu());
            this.qsp.setText("" + this.qsH.SkillLevel);
            this.qsq.setText("" + this.qsH.fgs);
            this.qsv.setSelected(this.qsH.fgt);
        } else {
            this.qso.setText(null);
            this.qsp.setText(null);
            this.qsq.setText(null);
            this.qsv.setSelected(false);
        }
        this.qmq.show(this.qrz, "REQUIREDSKILLPANE");
    }

    private void init() {
        this.qmq = new CardLayout();
        this.qrz = new JPanel();
        this.qrz.setLayout(this.qmq);
        this.qrz.add((Component)this.elx(), "CRAFTINGPANE");
        this.qrz.add((Component)this.ely(), "INGREDIENTPANE");
        this.qrz.add((Component)this.elz(), "REQUIREDSKILLPANE");
        this.qrz.add((Component)this.elA(), "ENCHANTMENTCONFIGURATIONPANE");
        this.qmq.show(this.qrz, "CRAFTINGPANE");
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
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.add((Component)this.qrz, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        this.add(Box.createVerticalGlue(), gridBagConstraints);
    }

    private JPanel elx() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("RecipeCrafting Properties"));
        JLabel jLabel = new JLabel("ResourceName");
        this.qsd = new JTextField(5);
        this.qsd.setBackground(this.qqH);
        this.qsd.setEditable(false);
        JLabel jLabel2 = new JLabel("Quantity");
        this.qse = new JTextField(5);
        this.qse.setBackground(this.qqH);
        this.qse.setEditable(true);
        JLabel jLabel3 = new JLabel("Difficulty");
        this.qsf = new JTextField(5);
        this.qsf.setBackground(this.qqH);
        this.qsf.setEditable(true);
        JLabel jLabel4 = new JLabel("DurationMultiplier");
        this.qsg = new JTextField(5);
        this.qsg.setBackground(this.qqH);
        this.qsg.setEditable(true);
        JLabel jLabel5 = new JLabel("RequiredResourceName");
        this.qsh = new JTextField(5);
        this.qsh.setBackground(this.qqH);
        this.qsh.setEditable(false);
        JButton jButton = new JButton("Set Resource");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lal.a(this.qsJ).u();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                lal.b(this.qsJ).setText(string);
            }
        });
        JButton jButton2 = new JButton("Change Recipe");
        jButton2.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n = lal.c(this.qsJ).getType(lal.b(this.qsJ).getText());
                if (n <= 0) {
                    return;
                }
                int n2 = lal.a(this.qsJ, lal.d(this.qsJ).getText());
                if (n2 <= 0) {
                    return;
                }
                float f2 = lal.b(this.qsJ, lal.e(this.qsJ).getText());
                if (f2 < -1.0f || f2 > 1.0f) {
                    return;
                }
                float f3 = lal.b(this.qsJ, lal.f(this.qsJ).getText());
                if (f3 <= 0.0f) {
                    return;
                }
                int n3 = lal.c(this.qsJ).getType(lal.g(this.qsJ).getText());
                if (!lal.c(this.qsJ).isDescendant(n3, cug.fgE)) {
                    return;
                }
                lal.h(this.qsJ).l(n);
                lal.h(this.qsJ).do(n2);
                lal.h(this.qsJ).eR(f2);
                lal.h(this.qsJ).eS(f3);
                lal.h(this.qsJ).un(n3);
                lal.a(this.qsJ).ekx();
            }
        });
        JButton jButton3 = new JButton("Set RequiredResource");
        jButton3.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lal.a(this.qsJ).u();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                int n = lal.c(this.qsJ).getType(string);
                if (!lal.c(this.qsJ).isDescendant(n, cug.fgE)) {
                    return;
                }
                lal.g(this.qsJ).setText(string);
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        jPanel2.add(jButton3);
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
        gridBagConstraints.fill = 0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)this.qsd, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        jPanel.add((Component)this.qse, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        jPanel.add((Component)this.qsf, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel.add((Component)jLabel4, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        jPanel.add((Component)this.qsg, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel.add((Component)jLabel5, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)this.qsh, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel ely() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Ingredient Properties"));
        JLabel jLabel = new JLabel("ResourceName");
        this.qsl = new JTextField(25);
        this.qsl.setBackground(this.qqH);
        this.qsl.setEditable(false);
        JLabel jLabel2 = new JLabel("Quantity");
        this.qsm = new JTextField(5);
        this.qsm.setBackground(this.qqH);
        this.qsm.setEditable(true);
        JLabel jLabel3 = new JLabel("FractionLoss  ( Max=10.0 )");
        this.qsn = new JTextField(5);
        this.qsn.setBackground(this.qqH);
        this.qsn.setEditable(true);
        JButton jButton = new JButton("Set SelectedResource");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lal.a(this.qsJ).u();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                lal.i(this.qsJ).setText(string);
            }
        });
        JButton jButton2 = new JButton("Change Ingredient");
        jButton2.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n = lal.c(this.qsJ).getType(lal.i(this.qsJ).getText());
                if (n <= 0) {
                    return;
                }
                int n2 = lal.a(this.qsJ, lal.j(this.qsJ).getText());
                if (n2 <= 0) {
                    return;
                }
                float f2 = lal.b(this.qsJ, lal.k(this.qsJ).getText());
                if (f2 < 0.0f || f2 > 10.0f) {
                    return;
                }
                lal.l((lal)this.qsJ).ResourceType = n;
                lal.l((lal)this.qsJ).asi = n2;
                lal.l((lal)this.qsJ).fgb = f2;
                lal.a(this.qsJ).ekx();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
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
        jPanel.add((Component)this.qsl, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsm, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsn, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel elz() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("RequiredSkill Properties"));
        JLabel jLabel = new JLabel("SkillName");
        this.qso = new JTextField(25);
        this.qso.setBackground(this.qqH);
        this.qso.setEditable(false);
        JLabel jLabel2 = new JLabel("SkillLevel");
        this.qsp = new JTextField(5);
        this.qsp.setBackground(this.qqH);
        this.qsp.setEditable(true);
        JLabel jLabel3 = new JLabel("InheritancePortion");
        this.qsq = new JTextField(5);
        this.qsq.setBackground(this.qqH);
        this.qsq.setEditable(true);
        this.qsv = new JCheckBox("UseInCraftingCheck", false);
        JButton jButton = new JButton("Set SelectedSkill");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lal.a(this.qsJ).eks();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                lal.m(this.qsJ).setText(string);
            }
        });
        JButton jButton2 = new JButton("Change RequiredSkill");
        jButton2.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n = lal.n(this.qsJ).getType(lal.m(this.qsJ).getText());
                if (n <= 0) {
                    return;
                }
                float f2 = lal.b(this.qsJ, lal.o(this.qsJ).getText());
                if (f2 <= 0.0f) {
                    return;
                }
                float f3 = lal.b(this.qsJ, lal.p(this.qsJ).getText());
                if (f3 < 0.0f || f3 > 1.0f) {
                    return;
                }
                boolean bl = lal.q(this.qsJ).isSelected();
                lal.r((lal)this.qsJ).SkillType = n;
                lal.r((lal)this.qsJ).SkillLevel = f2;
                lal.r((lal)this.qsJ).fgs = f3;
                lal.r((lal)this.qsJ).fgt = bl;
                lal.a(this.qsJ).ekx();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
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
        jPanel.add((Component)this.qso, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsp, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsq, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsv, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel elA() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("EnchantmentConfiguration Properties"));
        JLabel jLabel = new JLabel("EnchantmentClassName");
        this.qsw = new JComboBox<String>(aln.DP());
        this.qsw.setEditable(false);
        this.qsw.setBackground(Color.white);
        this.qsw.addItemListener(new ItemListener(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                String string = (String)lal.s(this.qsJ).getSelectedItem();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                int n = aln.cL(string);
                if (n <= 0) {
                    return;
                }
                lal.a(this.qsJ, n);
            }
        });
        JLabel jLabel2 = new JLabel("ItemClassName");
        this.qsx = new JComboBox<String>(aln.DQ());
        this.qsx.setEditable(false);
        this.qsx.setBackground(Color.white);
        JLabel jLabel3 = new JLabel("AttributeName");
        this.qsy = new JComboBox<String>(this.getAttributeNames());
        this.qsy.setEditable(false);
        this.qsy.setBackground(Color.white);
        JLabel jLabel4 = new JLabel("AttributeRelationName");
        this.qsz = new JComboBox<String>(ep.fy());
        this.qsz.setEditable(false);
        this.qsz.setBackground(Color.white);
        JLabel jLabel5 = new JLabel("EffectName");
        this.qsr = new JTextField(25);
        this.qsr.setBackground(this.qqH);
        this.qsr.setEditable(false);
        JLabel jLabel6 = new JLabel("ResourceName");
        this.qss = new JTextField(25);
        this.qss.setBackground(this.qqH);
        this.qss.setEditable(false);
        JLabel jLabel7 = new JLabel("SkillName");
        this.qst = new JTextField(25);
        this.qst.setBackground(this.qqH);
        this.qst.setEditable(false);
        JLabel jLabel8 = new JLabel("EnchantmentMagnitude");
        this.qsu = new JTextField(5);
        this.qsu.setBackground(this.qqH);
        this.qsu.setEditable(true);
        this.qsA = new JButton("Set SelectedEffect");
        this.qsA.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lal.a(this.qsJ).ekr();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                lal.t(this.qsJ).setText(string);
            }
        });
        this.qsB = new JButton("Set SelectedResource");
        this.qsB.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lal.a(this.qsJ).u();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                lal.u(this.qsJ).setText(string);
            }
        });
        this.qsC = new JButton("Set SelectedSkill");
        this.qsC.addActionListener(new AbstractAction(this){
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lal.a(this.qsJ).eks();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                lal.v(this.qsJ).setText(string);
            }
        });
        JButton jButton = new JButton("Change Configuration");
        jButton.addActionListener(new AbstractAction(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ lal qsJ;
            {
                this.qsJ = lal2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = (String)lal.s(this.qsJ).getSelectedItem();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                int n = aln.cL(string);
                if (n <= 0) {
                    return;
                }
                String string2 = (String)lal.w(this.qsJ).getSelectedItem();
                if (string2 == null || string2.trim().equals("")) {
                    return;
                }
                int n2 = aln.cM(string2);
                if (n2 <= 0) {
                    return;
                }
                switch (n) {
                    case 1: {
                        int n3 = lal.x(this.qsJ).getType(lal.t(this.qsJ).getText());
                        if (n3 <= 0) {
                            return;
                        }
                        int n4 = lal.n(this.qsJ).getType(lal.v(this.qsJ).getText());
                        if (n4 <= 0) {
                            return;
                        }
                        float f2 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(n);
                        lal.z(this.qsJ).fV(n2);
                        lal.z(this.qsJ).fJ(n3);
                        lal.z(this.qsJ).eI(n4);
                        lal.z(this.qsJ).ap(f2);
                        break;
                    }
                    case 2: {
                        int n5 = lal.n(this.qsJ).getType(lal.v(this.qsJ).getText());
                        if (n5 <= 0) {
                            return;
                        }
                        float f3 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(n);
                        lal.z(this.qsJ).fV(n2);
                        lal.z(this.qsJ).eI(n5);
                        lal.z(this.qsJ).ap(f3);
                        break;
                    }
                    case 3: {
                        int n6 = lal.c(this.qsJ).getType(lal.u(this.qsJ).getText());
                        if (n6 <= 0) {
                            return;
                        }
                        float f4 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(n);
                        lal.z(this.qsJ).fV(n2);
                        lal.z(this.qsJ).l(n6);
                        lal.z(this.qsJ).ap(f4);
                        break;
                    }
                    case 4: {
                        String string3 = (String)lal.A(this.qsJ).getSelectedItem();
                        int n7 = ep.as((String)string3);
                        if (n7 <= 0) {
                            return;
                        }
                        String string4 = (String)lal.B(this.qsJ).getSelectedItem();
                        int n8 = ep.au((String)string4);
                        if (n8 < 0) {
                            return;
                        }
                        if ((n7 = ep.k((int)n7, (int)n8)) <= 0) {
                            return;
                        }
                        float f5 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(n);
                        lal.z(this.qsJ).fV(n2);
                        lal.z(this.qsJ).fC(n7);
                        lal.z(this.qsJ).ap(f5);
                        break;
                    }
                    case 5: {
                        String string5 = (String)lal.A(this.qsJ).getSelectedItem();
                        int n9 = ep.as((String)string5);
                        if (n9 <= 0) {
                            return;
                        }
                        String string6 = (String)lal.B(this.qsJ).getSelectedItem();
                        int n10 = ep.au((String)string6);
                        if (n10 < 0) {
                            return;
                        }
                        if (n10 != 0 && !ep.aR((int)n9)) {
                            return;
                        }
                        if ((n9 = ep.k((int)n9, (int)n10)) <= 0) {
                            return;
                        }
                        float f6 = lal.b(this.qsJ, lal.y(this.qsJ).getText());
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(n);
                        lal.z(this.qsJ).fV(n2);
                        lal.z(this.qsJ).fC(n9);
                        lal.z(this.qsJ).ap(f6);
                        break;
                    }
                    case 6: {
                        int n11 = lal.n(this.qsJ).getType(lal.v(this.qsJ).getText());
                        if (n11 <= 0) {
                            return;
                        }
                        lal.z(this.qsJ).reset();
                        lal.z(this.qsJ).fU(n);
                        lal.z(this.qsJ).fV(n2);
                        lal.z(this.qsJ).eI(n11);
                        break;
                    }
                    default: {
                        if (!$assertionsDisabled) {
                            throw new AssertionError();
                        }
                        return;
                    }
                }
                lal.a(this.qsJ).ekx();
            }

            static {
                $assertionsDisabled = !lal.class.desiredAssertionStatus();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qsA);
        jPanel2.add(this.qsB);
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new FlowLayout());
        jPanel3.add(this.qsC);
        jPanel3.add(jButton);
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
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsw, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsx, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsy, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel4, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsz, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel5, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        jPanel.add((Component)this.qsr, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel6, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        jPanel.add((Component)this.qss, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel7, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        jPanel.add((Component)this.qst, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel8, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsu, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)jPanel3, gridBagConstraints);
        return jPanel;
    }

    private void abx(int n) {
        switch (n) {
            case 1: {
                this.qsA.setEnabled(true);
                this.qsB.setEnabled(false);
                this.qsC.setEnabled(true);
                break;
            }
            case 2: {
                this.qsA.setEnabled(false);
                this.qsB.setEnabled(false);
                this.qsC.setEnabled(true);
                break;
            }
            case 3: {
                this.qsA.setEnabled(false);
                this.qsB.setEnabled(true);
                this.qsC.setEnabled(false);
                break;
            }
            case 4: {
                this.qsA.setEnabled(false);
                this.qsB.setEnabled(false);
                this.qsC.setEnabled(false);
                break;
            }
            case 5: {
                this.qsA.setEnabled(false);
                this.qsB.setEnabled(false);
                this.qsC.setEnabled(false);
                break;
            }
            case 6: {
                this.qsA.setEnabled(false);
                this.qsB.setEnabled(false);
                this.qsC.setEnabled(true);
                break;
            }
            default: {
                this.qsA.setEnabled(true);
                this.qsB.setEnabled(false);
                this.qsC.setEnabled(true);
            }
        }
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

    private float yK(String string) {
        if (string == null || string.trim().equals("")) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(string);
        }
        catch (Exception exception) {
            return 0.0f;
        }
    }

    private int yL(String string) {
        if (string == null || string.trim().equals("")) {
            return 0;
        }
        try {
            return Integer.parseInt(string);
        }
        catch (Exception exception) {
            return 0;
        }
    }

    static /* synthetic */ kzx a(lal lal2) {
        return lal2.qoZ;
    }

    static /* synthetic */ JTextField b(lal lal2) {
        return lal2.qsd;
    }

    static /* synthetic */ les c(lal lal2) {
        return lal2.ResourceTree;
    }

    static /* synthetic */ JTextField d(lal lal2) {
        return lal2.qse;
    }

    static /* synthetic */ int a(lal lal2, String string) {
        return lal2.yL(string);
    }

    static /* synthetic */ JTextField e(lal lal2) {
        return lal2.qsf;
    }

    static /* synthetic */ float b(lal lal2, String string) {
        return lal2.yK(string);
    }

    static /* synthetic */ JTextField f(lal lal2) {
        return lal2.qsg;
    }

    static /* synthetic */ JTextField g(lal lal2) {
        return lal2.qsh;
    }

    static /* synthetic */ ctu h(lal lal2) {
        return lal2.qsE;
    }

    static /* synthetic */ JTextField i(lal lal2) {
        return lal2.qsl;
    }

    static /* synthetic */ JTextField j(lal lal2) {
        return lal2.qsm;
    }

    static /* synthetic */ JTextField k(lal lal2) {
        return lal2.qsn;
    }

    static /* synthetic */ ctm l(lal lal2) {
        return lal2.qsG;
    }

    static /* synthetic */ JTextField m(lal lal2) {
        return lal2.qso;
    }

    static /* synthetic */ les n(lal lal2) {
        return lal2.aqN;
    }

    static /* synthetic */ JTextField o(lal lal2) {
        return lal2.qsp;
    }

    static /* synthetic */ JTextField p(lal lal2) {
        return lal2.qsq;
    }

    static /* synthetic */ JCheckBox q(lal lal2) {
        return lal2.qsv;
    }

    static /* synthetic */ ctz r(lal lal2) {
        return lal2.qsH;
    }

    static /* synthetic */ JComboBox s(lal lal2) {
        return lal2.qsw;
    }

    static /* synthetic */ void a(lal lal2, int n) {
        lal2.abx(n);
    }

    static /* synthetic */ JTextField t(lal lal2) {
        return lal2.qsr;
    }

    static /* synthetic */ JTextField u(lal lal2) {
        return lal2.qss;
    }

    static /* synthetic */ JTextField v(lal lal2) {
        return lal2.qst;
    }

    static /* synthetic */ JComboBox w(lal lal2) {
        return lal2.qsx;
    }

    static /* synthetic */ les x(lal lal2) {
        return lal2.DX;
    }

    static /* synthetic */ JTextField y(lal lal2) {
        return lal2.qsu;
    }

    static /* synthetic */ all z(lal lal2) {
        return lal2.qsI;
    }

    static /* synthetic */ JComboBox A(lal lal2) {
        return lal2.qsy;
    }

    static /* synthetic */ JComboBox B(lal lal2) {
        return lal2.qsz;
    }
}

