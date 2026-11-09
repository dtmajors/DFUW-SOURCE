/*
 * Decompiled with CFR.
 */
public class dzm
extends dzi
implements dxu {
    private int aqs = -1;
    private int ijz = 0;
    private int dVm = 0;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void f(hc hc2) {
        this.ijz = hc2.ordinal();
    }

    public int bEO() {
        return this.dVm;
    }

    public void Dh(int n2) {
        this.dVm = n2;
    }

    dzm() {
        super(23307);
    }
}

