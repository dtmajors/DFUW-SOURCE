/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class hbp
extends hsg {
    public final hsi jDE;
    public final hbm jDF;
    private final lbn jDG = new lbn(this){
        final /* synthetic */ hbp jDI;
        {
            this.jDI = hbp2;
        }

        public final void W() {
        }
    };
    private final lbi<efq> jDH = new lbi<efq>(this){
        final /* synthetic */ hbp jDI;
        {
            this.jDI = hbp2;
        }

        public void b(efq efq2) {
            this.jDI.jDF.a(efq2);
        }

        public /* synthetic */ void m(Object object) {
            this.b((efq)object);
        }
    };

    public hbp(ldv ldv2, lbd lbd2, lbh lbh2, jpj jpj2, hrx hrx2, jom jom2, lha<dxq, dxq> lha2, lha<kgz, kgh> lha3, hsi hsi2, lbn lbn2) {
        super(ldv2, lbd2, lbh2, jpj2, hrx2, jom2, lha2, lha3);
        this.jDE = hsi2;
        this.mU(true);
        this.jDF = new hbm(this, hsi2, lbn2, this.jWK.cqE().cqv());
    }

    public final void cbn() {
        assert (this.isConstructed());
        this.cdh.rnh.m(gqz.p(this.cdh.rng, lcr.qzp));
    }

    @Override
    protected void cbg() {
        this.mU(false);
        this.jDF.dispose();
        super.cbg();
    }

    private void mU(boolean bl) {
        this.cdh.rex.b(bl, egb.class, this.jDH);
        this.cdh.rex.b(bl, efv.class, this.jDH);
        this.cdh.rex.b(bl, efy.class, this.jDH);
        this.cdh.rex.b(bl, efu.class, this.jDH);
        this.jWK.cwP().a(bl, this.jDG);
    }
}

