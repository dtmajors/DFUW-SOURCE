/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cug
 */
import java.util.Map;

public class bqu {
    private static final boolean dFn = true;
    private bqk dFo = null;
    private Map<ldv, brs> bii = lcn.emw();
    private brs dFp = null;
    private lef dFq = null;

    public bqu(bqk bqk2) {
        assert (bqk2 != null);
        assert (bqk2.getGUID() != null);
        this.dFo = bqk2;
        brq brq2 = new brq();
        brq2.setGUID(this.dFo.getGUID());
        this.dFp = new brs();
        this.dFp.c(brq2);
    }

    public final Map<ldv, brs> AN() {
        return this.bii;
    }

    public final boolean avf() {
        return this.iW(this.dFp.awo().getGUID());
    }

    public final boolean avg() {
        if (this.dFq == null) {
            return false;
        }
        boolean bl2 = this.a(this.dFp.awo().getGUID(), this.dFq);
        if (!bl2) {
            return false;
        }
        this.dFq = null;
        return true;
    }

    public final boolean avh() {
        return this.dT(false);
    }

    public final boolean dT(boolean bl2) {
        if (this.dFq != null) {
            return false;
        }
        if (bl2 && this.avi()) {
            return false;
        }
        this.dFq = this.iX(this.dFp.awo().getGUID());
        return this.dFq != null;
    }

    public final boolean iU(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        if (this.iW(ldv2)) {
            return false;
        }
        brs brs2 = this.iZ(ldv2);
        if (brs2 != null) {
            assert (brs2.awo() != null);
            assert (brs2.awo() instanceof brq);
            assert (((brq)brs2.awo()).awl() == null);
            if (brs2.Ba()) {
                return false;
            }
        }
        return true;
    }

    public final lef iV(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        if (!this.dFo.iE(ldv2)) {
            return null;
        }
        this.avj();
        brs brs2 = this.iZ(ldv2);
        if (brs2 == null) {
            return null;
        }
        assert (brs2.awo() != null);
        assert (brs2.awo() instanceof brq);
        brq brq2 = (brq)brs2.awo();
        if (brq2.awl() == null) {
            return null;
        }
        return brq2.awl().dAy;
    }

    public final boolean avi() {
        this.avj();
        return this.dFp.Ba();
    }

    public final boolean iW(ldv ldv2) {
        return this.A(ldv2, true);
    }

    public final boolean A(ldv ldv2, boolean bl2) {
        if (ldv2 == null) {
            return false;
        }
        if (!this.dFo.iE(ldv2)) {
            return false;
        }
        this.avj();
        bsd bsd2 = this.dFo.aun().jl(ldv2);
        if (bsd2 == null) {
            return false;
        }
        int n = bsd2.awN().size();
        for (int i = 0; i < n; ++i) {
            brs brs2;
            brm brm2;
            brs brs3 = bsd2.awN().get(i);
            ldv ldv3 = brs3.awo().getGUID();
            if (i == n - 1) {
                bqs bqs2;
                assert (brs3.awo() instanceof bsb);
                assert (brs3.awo().getGUID().equals(this.dFo.getGUID()));
                boolean bl3 = false;
                brm2 = this.dFo.iF(ldv2);
                if (brm2 != null && brm2 instanceof bqs && (bqs2 = (bqs)brm2) != null) {
                    bl3 = cug.wH((int)bqs2.az());
                }
                if (!bl2 || bl3) break;
            }
            if ((brs2 = this.iZ(ldv3)) == null) continue;
            assert (brs2.awo() != null);
            assert (brs2.awo().getGUID() != null);
            assert (brs2.awo() instanceof brq);
            brm2 = (brq)brs2.awo();
            if (((brq)brm2).awl() == null) continue;
            return true;
        }
        return false;
    }

    public final boolean a(ldv ldv2, lef lef2) {
        if (ldv2 == null) {
            return false;
        }
        if (lef2 == null) {
            return false;
        }
        this.avj();
        brs brs2 = this.iZ(ldv2);
        if (brs2 == null) {
            return false;
        }
        assert (brs2.awo() != null);
        assert (brs2.awo() instanceof brq);
        brq brq2 = (brq)brs2.awo();
        if (brq2.awl() == null) {
            return false;
        }
        if (!brq2.awl().dJf.equals(ldv2)) {
            return false;
        }
        if (!brq2.awl().dAy.equals(lef2)) {
            return false;
        }
        brq2.a(null);
        return true;
    }

    public final lef iX(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        if (this.iW(ldv2)) {
            return null;
        }
        brs brs2 = this.iZ(ldv2);
        if (brs2 == null) {
            brs2 = this.iY(ldv2);
            if (brs2 == null) {
                return null;
            }
        } else {
            assert (brs2.awo() != null);
            assert (brs2.awo() instanceof brq);
            assert (((brq)brs2.awo()).awl() == null);
            if (brs2.Ba()) {
                return null;
            }
        }
        brq brq2 = (brq)brs2.awo();
        brq2.a(new bry(ldv2));
        return brq2.awl().dAy;
    }

    public final boolean b(ldv ldv2, lef lef2) {
        if (ldv2 == null) {
            return false;
        }
        if (lef2 == null) {
            return false;
        }
        lef lef3 = this.iV(ldv2);
        if (lef3 == null) {
            return false;
        }
        return lef3.equals(lef2);
    }

    private void avj() {
        assert (this.dFp != null);
        assert (this.dFp.awo() != null);
        this.b(this.dFp);
    }

    private boolean b(brs brs2) {
        Object object;
        assert (brs2 != null);
        assert (brs2.awo() != null);
        assert (brs2.awo() instanceof brq);
        if (brs2.Ba()) {
            object = brs2.AY().iterator();
            while (object.hasNext()) {
                brs brs3 = (brs)object.next();
                boolean bl2 = this.b(brs3);
                if (!bl2) continue;
                brq brq2 = (brq)brs3.awo();
                assert (!brq2.awm());
                assert (this.bii.containsKey(brq2.getGUID()));
                this.bii.remove(brs3.awo().getGUID());
                object.remove();
            }
        }
        if (((brq)(object = (brq)brs2.awo())).awm()) {
            return false;
        }
        return !brs2.Ba();
    }

    private brs iY(ldv ldv2) {
        assert (ldv2 != null);
        bsd bsd2 = this.dFo.aun().jl(ldv2);
        if (bsd2 == null) {
            return null;
        }
        brs brs2 = null;
        for (int i = 0; i < bsd2.awN().size(); ++i) {
            brs brs3 = bsd2.awN().get(i);
            assert (brs3.awo() != null);
            assert (brs3.awo().getGUID() != null);
            brs brs4 = this.iZ(brs3.awo().getGUID());
            if (brs4 != null) {
                assert (brs2 != null);
                assert (brs2.awo() != null);
                assert (brs2.awo().getGUID() != null);
                assert (brs2.awo() instanceof brq);
                assert (((brq)brs2.awo()).awl() == null);
                brs4.i(brs2);
                break;
            }
            brq brq2 = new brq();
            brq2.setGUID(brs3.awo().getGUID());
            brs4 = new brs();
            brs4.c(brq2);
            brq2.c(brs4);
            this.bii.put(brq2.getGUID(), brs4);
            if (brs2 != null) {
                brs4.i(brs2);
            }
            brs2 = brs4;
        }
        brs brs5 = this.iZ(ldv2);
        assert (brs5 != null);
        assert (brs5.awo() != null);
        assert (brs5.awo().getGUID().equals(ldv2));
        assert (brs5.awn() != null);
        return brs5;
    }

    private brs iZ(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        if (this.dFp.awo().getGUID() != null && this.dFp.awo().getGUID().equals(ldv2)) {
            return this.dFp;
        }
        return this.bii.get(ldv2);
    }
}

