/*
 * Decompiled with CFR.
 */
public class dbv {
    public final int ResourceType;
    public final float gcz;
    public final float gcA;

    public dbv(int n2, float f2, float f3) {
        this.ResourceType = n2;
        this.gcz = f2;
        this.gcA = f3;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFObjectDistanceConstraint: ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' RepairDistance=");
        stringBuilder.append(this.gcz);
        stringBuilder.append(" UsableDistance=");
        stringBuilder.append(this.gcA);
        return stringBuilder.toString();
    }
}

