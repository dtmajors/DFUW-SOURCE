/*
 * Decompiled with CFR.
 */
public class enu
extends emr
implements dxu {
    private int aqs = -1;
    private int ew = bcx.cYh.ordinal();
    private long ivR = 0L;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public bcx bJI() {
        return bcx.getValueByOrdinal(this.ew);
    }

    public void a(bcx bcx2) {
        this.ew = bcx2 == null ? this.ew : bcx2.ordinal();
    }

    public long bJJ() {
        return this.ivR;
    }

    public void ac(long l2) {
        this.ivR = l2;
    }

    enu() {
        super(13922);
    }
}

