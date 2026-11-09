/*
 * Decompiled with CFR.
 */
import java.util.List;

public class csw {
    public int ResourceType = 0;
    public double fdY = 0.0;
    public double fdZ = 0.0;
    public List fea = null;

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFChestInventoryInfo: ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

