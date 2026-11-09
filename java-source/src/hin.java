/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hdm
 */
import java.util.Map;

public class hin
extends hoe {
    private static final boolean jHb = false;
    private static final lhf jGE = new lhf(4, 4);
    private static final lhf jBh = new lhf(64, 28);
    private static final int kmF = 450;
    private final a kvt;
    private final hdx kvu;
    private final lij<hdx> knZ = new lij();
    private final hqr jGH;
    private final hjb knY;
    private final hqy kvv;
    private final hqy jHh;
    private final hqy jHi;
    private final hqy jHj;
    private final lbn kvw = new lbn(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final void W() {
            this.kvy.cbO().cdv();
        }
    };
    private final lbn jHo = new lbn(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final void W() {
            this.kvy.cbO().cdv();
        }
    };
    private final lbn jHp = new lbn(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final void W() {
            this.kvy.cbO().cdv();
        }
    };
    private final lbn jHq = new lbn(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final void W() {
            this.kvy.cbO().cdv();
        }
    };
    private final lbp jAY = new lbp(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final boolean caU() {
            hen hen2 = (hen)this.kvy.cqt();
            hen2.csQ();
            return true;
        }
    };
    private final lbn kmQ = new lbn(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final void W() {
            hin.a(this.kvy);
        }
    };
    private final lbn kmS = new lbn(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final void W() {
            hin.a(this.kvy);
        }
    };
    private final lbn kmr = new lbn(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final void W() {
            hin.b(this.kvy);
        }
    };
    private final lbn kvx = new lbn(this){
        final /* synthetic */ hin kvy;
        {
            this.kvy = hin2;
        }

        public final void W() {
            Map<Integer, dcp> map = this.kvy.cbP().kck.cnv();
            if (map != null) {
                // empty if block
            }
            hin.b(this.kvy);
        }
    };
    private boolean Initialized;

    public hin(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, hdx hdx2) {
        super((hnc)hdm2, string, lgg2, lhf2, a2.kmY, false, false, false, false, null, null);
        assert (hdx2 != null);
        this.kvt = a2;
        this.kvu = hdx2;
        int n = hin.jGE.rmN;
        int n2 = hin.jGE.H;
        this.jHj = null;
        this.jHi = null;
        this.jHh = null;
        this.kvv = null;
        this.jGH = new hqr(this.kLu, (String)null, new lgg(n, n2), lhf.rnv, this.kvt.jGK);
        this.j(this.jGH);
        n2 += this.jGH.getHeight();
        n2 += hin.jGE.H;
        this.knY = new hjb(this.cbO(), (String)null, lgg.rlI, lhf.rnv, this.kvt.kvz, false, this.knZ);
        this.jGH.cwt().cqd().a(this.knY);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.layout();
        this.ciR();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.layout();
    }

    @Override
    protected void ccd() {
        super.ccd();
        this.knY.refresh();
    }

    @Override
    protected boolean ccz() {
        return false;
    }

    @Override
    protected void ccc() {
        hdx hdx2 = (hdx)this.knY.cvj();
        if (hdx2 == null) {
            return;
        }
        if (lea.enZ().isDescendant(hdx2.Type, cxd.fJq)) {
            Object object;
            boolean bl = false;
            ler ler2 = lea.enZ().acv(hdx2.Type);
            if (ler2 instanceof lhg) {
                object = (lhg)ler2;
                bl = ((lhg)object).awQ();
            }
            if (bl) {
                object = new hmv(this.kLu, "test tooltip", this.cqu(), new lhf(256, 145), ((hdm)this.kLu).jYH, hdx2.atw(), hdx2);
                this.kLu.a(hdx2.atw(), (hms)object);
                return;
            }
        }
        super.ccc();
    }

    private void layout() {
        int n = this.getHeight() - hin.jGE.H * 2;
        this.jGH.cC(this.getWidth() - hin.jGE.rmN * 2, n);
        int n2 = this.jGH.cwt().cqd().cpJ().rmN;
        if (n2 < 450) {
            n2 = 450;
        }
        this.knY.MS(n2);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void ciR() {
        this.knZ.clear();
        for (hdx hdx2 = this.kvu.cev(); hdx2 != null; hdx2 = hdx2.cew()) {
            this.a(null, hdx2);
        }
        this.knZ.a(null, hdx.kbg, true);
        this.knY.kxj.notifyChanged();
    }

    private int a(hdx hdx2, hdx hdx3) {
        this.knZ.d(hdx3, hdx2, null);
        int n = 0;
        if (hdx3.cem() != null) {
            hdx hdx4;
            for (hdx4 = hdx3.cev(); hdx4 != null; hdx4 = hdx4.cew()) {
                n += this.a(hdx3, hdx4);
            }
            for (hdx4 = (hdx)hdx3.cem(); hdx4 != null; hdx4 = (hdx)hdx4.cen()) {
                n += this.b(hdx3, hdx4);
            }
        } else {
            for (hdx hdx5 = (hdx)hdx3.cem(); hdx5 != null; hdx5 = (hdx)hdx5.cen()) {
                n += this.b(hdx3, hdx5);
            }
        }
        return n;
    }

    private int b(hdx hdx2, hdx hdx3) {
        if (hdx3.cex()) {
            return 0;
        }
        int n = this.c(hdx2, hdx3);
        for (hdx hdx4 = (hdx)hdx3.cem(); hdx4 != null; hdx4 = (hdx)hdx4.cen()) {
            n += this.b(hdx2, hdx4);
        }
        return n;
    }

    private int c(hdx hdx2, hdx hdx3) {
        if (hdx3.ceu() && this.cbP().kck.b(hdx3) != null) {
            this.knZ.d(hdx3, hdx2, null);
            return 1;
        }
        return 0;
    }

    private void mU(boolean bl) {
        this.a(bl, this.jAY, 27, jpn.nLm);
        this.knY.cqn().a(bl, this.kmQ);
        this.jGH.cwt().cqd().cpI().a(bl, this.kmS);
        this.cbP().kck.kyz.cfa().a(bl, this.kmr);
        this.cbP().kck.cnq().a(bl, this.kvx);
    }

    static /* synthetic */ void a(hin hin2) {
        hin2.layout();
    }

    static /* synthetic */ void b(hin hin2) {
        hin2.ciR();
    }
}

