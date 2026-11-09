/*
 * Decompiled with CFR.
 */
public class lny
extends lnx {
    private long rEO;

    public lny(a a2, long l) {
        super(a2);
        assert (l >= a2.rFV);
        assert (l <= a2.rFW);
        this.rEO = l;
    }

    public lny() {
        this(a.rFX);
    }

    public lny(long l) {
        this(a.rFX, l);
    }

    public lny(a a2) {
        this(a2, a2.aA(0L));
    }

    public lny(lny lny2) {
        this(lny2.ewt(), lny2.rEO);
    }

    public final a ewt() {
        return (a)this.evb();
    }

    @Override
    protected final long ewq() {
        return this.rEO;
    }

    @Override
    protected final void ay(long l) {
        this.rEO = l;
    }
}

