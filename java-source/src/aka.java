/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public abstract class aka
extends aja
implements ajc {
    private int[] bqd = null;
    private bqm.c bqe = null;
    private ajb.c bqf = null;
    private dch bqg = null;
    private int bqh = 0;
    private bsa bqi = null;
    private int bqj = -1;

    public final int[] CX() {
        return this.bqd;
    }

    public final void g(int[] nArray) {
        this.bqd = nArray;
    }

    public final bqm.c CY() {
        return this.bqe;
    }

    public final void a(bqm.c c2) {
        this.bqe = c2;
    }

    public final ajb.c CZ() {
        return this.bqf;
    }

    public final void a(ajb.c c2) {
        this.bqf = c2;
    }

    public final dch Da() {
        return this.bqg;
    }

    public final void a(dch dch2) {
        assert (dch2 != null);
        this.bqg = dch2;
        this.bqg.a(this);
    }

    public final int Db() {
        if (this.bqh == 0) {
            assert (this.bqi == null);
            this.bqh = this.Dd();
        }
        return this.bqh;
    }

    public final bsa Dc() {
        if (this.bqi == null) {
            this.bqi = this.De();
            if (this.bqi == null) {
                // empty if block
            }
        }
        return this.bqi;
    }

    public final String pa() {
        return this.fQ(this.bqj);
    }

    public final String fQ(int n) {
        assert (n == 0 || n == 1);
        return lea.enW().getName(this.bqd[n]);
    }

    @Override
    public final void reset() {
        super.reset();
        this.bqh = 0;
        if (this.bqi != null && this.bqi.awJ() != null) {
            assert (this.bqi.avX() != null);
            assert (this.bqi.avX().length > 0);
            assert (this.bqi.awJ().length > 0);
            assert (this.bqi.avX().length == this.bqi.awJ().length);
            bqu bqu2 = this.boj.aJz().bgQ().aJC().asf().auo();
            int n = this.bqi.avX().length;
            for (int i = 0; i < n; ++i) {
                ldv ldv2 = this.bqi.avX()[i].GUID;
                lef lef2 = this.bqi.awJ()[i];
                if (bqu2.a(ldv2, lef2)) continue;
            }
        }
        this.bqi = null;
        this.bqj = -1;
    }

    @Override
    protected final boolean BU() {
        bsa bsa2 = this.Dc();
        if (bsa2 == null) {
            return false;
        }
        assert (this.bqh > 0);
        assert (bsa2.az() == this.bqd[this.bqj]);
        assert (bsa2.vf() >= this.bqh);
        return true;
    }

    protected abstract int Dd();

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aka aka2 = (aka)aja2;
        aka2.g(this.bqd);
        aka2.a(this.bqe);
        aka2.a(this.bqf);
        if (this.bqg != null) {
            aka2.a((dch)this.bqg.bjr());
        }
    }

    private bsa De() {
        assert (this.bqi == null);
        this.bok = null;
        if (this.boj.aJz() == null || this.boj.aJz().bgQ() == null || this.boj.aJz().bgQ().aJC() == null || this.boj.aJz().bgQ().aJC().asf() == null) {
            return null;
        }
        int n = this.Db();
        if (n <= 0) {
            return null;
        }
        brh brh2 = this.boj.aJz().bgQ().aJC().asf().aup();
        if (brh2 == null) {
            return null;
        }
        boolean bl = false;
        if (this.boj.bfF() && this.Cs()) {
            switch (this.bqf) {
                case bpu: {
                    bl = false;
                    break;
                }
                case bpv: {
                    bl = true;
                    break;
                }
                case bpw: {
                    assert (this.bqg != null);
                    bl = true;
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        int n2 = this.bqd.length;
        for (int i = 0; i < n2; ++i) {
            bsa bsa2 = brh2.a(this.bqd[i], n, this.bqe, bl);
            if (bsa2 == null) continue;
            this.bqj = i;
            return bsa2;
        }
        switch (this.bqe) {
            case dEU: {
                assert ((float)n == 1.0f);
                this.bok = mcs.uBh.bD(this.bqd[0], this.bqd[1]);
                break;
            }
            case dEV: {
                this.bok = mcs.uBi.bD(n, this.bqd[0], this.bqd[1]);
                break;
            }
            case dEW: {
                assert ((float)n == 1.0f);
                this.bok = mcs.uBj.bD(this.bqd[0], this.bqd[1]);
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    @Override
    public final void Ca() {
        if (this.bqg != null) {
            this.bqg.Ca();
        }
    }
}

