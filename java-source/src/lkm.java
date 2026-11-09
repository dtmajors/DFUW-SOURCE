/*
 * Decompiled with CFR.
 */
import java.util.List;

public class lkm {
    private List rqR = lcn.emv();
    private lkl rqS = null;
    private lkl rqT = null;
    private ldz rqU = null;

    public lkl add(int n) {
        if (n < this.rqR.size()) {
            return (lkl)this.rqR.get(n);
        }
        return null;
    }

    public void a(lkl lkl2) {
        this.rqR.add(lkl2);
    }

    public void ap(int n, boolean bl) {
        if (n < this.rqR.size()) {
            lkl lkl2 = (lkl)this.rqR.get(n);
            if (bl || lkl2 == this.rqS) {
                // empty if block
            }
        }
    }

    public void etJ() {
    }
}

