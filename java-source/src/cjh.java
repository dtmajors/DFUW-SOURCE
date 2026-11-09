/*
 * Decompiled with CFR.
 */
public class cjh
extends cjf {
    public int ResourceType;
    public cgc eDV;
    public cgc eDW;

    public cjh() {
        super(cjo.EQUIP_UNSHEATH);
    }

    public boolean a(int n, boolean bl, boolean bl2) {
        if (this.ResourceType != -1 && !lea.enW().isDescendant(n, this.ResourceType)) {
            return false;
        }
        if (!this.eDV.bZR && this.eDV.Pp != bl) {
            return false;
        }
        return this.eDW.bZR || this.eDW.Pp == bl2;
    }

    public cjh aQb() {
        super.aPZ();
        cjh cjh2 = (cjh)super.aPZ();
        cjh2.ResourceType = this.ResourceType;
        cjh2.ayN = this.ayN;
        return cjh2;
    }

    @Override
    public /* synthetic */ cjf aPZ() {
        return this.aQb();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.aQb();
    }
}

