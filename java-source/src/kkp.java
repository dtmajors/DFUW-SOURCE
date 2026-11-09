/*
 * Decompiled with CFR.
 */
public class kkp
extends kld {
    public static final int plc = 1;
    public static final int pld = 2;
    public static final int pGx = 4;
    public static final int pGy = 8;
    public static final int pGz = 16;
    public static final int pGA = 32;
    private ldv akX = ldv.rfe;
    private ldv pkf = ldv.rfe;
    private int Type = 0;
    private boolean pGB = true;
    private ljq Position = new ljq(0.0f, 0.0f, 0.0f);
    private ljr eeA = new ljr(1.0f, 1.0f, 1.0f, 1.0f);
    private float daN = 1.0f;

    public ldv getTargetObjectGUID() {
        return this.akX;
    }

    public void setTargetObjectGUID(ldv ldv2) {
        this.akX = ldv2;
    }

    public ldv dWe() {
        return this.pkf;
    }

    public void tq(ldv ldv2) {
        this.pkf = ldv2;
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    kkp() {
        this.Jv(1034);
    }

    public boolean ebY() {
        return this.pGB;
    }

    public void wX(boolean bl) {
        this.pGB = bl;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljr aFJ() {
        return this.eeA;
    }

    public void a(ljr ljr2) {
        this.eeA = ljr2;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }
}

