/*
 * Decompiled with CFR.
 */
import java.util.List;

public class jn {
    public final String alk;
    public String akV;
    public List<mhk> all;
    public loz alm;
    public int aln = a.alo.ordinal();

    public jn(String string) {
        this.alk = string;
    }

    public mhk[] ob() {
        if (this.all == null) {
            return new mhk[0];
        }
        return this.all.toArray(new mhk[this.all.size()]);
    }
}

