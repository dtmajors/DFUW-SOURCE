/*
 * Decompiled with CFR.
 */
public class etz
extends euk
implements dxu {
    private int aqs = -1;
    private int ew = baq.cNj.ordinal();
    private bao[] iCT = null;
    private bao[] iCU = null;

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

    public bao[] bMe() {
        return this.iCT;
    }

    public void a(bao[] baoArray) {
        this.iCT = baoArray;
    }

    public bao[] bMf() {
        return this.iCU;
    }

    public void b(bao[] baoArray) {
        this.iCU = baoArray;
    }

    etz() {
        super(20008);
    }
}

