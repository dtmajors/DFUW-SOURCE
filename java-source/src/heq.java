/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class heq
extends hen
implements lbr {
    private hgt kfJ;

    public heq(hdm hdm2, String string, lgg lgg2, lbn lbn2, boolean bl) {
        super(hdm2, string, lgg2, heq.b(hdm2, bl), bl ? hdm2.jXU : hdm2.jXV, new hnu.d(lbn2), new hen.e(true), new hlw.a(true), new hen.c(true));
        this.kfJ = new hgt(hdm2, null, lgg.rlI, heq.b(hdm2, bl), bl);
        this.w(this.kfJ);
    }

    public static final lhf b(hdm hdm2, boolean bl) {
        hen.f f2 = bl ? hdm2.jXU : hdm2.jXV;
        int n = hdm2.jZL.cde().getValue();
        hnz.d d2 = f2.keL.kKX.kPT;
        if (bl) {
            int n2 = d2.ctn() + hgt.koZ.rmN * n + d2.ctp();
            int n3 = d2.cto() + hgt.koZ.H + d2.ctq();
            return new lhf(n2, n3);
        }
        int n4 = d2.ctn() + hgt.koZ.rmN + d2.ctp();
        int n5 = d2.cto() + hgt.koZ.H * n + d2.ctq();
        return new lhf(n4, n5);
    }

    @Override
    public boolean a(lfu lfu2) {
        return this.kfJ.a(lfu2);
    }

    @Override
    public void FF() {
        super.FF();
        this.jP(0.6f);
    }
}

