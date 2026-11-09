/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 *  hdm
 *  lcw
 *  lcy
 */
public class his
extends hmt {
    private final hpa kvF;
    private final hpg kvG;
    private final hpg kvH;
    private final hpg kvI;
    private final hhw kvJ;
    private final lhz kvK;
    private final hna kqi;
    private final hmr jEN = new hmr(null);
    private final lbn kvL = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ his kvP;
        {
            this.kvP = his2;
        }

        public final void W() {
            if (!$assertionsDisabled && !his.a(this.kvP)) {
                throw new AssertionError();
            }
            double d2 = his.b(this.kvP).esb();
            this.kvP.ccl().getClass();
            double d3 = d2 * 3.0;
            d3 = Math.sin(d3);
            if (!($assertionsDisabled || d3 >= -1.0 && d3 <= 1.0)) {
                throw new AssertionError();
            }
            d3 = Math.abs(d3);
            his.a(this.kvP, (float)d3);
        }

        static {
            $assertionsDisabled = !his.class.desiredAssertionStatus();
        }
    };
    private final lbn kkW = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ his kvP;
        {
            this.kvP = his2;
        }

        public final void W() {
            if (!$assertionsDisabled && !his.a(this.kvP)) {
                throw new AssertionError();
            }
            his.c(this.kvP);
        }

        static {
            $assertionsDisabled = !his.class.desiredAssertionStatus();
        }
    };
    private final lbn kvM = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ his kvP;
        {
            this.kvP = his2;
        }

        public final void W() {
            if (!$assertionsDisabled && !his.a(this.kvP)) {
                throw new AssertionError();
            }
            his.c(this.kvP);
        }

        static {
            $assertionsDisabled = !his.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private lcq kvN;
    private float kvO;

    public his(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.kvN = this.ccl().jOK;
        this.kvO = 1.0f;
        lbh lbh2 = hdm2.kAz;
        hdm2.jXk.getClass();
        hdm2.jXk.getClass();
        this.kqi = new hna(lbh2, this.jEN, 5.0f, 1.0f);
        this.kvK = new lhz(hdm2.kAz);
        this.ccl().getClass();
        int n = 20;
        int n2 = 16;
        hpg.a a2 = hdm2.kII;
        this.kvG = new hpg((hnc)hdm2, null, new lgg(n, n2), new lhf(800, a2.jFE.kNb * 2), a2, "");
        this.j(this.kvG);
        this.kvF = new hpa((hnc)hdm2, (String)null, new lgg(0, n2 += this.kvG.getHeight()).R(this.ccl().jOD), lcw.qPq, lhu.rnR);
        this.j(this.kvF);
        a2 = hdm2.kIL;
        this.kvH = new hpg((hnc)hdm2, null, new lgg(n, n2), new lhf(800, a2.jFE.kNb * 2), a2, "");
        this.j(this.kvH);
        this.kvJ = new hhw(hdm2, null, new lgg(n, n2 += this.kvH.getHeight()), this.ccl().jPK, this.cbO().jXo, 0.0f, 0.0f, 0.0f, lcy.qYg);
        this.kvJ.nR(true);
        this.j(this.kvJ);
        a2 = hdm2.kII;
        this.kvI = new hpg((hnc)hdm2, null, new lgg(n, n2 += this.kvJ.getHeight()), new lhf(800, a2.jFE.kNb * 2), a2, "");
        this.j(this.kvI);
        n2 += this.kvI.getHeight();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    protected void cmm() {
        lcq lcq2 = new lcq(this.kvN.r, this.kvN.g, this.kvN.b, this.kvN.a * this.kvO, true);
        this.kvF.H(lcq2);
    }

    private void refresh() {
        this.cmn();
        this.cmo();
        this.cmp();
    }

    private void cmn() {
        boolean bl = this.cbP().kcl.coD();
        this.kqi.nX(bl);
        if (bl) {
            this.cmr();
        }
    }

    private void cmo() {
        lhu lhu2;
        hdw hdw2 = this.cbP().kcl.coA();
        lhu lhu3 = lhu2 = hdw2 == null ? null : hdw2.awW();
        if (lhu2 == null) {
            this.kvF.a(lhu.rnR);
            if (this.kvK.isStarted()) {
                this.kvK.stop();
            }
            this.I(this.ccl().jOK);
        } else {
            this.kvF.a(lhu2);
        }
        this.cmq();
    }

    private void cmp() {
        boolean bl = this.cbP().kcl.coB();
        this.I(bl ? this.ccl().jOJ : this.ccl().jOK);
        if (this.kvK.isStarted() != bl) {
            this.kvK.setStarted(bl);
        }
        this.cmq();
    }

    private void I(lcq lcq2) {
        if (lcq2.X(this.kvN)) {
            return;
        }
        this.kvN = lcq2;
        this.cmm();
    }

    private void cmq() {
        float f2 = 0.0f;
        if (this.cbP().kcl.coB()) {
            f2 = 1.0f;
        } else if (this.cbO().jZL.ccZ().getValue()) {
            f2 = 1.0f;
        }
        this.jV(f2);
    }

    private void jV(float f2) {
        if (ldq.ai(f2, this.kvO)) {
            return;
        }
        this.kvO = f2;
        this.cmm();
    }

    private void cmr() {
        Object object;
        assert (this.cbP().kcl.coD());
        ej[] ejArray = this.cbP().kcl.coz();
        a a2 = new a(ejArray, null);
        hdw hdw2 = this.cbP().kcl.coA();
        if (hdw2.b(hdw.kbj) || hdw2.b(hdw.kbk)) {
            Comparable<Integer> comparable;
            Object object2;
            lcq lcq2;
            Object object3;
            lip lip2 = ljg.roH;
            object = a2.MG(9744);
            if (object != null) {
                object3 = a2.MG(9776);
                lip2 = object3 != null ? lcy.rbI.a(new lip[]{object3, object}) : lcy.rbJ.a(new lip[]{object});
            }
            this.kvG.mV(((lip)lip2).esy());
            lip2 = a2.MG(9712);
            if (lip2 == null) {
                lip2 = ljg.roH;
            }
            if ((object = a2.MG(9728)) == null) {
                object = ljg.roH;
            }
            object3 = lip2 == null && object == null ? ljg.roH : (lip2 == null ? object : (object == null ? lip2 : lcy.rbK.a(new lip[]{lip2, object})));
            this.kvH.mV(((lip)object3).esy());
            boolean bl = a2.MJ(9792);
            object = a2.MI(9760);
            object3 = lcq.COLORSHIFT_NEUTRAL;
            if (object != null && (Integer)object != 0) {
                switch ((Integer)object) {
                    case 2: {
                        object3 = this.ccl().jQm;
                        break;
                    }
                    case 1: {
                        object3 = this.ccl().jQn;
                        break;
                    }
                    case 3: {
                        object3 = this.ccl().jQo;
                        break;
                    }
                    default: {
                        assert (false);
                        break;
                    }
                }
                lcq2 = ((lcq)object3).V(this.cmt().kFL);
                this.kvG.a((lcq)object3, lcq2);
            } else {
                lcq2 = ((lcq)object3).V(this.cmt().kFL);
                this.kvG.a((lcq)object3, lcq2);
            }
            lcq2 = lcq.COLORSHIFT_NEUTRAL;
            if (bl) {
                lcq2 = this.ccl().jQp;
            } else {
                object2 = a2.MJ(1312);
                if (object2 != null && ((Boolean)object2).booleanValue()) {
                    lcq2 = this.ccl().jQl;
                } else {
                    comparable = a2.MI(1296);
                    if (comparable != null) {
                        lcq2 = (Integer)comparable < 0 ? this.ccl().jQk : this.ccl().jQj;
                    }
                }
            }
            object2 = lcq2.V(this.cmt().kFL);
            this.kvH.a(lcq2, (lcq)object2);
            comparable = a2.MG(9808);
            comparable = comparable == null ? ljg.roH : lcy.rbL.a(new lip[]{comparable});
            this.kvI.mV(((lip)comparable).esy());
        } else {
            String string = a2.MF(1328);
            object = null;
            if (string != null && string.contains("::st::")) {
                string = string.replace("::st::", ":");
                object = string.substring(string.indexOf(":") + 1).trim();
                string = string.substring(0, string.indexOf(":")).trim();
            }
            this.kvH.mV(string == null ? "" : string);
            this.kvH.a(lcq.COLORSHIFT_NEUTRAL, lcq.COLORSHIFT_NEUTRAL);
            this.kvG.mV("");
            this.kvI.mV((String)(object == null ? "" : object));
        }
        Float f2 = a2.MH(352);
        if (f2 == null) {
            this.cms();
        } else {
            object = a2.MH(354);
            if (object == null) {
                this.cms();
            } else {
                this.L(f2.floatValue(), ((Float)object).floatValue());
            }
        }
    }

    private void L(float f2, float f3) {
        this.kvJ.M(0.0f, f3);
        this.kvJ.cR(f2);
        this.kvJ.nR(false);
    }

    private void cms() {
        this.kvJ.nR(true);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    protected final hdk ccl() {
        return this.cbO().jXk;
    }

    protected final hlu cmt() {
        return this.cbO().kIn;
    }

    private void mU(boolean bl) {
        this.kvK.eqf().a(bl, this.kvL);
        this.a(bl, this.jEN);
        this.cbP().kcl.coy().a(bl, this.kkW);
        this.cbO().jZL.cec().a(bl, this.kvM);
    }

    static /* synthetic */ boolean a(his his2) {
        return his2.Initialized;
    }

    static /* synthetic */ lhz b(his his2) {
        return his2.kvK;
    }

    static /* synthetic */ void a(his his2, float f2) {
        his2.jV(f2);
    }

    static /* synthetic */ void c(his his2) {
        his2.refresh();
    }
}

