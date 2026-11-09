/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 */
import java.text.DecimalFormat;

public class hfz
extends hfy
implements lbj {
    private static final DecimalFormat klA = lda.zj("#####0.0");
    private static final DecimalFormat klB = lda.zj("0.000");
    private final hpa[] klC = new hpa[4];
    private final lhf klD = new lhf(16, 16);
    private int klE = 0;
    private final hpg[] klF = new hpg[4];
    private final his klG;
    private final lbn klH = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hfz klN;
        {
            this.klN = hfz2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hfz.a(this.klN)) {
                throw new AssertionError();
            }
        }

        static {
            $assertionsDisabled = !hfz.class.desiredAssertionStatus();
        }
    };
    private final lbn klI = new lbn(this){
        final /* synthetic */ hfz klN;
        {
            this.klN = hfz2;
        }

        public final void W() {
            hfz.a(this.klN, this.klN.cbP().kcv.cox());
        }
    };
    private final lbn klJ = new lbn(this){
        final /* synthetic */ hfz klN;
        {
            this.klN = hfz2;
        }

        public final void W() {
            hfz.b(this.klN);
        }
    };
    private final lbn jLS = new lbn(this){
        final /* synthetic */ hfz klN;
        {
            this.klN = hfz2;
        }

        public final void W() {
            hfz.c(this.klN);
        }
    };
    private boolean Initialized;
    private hpg klK;
    private hpg klL;
    private boolean klM;

    private void Ms(int n) {
        if (n == this.klE) {
            return;
        }
        this.klE = n;
        float f2 = 1.0f;
        if (n == 1) {
            f2 = 2.5f;
        } else if (n == 2) {
            f2 = 6.0f;
        }
        ckg ckg2 = null;
        if (cev.erB != null && (ckg2 = cev.erB.aLW()) != null) {
            f2 = n == 1 ? ckg2.eGs : (n == 2 ? ckg2.eGt : ckg2.eGr);
        }
        int n2 = (int)(f2 * (float)this.klD.rmN / 2.0f);
        int n3 = (int)(f2 * (float)this.klD.H / 2.0f);
        lgg lgg2 = this.cqE().l(this.klD);
        this.klC[0].a(lgg2.fY(0, -n3), 80.0f);
        this.klC[1].a(lgg2.fY(n2, 0), 80.0f);
        this.klC[2].a(lgg2.fY(0, n3), 80.0f);
        this.klC[3].a(lgg2.fY(-n2, 0), 80.0f);
    }

    private void ciB() {
        assert (this.klK != null);
        hjh hjh2 = this.cbP().kck;
        ljq ljq2 = hjh2.av();
        ljq ljq3 = hjh2.getRotation();
        lej lej2 = lcw.dW((ljq)ljq2);
        String string = lcw.f((lej)lej2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Position: [");
        stringBuilder.append(klA.format(ljq2.x));
        stringBuilder.append(", ");
        stringBuilder.append(klA.format(ljq2.y));
        stringBuilder.append(", ");
        stringBuilder.append(klA.format(ljq2.rlV));
        stringBuilder.append("]");
        stringBuilder.append("    Rotation: ");
        stringBuilder.append(klB.format(ljq3.getY()));
        stringBuilder.append("    Tile=" + lej2 + "   (" + string + ")");
        if (lhk.if != null) {
            stringBuilder.append("    Camera: [");
            stringBuilder.append(klA.format(lhk.if.x));
            stringBuilder.append(", ");
            stringBuilder.append(klA.format(lhk.if.y));
            stringBuilder.append(", ");
            stringBuilder.append(klA.format(lhk.if.rlV));
            stringBuilder.append("]");
        }
        this.klK.mV(stringBuilder.toString());
    }

    public hfz(hdm hdm2, String string) {
        super(hdm2, string);
        lgs lgs2 = this.cqE();
        lgg lgg2 = lgs2.l(this.klD);
        this.klC[0] = new hpa((hnc)hdm2, null, lgg2.fY(0, -this.klD.H / 2), null, hdm2.jXk.jOx);
        this.klC[1] = new hpa((hnc)hdm2, null, lgg2.fY(this.klD.rmN / 2, 0), null, hdm2.jXk.jOy);
        this.klC[2] = new hpa((hnc)hdm2, null, lgg2.fY(0, this.klD.H / 2), null, hdm2.jXk.jOz);
        this.klC[3] = new hpa((hnc)hdm2, null, lgg2.fY(-this.klD.rmN / 2, 0), null, hdm2.jXk.jOA);
        for (int i = 0; i < 4; ++i) {
            this.j(this.klC[i]);
        }
        lgg lgg3 = lgs2.l(hdm2.jXk.jOP);
        lgg3 = lgg3.k(hdm2.jXk.jOQ);
        this.klG = new his(hdm2, (String)null, lgg3, hdm2.jXk.jOP);
        this.j(this.klG);
    }

    @Override
    public void mR(String string) {
        assert (this.Initialized);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.ciD();
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    private void ciC() {
    }

    private void ciD() {
        boolean bl = this.cbP().ceR();
        if (bl != this.klM) {
            this.klM = bl;
            this.ciC();
        }
    }

    private void ciE() {
        boolean bl = this.cbO().cdw();
        for (int i = 0; i < 4; ++i) {
            this.klC[i].nR(bl);
        }
    }

    private void mU(boolean bl) {
        this.cbP().kck.cnb().a(bl, this.klH);
        this.cbP().kcc.cec().a(bl, this.klJ);
        this.cbP().kAz.eme().a(bl, this.klI);
        this.cbO().cdu().a(bl, this.jLS);
    }

    static /* synthetic */ boolean a(hfz hfz2) {
        return hfz2.Initialized;
    }

    static /* synthetic */ void a(hfz hfz2, int n) {
        hfz2.Ms(n);
    }

    static /* synthetic */ void b(hfz hfz2) {
        hfz2.ciD();
    }

    static /* synthetic */ void c(hfz hfz2) {
        hfz2.ciE();
    }
}

