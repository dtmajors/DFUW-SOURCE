/*
 * Decompiled with CFR.
 */
public abstract class gmw
extends gmy {
    public static final int jmw = 0;
    public static final int jmx = 1;
    private int ed = -1;
    private String bc = null;
    private int SN = -1;

    public int bUV() {
        return this.ed;
    }

    public void Jv(int n) {
        this.ed = n;
    }

    public String hl() {
        return this.bc;
    }

    public void d(String string) {
        this.bc = string;
    }

    public int qe() {
        return this.SN;
    }

    public void cS(int n) {
        this.SN = n;
    }

    @Deprecated
    gmw() {
        super(3609);
        assert (false) : "Abstract Base Class!!! FFS!!!";
    }

    protected gmw(int n) {
        super(n);
    }
}

