/*
 * Decompiled with CFR.
 */
public class kpg
extends kpo {
    public static final int pla = 1;
    public static final int pen = 2;
    public static final int pTe = 4;
    public static final int pTf = 8;
    public static final int pTg = 16;
    private int pUn = 0;
    private ldv dsZ = null;
    private int gfi;

    kpg() {
        this.Jv(526);
    }

    public int efb() {
        return this.pUn;
    }

    public void ZZ(int n) {
        this.pUn = n;
    }

    public ldv eeK() {
        return this.dsZ;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public int bkE() {
        return this.gfi;
    }

    public void zP(int n) {
        this.gfi = n;
    }
}

