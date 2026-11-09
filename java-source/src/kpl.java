/*
 * Decompiled with CFR.
 */
public class kpl
extends kpo {
    public static final int pla = 1;
    public static final int pen = 2;
    public static final int pTe = 4;
    public static final int pTf = 8;
    public static final int pTg = 16;
    public static final int pUv = 32;
    public static final int pUw = 64;
    public static final int pUx = 128;
    public static final int pUy = 256;
    public static final int pUz = 1;
    public static final int pUA = 2;
    public static final int pTV = 1;
    public static final int pTX = 2;
    public static final int pUB = 4;
    public static final int pUC = 1;
    public static final int pUD = 2;
    public static final int pUE = 4;
    protected int pUF = 0;
    protected int pUG = 0;
    protected int pUH = 0;
    protected int pUI = 0;
    protected ldv dsZ = null;
    protected float gFv = 0.0f;
    protected float gFw = 0.0f;
    protected float pUJ = 0.0f;
    protected int gfi = -1;

    kpl() {
        this.Jv(517);
    }

    public int efj() {
        return this.pUF;
    }

    public void aag(int n) {
        this.pUF = n;
    }

    public int efk() {
        return this.pUG;
    }

    public void aah(int n) {
        this.pUG = n;
    }

    public int efl() {
        return this.pUH;
    }

    public void aai(int n) {
        this.pUH = n;
    }

    public int efm() {
        return this.pUI;
    }

    public void aaj(int n) {
        this.pUI = n;
    }

    public ldv eeK() {
        return this.dsZ;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public float efn() {
        return this.gFv;
    }

    public void hl(float f) {
        this.gFv = f;
    }

    public float efo() {
        return this.gFw;
    }

    public void hm(float f) {
        this.gFw = f;
    }

    public float efp() {
        return this.pUJ;
    }

    public void mK(float f) {
        this.pUJ = f;
    }

    public int bkE() {
        return this.gfi;
    }

    public void zP(int n) {
        this.gfi = n;
    }
}

