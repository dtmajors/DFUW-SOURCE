/*
 * Decompiled with CFR.
 */
public class cum {
    public final int ResourceType;
    public final int asi;

    public cum(int n, int n2) {
        this.ResourceType = n;
        this.asi = n2;
    }

    public final String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFResourceVendorInfo: Resource='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        return stringBuilder.toString();
    }
}

