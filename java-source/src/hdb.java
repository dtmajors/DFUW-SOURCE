/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hdb
extends hoe {
    private static final lhf jGE = new lhf(10, 10);
    public static final lhf jKf = new lhf(200, 86);
    private final Object jKg;
    private final hqm jKh;
    private final int jKi;
    private final boolean jKj;
    private final lbn jDY = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdb jKl;
        {
            this.jKl = hdb2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdb.a(this.jKl)) {
                throw new AssertionError();
            }
            if (hdb.b(this.jKl).isFocusOwner()) {
                hdb.c(this.jKl).cqV();
            }
        }

        static {
            $assertionsDisabled = !hdb.class.desiredAssertionStatus();
        }
    };
    private final lbn jKk = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdb jKl;
        {
            this.jKl = hdb2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdb.a(this.jKl)) {
                throw new AssertionError();
            }
            this.jKl.refresh();
        }

        static {
            $assertionsDisabled = !hdb.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private int asi;

    public hdb(hdm hdm2, String string, lgg lgg2, String string2, int n, Object object, lbn lbn2, boolean bl) {
        super((hnc)hdm2, string, lgg2, jKf, hdm2.kmY, true, true, false, false, lbn2, null);
        assert (string2 != null);
        this.jKg = object;
        this.jKi = n;
        this.jKj = bl;
        this.asi = 0;
        int n2 = hdb.jGE.rmN;
        int n3 = hdb.jGE.H;
        int n4 = (this.getWidth() - hdb.jGE.rmN * 3) / 2;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n3), new lhf(n4, 22), hdm2.kIX, string2);
        this.j(hpe2);
        n2 += hpe2.getWidth();
        this.jKh = new hqm(this.kLu, null, new lgg(n2 += hdb.jGE.rmN, n3), new lhf(n4, 22), hdm2.kKw, 0.0, n, n, 0, 1.0);
        this.j(this.jKh);
        n2 = hdb.jGE.rmN;
        n3 += this.jKh.getHeight();
        n3 += hdb.jGE.H;
    }

    public final int vf() {
        assert (this.Initialized);
        return this.asi;
    }

    public final Object ccw() {
        assert (this.Initialized);
        return this.jKg;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccx() {
        this.asi = (int)this.jKh.cqg().cpZ();
    }

    @Override
    protected void ccy() {
    }

    @Override
    protected boolean ccz() {
        assert (!this.jKh.cqg().chD());
        if (this.jKj) {
            return false;
        }
        return this.jKh.cqg().cpZ() == (double)this.jKi;
    }

    @Override
    protected boolean ccA() {
        return !this.jKh.cqg().chD();
    }

    private hpv ccB() {
        return (hpv)this.cqt();
    }

    private void mU(boolean bl) {
        this.ccB().cqr().a(bl, this.jDY);
        this.jKh.cqg().cpY().a(bl, this.jKk);
    }

    static /* synthetic */ boolean a(hdb hdb2) {
        return hdb2.Initialized;
    }

    static /* synthetic */ hpv b(hdb hdb2) {
        return hdb2.ccB();
    }

    static /* synthetic */ hqm c(hdb hdb2) {
        return hdb2.jKh;
    }
}

