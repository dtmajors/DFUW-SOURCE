/*
 * Decompiled with CFR.
 */
public abstract class gmy
extends gnh
implements dxu {
    private int aqs = -1;
    private int jmB = 10;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public int bWl() {
        return this.jmB;
    }

    public void Ke(int n) {
        this.jmB = n;
    }

    @Deprecated
    gmy() {
        super(3607);
        assert (false) : "Abstract Base Class!!! FFS!!!";
    }

    protected gmy(int n) {
        super(n);
    }
}

