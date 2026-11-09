/*
 * Decompiled with CFR.
 */
public class gef
extends ged {
    public static final int jfl = 1;
    public static final int ikF = 2;
    public static final int jfm = 4;
    public static final int jfn = 8;
    public static final int jfo = 16;
    public static final int jfp = 32;
    public static final int jfq = 64;
    public static final int jfr = 128;
    public static final int jfs = 256;
    public int biB = 0;
    public int biC = 0;
    public boolean biD = false;
    public ljq biE = null;
    public lgl biF = null;

    gef() {
        super(775);
    }

    public int bUs() {
        return this.biB;
    }

    public void fg(int n) {
        this.biB = n;
    }

    public int bUt() {
        return this.biC;
    }

    public void fh(int n) {
        this.biC = n;
    }

    public boolean bmv() {
        return this.biD;
    }

    public void aO(boolean bl) {
        this.biD = bl;
    }

    public ljq getDeltaPos() {
        return this.biE;
    }

    public void setDeltaPos(ljq ljq2) {
        this.biE = ljq2;
    }

    public lgl getDeltaRot() {
        return this.biF;
    }

    public void setDeltaRot(lgl lgl2) {
        this.biF = lgl2;
    }
}

