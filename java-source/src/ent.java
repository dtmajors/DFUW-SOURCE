/*
 * Decompiled with CFR.
 */
public class ent
extends emr
implements dxu {
    private int aqs = -1;
    private ldv irM = null;
    private int ijz = hc.aaz.ordinal();

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public ldv bHi() {
        return this.irM;
    }

    public void oP(ldv ldv2) {
        this.irM = ldv2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void g(hc hc2) {
        this.ijz = hc2 == null ? this.ijz : hc2.ordinal();
    }

    ent() {
        super(13921);
    }
}

