/*
 * Decompiled with CFR.
 */
public class kia
extends kht {
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
    public static final int pzm = 2048;
    public static final int pzn = 4096;
    public static final int pzo = 8192;
    public static final int pzp = 1;
    public static final int pzq = 2;
    public static final int pzr = 0;
    public static final int pzs = 1;
    public static final int pzt = 2;
    public static final String[] pzu = new String[]{"Forward", "BackWard", "PingPong"};
    private int ikd = 0;
    private int ike = 0;
    private int pzv = 0;
    private int ikg = 1;
    private float iGw;
    private String gsj = "normal_idle";
    private boolean ikh;
    private int ikf;
    private double ikk;
    private float iki;
    private float ikj;
    private int pzw;
    private String[] pyn = new String[0];
    private float[] pyo = new float[0];
    private float pzx = 0.0f;

    kia() {
        this.Jv(3076);
    }

    public int bES() {
        return this.ike;
    }

    public void Dm(int n) {
        this.ike = n;
    }

    public int bET() {
        return this.ikd;
    }

    public void Dn(int n) {
        this.ikd = n;
    }

    public int bEU() {
        return this.ikf;
    }

    public void Do(int n) {
        this.ikf = n;
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

    public void iF(float f) {
        this.iki = f;
    }

    public float bEY() {
        return this.ikj;
    }

    public void iG(float f) {
        this.ikj = f;
    }

    public double bEZ() {
        return this.ikk;
    }

    public void cb(double d2) {
        this.ikk = d2;
    }

    public int dZQ() {
        return this.pzw;
    }

    public void XE(int n) {
        this.pzw = n;
    }

    public float bSk() {
        return this.iGw;
    }

    public void jk(float f) {
        this.iGw = f;
    }

    public int dZR() {
        return this.pzv;
    }

    public void XF(int n) {
        this.pzv = n;
    }

    public String getSetName() {
        return this.gsj;
    }

    public void setSetName(String string) {
        this.gsj = string;
    }

    public String[] dZS() {
        return this.pyn;
    }

    public void L(String[] stringArray) {
        this.pyn = stringArray;
    }

    public float[] dZT() {
        return this.pyo;
    }

    public void l(float[] fArray) {
        this.pyo = fArray;
    }

    public void lY(float f) {
        this.pzx = f;
    }
}

