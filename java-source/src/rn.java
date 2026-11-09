/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class rn
extends qd {
    private ps[] aBz;
    private boolean aPS = false;
    private Set<Integer>[] aPT = null;
    private Set<Integer>[] aPU = null;
    private Set<Integer> aPV = null;
    private Set<Integer> aPW = null;

    public rn(md md2) {
        super(md2, me.axm);
        this.Active = true;
    }

    public void a(ps[] psArray) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerLoadAllPSO", "setGamelogicServerList: Can't modify while working");
            assert (false);
            return;
        }
        this.aBz = psArray;
    }

    @Override
    protected void sO() {
        this.aPV = lcn.emH();
        this.aPW = lcn.emH();
        this.aPT = new Set[this.aBz.length];
        this.aPU = new Set[this.aBz.length];
        for (int i = 0; i < this.aBz.length; ++i) {
            ps ps2 = this.aBz[i];
            ta ta2 = this.f(new ta((md)this, ps2.sJ()));
            ta2.start();
        }
    }

    @Override
    protected void sP() {
        this.aPS = false;
        this.aPV = null;
        this.aPW = null;
        this.aPU = null;
        this.aPU = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2 instanceof ta) {
            ta ta2 = (ta)qe2;
            if (ta2.sS()) {
                this.aPS = true;
            } else if (!this.aPS) {
                te te2 = this.f(new te(this, this.aBz[ta2.aAB], ta2.up()));
                te2.start();
            }
            this.e(ta2);
        } else if (qe2 instanceof te) {
            te te3 = (te)qe2;
            this.aPT[te3.sJ()] = te3.us();
            this.aPU[te3.sJ()] = te3.ut();
            this.aPW.addAll(te3.ut());
            this.aPV.addAll(te3.us());
            if (te3.sS()) {
                this.aPS = true;
            }
            this.e(te3);
        }
        if (this.su() == 0) {
            if (this.aPS) {
                this.ca("Unable to load PSOs");
                return;
            }
            if (this.aPW.size() * 200 > this.aPV.size()) {
                this.ca("More than 0.5% of characters failed to load");
            } else {
                this.ca(null);
            }
        }
    }

    public final Set<Integer> cT(int n) {
        return this.aPT[n];
    }

    public final Set<Integer> cU(int n) {
        return this.aPU[n];
    }

    public final Set<Integer> tI() {
        return this.aPV;
    }

    public final Set<Integer> tJ() {
        return this.aPW;
    }
}

