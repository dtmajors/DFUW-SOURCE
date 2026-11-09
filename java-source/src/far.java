/*
 * Decompiled with CFR.
 */
public class far
extends fal {
    public static final int iHi = 1;
    public static final int iHj = 2;
    public static final int iHk = 4;
    public static final int iHl = 8;
    public static final int iHm = 16;
    public static final int iHn = 32;
    public static final int iHo = 64;
    public static final int iHp = 128;
    public static final int iHq = 256;
    public static final int iHr = 512;
    public static final int iHs = 1024;
    public static final int iHt = 1;
    public static final int EXP = 2;
    public static final int iHu = 3;
    public static final int NO = 4;
    public static final int DEFAULT = 5;
    protected int iHv = -1;
    protected int iHw = -1;
    protected float evg = -1.0f;
    protected float evh = -1.0f;
    protected boolean gTy = false;
    protected float gTu = -1.0f;
    protected boolean gTv = false;
    protected boolean gTw = false;
    protected boolean iHx = false;
    protected boolean iHy = false;
    protected lcq gTs = lcq.BRIGHT_WHITE;
    protected lcq gTt = new lcq(0.0f, 0.0f, 1.0f, 1.0f);

    far() {
        super(1793);
    }

    public float bvG() {
        return this.evg;
    }

    public void cb(float f2) {
        this.evg = f2;
    }

    public float bvH() {
        return this.evh;
    }

    public void ca(float f2) {
        this.evh = f2;
    }

    public boolean bvM() {
        return this.gTy;
    }

    public void je(boolean bl) {
        this.gTy = bl;
    }

    public boolean bNR() {
        return this.iHx;
    }

    public void kP(boolean bl) {
        this.iHx = bl;
    }

    public boolean bNS() {
        return this.iHy;
    }

    public void kQ(boolean bl) {
        this.iHy = bl;
    }

    public float bvI() {
        return this.gTu;
    }

    public void bX(float f2) {
        this.gTu = f2;
    }

    public boolean bvJ() {
        return this.gTv;
    }

    public void jc(boolean bl) {
        this.gTv = bl;
    }

    public boolean bvK() {
        return this.gTw;
    }

    public void jd(boolean bl) {
        this.gTw = bl;
    }

    public int bNT() {
        return this.iHv;
    }

    public void Ge(int n) {
        this.iHv = n;
    }

    public int bNU() {
        return this.iHw;
    }

    public void Gf(int n) {
        this.iHw = n;
    }

    public lcq bvE() {
        return this.gTs;
    }

    public void d(lcq lcq2) {
        this.gTs = lcq2;
    }

    public lcq bvF() {
        return this.gTt;
    }

    public void s(lcq lcq2) {
        this.gTt = lcq2;
    }
}

