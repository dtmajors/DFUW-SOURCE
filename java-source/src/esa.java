/*
 * Decompiled with CFR.
 */
public class esa
extends esc
implements dxu {
    public int aqs = -1;
    private int iBf = 0;
    public ldv Ui = null;
    public ldv afF = null;
    public ldv Zf = null;
    public ldv[] iBg = null;

    esa() {
        super(20993);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public ahu.a bLi() {
        return ahu.a.getCompositeStateObjectType(this.iBf);
    }

    public void a(ahu.a a2) {
        this.iBf = a2.ordinal();
    }
}

