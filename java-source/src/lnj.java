/*
 * Decompiled with CFR.
 */
public class lnj
extends lnh {
    private lnc rFv;
    private final int adk;

    public lnj(a a2, lnc lnc2, int n) {
        super(a2);
        this.rFv = lnc2;
        this.adk = n;
    }

    public lnj(lnj lnj2) {
        this(lnj2.evO(), lnj2.rFv, lnj2.adk);
    }

    public a evO() {
        return (a)this.evb();
    }

    @Override
    protected final double evL() {
        return this.rFv.getDouble(this.adk);
    }

    @Override
    protected final void et(double d2) {
        this.rFv.setDouble(this.adk, d2);
    }
}

