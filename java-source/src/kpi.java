/*
 * Decompiled with CFR.
 */
public class kpi
extends kpo {
    public static final int pla = 1;
    public static final int pen = 2;
    public static final int pTe = 4;
    public static final int pTf = 8;
    public static final int pTg = 16;
    public static final int pUp = 1;
    private int pUq = 0;
    private int pUr = 0;
    private ldv dsZ = null;
    private float nLq = 0.0f;
    private int gfi = 0;

    kpi() {
        this.Jv(520);
    }

    public int efd() {
        return this.pUq;
    }

    public void aab(int n) {
        this.pUq = n;
    }

    public int efe() {
        return this.pUr;
    }

    public void aac(int n) {
        this.pUr = n;
    }

    public ldv eeK() {
        return this.dsZ;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public float eff() {
        return this.nLq;
    }

    public void mJ(float f) {
        this.nLq = f;
    }

    public int bkE() {
        return this.gfi;
    }

    public void zP(int n) {
        this.gfi = n;
    }
}

