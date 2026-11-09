/*
 * Decompiled with CFR.
 */
public abstract class jos
implements Comparable<jos> {
    public final jow jIg;
    public final String Name;
    public final String nKR;
    public final lip bZO;

    public jos(jow jow2, String string, String string2, lip lip2) {
        assert (jow2 != null);
        assert (string != null);
        assert (lip2 != null);
        this.jIg = jow2;
        this.Name = string;
        this.nKR = string2;
        this.bZO = lip2;
    }

    public final lip awO() {
        String string = this.Name;
        if (this.Name.startsWith("a_")) {
            string = this.Name.substring(2);
        }
        string = string.replace('_', ' ');
        return new ljg(string);
    }

    public final lip awP() {
        return this.bZO;
    }

    public final int d(jos jos2) {
        return this.Name.compareTo(jos2.Name);
    }

    public String toString() {
        return null;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.d((jos)object);
    }
}

