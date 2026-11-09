/*
 * Decompiled with CFR.
 */
public class hxq
extends hxo {
    private final boolean lkK;
    private hyg lkL = new hyg(hyf.lnu);
    private hyg lkN = new hyg(hyf.lnt);

    public hxq(hxh hxh2, ldz ldz2, float f2, float f3, boolean bl) {
        super(hxh2, ldz2, f2, f3);
        this.lkK = bl;
    }

    @Override
    protected void G(int n, float f2) {
        if (!this.lkK) {
            f2 = 1.0f - f2;
        }
        float f3 = this.lkL.kp(f2);
        float f4 = this.lkN.kp(f2);
        float f5 = this.lfj.getWidth() / 2.0f;
        float f6 = this.lfj.getHeight() / 2.0f;
        this.kj(f2 * this.lfj.cCZ());
        this.kl(this.lfj.getX() + f5 * (1.0f - f2));
        this.kk(f3 * this.lfj.cDa());
        this.km(this.lfj.getY() + f6 * (1.0f - f3));
    }

    @Override
    public boolean b(hxi hxi2) {
        switch (hxi2) {
            case lkg: 
            case lkh: 
            case lke: 
            case lkf: {
                return true;
            }
        }
        return false;
    }
}

