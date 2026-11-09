/*
 * Decompiled with CFR.
 */
public abstract class kxt {
    public boolean qgQ = false;

    public abstract boolean aaR(int var1);

    public abstract String getPropertyName();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SaveAttributeValue=");
        stringBuilder.append(this.qgQ);
        return stringBuilder.toString();
    }
}

