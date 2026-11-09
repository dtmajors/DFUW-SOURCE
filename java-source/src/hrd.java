/*
 * Decompiled with CFR.
 */
public abstract class hrd<ROW, FIELD> {
    protected final ldl kMt = new ldl();
    private final hrt[] laa = new hrt[2];

    public hrd(int n, hrt hrt2) {
        this.laa[ldb.reo.ordinal()] = n == 1 ? new hrp() : new hrn(n);
        this.laa[ldb.rep.ordinal()] = hrt2;
    }

    public final lbl<lbn> cec() {
        return this.kMt;
    }

    public final hrt p(ldb ldb2) {
        return this.laa[ldb2.ordinal()];
    }

    public abstract ROW LQ(int var1);

    public abstract FIELD a(ROW var1, int var2);

    public boolean e(int n, ROW ROW) {
        assert (lda.by(ROW, new Integer(n)));
        return false;
    }
}

