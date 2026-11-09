/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class hop<ROW, FIELD, ROW_COMPONENT extends hms, FIELD_COMPONENT extends hms>
extends hoi<FIELD, FIELD_COMPONENT> {
    private final b kSO;
    private final hrd<ROW, FIELD> kSP;
    private final ArrayList<ROW_COMPONENT> kSQ = new ArrayList();
    public final List<ROW_COMPONENT> kSR = Collections.unmodifiableList(this.kSQ);
    private boolean Initialized;

    public hop(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, hrd<ROW, FIELD> hrd2, hmw[] hmwArray) {
        this(hnc2, string, lgg2, lhf2, b2, hrd2, new hrc<ROW, FIELD>(hrd2), hmwArray);
    }

    private hop(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, hrd<ROW, FIELD> hrd2, hrc<ROW, FIELD> hrc2, hmw[] hmwArray) {
        super(hnc2, string, lgg2, lhf2, b2.kKu, hrc2, hmwArray);
        this.kSO = b2;
        assert (lda.by(this.kSO));
        this.kSP = hrd2;
    }

    public final lbl<lbn> cug() {
        return super.cuc();
    }

    public final int Nz(int n) {
        return this.cuj().No(n);
    }

    public final void cN(int n, int n2) {
        this.cuj().cD(n, n2);
    }

    public final int cuh() {
        return super.l(ldb.rep);
    }

    public final int cui() {
        return super.l(ldb.reo);
    }

    public final boolean NA(int n) {
        return n == this.cuh();
    }

    public final boolean g(int n, ROW ROW) {
        return this.kSP.e(n, ROW);
    }

    public final void NB(int n) {
        int n2 = this.cvy().cf;
        lgs lgs2 = new lgs(n2, this.c(ldb.rep, n), this.getWidth() - n2, this.f(ldb.rep, n));
        this.l(lgs2);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.oh(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.oh(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected void f(int n, int n2, int n3, int n4) {
        hms hms2;
        int n5;
        int n6;
        assert (this.Initialized);
        assert (n2 >= 0 && n2 <= n4);
        assert (n >= 0 && n <= n3);
        int n7 = this.kSQ.size();
        for (n6 = n5 = n3 - n + 1; n6 < n7; ++n6) {
            hms2 = (hms)this.kSQ.get(n6);
            if (hms2 == null) continue;
            hms2.remove();
        }
        hop.a(this.kSQ, n5);
        for (n6 = n7; n6 < n5; ++n6) {
            hms2 = this.NC(n6);
            this.kSQ.set(n6, hms2);
            if (hms2 == null) continue;
            this.j(hms2);
        }
        super.f(n, n2, n3, n4);
    }

    protected abstract ROW_COMPONENT NC(int var1);

    private static <E> void a(ArrayList<E> arrayList, int n) {
        while (arrayList.size() > n) {
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < n) {
            arrayList.add(null);
        }
    }

    private hmy cuj() {
        return (hmy)this.k(ldb.reo);
    }

    private void oh(boolean bl) {
        assert (lda.yk(bl));
    }
}

