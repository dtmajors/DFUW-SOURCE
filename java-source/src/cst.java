/*
 * Decompiled with CFR.
 */
public class cst
extends cso {
    public static final c fdq = c.fdG;
    private c fdr = fdq;
    public static final b fds = b.fdD;
    private b fdt = fds;
    public static final a fdu = a.fdy;
    private a fdv = fdu;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aZr().evQ() != this.bbe()) {
            this.a(cqu2.aZr().evQ());
        }
        if (cqu2.aZs().evQ() != this.bbf()) {
            this.a(cqu2.aZs().evQ());
            this.bbd();
        }
        if (cqu2.aZt().evQ() != this.bbg()) {
            this.a(cqu2.aZt().evQ());
            this.bbd();
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aZr().c(this.bbe());
        cqu2.aZs().c(this.bbf());
        cqu2.aZt().c(this.bbg());
    }

    private void bbd() {
        kgp kgp2 = this.WT();
        kgp2.Xa(0x600000);
        kgp2.Xd(this.fdt.ordinal());
        kgp2.Xe(this.fdv.ordinal());
        this.MessageDelegator.b(kgp2);
    }

    public c bbe() {
        return this.fdr;
    }

    public void a(c c2) {
        this.fdr = c2;
    }

    public b bbf() {
        return this.fdt;
    }

    public void a(b b2) {
        this.fdt = b2;
    }

    public void ua(int n) {
        this.a(b.getValueByOrdinal(n));
    }

    public a bbg() {
        return this.fdv;
    }

    public void a(a a2) {
        this.fdv = a2;
    }
}

