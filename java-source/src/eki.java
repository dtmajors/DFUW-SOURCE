/*
 * Decompiled with CFR.
 */
public class eki
extends emr
implements dxu {
    private int aqs = -1;
    private int ew = bbp.cRt.ordinal();

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public bbp bHN() {
        return bbp.getValueByOrdinal(this.ew);
    }

    public void a(bbp bbp2) {
        this.ew = bbp2 == null ? this.ew : bbp2.ordinal();
    }

    eki() {
        super(13883);
    }
}

