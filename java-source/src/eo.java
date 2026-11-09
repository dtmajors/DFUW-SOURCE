/*
 * Decompiled with CFR.
 */
public class eo {
    public final int Type;
    public final String Name;
    public final int kM;
    public final boolean Ed;
    public final boolean Ee;
    public final boolean Ef;

    public eo(int n, String string, int n2, boolean bl, boolean bl2, boolean bl3) {
        this.Type = n;
        this.Name = string;
        this.kM = n2;
        this.Ed = bl;
        this.Ee = bl2;
        this.Ef = bl3;
    }

    public boolean equals(Object object) {
        if (object instanceof eo) {
            eo eo2 = (eo)object;
            return this.Type == eo2.Type;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAttributeTypeInfo: Type=");
        stringBuilder.append(this.Type);
        stringBuilder.append(" Name='");
        stringBuilder.append(this.Name);
        stringBuilder.append("' DataType=");
        stringBuilder.append(this.kM);
        stringBuilder.append(" HasRelatedTypes=");
        stringBuilder.append(this.Ed);
        stringBuilder.append(" IsProtection=");
        stringBuilder.append(this.Ee);
        stringBuilder.append(" IsSpecial=");
        stringBuilder.append(this.Ef);
        return stringBuilder.toString();
    }
}

