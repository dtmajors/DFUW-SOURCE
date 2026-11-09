/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hlv
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class heo
extends hlw {
    private static lhf jGE = new lhf(4, 4);
    private static lhf jBh = new lhf(64, 28);
    private final b keP;
    private final how keQ;
    private final hpx keR;
    private final hpx jGG;
    private final hqr jGH;
    private final hpo keS;
    private boolean Initialized;
    private hms keT;
    private hnu keU;
    private hnu keV;
    private final lbp jAY = new lbp(this){
        final /* synthetic */ heo keZ;
        {
            this.keZ = heo2;
        }

        public final boolean caU() {
            this.keZ.csQ();
            return true;
        }
    };
    private final lbn keW = new lbn(this){
        final /* synthetic */ heo keZ;
        {
            this.keZ = heo2;
        }

        public final void W() {
            this.keZ.refresh();
        }
    };
    private final lbn keX = new lbn(this){
        final /* synthetic */ heo keZ;
        {
            this.keZ = heo2;
        }

        public final void W() {
            this.keZ.csQ();
        }
    };
    private final lbn keY = new lbn(this){
        final /* synthetic */ heo keZ;
        {
            this.keZ = heo2;
        }

        public final void W() {
            heo.a(this.keZ);
        }
    };

    public heo(hlv hlv2, String string, lgg lgg2, lhf lhf2, b b2, lbn lbn2) {
        super(hlv2, string, lgg2, lhf2, b2.keL, new hnu.e(new lhf(200, 100), new lhf(800, 600)), new hnu.d(lbn2));
        this.keP = b2;
        lhf lhf3 = lhf2.q(b2.keL.kKX.kPT.ctr());
        this.keQ = new how(this.kLu, null, lgg.rlI, lhf3, this.keP.jGJ);
        this.w(this.keQ);
        int n = heo.jGE.rmN;
        int n2 = heo.jGE.H;
        this.keQ.G(new lgg(n + 1, n2 + 1));
        this.jGH = new hqr(this.kLu, (String)null, new lgg(n, n2), new lhf(lhf3.rmN - heo.jGE.rmN - n, lhf3.H - heo.jGE.H - heo.jBh.H - heo.jGE.H - n2), this.keP.jGK);
        this.keQ.j(this.jGH);
        n2 += this.jGH.getHeight();
        this.keS = new hpo(this.kLu, (String)null, lgg.rlI, lhf.rnv, heo.a(this.keP), new lij<hms>());
        this.jGH.cwt().cqd().a(this.keS);
        n = lhf3.rmN - heo.jGE.rmN;
        this.jGG = new hqy(this.kLu, null, new lgg(n -= heo.jBh.rmN, n2 += heo.jGE.H), jBh, hpx.a.kXm, this.keP.jGM, "Close");
        this.jGG.cvC().a(true, this.keX);
        this.keQ.j(this.jGG);
        n -= heo.jGE.rmN;
        this.keR = new hqy(this.kLu, null, new lgg(n -= heo.jBh.rmN, n2), jBh, hpx.a.kXm, this.keP.jGM, "Refresh");
        this.keR.cvC().a(true, this.keW);
        this.keQ.j(this.keR);
        n -= heo.jGE.rmN;
    }

    public final void refresh() {
        this.keS.cvk();
        hob hob2 = this.kLu.kND;
        hms hms2 = hob2.b(hob2.cqu(), hms.class);
        this.keS.b(null, hob2);
        if (hms2 != null) {
            this.keS.G(hms2);
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.keU != null) {
            this.keU.remove();
            this.keU = null;
        }
        if (this.keV != null) {
            this.keV.remove();
            this.keV = null;
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        this.cfQ();
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        hms hms2 = (hms)this.keS.cvj();
        if (hms2 != null) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            String string = hms2.toString();
            linkedList.add(new hnt(this.keP.jGV, string));
            ArrayList<lfg> arrayList = new ArrayList<lfg>();
            hms2.bc(arrayList);
            for (lfg lfg2 : arrayList) {
                linkedList.add(new hnt(this.keP.jGU, lfg2.Name + ": " + lfg2.Value));
            }
            this.kLu.a(null, linkedList);
            return;
        }
        super.ccc();
    }

    private static final hpo.b a(b b2) {
        return new hpo.b(b2.jGL, b2.jGN, b2.jGO, b2.jGP, b2.jGQ, b2.jGR);
    }

    private hms cfP() {
        if (this.isFocusOwner()) {
            return (hms)this.keS.getSelectedItem();
        }
        return null;
    }

    private void cfQ() {
        hms hms2 = this.cfP();
        if (hms2 == this.keT) {
            return;
        }
        if (this.keU != null) {
            this.keU.remove();
            this.keU = null;
        }
        if (this.keV != null) {
            this.keV.remove();
            this.keV = null;
        }
        this.keT = hms2;
        if (this.keT != null) {
            lgs lgs2 = this.kLu.kND.a(this.keT, this.keT.cqE());
            this.keU = this.a((String)null, lgs2, this.keP.kfe, this.keP.kff);
            lgs2 = this.kLu.kND.a(this.keT, this.keT.cqU());
            this.keV = this.a((String)null, lgs2, this.keP.kfg, this.keP.kfh);
            this.cqF();
        }
    }

    private a a(String string, lgs lgs2, hnu.f f2, lcq lcq2) {
        int n = lgs2.rmN;
        int n2 = lgs2.H;
        lhf lhf2 = f2.kPT.cts();
        if (n < lhf2.rmN) {
            n = lhf2.rmN;
        }
        if (n2 < lhf2.H) {
            n2 = lhf2.H;
        }
        a a2 = new a(this.kLu, string, lgs2.aI(), new lhf(n, n2), f2, lcq2);
        this.cqT().j(a2);
        return a2;
    }

    private void mU(boolean bl) {
        this.a(bl, this.jAY, 27, jpn.nLm);
        this.keS.jHT.crt().a(bl, this.keY);
    }

    static /* synthetic */ void a(heo heo2) {
        heo2.cfQ();
    }
}

