/*
 * Decompiled with CFR.
 */
public class fgf
extends fgb
implements dxu {
    public static final int iLz = 0;
    public static final int iLA = 1;
    public static final int iLB = 2;
    public static final int iLC = 3;
    public static final int iLD = 4;
    public static final int iLE = 5;
    public static final int iDr = 6;
    public static final int iLF = 7;
    public static final int iLG = 8;
    public static final int iLH = 10;
    private int aqs = -1;
    private int ew = -1;

    fgf() {
        super(8454);
    }

    public final int getResult() {
        return this.ew;
    }

    public final void DR(int n) {
        this.ew = n;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }
}

