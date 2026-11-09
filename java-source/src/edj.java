/*
 * Decompiled with CFR.
 */
public class edj
extends eea {
    public static final int imw = 1;
    public static final int imx = 2;
    public static final int imy = 3;
    private int imz = 0;
    private boolean Active = false;

    edj() {
        super(12810);
    }

    public int bFH() {
        return this.imz;
    }

    public void DI(int n2) {
        this.imz = n2;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }
}

