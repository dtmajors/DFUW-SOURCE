/*
 * Decompiled with CFR.
 */
public class ctk {
    public int ResourceType = 0;
    public int asi = 0;
    public float Probability = 0.0f;
    public lmc ffZ = null;

    public final String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFHarvestingItem: Resource='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        stringBuilder.append(" Probability=");
        stringBuilder.append(this.Probability);
        stringBuilder.append(" Multiplier=");
        stringBuilder.append((Object)this.ffZ);
        return stringBuilder.toString();
    }
}

