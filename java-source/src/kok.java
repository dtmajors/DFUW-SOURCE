/*
 * Decompiled with CFR.
 */
public class kok
extends kpo {
    public static final int pla = 1;
    public static final int pen = 2;
    public static final int pTe = 4;
    public static final int pTf = 8;
    public static final int pTg = 16;
    private int pTh = 0;
    private int gfi;
    private ldv dsZ = null;
    private float pTi;
    private float pTj;

    kok() {
        this.Jv(525);
    }

    public int eeJ() {
        return this.pTh;
    }

    public void ZR(int n) {
        this.pTh = n;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public ldv eeK() {
        return this.dsZ;
    }

    public void zP(int n) {
        this.gfi = n;
    }

    public int bkE() {
        return this.gfi;
    }

    public void mF(float f) {
        this.pTi = f;
    }

    public float eeL() {
        return this.pTi;
    }

    public void mG(float f) {
        this.pTj = f;
    }

    public float eeM() {
        return this.pTj;
    }
}

