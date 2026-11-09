/*
 * Decompiled with CFR.
 */
public class eng
extends emr
implements dxu {
    private int aqs = -1;
    private int ew = bch.cVT.ordinal();
    private bcb cAy = null;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public bch bJe() {
        return bch.getValueByOrdinal(this.ew);
    }

    public void a(bch bch2) {
        this.ew = bch2 == null ? this.ew : bch2.ordinal();
    }

    public bcb abG() {
        return this.cAy;
    }

    public void e(bcb bcb2) {
        this.cAy = bcb2;
    }

    eng() {
        super(13881);
    }
}

