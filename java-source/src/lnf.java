/*
 * Decompiled with CFR.
 */
public class lnf
extends lnd {
    public final lnc rFv;
    public final int adk;

    public lnf(a a2, lnc lnc2, int n) {
        super(a2);
        this.rFv = lnc2;
        this.adk = n;
    }

    public lnf(lnf lnf2) {
        this(lnf2.evI(), lnf2.rFv, lnf2.adk);
    }

    public final a evI() {
        return (a)this.evb();
    }

    @Override
    protected final boolean evF() {
        return this.rFv.getBoolean(this.adk);
    }

    @Override
    protected final void yQ(boolean bl) {
        this.rFv.setBoolean(this.adk, bl);
    }
}

