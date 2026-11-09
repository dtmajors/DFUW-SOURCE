/*
 * Decompiled with CFR.
 */
public class kid
extends kii {
    public static final int pxP = 1;
    public static final int pxQ = 2;
    public static final int pzU = 4;
    public static final int pzV = 8;
    public static final int plP = 16;
    public static final int pzW = 32;
    private int pzX;
    private lko[] pzY;
    private ldv pzZ;
    private int pAa;
    private boolean Active;

    public kid() {
        this.Jv(1288);
    }

    public final boolean isActive() {
        return this.Active;
    }

    public final void setActive(boolean bl) {
        this.Active = bl;
    }

    public final ldv dZZ() {
        return this.pzZ;
    }

    public final void tA(ldv ldv2) {
        this.pzZ = ldv2;
    }

    public final int eaa() {
        return this.pzX;
    }

    public final void XI(int n) {
        this.pzX = n;
    }

    public final int eab() {
        return this.pAa;
    }

    public final void XJ(int n) {
        this.pAa = n;
    }

    public final void a(lko[] lkoArray) {
        this.pzY = lkoArray;
    }

    public final lko[] eac() {
        return this.pzY;
    }
}

