/*
 * Decompiled with CFR.
 */
public class uq
extends uk {
    public ljq Qi = null;

    public uq() {
        super(39);
    }

    @Override
    public Object vC() {
        return new ljq(this.Qi);
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        uq uq2 = (uq)uk2;
        uq2.Qi = new ljq(this.Qi);
    }
}

