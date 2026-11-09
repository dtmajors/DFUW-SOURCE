/*
 * Decompiled with CFR.
 */
import java.util.List;

public class pj {
    public final pm aHb;
    public final ldv Ri;
    public final List<fzb> aHc = lcn.emA();
    public mz aHd;
    public int hB;

    public pj(ldv ldv2, pm pm2) {
        this.Ri = ldv2;
        this.aHb = pm2;
    }

    public void a(fzb fzb2) {
        this.aHc.add(fzb2);
    }

    public String toString() {
        return this.aHb.toString() + "[" + this.Ri + "]";
    }
}

