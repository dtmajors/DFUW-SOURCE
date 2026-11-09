/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hln
extends hdj {
    public final hdm dXw;
    public final hjy kvQ;
    private boolean kCX = false;
    private final lbn kBX = new lbn(this){
        final /* synthetic */ hln kCY;
        {
            this.kCY = hln2;
        }

        public final void W() {
            this.kCY.ne(false);
        }
    };

    public hln(hdm hdm2) {
        super(hdm2, null, "TELEPORTATION", 500, null);
        this.dXw = hdm2;
        this.kvQ = ((hec)this.dXw.jWV).kcw;
    }

    public void Nc(int n) {
        if (!this.kCX) {
            this.kCX = true;
            this.kvQ.Nb(n);
        }
        this.closeWindow();
    }

    @Override
    protected void nf(boolean bl) {
        if (bl) {
            this.kCX = false;
        } else if (!this.kCX) {
            this.kCX = true;
            this.kvQ.Nb(-1);
        }
        super.nf(bl);
    }

    @Override
    protected hen cdl() {
        hen.f f2 = this.jLM.jXJ;
        hen hen2 = new hen(this.jLM, (String)null, lgg.rlI, lhf.rnv, f2, new hen.d(lcy.qYF), new hnu.d(this.kBX), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hit hit2 = new hit(this.dXw, null);
        hen2.w(hit2);
        lhf lhf2 = hit2.cqv();
        lhf2 = lhf2.p(hen2.cfF().keL.kKX.kPT.ctr());
        hen2.d(lhf2);
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUB, lhf2);
        hen2.z(lgg2);
        return hen2;
    }
}

