/*
 * Decompiled with CFR.
 */
public class khi
extends kht {
    public static final int pxf = 1;
    public static final int pxg = 2;
    private int biC = 0;
    private ldv hs = null;
    private float pxh = 1.5f;
    private boolean avz = true;

    public khi() {
        this.Jv(3091);
    }

    public ldv dZh() {
        return this.hs;
    }

    public void e(ldv ldv2) {
        this.hs = ldv2;
    }

    public float dZi() {
        return this.pxh;
    }

    public void lT(float f) {
        this.pxh = f;
    }

    public int bUt() {
        return this.biC;
    }

    public void fh(int n) {
        this.biC = n;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }
}

