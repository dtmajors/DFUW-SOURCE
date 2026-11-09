/*
 * Decompiled with CFR.
 */
import java.util.List;

public class cup {
    public int ResourceType = 0;
    public List fxO = null;

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

