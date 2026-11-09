/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
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
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lah
extends JPanel {
    private final String qrv = "MaterialShaderPairPane";
    private final String qrw = "MeshPane";
    private JTextField qrx;
    private JTextField qry;
    private JPanel qrz;
    private CardLayout qmq;
    private JComboBox qrA;
    private JTextField qrB;
    private JTextField qrC;
    private JTextField qrD;
    private JButton qrE;
    private JTextField qrF;
    private JTextField qrG;
    private JComboBox qrH;
    private JComboBox qrI;
    private JComboBox qrJ;
    private JButton qrK;
    private String[] qrL;
    private String[] qrM;
    private String[] qrN;
    private String[] qrO;
    private kzx qoZ = null;
    private Color qqG = Color.red;
    private Color qqH = Color.white;
    private String qqI = "";
    private cah qrP = null;
    private cai qrQ = null;
    private cam qrR = null;
    private les ResourceTree = lea.enW();

    public lah(kzx kzx2) {
        this.qoZ = kzx2;
        this.init();
    }

    public void e(cah cah2) {
        this.qrP = cah2;
        if (this.qrP != null) {
            this.qrA.setSelectedItem(this.qrP.aFS().name());
            this.qrB.setText("" + this.qrP.aFO());
            this.qrC.setText(this.qrP.aFT().aFP()[0]);
            this.qrD.setText(this.qrP.aFU().aHa());
        } else {
            this.qrA.setSelectedItem(null);
            this.qrB.setText(null);
            this.qrC.setText(null);
            this.qrD.setText(null);
        }
        this.qmq.show(this.qrz, "MaterialShaderPairPane");
    }

    public void e(cai cai2) {
        this.qrQ = cai2;
        if (this.qrQ != null) {
            String string = this.qrQ.aFY().name();
            this.qrF.setText(string);
            String string2 = this.qrQ.aGc();
            this.qrH.setSelectedItem(string2);
            switch (this.qrQ.aFY()) {
                case eeL: {
                    DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel)this.qrI.getModel();
                    defaultComboBoxModel.removeAllElements();
                    int n = this.qrL.length;
                    for (int i2 = 0; i2 < n; ++i2) {
                        defaultComboBoxModel.addElement(this.qrL[i2]);
                    }
                    bzu bzu2 = (bzu)this.qrQ;
                    this.qrI.setSelectedItem(bzu2.aFC().name());
                    this.qrJ.setSelectedItem(bzu2.getAttachPointName());
                    this.qrJ.setEnabled(true);
                    this.qrG.setText(bzu2.getFileName());
                    this.qrG.setEnabled(true);
                    break;
                }
                case eeM: {
                    DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel)this.qrI.getModel();
                    defaultComboBoxModel.removeAllElements();
                    int n = this.qrM.length;
                    for (int i3 = 0; i3 < n; ++i3) {
                        defaultComboBoxModel.addElement(this.qrM[i3]);
                    }
                    caa caa2 = (caa)this.qrQ;
                    this.qrI.setSelectedItem(caa2.aFI().name());
                    this.qrJ.setSelectedItem(null);
                    this.qrJ.setEnabled(false);
                    this.qrG.setText(null);
                    this.qrG.setEnabled(false);
                    break;
                }
                case eeN: {
                    DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel)this.qrI.getModel();
                    defaultComboBoxModel.removeAllElements();
                    int n = this.qrO.length;
                    for (int i4 = 0; i4 < n; ++i4) {
                        defaultComboBoxModel.addElement(this.qrO[i4]);
                    }
                    cax cax2 = (cax)this.qrQ;
                    this.qrI.setSelectedItem(cax2.aHc().name());
                    this.qrJ.setSelectedItem(null);
                    this.qrJ.setEnabled(false);
                    this.qrG.setText(cax2.getFileName());
                    this.qrG.setEnabled(true);
                    break;
                }
                default: {
                    lfn.b(5, "SFXMLPaperDollPropertyView", "notifyMeshItemSelected() Invalid meshitemtype provided: " + (Object)((Object)this.qrQ.aFY()));
                    assert (false);
                    return;
                }
            }
        } else {
            this.qrF.setText(null);
            this.qrH.setSelectedItem(null);
            this.qrI.setSelectedItem(null);
            this.qrJ.setSelectedItem(null);
            this.qrG.setText(null);
        }
        this.qmq.show(this.qrz, "MeshPane");
    }

    public void c(cam cam2) {
        this.qrR = cam2;
        if (this.qrR != null) {
            this.qrx.setText(this.qrR.pa());
            if (this.qrR instanceof cao) {
                cao cao2 = (cao)this.qrR;
                this.qry.setText(cao2.Yq());
            } else {
                this.qry.setText(null);
            }
        } else {
            this.qrx.setText(null);
            this.qry.setText(null);
        }
        this.qmq.show(this.qrz, "MeshPane");
    }

    private void init() {
        this.qrL = cak.a.getPriorityLevelNames();
        this.qrM = cak.b.getPriorityLevelNames();
        this.qrN = cak.d.getPriorityLevelNames();
        this.qrO = cak.g.getPriorityLevelNames();
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
        this.add((Component)this.elg(), gridBagConstraints);
        this.qmq = new CardLayout();
        this.qrz = new JPanel();
        this.qrz.setLayout(this.qmq);
        this.qrz.add((Component)this.elh(), "MaterialShaderPairPane");
        this.qrz.add((Component)this.eli(), "MeshPane");
        this.qmq.show(this.qrz, "MaterialShaderPairPane");
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 2;
        this.add((Component)this.qrz, gridBagConstraints);
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        this.add(Box.createVerticalGlue(), gridBagConstraints);
    }

    private JPanel elg() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("PaperdollItem Properties"));
        JLabel jLabel = new JLabel("ResourceName");
        this.qrx = new JTextField(20);
        this.qrx.setBackground(this.qqH);
        this.qrx.setEditable(false);
        JLabel jLabel2 = new JLabel("NPCName");
        this.qry = new JTextField(20);
        this.qry.setBackground(this.qqH);
        this.qry.setEditable(false);
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
        jPanel.add((Component)this.qrx, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.qry, gridBagConstraints);
        return jPanel;
    }

    private JPanel elh() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("MaterialShaderPair Properties"));
        JLabel jLabel = new JLabel("PriorityLevel");
        this.qrA = new JComboBox<String>(this.qrN);
        this.qrA.setBackground(this.qqH);
        this.qrA.setEditable(false);
        JLabel jLabel2 = new JLabel("MaterialID");
        this.qrB = new JTextField(5);
        this.qrB.setBackground(this.qqH);
        this.qrB.setEditable(true);
        JLabel jLabel3 = new JLabel("TextureName");
        this.qrC = new JTextField(25);
        this.qrC.setBackground(this.qqH);
        this.qrC.setEditable(true);
        JLabel jLabel4 = new JLabel("ShaderName");
        this.qrD = new JTextField(25);
        this.qrD.setBackground(this.qqH);
        this.qrD.setEditable(true);
        this.qrE = new JButton("Change MaterialShaderPair");
        this.qrE.addActionListener(new AbstractAction(this){
            final /* synthetic */ lah qrS;
            {
                this.qrS = lah2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = (String)lah.a(this.qrS).getSelectedItem();
                cak.d d2 = cak.d.getMaterialPriorityLevel(string);
                if (d2 == null) {
                    lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() PriorityLevel is null.");
                    return;
                }
                String string2 = lah.b(this.qrS).getText();
                if (string2 == null || string2.trim().equals("")) {
                    lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() MaterialID is invalid.");
                    return;
                }
                int n = Integer.parseInt(string2);
                if (n < 0) {
                    lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() MaterialID is invalid.");
                    return;
                }
                String string3 = lah.c(this.qrS).getText();
                if (string3 == null || string3.trim().equals("")) {
                    lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() TextureName is invalid.");
                    return;
                }
                String string4 = lah.d(this.qrS).getText();
                if (string4 == null || string4.trim().equals("")) {
                    lfn.b(5, "SFXMLPaperDollPropertyView.createMaterialShaderPairPane()", "actionPerformed() ShaderName is invalid.");
                    return;
                }
                lah.e(this.qrS).a(d2);
                lah.e(this.qrS).aFT().oo(n);
                lah.e(this.qrS).aFT().j(new String[]{string3});
                lah.e(this.qrS).aFU().oo(n);
                lah.e(this.qrS).aFU().gW(string4);
                lah.f(this.qrS).ekw();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qrE);
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
        jPanel.add((Component)this.qrA, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qrB, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qrC, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add((Component)jLabel4, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)this.qrD, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(10, 0, 10, 10);
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel eli() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("MeshItem Properties"));
        JLabel jLabel = new JLabel("MeshItemType");
        this.qrF = new JTextField(25);
        this.qrF.setBackground(this.qqH);
        this.qrF.setEditable(false);
        JLabel jLabel2 = new JLabel("SubsetID");
        this.qrH = new JComboBox<String>(cak.aGg());
        this.qrH.setBackground(this.qqH);
        this.qrH.setEditable(false);
        JLabel jLabel3 = new JLabel("PriorityLevel");
        this.qrI = new JComboBox();
        this.qrI.setBackground(this.qqH);
        this.qrI.setEditable(false);
        JLabel jLabel4 = new JLabel("AttachPointName");
        this.qrJ = new JComboBox<String>(ei.ff());
        this.qrJ.setBackground(this.qqH);
        this.qrJ.setEditable(false);
        JLabel jLabel5 = new JLabel("FileName");
        this.qrG = new JTextField(25);
        this.qrG.setBackground(this.qqH);
        this.qrG.setEditable(true);
        this.qrK = new JButton("Change MeshItem");
        this.qrK.addActionListener(new AbstractAction(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ lah qrS;
            {
                this.qrS = lah2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n = cak.gV((String)lah.g(this.qrS).getSelectedItem());
                if (n < 0) {
                    lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() SubsetID is invalid.");
                    return;
                }
                String string = (String)lah.h(this.qrS).getSelectedItem();
                switch (lah.i(this.qrS).aFY()) {
                    case eeL: {
                        cak.a a2 = cak.a.getAttachedMeshPriorityLevel(string);
                        if (a2 == null) {
                            lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() PriorityLevel is null.");
                            return;
                        }
                        String string2 = (String)lah.j(this.qrS).getSelectedItem();
                        if (string2 == null || string2.trim().equals("")) {
                            lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() AttachPointName is invalid.");
                            return;
                        }
                        String string3 = lah.k(this.qrS).getText();
                        if (string3 == null || string3.trim().equals("")) {
                            lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() FileName is invalid.");
                            return;
                        }
                        bzu bzu2 = (bzu)lah.i(this.qrS);
                        bzu2.eA(n);
                        bzu2.a(a2);
                        bzu2.setAttachPointName(string2);
                        bzu2.setFileName(string3);
                        break;
                    }
                    case eeM: {
                        cak.b b2 = cak.b.getDummyMeshPriorityLevel(string);
                        if (b2 == null) {
                            lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() PriorityLevel is null.");
                            return;
                        }
                        caa caa2 = (caa)lah.i(this.qrS);
                        caa2.eA(n);
                        caa2.a(b2);
                        break;
                    }
                    case eeN: {
                        cak.g g2 = cak.g.getSubsetMeshPriorityLevel(string);
                        if (g2 == null) {
                            lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() PriorityLevel is null.");
                            return;
                        }
                        String string4 = lah.k(this.qrS).getText();
                        if (string4 == null || string4.trim().equals("")) {
                            lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() FileName is invalid.");
                            return;
                        }
                        cax cax2 = (cax)lah.i(this.qrS);
                        cax2.eA(n);
                        cax2.a(g2);
                        cax2.setFileName(string4);
                        break;
                    }
                    default: {
                        lfn.b(5, "SFXMLPaperDollPropertyView.createMeshItemPane()", "actionPerformed() Invalid meshitemtype provided: " + (Object)((Object)lah.i(this.qrS).aFY()));
                        if (!$assertionsDisabled) {
                            throw new AssertionError();
                        }
                        return;
                    }
                }
                lah.f(this.qrS).ekw();
            }

            static {
                $assertionsDisabled = !lah.class.desiredAssertionStatus();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qrK);
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
        jPanel.add((Component)this.qrF, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qrH, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qrI, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel5, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.qrG, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel4, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.qrJ, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    static /* synthetic */ JComboBox a(lah lah2) {
        return lah2.qrA;
    }

    static /* synthetic */ JTextField b(lah lah2) {
        return lah2.qrB;
    }

    static /* synthetic */ JTextField c(lah lah2) {
        return lah2.qrC;
    }

    static /* synthetic */ JTextField d(lah lah2) {
        return lah2.qrD;
    }

    static /* synthetic */ cah e(lah lah2) {
        return lah2.qrP;
    }

    static /* synthetic */ kzx f(lah lah2) {
        return lah2.qoZ;
    }

    static /* synthetic */ JComboBox g(lah lah2) {
        return lah2.qrH;
    }

    static /* synthetic */ JComboBox h(lah lah2) {
        return lah2.qrI;
    }

    static /* synthetic */ cai i(lah lah2) {
        return lah2.qrQ;
    }

    static /* synthetic */ JComboBox j(lah lah2) {
        return lah2.qrJ;
    }

    static /* synthetic */ JTextField k(lah lah2) {
        return lah2.qrG;
    }
}

