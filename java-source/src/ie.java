/*
 * Decompiled with CFR.
 */
public class ie {
    public final ahu.c afi;
    public final int ObjectType;

    public ie(ahu.c c2) {
        this.afi = c2;
        this.ObjectType = 0;
    }

    public ie(ahu.c c2, int n) {
        this.afi = c2;
        this.ObjectType = n;
    }

    public boolean equals(Object object) {
        if (object instanceof ie) {
            ie ie2 = (ie)object;
            if (this.afi == ie2.afi && this.ObjectType == ie2.ObjectType) {
                return true;
            }
        }
        return false;
    }

    public String nb() {
        return this.afi.name();
    }

    public String getObjectName() {
        return amh.gL(this.ObjectType);
    }

    public int hashCode() {
        return this.afi.ordinal();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFStateObjectDefinitionKey: StateObjectType='");
        stringBuilder.append(this.nb());
        if (this.ObjectType > 0) {
            stringBuilder.append("' ObjectType='");
            stringBuilder.append(this.getObjectName());
        }
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

