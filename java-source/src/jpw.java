/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  lcr
 *  lcw
 */
public class jpw
extends btk {
    private final lde<dxq> jzY = new lde();
    private final lha<dxq, dxq> jAj;
    private jqh jWL;
    private ldv afF = null;
    private final jor nQn = new jor(this){
        final /* synthetic */ jpw nQs;
        {
            this.nQs = jpw2;
        }

        public void a(jov jov2, boolean bl) {
            if (bl) {
                btk btk2 = (btk)((dta)jpw.a(this.nQs)).bzt().d(lcr.rg);
                if (btk2 == null || !(btk2 instanceof dld)) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleAction() : Found no camera Object. Obj = " + btk2);
                    return;
                }
                ljq ljq2 = ((dld)btk2).av();
                jpw.a(this.nQs, "say \".Camera Pos = " + ljq2 + ". Result also in console for Copy&Paste. \"");
                lfn.print("\n CamPos = " + ljq2 + ",  For XML :  <SFVector3 X=\"" + ljq2.x + "\" Y=\"" + ljq2.y + "\" Z=\"" + ljq2.rlV + "\"/> \n");
            }
        }
    };
    private final jor nQo = new jor(this){
        final /* synthetic */ jpw nQs;
        {
            this.nQs = jpw2;
        }

        public void a(jov jov2, boolean bl) {
            if (bl) {
                jpw.a(this.nQs, "foo");
                lfn.b(0, "", "handleAction() XXX : ");
                bsu.dKc = true;
            }
        }
    };
    private final jor nQp = new jor(this){
        final /* synthetic */ jpw nQs;
        {
            this.nQs = jpw2;
        }

        public void a(jov jov2, boolean bl) {
            if (bl) {
                jpw.a(this.nQs, 83886255);
            }
        }
    };
    private final jor nQq = new jor(this){
        final /* synthetic */ jpw nQs;
        {
            this.nQs = jpw2;
        }

        public void a(jov jov2, boolean bl) {
            if (bl) {
                lfn.b(0, "SFGamelogicActionHandler", "triggerCoordinatorAction() Taking screenshot.");
                return;
            }
        }
    };
    private final jor nQr = new jor(this){
        final /* synthetic */ jpw nQs;
        {
            this.nQs = jpw2;
        }

        public void a(jov jov2, boolean bl) {
            if (bl) {
                jpw.a(this.nQs, "doo");
            }
        }
    };
    private final lbm<dxq> cdf = new lbm<dxq>(this){
        private final dxs cdj;
        final /* synthetic */ jpw nQs;
        {
            this.nQs = jpw2;
            this.cdj = new dxs();
        }

        public final dxq ij(int n) {
            return this.cdj.CW(n);
        }

        public /* synthetic */ Object ik(int n) {
            return this.ij(n);
        }
    };
    private final lbi<dxq> cde = new lbi<dxq>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jpw nQs;
        {
            this.nQs = jpw2;
        }

        public final void p(dxq dxq2) {
            if (!$assertionsDisabled && dxq2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && dxq2.amk() == null) {
                throw new AssertionError();
            }
            dxq2.f(lcr.qBQ);
            jpw.c(this.nQs).F(dxq2);
        }

        public /* synthetic */ void m(Object object) {
            this.p((dxq)object);
        }

        static {
            $assertionsDisabled = !jpw.class.desiredAssertionStatus();
        }
    };

    public jpw() {
        this.jAj = new lha(this.jzY.rex, this.cdf, this.cde);
    }

    public boolean ab(dxq dxq2) {
        return this.jzY.Y(dxq2);
    }

    @Override
    public void initialize() {
        if (lcw.emZ()) {
            return;
        }
        this.jWL = new jqh(lcr.qAD, this.jAj);
        this.nH(true);
    }

    private void nH(boolean bl) {
        jom jom2 = this.jWL.kzI;
        jom2.a(bl, joj.nJW, this.nQn);
        jom2.a(bl, joj.nJX, this.nQo);
        jom2.a(bl, joj.nJY, this.nQp);
        jom2.a(bl, joj.nJZ, this.nQq);
        jom2.a(bl, joj.nKa, this.nQr);
    }

    private void td(String string) {
        this.jAj.rnh.m(egq.a(this.jAj.rng, lcr.qCL, string, null, null));
    }

    public void cK(ldv ldv2) {
        this.afF = ldv2;
    }

    private void il(int n) {
        if (this.afF == null) {
            lfn.b(5, "SFExtraActionHandler", "sendCommandEmoteAnimationMessage() PlayerObjectGUID is null.");
            return;
        }
        erg erg2 = (erg)this.MessageDelegator.h(16643, this.GUID, this.afF);
        erg2.aWe = n;
        lfn.b(0, "SFExtraActionHandler", "sendCommandEmoteAnimationMessage() Sending message to " + erg2.amk());
        this.MessageDelegator.F(erg2);
    }

    static /* synthetic */ dxr a(jpw jpw2) {
        return jpw2.MessageDelegator;
    }

    static /* synthetic */ void a(jpw jpw2, String string) {
        jpw2.td(string);
    }

    static /* synthetic */ void a(jpw jpw2, int n) {
        jpw2.il(n);
    }

    static /* synthetic */ dxr b(jpw jpw2) {
        return jpw2.MessageDelegator;
    }

    static /* synthetic */ dxr c(jpw jpw2) {
        return jpw2.MessageDelegator;
    }
}

