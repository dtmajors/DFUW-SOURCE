/*
 * Decompiled with CFR.
 */
public class kkl
extends kkj {
    public static int pGe = 1;
    public static int pGf = 2;
    public static int iSW = 4;
    public static int goz = 8;
    public static int iTd = 16;
    public static int iTe = 32;
    public static int iTf = 64;
    public static int iTg = 128;
    public static int iTh = 256;
    public static int iTi = 512;
    public static int iTj = 1024;
    public static int iTk = 2048;
    private int pGg = 0;
    private boolean gvm = false;
    private boolean gvl = false;
    private String fFC = null;
    private int gvg = 0;
    private ljq Position = null;
    private float Uf = 0.0f;
    private float Ue = 0.0f;
    private lcq gvo = null;
    private float gvn = 0.0f;
    private boolean dsK;
    private boolean gUI;

    kkl() {
        this.Jv(1539);
    }

    public void a(kkl kkl2) {
        this.pGg = kkl2.pGg;
        this.gvm = kkl2.gvm;
        this.gvl = kkl2.gvl;
        this.fFC = kkl2.fFC;
        this.gvg = kkl2.gvg;
        this.Position = kkl2.Position;
        this.Uf = kkl2.Uf;
        this.Ue = kkl2.Ue;
        this.gvo = kkl2.gvo;
        this.gvn = kkl2.gvn;
        this.dsK = kkl2.dsK;
        this.gUI = kkl2.gUI;
        super.a(kkl2);
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public lcq getInnerColor() {
        return this.gvo;
    }

    public void setInnerColor(lcq lcq2) {
        this.gvo = lcq2;
    }

    public float getInnerIntensity() {
        return this.gvn;
    }

    public void setInnerIntensity(float f) {
        this.gvn = f;
    }

    public boolean isInnerOn() {
        return this.gvl;
    }

    public void setInnerOn(boolean bl) {
        this.gvl = bl;
    }

    public float getInnerRadius() {
        return this.Uf;
    }

    public void setInnerRadius(float f) {
        this.Uf = f;
    }

    public boolean isOn() {
        return this.gUI;
    }

    public void hX(boolean bl) {
        this.gUI = bl;
    }

    public int getOuterColorNumber() {
        return this.gvg;
    }

    public void setOuterColorNumber(int n) {
        this.gvg = n;
    }

    public boolean isOuterOn() {
        return this.gvm;
    }

    public void setOuterOn(boolean bl) {
        this.gvm = bl;
    }

    public float getOuterRadius() {
        return this.Ue;
    }

    public void setOuterRadius(float f) {
        this.Ue = f;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public int ebU() {
        return this.pGg;
    }

    public void Yy(int n) {
        this.pGg = n;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }
}

