/*
 * Decompiled with CFR.
 */
public class loe
extends loc {
    public final lnc rGi;
    public final int adk;

    public loe(a a2, lnc lnc2, int n) {
        super(a2);
        this.rGi = lnc2;
        this.adk = n;
    }

    public loe(loe loe2) {
        this(loe2.ewD(), loe2.rGi, loe2.adk);
    }

    public final a ewD() {
        return (a)this.evb();
    }

    @Override
    protected final String ewA() {
        return (String)this.rGi.getObject(this.adk);
    }

    @Override
    protected final void AP(String string) {
        this.rGi.setObject(this.adk, string);
    }
}

