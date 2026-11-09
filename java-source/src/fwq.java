/*
 * Decompiled with CFR.
 */
public class fwq
extends fxe {
    private int[] bqd = null;
    private int[] iIY = null;
    private boolean iQH = false;
    private boolean iJG = false;
    private int aFF = bqy.dFL.ordinal();
    private ljq iZv = null;
    private float iZw = 0.0f;

    public int[] CX() {
        return this.bqd;
    }

    public void g(int[] nArray) {
        this.bqd = nArray;
    }

    public int[] bSu() {
        return this.iIY;
    }

    public void al(int[] nArray) {
        this.iIY = nArray;
    }

    public boolean bSv() {
        return this.iQH;
    }

    public void lA(boolean bl) {
        this.iQH = bl;
    }

    public boolean bSw() {
        return this.iJG;
    }

    public void lB(boolean bl) {
        this.iJG = bl;
    }

    public bqy brE() {
        return bqy.getValueByOrdinal(this.aFF);
    }

    public void b(bqy bqy2) {
        this.aFF = bqy2 == null ? this.aFF : bqy2.ordinal();
    }

    public ljq bSx() {
        return this.iZv;
    }

    public void cM(ljq ljq2) {
        this.iZv = ljq2;
    }

    public float bSy() {
        return this.iZw;
    }

    public void jl(float f2) {
        this.iZw = f2;
    }

    fwq() {
        super(17955);
    }
}

