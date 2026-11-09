/*
 * Decompiled with CFR.
 */
public class uf
extends uk {
    public ldv[] aWm = null;

    public uf() {
        super(20);
    }

    @Override
    public Object vC() {
        if (this.aWm != null) {
            return this.vD();
        }
        return null;
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        uf uf2 = (uf)uk2;
        if (this.aWm != null) {
            uf2.aWm = this.vD();
        }
    }

    private ldv[] vD() {
        ldv[] ldvArray = new ldv[this.aWm.length];
        int n = this.aWm.length;
        for (int i = 0; i < n; ++i) {
            ldvArray[i] = (ldv)this.aWm[i].clone();
        }
        return ldvArray;
    }
}

