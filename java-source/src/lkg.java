/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class lkg {
    private Set<lkp> rqs = lcn.emH();
    private List<lkp> rqt = lcn.emv();
    private List<lkq> rqu = lcn.emv();
    public static final boolean bC = false;

    public List<lkp> aK(ldz ldz2) {
        if (!this.rqt.isEmpty()) {
            this.rqt.clear();
        }
        if (this.rqs.isEmpty()) {
            return this.rqt;
        }
        Iterator<lkp> iterator = this.rqs.iterator();
        lkp lkp2 = null;
        while (iterator.hasNext() && ldz2.rgz >= (double)(lkp2 = iterator.next()).getStartTime()) {
            this.rqt.add(lkp2);
            iterator.remove();
        }
        return this.rqt;
    }

    public void a(lkp lkp2) {
        this.rqs.add(lkp2);
    }

    public void etu() {
        this.rqs.clear();
        this.rqt.clear();
    }

    public List<lkq> etv() {
        return this.rqu;
    }

    public void a(lkq lkq2) {
        this.rqu.add(lkq2);
    }
}

