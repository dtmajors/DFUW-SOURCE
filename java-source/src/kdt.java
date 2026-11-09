/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class kdt
extends kcz {
    private int dTe = bqy.dFL.avp();
    private long aCF = 0L;
    private String ResourceName = null;
    private ldv iQn = null;
    private int aCH = bqm.b.dEm.ordinal();
    private int asi = 0;

    public void e(bqy bqy2) {
        this.dTe = bqy2 == null ? this.dTe : bqy2.avp();
    }

    public void r(long l) {
        this.aCF = l;
    }

    public void eY(String string) {
        this.ResourceName = string;
    }

    public void a(brb brb2) {
        this.iQn = brb2 == null ? null : brb2.asa();
    }

    public void to(ldv ldv2) {
        this.iQn = ldv2;
    }

    public void a(bqm.b b2) {
        this.aCH = b2 == null ? this.aCH : b2.ordinal();
    }

    public void do(int n) {
        this.asi = n;
    }

    kdt() {
        super(290);
    }
}

