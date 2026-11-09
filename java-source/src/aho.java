/*
 * Decompiled with CFR.
 */
public class aho
extends agj {
    private cde blq = null;

    public aho() {
        super(ahu.b.bmb);
        this.bhY = new agj.a[2];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 4);
    }

    public cde Bs() {
        return this.blq;
    }

    public void a(cde cde2) {
        this.blq = cde2;
    }

    @Override
    public vd eD(int n) {
        assert (this.blq != null);
        vp vp2 = new vp();
        vp2.Uo = this.AJ();
        if (this.eT(1) > n) {
            vp2.aXP = 1;
        }
        if (this.eT(4) > n && this.bhX) {
            vp2.aXP = 4;
        }
        vp2.aYj = this.blq.aKf();
        return vp2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSkillRelationEventProperty: Value=");
        stringBuilder.append(this.blq);
        return stringBuilder.toString();
    }
}

