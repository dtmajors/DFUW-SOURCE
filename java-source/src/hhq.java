/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import spenefett.util.jni.SFJNIUtils;

public class hhq
extends hmt {
    public static final lhu krZ = new lhu(88, 26, "gui/vendor/vendor_value_field.dds");
    public static final lhu ksT = new lhu(16, 11, "gui/vendor/vendor_button_up_normal.dds");
    public static final lhu ksU = new lhu(16, 11, "gui/vendor/vendor_button_up_pressed.dds");
    public static final lhu ksV = new lhu(16, 11, "gui/vendor/vendor_button_down_normal.dds");
    public static final lhu ksW = new lhu(16, 11, "gui/vendor/vendor_button_down_pressed.dds");
    public final hdm dXw;
    private final a ksX;
    private hpa ksF;
    private hpa ksY;
    private hpa ksZ;
    private hpe kta;
    private hpe jHH;
    private hpf ktb;
    private final int ktc;
    private final int ktd;
    private final int kte;
    private final int ktf;
    private int ktg;
    private hmm kth;
    private hpe.c kti;
    private hpe.c ktj;
    private hpf.c ktk;
    private boolean ktl;
    private boolean ktm;
    private int ktn = 5;
    private int kto = 18;
    private lbn ktp = new lbn(this){
        final /* synthetic */ hhq ktv;
        {
            this.ktv = hhq2;
        }

        public void W() {
            hhq.b(this.ktv);
        }
    };
    private lbn ktq = new lbn(this){
        final /* synthetic */ hhq ktv;
        {
            this.ktv = hhq2;
        }

        public void W() {
            hhq.c(this.ktv);
        }
    };
    private lbn ktr = new lbn(this){
        final /* synthetic */ hhq ktv;
        {
            this.ktv = hhq2;
        }

        public void W() {
            hhq.d(this.ktv);
        }
    };
    private lbn kts = new lbn(this){
        final /* synthetic */ hhq ktv;
        {
            this.ktv = hhq2;
        }

        public void W() {
            hhq.e(this.ktv);
        }
    };
    private lbn ktt = new lbn(this){
        final /* synthetic */ hhq ktv;
        {
            this.ktv = hhq2;
        }

        public void W() {
            hhq.f(this.ktv);
        }
    };
    private lbn ktu = new lbn(this){
        final /* synthetic */ hhq ktv;
        {
            this.ktv = hhq2;
        }

        public void W() {
            hhq.g(this.ktv);
        }
    };

    public hhq(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, int n, int n2, int n3, int n4, String string2) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.dXw = hdm2;
        this.ksX = a2;
        this.kti = this.dXw.kIy;
        this.ktj = this.dXw.kIy;
        this.ktk = this.dXw.kKa.kZl;
        this.ktc = n;
        this.ktd = n2;
        this.ktg = 0;
        this.kte = n3;
        this.ktf = n4;
        this.kto = SFJNIUtils.Instance.getSinglelineTextSize((String)this.kti.jFE.kNa, (int)this.kti.jFE.kNb, (int)this.kti.jFE.kNc, (boolean)this.kti.jFE.kNd, (String)string2).rmN + this.ktn;
        this.ksF = new hpa((hnc)hdm2, string, lgg.rlI, hhq.krZ.kLY, krZ);
        this.j(this.ksF);
        this.kta = new hpe((hnc)hdm2, "Prefix", this.clH(), this.clI(), this.kti, string2);
        this.j(this.kta);
        this.clQ();
    }

    public lhf clG() {
        return hhq.krZ.kLY;
    }

    private lgg clH() {
        return new lgg(this.ktn, (hhq.krZ.kLY.H - this.kti.jFE.kNb - 6) / 2);
    }

    private lhf clI() {
        return new lhf(this.kto - this.ktn, this.kti.jFE.kNb + 6);
    }

    private lgg clJ() {
        return new lgg(this.kto, (hhq.krZ.kLY.H - this.kti.jFE.kNb - 4) / 2);
    }

    private lhf clK() {
        return new lhf(hhq.krZ.kLY.rmN - this.kto - 5 - hhq.ksV.kLY.rmN, this.kti.jFE.kNb + 4);
    }

    private lgg clL() {
        return new lgg(this.kto + 2, 6);
    }

    private lhf clM() {
        return new lhf(hhq.krZ.kLY.rmN - 2 - hhq.ksV.kLY.rmN - this.kto, this.getHeight() - 4);
    }

    private lgg clN() {
        return new lgg(hhq.krZ.kLY.rmN - hhq.ksT.kLY.rmN, 1);
    }

    private lgg clO() {
        return new lgg(hhq.krZ.kLY.rmN - hhq.ksV.kLY.rmN, hhq.krZ.kLY.H - hhq.ksV.kLY.H - 2);
    }

    public boolean isReadOnly() {
        return this.ktb == null;
    }

    @Override
    protected void FG() {
        this.clU();
        this.clP();
        super.FG();
    }

    private void clP() {
        if (this.ktb != null) {
            this.kth.cqg().cpY().a(false, this.ktp);
            this.ktb.remove();
            this.ktb = null;
            this.kth = null;
        }
        if (this.ksY != null) {
            this.ksY.cqo().a(false, this.ktq);
            this.ksY.cqp().a(false, this.ktr);
            this.ksY.remove();
            this.ksY = null;
        }
        if (this.ksZ != null) {
            this.ksZ.cqo().a(false, this.kts);
            this.ksZ.cqp().a(false, this.ktt);
            this.ksZ.remove();
            this.ksZ = null;
        }
        if (this.jHH != null) {
            this.jHH.remove();
            this.jHH = null;
        }
    }

    private void clQ() {
        this.clP();
        this.jHH = new hpe(this.kLu, "Label", this.clJ(), this.clK(), this.kti, "");
        this.j(this.jHH);
    }

    private void clR() {
        this.clP();
        this.ksY = new hpa((hnc)this.dXw, "Up", this.clN(), hhq.ksT.kLY, ksT);
        this.j(this.ksY);
        this.ksY.cqo().a(true, this.ktq);
        this.ksY.cqp().a(true, this.ktr);
        this.ksZ = new hpa((hnc)this.dXw, "Down", this.clO(), hhq.ksV.kLY, ksV);
        this.j(this.ksZ);
        this.ksZ.cqo().a(true, this.kts);
        this.ksZ.cqp().a(true, this.ktt);
        this.ktb = new hpf((hnc)this.dXw, "Editor", this.clL(), this.clM(), this.ktk, 10);
        this.kth = new hmm(this.ktb, (double)this.ktc / 10.0, (double)this.ktd / 10.0, (double)this.ktg / 10.0, this.kte);
        this.ktb.a(this.kth.cqf());
        this.kth.cqg().cpY().a(true, this.ktp);
        this.j(this.ktb);
    }

    public void setReadOnly(boolean bl) {
        if (bl == this.isReadOnly()) {
            return;
        }
        if (bl) {
            this.clQ();
        } else {
            this.clR();
        }
    }

    private void clS() {
        int n = (int)(this.kth.cqg().cpZ() * 10.0);
        if (n != this.ktg) {
            this.ktg = n;
            this.ksX.a(this);
        }
    }

    public int getIncrement() {
        return this.ktf;
    }

    public int clT() {
        return this.ktg;
    }

    public void ME(int n) {
        if (n != this.ktg) {
            if (n < this.ktc) {
                n = this.ktc;
            }
            if (n > this.ktd) {
                n = this.ktd;
            }
            this.ktg = n;
            if (this.ktb != null) {
                this.kth.cqg().cP((double)this.ktg / 10.0);
            }
            if (this.jHH != null) {
                if (this.kte == 0) {
                    this.jHH.mV("" + this.ktg / 10);
                } else {
                    this.jHH.mV("" + this.ktg / 10 + "." + this.ktg % 10);
                }
            }
            this.ksX.a(this);
        }
    }

    private void clU() {
        if (this.ktm) {
            this.dXw.kNC.a(false, this.ktu);
        }
        this.ktm = false;
    }

    private void nE(boolean bl) {
        this.clU();
        this.ktl = bl;
        this.dXw.kNC.a(true, this.ktu);
        this.ktm = true;
    }

    @Override
    protected void cbM() {
        super.cbM();
        if (this.ktb != null && !this.ktb.isFocusOwner()) {
            hmt hmt2 = this;
            for (hmt hmt3 = this.cqt(); hmt3 != null; hmt3 = hmt3.cqt()) {
                hmt3.p(hmt2);
                hmt2 = hmt3;
            }
            this.dXw.kAz.b(new lbn(this){
                final /* synthetic */ hhq ktv;
                {
                    this.ktv = hhq2;
                }

                public void W() {
                    hhq.h((hhq)this.ktv).kiG.selectAll();
                    this.ktv.p(hhq.h(this.ktv));
                }
            });
        }
    }

    private void clV() {
        if (!this.ktm) {
            return;
        }
        if (this.ktl) {
            this.ME(this.clT() + this.getIncrement());
        } else {
            this.ME(this.clT() - this.getIncrement());
        }
    }

    private void clW() {
        if (this.ksY != null) {
            this.ksY.a(ksT);
        }
        this.clU();
    }

    private void clX() {
        if (this.ksZ != null) {
            this.ksZ.a(ksV);
        }
        this.clU();
    }

    private void clY() {
        if (this.ksY == null) {
            return;
        }
        if (this.dXw.csc()) {
            this.ksY.a(ksU);
            this.ME(this.clT() + this.getIncrement());
            this.nE(true);
        } else {
            this.ksY.a(ksT);
            this.clU();
        }
    }

    private void clZ() {
        if (this.ksZ == null) {
            return;
        }
        if (this.dXw.csc()) {
            this.ksZ.a(ksW);
            this.ME(this.clT() - this.getIncrement());
            this.nE(false);
        } else {
            this.ksZ.a(ksV);
            this.clU();
        }
    }

    static /* synthetic */ void b(hhq hhq2) {
        hhq2.clS();
    }

    static /* synthetic */ void c(hhq hhq2) {
        hhq2.clY();
    }

    static /* synthetic */ void d(hhq hhq2) {
        hhq2.clW();
    }

    static /* synthetic */ void e(hhq hhq2) {
        hhq2.clZ();
    }

    static /* synthetic */ void f(hhq hhq2) {
        hhq2.clX();
    }

    static /* synthetic */ void g(hhq hhq2) {
        hhq2.clV();
    }

    static /* synthetic */ hpf h(hhq hhq2) {
        return hhq2.ktb;
    }
}

