/*
 * Decompiled with CFR.
 */
public class erp
extends erq
implements dxu {
    public static final int izS = 0;
    public static final int izT = 1;
    public static final int izU = 2;
    public static final int izV = 3;
    public static final int izW = 4;
    public static final int izX = 5;
    public static final int izY = 6;
    public static final int izZ = 7;
    public static final int iAa = 8;
    private int aqs = -1;
    private int ex = -1;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public int X() {
        return this.ex;
    }

    public void EQ(int n) {
        this.ex = n;
    }

    public boolean vA() {
        return this.ex == 0;
    }

    erp() {
        super(16660);
    }
}

