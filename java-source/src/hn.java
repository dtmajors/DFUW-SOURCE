/*
 * Decompiled with CFR.
 */
public class hn
extends hl {
    public gc[] adm = null;

    @Override
    public boolean equals(Object object) {
        if (object instanceof hn) {
            hn hn2 = (hn)object;
            if (!super.equals(object)) {
                return false;
            }
            if (this.adm.length != hn2.adm.length) {
                return false;
            }
            int n = this.adm.length;
            for (int i = 0; i < n; ++i) {
                if (this.adm[i].equals(hn2.adm[i])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        assert (this.adm != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPropertyDefinitionSpecific: ");
        stringBuilder.append(super.toString());
        stringBuilder.append(" EventPropertySets=[");
        int n = this.adm.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.adm[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

