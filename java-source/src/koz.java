/*
 * Decompiled with CFR.
 */
public class koz
extends kpo {
    public static final int pla = 1;
    public static final int pen = 2;
    public static final int pTm = 1;
    public static final int pTn = 2;
    public static final int pTo = 4;
    public static final int pTA = 8;
    public static final int pTB = 16;
    public static final int pTC = 32;
    public static final int pTD = 64;
    public static final int pTE = 128;
    public static final int pTF = 256;
    public static final int pTG = 512;
    private int pTH = -1;
    private int pTI = -1;
    private ldv dsZ = null;
    private int[] pTJ = null;
    private int[] pTK = null;
    private ldv[] iuC = null;

    koz() {
        this.Jv(516);
    }

    public int eeT() {
        return this.pTH;
    }

    public void ZV(int n) {
        this.pTH = n;
    }

    public int eeU() {
        return this.pTI;
    }

    public void ZW(int n) {
        this.pTI = n;
    }

    public ldv eeK() {
        return this.dsZ;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public int[] eeV() {
        return this.pTJ;
    }

    public void aO(int[] nArray) {
        this.pTJ = nArray;
    }

    public int[] eeW() {
        return this.pTK;
    }

    public void aP(int[] nArray) {
        this.pTK = nArray;
    }

    public ldv[] bIL() {
        return this.iuC;
    }

    public void s(ldv[] ldvArray) {
        this.iuC = ldvArray;
    }
}

