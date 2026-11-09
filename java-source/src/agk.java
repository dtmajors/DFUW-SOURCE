/*
 * Decompiled with CFR.
 */
public class agk
extends agj {
    private cad bic = null;

    public agk() {
        super(ahu.b.blT);
        this.bhY = new agj.a[3];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 4);
        this.bhY[2] = new agj.a(this, 8);
    }

    public cad AM() {
        return this.bic;
    }

    public void a(cad cad2) {
        this.bic = cad2;
    }

    @Override
    public vd eD(int n) {
        ve ve2 = new ve();
        ve2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            ve2.aXP = 1;
            ve2.ResourceType = this.bic.ResourceType;
            return ve2;
        }
        if (this.eT(8) > n) {
            ve2.aXP |= 8;
            ve2.ResourceType = this.bic.ResourceType;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            ve2.aXP = 4;
            ve2.ResourceType = this.bic.ResourceType;
        }
        if (ve2.ResourceType == 0) {
            return null;
        }
        return ve2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFFeatureItemEventProperty: LayerType='");
        stringBuilder.append(this.bic.Eg());
        stringBuilder.append("' ResourceType='");
        stringBuilder.append(this.bic.pa());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

