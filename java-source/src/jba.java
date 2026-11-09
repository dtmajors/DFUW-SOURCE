/*
 * Decompiled with CFR.
 */
public class jba
extends ioa
implements jaz {
    static final double mMk = 0.25;
    private ipb mMl;
    private iqa mMm;
    private ipb mMn;
    private ipb mMo;
    private ipf mMp;
    private ist lCt;
    private isw mMq;
    private ipb mMr;
    private ipz mMs;
    private ipx mMt;
    private ipx mMu;
    private a mMv;
    private boolean mMw = false;
    private boolean lvA = false;
    private boolean mMx = false;
    private jbc mMy = jbc.mMA;

    public jba(String string, String string2) {
        super(string, string2);
        this.OQ(-1);
        this.a(hya.lmp, true);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dwd();
    }

    public jbc dvV() {
        return this.mMy;
    }

    @Override
    public void a(jbc jbc2) {
        this.mMy = jbc2;
        switch (jbc2) {
            case mMB: {
                this.cVJ();
                this.dwe();
                break;
            }
            case mME: {
                this.cVJ();
                this.dwc();
                break;
            }
            case mMF: {
                this.cVJ();
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.mMx) {
            this.mMx = false;
            this.dhJ().pack();
            this.pack();
        }
    }

    public float dvW() {
        return this.cFw();
    }

    public float dvX() {
        float f2 = 0.0f;
        switch (this.mMy) {
            case mMB: 
            case mMF: {
                f2 = 88.0f;
                break;
            }
            case mME: {
                f2 = Math.min(this.cFx(), 88.0f);
                break;
            }
            default: {
                f2 = 27.0f;
            }
        }
        return f2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(ipx.d(this.dwf()));
        this.dhJ().W(ipx.c(new ipf[]{ipx.d(this.dwg())}));
        this.dhJ().W(this.cGU());
        this.dhJ().W(this.dwp());
        this.pack();
        this.cqF();
    }

    protected void cVI() {
    }

    @Override
    protected void cKg() {
        super.cKg();
        if (!this.mMw) {
            this.mMw = true;
            jbd.dwq().m(this);
        }
    }

    @Override
    protected void cYd() {
        super.cYd();
        this.cVH();
    }

    protected void cVH() {
        this.mMm.a(new iqu(this.mMl.dju(), this.mMl.djv()));
        this.mMm.hz(0.0f);
        this.mMn.a(new iqu(this.mMn.dju(), this.mMl.djv()));
        this.mMo.a(new iqu(22, 22));
        this.mMp.a(new iqu(1, 15));
        this.mMs.a(new iqu(1, 1));
        this.mMr.a(new iqu(0, 0));
    }

    protected isw cVG() {
        ist ist2 = new ist(isf.mwN, 13, 0xABABAB);
        ist2.setSize(180, 32);
        ist2.sv(false);
        ist2.a(isu.mxP);
        return ist2;
    }

    protected ioc dvY() {
        return ioc.eh(this.mMm.dju(), this.mMm.djv());
    }

    protected void d(String string, int n, int n2, int n3, int n4) {
        this.mMm.b(string, n, n2, n3, n4);
    }

    protected void rP(String string) {
        this.mMn.qP(string);
    }

    protected void rQ(String string) {
        this.mMo.qP(string);
    }

    protected void D(loz loz2) {
        this.lCt.o(loz2);
    }

    protected void rR(String string) {
        this.mMr.qP(string);
    }

    protected iph dvZ() {
        return this.mMu;
    }

    protected void cVJ() {
    }

    protected ipx dwa() {
        return this.mMt;
    }

    protected iqa dwb() {
        return this.mMm;
    }

    private void dwc() {
        if (this.lvA) {
            return;
        }
        if (this.mMv != null) {
            return;
        }
        this.mMv = new a(this);
        jba.czy().a(this.mMv);
    }

    private void dwd() {
        if (this.mMv == null) {
            return;
        }
        if (jba.czy() != null) {
            jba.czy().b(this.mMv);
        }
        this.mMv = null;
    }

    private void dwe() {
        if (this.lvA) {
            return;
        }
        this.lvA = true;
        ioc ioc2 = this.dvY();
        this.mMm.a(new iqu(ioc2.cf, ioc2.cg));
        this.mMn.a(new iqu(this.mMn.dju(), this.mMn.djv()));
        this.mMo.a(new iqu(48, 48));
        this.mMp.a(new iqu(1, 48));
        this.mMs.a(new iqu(this.mMq.dqg(), this.mMq.dqh()));
        this.mMr.a(new iqu(this.mMr.dju(), this.mMr.djv()));
        this.mMl.hz(0.0f);
        this.mMm.hz(1.0f);
        this.lCt.Rk(12357465);
        this.mMx = true;
    }

    private ipf dwf() {
        this.mMl = new ipb("/dfdata/texture/gui/j2f/common/notifications/backgrounds/nbg_general_small.png");
        return this.mMl;
    }

    private ipf dwg() {
        this.mMm = new iqa();
        return this.mMm;
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.dwh()));
        ipx2.W(ipx.a(56, 1, ipx.d(this.dwi())));
        ipx2.W(ipx.d(this.cGX()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dwj()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(this.dwm());
        ipx2.W(this.dwn());
        return ipx2;
    }

    private ipf dwh() {
        this.mMn = new ipb();
        return this.mMn;
    }

    private ipf dwi() {
        this.mMo = new ipb();
        return this.mMo;
    }

    private ipf cGX() {
        this.mMp = new ipk(0x2E2E2E, 1, 15);
        return this.mMp;
    }

    private ipf dwj() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.duM());
        ipx2.W(ipx.d(this.dwk()));
        return ipx2;
    }

    private ipf duM() {
        this.lCt = new ist(isf.mwO, 15, 0xABABAB);
        return this.lCt;
    }

    private ipf dwk() {
        this.mMs = new ipz(irl.dnr());
        this.mMs.sa(true);
        this.mMs.W(this.dwl());
        return this.mMs;
    }

    private ipf dwl() {
        this.mMq = this.cVG();
        return this.mMq;
    }

    private ipf dwm() {
        this.mMt = ipx.h(new ipf[0]);
        return this.mMt;
    }

    private ipf dwn() {
        this.mMu = ipx.h(new ipf[0]);
        this.mMu.W(ipx.d(this.dwo()));
        return this.mMu;
    }

    private ipf dwo() {
        this.mMr = new ipb();
        return this.mMr;
    }

    private ipf dwp() {
        return new ipx(this){
            final /* synthetic */ jba mMz;
            {
                this.mMz = jba2;
            }

            public boolean du(int n, int n2) {
                if (jba.k(this.mMz)) {
                    this.mMz.cVI();
                    return true;
                }
                return false;
            }
        };
    }

    static /* synthetic */ ipb a(jba jba2) {
        return jba2.mMl;
    }

    static /* synthetic */ iqa b(jba jba2) {
        return jba2.mMm;
    }

    static /* synthetic */ ipb c(jba jba2) {
        return jba2.mMn;
    }

    static /* synthetic */ ipb d(jba jba2) {
        return jba2.mMo;
    }

    static /* synthetic */ ipf e(jba jba2) {
        return jba2.mMp;
    }

    static /* synthetic */ ipz f(jba jba2) {
        return jba2.mMs;
    }

    static /* synthetic */ isw g(jba jba2) {
        return jba2.mMq;
    }

    static /* synthetic */ ipb h(jba jba2) {
        return jba2.mMr;
    }

    static /* synthetic */ ist i(jba jba2) {
        return jba2.lCt;
    }

    static /* synthetic */ void j(jba jba2) {
        jba2.dwd();
    }

    static /* synthetic */ boolean k(jba jba2) {
        return jba2.lvA;
    }
}

