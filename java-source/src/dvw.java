/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class dvw
extends dvy {
    private Set<dvq> cHg = null;

    public dvq[] bCn() {
        return this.cHg.toArray(new dvq[this.cHg.size()]);
    }

    public dvw(String string) {
        this.jE(string);
        this.cHg = lcn.emz();
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
            dvq dvq2 = dvq.e(lmn2.euT()[i].euV(), lmn2.euS());
            if (dvq2 == null) continue;
            this.cHg.add(dvq2);
        }
        this.bCu();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " :: Database worker to retrieve a collection of conquest mercenaries... SQL = " + this.bCq();
    }
}

