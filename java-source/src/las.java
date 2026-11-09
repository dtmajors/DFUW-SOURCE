/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  kzx
 */
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class las
extends JPanel {
    public final String qtx = "SpecialEffect";
    private kzx qoZ = null;
    private Map qty = lcn.emw();
    private Map pdS = lea.eoo();
    private dgj qtz = null;
    private boolean gqG = false;
    private CardLayout qtA;
    private JPanel qtB;
    private TitledBorder qtC = null;
    private JTextField qtD = null;
    private JButton qtE = null;

    public las(kzx kzx2) {
        this.qoZ = kzx2;
        this.init();
    }

    public dgj ekt() {
        if (this.gqG) {
            return this.qtz;
        }
        return null;
    }

    public void b(duf duf2) {
        String string = duf2.bAZ();
        kzz kzz2 = (kzz)this.qty.get(string);
        if (kzz2 == null) {
            return;
        }
        kzz2.a(duf2);
        this.repaint();
    }

    public void b(dgj dgj2, boolean bl) {
        this.qtz = dgj2;
        this.gqG = bl;
        if (this.qtz == null) {
            this.qtD.setText(null);
            return;
        }
        if (this.gqG) {
            this.qtD.setText(null);
        } else {
            this.qtD.setText(this.qtz.getSpecialEffectName());
        }
        this.qtD.setEditable(!this.gqG);
        this.qtE.setEnabled(!this.gqG);
        String string = this.qtz.getEffectClassName();
        kzz kzz2 = (kzz)this.qty.get(string);
        if (kzz2 == null) {
            duf duf2 = (duf)this.pdS.get(string);
            if (duf2 == null) {
                lfn.b(5, "SFXMLSpecialEffectPropertyView", "notifySpecialEffectSelected() EffectClass '" + string + "' has not been reflected.");
                return;
            }
            kzz2 = new kzz(string, this.qtz.getEffectClassType(), duf2);
            this.qty.put(string, kzz2);
            this.qtB.add((Component)kzz2, string);
        }
        kzz2.g(this.qtz);
        this.qtA.show(this.qtB, string);
        this.qtC.setTitle(string + " properties");
        this.repaint();
    }

    private void init() {
        this.qtB = this.elJ();
        this.qtC = BorderFactory.createTitledBorder("EffectBorder");
        JScrollPane jScrollPane = new JScrollPane(this.qtB);
        jScrollPane.setBorder(this.qtC);
        JLabel jLabel = new JLabel("SpecialEffectName");
        this.qtD = new JTextField("", 25);
        this.qtD.setEditable(true);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.add((Component)jLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        this.add((Component)this.qtD, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        this.add((Component)this.elK(), gridBagConstraints);
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.add((Component)jScrollPane, gridBagConstraints);
    }

    private JPanel elJ() {
        this.qtA = new CardLayout();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(this.qtA);
        String[] stringArray = del.bkK();
        duf duf2 = null;
        int n = 0;
        kzz kzz2 = null;
        for (int i = 0; i < stringArray.length; ++i) {
            duf2 = (duf)this.pdS.get(stringArray[i]);
            if (duf2 == null) {
                lfn.b(0, "SFXMLSpecialEffectPropertyView", "createEffectBackgroundPane() EffectClass '" + stringArray[i] + "' has not been reflected.");
                continue;
            }
            n = del.iF(stringArray[i]);
            kzz2 = new kzz(stringArray[i], n, duf2);
            this.qty.put(stringArray[i], kzz2);
            jPanel.add((Component)kzz2, stringArray[i]);
        }
        jPanel.validate();
        this.qtA.first(jPanel);
        return jPanel;
    }

    private JPanel elK() {
        JPanel jPanel = new JPanel();
        this.qtE = new JButton("Change SpecialEffectName");
        this.qtE.addActionListener(new AbstractAction(this){
            final /* synthetic */ las qtF;
            {
                this.qtF = las2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = las.a(this.qtF).getText();
                if (string == null || string.trim().equals("")) {
                    return;
                }
                if (del.t(las.b(this.qtF).getSpecialEffectType(), string)) {
                    las.c(this.qtF).eky();
                }
            }
        });
        JButton jButton = new JButton("Change SpecialEffect");
        jButton.addActionListener(new AbstractAction(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ las qtF;
            {
                this.qtF = las2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (las.b(this.qtF) == null) {
                    return;
                }
                if (!$assertionsDisabled && las.b(this.qtF) == null) {
                    throw new AssertionError();
                }
                String string = las.b(this.qtF).getEffectClassName();
                kzz kzz2 = (kzz)las.d(this.qtF).get(string);
                if (kzz2 == null) {
                    lfn.b(5, "SFXMLSpecialEffectPropertyView.ChangeEffectButton", "actionPerformed() EffectPane '" + string + "' was not found.");
                    return;
                }
                if (!kzz2.elv()) {
                    lfn.b(5, "SFXMLSpecialEffectPropertyView.ChangeEffectButton", "actionPerformed() EffectPane '" + string + "' contains invalid propertyvalues.");
                    return;
                }
                kzz2.h(las.b(this.qtF));
                las.c(this.qtF).eky();
            }

            static {
                $assertionsDisabled = !las.class.desiredAssertionStatus();
            }
        });
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 11;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 0;
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);
        jPanel.add((Component)this.qtE, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel.add((Component)jButton, gridBagConstraints);
        return jPanel;
    }

    static /* synthetic */ JTextField a(las las2) {
        return las2.qtD;
    }

    static /* synthetic */ dgj b(las las2) {
        return las2.qtz;
    }

    static /* synthetic */ kzx c(las las2) {
        return las2.qoZ;
    }

    static /* synthetic */ Map d(las las2) {
        return las2.qty;
    }
}

