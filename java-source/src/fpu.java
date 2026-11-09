/*
 * Decompiled with CFR.
 */
public class fpu
extends dxq
implements dxu {
    public int aqs = -1;

    protected fpu(int n) {
        super(n);
    }

    private fpu() {
        super(31232);
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

