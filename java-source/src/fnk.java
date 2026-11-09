/*
 * Decompiled with CFR.
 */
public class fnk
extends fmm {
    public static final int iQU = 1;
    public static final int iQV = 2;
    public static final int iQW = 4;
    public static final int iQX = 8;
    public static final int iQY = 16;
    private int iQZ = 0;

    public fnk() {
        super(8004);
    }

    public int bQh() {
        return this.iQZ;
    }

    public void GZ(int n) {
        this.iQZ = n;
    }

    public boolean GW(int n) {
        return (this.iQZ & n) != 0;
    }

    public void GX(int n) {
        this.iQZ |= n;
    }

    public void GY(int n) {
        this.iQZ &= ~n;
    }
}

