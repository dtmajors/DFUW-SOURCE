/*
 * Decompiled with CFR.
 */
public class ghd
extends ggv {
    public static final int jho = 0;
    public static final int jhp = 1;
    public static final int jhq = 2;
    protected String[] hlz = null;
    protected int[] jhr = null;
    protected ljq Position = new ljq();
    protected int ed = -1;

    public ghd() {
        super(32524);
    }

    public void q(String[] stringArray) {
        this.hlz = stringArray;
    }

    public void av(int[] nArray) {
        this.jhr = nArray;
    }

    public String[] getNames() {
        return this.hlz;
    }

    public int[] bUX() {
        return this.jhr;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public int bUV() {
        return this.ed;
    }

    public void Jv(int n) {
        this.ed = n;
    }
}

