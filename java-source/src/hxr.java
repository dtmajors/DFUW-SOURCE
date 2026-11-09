/*
 * Decompiled with CFR.
 */
public class hxr
extends hxo {
    private final boolean lkK;
    private float lkO;
    private float lkP;
    private float lkQ;
    private float lkR;

    public hxr(hxh hxh2, ldz ldz2, float f2, float f3, boolean bl) {
        super(hxh2, ldz2, f2, f3);
        this.lkK = bl;
        if (this.lkK) {
            this.lkO = -this.lfj.getWidth();
            this.lkQ = -this.lfj.getHeight();
            this.lkP = this.lfj.getX();
            this.lkR = this.lfj.getY();
        } else {
            this.lkP = -this.lfj.getWidth();
            this.lkR = -this.lfj.getHeight();
            this.lkO = this.lfj.getX();
            this.lkQ = this.lfj.getY();
        }
    }

    @Override
    protected void G(int n, float f2) {
        this.kl((this.lkP - this.lkO) * f2 + this.lkO);
        this.km((this.lkR - this.lkQ) * f2 + this.lkQ);
    }

    @Override
    public boolean b(hxi hxi2) {
        switch (hxi2) {
            case lkg: 
            case lkh: {
                return true;
            }
        }
        return false;
    }
}

