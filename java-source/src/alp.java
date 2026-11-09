/*
 * Decompiled with CFR.
 */
public class alp
extends alq {
    private ep.a PQ = null;

    public ep.a gk() {
        return this.PQ;
    }

    public void a(ep.a a2) {
        assert (a2 != null);
        this.PQ = a2;
    }

    @Override
    protected void g(alt alt2) {
        super.g(alt2);
        alp alp2 = (alp)alt2;
        alp2.a(this.PQ);
    }
}

