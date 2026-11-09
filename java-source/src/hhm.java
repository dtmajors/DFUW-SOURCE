/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hhm
extends hoa {
    public static final lhu krZ = new lhu(335, 36, "gui/vendor/vendor_bar_category.dds");
    public static final lhu ksl = new lhu(335, 36, "gui/vendor/vendor_bar_category.dds");
    public static final lhv ksm = new lhv(25, 25, "gui/vendor/vendor_button_edit_normal.dds", "gui/vendor/vendor_button_edit_pressed.dds");
    private static final int ksn = 10;
    private static final int kmo = 8;
    private static final int kso = 8;
    private static final int ksp = 6;
    private final hhl ksq;
    private hpa kgd;
    private hqz ksr;
    private hpe kss;
    private hqq kst;
    private final hdm dXw;
    private final boolean knl;
    private boolean ksu = false;
    private String ksv;
    private lbn ksw = new lbn(this){
        final /* synthetic */ hhm ksy;
        {
            this.ksy = hhm2;
        }

        public void W() {
            hhm.c(this.ksy);
        }
    };
    private lbp ksx = new lbp(this){
        final /* synthetic */ hhm ksy;
        {
            this.ksy = hhm2;
        }

        public boolean caU() {
            hhm.c(this.ksy);
            return true;
        }
    };

    public hhm(hdm hdm2, String string, lgg lgg2, lhf lhf2, hhl hhl2, boolean bl) {
        super((hnc)hdm2, string, lgg2, lhf2, hdm2.jHw);
        this.dXw = hdm2;
        this.ksq = hhl2;
        this.knl = bl;
        this.ksv = "";
        this.kgd = new hpa((hnc)this.dXw, "Background", lgg.rlI, hhm.krZ.kLY, krZ);
        this.j(this.kgd);
        this.kss = new hpe((hnc)hdm2, null, lgg.rlI, lhf2, hdm2.kIy, "");
        this.j(this.kss);
        if (this.knl) {
            this.ksr = new hqz((hnc)hdm2, "Edit Button", lgg.rlI, hhm.ksm.kLY, hpx.a.kXm, this.dXw.kJH, ksm);
            this.ksr.cvC().a(true, this.ksw);
            this.j(this.ksr);
        }
        this.clu();
    }

    @Override
    public void FG() {
        this.clw();
        super.FG();
    }

    @Override
    public void cce() {
        super.cce();
        this.clu();
    }

    @Override
    public void cbM() {
        super.cbM();
        this.ksq.a(this);
    }

    public String getLabel() {
        return this.ksv;
    }

    public void setLabel(String string) {
        if (this.kss != null) {
            this.kss.mV(string);
        }
        if (this.kst != null && !this.kst.chj().chz().equals(string)) {
            this.kst.chj().mN(string);
        }
        this.ksv = string;
    }

    void clu() {
        int n;
        hms hms2;
        if (this.getWidth() < 50) {
            return;
        }
        if (this.getHeight() < 10) {
            return;
        }
        int n2 = 8;
        if (this.ksr != null) {
            this.ksr.cB(n2, (this.getHeight() - hhm.ksm.kLY.H) / 2);
            n2 += hhm.ksm.kLY.rmN + 2;
        }
        if (this.kst != null) {
            hms2 = this.kst;
            n = 6;
        } else if (this.kss != null) {
            hms2 = this.kss;
            n = 8;
        } else {
            return;
        }
        hms2.h(n2, n, this.getWidth() - 2 * n2, this.getHeight() - 2 * n);
    }

    private void clv() {
        if (this.kss != null) {
            this.kss.remove();
            this.kss = null;
        }
        if (this.kst == null) {
            this.kst = new hqq((hnc)this.dXw, null, lgg.rlI, lhf.rnv, this.dXw.kKa, 50);
            this.kst.chj().mN(this.getLabel());
            this.kst.csT().a(true, this.ksx, 13, jpn.nLm);
            this.j(this.kst);
            this.kst.chj().selectAll();
            hmt hmt2 = this.cqt();
            hmt hmt3 = this;
            while (hmt2 != null) {
                hmt2.p(hmt3);
                hmt3 = hmt2;
                hmt2 = hmt3.cqt();
            }
            this.dXw.kAz.b(new lbn(this){
                final /* synthetic */ hhm ksy;
                {
                    this.ksy = hhm2;
                }

                public void W() {
                    this.ksy.p(hhm.d(this.ksy));
                }
            });
        }
        this.clu();
    }

    private void clw() {
        if (this.kst != null) {
            this.kst.csT().a(false, this.ksx, 13, jpn.nLm);
            this.kst.remove();
            this.kst = null;
        }
        if (this.kss == null) {
            this.kss = new hpe((hnc)this.dXw, "Catgeory Name", lgg.rlI, lhf.rnv, this.dXw.kIy, this.getLabel());
            this.j(this.kss);
        }
        this.clu();
    }

    private void clx() {
        if (!this.knl) {
            return;
        }
        if (this.kst == null) {
            this.clv();
        } else {
            String string = this.kst.chj().chz().trim();
            this.clw();
            if (string.length() > 0) {
                this.setLabel(string);
                this.ksq.b(this);
            }
        }
    }

    public void setPressed(boolean bl) {
        if (this.ksu == bl) {
            return;
        }
        this.ksu = bl;
        this.kgd.a(this.ksu ? ksl : krZ);
        if (this.ksu) {
            this.kgd.H(this.dXw.jXk.jNW);
        } else {
            this.clw();
            this.kgd.H(lcq.COLORSHIFT_NEUTRAL);
        }
    }

    static /* synthetic */ void c(hhm hhm2) {
        hhm2.clx();
    }

    static /* synthetic */ hqq d(hhm hhm2) {
        return hhm2.kst;
    }
}

