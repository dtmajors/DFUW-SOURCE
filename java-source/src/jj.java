/*
 * Decompiled with CFR.
 */
public final class jj {
    private final jl akS;
    private final int akT;
    private final ldv akU;
    public final String akV;
    private final mhk[] akW;
    private ldv akX = null;

    public jj(jl jl2, int n, ldv ldv2, String string, mhk[] mhkArray, ldv ldv3) {
        this.akS = jl2;
        this.akT = n;
        this.akU = ldv2;
        this.akV = string;
        this.akW = mhkArray;
        this.akX = ldv3;
    }

    int getTag() {
        return this.akT;
    }

    ldv nS() {
        return this.akU;
    }

    public final int getArgCount() {
        return this.akW == null ? 0 : this.akW.length;
    }

    public final mhk cA(int n) {
        if (n < 0 || n >= this.getArgCount()) {
            assert (false);
            return null;
        }
        return this.akW[n];
    }

    public final void a(loz loz2, boolean bl) {
        this.akS.a(this, loz2, bl, false);
    }

    public final void nT() {
        this.akS.c(this);
    }

    public final void b(loz loz2, boolean bl) {
        this.akS.a(this, loz2, bl);
    }

    public ldv getTargetObjectGUID() {
        return this.akX;
    }

    public void setTargetObjectGUID(ldv ldv2) {
        this.akX = ldv2;
    }
}

