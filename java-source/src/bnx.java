/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 */
import java.util.List;

public abstract class bnx
extends btk
implements brb {
    protected int bie = 0;
    protected float bif = 1.0f;
    protected float dwK = 1.0f;
    protected brl dwL = null;
    protected List<bnp> dwM = lcn.abH(8);
    private ldv dtj = null;
    protected String ayB = null;

    @Override
    public ldv asa() {
        return this.getGUID();
    }

    @Override
    public int asb() {
        return 0;
    }

    public bnx() {
        this.ObjectType = 65;
    }

    public final int asc() {
        return this.bie;
    }

    public final void fa(int n) {
        this.bie = n;
    }

    public final float asd() {
        return this.bif;
    }

    public final void Y(float f2) {
        this.bif = f2;
    }

    public final float ase() {
        return this.dwK;
    }

    public final void cY(float f2) {
        this.dwK = f2;
    }

    public bqk asf() {
        return this.dwL;
    }

    public brl asg() {
        return this.dwL;
    }

    public final ldv Uj() {
        return this.dtj;
    }

    public final void hZ(ldv ldv2) {
        this.dtj = ldv2;
    }

    public final String getVendorName() {
        return this.ayB;
    }

    public final void fS(String string) {
        this.ayB = string;
    }

    @Override
    public final void addRelation(dul dul2) {
        switch (dul2.getRelationType()) {
            case 1029: {
                amf amf2 = this.MessageDelegator.d(dul2.Br());
                if (amf2 == null) {
                    lfn.b(5, "SFInteractionManager", "addRelation() EndPoint " + dul2.Br() + " of relation is null.");
                    return;
                }
                if (!(amf2 instanceof bnp)) {
                    lfn.b(5, "SFInteractionManager", "addRelation() EndPoint " + dul2.Br() + " is not an interactionlogic: " + amf2.getClass().getName());
                    return;
                }
                bnp bnp2 = (bnp)amf2;
                this.b(bnp2);
                break;
            }
            case 1030: {
                amf amf3 = this.MessageDelegator.d(dul2.Br());
                if (amf3 instanceof brl) {
                    this.dwL = (brl)((Object)amf3);
                    this.dwL.a(this);
                    this.asi();
                    break;
                }
                lfn.b(5, "SFInteractionManager", "addRelation() EndPoint " + dul2.Br() + " is not an inventory: " + amf3.getClass().getName());
                break;
            }
            default: {
                super.addRelation(dul2);
            }
        }
    }

    public final boolean ash() {
        return this.ll(1);
    }

    @Override
    public final void removeRelation(dul dul2) {
        switch (dul2.getRelationType()) {
            case 1029: {
                bnp bnp2 = this.ia(dul2.Br());
                if (bnp2 == null) {
                    lfn.b(5, "SFInteractionManager", "removeRelation() InteractionLogic " + dul2.Br() + " was not found.");
                    return;
                }
                this.c(bnp2);
                break;
            }
            case 1030: {
                if (this.dwL == null) break;
                if (!this.dwL.getGUID().equals(dul2.Br())) {
                    lfn.b(5, "SFInteractionManager", "removeRelation() Inventory " + this.dwL.getGUID() + " does not equal EndPoint " + dul2.Br());
                    return;
                }
                this.dwL.a(null);
                this.dwL = null;
                this.asj();
                break;
            }
            default: {
                super.removeRelation(dul2);
            }
        }
    }

    protected void asi() {
    }

    protected void asj() {
    }

    public final void b(bnp bnp2) {
        if (this.ll(bnp2.arW())) {
            lfn.b(5, "SFInteractionManager", "addInteractionLogic() InteractionManager " + this.GUID + " already contains interactionlogic of type " + bnp2.arW());
            return;
        }
        this.dwM.add(bnp2);
        if (!this.Initialized) {
            return;
        }
        bnp2.b(this);
        if ((this.bie & bnp2.arW()) <= 0) {
            this.bie |= bnp2.arW();
        }
        this.d(bnp2);
    }

    public final bnp lk(int n) {
        int n2 = this.dwM.size();
        for (int i = 0; i < n2; ++i) {
            bnp bnp2 = this.dwM.get(i);
            if (bnp2.arW() != n) continue;
            return bnp2;
        }
        lfn.b(5, "SFInteractionManager", "getInteractionLogic() InteractionLogic with type=" + n + " was not found.");
        return null;
    }

    public final bnp ia(ldv ldv2) {
        int n = this.dwM.size();
        for (int i = 0; i < n; ++i) {
            bnp bnp2 = this.dwM.get(i);
            if (!bnp2.getGUID().equals(ldv2)) continue;
            return bnp2;
        }
        lfn.b(5, "SFInteractionManager", "getInteractionLogic() InteractionLogic with GUID=" + ldv2 + " was not found.");
        return null;
    }

    public final void c(bnp bnp2) {
        assert (this.Initialized);
        if (!this.ll(bnp2.arW())) {
            lfn.b(5, "SFInteractionManager", "removeInteractionLogic() InteractionManager " + this.GUID + " doesn't contain interactionlogic of type " + bnp2.arW());
            return;
        }
        this.dwM.remove(bnp2);
        if (!this.Initialized) {
            return;
        }
        bnp2.b((bnx)null);
    }

    protected final boolean ll(int n) {
        int n2 = this.dwM.size();
        for (int i = 0; i < n2; ++i) {
            bnp bnp2 = this.dwM.get(i);
            if (bnp2.arW() != n) continue;
            return true;
        }
        return false;
    }

    protected void d(bnp bnp2) {
    }

    protected final void ask() {
        int n = this.dwM.size();
        for (int i = 0; i < n; ++i) {
            this.dwM.get(i).arZ();
        }
    }

    @Override
    public int az() {
        return -1;
    }

    public final ldv KY() {
        return null;
    }

    @Override
    public final boolean Ux() {
        return false;
    }
}

