/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class ago
extends aia {
    private bqm.b big = null;
    private float bih = 0.0f;
    private Map<ldv, agu> bii = lcn.emw();
    private agu bij = null;

    public ago() {
        super(3);
        agg agg2 = new agg(true);
        agg2.eS(this.BK());
        agg2.setGUID(null);
        agg2.eP(4);
        this.bij = new agu();
        this.bij.a(agg2);
    }

    public final void a(bqm.b b2) {
        this.big = b2;
    }

    public final void Z(float f) {
        this.bih = f;
    }

    public final Map<ldv, agu> AN() {
        return this.bii;
    }

    public final agu AO() {
        return this.bij;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "InventoryType";
            }
            case 2: {
                return "InventoryMaxWeight";
            }
        }
        return super.eB(n);
    }

    @Override
    public final void a(int n, int n2, List<uk> list) {
        vd vd2;
        Integer n3;
        if (this.bls == ahu.c.bms && (n3 = (Integer)this.bmZ.get(this.bij.AZ().AK())) > n2 && (vd2 = this.bij.AZ().eD(n2)) != null) {
            list.add(vd2);
        }
        this.a(this.bij, n2, list);
        Collections.sort(list);
    }

    @Override
    public final void b(int n, int n2, List<uk> list) {
    }

    @Override
    public void a(gym gym2, int n) {
        assert (gym2 != null);
        assert (n >= 0);
        switch (gym2.bEz()) {
            case 12053: {
                gyk gyk2 = (gyk)gym2;
                if ((gyk2.ija & 1) <= 0) break;
                if (gyk2.bih <= 0.0f) {
                    return;
                }
                if (this.bih == gyk2.bih) {
                    return;
                }
                this.bih = gyk2.bih;
                this.L(2, n);
                this.BE();
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.big.ordinal();
                return uh2;
            }
            case 2: {
                ue ue2 = new ue();
                ue2.Uo = n;
                ue2.Pz = this.bih;
                return ue2;
            }
        }
        return super.G(n, n2);
    }

    private void a(agu agu2, int n, List list) {
        assert (agu2 != null);
        assert (list != null);
        if (!agu2.Ba()) {
            return;
        }
        int n2 = agu2.AY().size();
        for (int i = 0; i < n2; ++i) {
            vd vd2;
            agu agu3 = agu2.AY().get(i);
            agt agt2 = agu3.AZ();
            Integer n3 = (Integer)this.bmZ.get(agt2.AK());
            if (n3 > n && (vd2 = agt2.eD(n)) != null) {
                if (vd2 instanceof vd) {
                    vd vd3 = vd2;
                    if ((vd3.aXP & 1) <= 0 || (vd3.aXP & 4) > 0) {
                        // empty if block
                    }
                }
                list.add(vd2);
            }
            if (!agu3.Ba()) continue;
            if (agu3.AZ().AL()) {
                // empty if block
            }
            this.a(agu3, n, list);
        }
    }

    private boolean AP() {
        if (this.SW == null) {
            return false;
        }
        if (this.bls != ahu.c.bms) {
            return false;
        }
        if (this.blt.afj == 2) {
            return true;
        }
        return this.blt.afj == 4;
    }

    protected final void a(agu agu2, agu agu3) {
        assert (agu2 != null);
        assert (agu3 != null);
        assert (agu2.AZ() != null);
        assert (agu2.AZ().getGUID() != null);
        ldv ldv2 = agu2.AZ().getGUID();
        if (this.cF(ldv2)) {
            // empty if block
        }
        agu3.d(agu2);
        this.bii.put(ldv2, agu2);
        if (this.AP()) {
            this.SW.a(ldv2, this);
        }
    }

    protected final void a(agu agu2) {
        assert (agu2 != null);
        assert (agu2.AZ() != null);
        assert (agu2.AZ().getGUID() != null);
        ldv ldv2 = agu2.AZ().getGUID();
        assert (this.cF(ldv2));
        if (this.AP()) {
            this.SW.a(ldv2, this);
        }
    }

    protected final boolean cF(ldv ldv2) {
        assert (ldv2 != null);
        return this.bii.containsKey(ldv2);
    }

    protected final agu cG(ldv ldv2) {
        assert (ldv2 != null);
        if (this.bij.AZ().getGUID() != null && this.bij.AZ().getGUID().equals(ldv2)) {
            return this.bij;
        }
        return this.bii.get(ldv2);
    }

    protected final void cH(ldv ldv2) {
        assert (ldv2 != null);
        if (this.AP()) {
            this.SW.b(ldv2, this);
        }
    }

    protected final void cI(ldv ldv2) {
        assert (ldv2 != null);
        agu agu2 = this.cG(ldv2);
        assert (agu2 != null);
        assert (agu2.AZ() != null);
        assert (agu2.AZ().getGUID() != null);
        assert (agu2.AX() != null);
        agu2.AX().f(agu2);
        this.bii.remove(ldv2);
    }
}

