/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hhe
extends hhc
implements lbr {
    private final hmt kqb;
    private final hpx kqc;
    private final hpx kqd;
    private final hpx kqe;
    private final hqh kqf;
    private final hpx kqg;
    private final lnt kqh;
    private final hmr jEN = new hmr(null);
    private final hna kqi;
    private final lbn kqj = new lbn(this){
        final /* synthetic */ hhe kqo;
        {
            this.kqo = hhe2;
        }

        public final void W() {
            hhe.a(this.kqo);
        }
    };
    private final lbn kqk = new lbn(this){
        final /* synthetic */ hhe kqo;
        {
            this.kqo = hhe2;
        }

        public final void W() {
            hhe.b(this.kqo);
        }
    };
    private final lbn kql = new lbn(this){
        final /* synthetic */ hhe kqo;
        {
            this.kqo = hhe2;
        }

        public final void W() {
            hhe.c(this.kqo);
        }
    };
    private final lbn kqm = new lbn(this){
        final /* synthetic */ hhe kqo;
        {
            this.kqo = hhe2;
        }

        public final void W() {
            hhe.a(this.kqo, !hhe.d(this.kqo));
            if (hhe.d(this.kqo)) {
                hhe.a(this.kqo);
            }
            hhe.e(this.kqo);
        }
    };
    private boolean Initialized;
    private boolean kqn;

    public hhe(hdm hdm2, String string, lgg lgg2, lhf lhf2, float f2, lbf<lhu> lbf2, lnt lnt2) {
        super(hdm2, string, lgg2, lhf2, new hhh(hdm2, (String)null, f2, lbf2));
        this.kqh = lnt2;
        this.kqb = new hmt((hnc)hdm2, null, new lgg(10, 10), lhf.rnv);
        this.j(this.kqb);
        this.kqi = new hna(hdm2.kAz, this.jEN, 5.0f, 5.0f);
        int n = 0;
        int n2 = 0;
        this.kqc = new hqz((hnc)hdm2, null, new lgg(n2, n), null, hpx.a.kXm, hdm2.kJH, hdm2.jXk.jWx);
        this.kqb.j(this.kqc);
        this.kqd = new hqz((hnc)hdm2, null, new lgg(n2, n += this.kqc.getHeight()), null, hpx.a.kXo, hdm2.kJH, hdm2.jXk.jWy);
        this.kqb.j(this.kqd);
        this.kqe = new hqz((hnc)hdm2, null, new lgg(n2, n += this.kqd.getHeight()), null, hpx.a.kXn, hdm2.kJH, hdm2.jXk.jWz);
        this.kqb.j(this.kqe);
        this.kqf = new hql((hnc)hdm2, null, new lgg(n2, n += this.kqe.getHeight()), hdm2.jXk.jWC.kLY, hdm2.jYG, this.kqh, true);
        this.kqb.j(this.kqf);
        this.kqg = new hqz((hnc)hdm2, null, new lgg(n2, n += this.kqf.getHeight()), null, hpx.a.kXn, hdm2.kJH, hdm2.jXk.jWA);
        this.kqb.j(this.kqg);
        this.kqb.cC(hdm2.jXk.jWx.kLY.rmN, n += this.kqg.getHeight());
        this.ckE();
        this.ckx();
        this.ckv();
        this.cku();
        this.ckH();
        this.refresh();
    }

    @Override
    public boolean a(lfu lfu2) {
        boolean bl = false;
        lgg lgg2 = this.cqE().cfx();
        ljp ljp2 = this.s(lgg2);
        ljp ljp3 = new ljp(ljp2);
        ljp3.x = lfu2.e("PositionX", ljp3.x);
        ljp3.y = lfu2.e("PositionY", ljp3.y);
        bl |= !ljp3.z(ljp2);
        boolean bl2 = lfu2.V("FollowPlayer", this.kqn);
        boolean bl3 = bl2 != this.kqn;
        this.kqn = bl2;
        if (bl |= bl3) {
            this.a(ljp3, lgg2);
            this.refresh();
        }
        return bl;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lhf b(lhf lhf2) {
        int n = (lhf2.rmN + lhf2.H) / 2;
        return new lhf(n, n);
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.ckC();
    }

    @Override
    protected boolean LM(int n) {
        this.cbO().jZm.O(n, true);
        return true;
    }

    @Override
    protected void ckm() {
        assert (this.Initialized);
        super.ckm();
        if (this.kqn) {
            this.ckE();
        }
        this.ckx();
    }

    @Override
    protected void ckn() {
        assert (this.Initialized);
        super.ckn();
        this.ckv();
    }

    @Override
    protected void cko() {
        assert (this.Initialized);
        super.cko();
        this.cku();
    }

    @Override
    protected boolean ckl() {
        return true;
    }

    @Override
    protected void ckz() {
        super.ckz();
        this.ckA();
    }

    @Override
    protected void chL() {
        assert (this.Initialized);
        super.chL();
        this.ckH();
    }

    @Override
    protected void chK() {
        assert (this.Initialized);
        super.chK();
        this.ckH();
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        if (this.kqb.cqQ()) {
            return this.kqb.cqJ();
        }
        return super.cfR();
    }

    private void refresh() {
        this.kqd.on(this.kqn);
        this.ckC();
    }

    private void ckA() {
        this.ckC();
    }

    private void ckx() {
        this.ckC();
    }

    private void ckv() {
    }

    private void cku() {
        this.ckD();
    }

    private ljp ckB() {
        ljq ljq2 = this.cbP().kck.av();
        ljp ljp2 = new ljp(ljq2.x, ljq2.rlV);
        return ljp2;
    }

    private void ckC() {
        boolean bl = false;
        if (this.kqn) {
            bl = true;
        } else {
            lgg lgg2 = this.o(this.ckB());
            int n = this.cqE().cfx().X(lgg2);
            bl = (float)n < this.cbO().jXk.jWG;
        }
        this.kqc.og(bl);
    }

    private void ckD() {
        this.kqe.og(this.kqh.ewg());
        this.kqg.og(this.kqh.ewh());
    }

    private void ckE() {
        lgg lgg2 = this.cqE().cfx();
        this.a(this.ckB(), lgg2);
    }

    private void ckF() {
        this.cbO().jZm.O(1, false);
    }

    private void ckG() {
        this.cbO().jZm.O(-1, false);
    }

    private void ckH() {
        boolean bl = this.ckI();
        this.kqi.nX(bl);
    }

    private boolean ckI() {
        if (!this.Initialized) {
            return false;
        }
        if (this.cqQ()) {
            return true;
        }
        hms hms2 = this.kLu.crV();
        return hms2 != null && this.o(hms2);
    }

    private void mU(boolean bl) {
        this.kqb.a(bl, this.jEN);
        this.kqc.cvC().a(bl, this.kqj);
        this.kqd.cvC().a(bl, this.kqm);
        this.kqe.cvC().a(bl, this.kqk);
        this.kqg.cvC().a(bl, this.kql);
    }

    static /* synthetic */ void a(hhe hhe2) {
        hhe2.ckE();
    }

    static /* synthetic */ void b(hhe hhe2) {
        hhe2.ckF();
    }

    static /* synthetic */ void c(hhe hhe2) {
        hhe2.ckG();
    }

    static /* synthetic */ boolean a(hhe hhe2, boolean bl) {
        hhe2.kqn = bl;
        return hhe2.kqn;
    }

    static /* synthetic */ boolean d(hhe hhe2) {
        return hhe2.kqn;
    }

    static /* synthetic */ void e(hhe hhe2) {
        hhe2.refresh();
    }
}

