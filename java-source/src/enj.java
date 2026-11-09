/*
 * Decompiled with CFR.
 */
public class enj
extends emr
implements dxu {
    private int aqs = -1;
    private int cZn = azm.cES.ordinal();
    private int ivH = 0;
    private ldv isO = null;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public azm bJx() {
        return azm.getValueByOrdinal(this.cZn);
    }

    public void a(azm azm2) {
        this.cZn = azm2 == null ? azm.cES.ordinal() : azm2.ordinal();
    }

    public int bJy() {
        return this.ivH;
    }

    public void Ex(int n) {
        this.ivH = n;
    }

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    enj() {
        super(13876);
    }
}

