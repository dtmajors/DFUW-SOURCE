/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class jal {
    private jam mHh;
    private int mHi;
    private String mHj;

    public jal(jam jam2, int n) {
        this.mHh = jam2;
        this.mHi = n;
    }

    public jal(jam jam2, int n, String string) {
        this(jam2, n);
        this.mHj = string;
    }

    public jam dvb() {
        return this.mHh;
    }

    public int BV() {
        return this.mHi;
    }

    public String getName() {
        if (this.mHj != null) {
            return this.mHj;
        }
        return ep.aM((int)this.mHi);
    }
}

