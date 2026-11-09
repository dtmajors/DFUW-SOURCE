/*
 * Decompiled with CFR.
 */
public class lep {
    public ldv GUID;
    public ldv aCE;
    public int ResourceType;
    public ljq Position;
    public float mB;
    public ldv dtj = null;

    public lep eqi() {
        lep lep2 = new lep();
        lep2.GUID = this.GUID;
        lep2.aCE = this.aCE;
        lep2.ResourceType = this.ResourceType;
        lep2.Position = new ljq(this.Position);
        lep2.mB = this.mB;
        return lep2;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLineSweepSensorHit: OwnerGUID=");
        stringBuilder.append(this.aCE);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

