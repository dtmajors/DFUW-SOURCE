/*
 * Decompiled with CFR.
 */
public class kkm
extends kkj {
    public static int pGh = 1;
    public static int pGi = 2;
    public static int iSW = 4;
    public static int goz = 8;
    public static int goA = 16;
    public static int iSY = 32;
    public static int pGj = 64;
    public static int iGB = 128;
    public static int pGk = 256;
    public static int pGl = 512;
    private int pGm = 0;
    private ljq Position = null;
    private lgl Rotation = null;
    private int pGn = 0;
    private float Radius = 1.0f;
    private ljq gSf = null;
    private String ctI = null;
    private boolean dsK = false;
    private boolean gUI = true;
    private boolean pGo = true;
    private lcq pGp = null;

    kkm() {
        this.Jv(1541);
    }

    public void a(kkm kkm2) {
        this.pGm = kkm2.pGm;
        this.Position = kkm2.Position;
        this.Rotation = kkm2.Rotation;
        this.pGn = kkm2.pGn;
        this.Radius = kkm2.Radius;
        this.gSf = kkm2.gSf;
        this.ctI = kkm2.ctI;
        this.dsK = kkm2.dsK;
        this.gUI = kkm2.gUI;
        this.pGo = kkm2.pGo;
        this.pGp = kkm2.pGp;
        super.a(kkm2);
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public int bna() {
        return this.pGn;
    }

    public void Ai(int n) {
        this.pGn = n;
    }

    public String getMeshName() {
        return this.ctI;
    }

    public void setMeshName(String string) {
        this.ctI = string;
    }

    public boolean isOn() {
        return this.gUI;
    }

    public void hX(boolean bl) {
        this.gUI = bl;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public ljq blS() {
        return this.gSf;
    }

    public void bM(ljq ljq2) {
        this.gSf = ljq2;
    }

    public int ebV() {
        return this.pGm;
    }

    public void Yz(int n) {
        this.pGm = n;
    }

    public lcq ebW() {
        return this.pGp;
    }

    public void S(lcq lcq2) {
        this.pGp = lcq2;
    }

    public boolean ebX() {
        return this.pGo;
    }

    public void wW(boolean bl) {
        this.pGo = bl;
    }
}

