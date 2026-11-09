/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcr
 *  lcw
 */
import java.util.Set;

public class hhg
extends hhf
implements alz {
    public static int kqI = 3;
    private final lbn kdL = new lbn(this){
        final /* synthetic */ hhg kqT;
        {
            this.kqT = hhg2;
        }

        public final void W() {
            hhg.a(this.kqT);
        }
    };
    private final lbn kqJ = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhg kqT;
        {
            this.kqT = hhg2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhg.b(this.kqT)) {
                throw new AssertionError();
            }
            boolean bl = this.kqT.cbO().jZL.ccK().cdg().getValue();
            this.kqT.nB(bl);
        }

        static {
            $assertionsDisabled = !hhg.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private ama kqK;
    private lcq kqL = new lcq(0.7f, 1.0f, 0.7f);
    private lcq[] kqM = new lcq[]{new lcq(0.7f, 1.0f, 0.7f), new lcq(1.0f, 0.4f, 0.4f)};
    private double kqN = 1.0;
    private double kqO = 0.0;
    private boolean kqP = false;
    private ldv Ud;
    private boolean kqQ = false;
    private boolean kqR = false;
    private Set<String> kqS = lcn.emx();

    public hhg(hdm hdm2, String string, float f2, lax<lhu> lax2) {
        super(hdm2, string, new ljp(lcw.fyl.x - lcw.qGD.x * (float)kqI, lcw.fyl.rlV - lcw.qGD.rlV * (float)kqI), new ljp(lcw.fym.x + lcw.qGD.x * (float)kqI, lcw.fym.rlV + lcw.qGD.rlV * (float)kqI), f2, lax2, true, hdm2.jZL.ccK());
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcq u(lgg lgg2) {
        String string;
        if (!this.kqQ) {
            return null;
        }
        if (this.kqS.isEmpty()) {
            // empty if block
        }
        if (this.kqS.contains(string = lcw.f((lej)new lej(lgg2.cf - 3, lgg2.cg - 3)).toLowerCase())) {
            return this.clc();
        }
        return null;
    }

    private lcq clc() {
        double d2;
        if (!this.kqP) {
            return this.kqL;
        }
        double d3 = this.kLu.kAz.emb();
        for (d2 = d3 - this.kqO; d2 > this.kqN; d2 -= this.kqN) {
        }
        float f2 = d2 <= this.kqN / 2.0 ? (float)(d2 / (this.kqN / 2.0)) : 1.0f - (float)((d2 - this.kqN / 2.0) / (this.kqN / 2.0));
        float f3 = Math.min(Math.max((this.kqM[1].r - this.kqM[0].r) * f2 + this.kqM[0].r, 0.0f), 1.0f);
        float f4 = Math.min(Math.max((this.kqM[1].g - this.kqM[0].g) * f2 + this.kqM[0].g, 0.0f), 1.0f);
        float f5 = Math.min(Math.max((this.kqM[1].b - this.kqM[0].b) * f2 + this.kqM[0].b, 0.0f), 1.0f);
        float f6 = Math.min(Math.max((this.kqM[1].a - this.kqM[0].a) * f2 + this.kqM[0].a, 0.0f), 1.0f);
        return new lcq(f3, f4, f5, f6);
    }

    private void mU(boolean bl) {
        if (bl) {
            this.kqK = new ama(this);
            this.kqK.Eu();
            this.aoI();
        } else {
            if (this.kqP) {
                this.kLu.kAz.eme().a(false, this.kdL);
                this.kqO = 0.0;
                this.kqP = false;
            }
            this.cld();
            this.kqK.Ev();
            this.kqK = null;
        }
        this.cbO().jZL.ccK().cdg().cec().a(bl, this.kqJ);
    }

    private void cbH() {
        this.ckZ();
    }

    private void aoI() {
        ghm ghm2 = (ghm)this.kqK.getMessageDelegator().h(521, this.kqK.getGUID(), lcr.qDF);
        ghm2.Ud = this.Ud = this.kqK.getMessageDelegator().bzv();
        ghm2.ed = 1;
        this.kqK.getMessageDelegator().E(ghm2);
    }

    private void cld() {
        ghm ghm2 = (ghm)this.kqK.getMessageDelegator().h(521, this.kqK.getGUID(), lcr.qDF);
        ghm2.Ud = this.Ud;
        ghm2.ed = 2;
        this.kqK.getMessageDelegator().E(ghm2);
        this.kqK.getMessageDelegator().oa(this.Ud);
        this.Ud = null;
    }

    private void a(ghn ghn2) {
        this.kqQ = ghn2.jhH;
        this.kqR = ghn2.jhI;
        if (this.kqR && !this.kqP) {
            this.kLu.kAz.eme().a(true, this.kdL);
            this.kqO = this.kLu.kAz.emc();
            this.kqP = true;
        } else if (this.kqP && !this.kqR) {
            this.kLu.kAz.eme().a(false, this.kdL);
            this.kqO = 0.0;
            this.kqP = false;
        }
        this.ckZ();
    }

    @Override
    public boolean a(ba ba2) {
        return false;
    }

    @Override
    public boolean m(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 522: {
                this.a((ghn)dxq2);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean a(kcz kcz2) {
        return false;
    }

    @Override
    public boolean a(kgz kgz2) {
        return false;
    }

    @Override
    public boolean a(ktf ktf2) {
        return false;
    }

    @Override
    public boolean b(ktv ktv2) {
        return false;
    }

    static /* synthetic */ void a(hhg hhg2) {
        hhg2.cbH();
    }

    static /* synthetic */ boolean b(hhg hhg2) {
        return hhg2.Initialized;
    }
}

