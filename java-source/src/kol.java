/*
 * Decompiled with CFR.
 */
public class kol
extends kpo {
    public static final int pla = 1;
    public static final int pen = 2;
    private int Type;
    private ldv dsZ;
    private float pTk;
    private float pTl;

    kol() {
        this.Jv(529);
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public ldv eeK() {
        return this.dsZ;
    }

    public void mH(float f) {
        this.pTk = f;
    }

    public float eeN() {
        return this.pTk;
    }

    public void mI(float f) {
        this.pTl = f;
    }

    public float eeO() {
        return this.pTl;
    }
}

