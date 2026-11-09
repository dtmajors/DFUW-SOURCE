/*
 * Decompiled with CFR.
 */
public class jm {
    public final String akV;
    public final hc SC;
    public final mhs[] alf;
    public final boolean alg;
    public final lox alh;
    public final Class<? extends jk> ali;
    public final ldv alj;

    public jm(String string, hc hc2, mhs[] mhsArray, boolean bl, Class<? extends jk> clazz, lox lox2) {
        this.akV = string;
        this.SC = hc2;
        this.alf = mhsArray == null ? mhs.EmptyArray : mhsArray;
        this.alg = bl;
        this.alh = lox2;
        this.ali = clazz;
        this.alj = null;
    }

    public jm(String string, hc hc2, mhs[] mhsArray, boolean bl, ldv ldv2, lox lox2) {
        this.akV = string;
        this.SC = hc2;
        this.alf = mhsArray == null ? mhs.EmptyArray : mhsArray;
        this.alg = bl;
        this.alh = lox2;
        this.ali = null;
        this.alj = ldv2;
    }

    public String oa() {
        if (this.ali != null) {
            return this.ali.getName();
        }
        if (this.alj != null) {
            return this.alj.toString();
        }
        assert (false);
        return this.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.akV);
        stringBuilder.append(" ");
        for (int j = 0; j < this.alf.length; ++j) {
            if (j > 0) {
                stringBuilder.append(", ");
            }
            if (j + 1 == this.alf.length && this.alg) {
                stringBuilder.append("[");
            }
            stringBuilder.append(this.alf[j].toString());
            if (j + 1 != this.alf.length || !this.alg) continue;
            stringBuilder.append("]");
        }
        stringBuilder.append(" (").append(this.SC.toString()).append(", handler ").append(this.oa()).append(")");
        return stringBuilder.toString();
    }
}

