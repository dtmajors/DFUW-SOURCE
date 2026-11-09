/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class jhg
extends jhf {
    private static final int neu = 30;
    private lie lBo;
    private ist mDp;
    private ipf nev;
    private ipf new;
    private iwb nex;

    public jhg(ign ign2) {
        super(ign2);
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        igq.lTG.c((jlf<ign>)new jlr<jhg, ign>(this, this){
            final /* synthetic */ jhg ney;
            {
                this.ney = jhg2;
                super(jhg3);
            }

            public void b(jhg jhg2, ign ign2) {
                jhg.a(this.ney, ign2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jhg)object, (ign)object2);
            }
        });
        this.dFL();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dcJ();
    }

    public void dFL() {
        if (this.lBo != null) {
            this.lBo.stop();
        }
        this.lBo = new lie(this, 1.0, true){
            final /* synthetic */ jhg ney;
            {
                this.ney = jhg2;
                super(d2, bl);
            }

            public void dh(double d2) {
                if (d2 < 30.0) {
                    jhg.a(this.ney, (int)d2);
                } else {
                    jhg.a(this.ney);
                    this.ney.cUF().qg(false);
                }
            }
        };
        this.lBo.e(this.djE().getMessageDelegator());
    }

    @Override
    public boolean dFM() {
        return true;
    }

    public void tu(boolean bl) {
        this.nev.setVisible(bl);
        this.new.setVisible(bl);
    }

    @Override
    public ipf dFN() {
        this.nev = new ipk(12357465, 16, 1);
        this.nev.setVisible(false);
        return ipx.h(new ipk(0x161616), ipx.d(new ipb("icon_exclamation_mark")), ipx.j(ipx.c(new ipf[0]), this.nev));
    }

    @Override
    public void g(iph iph2) {
        super.g(iph2);
        this.dFB().hz(0.1f);
        this.mDp = new ist();
        this.mDp.a(isf.mwN, 12);
        this.mDp.Rk(0xABABAB);
        this.UH(0);
        iph2.W(ipx.d(this.mDp));
    }

    @Override
    public ipf dFO() {
        ipx ipx2 = (ipx)super.dFO();
        this.new = new ipk(12357465, 16, 1);
        this.new.setVisible(false);
        ipx ipx3 = ipx.j(ipx.c(new ipf[0]), this.new);
        ipx3.rF(false);
        ipx2.W(ipx3);
        return ipx2;
    }

    @Override
    public void a(ipx ipx2) {
        super.a(ipx2);
        ipx2.W(new ipk(0x2F2F2F, 19, 1));
        this.nex = new iwb(this){
            final /* synthetic */ jhg ney;
            {
                this.ney = jhg2;
            }

            public void cLq() {
                this.ney.dFP();
            }
        };
        ipx2.W(this.nex);
        this.w(null);
    }

    @Override
    public void cGR() {
        this.cUF().cUc();
        this.cUF().qg(false);
    }

    public void dFP() {
        this.cUF().qg(false);
        this.cUF().qf(true);
    }

    @Override
    public void dFH() {
        super.dFH();
        this.mDp.setVisible(false);
        this.dFB().hz(1.0f);
    }

    @Override
    public void dFI() {
        super.dFI();
        this.mDp.setVisible(true);
        this.dFB().hz(0.1f);
    }

    private void UH(int n) {
        if (this.djL() && this.djW() && this.djS()) {
            this.mDp.setText(Math.max(30 - n, 0) + "");
        }
    }

    private void dcJ() {
        if (this.lBo != null) {
            this.lBo.stop();
            this.lBo = null;
        }
    }

    private void w(ign ign2) {
        this.djE();
        this.nex.rF(ioa.cyJ().cIM().dGE());
    }

    static /* synthetic */ void a(jhg jhg2, ign ign2) {
        jhg2.w(ign2);
    }

    static /* synthetic */ void a(jhg jhg2, int n) {
        jhg2.UH(n);
    }

    static /* synthetic */ void a(jhg jhg2) {
        jhg2.dcJ();
    }
}

