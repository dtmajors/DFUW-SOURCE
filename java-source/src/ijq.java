/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ijq
extends iir {
    public static final String mbL = "death_bar_background";
    public static final String mbM = "death_bar_foreground";
    public static final String meu = "death_bar_background_noise";
    public static final String mev = "death_bar_skull";
    private irr ljc = null;
    private ipb mew = null;
    private ipb mex = null;
    private ipk mey = null;
    private float mbR = 0.0f;
    private ist mbS = null;
    private double mbT = 0.0;
    private String mbU = null;
    private ijs mez = null;

    public ijq() {
        super("DeathBar");
        this.rF(true);
        this.a(ipn.msd);
        this.mew = new ipb(meu);
        this.W(this.mew);
        irs irs2 = new irs();
        irs2.qu(mbL);
        irs2.ra(mbM);
        irs2.Sn(2);
        this.ljc = new irr(irs2);
        this.W(this.ljc);
        this.mbS = new ist("0");
        this.mbS.b(isf.mwM);
        this.mbS.zY(14);
        this.mbS.Rk(0xE0E0E0);
        this.W(this.mbS);
        this.mex = new ipb(mev);
        this.W(this.mex);
        this.mey = new ipk(0x181818, 1, 13);
        this.W(this.mey);
        this.mez = new ijs(this.ljc, this.mbS, this.mex);
        this.a(this.mez);
        hso.cxK().cxP().cyZ().lgB.c(new jlr<ijq, Float>(this, this){
            final /* synthetic */ ijq meA;
            {
                this.meA = ijq2;
                super(ijq3);
            }

            public void b(ijq ijq2, Float f) {
                ijq.a(ijq2, f);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((ijq)object, (Float)object2);
            }
        });
        hso.cxK().cxP().cyZ().lgC.a(new jls<ijq, Double, Boolean>(this, this){
            final /* synthetic */ ijq meA;
            {
                this.meA = ijq2;
                super(ijq3);
            }

            public void a(ijq ijq2, Double d2, Boolean bl) {
                ijq.a(this.meA, d2);
                ijq.a(this.meA).OI(bl != false ? 1 : 0);
                ijq.d(this.meA).a(ijq.b(this.meA), 30.0 / ijq.c(this.meA));
                ijq.d(this.meA).i(ijq2);
                this.meA.daj();
            }
        });
        this.setVisible(false);
    }

    @Override
    protected void daj() {
        if (this.dag()) {
            String string;
            this.mbS.setVisible(true);
            double d2 = this.mbT * (double)(1.0f - this.mbR);
            int n = (int)d2;
            if (n <= 0) {
                this.mbS.setVisible(false);
            }
            if ((string = "" + n).equals(this.mbU)) {
                return;
            }
            this.mbS.setText(string);
            this.mbU = string;
        } else {
            this.mbS.setVisible(false);
        }
    }

    private void b(Float f) {
        float f2;
        if (this.ljc == null) {
            return;
        }
        if ((double)f.floatValue() <= 0.01 || f.floatValue() >= 1.0f) {
            this.setVisible(false);
            return;
        }
        float f3 = f.floatValue() < 0.0f ? 0.0f : (f2 = f.floatValue() > 1.0f ? 1.0f : f.floatValue());
        if ((double)Math.abs(this.mbR - f2) < 1.0E-5) {
            return;
        }
        this.mbR = f2;
        this.ljc.setProgress(this.mbR);
        this.daj();
        this.setVisible(true);
    }

    @Override
    public boolean cZX() {
        return true;
    }

    @Override
    public ijg dS(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public Integer dP(int n, int n2) {
        return n2 / 4;
    }

    @Override
    public ijc cZY() {
        return new ijr();
    }

    @Override
    public void daa() {
        if (this.ljc != null) {
            this.ljc.hz(this.daE());
        }
        if (this.mex != null) {
            this.mex.hz(this.daE());
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        ljq ljq2 = hso.cxK().cxT().oB();
        if (ly.Z(ljq2)) {
            return iae.oJ(lyu.tKX.bD(new Object[0]).exA());
        }
        return iae.oJ(lyu.tKW.bD(new Object[0]).exA());
    }

    static /* synthetic */ void a(ijq ijq2, Float f) {
        ijq2.b(f);
    }

    static /* synthetic */ double a(ijq ijq2, double d2) {
        ijq2.mbT = d2;
        return ijq2.mbT;
    }

    static /* synthetic */ irr a(ijq ijq2) {
        return ijq2.ljc;
    }

    static /* synthetic */ ipk b(ijq ijq2) {
        return ijq2.mey;
    }

    static /* synthetic */ double c(ijq ijq2) {
        return ijq2.mbT;
    }

    static /* synthetic */ ijs d(ijq ijq2) {
        return ijq2.mez;
    }
}

