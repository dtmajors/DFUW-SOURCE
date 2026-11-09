/*
 * Decompiled with CFR.
 */
public class kla
extends kld {
    public static final int iWy = 1;
    public static final int iWz = 2;
    public static final int pHN = 4;
    private int iWC = -1;
    private float daN = 0.0f;
    private boolean Visible = true;
    private int pHO = 0;

    kla() {
        this.Jv(1028);
    }

    public int bSd() {
        return this.iWC;
    }

    public void HW(int n) {
        this.iWC = n;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    public int ecy() {
        return this.pHO;
    }

    public void YK(int n) {
        this.pHO = n;
    }
}

