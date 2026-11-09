/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  cxd
 *  ep
 */
import java.util.List;

public class ey
extends eq {
    private List<alr> PG = null;
    private boolean PH = false;
    private boolean PF = true;
    private ldv PI = null;
    private int PJ = 0;

    public ey() {
        this.DP = 2;
    }

    public final boolean fU() {
        return this.PF;
    }

    public final void y(boolean bl) {
        if (this.PF == bl) {
            return;
        }
        if (!bl || this.DQ == null) {
            this.PF = bl;
            return;
        }
        assert (bl);
        this.gj();
        this.PF = true;
        this.DQ.a(this, this.getBooleanValue());
    }

    public ldv ge() {
        return this.PI;
    }

    public void G(ldv ldv2) {
        this.PI = ldv2;
    }

    public int gf() {
        return this.PJ;
    }

    public void bj(int n) {
        this.PJ = n;
    }

    @Override
    public final ej fm() {
        ey ey2 = new ey();
        this.a(ey2);
        return ey2;
    }

    @Override
    public final boolean getBooleanValue() {
        if (this.PG != null) {
            return this.PH;
        }
        return this.Pp;
    }

    public final boolean gg() {
        return this.Pp;
    }

    public final void initialize() {
        this.PH = this.Pp;
    }

    @Override
    public final void x(boolean bl) {
        if (this.Pp == bl) {
            return;
        }
        if (this.DQ == null) {
            this.Pp = bl;
            return;
        }
        boolean bl2 = this.Pp;
        this.Pp = bl;
        if (this.PG == null && this.PF) {
            this.DQ.a(this, bl2);
        }
    }

    public final void b(alr alr2) {
        cex cex2;
        cbx cbx2;
        assert (this.DQ != null);
        if (alr2 == null) {
            lfn.b(5, "SFModifiableBooleanAttribute", "addModifier() Modifier is null for attribute '" + this.getName() + "'");
            return;
        }
        assert (alr2.BV() == this.Type);
        if (this.PG == null) {
            this.PG = lcn.abH(1);
        }
        this.PG.add(alr2);
        if (this.Type == 1376) {
            this.PI = null;
            this.PJ = 0;
        }
        if (this.Type == 12032 && (cbx2 = this.DQ.fp()) instanceof cex) {
            cex2 = (cex)cbx2;
            cex2.aML().b(alr2.DZ(), alr2.DV());
        }
        if (ep.be((int)this.Type) && (cbx2 = this.DQ.fp()) instanceof cex && (cex2 = (cex)cbx2).aJz() != null) {
            cex2.aJz().J(cxd.xp((int)this.Type));
        }
        this.gj();
    }

    public final alr H(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFModifiableBooleanAttribute", "getModifier() ModifierGUID is null for attribute '" + this.getName() + "'");
            return null;
        }
        if (this.PG != null) {
            int n = this.PG.size();
            for (int i = 0; i < n; ++i) {
                alr alr2 = this.PG.get(i);
                if (!alr2.getGUID().equals(ldv2)) continue;
                return this.PG.get(i);
            }
        }
        return null;
    }

    public final List<alr> gh() {
        return this.PG;
    }

    public final alr I(ldv ldv2) {
        assert (this.DQ != null);
        if (ldv2 == null) {
            lfn.b(5, "SFModifiableBooleanAttribute", "removeModifier() ModifierGUID is null for attribute '" + this.getName() + "'");
            return null;
        }
        alr alr2 = null;
        if (this.PG != null) {
            int n = this.PG.size();
            for (int i = 0; i < n; ++i) {
                alr2 = this.PG.get(i);
                if (!alr2.getGUID().equals(ldv2)) continue;
                this.PG.remove(i);
                this.gj();
                break;
            }
            if (this.PG.isEmpty()) {
                this.PG = null;
            }
        }
        if (alr2 == null) {
            lfn.b(5, "SFModifiableBooleanAttribute", "removeModifier() Could not find modifier " + ldv2);
        }
        return alr2;
    }

    private boolean gi() {
        if (this.PG == null) {
            return false;
        }
        int n = 0;
        int n2 = this.PG.size();
        for (int i = 0; i < n2; ++i) {
            alr alr2 = this.PG.get(i);
            if (alr2.DR()) {
                ++n;
                continue;
            }
            --n;
        }
        if (n > 0) {
            return true;
        }
        if (n < 0) {
            return false;
        }
        return this.Pp;
    }

    private void gj() {
        boolean bl = this.gi();
        if (bl == this.PH) {
            return;
        }
        boolean bl2 = this.PH;
        this.PH = bl;
        if (this.PF) {
            this.DQ.a(this, bl2);
        }
    }
}

