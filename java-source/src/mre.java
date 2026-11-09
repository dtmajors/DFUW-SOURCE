/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class mre
extends JInternalFrame {
    private JButton EhZ;
    private JButton Eia;
    private JCheckBox Eib;
    private JCheckBox Eic;
    private JCheckBox Eid;
    private JComboBox Eie;
    private JSlider Eif;
    private JSlider Eig;
    private JSlider Eih;
    private JSlider Eii;
    private JTextField Eij;
    private JTextField Eik;
    private JTextField Eil;
    private JTextField Eim;
    private JTextField Ein;
    private JTextField Eio;
    private JTextField Eip;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JLabel R;
    private JLabel S;
    private JLabel T;
    private JLabel U;
    private JLabel V;
    private JPanel aa;
    public static mre Eiq = null;
    private dsk Eir = null;
    public static final float Eis = 4.0f;
    private boolean Eit = false;

    public mre() {
        this.b();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.Eim = new JTextField();
        this.P = new JLabel();
        this.Eil = new JTextField();
        this.Q = new JLabel();
        this.Eio = new JTextField();
        this.Eia = new JButton();
        this.EhZ = new JButton();
        this.Eig = new JSlider();
        this.R = new JLabel();
        this.S = new JLabel();
        this.T = new JLabel();
        this.Eik = new JTextField();
        this.Ein = new JTextField();
        this.Eic = new JCheckBox();
        this.Eid = new JCheckBox();
        this.Eif = new JSlider();
        this.Eih = new JSlider();
        this.Eij = new JTextField();
        this.Eib = new JCheckBox();
        this.Eie = new JComboBox();
        this.U = new JLabel();
        this.Eii = new JSlider();
        this.V = new JLabel();
        this.Eip = new JTextField();
        this.setTitle("Sound Emitter Properties...");
        this.aa.setBorder(new SoftBevelBorder(0));
        this.I.setText("Min Radius:");
        this.P.setText("Max Radius:");
        this.Eil.addActionListener(new ActionListener(this){
            final /* synthetic */ mre Eiu;
            {
                this.Eiu = mre2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mre.a(this.Eiu, actionEvent);
            }
        });
        this.Q.setText("Sound Xml:");
        this.Eia.setText("Set Max Radius From Camera");
        this.EhZ.setText("Pick");
        this.R.setText("Inner Cone Angle:");
        this.S.setText("Outer Cone Angle:");
        this.T.setText("Outside Cone Volume:");
        this.Eik.setText("360");
        this.Ein.setText("360");
        this.Eic.setText("Display Min Sphere");
        this.Eid.setText("Silence all other Sound Emitters");
        this.Eib.setText("Display Max Sphere");
        this.U.setText("RollOff Type:");
        this.Eii.setMaximum(1000);
        this.V.setText("Volume");
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Eic, -1, 477, Short.MAX_VALUE).addComponent(this.Eib, -1, 477, Short.MAX_VALUE).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.Q, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.P, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.I, GroupLayout.Alignment.LEADING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addComponent(this.Eio, -1, 345, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EhZ, -2, 63, -2)).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.Eim, GroupLayout.Alignment.LEADING).addComponent(this.Eil, GroupLayout.Alignment.LEADING, -1, 78, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.Eia, -1, 330, Short.MAX_VALUE).addComponent(this.Eig, -1, 330, Short.MAX_VALUE))))).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.R, GroupLayout.Alignment.LEADING).addComponent(this.S, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.Ein).addComponent(this.Eik, -1, 59, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.Eif, -2, -1, -2).addComponent(this.Eih, -2, -1, -2))).addGroup(groupLayout.createSequentialGroup().addComponent(this.T).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eij, -2, 74, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)).addComponent(this.Eid).addGroup(groupLayout.createSequentialGroup().addComponent(this.U).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eie, -2, 147, -2).addGap(116, 116, 116)).addGroup(groupLayout.createSequentialGroup().addComponent(this.V, -2, 99, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eip, -2, 95, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eii, -2, 258, -2))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.Eio, -2, -1, -2).addComponent(this.EhZ)).addGap(31, 31, 31).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.Eim, -2, -1, -2)).addComponent(this.Eig, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.Eil, -2, -1, -2).addComponent(this.Eia)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.R).addComponent(this.Eik, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.S).addComponent(this.Ein, -2, -1, -2))).addGroup(groupLayout.createSequentialGroup().addComponent(this.Eif, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.Eih, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.T).addComponent(this.Eij, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Eic).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eib).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eid).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.U).addComponent(this.Eie, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.V).addComponent(this.Eip, -2, -1, -2)).addComponent(this.Eii, -2, -1, -2)).addContainerGap(33, Short.MAX_VALUE)));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -2, -1, -2).addContainerGap(28, Short.MAX_VALUE)));
        this.pack();
    }

    private void by(ActionEvent actionEvent) {
    }

    public void c() {
        Eiq = this;
        ActionListener actionListener = new ActionListener(this){
            final /* synthetic */ mre Eiu;
            {
                this.Eiu = mre2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.Eiu.eKl();
            }
        };
        this.Eio.addActionListener(actionListener);
        this.Eim.addActionListener(actionListener);
        this.Eil.addActionListener(actionListener);
        this.Eik.addActionListener(actionListener);
        this.Ein.addActionListener(actionListener);
        this.Eij.addActionListener(actionListener);
        this.Eip.addActionListener(actionListener);
        this.Eib.addActionListener(actionListener);
        this.Eic.addActionListener(actionListener);
        this.Eid.addActionListener(actionListener);
        this.Eif.setMinimum(0);
        this.Eif.setMaximum(360);
        this.Eih.setMinimum(0);
        this.Eih.setMaximum(360);
        this.Eig.setMinimum(0);
        this.Eig.setMaximum(10000);
        this.Eii.setMinimum(0);
        this.Eii.setMaximum(1000);
        ChangeListener changeListener = new ChangeListener(this){
            final /* synthetic */ mre Eiu;
            {
                this.Eiu = mre2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mre.a(this.Eiu);
            }
        };
        this.Eig.addChangeListener(changeListener);
        this.Eif.addChangeListener(changeListener);
        this.Eih.addChangeListener(changeListener);
        this.Eii.addChangeListener(changeListener);
        this.EhZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mre Eiu;
            {
                this.Eiu = mre2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
            }
        });
        this.setClosable(true);
        this.EhZ.setVisible(false);
        this.addInternalFrameListener(new InternalFrameAdapter(this){
            final /* synthetic */ mre Eiu;
            {
                this.Eiu = mre2;
            }

            public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
                dsk.a(mre.b(this.Eiu));
            }

            public void internalFrameClosing(InternalFrameEvent internalFrameEvent) {
                this.Eiu.eKl();
            }
        });
        this.Eia.addActionListener(new ActionListener(this){
            final /* synthetic */ mre Eiu;
            {
                this.Eiu = mre2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (mre.b(this.Eiu).isCleanedUp()) {
                    return;
                }
                ljq ljq2 = mje.DBl;
                ljq2.et(mre.b(this.Eiu).av());
                if (mre.b(this.Eiu).byi().axv() == 0) {
                    mre.b(this.Eiu).byi().dg(ljq2.eqN() / 4.0f);
                } else {
                    mre.b(this.Eiu).byi().setMaxRadius(ljq2.eqN());
                }
                mre.b(this.Eiu).byg();
                this.Eiu.eKi();
            }
        });
        this.addInternalFrameListener(new InternalFrameListener(this){
            final /* synthetic */ mre Eiu;
            {
                this.Eiu = mre2;
            }

            public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
                if (mre.b(this.Eiu) != null) {
                    this.Eiu.eKi();
                }
            }

            public void internalFrameClosed(InternalFrameEvent internalFrameEvent) {
                Eiq = null;
            }

            public void internalFrameClosing(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameDeactivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameDeiconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameIconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameOpened(InternalFrameEvent internalFrameEvent) {
            }
        });
        this.Eie.addItem("Logarithimic");
        this.Eie.addItem("Linear");
        this.Eie.setSelectedIndex(0);
        this.Eie.addActionListener(actionListener);
    }

    public dsk eKh() {
        return this.Eir;
    }

    public void b(dsk dsk2) {
        this.Eir = dsk2;
        dsk.a(this.Eir);
        this.eKi();
    }

    public void eKi() {
        btc btc2 = this.Eir.byi();
        this.Eio.setText(btc2.axt());
        this.Eim.setText(String.valueOf(btc2.axu()));
        this.Eil.setText(String.valueOf(btc2.getMaxRadius()));
        this.Eik.setText(String.valueOf(btc2.axp()));
        this.Ein.setText(String.valueOf(btc2.axr()));
        this.Eij.setText(String.valueOf(btc2.getConeOutsideVolume()));
        this.Eip.setText(String.valueOf(btc2.axw()));
        this.Eic.setSelected(dsk.bym());
        this.Eib.setSelected(this.Eir.byj());
        this.Eid.setSelected(dsk.byk());
        this.Eie.setSelectedIndex(btc2.axv());
        if (btc2.axv() == 0) {
            this.Eil.setEnabled(false);
        } else {
            this.Eil.setEnabled(true);
        }
        this.eKj();
    }

    private void eKj() {
        this.Eit = true;
        btc btc2 = this.Eir.byi();
        this.Eif.setValue(btc2.axp());
        this.Eih.setValue(btc2.axr());
        this.Eig.setValue((int)btc2.axu() * 100);
        this.Eii.setValue((int)(btc2.axw() * 1000.0f));
        this.Eit = false;
    }

    private void eKk() {
        if (this.Eir.isCleanedUp()) {
            return;
        }
        if (this.Eit) {
            return;
        }
        this.Eim.setText(String.valueOf((float)this.Eig.getValue() / 100.0f));
        this.Eik.setText(String.valueOf(this.Eif.getValue()));
        this.Ein.setText(String.valueOf(this.Eih.getValue()));
        this.Eip.setText(String.valueOf((float)this.Eii.getValue() / 1000.0f));
        this.eKl();
    }

    public void eKl() {
        if (this.Eir.isCleanedUp()) {
            return;
        }
        btc btc2 = this.Eir.byi();
        btc2.gj(this.Eio.getText());
        btc2.dg(Float.parseFloat(this.Eim.getText()));
        if (btc2.axv() == 0) {
            btc2.setMaxRadius(btc2.axu() * 4.0f);
            this.Eil.setText(String.valueOf(btc2.getMaxRadius()));
        } else {
            btc2.setMaxRadius(Float.parseFloat(this.Eil.getText()));
        }
        btc2.mS(Integer.parseInt(this.Eik.getText()));
        btc2.mT(Integer.parseInt(this.Ein.getText()));
        btc2.setConeOutsideVolume(Long.parseLong(this.Eij.getText()));
        btc2.mU(this.Eie.getSelectedIndex());
        btc2.dh(Float.parseFloat(this.Eip.getText()));
        dsk.ju(this.Eic.isSelected());
        this.Eir.js(this.Eib.isSelected());
        dsk.jt(this.Eid.isSelected());
        if (btc2.axv() == 0) {
            this.Eil.setEnabled(false);
        } else {
            this.Eil.setEnabled(true);
        }
        this.eKj();
        this.Eir.byg();
    }

    static /* synthetic */ void a(mre mre2, ActionEvent actionEvent) {
        mre2.by(actionEvent);
    }

    static /* synthetic */ void a(mre mre2) {
        mre2.eKk();
    }

    static /* synthetic */ dsk b(mre mre2) {
        return mre2.Eir;
    }
}

