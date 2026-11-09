/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Set;

public class hie
extends how {
    private final lib kuO;
    private final a kuP;
    private final hpe kuQ;
    private final lip kuR;
    private final Object jKg;
    private final lbn kuS = new lbn(this){
        final /* synthetic */ hie kuV;
        {
            this.kuV = hie2;
        }

        public final void W() {
            hie.a(this.kuV);
            if (hie.b(this.kuV) == 0) {
                hie.c(this.kuV);
            } else {
                hie.d(this.kuV);
            }
        }
    };
    private final lbi<jpk> kuT = new lbi<jpk>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hie kuV;
        {
            this.kuV = hie2;
        }

        public void a(jpk jpk2) {
            jox<jpf> jox2;
            if (jpk2 instanceof jpm) {
                jox2 = this.kuV.a((jpm)jpk2);
            } else if (jpk2 instanceof jpl) {
                jox2 = this.kuV.a((jpl)jpk2);
            } else {
                if (!$assertionsDisabled) {
                    throw new AssertionError(jpk2);
                }
                jox2 = null;
            }
            if (jox2 != null) {
                hie.a(this.kuV, jox2);
                hie.c(this.kuV);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((jpk)object);
        }

        static {
            $assertionsDisabled = !hie.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private int kuU;
    private boolean aMu;
    private jox<? extends jpf> jId;

    public hie(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, lip lip2, Object object) {
        super(hnc2, string, lgg2, lhf2, a2.khH);
        assert (lip2 != null);
        this.kuP = a2;
        this.kuR = lip2;
        this.jKg = object;
        this.kuO = new lib(hnc2.kNg, true);
        this.kuU = this.kuP.kuU;
        this.kuQ = new hpe(this.kLu, null, lgg.rlI, lhf2, this.kuP.kuW, "");
        this.j(this.kuQ);
    }

    public jox<? extends jpf> cmg() {
        return this.jId;
    }

    public final boolean isCompleted() {
        return this.aMu;
    }

    public final Object ccw() {
        assert (this.aMu);
        return this.jKg;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.kuO.ee(1.0);
        this.mU(true);
        this.cmh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.kuO.stop();
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (lda.acc(n));
        assert (lda.yk(bl));
        assert (lda.by(set));
        return false;
    }

    protected jox<jph> a(jpm jpm2) {
        return null;
    }

    protected jox<jpg> a(jpl jpl2) {
        return null;
    }

    private void cmh() {
        String string = this.kuR.esy();
        if (this.kuP.kuX != null) {
            string = string + this.kuP.kuX.a(new lja(this.kuU)).esy();
        }
        this.kuQ.mV(string);
    }

    private void cmi() {
        this.aMu = true;
        hnu hnu2 = (hnu)this.cqt();
        this.kLu.t(hnu2);
    }

    protected hdm cbO() {
        return (hdm)this.kLu;
    }

    protected hec cbP() {
        return this.cbO().cbP();
    }

    private void mU(boolean bl) {
        this.kuO.esg().a(bl, this.kuS);
        this.cbP().ov(bl);
        this.cbP().kcT.a(bl, this.kuT);
    }

    static /* synthetic */ int a(hie hie2) {
        return hie2.kuU--;
    }

    static /* synthetic */ int b(hie hie2) {
        return hie2.kuU;
    }

    static /* synthetic */ void c(hie hie2) {
        hie2.cmi();
    }

    static /* synthetic */ void d(hie hie2) {
        hie2.cmh();
    }

    static /* synthetic */ jox a(hie hie2, jox jox2) {
        hie2.jId = jox2;
        return hie2.jId;
    }
}

