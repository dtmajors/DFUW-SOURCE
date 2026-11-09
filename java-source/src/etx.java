/*
 * Decompiled with CFR.
 */
public class etx
extends euk
implements dxu {
    private int aqs = -1;
    private int ew = baq.cNj.ordinal();

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public baq bLX() {
        return baq.getValueByOrdinal(this.ew);
    }

    public void a(baq baq2) {
        this.ew = baq2 == null ? this.ew : baq2.ordinal();
    }

    etx() {
        super(20010);
    }
}

