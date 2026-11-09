/*
 * Decompiled with CFR.
 */
class bqc {
    public final ldv aCK;
    public float dBD = 0.0f;

    public bqc(ldv ldv2) {
        this.aCK = ldv2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFDurabilityReportCache: ItemGUID");
        stringBuilder.append(this.aCK);
        stringBuilder.append(" LastReportedDurability=");
        stringBuilder.append(this.dBD);
        return stringBuilder.toString();
    }
}

