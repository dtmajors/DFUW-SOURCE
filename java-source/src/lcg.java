/*
 * Decompiled with CFR.
 */
public class lcg
implements lbg {
    private final lbg qwa;
    private final int cf;
    private final int cg;
    private final int fb;
    private final int fc;

    public lcg(int n, int n2, int n3, int n4, lbg lbg2) {
        assert (n >= 0);
        assert (n2 >= 0);
        assert (n3 >= 0);
        assert (n4 >= 0);
        assert (n + n3 <= lbg2.getWidth());
        assert (n2 + n4 <= lbg2.getHeight());
        this.qwa = lbg2;
        this.cf = n;
        this.cg = n2;
        this.fb = n3;
        this.fc = n4;
    }

    @Override
    public final int getWidth() {
        return this.fb;
    }

    @Override
    public final int getHeight() {
        return this.fc;
    }

    @Override
    public boolean fN(int n, int n2) {
        assert (n >= 0 && n < this.fb);
        assert (n2 >= 0 && n2 < this.fc);
        return this.qwa.fN(this.cf + n, this.cg + n2);
    }
}

