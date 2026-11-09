/*
 * Decompiled with CFR.
 */
public class lnu
extends lnt {
    private int PC;

    public lnu(a a2, int n) {
        super(a2);
        assert (n >= a2.rFP);
        assert (n <= a2.rFQ);
        this.PC = n;
    }

    public lnu() {
        this(a.rFR);
    }

    public lnu(int n) {
        this(a.rFR, n);
    }

    public lnu(a a2) {
        this(a2, a2.adM(0));
    }

    public lnu(lnu lnu2) {
        this(lnu2.ewl(), lnu2.PC);
    }

    public final a ewl() {
        return (a)this.evb();
    }

    @Override
    protected final int ewi() {
        return this.PC;
    }

    @Override
    protected final void adK(int n) {
        this.PC = n;
    }
}

