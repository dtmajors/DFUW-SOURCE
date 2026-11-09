/*
 * Decompiled with CFR.
 */
public class fph
extends fpe {
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
    private int iTl;
    private boolean gvm;
    private boolean gvl;
    private String fFC;
    private int gvg;
    private ljq Position;
    private float Uf;
    private float Ue;
    private lcq gvo;
    private float gvn;
    private boolean gUI;

    public fph() {
        super(1538);
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

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public int bQN() {
        return this.iTl;
    }

    public void Hm(int n) {
        this.iTl = n;
    }
}

