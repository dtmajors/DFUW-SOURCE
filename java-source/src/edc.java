/*
 * Decompiled with CFR.
 */
public class edc
extends eda {
    public static final int imf = 1;
    public static final int img = 2;
    public static final int imh = 4;
    public static final int imi = 8;
    public static final int imj = 16;
    public static final int MOVE = 256;
    public static final int gpn = 4096;
    protected int imk = 0;
    protected ljq Position = null;
    protected lgl Rotation = null;
    protected ljq iml = null;

    public edc() {
        super(2049);
    }

    public int bFD() {
        return this.imk;
    }

    public void DH(int n2) {
        this.imk = n2;
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

    public void r(float f2, float f3, float f4) {
        this.Position = new ljq(f2, f3, f4);
    }
}

