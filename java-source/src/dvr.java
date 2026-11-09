/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class dvr
extends dvy {
    private Set<dvn> hhw = null;

    public dvn[] bCg() {
        return this.hhw.toArray(new dvn[this.hhw.size()]);
    }

    public dvr(String string) {
        this.jE(string);
        this.hhw = lcn.emz();
    }

    @Override
    public boolean bCh() {
        if (this.bCq() == null || this.bCq().isEmpty() || !this.Initialized) {
            return false;
        }
        this.b(this.bCq(), 0, "Darkfall_Read");
        return true;
    }

    @Override
    protected void e(lmn lmn2, int n) {
        if (lmn2.euT() == null || lmn2.euS() == null || lmn2.euS().length == 0) {
            this.bCv();
            return;
        }
        for (int i = 0; i < lmn2.euT().length; ++i) {
            dvn dvn2 = dvn.b(lmn2.euT()[i].euV(), lmn2.euS());
            if (dvn2 == null) continue;
            this.hhw.add(dvn2);
        }
        this.bCu();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " :: Database worker to retrieve a collection of conquest attackers' siege-stones... SQL = " + this.bCq();
    }
}

