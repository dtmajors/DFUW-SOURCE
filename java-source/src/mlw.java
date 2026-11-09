/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  lcr
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jdesktop.layout.GroupLayout;

public class mlw
extends JInternalFrame {
    private bvf DJS;
    private lkw DKX;
    private lkr DKY;
    private aux DEC = null;
    private lkp DKZ;
    private msa[] DLa;
    private ldv gte;
    private ldv DLb;
    private eh ehx;
    private JCheckBox DLc;
    private JComboBox DLd;
    private JPanel DLe;
    private JButton DLf;
    private JComboBox DLg;
    private JPanel DLh;
    private JButton DLi;
    private mku DLj;
    private JPanel DLk;
    private JButton DLl;
    private JPanel DLm;
    private mla DLn;
    private mla DLo;
    private JLabel I;

    public mlw(aux aux2, bvf bvf2, lkr lkr2) {
        this();
        this.DEC = aux2;
        this.DJS = bvf2;
        this.DKY = lkr2;
        List<lkw> list = this.DJS.azH().eum();
        if (list != null && list.size() > 0) {
            lkw lkw2 = list.get(0);
            if (this.DKY.isPartial() && list.size() > 1) {
                lfn.b(0, this.getClass().getSimpleName(), "SFAnimationSpecialEffectDialog() : Getting partial track");
                lkw2 = list.get(1);
            }
            this.DKX = lkw2;
            assert (this.DKX != null);
            this.setClosable(true);
            this.c(list.get(0));
        }
        this.pack();
    }

    public mlw() {
        this.b();
    }

    private void b() {
        this.DLm = new JPanel();
        this.DLn = new mla();
        this.DLo = new mla();
        this.DLk = new JPanel();
        this.DLj = new mku();
        this.DLh = new JPanel();
        this.I = new JLabel();
        this.DLg = new JComboBox();
        this.DLc = new JCheckBox();
        this.DLd = new JComboBox();
        this.DLe = new JPanel();
        this.DLi = new JButton();
        this.DLl = new JButton();
        this.DLf = new JButton();
        this.setTitle("Animation Effect Dialog");
        this.DLm.setBorder(BorderFactory.createTitledBorder("Track properties"));
        GroupLayout groupLayout = new GroupLayout((Container)this.DLm);
        this.DLm.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(2).add(1, (Component)this.DLo, -1, 392, Short.MAX_VALUE).add(1, (Component)this.DLn, -1, 392, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DLn, -2, -1, -2).addPreferredGap(0).add((Component)this.DLo, -2, -1, -2).addContainerGap(55, Short.MAX_VALUE)));
        this.DLk.setBorder(BorderFactory.createTitledBorder("Effect offset"));
        GroupLayout groupLayout2 = new GroupLayout((Container)this.DLk);
        this.DLk.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap(62, Short.MAX_VALUE).add((Component)this.DLj, -2, 340, -2).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.DLj, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.DLh.setBorder(BorderFactory.createTitledBorder("Effect Type"));
        this.I.setText("Effect:");
        this.DLg.setModel(new DefaultComboBoxModel<String>(new String[]{"choose effect"}));
        this.DLc.setText("Attach To Bone");
        this.DLc.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.DLc.setMargin(new Insets(0, 0, 0, 0));
        this.DLc.addActionListener(new ActionListener(this){
            final /* synthetic */ mlw DLp;
            {
                this.DLp = mlw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlw.a(this.DLp, actionEvent);
            }
        });
        this.DLd.setModel(new DefaultComboBoxModel<String>(new String[]{"choose bone"}));
        GroupLayout groupLayout3 = new GroupLayout((Container)this.DLh);
        this.DLh.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((GroupLayout.Group)groupLayout3.createParallelGroup(1, false).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.I, -2, 45, -2).addPreferredGap(0).add((Component)this.DLg, -2, 207, -2)).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.DLc).addPreferredGap(0).add((Component)this.DLd, 0, -1, Short.MAX_VALUE))).addContainerGap(156, Short.MAX_VALUE)));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.I).add((Component)this.DLg, -2, -1, -2)).add(17, 17, 17).add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.DLc).add((Component)this.DLd, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        this.DLi.setText("Enable Effect");
        this.DLi.addActionListener(new ActionListener(this){
            final /* synthetic */ mlw DLp;
            {
                this.DLp = mlw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlw.b(this.DLp, actionEvent);
            }
        });
        this.DLl.setText("Close Dialog");
        this.DLl.addActionListener(new ActionListener(this){
            final /* synthetic */ mlw DLp;
            {
                this.DLp = mlw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlw.c(this.DLp, actionEvent);
            }
        });
        this.DLf.setText("Disable Effect");
        this.DLf.addActionListener(new ActionListener(this){
            final /* synthetic */ mlw DLp;
            {
                this.DLp = mlw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlw.d(this.DLp, actionEvent);
            }
        });
        GroupLayout groupLayout4 = new GroupLayout((Container)this.DLe);
        this.DLe.setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.DLi).addPreferredGap(0).add((Component)this.DLf).addPreferredGap(0, 115, Short.MAX_VALUE).add((Component)this.DLl).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout4.createParallelGroup(3).add((Component)this.DLi).add((Component)this.DLf).add((Component)this.DLl)).addContainerGap()));
        GroupLayout groupLayout5 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout5);
        groupLayout5.setHorizontalGroup((GroupLayout.Group)groupLayout5.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout5.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout5.createParallelGroup(2).add((Component)this.DLk, -1, -1, Short.MAX_VALUE).add((Component)this.DLh, -1, -1, Short.MAX_VALUE).add(1, (Component)this.DLe, -1, -1, Short.MAX_VALUE).add((Component)this.DLm, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout5.setVerticalGroup((GroupLayout.Group)groupLayout5.createParallelGroup(1).add((GroupLayout.Group)groupLayout5.createSequentialGroup().add((Component)this.DLm, -2, -1, -2).addPreferredGap(0).add((Component)this.DLk, -2, -1, -2).addPreferredGap(0).add((Component)this.DLh, -2, -1, -2).addPreferredGap(0).add((Component)this.DLe, -2, -1, -2).addContainerGap(15, Short.MAX_VALUE)));
        this.pack();
    }

    private void af(ActionEvent actionEvent) {
        this.eEQ();
        this.eET();
        mje.DAR = mje.a.DCn;
    }

    private void ag(ActionEvent actionEvent) {
        this.eES();
    }

    private void ah(ActionEvent actionEvent) {
        boolean bl = this.DLc.isSelected();
        this.DLd.setEnabled(bl);
        if (bl) {
            this.DKZ.yX((String)this.DLd.getSelectedItem());
        } else {
            this.DKZ.yX(null);
        }
    }

    private void ai(ActionEvent actionEvent) {
        if (this.DKZ != null && this.ehx != null) {
            this.DKZ.setOffset(this.ehx.fb());
        }
        this.eEQ();
        this.eET();
        mje.DAR = mje.a.DCn;
        this.dispose();
    }

    private void eEM() {
    }

    private void c(lkw lkw2) {
        if (lkw2 == null) {
            lfn.b(5, "SFAnimationBlendingDialog", "createTrackPane() : AnimationTrack is null!");
            assert (false);
            return;
        }
        this.DLo.eDs();
        this.DLo.a(new ChangeListener(this){
            final /* synthetic */ mlw DLp;
            {
                this.DLp = mlw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mlw.a(this.DLp, mlw.a(this.DLp).getValue());
            }
        });
        this.DLo.ai(0.0f);
        this.DLo.ah(5.0f);
        this.DLo.H(0.0f);
        this.DLo.zj(true);
        this.DLo.Cp("Speed");
        this.DLn.eDs();
        this.DLn.a(new ChangeListener(this){
            final /* synthetic */ mlw DLp;
            {
                this.DLp = mlw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mlw.b(this.DLp, mlw.b(this.DLp).getValue());
            }
        });
        this.DLn.ai(0.0f);
        this.DLn.ah(this.DKY.etP());
        this.DLn.H((float)lkw2.bEZ());
        this.DLn.zj(true);
        this.DLn.Cp("Track Position");
        this.eEO();
        this.DLg.setModel(new DefaultComboBoxModel<msa>(this.DLa));
        this.DLg.addActionListener(new ActionListener(this){
            final /* synthetic */ mlw DLp;
            {
                this.DLp = mlw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                lfn.b(0, this.getClass().getName(), "actionPerformed() : jaja");
                if (mlw.c(this.DLp) != null) {
                    mlw.c(this.DLp).ade(del.dr(((msa)mlw.d(this.DLp).getSelectedItem()).getName()));
                }
            }
        });
        String[] stringArray = this.DJS.azG();
        this.DLd.setModel(new DefaultComboBoxModel<String>(stringArray));
        this.DLd.addActionListener(new ActionListener(this){
            final /* synthetic */ mlw DLp;
            {
                this.DLp = mlw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                lfn.b(0, this.getClass().getName(), "actionPerformed() : jaja");
                if (mlw.c(this.DLp) != null && mlw.e(this.DLp).getSelectedItem() != null) {
                    mlw.c(this.DLp).yX((String)mlw.e(this.DLp).getSelectedItem());
                }
            }
        });
        this.DLj.setTitle("Offset");
    }

    private void ot(float f2) {
        if (this.DKZ != null) {
            assert (this.DKZ != null);
            this.DKZ.setStartTime(f2);
        }
        dzy dzy2 = (dzy)this.DEC.d(7428);
        dzy2.Dn(8);
        dzy2.Do(this.DKX.bEU());
        dzy2.on(this.DJS.getGUID());
        dzy2.f(lcr.qAE);
        dzy2.cb(f2);
        this.DEC.a((dxq)dzy2);
    }

    private void ou(float f2) {
        dzy dzy2 = (dzy)this.DEC.d(7428);
        dzy2.Dn(2);
        dzy2.Do(this.DKX.bEU());
        dzy2.on(this.DJS.getGUID());
        dzy2.f(lcr.qAE);
        dzy2.iF(f2);
        this.DEC.a((dxq)dzy2);
    }

    public lkp eEN() {
        return this.DKZ;
    }

    public void d(lkp lkp2) {
        this.DKZ = lkp2;
        this.DLn.or(this.DKZ.getStartTime());
        this.DLj.cL(this.DKZ.getOffset());
        String string = del.zU(this.DKZ.etN());
        assert (string != null);
        if (this.DLa != null) {
            for (int i = 0; i < this.DLa.length; ++i) {
                msa msa2 = this.DLa[i];
                if (!string.equals(msa2.getName())) continue;
                this.DLg.setSelectedIndex(i);
                break;
            }
        }
        if (this.DKZ.emu() != null) {
            this.DLd.setSelectedItem(this.DKZ.emu());
            this.DLc.setSelected(true);
        } else {
            this.DLc.setSelected(false);
            this.DLd.setEnabled(false);
        }
        this.DLj.eDw();
    }

    private void eEO() {
        ArrayList<msa> arrayList = lcn.emv();
        ArrayList arrayList2 = lcn.emv();
        Map map = lea.eoc();
        for (Map.Entry entry : map.entrySet()) {
            Map.Entry entry2 = entry;
            if (!(entry2.getKey() instanceof Integer) || !(entry2.getValue() instanceof String)) continue;
            arrayList.add(new msa((String)entry2.getValue(), false, (Integer)entry2.getKey()));
        }
        for (Object e2 : arrayList) {
            if (!(e2 instanceof msa)) assert (false);
            arrayList2.add(e2);
            lfn.b(0, this.getClass().getName(), "createEffectArray() : Added SpecialEffect = " + e2);
        }
        Collections.sort(arrayList2);
        this.DLa = arrayList2.toArray(new msa[arrayList2.size()]);
        lfn.b(0, this.getClass().getName(), "createEffectArray() : Sizeof EffectNames = " + this.DLa.length);
    }

    private void eEP() {
        if (mje.DAU == null) {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
            return;
        }
        ldv ldv2 = mje.DAU;
        if (this.gte != null) {
            JOptionPane.showInternalMessageDialog(this, "Item already attached to this Attachpoint!", "Error: Could not Attach Item", 0);
            return;
        }
        this.gte = this.DEC.bzv();
        this.eER();
        bvf bvf2 = this.DJS;
        gzx gzx2 = (gzx)this.DEC.d(4112);
        if (this.ehx.fa() == 0) {
            gzx2.KZ(5);
        } else if (this.ehx.fa() == 1) {
            gzx2.KZ(64);
            gzx2.mu(true);
        } else assert (false);
        gzx2.on(bvf2.getGUID());
        gzx2.f(lcr.qzr);
        gzx2.qJ(bvf2.getGUID());
        gzx2.qI(ldv2);
        gzx2.setAttachPointName("");
        gzx2.setFrameName(this.ehx.getFrameName());
        gzx2.setRotation(this.ehx.getRotation());
        gzx2.K(this.ehx.fb());
        gzx2.kX(this.gte);
        gzx2.ac(this.ehx.fa());
        this.DEC.a((dxq)gzx2);
    }

    private void eEQ() {
        if (this.DLb == null) {
            return;
        }
        if (mje.DAU == null) {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
            return;
        }
        ldv ldv2 = mje.DAU;
        this.eER();
        bvf bvf2 = this.DJS;
        if (ldv2 != null && !ldv2.equals(bvf2.getGUID())) {
            gzx gzx2 = (gzx)this.DEC.d(4112);
            if (this.ehx.fa() == 0) {
                gzx2.KZ(2);
            } else if (this.ehx.fa() == 1) {
                gzx2.KZ(1);
            } else assert (false);
            gzx2.on(bvf2.getGUID());
            gzx2.f(lcr.qzr);
            gzx2.qJ(bvf2.getGUID());
            gzx2.qI(ldv2);
            gzx2.setAttachPointName("");
            gzx2.setFrameName(this.ehx.getFrameName());
            gzx2.setRotation(new ljq());
            gzx2.K(new ljq());
            gzx2.kX(this.gte);
            gzx2.ac(this.ehx.fa());
            this.DEC.a((dxq)gzx2);
            this.gte = null;
            mje.DAU = null;
        } else {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
        }
    }

    private void eER() {
        ldv ldv2;
        if (this.ehx == null) {
            this.ehx = new eh();
            this.ehx.K(this.DLj.bSh());
        }
        if ((ldv2 = this.DEC.eCw()) != null) {
            if (this.DKZ.emu() == null) {
                this.ehx.ac(1);
            } else {
                this.ehx.ac(0);
                this.ehx.setFrameName(this.DKZ.emu());
            }
            this.ehx.setRotation(new ljq());
        } else {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
        }
    }

    private void eES() {
        if (this.DLb != null) {
            lfn.b(5, this.getClass().getSimpleName(), "addEffect() : Effect Already added!");
            return;
        }
        if (mje.DAS == null) {
            lfn.b(5, this.getClass().getSimpleName(), "addEffect() : No ObjectSpace Selected!");
            return;
        }
        mje.DAU = this.DLb = this.DEC.lL(mje.DAS);
        int n = this.DKZ.etN();
        lfn.b(0, this.getClass().getName(), "addEffect() : Adding effect!");
        hay hay2 = (hay)this.DEC.d(4117);
        hay2.on(lcr.qAE);
        hay2.f(lcr.qAE);
        hay2.setDuration(-2.0f);
        hay2.setTargetPosition(new ljq(this.DKZ.getOffset()));
        hay2.fJ(n);
        hay2.hC(this.DLb);
        hay2.nO(this.DJS.getGUID());
        this.DEC.a((dxq)hay2);
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.eEP();
        ldv ldv2 = this.DEC.eCw();
        if (ldv2 != null) {
            this.eER();
            mje.DAR = mje.a.DCq;
            mje.DBB = this.ehx;
            mje.DBC = this.gte;
            mje.DBD = this.DJS.av();
        } else {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
        }
    }

    private void eET() {
        if (this.DLb == null) {
            return;
        }
        fub fub2 = (fub)this.DEC.d(1027);
        fub2.on(this.DLb);
        fub2.f(lcr.qAE);
        fub2.HX(fub.iHB);
        this.DEC.a((dxq)fub2);
        this.DLb = null;
    }

    static /* synthetic */ void a(mlw mlw2, ActionEvent actionEvent) {
        mlw2.ah(actionEvent);
    }

    static /* synthetic */ void b(mlw mlw2, ActionEvent actionEvent) {
        mlw2.ag(actionEvent);
    }

    static /* synthetic */ void c(mlw mlw2, ActionEvent actionEvent) {
        mlw2.ai(actionEvent);
    }

    static /* synthetic */ void d(mlw mlw2, ActionEvent actionEvent) {
        mlw2.af(actionEvent);
    }

    static /* synthetic */ mla a(mlw mlw2) {
        return mlw2.DLo;
    }

    static /* synthetic */ void a(mlw mlw2, float f2) {
        mlw2.ou(f2);
    }

    static /* synthetic */ mla b(mlw mlw2) {
        return mlw2.DLn;
    }

    static /* synthetic */ void b(mlw mlw2, float f2) {
        mlw2.ot(f2);
    }

    static /* synthetic */ lkp c(mlw mlw2) {
        return mlw2.DKZ;
    }

    static /* synthetic */ JComboBox d(mlw mlw2) {
        return mlw2.DLg;
    }

    static /* synthetic */ JComboBox e(mlw mlw2) {
        return mlw2.DLd;
    }
}

