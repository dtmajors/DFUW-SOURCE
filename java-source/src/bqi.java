/*
 * Decompiled with CFR.
 */
class bqi
implements Comparable {
    public final int Type;
    public final String Name;

    public bqi(int n, String string) {
        this.Type = n;
        this.Name = string;
    }

    public final int compareTo(Object object) {
        assert (object instanceof bqi);
        bqi bqi2 = (bqi)object;
        if (this.Type < bqi2.Type) {
            return -1;
        }
        if (this.Type > bqi2.Type) {
            return 1;
        }
        return this.Name.compareTo(bqi2.Name);
    }
}

