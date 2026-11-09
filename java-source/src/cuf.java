/*
 * Decompiled with CFR.
 */
public class cuf {
    public final int ResourceType;
    private ej[] DR = null;

    public cuf(int n) {
        this.ResourceType = n;
    }

    public ej[] arJ() {
        return this.DR;
    }

    public void f(ej[] ejArray) {
        assert (ejArray != null);
        assert (ejArray.length > 0);
        this.DR = ejArray;
    }

    public ej ae(int n) {
        if (n <= 0) {
            return null;
        }
        int n2 = this.DR.length;
        for (int i = 0; i < n2; ++i) {
            if (this.DR[i].getType() != n) continue;
            return this.DR[i];
        }
        return null;
    }

    public et ah(int n) {
        ej ej2 = this.ae(n);
        if (ej2 == null) {
            return null;
        }
        if (ej2 instanceof et) {
            return (et)ej2;
        }
        return null;
    }

    public final String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        assert (this.DR != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFResourceAttributeInfo: Resource='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' AttributeCount=");
        stringBuilder.append(this.DR.length);
        return stringBuilder.toString();
    }
}

