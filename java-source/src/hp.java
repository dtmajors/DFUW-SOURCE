/*
 * Decompiled with CFR.
 */
public class hp {
    public ldv adA;
    public ldv Tr;
    public ldv Rs = null;
    public ldv adB;
    public boolean adC = false;
    public boolean adD = false;
    public gm adE;
    public boolean adF = false;
    public boolean adG = false;
    public int adH = 0;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFQueuedSubscription: SubscriberGUID=");
        stringBuilder.append(this.adA);
        stringBuilder.append(" PersistentSessionObjectGUID=");
        stringBuilder.append(this.Tr);
        stringBuilder.append(" ObjectGUID=");
        stringBuilder.append(this.Rs);
        if (this.adB != null) {
            stringBuilder.append(" CreateEndPointRelationForObjectGUID=");
            stringBuilder.append(this.adB);
        }
        stringBuilder.append(" AutoTimer=");
        stringBuilder.append(this.adC);
        stringBuilder.append(" SubscriberForSpawnPoint=");
        stringBuilder.append(this.adD);
        stringBuilder.append(" RequestedByAOI=");
        stringBuilder.append(this.adF);
        stringBuilder.append(" DelayTime=");
        stringBuilder.append(this.adH);
        return stringBuilder.toString();
    }
}

