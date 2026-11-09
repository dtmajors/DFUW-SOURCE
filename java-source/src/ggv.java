/*
 * Decompiled with CFR.
 */
public abstract class ggv
extends dxq
implements dxu {
    protected int aqs = -1;

    ggv() {
        super(32512);
    }

    ggv(int n) {
        super(n);
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }
}

