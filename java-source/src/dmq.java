/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class dmq {
    private ldv dpx = null;
    private Set<dml> gJf = null;
    private Map<dmj, Set<dml>> gJg = null;

    public ldv bqi() {
        return this.dpx;
    }

    public Set<dml> bqB() {
        return this.gJf;
    }

    public Set<dml> c(dmj dmj2) {
        return this.gJg.containsKey((Object)dmj2) ? this.gJg.get((Object)dmj2) : new HashSet<dml>();
    }

    public int bqC() {
        return this.gJf.size();
    }

    public int d(dmj dmj2) {
        return this.gJg.containsKey((Object)dmj2) ? this.gJg.get((Object)dmj2).size() : 0;
    }

    public dmq(ldv ldv2, Set<dml> set) {
        this.dpx = ldv2;
        this.gJf = set;
        this.gJg = lcn.emw();
        for (dml dml2 : this.gJf) {
            Set<dml> set2 = this.gJg.get((Object)dml2.bqf());
            if (set2 == null) {
                set2 = lcn.emx();
                this.gJg.put(dml2.bqf(), set2);
            }
            set2.add(dml2);
        }
    }

    public void cleanUp() {
        this.gJf.clear();
        for (Set<dml> set : this.gJg.values()) {
            set.clear();
        }
        this.gJg.clear();
        this.dpx = null;
    }

    public Set<dml> bqD() {
        Set<dml> set = lcn.emx();
        for (dml dml2 : this.gJf) {
            if (!dml2.bqj()) continue;
            set.add(dml2);
        }
        return set;
    }

    public dmf nr(ldv ldv2) {
        if (ldv.au(this.dpx, ldv2)) {
            return dmf.gHu;
        }
        bcr bcr2 = lea.av(this.dpx, ldv2);
        if (bcr2 == bcr.cXi) {
            return dmf.gHv;
        }
        if (bcr2 == bcr.cXe) {
            return dmf.gHw;
        }
        return dmf.gHt;
    }
}

