/*
 * Decompiled with CFR.
 */
public class iyv {
    public final jlm<Integer, Integer> mCG = new jlm();
    private int lCe;
    private int mCH;
    private int mCI;

    public iyv(int n, int n2, int n3) {
        assert (n >= n2 && n <= n3 && n2 >= 0);
        this.lCe = n;
        this.mCH = n2;
        this.mCI = n3;
    }

    public int dtE() {
        return this.lCe;
    }

    public int dtF() {
        return this.mCI - this.mCH + 1;
    }

    public void dtG() {
        ++this.lCe;
        if (this.lCe == this.mCI) {
            this.lCe = this.mCH;
        }
        this.mCG.k(this.lCe, this.dtF());
    }

    public void Hu(int n) {
        if ((n = Math.max(this.mCH, Math.min(n, this.mCI))) == this.lCe) {
            return;
        }
        this.lCe = n;
        this.mCG.k(this.lCe, this.dtF());
    }
}

