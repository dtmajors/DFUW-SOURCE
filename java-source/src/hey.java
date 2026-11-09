/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Arrays;
import java.util.List;

public class hey
extends hpv {
    private final hpa kgd;
    private final hqz kge;
    private final hqt kgf;
    private final hqz kgg;
    private final hqz kgh;
    private final List<lhu> kgi;
    private final lbn kgj;
    private final lbn kgk = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hey kgq;
        {
            this.kgq = hey2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hey.a(this.kgq)) {
                throw new AssertionError();
            }
            hey.b(this.kgq);
        }

        static {
            $assertionsDisabled = !hey.class.desiredAssertionStatus();
        }
    };
    private final lbn kgl = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hey kgq;
        {
            this.kgq = hey2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hey.a(this.kgq)) {
                throw new AssertionError();
            }
            hey.c(this.kgq);
        }

        static {
            $assertionsDisabled = !hey.class.desiredAssertionStatus();
        }
    };
    private final lbn kgm = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hey kgq;
        {
            this.kgq = hey2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hey.a(this.kgq)) {
                throw new AssertionError();
            }
            hey.d(this.kgq);
        }

        static {
            $assertionsDisabled = !hey.class.desiredAssertionStatus();
        }
    };
    private final lbn kgn = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hey kgq;
        {
            this.kgq = hey2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hey.a(this.kgq)) {
                throw new AssertionError();
            }
            hey.e(this.kgq);
        }

        static {
            $assertionsDisabled = !hey.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private int kgo;
    private boolean kgp = true;

    public hey(hdm hdm2, String string, lbn lbn2) {
        this(hdm2, string, lbn2, hdm2.jXk.jWl.kLY);
    }

    private hey(hdm hdm2, String string, lbn lbn2, lhf lhf2) {
        super((hnc)hdm2, string, hdm2.kND.cqE().l(lhf2), lhf2);
        this.kgi = Arrays.asList(hdm2.jXk.jWk, hdm2.jXk.jWl, hdm2.jXk.jWm, hdm2.jXk.jWn, hdm2.jXk.jWo, hdm2.jXk.jWp, hdm2.jXk.jWq);
        this.kgj = lbn2;
        this.kgd = new hpa((hnc)hdm2, (String)null, lgg.rlI, null, hdm2.jXk.jWl);
        this.j(this.kgd);
        this.kge = new hqz(this.kLu, null, hdm2.jXk.jWc, null, hpx.a.kXm, hdm2.kJH, hdm2.jXk.jWb);
        this.kge.cvC().a(true, this.kgk);
        this.j(this.kge);
        this.kgg = new hqz(this.kLu, null, hdm2.jXk.jWe, null, hpx.a.kXm, hdm2.kJH, hdm2.jXk.jWd);
        this.kgg.cvC().a(true, this.kgm);
        this.j(this.kgg);
        this.kgh = new hqz(this.kLu, null, hdm2.jXk.jWh, null, hpx.a.kXm, hdm2.kJH, hdm2.jXk.jWf);
        this.kgh.cvC().a(true, this.kgn);
        this.j(this.kgh);
        this.kgf = new hqt(this.kLu, (String)null, hdm2.jXk.jWj, hdm2.jXk.jWi.kLY, hdm2.kJI, "");
        this.kgf.cvC().a(true, this.kgl);
        this.j(this.kgf);
        this.kgo = 0;
        this.refresh();
    }

    public final boolean cgi() {
        return this.kgp;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    private void next() {
        if (this.kgo == this.kgi.size() - 1) {
            this.cgk();
        } else {
            ++this.kgo;
        }
        this.refresh();
    }

    private void cgj() {
        if (this.kgo > 0) {
            --this.kgo;
        }
        this.refresh();
    }

    private void refresh() {
        this.kgd.a(this.kgi.get(this.kgo));
        this.kgg.og(this.kgo == 0);
        this.kgh.a(this.kgo == this.kgi.size() - 1 ? this.cbO().jXk.jWg : this.cbO().jXk.jWf);
        this.kgf.nR(this.kgo != 0);
        this.kgf.on(!this.kgp);
    }

    private void cgk() {
        this.kgj.W();
    }

    private void cgl() {
        this.kgp = !this.kgp;
        this.refresh();
    }

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ boolean a(hey hey2) {
        return hey2.Initialized;
    }

    static /* synthetic */ void b(hey hey2) {
        hey2.cgk();
    }

    static /* synthetic */ void c(hey hey2) {
        hey2.cgl();
    }

    static /* synthetic */ void d(hey hey2) {
        hey2.cgj();
    }

    static /* synthetic */ void e(hey hey2) {
        hey2.next();
    }
}

