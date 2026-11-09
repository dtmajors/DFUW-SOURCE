/*
 * Decompiled with CFR.
 */
public class fua
extends ftt {
    public static final int iWy = 1;
    public static final int iWz = 2;
    public static final int iWA = 3;
    public static final int iWB = 4;
    private int iWC = 0;
    private float daN = 0.0f;
    private boolean Visible = true;
    private boolean goC = true;

    fua() {
        super(1029);
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

    public void setScale(float f2) {
        this.daN = f2;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    public final boolean bmv() {
        return this.goC;
    }

    public final void aO(boolean bl) {
        this.goC = bl;
    }
}

