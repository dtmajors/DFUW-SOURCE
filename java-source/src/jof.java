/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class jof
extends kdy {
    protected static final joi nHy = joi.nHV;
    private final lcm jWM = new lcm();
    private final ldv GUID = lcr.qAD;
    private final lde<dxq> jzY = new lde();
    private final lde<jrq> nHz = new lde();
    private final jqi nHA;
    private final joy nHB;
    private final lbi<fjo> nHC = new lbi<fjo>(this){
        final /* synthetic */ jof nHQ;
        {
            this.nHQ = jof2;
        }

        public void a(fjo fjo2) {
            jof.a(this.nHQ, fjo2.iNR);
            jof.b(this.nHQ, fjo2.iNS);
            jof.c(this.nHQ, fjo2.iNT);
            if (jof.a(this.nHQ) != null) {
                jof.a(this.nHQ).e(jof.b(this.nHQ), jof.c(this.nHQ), jof.d(this.nHQ));
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjo)object);
        }
    };
    private final lbi<fjm> nHD = new lbi<fjm>(this){
        final /* synthetic */ jof nHQ;
        {
            this.nHQ = jof2;
        }

        public void a(fjm fjm2) {
            jof.d(this.nHQ, fjm2.iNP);
            if (jof.a(this.nHQ) != null) {
                jof.a(this.nHQ).up(jof.e(this.nHQ));
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjm)object);
        }
    };
    private final lbi<fjn> nHE = new lbi<fjn>(this){
        final /* synthetic */ jof nHQ;
        {
            this.nHQ = jof2;
        }

        public void a(fjn fjn2) {
            jof.a(this.nHQ, fjn2.iNQ);
            if (jof.a(this.nHQ) != null) {
                jof.a(this.nHQ).a(jof.f(this.nHQ));
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjn)object);
        }
    };
    private final lbm<dxq> cdf = new lbm<dxq>(this){
        private final dxs cdj;
        final /* synthetic */ jof nHQ;
        {
            this.nHQ = jof2;
            this.cdj = new dxs();
        }

        public final dxq ij(int n) {
            return this.cdj.CW(n);
        }

        public /* synthetic */ Object ik(int n) {
            return this.ij(n);
        }
    };
    private final lbm<jrd> nHF = new lbm<jrd>(this){
        private final jre nHR;
        final /* synthetic */ jof nHQ;
        {
            this.nHQ = jof2;
            this.nHR = new jre();
        }

        public final jrd Vu(int n) {
            return this.nHR.VM(n);
        }

        public /* synthetic */ Object ik(int n) {
            return this.Vu(n);
        }
    };
    private final lbi<dxq> cde = new lbi<dxq>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jof nHQ;
        {
            this.nHQ = jof2;
        }

        public final void p(dxq dxq2) {
            if (!$assertionsDisabled && !jof.g(this.nHQ)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && dxq2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && dxq2.amk() == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && dxq2.aO() != null) {
                throw new AssertionError();
            }
            dxq2.f(jof.h(this.nHQ));
            jof.i(this.nHQ).p(dxq2);
        }

        public /* synthetic */ void m(Object object) {
            this.p((dxq)object);
        }

        static {
            $assertionsDisabled = !jof.class.desiredAssertionStatus();
        }
    };
    private final lbi<jrd> nHG = new lbi<jrd>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jof nHQ;
        {
            this.nHQ = jof2;
        }

        public final void c(jrd jrd2) {
            if (!$assertionsDisabled && !jof.g(this.nHQ)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && jrd2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && jrd2.dRt() != null) {
                throw new AssertionError();
            }
            jrd2.tk(jof.h(this.nHQ));
            jof.j(this.nHQ).p(jrd2);
        }

        public /* synthetic */ void m(Object object) {
            this.c((jrd)object);
        }

        static {
            $assertionsDisabled = !jof.class.desiredAssertionStatus();
        }
    };
    private final lha<dxq, dxq> jAj;
    private final lha<jrq, jrd> nHH;
    private boolean iNR;
    private boolean iNS;
    private boolean iNT;
    private boolean iNP;
    private jol.b iNQ;
    private boolean Initialized;
    private jol nHI;
    private jqx nHJ;
    private jqx.a[] nHK;
    private kek nHL;
    private keu nHM;
    private kfk nHN;
    private final lbi<jrp> nHO;
    private final lbi<jrj> nHP;

    public jof() {
        this.jAj = new lha(this.jzY.rex, this.cdf, this.cde);
        this.nHH = new lha(this.nHz.rex, this.nHF, this.nHG);
        this.nHO = new lbi<jrp>(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ jof nHQ;
            {
                this.nHQ = jof2;
            }

            public final void c(jrp jrp2) {
                if (jrp2.getErrorCode() != 0) {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    return;
                }
                if (jrp2.dRG() == null) {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    return;
                }
                jod[] jodArray = jrp2.dRG();
                jof.a(this.nHQ, new jqx.a[jodArray.length]);
                for (int j = 0; j < jodArray.length; ++j) {
                    jod jod2 = jodArray[j];
                    jof.k((jof)this.nHQ)[j] = new jqx.a();
                    jof.k((jof)this.nHQ)[j].nTH = jod2;
                    if (jod2.getType() == 255) {
                        jof.k((jof)this.nHQ)[j].nTI = new joe[0];
                        continue;
                    }
                    jof.l((jof)this.nHQ).rnh.m(jqz.r(jof.l((jof)this.nHQ).rng, jod2.getGUID()));
                }
                jof.m(this.nHQ);
            }

            public /* synthetic */ void m(Object object) {
                this.c((jrp)object);
            }

            static {
                $assertionsDisabled = !jof.class.desiredAssertionStatus();
            }
        };
        this.nHP = new lbi<jrj>(this){
            final /* synthetic */ jof nHQ;
            {
                this.nHQ = jof2;
            }

            public final void c(jrj jrj2) {
                if (jof.n(this.nHQ) == null) {
                    jof.a(this.nHQ, jrj2);
                } else {
                    jof.n(this.nHQ).d(jrj2);
                }
            }

            public /* synthetic */ void m(Object object) {
                this.c((jrj)object);
            }
        };
        this.nHB = new joy();
        this.nHA = new jqi(this.nHB.kzI, this.jAj);
        assert (lda.by(this.nHA));
    }

    public final void initialize() {
        assert (!this.Initialized);
        this.Initialized = true;
        this.nHH.rnh.m(jrc.k(this.nHH.rng));
        this.cc(true);
    }

    public final void cleanup() {
        assert (this.Initialized);
        this.cc(false);
        if (this.nHI != null) {
            this.nHI.cleanup();
            this.nHI = null;
        }
        if (this.nHJ != null) {
            this.nHJ.dispose();
            this.nHJ = null;
        }
        this.Initialized = false;
    }

    public final boolean isInitialized() {
        return this.Initialized;
    }

    public final void b(double d2, double d3, int n) {
        assert (this.Initialized);
        if (lcw.qHe) {
            return;
        }
        this.Z();
        if (this.nHI == null && this.nHJ != null) {
            this.nHI = new jol(this.jWM, this.nHJ, this.jAj, this.nHB);
            this.nHI.e(this.iNR, this.iNS, this.iNT);
            this.nHI.up(this.iNP);
            this.nHI.a(this.iNQ);
        }
        if (this.nHJ != null) {
            this.nHJ.b(d2, d3, n);
        }
        this.jWM.b(d2, d3, n);
        this.dOI();
    }

    @Override
    public void a(kee kee2) {
        assert (!this.Initialized);
        switch (kee2.dVG()) {
            case 221: {
                this.nHM = (keu)kee2;
                break;
            }
            case 22: {
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        super.a(kee2);
    }

    @Override
    public void b(kee kee2) {
        assert (!this.Initialized);
        switch (kee2.dVG()) {
            case 126: {
                this.nHL = (kek)kee2;
                break;
            }
            case 22: {
                this.nHN = (kfk)kee2;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        super.b(kee2);
    }

    public final void finalize() {
        assert (!this.Initialized);
    }

    private void dOI() {
        this.nHL.dVL();
    }

    private void Z() {
        boolean bl;
        Object object;
        int n;
        assert (this.Initialized);
        jrq[] jrqArray = this.nHM.dVQ();
        if (jrqArray != null && jrqArray.length > 0) {
            int n2 = jrqArray.length;
            for (n = 0; n < n2; ++n) {
                object = jrqArray[n];
                if (object == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "readPipes() : Response is null");
                    assert (false);
                    continue;
                }
                bl = this.nHz.Y(object);
                assert (bl) : object;
            }
        }
        for (n = 0; n < this.piq.size(); ++n) {
            kee kee2 = (kee)this.piq.get(n);
            while (!kee2.isEmpty()) {
                object = (dxq)kee2.dVK();
                bl = this.jzY.Y(object);
                if (bl) continue;
            }
        }
    }

    private void dOJ() {
        for (jqx.a a2 : this.nHK) {
            if (a2.nTI != null) continue;
            return;
        }
        this.nHJ = new jqx(this.jWM, this.jAj, this.nHH, this.nHK);
    }

    private jqx.a tb(ldv ldv2) {
        for (jqx.a a2 : this.nHK) {
            if (!a2.nTH.getGUID().equals(ldv2)) continue;
            return a2;
        }
        return null;
    }

    private void b(jrj jrj2) {
        jqx.a a2 = this.tb(jrj2.dRs());
        if (a2 == null) {
            assert (false);
            return;
        }
        if (jrj2.getErrorCode() != 0) {
            assert (false);
            return;
        }
        a2.nTI = jrj2.dRy();
        this.dOJ();
    }

    private void cc(boolean bl) {
        this.nHH.rex.a(bl, jrp.class, this.nHO);
        this.nHH.rex.a(bl, jrj.class, this.nHP);
        this.jAj.rex.a(bl, fjo.class, this.nHC);
        this.jAj.rex.a(bl, fjm.class, this.nHD);
        this.jAj.rex.a(bl, fjn.class, this.nHE);
    }

    static /* synthetic */ boolean a(jof jof2, boolean bl) {
        jof2.iNR = bl;
        return jof2.iNR;
    }

    static /* synthetic */ boolean b(jof jof2, boolean bl) {
        jof2.iNS = bl;
        return jof2.iNS;
    }

    static /* synthetic */ boolean c(jof jof2, boolean bl) {
        jof2.iNT = bl;
        return jof2.iNT;
    }

    static /* synthetic */ jol a(jof jof2) {
        return jof2.nHI;
    }

    static /* synthetic */ boolean b(jof jof2) {
        return jof2.iNR;
    }

    static /* synthetic */ boolean c(jof jof2) {
        return jof2.iNS;
    }

    static /* synthetic */ boolean d(jof jof2) {
        return jof2.iNT;
    }

    static /* synthetic */ boolean d(jof jof2, boolean bl) {
        jof2.iNP = bl;
        return jof2.iNP;
    }

    static /* synthetic */ boolean e(jof jof2) {
        return jof2.iNP;
    }

    static /* synthetic */ jol.b a(jof jof2, jol.b b2) {
        jof2.iNQ = b2;
        return jof2.iNQ;
    }

    static /* synthetic */ jol.b f(jof jof2) {
        return jof2.iNQ;
    }

    static /* synthetic */ boolean g(jof jof2) {
        return jof2.Initialized;
    }

    static /* synthetic */ ldv h(jof jof2) {
        return jof2.GUID;
    }

    static /* synthetic */ kfk i(jof jof2) {
        return jof2.nHN;
    }

    static /* synthetic */ kek j(jof jof2) {
        return jof2.nHL;
    }

    static /* synthetic */ jqx.a[] a(jof jof2, jqx.a[] aArray) {
        jof2.nHK = aArray;
        return aArray;
    }

    static /* synthetic */ jqx.a[] k(jof jof2) {
        return jof2.nHK;
    }

    static /* synthetic */ lha l(jof jof2) {
        return jof2.nHH;
    }

    static /* synthetic */ void m(jof jof2) {
        jof2.dOJ();
    }

    static /* synthetic */ jqx n(jof jof2) {
        return jof2.nHJ;
    }

    static /* synthetic */ void a(jof jof2, jrj jrj2) {
        jof2.b(jrj2);
    }
}

