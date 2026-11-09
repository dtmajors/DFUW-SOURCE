/*
 * Decompiled with CFR.
 */
public class eij
extends ejm
implements dxu {
    private int aqs = -1;
    private ldv YN = null;
    private int ily = ccf.eln.ordinal();

    eij() {
        super(18716);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    public ldv ach() {
        return this.YN;
    }

    public void gw(ldv ldv2) {
        this.YN = ldv2;
    }

    public ccf bGO() {
        return ccf.getValueByOrdinal(this.ily);
    }

    public void b(ccf ccf2) {
        this.ily = ccf2 == null ? this.ily : ccf2.ordinal();
    }
}

