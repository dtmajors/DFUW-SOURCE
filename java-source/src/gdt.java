/*
 * Decompiled with CFR.
 */
public abstract class gdt
extends dxq
implements dxu {
    private int aqs = -1;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    @Deprecated
    private gdt() {
        super(34816);
    }

    protected gdt(int n) {
        super(n);
    }
}

