/*
 * Decompiled with CFR.
 */
public class dkp
extends dkn {
    private ljq Qi = null;
    private ljq gEk = new ljq();
    private ljq gEl = new ljq();

    public ljq bny() {
        return this.Qi;
    }

    public void aO(ljq ljq2) {
        this.Qi = ljq2;
    }

    public ljq bnz() {
        return this.gEk;
    }

    public void bU(ljq ljq2) {
        this.gEk = ljq2;
    }

    public ljq bnA() {
        return this.gEl;
    }

    public void bV(ljq ljq2) {
        this.gEl = ljq2;
    }

    @Override
    public dkn bnu() {
        dkp dkp2 = new dkp();
        this.a(dkp2);
        return dkp2;
    }

    @Override
    protected void a(dkn dkn2) {
        super.a(dkn2);
        dkp dkp2 = (dkp)dkn2;
        dkp2.aO(new ljq(this.Qi));
    }
}

