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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class lan
extends JPanel {
    private JTextField qsQ;
    private JTextField qsR;
    private JTextField qsS;
    private JCheckBox qsT;
    private JComboBox qsU;
    private JComboBox qsV;
    private JButton qsW;
    private JButton qsX;
    private JButton qsY;
    private kzx qoZ;
    private Color qqG = Color.red;
    private Color qqH = Color.white;
    private String qqI = "";
    private lgw qsZ = null;
    private les ResourceTree = lea.enW();

    public lan(kzx kzx2) {
        this.qoZ = kzx2;
        this.init();
    }

    public String[] ekT() {
        String[] stringArray = new String[6];
        stringArray[0] = this.qsQ.getText();
        stringArray[1] = this.qsR.getText();
        return stringArray;
    }

    public void Q(String[] stringArray) {
        this.qsQ.setText(stringArray[0]);
        this.qsR.setText(stringArray[1]);
        if (stringArray[0] == null || stringArray[0].trim().equals("")) {
            this.qsZ = null;
            this.qsS.setText(null);
            this.qsT.setSelected(false);
            this.qsU.setSelectedItem(bqm.a.dDV.name());
            this.qsV.setSelectedItem(null);
        } else {
            this.qsZ = (lgw)this.ResourceTree.acv(this.ResourceTree.getType(stringArray[0]));
            assert (this.qsZ != null);
            this.qsS.setText(this.qsZ.atw().Name);
            this.qsT.setSelected(this.qsZ.awQ());
            this.qsU.setSelectedItem(this.qsZ.erJ().name());
            this.qsV.setSelectedItem(this.qsZ.auO().name());
        }
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
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.add((Component)this.elC(), gridBagConstraints);
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = 2;
        this.add((Component)this.elD(), gridBagConstraints);
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = 1;
        this.add((Component)new JPanel(), gridBagConstraints);
    }

    private JPanel elC() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Resource Properties"));
        JLabel jLabel = new JLabel("Resource");
        this.qsQ = new JTextField(20);
        this.qsQ.setBackground(this.qqH);
        this.qsQ.setEditable(true);
        JLabel jLabel2 = new JLabel("ParentResource");
        this.qsR = new JTextField(20);
        this.qsR.setBackground(this.qqH);
        this.qsR.setEditable(false);
        this.qsR.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ lan qta;
            {
                this.qta = lan2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (lan.a(this.qta) == "ParentResource") {
                        lan.a(this.qta, "");
                        lan.c(this.qta).setBackground(lan.b(this.qta));
                        lan.c(this.qta).select(0, 0);
                    } else {
                        lan.a(this.qta, "ParentResource");
                        lan.c(this.qta).setBackground(lan.d(this.qta));
                        lan.c(this.qta).select(0, 0);
                    }
                    lan.e(this.qta).yq(lan.a(this.qta));
                }
            }
        });
        this.qsX = new JButton("Change ResourceName");
        this.qsX.addActionListener(new AbstractAction(this){
            final /* synthetic */ lan qta;
            {
                this.qta = lan2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lan.f(this.qta).getText();
                if (string != null && string.trim() != "") {
                    lan.e(this.qta).yf(string);
                }
            }
        });
        this.qsY = new JButton("Move Resource");
        this.qsY.addActionListener(new AbstractAction(this){
            final /* synthetic */ lan qta;
            {
                this.qta = lan2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lan.c(this.qta).getText();
                if (string != null && string.trim() != "") {
                    lan.e(this.qta).yg(string);
                }
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qsX);
        jPanel2.add(this.qsY);
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
        jPanel.add((Component)this.qsQ, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.0;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel.add((Component)this.qsR, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = 13;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    private JPanel elD() {
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("ResourceInfo Properties"));
        JLabel jLabel = new JLabel("TextureFileName");
        this.qsS = new JTextField(25);
        this.qsS.setBackground(this.qqH);
        this.qsS.setEditable(true);
        JLabel jLabel2 = new JLabel("HotActivatedAction");
        this.qsU = new JComboBox<String>(bqm.a.getActivatableActionNames());
        this.qsU.setBackground(this.qqH);
        this.qsU.setEditable(false);
        this.qsT = new JCheckBox("HotAccessible", false);
        this.qsT.setHorizontalTextPosition(2);
        JLabel jLabel3 = new JLabel("Layer");
        this.qsV = new JComboBox<String>(cak.c.getLayerNames());
        this.qsV.setBackground(this.qqH);
        this.qsV.setEditable(false);
        this.qsW = new JButton("Change Resource");
        this.qsW.addActionListener(new AbstractAction(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ lan qta;
            {
                this.qta = lan2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = lan.g(this.qta).getText();
                if (string == null || string.trim().equals("")) {
                    lfn.b(5, "SFXMLResourcePropertyView", "createResourcePane() TextureFileName is null.");
                    return;
                }
                boolean bl = lan.h(this.qta).isSelected();
                bqm.a a2 = bqm.a.getActivatableAction((String)lan.i(this.qta).getSelectedItem());
                String string2 = (String)lan.j(this.qta).getSelectedItem();
                cak.c c2 = cak.c.valueOf(string2);
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                lan.k(this.qta).a(a2);
                lan.k(this.qta).b(c2);
            }

            static {
                $assertionsDisabled = !lan.class.desiredAssertionStatus();
            }
        });
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(this.qsW);
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
        jPanel.add((Component)this.qsS, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = 2;
        jPanel.add((Component)this.qsT, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel.add((Component)jLabel2, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsU, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel.add((Component)jLabel3, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = 0;
        jPanel.add((Component)this.qsV, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = 13;
        jPanel.add((Component)jPanel2, gridBagConstraints);
        return jPanel;
    }

    static /* synthetic */ String a(lan lan2) {
        return lan2.qqI;
    }

    static /* synthetic */ String a(lan lan2, String string) {
        lan2.qqI = string;
        return lan2.qqI;
    }

    static /* synthetic */ Color b(lan lan2) {
        return lan2.qqH;
    }

    static /* synthetic */ JTextField c(lan lan2) {
        return lan2.qsR;
    }

    static /* synthetic */ Color d(lan lan2) {
        return lan2.qqG;
    }

    static /* synthetic */ kzx e(lan lan2) {
        return lan2.qoZ;
    }

    static /* synthetic */ JTextField f(lan lan2) {
        return lan2.qsQ;
    }

    static /* synthetic */ JTextField g(lan lan2) {
        return lan2.qsS;
    }

    static /* synthetic */ JCheckBox h(lan lan2) {
        return lan2.qsT;
    }

    static /* synthetic */ JComboBox i(lan lan2) {
        return lan2.qsU;
    }

    static /* synthetic */ JComboBox j(lan lan2) {
        return lan2.qsV;
    }

    static /* synthetic */ lgw k(lan lan2) {
        return lan2.qsZ;
    }
}

