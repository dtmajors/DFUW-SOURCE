/*
 * Decompiled with CFR.
 */
public class ub
extends uk {
    public lco aWk = null;

    public ub() {
        super(10);
    }

    @Override
    public Object vC() {
        return new lco(this.aWk);
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        ub ub2 = (ub)uk2;
        ub2.aWk = new lco(this.aWk);
    }
}

