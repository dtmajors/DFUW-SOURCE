/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  lcw
 */
public class jge
extends ipx {
    private static final int mZm = 0;
    private static final int mZn = 1;
    private irr lBr;
    private ipx mZo;
    private ipb mZp;
    private ipb mZq;
    private ist mDp;
    private a mZr = a.mZv;
    private boolean mwJ = false;
    private hvr mAD = null;
    private double lfU = 0.0;
    private lie mZs;
    private lie mZt;
    private lie mca;

    public jge() {
        this.a(iqo.dmS());
        this.W(ipx.d(this.cUv()));
        this.W(ipx.a(3, 1, new ipf[0]));
        this.W(this.dDS());
        this.W(ipx.a(24, 20, ipx.d(this.dDT())));
        this.W(ipx.a(56, 1, new ipf[0]));
        this.aTg();
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        if (lcw.enb()) {
            this.dDQ();
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dDV();
        this.dDX();
        this.dDZ();
        this.dEb();
    }

    public a dDR() {
        return this.mZr;
    }

    public void b(a a2, double d2) {
        switch (a2) {
            case mZz: {
                break;
            }
            default: {
                if (a2 != this.mZr) break;
                return;
            }
        }
        this.mZr = a2;
        this.lfU = d2;
        this.aTg();
        this.dyq();
    }

    public void aTg() {
        switch (this.mZr) {
            case mZv: {
                this.lBr.setProgress(0.0f);
                this.mZo.rF(false);
                this.mZp.qP("button_activation_disabled");
                this.mZq.qP(null);
                this.mDp.setText("-");
                this.dDV();
                this.dDX();
                this.dDZ();
                this.dEb();
                break;
            }
            case mZw: {
                this.lBr.setProgress(this.lfU > 0.0 ? 1.0f : 0.0f);
                this.lBr.OI(0);
                this.mZo.rF(true);
                this.dEc();
                this.mZq.qP("button_activation_active_glow");
                this.mDp.setText("-");
                this.dDU();
                this.dDX();
                this.dDZ();
                this.dEb();
                break;
            }
            case mZx: {
                this.lBr.setProgress(1.0f);
                this.lBr.OI(0);
                this.mZo.rF(false);
                this.mZp.qP("button_activation_active_normal");
                this.mZq.qP(null);
                this.dDV();
                this.dDW();
                this.dDZ();
                this.dEb();
                break;
            }
            case mZy: {
                this.lBr.setProgress((float)this.lfU);
                this.lBr.OI(1);
                this.mZo.rF(false);
                this.mZp.qP("button_activation_cooldown_normal");
                this.mZq.qP(null);
                this.dDV();
                this.dDX();
                this.dDY();
                this.dEb();
                break;
            }
            case mZz: {
                this.lBr.setProgress(1.0f);
                this.lBr.OI(1);
                this.mZo.rF(false);
                this.mZp.qP("button_activation_combat_normal");
                this.mZq.qP(null);
                this.dDV();
                this.dDX();
                this.dDZ();
                this.dEa();
            }
        }
    }

    public void dDQ() {
    }

    public void dzw() {
    }

    public void dyq() {
    }

    @Override
    public hyn dd(int n, int n2) {
        hyn hyn2 = super.dd(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        String string = null;
        switch (this.mZr) {
            case mZv: {
                string = lxx.tAk.bD(new Object[0]).exA();
                break;
            }
            case mZw: {
                string = lxx.tAl.bD(new Object[0]).exA();
                break;
            }
            case mZx: {
                string = lxx.tAm.bD(new Object[0]).exA();
                break;
            }
            case mZy: {
                string = lxx.tAn.bD(new Object[0]).exA();
                break;
            }
            case mZz: {
                string = lxx.tAo.bD(new Object[0]).exA();
            }
        }
        return iae.oJ(string);
    }

    private ipf cUv() {
        irs irs2 = new irs();
        irs2.Sn(2);
        irs2.qu("ActivationProgressBarBackgroundBitmap");
        irs2.ra("ActivationProgressBarForegroundBitmap");
        irs2.sl(true);
        this.lBr = new irr(irs2);
        return this.lBr;
    }

    private ipf dDS() {
        ipx ipx2;
        this.mZo = ipx2 = new ipx(this, irl.dnr()){
            final /* synthetic */ jge mZu;
            {
                this.mZu = jge2;
                super(iqz2);
            }

            public boolean du(int n, int n2) {
                jge.a(this.mZu, true);
                jge.b(this.mZu);
                this.rS(true);
                return true;
            }

            public boolean dN(int n, int n2) {
                jge.a(this.mZu, false);
                jge.b(this.mZu);
                this.rS(false);
                if (this.dF(n, n2)) {
                    if (hso.cxK().cxP().cyZ().cAh() || hso.cxK().cxP().cyZ().czZ()) {
                        return false;
                    }
                    this.mZu.b(a.mZx, (double)lea.epx().getDelay());
                    this.djE();
                    ioa.cxP().czx().czJ();
                    this.mZu.dDQ();
                }
                return true;
            }

            public void cND() {
                jge.b(this.mZu);
            }
        };
        this.mZp = new ipb();
        ipx2.W(ipx.d(ipx.l(ipx.a(8, 1, new ipf[0]), this.mZp, ipx.a(8, 1, new ipf[0]))));
        this.mZq = new ipb();
        ipx2.W(ipx.d(this.mZq));
        return ipx2;
    }

    private ipf dDT() {
        this.mDp = ist.c(isf.mwO, 14, 0xABABAB, "60 s");
        return this.mDp;
    }

    private void dDU() {
        if (this.mAD == null) {
            this.mAD = new b(this);
            hso.cxK().cxP().czy().a(this.mAD);
        }
    }

    private void dDV() {
        if (this.mAD != null) {
            hso.cxK().cxP().czy().b(this.mAD);
            this.mAD = null;
        }
    }

    private void dDW() {
        this.dDX();
        this.mZs = new lie(this, 1.0, true){
            final /* synthetic */ jge mZu;
            {
                this.mZu = jge2;
                super(d2, bl);
            }

            public void dh(double d2) {
                jge.a(this.mZu, d2);
                if (d2 >= jge.c(this.mZu)) {
                    jge.d(this.mZu);
                }
            }
        };
        this.dx(0.0);
        this.mZs.e(this.djE().getMessageDelegator());
    }

    private void dDX() {
        if (this.mZs != null) {
            this.mZs.stop();
            this.mZs = null;
        }
    }

    private void dDY() {
        this.dDZ();
        this.mZt = new lie(this, 1.0, true){
            final /* synthetic */ jge mZu;
            {
                this.mZu = jge2;
                super(d2, bl);
            }

            public void dh(double d2) {
                jge.a(this.mZu, d2);
                if (d2 >= jge.c(this.mZu)) {
                    jge.e(this.mZu);
                    this.mZu.dzw();
                }
            }
        };
        this.dx(0.0);
        this.mZt.e(this.djE().getMessageDelegator());
    }

    private void dDZ() {
        if (this.mZt != null) {
            this.mZt.stop();
            this.mZt = null;
        }
    }

    private void dEa() {
        this.dEb();
        this.mca = new lie(this, 1.0, true){
            final /* synthetic */ jge mZu;
            {
                this.mZu = jge2;
                super(d2, bl);
            }

            public void dh(double d2) {
                jge.a(this.mZu, d2);
                if (d2 >= jge.c(this.mZu)) {
                    jge.f(this.mZu);
                }
            }
        };
        this.dx(0.0);
        this.mca.e(this.djE().getMessageDelegator());
    }

    private void dEb() {
        if (this.mca != null) {
            this.mca.stop();
            this.mca = null;
        }
    }

    private void dx(double d2) {
        double d3 = Math.max(this.lfU - d2, 0.0);
        this.lBr.setProgress((float)(d3 / this.lfU));
        if (d3 > 60.0) {
            this.mDp.setText(lxx.tzH.bD((int)(d3 / 60.0)).exA());
        } else {
            this.mDp.setText(lxx.tzG.bD((int)Math.round(d3)).exA());
        }
    }

    private void dEc() {
        if (this.mZr == a.mZw) {
            this.mZp.qP(this.mwJ ? "button_activation_active_pushing" : (this.dkb() ? "button_activation_active_hover" : "button_activation_active_normal"));
        }
    }

    static /* synthetic */ ipb a(jge jge2) {
        return jge2.mZq;
    }

    static /* synthetic */ boolean a(jge jge2, boolean bl) {
        jge2.mwJ = bl;
        return jge2.mwJ;
    }

    static /* synthetic */ void b(jge jge2) {
        jge2.dEc();
    }

    static /* synthetic */ void a(jge jge2, double d2) {
        jge2.dx(d2);
    }

    static /* synthetic */ double c(jge jge2) {
        return jge2.lfU;
    }

    static /* synthetic */ void d(jge jge2) {
        jge2.dDX();
    }

    static /* synthetic */ void e(jge jge2) {
        jge2.dDZ();
    }

    static /* synthetic */ void f(jge jge2) {
        jge2.dEb();
    }
}

