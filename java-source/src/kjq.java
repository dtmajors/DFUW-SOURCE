/*
 * Decompiled with CFR.
 */
public class kjq
extends kjx {
    public static final int iGm = 1;
    public static final int iGn = 2;
    public static final int iGo = 4;
    public static final int iGp = 8;
    public static final int iGq = 16;
    public static final int iGr = 32;
    private int iGv;
    private float gRB;
    private lcq gRD;
    private float gRC;
    private lcq gRE;

    kjq() {
        this.Jv(1798);
        this.gRD = lcq.BRIGHT_WHITE;
        this.gRE = lcq.BRIGHT_WHITE;
    }

    public int bNL() {
        return this.iGv;
    }

    public void FX(int n) {
        this.iGv = n;
    }

    public float buR() {
        return this.gRB;
    }

    public void bZ(float f) {
        this.gRB = f;
    }

    public float buS() {
        return this.gRC;
    }

    public void bY(float f) {
        this.gRC = f;
    }

    public lcq buT() {
        return this.gRD;
    }

    public void e(lcq lcq2) {
        this.gRD = lcq2;
    }

    public lcq buU() {
        return this.gRE;
    }

    public void p(lcq lcq2) {
        this.gRE = lcq2;
    }

    @Override
    public String toString() {
        return null;
    }

    private static String Ym(int n) {
        StringBuilder stringBuilder = new StringBuilder(1024);
        n = kjq.a(stringBuilder, n, 1, "NewAtmosphere");
        n = kjq.a(stringBuilder, n, 2, "DeleteAtmosphere");
        n = kjq.a(stringBuilder, n, 4, "ModifyCloudCover");
        n = kjq.a(stringBuilder, n, 8, "ModifyCloudColor");
        n = kjq.a(stringBuilder, n, 16, "ModifyCloudThickness");
        if ((n = kjq.a(stringBuilder, n, 32, "ModifyAtmosphericLight")) != 0) {
            assert (false) : n;
            stringBuilder.append("+" + n);
        }
        return stringBuilder.toString();
    }
}

