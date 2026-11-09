/*
 * Decompiled with CFR.
 */
public class kom
extends kpo {
    public static final int pla = 1;
    public static final int pen = 2;
    public static final int pTm = 1;
    public static final int pTn = 2;
    public static final int pTo = 4;
    private int pTp = -1;
    private int pTq = -1;
    private ldv[] pTr = null;
    private ldv dsZ = null;

    kom() {
        this.Jv(515);
    }

    public int eeP() {
        return this.pTp;
    }

    public void ZS(int n) {
        this.pTp = n;
    }

    public int eeQ() {
        return this.pTq;
    }

    public void ZT(int n) {
        this.pTq = n;
    }

    public ldv eeK() {
        return this.dsZ;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public ldv[] eeR() {
        return this.pTr;
    }

    public void I(ldv[] ldvArray) {
        this.pTr = ldvArray;
    }
}

