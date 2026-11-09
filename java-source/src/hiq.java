/*
 * Decompiled with CFR.
 */
public class hiq
extends hir {
    public final hfg jIQ;

    public hiq(hfg hfg2) {
        super((hnc)hfg2.jIm.dXw, null, lgg.rlI, new lhf(0, hfg2.jIm.dXw.kKJ.kvA.kUD), hfg2.jIm.dXw.kKJ.kvA, true, true);
        this.jIQ = hfg2;
    }

    public void d(hff hff2) {
        hcd hcd2 = this.h(hff2);
        hcd2.a(hff2.cgJ());
    }

    public void cib() {
        int n;
        int n2 = this.jIQ.cgS();
        for (n = 0; n < this.jIQ.getViewCount(); ++n) {
            hff hff2 = this.jIQ.Md(n);
            int n3 = this.d((hmi)hff2);
            if (n3 == n) continue;
            if (n3 > n) {
                this.b(hff2);
                this.a((hmi)hff2, n);
                continue;
            }
            if (n3 == -1) {
                this.a((hmi)hff2, n);
                continue;
            }
            assert (false);
        }
        n = this.jIQ.getViewCount();
        while (n < this.getTabCount()) {
            this.b(((hqx)this.kUx.get((int)n)).kZG);
        }
        if (this.cuS() != n2) {
            this.T(-1, false);
            this.T(n2, true);
        }
        for (int i = 0; i < this.jIQ.getViewCount(); ++i) {
            this.d(this.jIQ.Md(i));
        }
    }

    private hcd h(hff hff2) {
        for (int i = 0; i < this.kUx.size(); ++i) {
            if (((hqx)this.kUx.get((int)i)).kZG != hff2) continue;
            return (hcd)this.kUx.get(i);
        }
        return null;
    }

    public int v(lgg lgg2) {
        hpx hpx2 = this.a(lgg2, hpx.class);
        if (this.kUx.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < this.kUx.size(); ++i) {
            if (this.kUx.get(i) != hpx2) continue;
            if (lgg2.cf >= hpx2.cqw().cf + hpx2.getWidth() / 2) {
                ++i;
            }
            return i;
        }
        return this.kUx.size();
    }

    @Override
    protected hqx a(hmi hmi2, String string) {
        hff hff2 = (hff)hmi2;
        return new hcd(hff2, this.kUw.kUF);
    }

    @Override
    protected void cml() {
        super.cml();
        hff hff2 = (hff)this.cuM();
        if (hff2 == null) {
            this.jIQ.g(null);
        } else {
            hff2.aXQ();
        }
    }

    @Override
    protected int a(ldb ldb2) {
        return 25;
    }
}

