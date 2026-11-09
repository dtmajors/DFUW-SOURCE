/*
 * Decompiled with CFR.
 */
public class frc
extends fqo {
    private boolean adg = false;
    private boolean or = false;
    private boolean iUL = false;
    private boolean iUM = false;
    private boolean acV = false;
    private boolean acW = false;
    private int acX = 0;
    private float acY = 0.0f;

    frc() {
        super(34313);
    }

    public final boolean isRegistered() {
        return this.acV;
    }

    public final void ab(boolean bl) {
        this.acV = bl;
    }

    public final boolean pT() {
        return this.acW;
    }

    public final void am(boolean bl) {
        this.acW = bl;
    }

    public final int pU() {
        return this.acX;
    }

    public final void cY(int n) {
        this.acX = n;
    }

    public final float tY() {
        return this.acY;
    }

    public final void L(float f) {
        this.acY = f;
    }

    public final boolean bRA() {
        return this.iUL;
    }

    public final void lv(boolean bl) {
        this.iUL = bl;
    }

    public final boolean isCanceled() {
        return this.or;
    }

    public final void lw(boolean bl) {
        this.or = bl;
    }

    public final boolean tX() {
        return this.iUM;
    }

    public final void lx(boolean bl) {
        this.iUM = bl;
    }

    public final boolean bRy() {
        return this.adg;
    }

    public final void lt(boolean bl) {
        this.adg = bl;
    }
}

