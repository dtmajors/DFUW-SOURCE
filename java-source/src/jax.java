/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jax
extends jau {
    private static final String mMe = "CombatMode";
    private ipb mMf = null;
    private iae mMg = null;
    private lie mMh = null;
    private hvr mAD = null;

    public jax() {
        this.a(iqp.dmX());
        this.mMf = new ipb(mMe);
        this.W(this.mMf);
    }

    @Override
    public void cCy() {
        super.cCy();
        this.mMh = new lie(this, 1.0, true){
            final /* synthetic */ jax mMi;
            {
                this.mMi = jax2;
                super(d2, bl);
            }

            public void dh(double d2) {
                this.mMi.djE();
                double d3 = ioa.cxP().cyZ().cAb();
                this.mMi.dw(d3);
                if (d3 / lea.epx().aQF() <= 0.4) {
                    jax.a(this.mMi);
                } else {
                    jax.b(this.mMi);
                }
            }
        };
        this.mMh.e(this.djE().getMessageDelegator());
    }

    @Override
    public hyn dd(int n, int n2) {
        this.djE();
        double d2 = ioa.cxP().cyZ().cAb();
        int n3 = 45;
        this.djE();
        int n4 = ioa.cxP().bpc();
        float f2 = n4;
        this.djE();
        if (f2 < ioa.cxP().cxY().H / 2.0f) {
            n3 = -n3;
        }
        String string = lyu.tJU.bD(d2).exA();
        this.djE();
        this.mMg = new iae(string, ioa.cxP().bpb(), n4 + n3);
        return this.mMg;
    }

    public void dw(double d2) {
        if (this.mMg != null) {
            this.mMg.c(iae.os(lyu.tJU.bD(d2).exA()));
        }
    }

    @Override
    public void q(hyn hyn2) {
        if (this.mMg == hyn2) {
            this.mMg = null;
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.mMh != null) {
            this.mMh.stop();
            this.mMh = null;
        }
        if (this.mMg != null) {
            this.djE();
            ioa.cxP().czh();
        }
    }

    private void dsq() {
        if (this.mAD == null) {
            this.mAD = new hvl(this, 1.0f, 0.0f, 0.5){
                final /* synthetic */ jax mMi;
                {
                    this.mMi = jax2;
                    super(f2, f3, d2);
                }

                public void hz(float f2) {
                    jax.c(this.mMi).hz(f2);
                }
            };
            hso.cxK().cxP().czy().a(this.mAD);
        }
    }

    private void dsr() {
        if (this.mAD != null) {
            hso.cxK().cxP().czy().b(this.mAD);
            this.mAD = null;
        }
    }

    @Override
    public int cCz() {
        this.djE();
        float f2 = ioa.cxP().cyJ().cHN().cEE();
        this.djE();
        return (int)(f2 + ioa.cxP().cyJ().cHN().getWidth() / 2.0f - (float)this.getWidth());
    }

    @Override
    public int cCA() {
        this.djE();
        return (int)ioa.cxP().cyJ().cHN().cEF();
    }

    @Override
    public boolean cCB() {
        return true;
    }

    @Override
    public boolean cCC() {
        return false;
    }

    @Override
    public boolean cCD() {
        return false;
    }

    @Override
    public boolean cCE() {
        return true;
    }

    static /* synthetic */ void a(jax jax2) {
        jax2.dsq();
    }

    static /* synthetic */ void b(jax jax2) {
        jax2.dsr();
    }

    static /* synthetic */ ipb c(jax jax2) {
        return jax2.mMf;
    }
}

