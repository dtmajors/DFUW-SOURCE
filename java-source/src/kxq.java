/*
 * Decompiled with CFR.
 */
public class kxq
extends kxn {
    public int ResourceType = 0;

    public final String pa() {
        return this.fQ(this.ResourceType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFFilterRuleSingle: Resource='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}

