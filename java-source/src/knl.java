/*
 * Decompiled with CFR.
 */
public class knl
extends knm {
    public static final int pPR = 0;
    public static final int pPS = 1;
    public static final int pPT = 2;
    public static final int pPU = 3;
    protected ljq Position;
    protected int pPV = 0;

    knl() {
        this.Jv(770);
    }

    public void dw(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq eec() {
        return new ljq(this.Position);
    }

    public void Zt(int n) {
        this.pPV = n;
    }

    public int eed() {
        return this.pPV;
    }
}

