/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class hmt
extends hms {
    private final ArrayList<hms> kMk = new ArrayList();
    private final List<hms> kMl = Collections.unmodifiableList(this.kMk);
    private final lbn kMm = new lbn(this){
        final /* synthetic */ hmt kMo;
        {
            this.kMo = hmt2;
        }

        public final void W() {
            this.kMo.cis();
        }
    };
    private boolean Initialized;
    private hms kMn;

    public hmt(hnc hnc2, String string, lgg lgg2, lhf lhf2) {
        super(hnc2, string, lgg2, lhf2);
    }

    public final void j(hms hms2) {
        assert (hms2 != null);
        assert (!hms2.isInitialized());
        assert (!this.kMk.contains(hms2));
        hms2.b(this);
        this.q(hms2);
        if (this.Initialized) {
            hms2.initialize();
        }
    }

    public final List<hms> crn() {
        return this.kMl;
    }

    public final void a(hms hms2, hms hms3) {
        assert (this.Initialized);
        assert (this.n(hms2));
        assert (!hms3.isInitialized());
        int n = this.kMk.indexOf(hms2);
        assert (n != -1);
        lgs lgs2 = hms2.cqD();
        hms2.remove();
        hms3.cC(lgs2.rmN, lgs2.H);
        this.j(hms3);
        hms3.cB(lgs2.cf, lgs2.cg);
        this.b(hms3, n);
    }

    public final <C extends hms> C a(lgg lgg2, Class<C> clazz) {
        assert (this.Initialized);
        assert (hms.class.isAssignableFrom(clazz));
        return this.c(lgg2, clazz);
    }

    public final boolean b(hms hms2, lgg lgg2) {
        assert (this.Initialized);
        assert (this.n(hms2));
        lgg2 = hms2.a((hms)this, lgg2);
        return hms2.A(lgg2);
    }

    public final hms b(lgg lgg2, Class<?> clazz) {
        assert (this.Initialized);
        assert (hms.class.isAssignableFrom(clazz));
        for (int i = this.kMk.size() - 1; i >= 0; --i) {
            hmt hmt2;
            hms hms2;
            lgg lgg3;
            hms hms3 = this.kMk.get(i);
            if (!hms3.A(lgg3 = hms3.a((hms)this, lgg2))) continue;
            if (hms3 instanceof hmt && (hms2 = (hmt2 = (hmt)hms3).b(lgg3, clazz)) != null) {
                return hms2;
            }
            if (!clazz.isInstance(hms3)) continue;
            return hms3;
        }
        return null;
    }

    public final void k(hms hms2) {
        assert (this.n(hms2));
        this.b(hms2, this.kMk.size() - 1);
    }

    public final void l(hms hms2) {
        assert (this.n(hms2));
        this.b(hms2, 0);
    }

    public final int m(hms hms2) {
        assert (this.n(hms2));
        return this.kMk.indexOf(hms2);
    }

    public final void b(hms hms2, int n) {
        assert (this.n(hms2));
        int n2 = this.kMk.indexOf(hms2);
        assert (n2 != -1);
        if (n2 == n) {
            return;
        }
        hms hms3 = this.kMk.remove(n2);
        assert (hms3 == hms2);
        if (n >= this.kMk.size()) {
            n = this.kMk.size();
        }
        this.kMk.add(n, hms2);
        for (int i = Math.min(n, n2); i < this.kMk.size(); ++i) {
            hms hms4 = this.kMk.get(i);
            if (!hms4.isInitialized()) continue;
            hms4.cra();
        }
        if (this.Initialized) {
            this.crq();
        }
    }

    public final hms cro() {
        if (this.kMk.size() == 0) {
            return null;
        }
        return this.kMk.get(this.kMk.size() - 1);
    }

    public final boolean a(hms hms2, float f2) {
        return this.a(hms2, this.cqE(), f2);
    }

    public final boolean a(hms hms2, lgs lgs2, float f2) {
        return this.a(hms2, hms2.cqD(), lgs2, f2);
    }

    public final boolean a(hms hms2, lgs lgs2, lgs lgs3, float f2) {
        assert (this.n(hms2));
        lhf lhf2 = lgs3.y(lgs2);
        if (lhf2.rmN == 0 && lhf2.H == 0) {
            return false;
        }
        hms2.a(lhf2, f2);
        return true;
    }

    public final boolean n(hms hms2) {
        return hms2.cqt() == this;
    }

    public final boolean o(hms hms2) {
        assert (this.Initialized);
        if (this.n(hms2)) {
            return true;
        }
        hmt hmt2 = hms2.cqt();
        if (hmt2 == null) {
            return false;
        }
        return this.o(hmt2);
    }

    public final hms crp() {
        return this.kMn;
    }

    public final void p(hms hms2) {
        assert (hms2 == null || this.n(hms2));
        if (hms2 == this.kMn) {
            return;
        }
        if (hms2 == null) {
            lda.acc(1);
        }
        hms hms3 = this.kMn;
        this.nV(false);
        this.kMn = hms2;
        this.nV(true);
        if (hms3 != null && hms3.isInitialized()) {
            hms3.cqS();
        }
        if (hms2 != null && hms2.isInitialized()) {
            hms2.cqS();
        }
        if (this.isInitialized()) {
            this.crr();
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        if (this.kMk.size() > 0) {
            for (int i = 0; i < this.kMk.size(); ++i) {
                hms hms2 = this.kMk.get(i);
                hms2.initialize();
                this.a(true, hms2, 1);
            }
            this.crq();
        }
        this.mU(true);
        this.cqS();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.p(null);
        this.mU(false);
        ArrayList<hms> arrayList = new ArrayList<hms>(this.kMk);
        Collections.reverse(arrayList);
        for (hms hms2 : arrayList) {
            if (!hms2.isInitialized()) continue;
            hms2.cleanup();
            this.a(hms2, false);
        }
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cqW() {
        assert (this.Initialized);
        super.cqW();
        for (int i = 0; i < this.kMk.size(); ++i) {
            hms hms2 = this.kMk.get(i);
            hms2.crf();
        }
    }

    @Override
    protected void chd() {
        super.chd();
        for (hms hms2 : this.kMk) {
            hms2.nT(false);
        }
    }

    @Override
    protected void cfS() {
        assert (this.Initialized);
        super.cfS();
        for (hms hms2 : this.kMk) {
            hms2.cqz();
        }
    }

    @Override
    protected void cbu() {
        assert (this.Initialized);
        super.cbu();
        hms hms2 = this.a(this.cqu(), hms.class);
        if (hms2 != null) {
            hms2.cqI();
        }
    }

    @Override
    protected boolean LM(int n) {
        assert (this.Initialized);
        if (super.LM(n)) {
            return true;
        }
        if (this.kMn != null) {
            return this.kMn.Nj(n);
        }
        return false;
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        if (super.a(n, bl, set)) {
            return true;
        }
        hms hms2 = this.kMn;
        if (hms2 == null) {
            hms2 = this.cro();
        }
        if (hms2 != null) {
            return hms2.b(n, bl, set);
        }
        return false;
    }

    @Override
    protected boolean LN(int n) {
        assert (this.Initialized);
        if (super.LN(n)) {
            return true;
        }
        if (this.kMn != null) {
            return this.kMn.Ni(n);
        }
        return false;
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        hms hms2 = this.a(this.cqu(), hms.class);
        if (hms2 != null) {
            return hms2.cqJ();
        }
        return super.cfR();
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        if (!this.Initialized) {
            return;
        }
        hms hms2 = this.a(this.cqu(), hms.class);
        if (hms2 != null) {
            hms2.cqK();
        }
    }

    @Override
    protected void cbv() {
        assert (this.Initialized);
        super.cbv();
        if (!this.Initialized) {
            return;
        }
        hms hms2 = this.a(this.cqu(), hms.class);
        if (hms2 != null) {
            hms2.cqL();
        }
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        super.ccc();
        hms hms2 = this.a(this.cqu(), hms.class);
        if (hms2 != null && hms2.cqQ()) {
            hms2.cqM();
        }
    }

    @Override
    protected boolean g(hms hms2) {
        assert (this.Initialized);
        assert (hms2 != null);
        for (int i = 0; i < this.kMk.size(); ++i) {
            hms hms3 = this.kMk.get(i);
            if (hms3 == hms2) {
                return true;
            }
            if (!hms3.g(hms2)) continue;
            return true;
        }
        return false;
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        if (this.kMn != null) {
            this.kMn.cqS();
        }
    }

    @Override
    protected void b(boolean bl, hmr hmr2) {
        for (hms hms2 : this.kMk) {
            hms2.a(bl, hmr2);
        }
    }

    @Override
    protected void cqZ() {
        super.cqZ();
        for (hms hms2 : this.kMk) {
            hms2.cra();
        }
    }

    protected void a(boolean bl, hms hms2, int n) {
        assert (this.Initialized);
        assert (this.cqt() != this);
        hmt hmt2 = this.cqt();
        if (hmt2 != null) {
            hmt2.b(bl, hms2, n + 1);
        }
    }

    protected void crq() {
        assert (this.Initialized);
        this.kLu.crT();
    }

    protected void crr() {
    }

    protected void cis() {
        this.p(null);
    }

    protected <C extends hms> C c(lgg lgg2, Class<C> clazz) {
        int n = this.e(ldb.reo, lgg2.cf);
        int n2 = this.e(ldb.rep, lgg2.cg);
        for (int i = this.kMk.size() - 1; i >= 0; --i) {
            int n3;
            int n4;
            hms hms2 = this.kMk.get(i);
            if (!clazz.isInstance(hms2) || !hms2.contains(n4 = hms2.d(ldb.reo, n), n3 = hms2.d(ldb.rep, n2))) continue;
            return (C)hms2;
        }
        return null;
    }

    protected final void b(boolean bl, hms hms2, int n) {
        if (this.Initialized) {
            this.a(bl, hms2, n + 1);
        }
    }

    public final void q(hms hms2) {
        assert (this.n(hms2));
        assert (!this.kMk.contains(hms2));
        this.kMk.add(hms2);
        if (this.Initialized) {
            this.crq();
            this.a(true, hms2, 1);
        }
    }

    public final void a(hms hms2, boolean bl) {
        assert (this.n(hms2));
        assert (this.kMk.contains(hms2));
        if (bl && this.Initialized) {
            this.a(false, hms2, 1);
        }
        int n = this.kMk.indexOf(hms2);
        assert (n != -1);
        hms hms3 = this.kMk.remove(n);
        assert (hms3 == hms2);
        hms2.b((hmt)null);
        if (bl && this.Initialized) {
            this.crq();
        }
    }

    private void nV(boolean bl) {
        if (this.kMn != null) {
            this.kMn.cql().a(bl, this.kMm);
        }
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

