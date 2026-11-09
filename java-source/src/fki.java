/*
 * Decompiled with CFR.
 */
public class fki
extends fkc
implements dxu {
    public static final int iOA = 1;
    public static final int iOB = 2;
    public static final int iOC = 4;
    public static final int iOD = 8;
    public int aqs = -1;
    public int iOE;

    @Deprecated
    private fki() {
        super(0);
    }

    protected fki(int n) {
        super(n);
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

