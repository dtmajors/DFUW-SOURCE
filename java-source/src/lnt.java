/*
 * Decompiled with CFR.
 */
public abstract class lnt
extends lmv {
    public lnt(a a2) {
        super(a2);
    }

    public final int getValue() {
        return this.ewi();
    }

    public final boolean adI(int n) {
        assert (this.ewf().isValidValue(n));
        if (!this.adL(n)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final a ewf() {
        return (a)this.evb();
    }

    public final boolean a(lnt lnt2) {
        if (!this.c(lnt2)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final boolean b(lnt lnt2) {
        assert (lnt2.h(this));
        return this.getValue() == lnt2.getValue();
    }

    public final boolean adJ(int n) {
        int n2 = this.getValue() + n;
        n2 = this.ewf().adM(n2);
        if (!this.adL(n2)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final boolean ewg() {
        return this.getValue() >= this.ewf().rFQ;
    }

    public final boolean ewh() {
        return this.getValue() <= this.ewf().rFP;
    }

    @Override
    protected boolean e(lmv lmv2) {
        return this.c((lnt)lmv2);
    }

    @Override
    protected boolean f(lmv lmv2) {
        if (lmv2 instanceof lnt) {
            return this.b((lnt)lmv2);
        }
        return false;
    }

    @Override
    protected boolean d(lfu lfu2) {
        int n = lfu2.ad("Value", this.getValue());
        n = this.ewf().adM(n);
        return this.adL(n);
    }

    @Override
    protected String dPh() {
        return Integer.toString(this.getValue());
    }

    protected abstract int ewi();

    protected abstract void adK(int var1);

    private boolean c(lnt lnt2) {
        int n = lnt2.getValue();
        n = this.ewf().adM(n);
        return this.adL(n);
    }

    private boolean adL(int n) {
        assert (n >= this.ewf().rFP);
        assert (n <= this.ewf().rFQ);
        if (n == this.getValue()) {
            return false;
        }
        this.adK(n);
        return true;
    }
}

