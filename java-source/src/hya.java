/*
 * Decompiled with CFR.
 */
public enum hya {
    lmo,
    lmp,
    lmq,
    lmr,
    lms,
    lmt,
    lmu,
    lmv,
    lmw,
    lmx,
    lmy,
    lmz,
    lmA;


    public final int cDs() {
        return 1 << this.ordinal();
    }

    public final boolean ON(int n) {
        return (this.cDs() & n) != 0;
    }
}

