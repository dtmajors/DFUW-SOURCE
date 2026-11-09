/*
 * Decompiled with CFR.
 */
public class hrc<ROW, CELL>
implements hrr<CELL> {
    protected final ldl kMt = new ldl();
    public final hrd<ROW, CELL> kSP;
    private final lbn kZY = new lbn(this){
        final /* synthetic */ hrc kZZ;
        {
            this.kZZ = hrc2;
        }

        public final void W() {
            this.kZZ.kMt.enp();
        }
    };
    public boolean jLT;

    public hrc(hrd<ROW, CELL> hrd2) {
        this.kSP = hrd2;
        this.jLT = true;
        this.nb(true);
    }

    public final void dispose() {
        assert (this.jLT);
        this.nb(false);
        this.jLT = false;
    }

    @Override
    public final lbl<lbn> cec() {
        return this.kMt;
    }

    @Override
    public hrt p(ldb ldb2) {
        assert (this.jLT);
        return this.kSP.p(ldb2);
    }

    @Override
    public CELL cT(int n, int n2) {
        assert (this.jLT);
        ROW ROW = this.kSP.LQ(n);
        return this.kSP.a(ROW, n2);
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
        this.kSP.cec().a(bl, this.kZY);
    }
}

