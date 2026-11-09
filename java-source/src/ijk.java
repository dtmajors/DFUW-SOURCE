/*
 * Decompiled with CFR.
 */
public class ijk
extends ijh
implements hvx {
    private ipb mcc;
    private iig mdi = iig.lZo;
    private ipb mdj = null;
    private ipb mdk = null;
    private a mdl = null;
    private int mdm = 0;
    private int mdn = 0;
    private ipg<ijo> mdo;
    private ipg<Boolean> mdp;
    private ipg<Boolean> mdq;
    private ipg<Boolean> mdr;
    private ipg<Boolean> mds;
    private ipg<Boolean> mdt = null;
    private int mdu = 0;
    private static iqz mdv = new irl(){

        public void e(ipf ipf2) {
            ijk ijk2 = (ijk)ipf2;
            ijk.f(ijk2);
        }
    };

    public ijk() {
        super("Crosshair");
        this.a(mdv);
        this.mdk = new ipb("hit_indicator_new");
        this.mdk.hz(0.0f);
        this.W(ipx.c(new ipf[]{ipx.d(this.mdk)}));
        this.mdj = new ipb();
        this.W(ipx.c(new ipf[]{ipx.d(this.mdj)}));
        this.mcc = new ipb();
        this.W(ipx.c(new ipf[]{ipx.d(this.mcc)}));
        this.mdo = new ipg<ijo>(this, (ipf)this, "CrosshairType", hsu.ldg, true){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ipf2, string, hsu2, bl);
            }

            public ijo dZ(int n, int n2) {
                return ijo.mee;
            }

            public void dak() {
                ijk.a(this.mdw);
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dZ(n, n2);
            }
        };
        this.mdp = new ipg<Boolean>(this, (ipf)this, "ShowAsNeutral", hsu.ldg, true){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return false;
            }

            public void dak() {
                ijk.a(this.mdw);
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mdq = new ipg<Boolean>(this, (ipf)this, "ShowOnVoidTarget", hsu.ldg, true){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return true;
            }

            public void dak() {
                ijk.b(this.mdw);
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mdr = new ipg<Boolean>(this, (ipf)this, "ShowOnWeaponSheathed", hsu.ldg, true){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return false;
            }

            public void dak() {
                this.mdw.czV();
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mds = new ipg<Boolean>(this, (ipf)this, "ShowHitIndicator", hsu.ldg, true){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return true;
            }

            public void dak() {
                if (ijk.c(this.mdw) != null) {
                    ijk.c(this.mdw).setVisible((Boolean)ijk.d(this.mdw).get());
                }
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mdt = new ipg<Boolean>(this, (ipf)this, "SCI", hsu.ldg, true){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                this.mdw.Rh(ijk.e(this.mdw));
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        hso.cxK().cxP().cyZ().lgw.c(new jlr<ijk, Integer>(this, this){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ijk3);
            }

            public void a(ijk ijk2, Integer n) {
                ijk2.Rh(n == null ? 0 : n);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((ijk)object, (Integer)object2);
            }
        });
        jf.akf.b(new jlq<ijk>(this, this){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ijk3);
            }

            public void h(ijk ijk2) {
                ijk2.dbn();
            }

            public /* synthetic */ void R(Object object) {
                this.h((ijk)object);
            }
        });
        hso.cxK().cxP().cyZ().a((hvx)this);
        this.czV();
        this.mcc.qP(ijo.mee.dbw());
        this.mdj.qP(ijj.mcX.Rg(0));
        if (this.mdq.get().booleanValue()) {
            this.hz(this.daE());
            this.setVisible(true);
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            hso.cxK().cxP().cyZ().b((hvx)this);
        }
    }

    public ijo dbf() {
        return this.mdo.get();
    }

    public void a(ijo ijo2) {
        this.mdo.set(ijo2);
    }

    public boolean dbg() {
        return this.mdp.get();
    }

    public void qw(boolean bl) {
        this.mdp.set(bl);
    }

    public boolean dbh() {
        return this.mdq.get();
    }

    public void qx(boolean bl) {
        this.mdq.set(bl);
    }

    public boolean dbi() {
        return this.mdr.get();
    }

    public void qy(boolean bl) {
        this.mdr.set(bl);
    }

    public boolean dbj() {
        return this.mds.get();
    }

    public void qz(boolean bl) {
        this.mds.set(bl);
    }

    public boolean dbk() {
        return this.mdt.get();
    }

    public void qA(boolean bl) {
        this.mdt.set(bl);
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
        boolean bl = this.dbq();
        this.setVisible(bl);
        if (bl) {
            iif iif2 = iie.cZe().cZf();
            if (iif2 != null) {
                this.g(iif2);
                this.hz(iif2.lYw != iii.lZu ? this.daE() : (this.mdq.get() != false ? this.daE() : 0.0f));
            } else {
                this.hz(0.0f);
            }
        }
    }

    @Override
    public void q(ej ej2) {
    }

    @Override
    public ijf dU(int n, int n2) {
        return ijf.mcL;
    }

    @Override
    public ijg dS(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public ijg dT(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public ijc cZY() {
        return new ijm();
    }

    @Override
    public void dah() {
        super.dah();
        ijm ijm2 = (ijm)this.daw();
        ijm2.a(this.dbf());
        ijm2.qz(this.dbj());
        ijm2.qw(this.dbg());
        ijm2.qy(this.dbi());
        ijm2.qx(this.dbh());
        ijm2.qA(this.dbk());
        ijm2.kI(this.daE());
    }

    @Override
    public void dai() {
        super.dai();
        ijm ijm2 = (ijm)this.daw();
        this.a(ijm2.dbf());
        this.qz(ijm2.dbj());
        this.qw(ijm2.dbg());
        this.qy(ijm2.dbi());
        this.qx(ijm2.dbh());
        this.qA(ijm2.dbk());
        this.kI(ijm2.daE());
        this.setVisible(this.dbq());
    }

    @Override
    public void c(iif iif2) {
        if (!this.dbq()) {
            return;
        }
        super.c(iif2);
        this.g(iif2);
        this.hz(this.daE());
    }

    @Override
    public void d(iif iif2) {
        if (!this.mdq.get().booleanValue()) {
            super.d(iif2);
        } else {
            this.g(iif2);
        }
    }

    private void dbl() {
        ijf ijf2 = this.daD();
        this.c(ijf2);
        this.b(ijf2);
        this.d(ijf2);
        this.setSize(this.mdm, this.mdn);
    }

    private void dbm() {
        if (this.mdp.get().booleanValue()) {
            this.mcc.qP(this.mdo.get().dbw());
            return;
        }
        switch (this.mdi) {
            case lZo: {
                this.mcc.qP(this.mdo.get().dbw());
                break;
            }
            case lZp: {
                this.mcc.qP(this.mdo.get().dbx());
                break;
            }
            case lZq: {
                this.mcc.qP(this.mdo.get().dby());
            }
        }
    }

    private void b(ijf ijf2) {
        switch (ijf2) {
            case mcL: {
                this.mcc.setSize(22, 22);
                break;
            }
            case mcM: {
                this.mcc.setSize(28, 28);
                break;
            }
            case mcN: {
                this.mcc.setSize(32, 32);
            }
        }
    }

    public void Rh(int n) {
        String string = this.mdo.get().Ri(n);
        if (string == null) {
            this.mdj.setVisible(false);
        } else {
            this.mdj.qP(string);
            this.mdj.setVisible(this.mdt.get());
        }
        this.mdu = n;
    }

    private void c(ijf ijf2) {
        switch (ijf2) {
            case mcL: {
                this.mdj.setSize(30, 30);
                break;
            }
            case mcM: {
                this.mdj.setSize(35, 35);
                break;
            }
            case mcN: {
                this.mdj.setSize(40, 40);
            }
        }
    }

    private void d(ijf ijf2) {
        switch (ijf2) {
            case mcL: {
                this.mdm = 67;
                this.mdn = 44;
                break;
            }
            case mcM: {
                this.mdm = 75;
                this.mdn = 49;
                break;
            }
            case mcN: {
                this.mdm = 83;
                this.mdn = 54;
            }
        }
    }

    public void dbn() {
        this.mdk.a((iqz)null);
        this.dbo();
        this.mdl = new a(this, this.mdk, this.mdm, this.mdn, 0.3){
            final /* synthetic */ ijk mdw;
            {
                this.mdw = ijk2;
                super(ijk2, ipb2, n, n2, d2);
            }

            public void dbr() {
                ijk.g(this.mdw);
            }
        };
        hso.cxK().cxP().czy().a(this.mdl);
    }

    private void dbo() {
        if (this.mdl != null) {
            hso.cxK().cxP().czy().b(this.mdl);
            this.mdl = null;
        }
    }

    private void g(iif iif2) {
        if (this.mdi == iif2.lYx) {
            return;
        }
        this.mdi = iif2.lYx;
        this.dbm();
    }

    private void dbp() {
        if (this.mdq.get().booleanValue()) {
            this.hz(this.daE());
        } else if (iie.cZe().cZf() != null && iie.cZe().cZf().lYw != iii.lZu) {
            this.hz(this.daE());
        } else {
            this.hz(0.0f);
        }
    }

    private boolean dbq() {
        return this.mdr.get() != false || hso.cxK().cxP().cyZ().cAe();
    }

    static /* synthetic */ void a(ijk ijk2) {
        ijk2.dbm();
    }

    static /* synthetic */ void b(ijk ijk2) {
        ijk2.dbp();
    }

    static /* synthetic */ ipb c(ijk ijk2) {
        return ijk2.mdk;
    }

    static /* synthetic */ ipg d(ijk ijk2) {
        return ijk2.mds;
    }

    static /* synthetic */ int e(ijk ijk2) {
        return ijk2.mdu;
    }

    static /* synthetic */ void f(ijk ijk2) {
        ijk2.dbl();
    }

    static /* synthetic */ void g(ijk ijk2) {
        ijk2.dbo();
    }
}

