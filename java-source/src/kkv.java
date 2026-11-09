/*
 * Decompiled with CFR.
 */
public class kkv
extends kld {
    public static final int pHc = 1;
    public static final int pHd = 2;
    public static final int iYk = 4;
    public static final int pHe = 8;
    public static final int pHf = 16;
    public static final int iTh = 32;
    public static final int goz = 64;
    public static final int goA = 128;
    public static final int pHg = 256;
    private boolean dsK = false;
    private int pHh = 0;
    private float gwS = 0.0f;
    private boolean gwF = false;
    private ljq[] pHi = null;
    private lcq gwT = lcq.BLACK;
    private String fFC = null;
    private ljq Position = null;
    private lgl Rotation = null;
    private boolean gwH = false;
    private boolean gwI = false;
    private String dBL = "";
    private ljr pHj = new ljr(0.0f, 0.0f, 0.0f, 0.0f);
    private ljp pHk = new ljp(1.0f, 1.0f);

    kkv() {
        this.Jv(1031);
    }

    public void a(kkv kkv2) {
        this.dsK = kkv2.dsK;
        this.pHh = kkv2.pHh;
        this.gwS = kkv2.gwS;
        this.gwF = kkv2.gwF;
        this.pHi = kkv2.pHi;
        this.gwT = kkv2.gwT;
        this.fFC = kkv2.fFC;
        this.Position = kkv2.Position;
        this.Rotation = kkv2.Rotation;
        this.gwH = kkv2.gwH;
        this.gwI = kkv2.gwI;
        this.pHk = kkv2.pHk;
        this.dBL = kkv2.dBL;
        this.pHj = kkv2.pHj.esM();
        super.a(kkv2);
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public int ecr() {
        return this.pHh;
    }

    public void YG(int n) {
        this.pHh = n;
    }

    public float getLineWidth() {
        return this.gwS;
    }

    public void setLineWidth(float f) {
        this.gwS = f;
    }

    public boolean isConstantSize() {
        return this.gwF;
    }

    public void setConstantSize(boolean bl) {
        this.gwF = bl;
    }

    public lcq bmj() {
        return this.gwT;
    }

    public void m(lcq lcq2) {
        this.gwT = lcq2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
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

    public boolean isHasTexture() {
        return this.gwI;
    }

    public void setHasTexture(boolean bl) {
        this.gwI = bl;
    }

    public boolean isTransformPoints() {
        return this.gwH;
    }

    public void setTransformPoints(boolean bl) {
        this.gwH = bl;
    }

    public ljq[] ecs() {
        return this.pHi;
    }

    public void l(ljq[] ljqArray) {
        this.pHi = ljqArray;
    }

    public String aHa() {
        return this.dBL;
    }

    public void gW(String string) {
        this.dBL = string;
    }

    public ljp ect() {
        return this.pHk;
    }

    public void i(ljp ljp2) {
        this.pHk = ljp2;
    }

    public ljr ecu() {
        return this.pHj;
    }

    public void b(ljr ljr2) {
        this.pHj = ljr2;
    }
}

