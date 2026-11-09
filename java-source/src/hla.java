/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 *  lcy
 */
public final class hla
extends hkz {
    private static final int kqI = hhg.kqI;
    private final a[] kCG;
    public lbn kCH = new lbn(this){
        final /* synthetic */ hla kCI;
        {
            this.kCI = hla2;
        }

        public final void W() {
            this.kCI.cpj().cfZ();
        }
    };

    public hla(hdm hdm2) {
        this(hdm2, hla.m(hdm2));
    }

    private hla(hdm hdm2, a[] aArray) {
        super(hdm2, null, "MINIMAP", 319, joj.nIB, hla.a(aArray));
        this.kCG = aArray;
        this.nb(true);
    }

    @Override
    protected void cbg() {
        this.nb(false);
        super.cbg();
    }

    @Override
    protected hen cdl() {
        lhf lhf2 = this.jLM.jXk.jPr;
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUs, lhf2);
        a a2 = this.kCG[this.kCy.getValue()];
        het het2 = new het(this.jLM, (String)null, lgg2, lhf2, new hdj.a(this), this.hasAttribute(256), this.kCH, this.a(a2));
        hhd hhd2 = new hhd(this.jLM, null, lgg.rlI, lhf2.q(het2.cfF().keL.kKX.kPT.ctr()), a2.daN, a2.kCJ);
        het2.w(hhd2);
        return het2;
    }

    @Override
    protected void nP(boolean bl) {
        if (this.cdi()) {
            a a2 = this.kCG[this.kCy.getValue()];
            hen hen2 = this.cdh();
            hhc hhc2 = (hhc)hen2.csT();
            hen2.f(this.a(a2));
            hhc2.a(a2.daN, a2.kCJ, null);
        }
    }

    private final lip a(a a2) {
        lip lip2 = lcy.qYo.a(a2.kbJ);
        return lip2;
    }

    private static a[] m(hdm hdm2) {
        int n = kqI + lcw.fyk.rmN + kqI;
        int n2 = kqI + lcw.fyk.H + kqI;
        lax<lhu> lax2 = new lax<lhu>(n2, n);
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                lhu lhu2 = hla.a(hdm2, j, i);
                lax2.a(i, j, lhu2);
            }
        }
        return new a[]{hla.a(0.6f, lax2), hla.a(0.65f, lax2), hla.a(0.7f, lax2), hla.a(0.75f, lax2), hla.a(0.8f, lax2), hla.a(0.85f, lax2), hla.a(0.9f, lax2), hla.a(1.0f, lax2), hla.a(1.1f, lax2), hla.a(1.2f, lax2), hla.a(1.3f, lax2), hla.a(1.4f, lax2), hla.a(1.6f, lax2), hla.a(1.8f, lax2), hla.a(2.0f, lax2), hla.a(2.25f, lax2), hla.a(2.5f, lax2), hla.a(2.75f, lax2), hla.a(3.0f, lax2)};
    }

    private static a a(float f2, lax<lhu> lax2) {
        return new a(new lje(f2), f2, lax2);
    }

    private static lhu a(hdm hdm2, int n, int n2) {
        if (n < kqI || n >= kqI + lcw.fyk.rmN || n2 < kqI || n2 >= kqI + lcw.fyk.H) {
            if (n == kqI - 1) {
                if (n2 == kqI - 1) {
                    return hdm2.jXk.jPY;
                }
                if (n2 == kqI + lcw.fyk.H) {
                    return hdm2.jXk.jPT;
                }
                if (n2 >= kqI && n2 < kqI + lcw.fyk.H) {
                    return hdm2.jXk.jPV;
                }
            } else if (n == kqI + lcw.fyk.rmN) {
                if (n2 == kqI - 1) {
                    return hdm2.jXk.jPW;
                }
                if (n2 == kqI + lcw.fyk.H) {
                    return hdm2.jXk.jPR;
                }
                if (n2 >= kqI && n2 < kqI + lcw.fyk.H) {
                    return hdm2.jXk.jPU;
                }
            } else if (n >= kqI && n < kqI + lcw.fyk.rmN) {
                if (n2 == kqI - 1) {
                    return hdm2.jXk.jPX;
                }
                if (n2 == kqI + lcw.fyk.H) {
                    return hdm2.jXk.jPS;
                }
            }
            return hdm2.jXk.jPZ;
        }
        return (lhu)hdm2.jXk.jWw.fM(n2 -= kqI, n -= kqI);
    }

    private static lnt a(a[] aArray) {
        lnu.a a2 = new lnu.a(0, aArray.length - 1, 1);
        lnu lnu2 = a2.ewm();
        lnu2.adI(hla.b(aArray));
        return lnu2;
    }

    private static int b(a[] aArray) {
        for (int i = 0; i < aArray.length; ++i) {
            if (aArray[i].daN != 1.0f) continue;
            return i;
        }
        return -1;
    }

    private void nb(boolean bl) {
        this.jLM.cbP().kzI.a(bl, joj.nIL, this.kCB);
        this.jLM.cbP().kzI.a(bl, joj.nIM, this.kCC);
    }
}

