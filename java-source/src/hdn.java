/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hdn
implements hji.a,
lbr {
    public static final boolean kas = true;
    public final hfe kat;
    public final hcg jGq;
    public final hdm dXw;
    public final lbn kau = new lbn(this){
        final /* synthetic */ hdn kav;
        {
            this.kav = hdn2;
        }

        public final void W() {
            hdn.a(this.kav);
        }
    };
    private final jor jLQ = new jor(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdn kav;
        {
            this.kav = hdn2;
        }

        public final void a(jov jov2, boolean bl) {
            if (!$assertionsDisabled && jov2 != joj.nIu) {
                throw new AssertionError();
            }
            if (bl) {
                hdn.a(this.kav);
            }
        }

        static {
            $assertionsDisabled = !hdn.class.desiredAssertionStatus();
        }
    };

    public hdn(hdm hdm2) {
        this.jGq = new hcg(hdm2);
        this.kat = new hfe(hdm2);
        this.dXw = hdm2;
        this.dXw.cbP().kcr.a(this);
        this.dXw.cbP().kcr.cnx();
        this.nb(true);
    }

    public void cdM() {
        this.kat.cdM();
    }

    @Override
    public boolean a(lfu lfu2) {
        return this.kat.a(lfu2);
    }

    @Override
    public void a(boolean bl, auk auk2) {
        this.kat.b(bl, auk2);
    }

    public void cdJ() {
        this.kat.cdJ();
    }

    private void cdN() {
        this.kat.cgG();
    }

    public void dispose() {
        this.nb(false);
        this.dXw.cbP().kcr.b(this);
        this.dXw.cbP().kcr.Wa();
        this.kat.dispose();
    }

    private void nb(boolean bl) {
        this.dXw.cbP().kzI.a(bl, joj.nIu, this.jLQ);
    }

    static /* synthetic */ void a(hdn hdn2) {
        hdn2.cdN();
    }
}

