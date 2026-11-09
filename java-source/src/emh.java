/*
 * Decompiled with CFR.
 */
public class emh
extends emr
implements dxu {
    private int aqs = -1;
    private ldv YN = null;
    private ldv isO = null;
    private int iuK = bbt.cRL.ordinal();

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    public ldv ach() {
        return this.YN;
    }

    public void gw(ldv ldv2) {
        this.YN = ldv2;
    }

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public bbt bIN() {
        return bbt.getValueByOrdinal(this.iuK);
    }

    public void a(bbt bbt2) {
        this.iuK = bbt2 == null ? this.iuK : bbt2.ordinal();
    }

    emh() {
        super(13831);
    }
}

