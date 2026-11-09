/*
 * Decompiled with CFR.
 */
public class emi
extends emr
implements dxu {
    private int aqs = -1;
    private int iuL = ayv.cBd.ordinal();

    emi() {
        super(13832);
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    public ayv bIO() {
        return ayv.getValueByOrdinal(this.iuL);
    }

    public void a(ayv ayv2) {
        this.iuL = ayv2 == null ? this.iuL : ayv2.ordinal();
    }
}

