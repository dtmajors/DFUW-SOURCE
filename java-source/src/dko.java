/*
 * Decompiled with CFR.
 */
public class dko
extends dkn {
    private lgl aXj = null;
    private lgl gEi = new lgl();
    private lgl gEj = new lgl();

    public lgl bnv() {
        return this.aXj;
    }

    public void A(lgl lgl2) {
        this.aXj = lgl2;
    }

    public lgl bnw() {
        return this.gEi;
    }

    public void B(lgl lgl2) {
        this.gEi = lgl2;
    }

    public lgl bnx() {
        return this.gEj;
    }

    public void C(lgl lgl2) {
        this.gEj = lgl2;
    }

    @Override
    public dkn bnu() {
        dko dko2 = new dko();
        this.a(dko2);
        return dko2;
    }

    @Override
    protected void a(dkn dkn2) {
        super.a(dkn2);
        dko dko2 = (dko)dkn2;
        dko2.A(new lgl(this.aXj));
    }
}

