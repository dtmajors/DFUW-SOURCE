/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class imi {
    public String mjd = null;
    public String mje = null;
    public int mjf = 0xFFFFFF;
    public int mjg = 0xFFFFFF;
    public int mjh = 0;
    public int mji = 0;
    public int mjj = 0;
    public int mjk = 0;
    public int mjl = 0;
    public int mjm = 0;
    public Set<Integer> mjn = lcn.emx();
    public boolean mjo;
    public boolean mjp;
    public boolean mjq;
    public boolean mjr;
    public boolean mjs;
    public boolean mjt;

    public imi ded() {
        imi imi2 = new imi();
        imi2.mjd = this.mjd != null ? this.mjd.toLowerCase() : "";
        imi2.mje = this.mje != null ? this.mje.toLowerCase() : "";
        imi2.mjf = this.mjf;
        imi2.mjg = this.mjg;
        imi2.mjh = this.mjh;
        imi2.mji = this.mji;
        imi2.mjj = this.mjj;
        imi2.mjk = this.mjk;
        imi2.mjl = this.mjl;
        imi2.mjm = this.mjm;
        imi2.mjn.addAll(this.mjn);
        imi2.mjo = this.mjo;
        imi2.mjp = this.mjp;
        imi2.mjq = this.mjq;
        imi2.mjr = this.mjr;
        imi2.mjs = this.mjs;
        imi2.mjt = this.mjt;
        return imi2;
    }

    public boolean isEmpty() {
        return !this.mjo && !this.mjp && !this.mjq && !this.mjr && !this.mjs && !this.mjt && this.mjn.isEmpty();
    }

    public /* synthetic */ Object clone() {
        return this.ded();
    }
}

