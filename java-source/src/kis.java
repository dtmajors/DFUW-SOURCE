/*
 * Decompiled with CFR.
 */
public class kis
extends kit {
    public static final int imf = 1;
    public static final int img = 2;
    public static final int imh = 4;
    public static final int imi = 8;
    public static final int imj = 16;
    private int iFO = 0;
    private ljq Position = null;
    private lgl Rotation = null;
    private ljq iml = null;

    kis() {
        this.Jv(2049);
    }

    public void HT(int n) {
        this.iFO = n;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public ljq bFE() {
        return this.iml;
    }

    public void cD(ljq ljq2) {
        this.iml = ljq2;
    }
}

