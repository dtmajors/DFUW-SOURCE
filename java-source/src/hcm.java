/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;

public class hcm
extends how {
    private static lhf jGE = new lhf(4, 4);
    private static lhf jBh = new lhf(64, 28);
    private final a jGF;
    private final hpx jGG;
    private final hqr jGH;
    private final hpp jGI;
    private boolean Initialized;

    public hcm(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, lbn lbn2, lmw lmw2) {
        super(hnc2, string, lgg2, lhf2, a2.jGJ);
        this.jGF = a2;
        int n = hcm.jGE.rmN;
        int n2 = hcm.jGE.H;
        this.G(new lgg(n + 1, n2 + 1));
        this.jGH = new hqr(this.kLu, (String)null, new lgg(n, n2), new lhf(lhf2.rmN - hcm.jGE.rmN - n, lhf2.H - hcm.jGE.H - hcm.jBh.H - hcm.jGE.H - n2), this.jGF.jGK);
        this.j(this.jGH);
        this.p(this.jGH);
        n2 += this.jGH.getHeight();
        this.jGI = new hpp(this.kLu, (String)null, lgg.rlI, lhf.rnv, hcm.a(this.jGF), false, lmw2);
        this.jGH.cwt().cqd().a(this.jGI);
        n = lhf2.rmN - hcm.jGE.rmN;
        this.jGG = new hqy(this.kLu, null, new lgg(n -= hcm.jBh.rmN, n2 += hcm.jGE.H), jBh, hpx.a.kXm, this.jGF.jGM, "Close");
        this.jGG.cvC().a(true, lbn2);
        this.j(this.jGG);
        n -= hcm.jGE.rmN;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        hni hni2 = (hni)this.jGI.cvj();
        if (hni2 != null) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            String string = hni2.iNF == null ? "null" : hni2.iNF.dPf();
            linkedList.add(new hnt(this.jGF.jGV, string));
            this.kLu.a(null, linkedList);
            return;
        }
        super.ccc();
    }

    @Override
    protected void ccd() {
        this.jGI.refresh();
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        int n = this.jGH.cwt().cqd().cpJ().rmN;
        int n2 = this.jGI.ctv();
        n = Math.max(n, n2);
        this.jGI.d(new lhf(n, this.jGI.getHeight()));
    }

    private static final hpp.b a(a a2) {
        return new hpp.b(a2.jGL, a2.jGN, a2.jGO, a2.jGP, a2.jGQ, a2.jGR, a2.jGW, a2.jGX, a2.jGY, a2.jGZ);
    }

    private void mU(boolean bl) {
        lda.yk(bl);
    }
}

