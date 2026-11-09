/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class aig
extends agj {
    private int ResourceType = -1;
    private boolean jV = false;

    public aig() {
        super(ahu.b.bma);
        this.bhY = new agj.a[3];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 8);
    }

    @Override
    public vd eD(int n) {
        vt vt2 = new vt();
        vt2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            vt2.aXP = 1;
            vt2.ResourceType = this.ResourceType;
            vt2.jV = this.jV;
            return vt2;
        }
        if (this.eT(2) > n && !this.bhX) {
            vt2.aXP |= 2;
            vt2.ResourceType = this.ResourceType;
            vt2.jV = this.jV;
        }
        if (this.eT(8) > n) {
            vt2.aXP |= 8;
            vt2.ResourceType = this.ResourceType;
            vt2.jV = this.jV;
        }
        if (vt2.ResourceType <= 0) {
            lfn.b(5, "SFUnlockableEventProperty", "getEventPropertyUpdate() Type is not set in propertyupdate.");
            lfn.b(5, "SFUnlockableEventProperty", "getEventPropertyUpdate() TimeSliceNumber=" + n);
            this.gt();
            assert (false);
        }
        return vt2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFUnlockableEventProperty : TypeName ='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Selected ='");
        stringBuilder.append(this.jV);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    private String pa() {
        civ civ2 = lea.epC().get(this.ResourceType);
        return cug.uV((int)civ2.az());
    }

    public int az() {
        return this.ResourceType;
    }

    public boolean isSelected() {
        return this.jV;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public void setSelected(boolean bl) {
        this.jV = bl;
    }
}

