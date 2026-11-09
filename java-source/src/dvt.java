/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class dvt
extends dvy {
    private Set<dvo> hhB = null;

    public dvo[] bCj() {
        return this.hhB.toArray(new dvo[this.hhB.size()]);
    }

    public dvt(String string) {
        this.jE(string);
        this.hhB = lcn.emz();
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
            dvo dvo2 = dvo.c(lmn2.euT()[i].euV(), lmn2.euS());
            if (dvo2 == null) continue;
            this.hhB.add(dvo2);
        }
        this.bCu();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " :: Database worker to retrieve a collection of conquest challenge bind-stone damagers... SQL = " + this.bCq();
    }
}

