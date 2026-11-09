/*
 * Decompiled with CFR.
 */
public class uc
extends uk {
    public lcq aWl = null;

    public uc() {
        super(11);
    }

    @Override
    public Object vC() {
        return this.aWl;
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        uc uc2 = (uc)uk2;
        uc2.aWl = new lcq(this.aWl);
    }
}

