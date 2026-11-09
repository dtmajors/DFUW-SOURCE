/*
 * Decompiled with CFR.
 */
public class enw
extends emr
implements dxu {
    private int aqs = -1;
    private int ivX = bcx.cYh.ordinal();
    private bda[] ivY = null;
    private long ivZ = 0L;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public bcx bJP() {
        return bcx.getValueByOrdinal(this.ivX);
    }

    public void b(bcx bcx2) {
        this.ivX = bcx2 == null ? this.ivX : bcx2.ordinal();
    }

    public bda[] bJQ() {
        return this.ivY;
    }

    public void c(bda[] bdaArray) {
        this.ivY = bdaArray;
    }

    public long bJR() {
        return this.ivZ;
    }

    public void af(long l2) {
        this.ivZ = l2;
    }

    enw() {
        super(13920);
    }
}

