/*
 * Decompiled with CFR.
 */
public class ety
extends euk
implements dxu {
    private int aqs = -1;
    private ldv isO = null;
    private int ijz = hc.aaz.ordinal();

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void f(hc hc2) {
        this.ijz = hc2 == null ? this.ijz : hc2.ordinal();
    }

    ety() {
        super(20007);
    }
}

