/*
 * Decompiled with CFR.
 */
public class gj {
    public final int Type;
    public final long WN;

    private gj() {
        this.Type = 0;
        this.WN = 0L;
    }

    public gj(int n, long l) {
        assert (n > 0);
        assert (l > 0L);
        this.Type = n;
        this.WN = l;
    }

    public final String getName() {
        return gk.bH(this.Type);
    }

    public boolean equals(Object object) {
        if (object instanceof gj) {
            gj gj2 = (gj)object;
            if (gj2.Type == this.Type && gj2.WN == this.WN) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("['");
        stringBuilder.append(this.getName());
        stringBuilder.append("', ");
        stringBuilder.append(this.WN);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

