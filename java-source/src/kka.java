/*
 * Decompiled with CFR.
 */
public class kka
extends kjx {
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
    protected int iHv = 0;
    protected lcq gTs = lcq.BRIGHT_WHITE;
    protected float evg = 0.0f;
    protected float evh = 0.0f;
    protected boolean gTy = false;
    protected float gTu = 0.0f;
    protected boolean gTv = false;
    protected boolean gTw = false;
    protected int iHw = 0;
    protected boolean pFQ;
    protected ldv nN = ldv.rfe;
    protected lcq gTt = new lcq(1.0f, 0.0f, 0.0f, 1.0f);

    kka() {
        this.Jv(1794);
    }

    public float bvG() {
        return this.evg;
    }

    public void cb(float f) {
        this.evg = f;
    }

    public float bvH() {
        return this.evh;
    }

    public void ca(float f) {
        this.evh = f;
    }

    public boolean bvM() {
        return this.gTy;
    }

    public void je(boolean bl) {
        this.gTy = bl;
    }

    public float bvI() {
        return this.gTu;
    }

    public void bX(float f) {
        this.gTu = f;
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

    public boolean ebM() {
        return this.pFQ;
    }

    public void wV(boolean bl) {
        this.pFQ = bl;
    }

    public ldv bFC() {
        return this.nN;
    }

    public void oG(ldv ldv2) {
        this.nN = ldv2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("{SFGlobalLinearFogRequest: super=");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append("GlobalLinearFogRequestType=");
        stringBuilder.append(kka.Yu(this.iHv));
        stringBuilder.append(",");
        stringBuilder.append("FogColor=");
        stringBuilder.append(this.gTs);
        stringBuilder.append(",");
        stringBuilder.append("FogStart=");
        stringBuilder.append(this.evg);
        stringBuilder.append(",");
        stringBuilder.append("FogEnd=");
        stringBuilder.append(this.evh);
        stringBuilder.append(",");
        stringBuilder.append("FogOn=");
        stringBuilder.append(this.gTy);
        stringBuilder.append(",");
        stringBuilder.append("FogDensity=");
        stringBuilder.append(this.gTu);
        stringBuilder.append(",");
        stringBuilder.append("RangeBased=");
        stringBuilder.append(this.gTv);
        stringBuilder.append(",");
        stringBuilder.append("VertexFog=");
        stringBuilder.append(this.gTw);
        stringBuilder.append(",");
        stringBuilder.append("GlobalLinearFogMethod=");
        stringBuilder.append(kka.Yt(this.iHw));
        stringBuilder.append(",");
        stringBuilder.append("UseCameraForFogStartEnd=");
        stringBuilder.append(this.pFQ);
        stringBuilder.append(",");
        stringBuilder.append("CamGUID=");
        stringBuilder.append(this.nN);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static String Yt(int n) {
        switch (n) {
            case 1: {
                return "LINEAR";
            }
            case 2: {
                return "EXP";
            }
            case 3: {
                return "EXP2";
            }
            case 4: {
                return "NO";
            }
            case 5: {
                return "DEFAULT";
            }
        }
        return "unknown(" + n + ")";
    }

    private static String Yu(int n) {
        StringBuilder stringBuilder = new StringBuilder(1024);
        n = kka.a(stringBuilder, n, 1, "NewFog");
        n = kka.a(stringBuilder, n, 2, "DeleteFog");
        n = kka.a(stringBuilder, n, 4, "ModifyFogColor");
        n = kka.a(stringBuilder, n, 8, "ModifyFogStart");
        n = kka.a(stringBuilder, n, 16, "ModifyFogEnd");
        n = kka.a(stringBuilder, n, 32, "ModifyFogOn");
        n = kka.a(stringBuilder, n, 64, "ModifyFogDensity");
        n = kka.a(stringBuilder, n, 128, "ModifyRangeBased");
        n = kka.a(stringBuilder, n, 256, "ModifyTableOrVertexFog");
        if ((n = kka.a(stringBuilder, n, 512, "ModifyFogMethod")) != 0) {
            assert (false) : n;
            stringBuilder.append("+" + n);
        }
        return stringBuilder.toString();
    }

    public lcq bvF() {
        return this.gTt;
    }

    public void s(lcq lcq2) {
        this.gTt = lcq2;
    }
}

