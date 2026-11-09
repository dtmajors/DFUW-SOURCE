/*
 * Decompiled with CFR.
 */
public class kwu
extends kwv {
    protected boolean qfW = true;
    protected String aNb;
    protected int qfX = 0;
    protected String[] qfY = null;
    protected String[] eeD = null;
    protected int[] qfZ = null;

    public kwu() {
        this.qbN = 5633;
    }

    public String[] ehT() {
        return this.qfY;
    }

    public void N(String[] stringArray) {
        this.qfY = stringArray;
    }

    public String[] aFP() {
        return this.eeD;
    }

    public int[] ehU() {
        return this.qfZ;
    }

    public void aV(int[] nArray) {
        this.qfZ = nArray;
    }

    public int ehV() {
        return this.qfX;
    }

    public void aaM(int n) {
        this.qfX = n;
    }

    public boolean ehW() {
        return this.qfW;
    }

    public void xM(boolean bl) {
        this.qfW = bl;
    }

    public String getErrorString() {
        return this.aNb;
    }
}

