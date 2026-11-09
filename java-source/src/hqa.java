/*
 * Decompiled with CFR.
 */
public class hqa<ROWTYPE>
extends hpz {
    private final hnz kPK;
    private final hpe kuQ;
    public final a kXF;
    private final lbn kmP;
    private final hpx jCx;
    private final hrd<ROWTYPE, String> kXG;
    private final hoq.c[] kXH;
    private final int[] kXI;
    public final hno jHT;
    private final lbn kXJ = new lbn(this){
        final /* synthetic */ hqa kXO;
        {
            this.kXO = hqa2;
        }

        public final void W() {
            hqa.a(this.kXO);
        }
    };
    private boolean Initialized;
    private int kXK;
    private hqr kXL;
    private hoq<ROWTYPE> kXM;
    private int kXN;

    public hqa(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, hoq.c[] cArray, int[] nArray, hrd<ROWTYPE, String> hrd2, lbn lbn2) {
        super(hnc2, string, lgg2, lhf2, a2.kJH.jHw);
        this.kXF = a2;
        this.kmP = lbn2;
        this.kXG = hrd2;
        this.kXH = cArray;
        this.kXI = nArray;
        this.jCx = new hqw(hnc2, (String)null, lgg.rlI, lhf2, hpx.a.kXo, hqa.a(a2));
        this.j(this.jCx);
        this.kPK = new hnz(hnc2, null, lgg.rlI, new lhf(lhf2.rmN - a2.kXQ.kLY.rmN, lhf2.H), a2.kPT);
        this.jCx.j(this.kPK);
        lgs lgs2 = this.kPK.csU();
        this.kuQ = new hpe(hnc2, null, lgs2.aI(), lgs2.cqv(), a2.kXP, "");
        this.jCx.j(this.kuQ);
        this.jHT = new hno(this.kXG.p(ldb.rep));
    }

    public hqa(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, hoq.c c2, int n, hrd<ROWTYPE, String> hrd2, lbn lbn2) {
        this(hnc2, string, lgg2, lhf2, a2, new hoq.c[]{c2}, new int[]{n}, hrd2, lbn2);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.cwa();
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.cvZ();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    protected void csy() {
        if (this.kmP != null) {
            this.kmP.W();
        }
    }

    @Override
    protected void cce() {
        super.cce();
        assert (false);
        assert (false);
    }

    @Override
    protected void cvR() {
        this.jHT.Nw(this.kXN);
    }

    @Override
    protected void cvQ() {
    }

    @Override
    protected hms cvS() {
        int n = this.cwb();
        lgg lgg2 = new lgg(0, this.getHeight());
        lgg2 = this.kLu.kND.a((hms)this, lgg2);
        this.kXL = new hqr(this.kLu, null, lgg2, new lhf(n, this.kXK), this.kXF.jGK, hmk.a.kKY, hmk.a.kKZ);
        this.kXM = new hoq<ROWTYPE>(this.kLu, null, lgg.rlI, new lhf(n, 0), this.kXF.kXR, this.kXH, this.kXI, this.kXG, this.jHT);
        this.kXL.cwt().cqd().a(this.kXM);
        return this.kXL;
    }

    @Override
    protected void op(boolean bl) {
        if (bl) {
            this.kXN = this.jHT.csE();
        }
        this.jCx.on(bl);
        this.or(bl);
        super.op(bl);
        if (!bl) {
            this.kXM = null;
        }
    }

    @Override
    protected boolean cvT() {
        hqg hqg2 = this.kXL.cwt().c(ldb.rep);
        hms hms2 = this.kLu.crV();
        return hqg2 == null || hms2 == null || !hqg2.o(hms2);
    }

    private void cvY() {
        this.cvZ();
        if (this.Initialized) {
            this.csy();
        }
    }

    private void cvZ() {
        int n = this.jHT.csE();
        if (n == -1) {
            this.kuQ.mV("");
        } else {
            ROWTYPE ROWTYPE = this.kXG.LQ(n);
            String string = this.kXG.a(ROWTYPE, 0);
            this.kuQ.mV(string);
        }
    }

    private int csB() {
        return this.kXG.p(ldb.rep).getSize();
    }

    private void cwa() {
        int n = 0;
        for (hoq.c c2 : this.kXH) {
            n = Math.max(n, c2.kiK.jFE.kNb);
        }
        this.kXK = this.csB() * n * 2;
        if (this.kXK > this.kXF.kXS) {
            this.kXK = this.kXF.kXS;
        }
    }

    private static hqw.a a(a a2) {
        return new hqw.a(a2.kJH, new hqw.a.a[]{new hqw.a.a(new int[]{0, a2.kXQ.kLY.rmN}), new hqw.a.a(a2.kXQ.kLY.H)}, new lhv[][]{{new lhv(a2.jGJ.kPU), a2.kXQ}}, new lgg(0, 0));
    }

    private int cwb() {
        int n = 0;
        for (int n2 : this.kXI) {
            n += n2;
        }
        return n;
    }

    private void or(boolean bl) {
        assert (lda.yk(bl));
    }

    private void mU(boolean bl) {
        this.a(bl, this.kXB, 40, jpn.nLm);
        this.jHT.crt().a(bl, this.kXJ);
    }

    static /* synthetic */ void a(hqa hqa2) {
        hqa2.cvY();
    }
}

