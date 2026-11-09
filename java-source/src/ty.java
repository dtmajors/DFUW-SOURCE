/*
 * Decompiled with CFR.
 */
public class ty
extends uk {
    public tx[] aWi = null;

    public ty() {
        super(1);
    }

    @Override
    public Object vC() {
        return this.aWi;
    }

    @Override
    protected void b(uk uk2) {
        assert (this.aWi != null);
        super.b(uk2);
        ty ty2 = (ty)uk2;
        tx[] txArray = new tx[this.aWi.length];
        int n = this.aWi.length;
        for (int i = 0; i < n; ++i) {
            txArray[i] = this.aWi[i].vB();
        }
        ty2.aWi = txArray;
    }
}

