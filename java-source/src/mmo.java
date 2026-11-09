/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  lkv
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mmo
extends mkx {
    private aux DEC;
    private lky ikq;
    private bvf DMU;
    private mkt DNf = new mkt("Name", "");
    private mjr DNg;
    private mjr DNh;
    private mkl DNi;
    private a DNj = null;
    private Dimension DDN = new Dimension(650, 550);
    private mla DMW;
    private mla DMX;
    private mla DMY;
    private float DJD = 0.0f;
    private float DJE = 5.0f;
    private lkz dRY;
    private mjr DMZ;
    private mkl DNa;
    private mkl DNb;
    private mkt DNc = new mkt("Relative Speed Multiplier", "n/a");
    private mkt DNd = new mkt("Relative Position Multiplier", "n/a");

    public mmo(aux aux2, String string, bvf bvf2, lky lky2) {
        this.DEC = aux2;
        this.setTitle("| " + string + "| Transition dialog.");
        this.setPreferredSize(this.DDN);
        this.setMinimumSize(this.DDN);
        this.setClosable(true);
        this.DNj = new a(this);
        this.DMU = bvf2;
        this.ikq = lky2;
        assert (this.ikq != null) : "AnimationTransition is null!";
        JPanel jPanel = new JPanel(new FlowLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        JPanel jPanel3 = new JPanel(new FlowLayout());
        JPanel jPanel4 = new JPanel(new FlowLayout());
        jPanel.setPreferredSize(new Dimension(this.DDN.width - 25, 100));
        Object[] objectArray = lkv.euf();
        Arrays.sort(objectArray);
        String string2 = lkv.adr((int)this.ikq.euu());
        assert (string2 != null);
        this.DNg = new mjr("From State", objectArray, string2);
        jPanel.add(this.DNg);
        string2 = lkv.adr((int)this.ikq.euv());
        assert (string2 != null);
        this.DNh = new mjr("To State", objectArray, string2);
        jPanel.add(this.DNh);
        this.DNf.Cf(this.ikq.getName());
        jPanel.add(this.DNf);
        this.DNi = new mkl("Reversable Transition", this.ikq.euw());
        this.DNi.setToolTipText("This Transition can be used for blending from the ToSetID to the FromSetID also, if checked");
        jPanel.add(this.DNi);
        jPanel2.add(this.eFx());
        this.DGa.add((Component)jPanel, "North");
        this.DGa.add((Component)jPanel2, "Center");
        this.DGa.add((Component)jPanel3, "South");
        this.DGa.add((Component)jPanel4, "West");
        this.pack();
    }

    @Override
    protected void eDD() {
        int n;
        Object object;
        lfn.b(0, "SFAnimationTransitionDialog", "ApplyChanges() : Applying Changes");
        boolean bl = false;
        if (this.DNg.hasChanged() && (object = this.DNg.getSelectedItem()) != null) {
            this.DMU.azE().c(this.ikq);
            n = lkv.AG((String)((String)object));
            this.ikq.adv(n &= 0xFFFF);
            lfn.b(0, this.getClass().getName(), "FromBox changed to " + n);
            bl = true;
        }
        if (this.DNh.hasChanged() && (object = this.DNh.getSelectedItem()) != null) {
            if (!bl) {
                this.DMU.azE().c(this.ikq);
            }
            n = lkv.AG((String)((String)object));
            this.ikq.adw(n &= 0xFFFF);
            lfn.b(0, this.getClass().getName(), "ToBox changed to " + n);
            bl = true;
        }
        if (bl) {
            this.DMU.azE().b(this.ikq);
        }
        if (this.DNf.hasChanged()) {
            this.ikq.setName(this.DNf.eCU());
        }
        if (this.DNi.hasChanged()) {
            this.ikq.yJ(this.DNi.eDr());
        }
        if (this.DNd.hasChanged()) {
            this.ikq.eo(Double.parseDouble(this.DNd.eCU()));
        }
        if (this.DNc.hasChanged()) {
            this.ikq.ep(Double.parseDouble(this.DNc.eCU()));
        }
        if (this.DMZ.hasChanged()) {
            int n2 = this.DMZ.getSelectedIndex();
            switch (n2) {
                case 0: {
                    this.ikq.adx(0);
                    break;
                }
                case 1: {
                    this.ikq.adx(1);
                    break;
                }
                default: {
                    lfn.b(5, "SFAnimationTransitionDataDialog", "ApplyChanges() : Error. Index [" + n2 + "] does not exist!");
                }
            }
        }
    }

    private JPanel eFx() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        jPanel.setPreferredSize(new Dimension(this.DDN.width - 20, 320));
        jPanel.setBorder(BorderFactory.createTitledBorder("Global Changes"));
        int n = 0;
        switch (this.ikq.euC()) {
            case 0: {
                n = 0;
                break;
            }
            case 1: {
                n = 1;
                break;
            }
            default: {
                n = 0;
            }
        }
        this.DMZ = new mjr("Transition Type:", (Object[])new String[]{"Linear", "Spline"}, n);
        jPanel.add(this.DMZ);
        this.DMW = new mla("Duration", this.DJD, this.DJE, (float)this.ikq.euB(), 2);
        this.DMW.a(new ChangeListener(this){
            final /* synthetic */ mmo DNk;
            {
                this.DNk = mmo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmo.a(this.DNk, mmo.a(this.DNk).getValue());
            }
        });
        jPanel.add(this.DMW);
        this.DMX = new mla("Delay (secs)", this.DJD, this.DJE, (float)this.ikq.euA(), 2);
        this.DMX.a(new ChangeListener(this){
            final /* synthetic */ mmo DNk;
            {
                this.DNk = mmo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmo.b(this.DNk, mmo.b(this.DNk).getValue());
            }
        });
        jPanel.add(this.DMX);
        this.DMY = new mla("StartPoint (secs)", this.DJD, this.DJE, (float)this.ikq.eux(), 2);
        this.DMY.a(new ChangeListener(this){
            final /* synthetic */ mmo DNk;
            {
                this.DNk = mmo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmo.c(this.DNk, mmo.c(this.DNk).getValue());
            }
        });
        jPanel.add(this.DMY);
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel2.setBorder(BorderFactory.createTitledBorder("Relative stuff"));
        jPanel2.setPreferredSize(new Dimension(480, 130));
        JPanel jPanel3 = new JPanel();
        jPanel3.setBorder(BorderFactory.createEtchedBorder());
        this.DNa = new mkl("Use Relative Speed Multiplier", this.ikq.euE());
        lfn.b(0, "SFAnimationTransitionDataDialog", "SFAnimationTransitionDataDialog() : RelSpeed =" + this.ikq.euE());
        this.DNc.setEnabled(this.DNa.eDr());
        this.DNa.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mmo DNk;
            {
                this.DNk = mmo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmo.e(this.DNk).yL(mmo.d(this.DNk).eDr());
                if (mmo.d(this.DNk).eDr()) {
                    mmo.f(this.DNk).zi(false);
                }
                mmo.g(this.DNk).setEnabled(mmo.d(this.DNk).eDr());
            }
        });
        jPanel3.add(this.DNa);
        this.DNc.Cf(Double.toString(this.ikq.euz()));
        jPanel3.add(this.DNc);
        jPanel2.add(jPanel3);
        JPanel jPanel4 = new JPanel();
        jPanel4.setBorder(BorderFactory.createEtchedBorder());
        this.DNb = new mkl("Use Relative Position Multiplier", this.ikq.euD());
        lfn.b(0, "SFAnimationTransitionDataDialog", "SFAnimationTransitionDataDialog() : RelPos=" + this.ikq.euD());
        this.DNd.setEnabled(this.DNb.eDr());
        this.DNb.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mmo DNk;
            {
                this.DNk = mmo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmo.e(this.DNk).yK(mmo.f(this.DNk).eDr());
                if (mmo.f(this.DNk).eDr()) {
                    mmo.d(this.DNk).zi(false);
                }
                mmo.h(this.DNk).setEnabled(mmo.f(this.DNk).eDr());
            }
        });
        jPanel4.add(this.DNb);
        this.DNd.Cf(Double.toString(this.ikq.euy()));
        jPanel4.add(this.DNd);
        jPanel2.add(jPanel4);
        jPanel.add(jPanel2);
        return jPanel;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ov(float f2) {
        lky lky2 = this.ikq;
        synchronized (lky2) {
            this.ikq.eq(f2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ow(float f2) {
        lky lky2 = this.ikq;
        synchronized (lky2) {
            this.ikq.er(f2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ox(float f2) {
        lky lky2 = this.ikq;
        synchronized (lky2) {
            this.ikq.en(f2);
        }
    }

    static /* synthetic */ mla a(mmo mmo2) {
        return mmo2.DMW;
    }

    static /* synthetic */ void a(mmo mmo2, float f2) {
        mmo2.ow(f2);
    }

    static /* synthetic */ mla b(mmo mmo2) {
        return mmo2.DMX;
    }

    static /* synthetic */ void b(mmo mmo2, float f2) {
        mmo2.ov(f2);
    }

    static /* synthetic */ mla c(mmo mmo2) {
        return mmo2.DMY;
    }

    static /* synthetic */ void c(mmo mmo2, float f2) {
        mmo2.ox(f2);
    }

    static /* synthetic */ mkl d(mmo mmo2) {
        return mmo2.DNa;
    }

    static /* synthetic */ lky e(mmo mmo2) {
        return mmo2.ikq;
    }

    static /* synthetic */ mkl f(mmo mmo2) {
        return mmo2.DNb;
    }

    static /* synthetic */ mkt g(mmo mmo2) {
        return mmo2.DNc;
    }

    static /* synthetic */ mkt h(mmo mmo2) {
        return mmo2.DNd;
    }
}

