/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  bri
 *  cug
 *  mcs
 */
public class ajl
extends aja {
    private boolean bpK = false;
    private bqg bpL = null;
    private bqh[] bpM = null;
    private bsa bpN = null;

    public ajl() {
        this.bog = ajb.b.boM;
    }

    public final bqg CF() {
        return this.bpL;
    }

    public final bqh[] CG() {
        return this.bpM;
    }

    public final void CH() {
        assert (this.bpN != null);
        assert (this.bpN.avX() != null);
        assert (this.bpN.awJ() != null);
        assert (this.bpN.avX().length == this.bpN.awJ().length);
        bri bri2 = (bri)this.boj.aJz().bgQ().aJC().asf();
        if (bri2 == null) {
            return;
        }
        bri2.a(this.bpN, bqy.dHx);
    }

    @Override
    public final void reset() {
        super.reset();
        bqu bqu2 = this.boj.aJz().bgQ().aJC().asf().auo();
        if (this.bpL != null && this.bpL.dBJ != null) {
            brr brr2 = this.bpL.dBJ;
            assert (brr2.aCK != null);
            assert (brr2.dIW != null);
            if (!bqu2.a(brr2.aCK, brr2.dIW)) {
                // empty if block
            }
            this.bpL.dBJ = null;
        }
        if (this.bpM != null) {
            for (bqh object : this.bpM) {
                if (object == null) continue;
                for (bqg bqg2 : object.dBK) {
                    if (bqg2.dBJ == null) continue;
                    brr brr2 = bqg2.dBJ;
                    assert (brr2.aCK != null);
                    assert (brr2.dIW != null);
                    if (!bqu2.a(brr2.aCK, brr2.dIW)) {
                        // empty if block
                    }
                    bqg2.dBJ = null;
                }
            }
        }
        if (this.bpN != null && this.bpN.awJ() != null) {
            assert (this.bpN.avX() != null);
            assert (this.bpN.avX().length > 0);
            assert (this.bpN.awJ().length > 0);
            assert (this.bpN.avX().length == this.bpN.awJ().length);
            int n = this.bpN.avX().length;
            for (int i = 0; i < n; ++i) {
                ldv ldv2 = this.bpN.avX()[i].GUID;
                lef lef2 = this.bpN.awJ()[i];
                if (bqu2.a(ldv2, lef2)) continue;
            }
        }
        this.bpK = false;
        this.bpL = null;
        this.bpM = null;
        this.bpN = null;
    }

    @Override
    protected final boolean BU() {
        if (!this.bpK) {
            this.bok = null;
            if (this.CI()) {
                this.bpK = true;
            } else {
                this.bpL = null;
                this.bpM = null;
                this.bpN = null;
            }
        }
        return this.bpK;
    }

    private boolean a(bqg bqg2, bqk bqk2, boolean bl) {
        assert (bqg2 != null);
        assert (bqk2 != null);
        float f2 = this.boj.bfw();
        akp akp2 = bqg2.db(f2);
        if (!akp2.bqB) {
            this.bok = akp2.bok;
            return false;
        }
        if (!bl) {
            return true;
        }
        lef lef2 = bqk2.auo().iX(bqg2.dBI.getGUID());
        if (lef2 == null) {
            this.bok = mcs.uzp.bD(bqg2.dBI.az());
            return false;
        }
        bqg2.dBJ = new brr(bqg2.dBI.getGUID(), lef2);
        return true;
    }

    private boolean a(bqh bqh2, bqk bqk2, boolean bl) {
        assert (bqh2 != null);
        assert (bqk2 != null);
        float f2 = this.boj.bfw();
        akp akp2 = bqh2.dc(f2);
        if (!akp2.bqB) {
            this.bok = akp2.bok;
            return false;
        }
        if (!bl) {
            return true;
        }
        bqu bqu2 = bqk2.auo();
        for (bqg bqg2 : bqh2.dBK) {
            lef lef2 = bqu2.iX(bqg2.dBI.getGUID());
            if (lef2 == null) {
                this.bok = mcs.uzo.bD(bqg2.dBI.az());
                return false;
            }
            bqg2.dBJ = new brr(bqg2.dBI.getGUID(), lef2);
        }
        return true;
    }

    private boolean CI() {
        int n;
        assert (!this.bpK);
        assert (this.bpL == null);
        assert (this.bpM == null);
        assert (this.bpN == null);
        bqk bqk2 = this.boj.aJz().bgQ().aJC().asf();
        if (bqk2 == null) {
            return false;
        }
        boolean bl = this.boj.bfF();
        bre bre2 = (bre)bqk2;
        this.bpL = bre2.c(alc.a.brl);
        if (!this.a(this.bpL, bqk2, bl)) {
            return false;
        }
        this.bpM = new bqh[3];
        this.bpM[0] = bre2.c((alc.a)alc.a.brm).dBH;
        this.bpM[1] = bre2.c((alc.a)alc.a.brq).dBH;
        this.bpM[2] = bre2.c((alc.a)alc.a.bru).dBH;
        boolean bl2 = false;
        int n2 = this.bpM.length;
        for (n = 0; n < n2; ++n) {
            if (n == 1) {
                if (this.bpL.dBI.ad(1600) && this.bpM[n].auh()) {
                    this.bok = mcs.uzs.bD(this.bpL.dBI.az());
                    return false;
                }
            } else if (n == 2 && this.bpL.dBI.ad(1584) && this.bpM[n].auh()) {
                this.bok = mcs.uzt.bD(this.bpL.dBI.az());
                return false;
            }
            if (this.a(this.bpM[n], bqk2, bl)) {
                bl2 = true;
                continue;
            }
            this.bpM[n] = null;
        }
        if (!bl2) {
            return false;
        }
        n = 50;
        int n3 = this.bpM.length;
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.bpM[n2] == null) continue;
            n += 50;
        }
        this.bpN = this.a(bqk2, n);
        if (this.bpN == null) {
            this.bok = mcs.uzu.bD(n);
            return false;
        }
        return true;
    }

    private bsa a(bqk bqk2, int n) {
        assert (bqk2 != null);
        assert (n > 0);
        brh brh2 = this.boj.aJz().bgQ().aJC().asf().aup();
        if (brh2 == null) {
            return null;
        }
        boolean bl = this.boj.bfF();
        return brh2.a(cug.fkb, n, bqm.c.dEV, bl);
    }
}

