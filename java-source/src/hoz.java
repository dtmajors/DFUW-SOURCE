/*
 * Decompiled with CFR.
 */
public class hoz
extends hog {
    private final a[] kaA;
    private final hpx[] kTD;
    private final a kTE;
    private final a kTF;
    private final String kTG;
    private final c kTH;
    private final boolean kTI;
    private final hqt ksG;
    private final Object jKg;
    private final lbn kTJ;
    private final lbn kTK = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoz kTQ;
        {
            this.kTQ = hoz2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoz.a(this.kTQ)) {
                throw new AssertionError();
            }
            hoz.a(this.kTQ, hoz.b(this.kTQ)[0]);
        }

        static {
            $assertionsDisabled = !hoz.class.desiredAssertionStatus();
        }
    };
    private final lbn kTL = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoz kTQ;
        {
            this.kTQ = hoz2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoz.a(this.kTQ)) {
                throw new AssertionError();
            }
            hoz.a(this.kTQ, hoz.b(this.kTQ)[1]);
        }

        static {
            $assertionsDisabled = !hoz.class.desiredAssertionStatus();
        }
    };
    private final lbn kTM = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoz kTQ;
        {
            this.kTQ = hoz2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoz.a(this.kTQ)) {
                throw new AssertionError();
            }
            hoz.a(this.kTQ, hoz.b(this.kTQ)[2]);
        }

        static {
            $assertionsDisabled = !hoz.class.desiredAssertionStatus();
        }
    };
    private final lbn ksN = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoz kTQ;
        {
            this.kTQ = hoz2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hoz.a(this.kTQ)) {
                throw new AssertionError();
            }
            hoz.a(this.kTQ, !hoz.c(this.kTQ));
            hoz.d(this.kTQ).on(hoz.c(this.kTQ));
            for (int i = 0; i < hoz.b(this.kTQ).length; ++i) {
                if (!hoz.b((hoz)this.kTQ)[i].kTR) continue;
                hoz.e(this.kTQ)[i].og(hoz.c(this.kTQ));
            }
        }

        static {
            $assertionsDisabled = !hoz.class.desiredAssertionStatus();
        }
    };
    private final lbp kkZ = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoz kTQ;
        {
            this.kTQ = hoz2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hoz.a(this.kTQ)) {
                throw new AssertionError();
            }
            this.kTQ.accept();
            return true;
        }

        static {
            $assertionsDisabled = !hoz.class.desiredAssertionStatus();
        }
    };
    private final lbp khJ = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hoz kTQ;
        {
            this.kTQ = hoz2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hoz.a(this.kTQ)) {
                throw new AssertionError();
            }
            this.kTQ.cancel();
            return true;
        }

        static {
            $assertionsDisabled = !hoz.class.desiredAssertionStatus();
        }
    };
    private final lbn[] kTN = new lbn[]{this.kTK, this.kTL, this.kTM};
    private boolean Initialized;
    private boolean kTO;
    private a kTP;

    public static lhf a(hnc hnc2, String string, String string2, c c2, a[] aArray, String string3, int n) {
        return hoz.b((hnc)hnc2, (String)string, (String)string2, (c)c2, (a[])aArray, (String)string3, (int)n).kLY;
    }

    public hoz(hnc hnc2, String string, lgg lgg2, c c2, String string2, String string3, a[] aArray, String string4, boolean bl, Object object, a a2, a a3, lbn lbn2, int n) {
        this(hnc2, string, lgg2, c2, hoz.b(hnc2, string2, string3, c2, aArray, string4, n), string2, string3, aArray, string4, bl, object, a2, a3, lbn2);
    }

    private hoz(hnc hnc2, String string, lgg lgg2, c c2, b b2, String string2, String string3, a[] aArray, String string4, boolean bl, Object object, a a2, a a3, lbn lbn2) {
        super(hnc2, string, lgg2, b2.kLY, c2.krh);
        hpe hpe2;
        assert (aArray != null);
        this.kTG = string4;
        this.kTH = c2;
        this.kaA = aArray;
        this.kTE = a2;
        this.kTF = a3;
        this.kTJ = lbn2;
        this.jKg = object;
        this.kTI = bl;
        if (b2.kTS.rmN != 0) {
            hpe2 = new hpe(hnc2, null, b2.kTS.aI(), b2.kTS.cqv(), this.kTH.kUb, string2);
            this.j(hpe2);
        }
        if (b2.kTT.rmN != 0) {
            hpe2 = new hpe(hnc2, null, b2.kTT.aI(), b2.kTT.cqv(), this.kTH.kuW, string3);
            this.j(hpe2);
        }
        this.kTD = new hpx[this.kaA.length];
        for (int i = 0; i < this.kaA.length; ++i) {
            this.kTD[i] = new hqy(hnc2, null, b2.kTY[i].aI(), b2.kTY[i].cqv(), hpx.a.kXm, this.kTH.jGM, this.kaA[i].kbN.esy());
            this.kTD[i].cvC().a(true, this.kTN[i]);
            this.j(this.kTD[i]);
        }
        if (this.kTG != null) {
            this.ksG = new hqt(hnc2, (String)null, b2.kTZ.aI(), b2.kTZ.cqv(), this.kTH.kJI, this.kTG);
            this.ksG.cvC().a(true, this.ksN);
            this.j(this.ksG);
            this.ksG.on(this.kTI);
        } else {
            this.ksG = null;
        }
    }

    public final boolean cuF() {
        return this.kTO;
    }

    public final Object ccw() {
        return this.jKg;
    }

    public final a coZ() {
        return this.kTP;
    }

    public final void accept() {
        assert (this.Initialized);
        this.a(this.kTE);
    }

    public final void cancel() {
        assert (this.Initialized);
        this.a(this.kTF);
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
        this.Initialized = false;
        super.FG();
    }

    protected final hnu cir() {
        return (hnu)this.cqt();
    }

    private static b b(hnc hnc2, String string, String string2, c c2, a[] aArray, String string3, int n) {
        lgs lgs2;
        lgs lgs3;
        int n2;
        int n3;
        lhf lhf2;
        int n4 = c2.jGM.cwv().H;
        int n5 = c2.jGM.cwv().rmN / 2;
        lhf lhf3 = string == null ? lhf.rnv : hnc2.b(c2.kUb.jFE, string);
        lhf lhf4 = lhf2 = string2 == null ? lhf.rnv : hnc2.b(c2.kuW.jFE, string2);
        if (lhf3.rmN > n || lhf2.rmN > n) {
            n3 = hnc2.a(c2.kUb.jFE, string, true, n, true);
            lhf3 = new lhf(n, n3);
            n3 = hnc2.a(c2.kuW.jFE, string2, true, n, true);
            lhf2 = new lhf(n, n3);
        }
        n3 = 0;
        int n6 = c2.kUa.H;
        int[] nArray = new int[aArray.length];
        for (int i = 0; i < aArray.length; ++i) {
            if (i > 0) {
                n3 += n5;
            }
            lhf lhf5 = hnc2.a(c2.jGM.kiK.jFE, aArray[i].kbN.esy());
            lhf lhf6 = c2.jGM.h(lhf5);
            nArray[i] = Math.max(c2.kUa.rmN, lhf6.rmN);
            n3 += nArray[i];
            n6 = Math.max(n6, lhf6.H);
        }
        lhf lhf7 = null;
        if (string3 != null) {
            lhf7 = hqt.a(hnc2, c2.kJI, string3);
        }
        if (n3 > (n2 = Math.max(lhf3.rmN, lhf2.rmN))) {
            n2 = n3;
        }
        if (lhf7 != null && lhf7.rmN > n2) {
            n2 = lhf7.rmN;
        }
        int n7 = n5;
        int n8 = n4;
        if (lhf3.rmN == 0) {
            lgs3 = new lgs();
        } else {
            lgs3 = new lgs(n7, n8, n2, lhf3.H);
            n8 += lhf3.H;
            n8 += n4;
        }
        if (lhf2.rmN == 0) {
            lgs2 = new lgs();
        } else {
            lgs2 = new lgs(n7, n8, n2, lhf2.H);
            n8 += lhf2.H;
            n8 += n4;
        }
        n7 = n5 + (n2 - n3) / 2;
        lgs[] lgsArray = new lgs[aArray.length];
        for (int i = 0; i < aArray.length; ++i) {
            if (i > 0) {
                n7 += n5;
            }
            lgsArray[i] = new lgs(n7, n8, nArray[i], n6);
            n7 += nArray[i];
        }
        n8 += n6;
        n8 += n4;
        lgs lgs4 = null;
        if (lhf7 != null) {
            n7 = n5 + (n2 - lhf7.rmN) / 2;
            lgs4 = new lgs(n7, n8, lhf7);
            n8 += lhf7.H;
            n8 += n4;
        }
        lhf lhf8 = new lhf(n5 + n2 + n5, n8);
        return new b(lhf8, lgs3, lgs2, n4, lhf2, lhf7, n5, lgsArray, lgs4);
    }

    private void a(a a2) {
        this.kTP = a2;
        this.kTJ.W();
    }

    private void mU(boolean bl) {
        this.a(bl, this.kkZ, 13, jpn.nLm);
        this.a(bl, this.khJ, 27, jpn.nLm);
    }

    static /* synthetic */ boolean a(hoz hoz2) {
        return hoz2.Initialized;
    }

    static /* synthetic */ a[] b(hoz hoz2) {
        return hoz2.kaA;
    }

    static /* synthetic */ void a(hoz hoz2, a a2) {
        hoz2.a(a2);
    }

    static /* synthetic */ boolean a(hoz hoz2, boolean bl) {
        hoz2.kTO = bl;
        return hoz2.kTO;
    }

    static /* synthetic */ boolean c(hoz hoz2) {
        return hoz2.kTO;
    }

    static /* synthetic */ hqt d(hoz hoz2) {
        return hoz2.ksG;
    }

    static /* synthetic */ hpx[] e(hoz hoz2) {
        return hoz2.kTD;
    }
}

