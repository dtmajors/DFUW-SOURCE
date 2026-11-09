/*
 * Decompiled with CFR.
 */
public class hl {
    public int adk = 0;
    public int[] adl = null;

    public boolean lX() {
        return this.adl.length == 1 && this.adl[0] == 5;
    }

    public boolean equals(Object object) {
        if (object instanceof hl) {
            hl hl2 = (hl)object;
            if (hl2.adk == this.adk && hl2.adl.length == this.adl.length) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        assert (this.adk >= 0);
        assert (this.adl != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index='");
        stringBuilder.append(this.adk);
        stringBuilder.append(" KeyTypes=[");
        int n = this.adl.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(gk.bH(this.adl[i]));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

