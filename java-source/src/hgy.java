/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hgy
extends hgq
implements hbw,
hma {
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hgy kpF;
        {
            this.kpF = hgy2;
        }

        public final void W() {
            if (!hgy.b(this.kpF)) {
                return;
            }
            hgy.c(this.kpF);
        }
    };
    private final hpg kpx;
    private final lbn kpy = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgy kpF;
        {
            this.kpF = hgy2;
        }

        public final void W() {
            if (!$assertionsDisabled && hgy.d(this.kpF) == null) {
                throw new AssertionError();
            }
            hgy.e(this.kpF);
        }

        static {
            $assertionsDisabled = !hgy.class.desiredAssertionStatus();
        }
    };
    private final lbn kpz = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgy kpF;
        {
            this.kpF = hgy2;
        }

        public final void W() {
            if (!$assertionsDisabled && hgy.d(this.kpF) == null) {
                throw new AssertionError();
            }
            hgy.b(this.kpF, false);
            hgy.a(this.kpF, null);
        }

        static {
            $assertionsDisabled = !hgy.class.desiredAssertionStatus();
        }
    };
    private final lbn kpA = new lbn(this){
        final /* synthetic */ hgy kpF;
        {
            this.kpF = hgy2;
        }

        public final void W() {
            hgy.f(this.kpF);
        }
    };
    private final lbn kpB = new lbn(this){
        final /* synthetic */ hgy kpF;
        {
            this.kpF = hgy2;
        }

        public final void W() {
            hgy.g(this.kpF);
        }
    };
    private boolean Initialized;
    private int asi;
    private hnu kpC;
    private hfv kpD;
    private double kbP;
    private double kbQ;
    private hpa kpE;

    public hgy(hdm hdm2, String string, lgg lgg2, lhf lhf2, hdz hdz2, hdw hdw2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        super(hdm2, string, lgg2, lhf2, hdz2, hdw2, bl, bl2, bl3);
        assert (hdz2 == null || hdz2.kaW == hdw2);
        this.kpx = this.nz(bl4);
    }

    public final hdw ceB() {
        return (hdw)this.kaW;
    }

    public final hdz cjV() {
        return (hdz)this.kmX;
    }

    public final boolean a(hgy hgy2, boolean bl) {
        hmt hmt2 = this.cqt();
        if (!(hmt2 instanceof hgm)) {
            return false;
        }
        if (this.kaW.c(hgy2.kaW) && this.ceB().auW()) {
            if (!bl) {
                if (this.ckg()) {
                    this.cbP().b(hgy2.cjV(), this.cjV());
                } else {
                    this.cbP().a(hgy2.cjV(), (hgm)this.cqt(), this.cqu(), -1);
                }
                hgm hgm2 = (hgm)this.cqt();
                hgy2.c(hgm2);
            }
            return true;
        }
        return false;
    }

    public final lgs cjW() {
        lgs lgs2 = this.cqD();
        lgs lgs3 = this.kaW.awT();
        lgs2.cf -= lgs3.cf;
        lgs2.cg -= lgs3.cg;
        lgs3 = this.kaW.cel();
        lgs2.cf += lgs3.cf;
        lgs2.cg += lgs3.cg;
        lgs2.rmN = lgs3.rmN;
        lgs2.H = lgs3.H;
        return lgs2;
    }

    public void cjX() {
        hdz hdz2 = this.cjV();
        if (hdz2 == null) {
            return;
        }
        if (!hdz2.ceB().auU()) {
            return;
        }
        lgs lgs2 = this.cjO();
        lgs2 = this.kLu.crU().a((hms)this, lgs2);
        this.kpD = new hfv(this.cbO(), null, lgs2.aI(), lgs2.cqv(), hdz2.ced(), this.kpA);
        this.kLu.a("label edit modality", (hms)this.kpD);
        this.kpD.cqV();
        this.ny(true);
    }

    @Override
    public final void a(hdz hdz2, int n, int n2, lgg lgg2) {
        assert (lda.by(lgg2));
        this.cbP().a(hdz2, n, this.cjV(), n2);
    }

    @Override
    public boolean b(hms hms2) {
        if (!(hms2 instanceof hgy)) {
            return false;
        }
        hgy hgy2 = (hgy)hms2;
        return this.ceB().c(hgy2.ceB()) && hgy2.ceB().auW();
    }

    @Override
    public void cge() {
    }

    @Override
    public void cgf() {
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kpC != null) {
            this.cka();
        }
        if (this.kpE != null) {
            this.kpE.remove();
            this.kpE = null;
            this.kLu.kAz.eme().a(false, this.jEL);
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cjK() {
        super.cjK();
    }

    @Override
    protected boolean b(hmt hmt2, boolean bl) {
        boolean bl2;
        if (!super.b(hmt2, bl)) {
            return false;
        }
        hmt hmt3 = this.cbO().jZG.cpN();
        boolean bl3 = bl2 = this.a(hmt2) && this.ceB().auW() && this.cjV().vf() > 1;
        if (hmt2 instanceof hgy) {
            Object object;
            if (hmt3 instanceof hgm && hmt2.cqt() instanceof hgm) {
                object = ((hgm)this.cbO().jZG.cpN()).kdT;
                hee hee2 = ((hgm)hmt2.cqt()).kdT;
                if (!this.cjV().ceB().a((hee)object, hee2, bl2)) {
                    return false;
                }
            }
            if (bl2 && !bl) {
                this.a(hmt2, this.cbO().cqu(), lcy.qSs, true);
                return false;
            }
            object = (hgy)hmt2;
            return ((hgy)object).a(this, bl);
        }
        if (hmt2 instanceof hgm) {
            Object object;
            if (hmt3 instanceof hgm && (hmt3 != hmt2 || bl2)) {
                object = ((hgm)hmt3).kdT;
                hee hee3 = ((hgm)hmt2).kdT;
                if (!this.cjV().ceB().a((hee)object, hee3, bl2)) {
                    return false;
                }
            }
            object = (hgm)hmt2;
            return ((hgm)object).a(this, bl, bl2);
        }
        if (hmt2 instanceof hex) {
            if (bl2 && !bl) {
                this.a(hmt2, this.cbO().cqu(), lcy.qSu, true);
                return false;
            }
            return ((hex)hmt2).a(this, bl);
        }
        if (hmt2 instanceof hfk) {
            hfk hfk2 = (hfk)hmt2;
            return hfk2.a(this, bl);
        }
        if (hmt2 instanceof hfw) {
            hfw hfw2 = (hfw)hmt2;
            return hfw2.a(this, bl);
        }
        if (hmt2 instanceof hgu) {
            hgu hgu2 = (hgu)hmt2;
            return hgu2.a(this, bl);
        }
        if (hmt2 instanceof hho) {
            hho hho2 = (hho)hmt2;
            return hho2.a(this, bl);
        }
        assert (false);
        return false;
    }

    @Override
    protected void cjJ() {
        super.cjJ();
        this.refresh();
    }

    @Override
    protected boolean cjM() {
        return this.kmX != null && this.kmX.isConstructed() && this.kmX.isEnabled();
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        return this.kLu.kNl;
    }

    @Override
    protected lip cjN() {
        if (this.kmX == null || !this.kmX.isConstructed()) {
            return null;
        }
        return this.kmX.ced();
    }

    @Override
    protected void chL() {
        assert (this.Initialized);
        super.chL();
        if (this.cjV() != null) {
            this.cbO().a(this.cjV());
        }
    }

    protected void cjY() {
        if (this.kpx == null) {
            return;
        }
        String string = Integer.toString(this.asi);
        this.kpx.mV(string);
        lhf lhf2 = this.kLu.a(this.kpx.cve().jFE, string);
        this.kpx.d(lhf2);
        lgg lgg2 = this.kpx.cqw();
        int n = Math.max(this.getWidth(), lgg2.cf + lhf2.rmN);
        int n2 = Math.max(this.getHeight(), lgg2.cg + lhf2.H);
        lhf lhf3 = new lhf(n, n2);
        this.d(lhf3);
    }

    protected final void a(hmt hmt2, lgg lgg2, lip lip2, boolean bl) {
        assert (this.kpC == null);
        assert (hmt2 instanceof hbw);
        a a2 = new a(this.cjV(), hmt2, this.cbO().jZG.cpP());
        hdb hdb2 = new hdb(this.cbO(), null, lgg.rlI, lcy.qZP.esy(), this.cjV().vf(), a2, this.kpy, bl);
        hen.f f2 = this.cbO().jXJ;
        lhf lhf2 = hdb2.cqv().p(f2.keL.kKX.kPT.ctr());
        this.kpC = new hen(this.cbO(), (String)null, new lgg(lgg2.cf - lhf2.rmN / 2, lgg2.cg - lhf2.H / 2), lhf2, f2, new hen.d(lip2), new hnu.d(this.kpy));
        this.kpC.w(hdb2);
        this.kLu.a("Split Prompt", (hms)this.kpC);
        this.kpC.cqV();
        this.kpC.cqt().a((hms)this.kpC, (float)this.kLu.crO());
        this.nx(true);
    }

    private void nx(boolean bl) {
        this.kpC.cql().a(bl, this.kpz);
    }

    private boolean a(hmt hmt2) {
        return this.kLu.crI() && hmt2 instanceof hbw;
    }

    private void cjZ() {
        if (this.koT) {
            return;
        }
        double d2 = this.kLu.kAz.emb();
        boolean bl = this.kbP <= d2 && d2 <= this.kbQ;
        if (bl != (this.kpE != null)) {
            if (bl) {
                this.kpE = new hpa(this.kLu, (String)null, lgg.rlI, null, this.cbO().jXk.jMb);
                this.j(this.kpE);
                this.kpE.H(this.cbO().jXk.jMc);
            } else {
                this.kpE.remove();
                this.kpE = null;
            }
            this.kLu.kAz.eme().a(bl, this.jEL);
            this.koV.H(bl ? this.cbO().jXk.jMd : lcq.BRIGHT_WHITE);
        }
        if (this.kpE != null && !this.koT) {
            double d3 = this.cqU().cqv().H;
            double d4 = d3 * (d2 - this.kbP) / (this.kbQ - this.kbP);
            this.kpE.cB(0, (int)d4);
        }
    }

    private void refresh() {
        int n;
        if (this.ceB().auW() && this.cjV() != null && (n = this.cjV().vf()) != this.asi) {
            this.asi = n;
            this.cjY();
        }
        if (this.cjV() != null) {
            hdz hdz2 = this.cjV();
            this.kbP = hdz2.cez();
            this.kbQ = hdz2.ceA();
            this.cjZ();
        }
    }

    private void cka() {
        assert (this.kpC != null);
        this.kLu.t(this.kpC);
        assert (this.kpC == null);
    }

    private void ckb() {
        hdb hdb2 = (hdb)this.kpC.csT();
        a a2 = (a)hdb2.ccw();
        int n = hdb2.vf();
        int n2 = a2.kdD.vf();
        this.cka();
        if (n != 0) {
            n2 -= n;
            hms hms2 = a2.kpG;
            assert (hms2 instanceof hbw);
            ((hbw)((Object)hms2)).a(a2.kdD, n2, n, a2.kpH);
        }
    }

    private void ckc() {
        assert (this.kpD != null);
        this.ckf();
        this.cke();
    }

    private void ckd() {
        assert (this.kpD != null);
        this.ckf();
        this.ny(false);
        this.kpD = null;
    }

    private void cke() {
        assert (this.kpD != null);
        this.kLu.t(this.kpD);
        assert (this.kpD == null);
    }

    private void ny(boolean bl) {
        this.kpD.cql().a(bl, this.kpB);
        this.jBm.nR(bl);
    }

    private void ckf() {
        String string = this.kpD.chz();
        if (!string.equals(this.kmX.ced().esy()) && this.cqt() != null) {
            ((hgm)this.cqt()).kdT.a(this.cjV(), string);
        }
    }

    private hpg nz(boolean bl) {
        if (!this.ceB().auW() || this.cjV() == null || bl) {
            return null;
        }
        lgg lgg2 = new lgg(this.getWidth() * 2 / 3, this.getHeight() * 2 / 3);
        hpg hpg2 = new hpg(this.kLu, null, lgg2, new lhf(16, 16), this.cbO().kII, "");
        this.j(hpg2);
        return hpg2;
    }

    private boolean ckg() {
        hee hee2 = ((hgm)this.cqt()).kdT;
        return hee2.kdI;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ boolean b(hgy hgy2) {
        return hgy2.Initialized;
    }

    static /* synthetic */ void c(hgy hgy2) {
        hgy2.cjZ();
    }

    static /* synthetic */ hnu d(hgy hgy2) {
        return hgy2.kpC;
    }

    static /* synthetic */ void e(hgy hgy2) {
        hgy2.ckb();
    }

    static /* synthetic */ void b(hgy hgy2, boolean bl) {
        hgy2.nx(bl);
    }

    static /* synthetic */ hnu a(hgy hgy2, hnu hnu2) {
        hgy2.kpC = hnu2;
        return hgy2.kpC;
    }

    static /* synthetic */ void f(hgy hgy2) {
        hgy2.ckc();
    }

    static /* synthetic */ void g(hgy hgy2) {
        hgy2.ckd();
    }
}

