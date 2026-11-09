/*
 * Decompiled with CFR.
 */
class caf
implements Comparable {
    public int Type = 0;
    public String Name = null;

    public caf(int n, String string) {
        this.Type = n;
        this.Name = string;
    }

    public final int compareTo(Object object) {
        assert (object instanceof caf);
        caf caf2 = (caf)object;
        if (this.Type < caf2.Type) {
            return -1;
        }
        if (this.Type > caf2.Type) {
            return 1;
        }
        return this.Name.compareTo(caf2.Name);
    }
}

