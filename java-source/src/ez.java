/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  en
 *  ep
 */
import java.util.List;

public class ez
extends ex {
    private static final int PK = 0;
    private static final int PL = 1;
    private static final int PM = 2;
    private float[] PN = new float[3];
    private List<als> PG = null;
    private float PO = 0.0f;
    private float PP = 0.0f;
    private ep.a PQ = ep.a.Pg;

    public ez() {
        this.DP = 6;
    }

    public final ep.a gk() {
        return this.PQ;
    }

    public final void a(ep.a a2) {
        assert (a2 != null);
        if (this.PQ != ep.a.Pg && a2 != ep.a.Pg) {
            lfn.b(5, "SFModifiableFloatAttribute", "setAttributeBlockingType() Invalid blockingtype change provided for attribute '" + this.getName() + "'");
            lfn.b(5, "SFModifiableFloatAttribute", "setAttributeBlockingType() Old: " + (Object)((Object)this.PQ) + " New: " + (Object)((Object)a2));
            return;
        }
        this.PQ = a2;
        this.gn();
    }

    @Override
    public final ej fm() {
        ez ez2 = new ez();
        this.a(ez2);
        return ez2;
    }

    @Override
    public final float fN() {
        return this.Pz + this.PO;
    }

    public final float gl() {
        return this.Pz + this.PP;
    }

    @Override
    public final void p(float f2) {
        super.p(f2);
        if (this.PG != null && !this.PG.isEmpty()) {
            lfn.b(5, "SFModifiableFloatAttribute", "reset() Attribute '" + this.getName() + "' contains " + this.PG.size() + " modifiers.");
            int n = this.PG.size();
            for (int i = 0; i < n; ++i) {
                lfn.b(5, "SFModifiableFloatAttribute", "reset() " + this.PG.get(i));
            }
        }
        this.PN[0] = 0.0f;
        this.PN[1] = 0.0f;
        this.PN[2] = 0.0f;
        this.PO = 0.0f;
        this.PP = 0.0f;
    }

    @Override
    public final void o(float f2) {
        if (Float.isNaN(this.Pz)) {
            this.Pz = 1.0f;
        }
        if (this.Pz == f2) {
            return;
        }
        if (ep.aE((int)this.Type)) {
            if (this.fS() == null || this.fT() == null) {
                this.Pz = f2;
                return;
            }
        } else if (ep.aF((int)this.Type)) {
            if (this.fS() == null) {
                this.Pz = f2;
                return;
            }
        } else if (ep.aG((int)this.Type)) {
            lfn.b(5, "SFModifiableFloatAttribute", "setFloatValue() '" + this.getName() + "'");
        }
        boolean bl = false;
        switch (this.PQ) {
            case Pe: {
                bl = true;
                break;
            }
            case Pf: {
                if (!(f2 < this.Pz)) break;
                bl = true;
                break;
            }
            case Ph: {
                if (!(f2 > this.Pz)) break;
                bl = true;
                break;
            }
            case Pg: {
                bl = false;
                break;
            }
            default: {
                lfn.b(5, "SFModifiableFloatAttribute", "setFloatValue() Invalid attributeblockingtype found: " + (Object)((Object)this.PQ));
                return;
            }
        }
        if (bl) {
            return;
        }
        float f3 = this.fN();
        this.Pz = f2;
        boolean bl2 = this.PF;
        this.gm();
        if (bl2) {
            this.DQ.a(this, f3);
        }
    }

    private void gm() {
        assert (this.DQ != null);
        float f2 = this.fX();
        float f3 = this.fY();
        float f4 = this.fW();
        float f5 = this.PN[0] - this.PN[1];
        float f6 = this.Pz + this.PN[0];
        if (this.Pz > f2) {
            this.Pz = f2;
        }
        if (Float.isNaN(this.Pz)) {
            this.Pz = 0.0f;
        }
        if (f6 < f3) {
            if (this.gd() && this.PF) {
                ((en)this.DQ).a((ex)this);
            }
            if (this.Pz < f3 || this.gd()) {
                this.Pz = f3;
            }
            this.PO = f3 - this.Pz;
        } else if (f6 > f2) {
            if (this.gc() && this.PF) {
                ((en)this.DQ).a((et)this);
            }
            if (this.Pz + f5 > f2) {
                f5 = f2 - this.Pz;
            }
            this.PO = f5 + this.PN[1];
            if (this.Pz + this.PO > f4) {
                this.PO = f4 - this.Pz;
            }
        } else {
            this.PO = this.PN[0];
        }
        float f7 = f2;
        if (ep.ba((int)this.Type)) {
            f7 = f4;
        }
        this.PP = this.Pz + this.PN[2] > f7 ? f7 - this.Pz : (this.Pz + this.PN[2] < f3 ? f3 - this.Pz : this.PN[2]);
        this.PA = this.PO > 0.0f ? 3 : (this.PO < 0.0f ? 2 : 1);
    }

    public final void d(als als2) {
        assert (this.DQ != null);
        if (als2 == null) {
            lfn.b(5, "SFModifiableFloatAttribute", "addModifier() Modifier is null for attribute '" + this.getName() + "'");
            return;
        }
        assert (als2.BV() == this.Type);
        if (this.PG == null) {
            this.PG = lcn.abH(1);
        }
        this.PG.add(als2);
        this.gn();
    }

    public final void gn() {
        assert (this.DQ != null);
        if (!this.go()) {
            return;
        }
        float f2 = this.fN();
        this.gm();
        if (this.PF) {
            this.DQ.a(this, f2);
        }
    }

    public final als J(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFModifiableFloatAttribute", "getModifier() ModifierGUID is null for attribute '" + this.getName() + "'");
            return null;
        }
        if (this.PG != null) {
            int n = this.PG.size();
            for (int i = 0; i < n; ++i) {
                als als2 = this.PG.get(i);
                if (!als2.getGUID().equals(ldv2)) continue;
                return this.PG.get(i);
            }
        }
        return null;
    }

    public final List<als> gh() {
        return this.PG;
    }

    public final boolean e(als als2) {
        switch (this.PQ) {
            case Pe: {
                return true;
            }
            case Pf: {
                if (alv.gl(als2.DW())) {
                    return true;
                }
                return alv.gn(als2.DW()) && als2.DS() < 0.0f;
            }
            case Ph: {
                if (alv.gm(als2.DW())) {
                    return true;
                }
                return alv.gn(als2.DW()) && als2.DS() > 0.0f;
            }
            case Pg: {
                return false;
            }
        }
        lfn.b(5, "SFModifiableFloatAttribute", "isModifierBlocked() Invalid attributeblockingtype found: " + (Object)((Object)this.PQ));
        return true;
    }

    public final als K(ldv ldv2) {
        assert (this.DQ != null);
        if (ldv2 == null) {
            lfn.b(5, "SFModifiableFloatAttribute", "removeModifier() ModifierGUID is null for attribute '" + this.getName() + "'");
            return null;
        }
        als als2 = null;
        if (this.PG != null) {
            int n = this.PG.size();
            for (int i = 0; i < n; ++i) {
                als2 = this.PG.get(i);
                if (!als2.getGUID().equals(ldv2)) continue;
                this.PG.remove(i);
                this.gn();
                break;
            }
            if (this.PG != null && this.PG.isEmpty()) {
                this.PG = null;
            }
        }
        return als2;
    }

    private boolean go() {
        int n;
        int n2;
        if (this.PG == null) {
            if (this.PN[0] == 0.0f && this.PN[2] == 0.0f && this.PN[1] == 0.0f) {
                return false;
            }
            this.PN[0] = 0.0f;
            this.PN[2] = 0.0f;
            this.PN[1] = 0.0f;
            return true;
        }
        float[] fArray = new float[8];
        int n3 = this.PG.size();
        for (n2 = 0; n2 < n3; ++n2) {
            als als2 = this.PG.get(n2);
            if (this.e(als2) || (n = als2.DW()) == 0) continue;
            if (n == 1) {
                int n4 = n;
                fArray[n4] = fArray[n4] + als2.DS();
                continue;
            }
            if (alv.gl(n)) {
                if (!(fArray[n] > als2.DS())) continue;
                fArray[n] = als2.DS();
                continue;
            }
            if (!alv.gm(n) || !(fArray[n] < als2.DS())) continue;
            fArray[n] = als2.DS();
        }
        n2 = ep.ba((int)this.Type) ? 1 : 0;
        float[] fArray2 = new float[3];
        n = 8;
        for (int i = 0; i < n; ++i) {
            if (i == 0) continue;
            fArray2[0] = fArray2[0] + fArray[i];
            if (i == 1) continue;
            if (i == 6 || i == 7) {
                fArray2[2] = fArray2[2] + fArray[i];
            }
            if (n2 == 0) continue;
            fArray2[1] = fArray2[1] + fArray[i];
        }
        if (fArray2[0] != this.PN[0] || fArray2[2] != this.PN[2] || fArray2[1] != this.PN[1]) {
            this.PN = fArray2;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof ez)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ez ez2 = (ez)object;
        return this.PO == ez2.PO;
    }
}

