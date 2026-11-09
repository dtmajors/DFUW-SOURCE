/*
 * Decompiled with CFR.
 */
public class lnz
extends lnx {
    private final lnc rFv;
    private final int adk;

    public lnz(a a2, lnc lnc2, int n) {
        super(a2);
        this.rFv = lnc2;
        this.adk = n;
    }

    public lnz(lnz lnz2) {
        this(lnz2.ewv(), lnz2.rFv, lnz2.adk);
    }

    public a ewv() {
        return (a)this.evb();
    }

    @Override
    protected final long ewq() {
        return this.rFv.getLong(this.adk);
    }

    @Override
    protected final void ay(long l) {
        this.rFv.setLong(this.adk, l);
    }
}

