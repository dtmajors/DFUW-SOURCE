/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ctq {
    public int ResourceType = 0;
    public List fgc = null;
    public List fgg = null;

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFMonsterInventoryInfo: ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

