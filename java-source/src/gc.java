/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class gc {
    public final ahu.b Ul;
    public final int[] Um;

    public gc(ahu.b b2, int[] nArray) {
        this.Ul = b2;
        this.Um = nArray;
    }

    public boolean bA(int n) {
        int n2 = this.Um.length;
        for (int i = 0; i < n2; ++i) {
            if (this.Um[i] != n) continue;
            return true;
        }
        return false;
    }

    public boolean equals(Object object) {
        if (object instanceof gc) {
            gc gc2 = (gc)object;
            if (gc2.Ul != this.Ul) {
                return false;
            }
            if (gc2.Um.length != this.Um.length) {
                return false;
            }
            int n = this.Um.length;
            for (int i = 0; i < n; ++i) {
                if (this.Um[i] == gc2.Um[i]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public String getEventPropertyName() {
        return this.Ul.name();
    }

    public String bB(int n) {
        switch (this.Ul) {
            case blP: {
                return ep.aM((int)n);
            }
        }
        return "" + n;
    }

    public String toString() {
        assert (this.Ul != null);
        assert (this.Um != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFEventPropertySet: ");
        stringBuilder.append("EventPropertyType='");
        stringBuilder.append(this.getEventPropertyName());
        stringBuilder.append("' PropertyIDs=[");
        int n = this.Um.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(this.bB(this.Um[i]));
            stringBuilder.append("'");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

