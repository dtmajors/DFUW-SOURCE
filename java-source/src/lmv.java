/*
 * Decompiled with CFR.
 */
public abstract class lmv
implements lbr {
    protected static final lfr Out = lfr.rkC;
    private final ldl kaY = new ldl();
    private final lmu kza;
    private boolean jLT;
    private boolean bYr;

    public lmv(lmu lmu2) {
        this.kza = lmu2;
        this.jLT = true;
    }

    public lmv(lmv lmv2) {
        this(lmv2.kza);
        this.i(lmv2);
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        this.jLT = false;
    }

    public final lmu evb() {
        return this.kza;
    }

    public final boolean h(lmv lmv2) {
        return lmv2.kza.a(this.kza);
    }

    public final boolean c(lmu lmu2) {
        return lmu2.a(this.kza);
    }

    public final lbl<lbn> cec() {
        return this.kaY;
    }

    public final lmv evc() {
        lmv lmv2 = this.kza.euX();
        lmv2.i(this);
        return lmv2;
    }

    public final boolean i(lmv lmv2) {
        assert (lmv2.h(this));
        assert (lmv2.c(this.evb()));
        boolean bl = this.e(lmv2);
        if (bl) {
            this.cdX();
        }
        return bl;
    }

    public final boolean j(lmv lmv2) {
        if (lmv2.h(this)) {
            return this.f(lmv2);
        }
        assert (false);
        return false;
    }

    public final String dPf() {
        return this.dPh();
    }

    public final boolean k(lmv lmv2) {
        if (this == lmv2) {
            return true;
        }
        return this.f(lmv2);
    }

    public final boolean evd() {
        return this.bYr;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(lfu lfu2) {
        boolean bl;
        assert (!this.bYr);
        this.bYr = true;
        try {
            bl = this.d(lfu2);
            if (bl) {
                this.cdX();
            }
        }
        finally {
            this.bYr = false;
        }
        return bl;
    }

    public final boolean equals(Object object) {
        if (object instanceof lmv) {
            return this.k((lmv)object);
        }
        assert (false);
        return false;
    }

    public final String toString() {
        return null;
    }

    protected abstract boolean e(lmv var1);

    protected abstract boolean f(lmv var1);

    protected abstract boolean d(lfu var1);

    protected abstract String dPh();

    protected void cbg() {
    }

    protected final boolean isConstructed() {
        return this.jLT;
    }

    protected final void cdX() {
        this.kaY.enp();
    }
}

