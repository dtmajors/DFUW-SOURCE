/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ihe
extends ihs {
    private static final String lVg = "ConfigShowFilterBar";
    private iox lVh;
    private isd lVi;
    private iqa lVj;
    private iqa lUU;
    private ihf lVk;
    private ihg lVl;
    private boolean lBD = false;
    private ign lVm;
    private ign lVn;

    public ihe() {
        super("FeatWindowNew", "FeatWindowNew.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        this.U(898.0f, 420.0f);
        this.g(300.0f, 50.0f, 898.0f, 756.0f);
        this.qY(true);
        this.a(ire.mul);
        this.a(lVg, hsu.ldg, false);
    }

    @Override
    public void initialize() {
        super.initialize();
        ihe.cyJ().cHw().c(hyc.lmQ);
        hso.cxK().cxR().dMm();
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(bl);
        if (bl) {
            this.cqF();
            this.cFc();
        }
    }

    public void p(ign ign2) {
        ihe.cyJ().cHw().a(hyc.lmQ, true);
        if (this.lVi != null) {
            this.r(ign2);
        } else {
            this.lVm = ign2;
        }
    }

    public void q(ign ign2) {
        ihe.cyJ().cHw().a(hyc.lmQ, true);
        if (this.lVi != null) {
            this.s(ign2);
        } else {
            this.lVn = ign2;
        }
    }

    public void c(jmq jmq2) {
        if (this.lVi == null) {
            return;
        }
        if (jmq2 == jmq.nzY) {
            this.lVi.SH(0);
        } else if (jmq2 == jmq.nzZ) {
            this.lVi.SH(1);
        }
    }

    public boolean d(jmq jmq2) {
        if (this.lVi == null) {
            return true;
        }
        boolean bl = false;
        switch (this.lVi.doI()) {
            case 0: {
                if (jmq2 != jmq.nzY) break;
                bl = true;
                break;
            }
            case 1: {
                if (jmq2 != jmq.nzZ) break;
                bl = true;
            }
        }
        if (!bl) {
            this.c(jmq2);
        }
        return bl;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(0, 0, 33, 116);
        this.dG(0, 0);
        this.a((ipf)new ipb("TitleIcon"), 7, 0, 17, lww.sXP.bD(new Object[0]), null);
        this.cXM().qp(true);
        ivm ivm2 = new ivm(this){
            final /* synthetic */ ihe lVo;
            {
                this.lVo = ihe2;
            }

            public void pn(boolean bl) {
                ihe.a(this.lVo, bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjC.bD(new Object[0]).exA());
            }
        };
        this.lVh = ivm2;
        this.cXM().a(ivm2, 0);
        this.cXE().a(iqo.dmS());
        this.cXE().W(ipx.a(11, 1, new ipf[0]));
        ipx ipx2 = ipx.c(new ipf[0]);
        this.cXE().W(ipx2);
        this.lVj = new iqa("feats_v2_main_bg_line", 18, 0, 18, 0);
        this.lVj.setVisible(this.cXO() == ihx.lXF);
        this.lUU = new iqa("WindowBackgroundBitmap", 520, 1, 33, 120);
        ipx2.W(ipx.j(ipx.b(0, 0, 32, 0, this.lVj), ipx.a(0, 0, 32, 116, this.lUU)));
        iyp iyp2 = new iyp(this, ivm2){
            final /* synthetic */ iox lVp;
            final /* synthetic */ ihe lVo;
            {
                this.lVo = ihe2;
                this.lVp = iox2;
            }

            public void PU(int n) {
                this.lVp.rF(n == 0);
                ihe.a(this.lVo, n);
            }
        };
        this.lVi = iyp2;
        ipx2.W(iyp2);
        iyp2.c((ipf)new iyq(this, "TabMenuButtonFeatsOffDisabled", "TabMenuButtonFeatsOffNormal", "TabMenuButtonFeatsOffHover", "TabMenuButtonFeatsOffPushing", "TabMenuButtonFeatsOnDisabled", "TabMenuButtonFeatsOnNormal", "TabMenuButtonFeatsOnHover", "TabMenuButtonFeatsOnPushing"){
            final /* synthetic */ ihe lVo;
            {
                this.lVo = ihe2;
                super(string, string2, string3, string4, string5, string6, string7, string8);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjD.bD(new Object[0]).exA());
            }
        }, this.cWj());
        iyp2.c((ipf)new iyq(this, "TabMenuButtonStatsOffDisabled", "TabMenuButtonStatsOffNormal", "TabMenuButtonStatsOffHover", "TabMenuButtonStatsOffPushing", "TabMenuButtonStatsOnDisabled", "TabMenuButtonStatsOnNormal", "TabMenuButtonStatsOnHover", "TabMenuButtonStatsOnPushing"){
            final /* synthetic */ ihe lVo;
            {
                this.lVo = ihe2;
                super(string, string2, string3, string4, string5, string6, string7, string8);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjE.bD(new Object[0]).exA());
            }
        }, this.cWk());
        iyp2.SH(0);
        if (this.lVm != null) {
            this.r(this.lVm);
            this.lVm = null;
        }
        if (this.lVn != null) {
            this.s(this.lVn);
            this.lVn = null;
        }
        this.qj(this.nk(lVg));
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        this.qj(this.nk(lVg));
    }

    @Override
    protected void ku(float f) {
        super.ku(f);
        if (this.lUU != null) {
            this.lUU.hz(f);
        }
        if (this.lVk != null) {
            this.lVk.kh(f);
        }
        if (this.lVl != null) {
            this.lVl.kh(f);
        }
        if (this.lVi != null) {
            this.lVi.kh(f);
        }
    }

    @Override
    protected void cGR() {
        ihe.cyJ().cHw().a(hyc.lmQ, false);
    }

    @Override
    protected void cds() {
        super.cds();
        if (this.lVj != null) {
            this.lVj.setVisible(this.cXO() == ihx.lXF);
        }
    }

    private ipf cWj() {
        this.lVk = new ihf();
        this.lVk.rg(false);
        return this.lVk;
    }

    private ipf cWk() {
        this.lVl = new ihg(this){
            final /* synthetic */ ihe lVo;
            {
                this.lVo = ihe2;
            }

            public void n(igm igm2) {
                ihe.a(this.lVo).o(igm2);
                ihe.b(this.lVo).SH(0);
            }
        };
        this.lVl.rg(false);
        return this.lVl;
    }

    private void qj(boolean bl) {
        if (this.lVk == null) {
            return;
        }
        this.lVk.cWl().setVisible(bl);
        this.lVh.hX(bl);
        this.q(lVg, bl);
    }

    private void r(ign ign2) {
        this.lVi.SH(0);
        this.lVk.p(ign2);
    }

    private void s(ign ign2) {
        this.lVi.SH(0);
        this.lVk.q(ign2);
    }

    private void QR(int n) {
        switch (n) {
            case 0: {
                this.cXM().C(lww.tjD.bD(new Object[0]));
                this.cXM().e(jmq.nzY);
                break;
            }
            case 1: {
                this.cXM().C(lww.tjE.bD(new Object[0]));
                this.cXM().e(jmq.nzZ);
            }
        }
    }

    static /* synthetic */ void a(ihe ihe2, boolean bl) {
        ihe2.qj(bl);
    }

    static /* synthetic */ void a(ihe ihe2, int n) {
        ihe2.QR(n);
    }

    static /* synthetic */ ihf a(ihe ihe2) {
        return ihe2.lVk;
    }

    static /* synthetic */ isd b(ihe ihe2) {
        return ihe2.lVi;
    }
}

