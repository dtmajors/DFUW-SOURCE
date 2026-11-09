/*
 * Decompiled with CFR.
 */
public class hxp
extends hxo {
    private final boolean lkK;
    private hyg lkL = new hyg(hyf.lnu);

    public hxp(hxh hxh2, ldz ldz2, float f2, float f3, boolean bl) {
        super(hxh2, ldz2, f2, f3);
        this.lkK = bl;
    }

    @Override
    protected void G(int n, float f2) {
        if (!this.lkK) {
            f2 = 1.0f - f2;
        }
        float f3 = this.lkL.kp(f2);
        this.hz(f3);
    }

    @Override
    public boolean b(hxi hxi2) {
        switch (hxi2) {
            case lkj: {
                return true;
            }
        }
        return false;
    }
}

