/*
 * Decompiled with CFR.
 */
public class fio
extends fhc
implements dxu {
    private int aqs = -1;
    private int ew = bnn.dwr.ordinal();

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public bnn bPK() {
        return bnn.getValueByOrdinal(this.ew);
    }

    public void a(bnn bnn2) {
        this.ew = bnn2 == null ? this.ew : bnn2.ordinal();
    }

    fio() {
        super(23819);
    }
}

