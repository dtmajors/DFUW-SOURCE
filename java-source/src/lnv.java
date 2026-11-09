/*
 * Decompiled with CFR.
 */
public class lnv
extends lnt {
    private final lnc rFv;
    private final int adk;

    public lnv(a a2, lnc lnc2, int n) {
        super(a2);
        this.rFv = lnc2;
        this.adk = n;
    }

    public lnv(lnv lnv2) {
        this(lnv2.ewn(), lnv2.rFv, lnv2.adk);
    }

    public a ewn() {
        return (a)this.evb();
    }

    @Override
    protected final int ewi() {
        return this.rFv.getInteger(this.adk);
    }

    @Override
    protected final void adK(int n) {
        this.rFv.gg(this.adk, n);
    }
}

