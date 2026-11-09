/*
 * Decompiled with CFR.
 */
public class aft
extends agj {
    public int ID = 0;
    public String aFo = null;
    public String aXn = null;
    public int ResourceType = 0;
    public ljq Position = null;
    public boolean aFp = false;

    public aft() {
        super(ahu.b.blN);
        this.bhY = new agj.a[3];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 4);
    }

    @Override
    public vd eD(int n) {
        us us2 = new us();
        us2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            us2.aXP = 1;
            us2.ID = this.ID;
            us2.aFo = this.aFo;
            us2.aXn = this.aXn;
            us2.ResourceType = this.ResourceType;
            us2.Position = this.Position;
            us2.aFp = this.aFp;
            return us2;
        }
        if (this.eT(2) > n && !this.bhX) {
            us2.aXP = 2;
            us2.ID = this.ID;
            us2.aFo = this.aFo;
            us2.aXn = this.aXn;
            us2.ResourceType = this.ResourceType;
            us2.Position = this.Position;
            us2.aFp = this.aFp;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            us2.aXP = 4;
            us2.ID = this.ID;
        }
        if (us2.ID == 0) {
            return null;
        }
        return us2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAnnotationEventProperty: ID=");
        stringBuilder.append(this.ID);
        stringBuilder.append(" Text='");
        stringBuilder.append(this.aFo);
        stringBuilder.append("' ResourceType='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

