/*
 * Decompiled with CFR.
 */
public class dzy
extends dzt {
    public static final int ijO = 1;
    public static final int ijP = 2;
    public static final int ijQ = 4;
    public static final int ijR = 8;
    public static final int ijS = 16;
    public static final int ijT = 32;
    public static final int ijU = 64;
    public static final int ijV = 128;
    public static final int ijW = 256;
    public static final int ijX = 512;
    public static final int ijY = 1024;
    public static final int ijZ = 32768;
    public static final int ika = 65536;
    public static final int ikb = 1;
    public static final int ikc = 2;
    private int ikd = 0;
    private int ike = 0;
    private int ikf = 0;
    private int ikg = 0;
    private boolean ikh = false;
    private float iki = 0.0f;
    private float ikj = 0.0f;
    private double ikk = 0.0;
    private String gsj;

    dzy() {
        super(7428);
    }

    public int bES() {
        return this.ike;
    }

    public void Dm(int n2) {
        this.ike = n2;
    }

    public int bET() {
        return this.ikd;
    }

    public void Dn(int n2) {
        this.ikd = n2;
    }

    public int bEU() {
        return this.ikf;
    }

    public void Do(int n2) {
        this.ikf = n2;
    }

    public int bEV() {
        return this.ikg;
    }

    public void Dp(int n2) {
        this.ikg = n2;
    }

    public boolean bEW() {
        return this.ikh;
    }

    public void jQ(boolean bl) {
        this.ikh = bl;
    }

    public float bEX() {
        return this.iki;
    }

    public void iF(float f2) {
        this.iki = f2;
    }

    public float bEY() {
        return this.ikj;
    }

    public void iG(float f2) {
        this.ikj = f2;
    }

    public double bEZ() {
        return this.ikk;
    }

    public void cb(double d2) {
        this.ikk = d2;
    }

    public String getSetName() {
        return this.gsj;
    }

    public void setSetName(String string) {
        this.gsj = string;
    }
}

