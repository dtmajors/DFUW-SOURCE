/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hlv
 */
public class hbq
extends hnv {
    private boolean Initialized;
    private boolean jDJ = true;
    private Object[] jAX;
    private lhf jDK = new lhf(240, 60);
    private lhf jDL = new lhf(0, 52);
    private lhf jDM = new lhf(24, 15);
    private final int jDN;

    public hbq(hbm hbm2, String string, lgg lgg2, Object[] objectArray, lhu lhu2) {
        super((hnc)((Object)hbm2), string, lgg2, new lhf(lhu2.kLY.rmN, hbm2.kND.cqv().H - 40), hbq.b(lhu2));
        this.jAX = objectArray;
        assert (this.jAX[0] instanceof Integer) : "First Value is not an integer!";
        this.jDN = (Integer)this.jAX[0];
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        lgg lgg2 = new lgg(8, 8);
        this.caS();
    }

    private void caS() {
        int n = this.jDK.rmN;
        int n2 = this.jDK.H;
        int n3 = this.jDL.H;
        int n4 = 140;
        int n5 = 32;
        Object object = new lhf(280, 50);
        Object object2 = new lgg(140, 12);
        Object object3 = new hpe(this.kLu, "", (lgg)object2, (lhf)object, ((hbm)((Object)this.kLu)).jBY, "Choose character appearance");
        this.j((hms)object3);
        object = cg.gV[this.jDN];
        object2 = hbo.jDp[this.jDN];
        this.a(n, n2, n4 + 30, n5, "Hair Color", new c(this, 1054), (String)object, (lhu)object2);
        object = cg.gU[this.jDN];
        object2 = hbo.jDo[this.jDN];
        this.a(n, n2 += n3, n4, n5, "Skin Tone", new c(this, 1053), (String)object, (lhu)object2);
        n2 += n3;
        for (int j = 0; j < this.jAX.length; ++j) {
            if (!(this.jAX[j] instanceof cq)) continue;
            object2 = (cq)this.jAX[j];
            object3 = new lgg(n, n2 - 5);
            Object object4 = new hpa(this.kLu, "", (lgg)object3, new lhf(256, 64), hbo.jDv);
            this.j((hms)object4);
            object3 = new lhf(180, 50);
            object4 = new lgg(n, n2);
            hpe hpe2 = new hpe(this.kLu, "", (lgg)object4, (lhf)object3, ((hbm)((Object)this.kLu)).jBW, ((cq)object2).getDisplayName());
            this.j(hpe2);
            object3 = new a(this, ((cq)object2).ch(), false, ((cq)object2).ck());
            object4 = new a(this, ((cq)object2).ci(), true, ((cq)object2).ck());
            int n6 = ((cq)object2).getSelectionCount();
            int n7 = ((cq)object2).cj();
            lgs lgs2 = new lgs(n + this.jDM.rmN, n2 + this.jDM.H, n4, n5);
            hbk hbk2 = new hbk(this.caP(), lgs2, (lbn)object3, (lbn)object4, this.ch(n7, n6), false);
            ((a)object3).a(hbk2);
            ((a)object4).a(hbk2);
            hbk2.LC(n7);
            hbk2.LD(n6);
            this.j(hbk2);
            n2 += n3;
        }
        if (this.jAX.length == 1) {
            lhf lhf2 = new lhf(200, 50);
            object2 = new lgg(230, n2);
            object3 = new hpe(this.kLu, "", (lgg)object2, lhf2, ((hbm)((Object)this.kLu)).jBV, lcx.qQK.esy());
            this.j((hms)object3);
        }
        hbf hbf2 = ((hbm)((Object)this.kLu)).I(4, true);
        this.cbo().jCr.j(hbf2);
        hbf2.mV(this.jDJ);
        ((hbm)((Object)this.kLu)).cbc();
    }

    private String ch(int n, int n2) {
        String string = "" + (n + 1) + " " + lcx.qRz.esy() + " " + (n2 + 1);
        return string;
    }

    private void a(int n, int n2, int n3, int n4, String string, c c2, String string2, lhu lhu2) {
        Object object = new lgg(n, n2 - 5);
        Object object2 = new hpa(this.kLu, "", (lgg)object, new lhf(256, 64), hbo.jDv);
        this.j((hms)object2);
        object = new lhf(180, 50);
        object2 = new lgg(n, n2);
        hms hms2 = new hpe(this.kLu, "", (lgg)object2, (lhf)object, ((hbm)((Object)this.kLu)).jBW, string);
        this.j(hms2);
        object = new lgs(n + this.jDM.rmN, n2 + this.jDM.H + 5, n3, n4);
        object2 = new hqi.a(new hqh.b(((hbm)((Object)this.kLu)).jHw, ldb.reo, this.cbo().kIn.kEj, lhu2, this.cbo().kIn.kEl, lcq.COLORSHIFT_NEUTRAL, this.cbo().kIn.kEn, this.cbo().kIn.kEo), hlv.I((String)string2));
        hms2 = new hqi(this.kLu, "", ((lgs)object).aI(), new lhf(144, 16), (hqi.a)object2, new lcq(0.5f, 0.5f, 0.5f, 1.0f), c2);
        c2.a((hqi)hms2);
        this.j(hms2);
    }

    protected final hbm cbo() {
        return (hbm)((Object)this.kLu);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        super.FG();
        this.Initialized = false;
    }

    private hbm caP() {
        return (hbm)((Object)this.kLu);
    }

    private static hnv.a b(lhu lhu2) {
        return new hnv.a(lhu2, lcq.COLORSHIFT_NEUTRAL);
    }

    public boolean cbp() {
        return this.jDJ;
    }

    public void mX(boolean bl) {
        this.jDJ = bl;
    }

    static /* synthetic */ String a(hbq hbq2, int n, int n2) {
        return hbq2.ch(n, n2);
    }

    static /* synthetic */ hbm a(hbq hbq2) {
        return hbq2.caP();
    }
}

