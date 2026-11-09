/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.ArrayList;

public final class hlb
extends hkz {
    private final a[] kCK;
    public lbn kCH = new lbn(this){
        final /* synthetic */ hlb kCL;
        {
            this.kCL = hlb2;
        }

        public final void W() {
            this.kCL.cpj().cfZ();
        }
    };

    public hlb(hdm hdm2) {
        this(hdm2, hlb.o(hdm2));
    }

    private hlb(hdm hdm2, a[] aArray) {
        super(hdm2, null, "WORLDMAP", 286, joj.nIJ, hlb.a(aArray));
        this.kCK = aArray;
        this.nb(true);
    }

    @Override
    protected void cbg() {
        this.nb(false);
        super.cbg();
    }

    @Override
    protected hen cdl() {
        lhf lhf2 = hlb.n(this.jLM);
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUr, lhf2);
        a a2 = this.kCK[this.kCy.getValue()];
        heu heu2 = new heu(this.jLM, (String)null, lgg2, lhf2, hlb.n(this.jLM), new hdj.a(this), this.hasAttribute(256), this.kCH, this.a(a2));
        hhe hhe2 = new hhe(this.jLM, null, lgg.rlI, lhf2.q(heu2.cfF().keL.kKX.kPT.ctr()), a2.daN, a2.kqB, this.kCy);
        heu2.w(hhe2);
        return heu2;
    }

    @Override
    protected void nP(boolean bl) {
        if (this.cdi()) {
            lgg lgg2;
            a a2 = this.kCK[this.kCy.getValue()];
            hen hen2 = this.cdh();
            hhc hhc2 = (hhc)hen2.csT();
            hen2.f(this.a(a2));
            lgg lgg3 = hhc2.cqE().cfx();
            if (bl && hhc2.A(lgg2 = hhc2.cqu())) {
                lgg3 = lgg2;
            }
            hhc2.a(a2.daN, a2.kqB, lgg3);
        }
    }

    private static lhf n(hdm hdm2) {
        lhf lhf2 = ((lhu)hdm2.jXk.jWr.fM((int)0, (int)0)).kLY;
        lhf2 = lhf2.p(hdm2.jXO.keL.kKX.kPT.ctr());
        return lhf2;
    }

    private lip a(a a2) {
        lip lip2 = lcy.qYt.a(a2.kbJ);
        return lip2;
    }

    private static a[] o(hdm hdm2) {
        b[] bArray = new b[]{new b(1.0f, hdm2.jXk.jWr), new b(1.1f, hdm2.jXk.jWr), new b(1.2f, hdm2.jXk.jWr), new b(1.3f, hdm2.jXk.jWr), new b(1.4f, hdm2.jXk.jWr), new b(1.5f, hdm2.jXk.jWr), new b(0.8f, hdm2.jXk.jWs), new b(0.9f, hdm2.jXk.jWs), new b(1.0f, hdm2.jXk.jWs), new b(1.1f, hdm2.jXk.jWs), new b(1.2f, hdm2.jXk.jWs), new b(1.3f, hdm2.jXk.jWs), new b(1.4f, hdm2.jXk.jWs), new b(1.5f, hdm2.jXk.jWs), new b(0.8f, hdm2.jXk.jWt), new b(0.9f, hdm2.jXk.jWt), new b(1.0f, hdm2.jXk.jWt), new b(1.1f, hdm2.jXk.jWt), new b(1.2f, hdm2.jXk.jWt), new b(1.3f, hdm2.jXk.jWt), new b(1.4f, hdm2.jXk.jWt), new b(1.5f, hdm2.jXk.jWt), new b(0.8f, hdm2.jXk.jWu), new b(0.9f, hdm2.jXk.jWu), new b(1.0f, hdm2.jXk.jWu), new b(1.1f, hdm2.jXk.jWu), new b(1.2f, hdm2.jXk.jWu), new b(1.3f, hdm2.jXk.jWu), new b(1.4f, hdm2.jXk.jWu), new b(1.5f, hdm2.jXk.jWu), new b(0.8f, hdm2.jXk.jWv), new b(0.9f, hdm2.jXk.jWv), new b(1.0f, hdm2.jXk.jWv), new b(1.1f, hdm2.jXk.jWv), new b(1.2f, hdm2.jXk.jWv), new b(1.3f, hdm2.jXk.jWv), new b(1.4f, hdm2.jXk.jWv), new b(1.5f, hdm2.jXk.jWv), new b(1.6f, hdm2.jXk.jWv), new b(1.7f, hdm2.jXk.jWv), new b(1.8f, hdm2.jXk.jWv), new b(1.9f, hdm2.jXk.jWv), new b(2.0f, hdm2.jXk.jWv), new b(2.1f, hdm2.jXk.jWv), new b(2.2f, hdm2.jXk.jWv), new b(2.3f, hdm2.jXk.jWv), new b(2.4f, hdm2.jXk.jWv), new b(2.5f, hdm2.jXk.jWv), new b(2.6f, hdm2.jXk.jWv), new b(2.7f, hdm2.jXk.jWv), new b(2.8f, hdm2.jXk.jWv), new b(2.9f, hdm2.jXk.jWv), new b(3.0f, hdm2.jXk.jWv)};
        float f2 = bArray[0].cpk();
        float f3 = bArray[bArray.length - 1].cpk();
        float f4 = 1.0f;
        float f5 = f3 / f2;
        ArrayList<a> arrayList = new ArrayList<a>();
        for (int i = 0; i < bArray.length; ++i) {
            b b2 = bArray[i];
            float f6 = b2.cpk();
            float f7 = (f6 - f2) / (f3 - f2);
            assert (f7 >= 0.0f && f7 <= 1.0f);
            float f8 = f4 + (f5 - f4) * f7;
            ljc ljc2 = new ljc(f8);
            arrayList.add(new a(hdm2.jXk.a(b2.kqB), ljc2, b2.daN, b2.kqB));
        }
        a[] aArray = new a[arrayList.size()];
        return arrayList.toArray(aArray);
    }

    private static lnt a(a[] aArray) {
        lnu.a a2 = new lnu.a(0, aArray.length - 1, 1);
        lnu lnu2 = a2.ewm();
        lnu2.adI(hlb.b(aArray));
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
        this.jLM.cbP().kzI.a(bl, joj.nIN, this.kCB);
        this.jLM.cbP().kzI.a(bl, joj.nIO, this.kCC);
    }
}

