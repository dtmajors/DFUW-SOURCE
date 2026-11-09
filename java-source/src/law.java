/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kzx
 *  lav
 *  lcw
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
import java.util.StringTokenizer;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class law
extends JPanel {
    private static final String qui = lcw.qLb + "xml-files/server/persistence/";
    private static String[] quj = null;
    private kzx qoZ;
    private lav quk;
    private JComboBox qul;
    private JTextField qum;
    private JCheckBox qun;
    private JCheckBox quo;
    private JTextField qup;
    private JTextField quq;
    private JCheckBox qur;
    private JTextField qus;
    private String qut;
    private String quu;
    private String quv;
    private String quw;
    private String qux;
    private String quy;
    private String quz;
    private String quA;
    private String quB;
    private String quC;

    public law(kzx kzx2) {
        this.qoZ = kzx2;
        try {
            jzo jzo2 = new jzo();
            jzo2.dTX();
        }
        catch (bg bg2) {
            lfn.log("SFXMLVerifierPropertyView", bg2);
        }
        this.init();
    }

    private void init() {
        a[] aArray = a.values();
        quj = new String[aArray.length];
        for (int i = 0; i < quj.length; ++i) {
            law.quj[i] = aArray[i].name();
        }
        this.qut = lcw.qLb + "xml-files/server/persistence/" + "skilltester" + "/";
        this.quu = lcw.qLb + "xml-files/server/" + "skill_test" + "/";
        this.quv = lcw.qLb + lcw.qMy;
        this.quw = lcw.qLb + lcw.qMz;
        this.quz = lcw.qLb + lcw.qMZ;
        this.qux = lcw.qLb + "xml-files/client/resource/";
        this.quy = lcw.qLb + "xml-files/server/resource/";
        this.quA = lcw.qLb + "xml-files/server/resourcecontainers/monster inventory/";
        this.quB = lcw.qLb + "xml-files/common/paperdoll/";
        this.quC = lcw.qLb + "xml-files/server/resourcecontainers/shop inventory/";
        this.quk = new lav(false);
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
        this.add((Component)this.elV(), gridBagConstraints);
        gridBagConstraints.gridy = 1;
        this.add((Component)this.elC(), gridBagConstraints);
        gridBagConstraints.gridy = 2;
        this.add((Component)this.elH(), gridBagConstraints);
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        this.add(Box.createVerticalGlue(), gridBagConstraints);
    }

    private JPanel elV() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Verify files in directory"));
        JLabel jLabel = new JLabel("OperationTypes");
        this.qul = new JComboBox<String>(quj);
        this.qul.setBackground(Color.white);
        this.qul.addItemListener(new ItemListener(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                law.b(this.quD).setText(law.a(this.quD));
            }
        });
        JLabel jLabel2 = new JLabel("DirectoryName");
        this.qum = new JTextField(25);
        this.qum.setEditable(true);
        this.qum.setText(this.quy);
        this.qun = new JCheckBox("Verify Only SubTypes", false);
        JButton jButton = new JButton("Select Directory");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = law.a(this.quD);
                JFileChooser jFileChooser = new JFileChooser(string);
                jFileChooser.setFileSelectionMode(1);
                int n = jFileChooser.showDialog(this.quD, "Select");
                if (n == 0) {
                    law.b(this.quD).setText(jFileChooser.getSelectedFile().getPath());
                }
            }
        });
        JButton jButton2 = new JButton("Verify files");
        jButton2.addActionListener(new AbstractAction(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = law.b(this.quD).getText();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                String string2 = (String)law.c(this.quD).getSelectedItem();
                a a2 = a.getOperationType(string2);
                if (a2 == null) {
                    return;
                }
                switch (a2) {
                    case quF: {
                        if (law.d(this.quD).isSelected()) {
                            String string3 = law.e(this.quD).u();
                            if (string3 == null) {
                                lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedResource is null.");
                                return;
                            }
                            int n = lea.enW().getType(string3);
                            if (n <= 0) {
                                lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedResource is invalid.");
                                return;
                            }
                            law.f(this.quD).Z(string, n);
                            break;
                        }
                        law.f(this.quD).Z(string, 0);
                        break;
                    }
                    case quG: 
                    case quH: {
                        if (law.d(this.quD).isSelected()) {
                            String string4 = law.e(this.quD).eks();
                            if (string4 == null) {
                                lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedSkill is null.");
                                return;
                            }
                            int n = lea.enZ().getType(string4);
                            if (n <= 0) {
                                lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedSkill is invalid.");
                                return;
                            }
                            law.f(this.quD).aa(string, n);
                            break;
                        }
                        law.f(this.quD).aa(string, 0);
                        break;
                    }
                    case quI: {
                        law.f(this.quD).yO(string);
                        break;
                    }
                    case quJ: {
                        law.f(this.quD).yR(string);
                        break;
                    }
                    case quK: {
                        law.f(this.quD).elS();
                        break;
                    }
                    case quL: {
                        law.f(this.quD).elT();
                        break;
                    }
                    case quM: {
                        law.f(this.quD).elR();
                        break;
                    }
                    case quN: {
                        String string5 = law.e(this.quD).u();
                        if (string5 == null) {
                            lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedResource is null.");
                            return;
                        }
                        int n = lea.enW().getType(string5);
                        if (n <= 0) {
                            lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() SelectedResource is invalid.");
                            return;
                        }
                        law.f(this.quD).Y(law.g(this.quD), n);
                        break;
                    }
                    default: {
                        lfn.b(5, "SFXMLVerifierPropertyView", "VerifyButton.actionPerformed() Invalid operationtype found: " + (Object)((Object)a2));
                        return;
                    }
                }
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
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qul, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.qum, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        jPanel.add((Component)this.qun, gridBagConstraints);
        gridBagConstraints.gridy = 3;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel elC() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Verify resource"));
        JLabel jLabel = new JLabel("ResourceName");
        this.quq = new JTextField(25);
        this.quq.setEditable(true);
        JLabel jLabel2 = new JLabel("DirectoryName");
        this.qup = new JTextField(25);
        this.qup.setEditable(true);
        this.quo = new JCheckBox("Verify Backup Resource", true);
        this.quo.addItemListener(new ItemListener(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                if (law.h(this.quD).isSelected()) {
                    law.i(this.quD).setEnabled(true);
                    law.i(this.quD).setEditable(true);
                } else {
                    law.i(this.quD).setEnabled(false);
                    law.i(this.quD).setEditable(false);
                }
            }
        });
        this.quo.setSelected(false);
        JButton jButton = new JButton("Get Selected Resource");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = law.e(this.quD).u();
                law.j(this.quD).setText(string);
            }
        });
        JButton jButton2 = new JButton("Select ResourceFile");
        jButton2.addActionListener(new AbstractAction(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (law.h(this.quD).isSelected()) {
                    mkb mkb2 = new mkb(law.k(this.quD));
                    mkb2.setFileSelectionMode(0);
                    int n = mkb2.showDialog(this.quD, "Select");
                    if (n == 0) {
                        jrw jrw2 = mkb2.eDc();
                        String string = jrw2.getName();
                        String string2 = jrw2.getAbsolutePath();
                        String string3 = string2.substring(law.elW().length());
                        StringTokenizer stringTokenizer = new StringTokenizer(string3, "/", false);
                        if (stringTokenizer.countTokens() != 2) {
                            lfn.b(5, "SFXMLVerifierPropertyView", "SelectResourceButton.actionPerformed() Invalid number of tokens found: '" + string3 + "'");
                            return;
                        }
                        law.i(this.quD).setText("xml-files/server/persistence/" + stringTokenizer.nextToken());
                        law.j(this.quD).setText(string.substring(0, string.lastIndexOf(46)));
                    }
                } else {
                    JFileChooser jFileChooser = new JFileChooser(law.g(this.quD));
                    jFileChooser.setFileSelectionMode(0);
                    int n = jFileChooser.showDialog(this.quD, "Select");
                    if (n == 0) {
                        String string = jFileChooser.getSelectedFile().getName();
                        string = string.substring(0, string.lastIndexOf(46));
                        law.j(this.quD).setText(string);
                    }
                }
            }
        });
        JButton jButton3 = new JButton("Verify");
        jButton3.addActionListener(new AbstractAction(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = law.j(this.quD).getText();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                if (law.h(this.quD).isSelected()) {
                    String string2 = law.i(this.quD).getText();
                    if (string2 == null || string2.trim().equals("")) {
                        return;
                    }
                    law.f(this.quD).aw(string2, string);
                } else {
                    law.f(this.quD).yP(string);
                }
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
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.quq, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.qup, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        jPanel.add((Component)this.quo, gridBagConstraints);
        gridBagConstraints.gridy = 3;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel elH() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Verify skill"));
        JLabel jLabel = new JLabel("SkillName");
        this.qus = new JTextField(25);
        this.qus.setEditable(true);
        this.qur = new JCheckBox("Use Test Skills", false);
        this.qur.addItemListener(new ItemListener(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                lcw.qGY = law.l(this.quD).isSelected();
                lcw.yj((boolean)law.l(this.quD).isSelected());
                lfn.b(0, "SFXMLVerifierPropertyView", "S_UseTestSkillsCheckBox.itemStateChanged() DirServerSkill='" + lcw.qMZ + "'");
            }
        });
        JButton jButton = new JButton("Get Selected Skill");
        jButton.addActionListener(new AbstractAction(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = law.e(this.quD).eks();
                law.m(this.quD).setText(string);
            }
        });
        JButton jButton2 = new JButton("Select SkillFile");
        jButton2.addActionListener(new AbstractAction(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser jFileChooser = null;
                jFileChooser = law.l(this.quD).isSelected() ? new JFileChooser(law.n(this.quD)) : new JFileChooser(law.o(this.quD));
                jFileChooser.setFileSelectionMode(0);
                int n = jFileChooser.showDialog(this.quD, "Select");
                if (n == 0) {
                    String string = jFileChooser.getSelectedFile().getName();
                    string = string.substring(0, string.lastIndexOf(46));
                    law.m(this.quD).setText(string);
                }
            }
        });
        JButton jButton3 = new JButton("Verify");
        jButton3.addActionListener(new AbstractAction(this){
            final /* synthetic */ law quD;
            {
                this.quD = law2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = law.m(this.quD).getText();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                law.f(this.quD).yQ(string);
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
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.qus, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)this.qur, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private String getDirectoryName() {
        String string = (String)this.qul.getSelectedItem();
        a a2 = a.getOperationType(string);
        switch (a2) {
            case quF: {
                return this.quy;
            }
            case quG: {
                return this.quv;
            }
            case quH: {
                return this.quw;
            }
            case quI: {
                return this.quA;
            }
            case quJ: {
                return this.quC;
            }
            case quK: {
                return this.quy;
            }
            case quL: {
                return this.quB;
            }
            case quM: {
                return "NULL";
            }
        }
        lfn.b(5, "SFXMLVerifierPropertyView", "getDirectoryName() Invalid operationtype found: " + (Object)((Object)a2));
        return this.quy;
    }

    static /* synthetic */ String a(law law2) {
        return law2.getDirectoryName();
    }

    static /* synthetic */ JTextField b(law law2) {
        return law2.qum;
    }

    static /* synthetic */ JComboBox c(law law2) {
        return law2.qul;
    }

    static /* synthetic */ JCheckBox d(law law2) {
        return law2.qun;
    }

    static /* synthetic */ kzx e(law law2) {
        return law2.qoZ;
    }

    static /* synthetic */ lav f(law law2) {
        return law2.quk;
    }

    static /* synthetic */ String g(law law2) {
        return law2.quy;
    }

    static /* synthetic */ JCheckBox h(law law2) {
        return law2.quo;
    }

    static /* synthetic */ JTextField i(law law2) {
        return law2.qup;
    }

    static /* synthetic */ JTextField j(law law2) {
        return law2.quq;
    }

    static /* synthetic */ String k(law law2) {
        return law2.qut;
    }

    static /* synthetic */ String elW() {
        return qui;
    }

    static /* synthetic */ JCheckBox l(law law2) {
        return law2.qur;
    }

    static /* synthetic */ JTextField m(law law2) {
        return law2.qus;
    }

    static /* synthetic */ String n(law law2) {
        return law2.quu;
    }

    static /* synthetic */ String o(law law2) {
        return law2.quz;
    }
}

