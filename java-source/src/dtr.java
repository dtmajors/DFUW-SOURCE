/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;

public class dtr {
    private boolean hdi = false;
    private List hdj = lcn.abH(10);

    public boolean bAz() {
        return this.hdi;
    }

    public void jI(boolean bl) {
        this.hdi = bl;
    }

    public void a(dtq dtq2) {
        assert (!this.hdj.contains(dtq2)) : "SFAccessControlEntry already added: " + dtq2;
        this.hdj.add(dtq2);
        Collections.sort(this.hdj);
    }

    public boolean g(ldv ldv2, ldv ldv3, int n) {
        dtq dtq2 = null;
        for (int i = 0; i < this.hdj.size(); ++i) {
            dtq2 = (dtq)this.hdj.get(i);
            if (!dtq2.f(ldv2, ldv3, n)) continue;
            return dtq2.bAy();
        }
        return this.hdi;
    }

    public dtq h(ldv ldv2, ldv ldv3, int n) {
        dtq dtq2 = null;
        for (int i = 0; i < this.hdj.size(); ++i) {
            dtq2 = (dtq)this.hdj.get(i);
            if (!dtq2.f(ldv2, ldv3, n)) continue;
            return dtq2;
        }
        return null;
    }

    public void b(dtq dtq2) {
        assert (this.hdj.contains(dtq2)) : "Unable to remove SFAccessControlEntry: " + dtq2;
        this.hdj.remove(dtq2);
        Collections.sort(this.hdj);
    }

    public List bAA() {
        return this.hdj;
    }
}

