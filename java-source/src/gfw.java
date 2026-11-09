/*
 * Decompiled with CFR.
 */
public abstract class gfw
extends dxq
implements dxu {
    public int aqs = -1;

    private gfw() {
        super(6144);
    }

    gfw(int n) {
        super(n);
    }

    @Override
    public final int aVk() {
        return this.aqs;
    }

    @Override
    public final void sk(int n) {
        this.aqs = n;
    }
}

