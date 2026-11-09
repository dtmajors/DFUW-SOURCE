/*
 * Decompiled with CFR.
 */
public class um
extends uk {
    public lgl aXj = null;

    public um() {
        super(30);
    }

    @Override
    public Object vC() {
        return this.aXj == null ? null : new lgl(this.aXj);
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        um um2 = (um)uk2;
        if (this.aXj != null) {
            um2.aXj = new lgl(this.aXj);
        }
    }
}

