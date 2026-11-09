/*
 * Decompiled with CFR.
 */
public class hqw
extends hpx {
    private final hne kli;
    private boolean Initialized;
    private final a kZE;

    public hqw(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpx.a a2, a a3) {
        super(hnc2, string, lgg2, lhf2, a2, a3.kJH);
        Object object;
        Object object2;
        this.kli = new hne(a3.cwu(), a3.kNZ);
        this.kZE = a3;
        ldb[] ldbArray = ldb.values();
        int n = ldbArray.length;
        for (int i = 0; i < n; ++i) {
            object2 = ldbArray[i];
            object = this.kZE.kZF.get((int)object2.ordinal()).kOc;
            for (int j = 0; j < ((int[])object).length; ++j) {
                this.kli.a((ldb)((Object)object2), j, object[j]);
            }
        }
        for (int i = 0; i < this.kZE.kZF.get((int)ldb.rep.ordinal()).kOc.length; ++i) {
            for (n = 0; n < this.kZE.kZF.get((int)ldb.reo.ordinal()).kOc.length; ++n) {
                lhf lhf3 = this.kli.cF(i, n);
                object2 = this.kZE.kqB.fM(i, n).acS(0);
                object = new hpa(this.kLu, (String)null, this.kli.cG(i, n), lhf3, (lhu)object2);
                this.j((hms)object);
                this.kli.a(i, n, (hms)object);
            }
        }
    }

    public final lhv cS(int n, int n2) {
        assert (this.Initialized);
        return this.kZE.kqB.fM(n2, n);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.cvq();
        this.mU(true);
        this.ctH();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        if (!this.cty()) {
            return this.kLu.kNl;
        }
        return super.cfR();
    }

    @Override
    protected void cce() {
        super.cce();
        this.cvq();
    }

    @Override
    protected void ctH() {
        super.ctH();
        int n = this.cvH() ? 1 : 0;
        for (int i = 0; i < this.kZE.kqB.getRowCount(); ++i) {
            for (int j = 0; j < this.kZE.kqB.cst(); ++j) {
                hpa hpa2 = (hpa)this.kli.cE(i, j);
                lhu lhu2 = this.kZE.kqB.fM(i, j).acS(n);
                hpa2.a(lhu2);
            }
        }
    }

    private void cvq() {
        int n = 3;
        if (!this.kli.a(this.cqv(), n)) {
            // empty if block
        }
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

