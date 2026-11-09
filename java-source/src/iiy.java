/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iiy
extends ijd {
    private lie mca;
    private hvr mcb;
    private ipb mcc = new ipb("icon_combat_mode");
    private iae mcd;

    public iiy() {
        super("CombatModeIndicator");
        this.W(this.mcc);
        hso.cxK().cxP().cyZ().lgu.c(new jlr<iiy, Double>(this, this){
            final /* synthetic */ iiy mce;
            {
                this.mce = iiy2;
                super(iiy3);
            }

            public void b(iiy iiy2, Double d2) {
                iiy.a(iiy2, d2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((iiy)object, (Double)object2);
            }
        });
        hso.cxK().cxP().cyZ().lgv.b(new jlq<iiy>(this, this){
            final /* synthetic */ iiy mce;
            {
                this.mce = iiy2;
                super(iiy3);
            }

            public void f(iiy iiy2) {
                iiy.a(iiy2);
            }

            public /* synthetic */ void R(Object object) {
                this.f((iiy)object);
            }
        });
        this.setVisible(false);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dat();
        this.dav();
    }

    @Override
    public hyn dd(int n, int n2) {
        this.djE();
        double d2 = ioa.cxP().cyZ().cAb();
        int n3 = 45;
        this.djE();
        int n4 = ioa.cxP().bpc();
        if ((float)n4 < hso.cxK().cxY().H / 2.0f) {
            n3 = -n3;
        }
        String string = lyu.tJU.bD(d2).exA();
        this.djE();
        this.mcd = new iae(string, ioa.cxP().bpb(), n4 + n3);
        return this.mcd;
    }

    @Override
    public void q(hyn hyn2) {
        if (this.mcd == hyn2) {
            this.mcd = null;
        }
    }

    @Override
    public ijg dS(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public Integer dP(int n, int n2) {
        return n2 - 200;
    }

    @Override
    public ijc cZY() {
        return new iiz();
    }

    private void a(Double d2) {
        this.setVisible(true);
        this.dat();
        this.dav();
        this.dq(d2);
    }

    private void das() {
        this.setVisible(false);
        this.dat();
        this.dav();
    }

    private void dq(double d2) {
        double d3 = lea.epx().aQF();
        double d4 = d2 - d3;
        double d5 = d4 + d3 * 0.7;
        double d6 = d5 - this.djE().getMessageDelegator().arc().rgz;
        this.mca = new lie(this, 1.0, true, d6, d2){
            final /* synthetic */ double mcf;
            final /* synthetic */ double mcg;
            final /* synthetic */ iiy mce;
            {
                this.mce = iiy2;
                this.mcf = d3;
                this.mcg = d4;
                super(d2, bl);
            }

            public void dh(double d2) {
                if (d2 >= this.mcf && iiy.b(this.mce) == null) {
                    iiy.c(this.mce);
                }
                if (iiy.d(this.mce) != null) {
                    double d3 = this.mcg - this.mce.djE().getMessageDelegator().arc().rgz;
                    if (d3 < 0.0) {
                        d3 = 0.0;
                    }
                    iiy.d(this.mce).c(iae.os(lyu.tJU.bD(d3).exA()));
                }
            }
        };
        this.mca.e(this.djE().getMessageDelegator());
    }

    private void dat() {
        if (this.mca != null) {
            this.mca.stop();
            this.mca = null;
        }
    }

    private void dau() {
        this.mcb = new hvl(this, 1.0f, 0.0f, 0.5){
            final /* synthetic */ iiy mce;
            {
                this.mce = iiy2;
                super(f, f2, d2);
            }

            public void hz(float f) {
                iiy.e(this.mce).hz(f);
            }
        };
        hso.cxK().cxP().czy().a(this.mcb);
    }

    private void dav() {
        if (this.mcb != null) {
            hso.cxK().cxP().czy().b(this.mcb);
            this.mcb = null;
        }
    }

    static /* synthetic */ void a(iiy iiy2, Double d2) {
        iiy2.a(d2);
    }

    static /* synthetic */ void a(iiy iiy2) {
        iiy2.das();
    }

    static /* synthetic */ hvr b(iiy iiy2) {
        return iiy2.mcb;
    }

    static /* synthetic */ void c(iiy iiy2) {
        iiy2.dau();
    }

    static /* synthetic */ iae d(iiy iiy2) {
        return iiy2.mcd;
    }

    static /* synthetic */ ipb e(iiy iiy2) {
        return iiy2.mcc;
    }
}

