/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hdm
 */
import java.util.LinkedList;
import spenefett.util.jni.SFJNIUtils;

public class hhi
extends hmt {
    private static final lcq kqX = new lcq(1.0f, 1.0f, 1.0f, 0.7f);
    private final hei kqY;
    private final hpa kgb;
    private final hpg kqZ;
    private final lbn kra = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhi kre;
        {
            this.kre = hhi2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhi.a(this.kre)) {
                throw new AssertionError();
            }
            this.kre.clk();
        }

        static {
            $assertionsDisabled = !hhi.class.desiredAssertionStatus();
        }
    };
    private final lbn krb = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhi kre;
        {
            this.kre = hhi2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhi.a(this.kre)) {
                throw new AssertionError();
            }
            this.kre.clj();
        }

        static {
            $assertionsDisabled = !hhi.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private int krc;
    private int krd;

    public hhi(hdm hdm2, String string, hei hei2, boolean bl) {
        super((hnc)hdm2, string, lgg.rlI, lhf.rnv);
        this.kqY = hei2;
        this.kgb = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf.rnv, this.kqY.kdY.atw());
        this.j(this.kgb);
        this.kgb.H(kqX);
        this.kqZ = new hpg((hnc)hdm2, null, lgg.rlI, lhf.rnv, this.clo(), "");
        this.kqZ.a(bl ? hms.a.kMi : hms.a.kMh);
        this.j(this.kqZ);
        this.kqZ.a(kqX, kqX);
    }

    public final void clg() {
        boolean bl = this.cln().ckJ();
        this.kqZ.a(bl ? hms.a.kMi : hms.a.kMh);
    }

    public final void clh() {
        this.cll();
    }

    public final void cli() {
        this.clm();
    }

    public final void nC(boolean bl) {
        this.kqZ.nR(bl);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.cll();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        if (this.kgb.cqQ() || this.kqZ.cqQ()) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cbO().kKr, "Texture: " + this.kqY.kdY.atw()));
            this.kLu.a(null, linkedList);
            return;
        }
        super.ccc();
    }

    protected void clj() {
        assert (this.Initialized);
        this.cll();
    }

    protected void clk() {
        assert (this.Initialized);
        this.clm();
    }

    private final void cll() {
        lhf lhf2 = this.kqY.kdY.atw().kLY;
        hpg.a a2 = this.clo();
        hnb hnb2 = a2.jFE;
        lhf lhf3 = SFJNIUtils.Instance.getSinglelineTextSize(hnb2.kNa, hnb2.kNb, hnb2.kNc, hnb2.kNd, this.kqY.cfu().esy());
        this.krc = lhf3.rmN + a2.kVt.rmN;
        this.krd = lhf3.H + a2.kVt.H;
        int n = Math.max(lhf2.rmN, this.krc);
        int n2 = lhf2.H;
        this.cbO().jXk.getClass();
        int n3 = n2 + -2 + this.krd;
        this.cC(n, n3);
        this.kgb.h((n - lhf2.rmN) / 2, 0, lhf2.rmN, lhf2.H);
        this.kgb.a(this.kqY.kdY.atw());
        this.kgb.gu(this.kqY.bmQ());
        this.kgb.n(this.kqY.cfw());
        this.kqZ.h(0, n3 - this.krd, n, this.krd);
        this.kqZ.mV(this.kqY.cfu().esy());
        this.clm();
    }

    private void clm() {
        ljp ljp2 = this.kqY.cfv();
        lgg lgg2 = this.cln().q(ljp2);
        int n = this.getWidth();
        lhf lhf2 = this.kqY.kdY.atw().kLY;
        int n2 = lgg2.cf - n / 2;
        int n3 = lgg2.cg - lhf2.H / 2;
        this.cB(n2, n3);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    protected final hhf cln() {
        return (hhf)this.cqt();
    }

    private hpg.a clo() {
        int n = this.kqY.kdY.Type;
        if (n == cug.fme) {
            return this.cbO().kIH;
        }
        if (n == cug.fmf) {
            return this.cbO().kIG;
        }
        return this.cbO().kIF;
    }

    private void mU(boolean bl) {
        this.kqY.cfs().a(bl, this.kra);
        this.kqY.cft().a(bl, this.krb);
    }

    static /* synthetic */ boolean a(hhi hhi2) {
        return hhi2.Initialized;
    }
}

