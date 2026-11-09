/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mmn
extends mkx {
    private bvf DMU;
    private lky DMV;
    private mla DMW;
    private mla DMX;
    private mla DMY;
    private float DJD = 0.0f;
    private float DJE = 5.0f;
    private Dimension DJA = new Dimension(500, 450);
    private lkz dRY;
    private mjr DMZ;
    private mkl DNa;
    private mkl DNb;
    private mkt DNc = new mkt("Relative Speed Multiplier", "n/a");
    private mkt DNd = new mkt("Relative Position Multiplier", "n/a");

    public mmn(aux aux2, String string, lky lky2, bvf bvf2) {
        this.setTitle("| " + string + "| Transition Data dialog.");
        this.setPreferredSize(this.DJA);
        this.setMinimumSize(this.DJA);
        this.setClosable(true);
        this.DMU = bvf2;
        this.DMV = lky2;
        JPanel jPanel = new JPanel(new FlowLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout(2));
        JPanel jPanel3 = new JPanel(new FlowLayout());
        this.DMW = new mla("Duration", this.DJD, this.DJE, (float)this.DMV.euB(), 2);
        this.DMW.a(new ChangeListener(this){
            final /* synthetic */ mmn DNe;
            {
                this.DNe = mmn2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmn.a(this.DNe, mmn.a(this.DNe).getValue());
            }
        });
        jPanel2.add(this.DMW);
        this.DMX = new mla("Delay (secs)", this.DJD, this.DJE, (float)this.DMV.euA(), 2);
        this.DMX.a(new ChangeListener(this){
            final /* synthetic */ mmn DNe;
            {
                this.DNe = mmn2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmn.b(this.DNe, mmn.b(this.DNe).getValue());
            }
        });
        jPanel2.add(this.DMX);
        this.DMY = new mla("StartPoint (secs)", this.DJD, this.DJE, (float)this.DMV.eux(), 2);
        this.DMY.a(new ChangeListener(this){
            final /* synthetic */ mmn DNe;
            {
                this.DNe = mmn2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmn.c(this.DNe, mmn.c(this.DNe).getValue());
            }
        });
        jPanel2.add(this.DMY);
        int n = 0;
        switch (this.DMV.euC()) {
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
        jPanel2.add(this.DMZ);
        JPanel jPanel4 = new JPanel(new FlowLayout(0));
        jPanel4.setBorder(BorderFactory.createTitledBorder("Relative stuff"));
        jPanel4.setPreferredSize(new Dimension(480, 150));
        JPanel jPanel5 = new JPanel();
        jPanel5.setBorder(BorderFactory.createEtchedBorder());
        this.DNa = new mkl("Use Relative Speed Multiplier", this.DMV.euE());
        lfn.b(0, "SFAnimationTransitionDataDialog", "SFAnimationTransitionDataDialog() : RelSpeed =" + this.DMV.euE());
        this.DNc.setEnabled(this.DNa.eDr());
        this.DNa.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mmn DNe;
            {
                this.DNe = mmn2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmn.e(this.DNe).yL(mmn.d(this.DNe).eDr());
                if (mmn.d(this.DNe).eDr()) {
                    mmn.f(this.DNe).zi(false);
                }
                mmn.g(this.DNe).setEnabled(mmn.d(this.DNe).eDr());
            }
        });
        jPanel5.add(this.DNa);
        this.DNc.Cf(Double.toString(this.DMV.euz()));
        jPanel5.add(this.DNc);
        jPanel4.add(jPanel5);
        JPanel jPanel6 = new JPanel();
        jPanel6.setBorder(BorderFactory.createEtchedBorder());
        this.DNb = new mkl("Use Relative Position Multiplier", this.DMV.euD());
        lfn.b(0, "SFAnimationTransitionDataDialog", "SFAnimationTransitionDataDialog() : RelPos=" + this.DMV.euD());
        this.DNd.setEnabled(this.DNb.eDr());
        this.DNb.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mmn DNe;
            {
                this.DNe = mmn2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmn.e(this.DNe).yK(mmn.f(this.DNe).eDr());
                if (mmn.f(this.DNe).eDr()) {
                    mmn.d(this.DNe).zi(false);
                }
                mmn.h(this.DNe).setEnabled(mmn.f(this.DNe).eDr());
            }
        });
        jPanel6.add(this.DNb);
        this.DNd.Cf(Double.toString(this.DMV.euy()));
        jPanel6.add(this.DNd);
        jPanel4.add(jPanel6);
        jPanel2.add(jPanel4);
        this.DGa.add((Component)jPanel, "North");
        this.DGa.add((Component)jPanel2, "Center");
        this.DGa.add((Component)jPanel3, "South");
        this.pack();
    }

    @Override
    protected void eDD() {
        lfn.b(0, "SFAnimationTransitionDataDialog", "ApplyChanges() : Applying Changes");
        if (this.DNd.hasChanged()) {
            this.DMV.eo(Double.parseDouble(this.DNd.eCU()));
        }
        if (this.DNc.hasChanged()) {
            this.DMV.ep(Double.parseDouble(this.DNc.eCU()));
        }
        if (this.DMZ.hasChanged()) {
            int n = this.DMZ.getSelectedIndex();
            switch (n) {
                case 0: {
                    this.DMV.adx(0);
                    break;
                }
                case 1: {
                    this.DMV.adx(1);
                    break;
                }
                default: {
                    lfn.b(5, "SFAnimationTransitionDataDialog", "ApplyChanges() : Error. Index [" + n + "] does not exist!");
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ov(float f2) {
        lky lky2 = this.DMV;
        synchronized (lky2) {
            this.DMV.eq(f2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ow(float f2) {
        lky lky2 = this.DMV;
        synchronized (lky2) {
            this.DMV.er(f2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ox(float f2) {
        lky lky2 = this.DMV;
        synchronized (lky2) {
            this.DMV.en(f2);
        }
    }

    static /* synthetic */ mla a(mmn mmn2) {
        return mmn2.DMW;
    }

    static /* synthetic */ void a(mmn mmn2, float f2) {
        mmn2.ow(f2);
    }

    static /* synthetic */ mla b(mmn mmn2) {
        return mmn2.DMX;
    }

    static /* synthetic */ void b(mmn mmn2, float f2) {
        mmn2.ov(f2);
    }

    static /* synthetic */ mla c(mmn mmn2) {
        return mmn2.DMY;
    }

    static /* synthetic */ void c(mmn mmn2, float f2) {
        mmn2.ox(f2);
    }

    static /* synthetic */ mkl d(mmn mmn2) {
        return mmn2.DNa;
    }

    static /* synthetic */ lky e(mmn mmn2) {
        return mmn2.DMV;
    }

    static /* synthetic */ mkl f(mmn mmn2) {
        return mmn2.DNb;
    }

    static /* synthetic */ mkt g(mmn mmn2) {
        return mmn2.DNc;
    }

    static /* synthetic */ mkt h(mmn mmn2) {
        return mmn2.DNd;
    }
}

