/*
 * Decompiled with CFR.
 */
public class etv
extends euk
implements dxu {
    private int aqs = -1;
    private int ew = baq.cNj.ordinal();
    private bao iwS = null;

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

    public bao bKK() {
        return this.iwS;
    }

    public void B(bao bao2) {
        this.iwS = bao2;
    }

    etv() {
        super(20030);
    }
}

