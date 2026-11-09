/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class hfn
extends hpw {
    private final lbn kjg = new lbn(this){
        final /* synthetic */ hfn kjv;
        {
            this.kjv = hfn2;
        }

        public final void W() {
            hfn.a(this.kjv);
        }
    };
    private final lbn kjh = new lbn(this){
        final /* synthetic */ hfn kjv;
        {
            this.kjv = hfn2;
        }

        public final void W() {
            hfn.b(this.kjv);
        }
    };
    private final lbn kji = new lbn(this){
        final /* synthetic */ hfn kjv;
        {
            this.kjv = hfn2;
        }

        public final void W() {
            hfn.c(this.kjv);
        }
    };
    private final lbn kjj = new lbn(this){
        final /* synthetic */ hfn kjv;
        {
            this.kjv = hfn2;
        }

        public final void W() {
            hfn.d(this.kjv);
        }
    };
    private final lbn kjk = new lbn(this){
        final /* synthetic */ hfn kjv;
        {
            this.kjv = hfn2;
        }

        public final void W() {
            hfn.e(this.kjv);
        }
    };
    public final hff jET;
    private final lbn jDY = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hfn kjv;
        {
            this.kjv = hfn2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hfn.f(this.kjv)) {
                throw new AssertionError();
            }
            boolean bl = hfn.g(this.kjv).isFocusOwner();
            if (!this.kjv.jET.jIm.dXw.cdw() && !hfn.g(this.kjv).cfE()) {
                hfn.g(this.kjv).r(bl, true);
            }
        }

        static {
            $assertionsDisabled = !hfn.class.desiredAssertionStatus();
        }
    };
    private final hmr jEN = new hmr(null);
    private List<a> kjl = lcn.emv();
    private final TreeMap<Integer, Integer> kjm = lcn.emG();
    private int kjn = 0;
    private int kjo = 0;
    private int kjp = 0;
    private int kjq = -1;
    private int kjr = -1;
    private hqg kjs = null;
    private boolean Initialized = false;
    private int kjt = 0;
    private int kju = 0;

    private hen chM() {
        hmt hmt2;
        for (hmt2 = this.cqt(); hmt2 != null && !(hmt2 instanceof hen); hmt2 = hmt2.cqt()) {
        }
        return (hen)hmt2;
    }

    public hfn(hff hff2, lgg lgg2, lhf lhf2) {
        super((hnc)hff2.jIm.dXw, null, lgg2, lhf2, hff2.jIm.dXw.kID);
        this.jET = hff2;
        this.kjo = lhf2.rmN;
        if (this.kjo <= hcl.jGo.rmN) {
            this.kjo = hcl.jGo.rmN + 1;
        }
        this.kjs = new hqg((hnc)this.jET.jIm.dXw, null, lgg.rlI, lhf.rnv, this.jET.jIm.dXw.kJV, ldb.rep, this.kjg, this.kjh, this.kjk, this.kjj, this.kji);
        int n = this.jET.jIm.dXw.kJV.kYx.kLY.e(ldb.reo);
        this.kjs.h(lhf2.rmN - n, 0, n, lhf2.H);
        this.j(this.kjs);
    }

    private int chN() {
        return this.getWidth() - this.kjs.getWidth();
    }

    private int chO() {
        int n = this.getHeight() - 1;
        if (n <= 0) {
            n = 1;
        }
        return n;
    }

    @Override
    protected boolean LM(int n) {
        block3: {
            block2: {
                if (n >= 0) break block2;
                n = -n;
                for (int i = 0; i < n; ++i) {
                    this.chQ();
                }
                break block3;
            }
            if (n <= 0) break block3;
            for (int i = 0; i < n; ++i) {
                this.chP();
            }
        }
        return true;
    }

    private void chP() {
        int n = this.chX();
        if (n < 0) {
            return;
        }
        if (n >= this.kjn) {
            return;
        }
        int n2 = this.Mk(n);
        a a2 = this.kjl.get(n2);
        if (a2.kjx == n) {
            if (--n2 >= 0) {
                n = this.kjl.get((int)n2).kjx;
            }
        } else {
            n = a2.kjx;
        }
        this.Ml(n + this.chO());
    }

    public void Mc(int n) {
        while (n != 0) {
            if (n < 0) {
                this.chQ();
                ++n;
                continue;
            }
            this.chP();
            --n;
        }
    }

    private void chQ() {
        int n = this.kjp;
        if (n <= 1) {
            return;
        }
        int n2 = this.Mk(n - 1);
        a a2 = this.kjl.get(n2);
        if (a2.kjx + a2.kjy == n) {
            ++n2;
        }
        if (n2 >= this.kjl.size()) {
            return;
        }
        a2 = this.kjl.get(n2);
        this.Ml(a2.kjx + a2.kjy);
    }

    private void chR() {
        this.Ml(this.kjp - this.chO());
    }

    private void chS() {
        this.Ml(this.kjp + this.chO());
    }

    private void chT() {
        this.Ml(this.kjs.cwd() + this.chO());
    }

    public void Mj(int n) {
        int n2;
        int n3 = this.kjl.size();
        if (n3 <= n + 50) {
            return;
        }
        int n4 = n3 - n;
        int n5 = this.chX();
        if (n5 < 0) {
            n5 = 0;
        }
        int n6 = this.chU();
        int n7 = this.Mk(n5);
        if (n4 > n7) {
            n4 = n7;
        }
        if (n4 <= 5) {
            return;
        }
        ArrayList<a> arrayList = lcn.abH(n + 50);
        for (n2 = n4; n2 < this.kjl.size(); ++n2) {
            arrayList.add(this.kjl.get(n2));
        }
        for (n2 = 0; n2 < n4; ++n2) {
            a a2 = this.kjl.get(n2);
            this.kjp -= a2.kjy;
            a2.chY();
            --n6;
        }
        this.kjl = arrayList;
        this.kjo = 0;
        this.chW();
        if (n6 >= this.kjl.size()) {
            this.Ml(this.kjn);
        } else {
            a a3 = this.kjl.get(n6);
            this.Ml(a3.kjx + a3.kjy);
        }
    }

    public void a(String string, lcq lcq2, long l) {
        boolean bl = this.kjp == this.kjn;
        a a2 = new a(this, string, this.jET.jIm.dXw.jXl, lcq2, l);
        this.kjl.add(a2);
        a2.kjx = this.kjn;
        this.kjn += a2.Mm(this.kjo);
        this.kjm.put(a2.kjx, this.kjl.size() - 1);
        if (!this.Initialized) {
            this.kjp = this.kjn;
            return;
        }
        if (bl) {
            this.Ml(this.kjn);
        } else {
            this.Ml(this.kjp);
        }
    }

    @Override
    protected void a(boolean bl, hms hms2, int n) {
        super.a(bl, hms2, n);
        if (hms2 instanceof hoy) {
            this.jEN.a(bl, (hoy)hms2);
        }
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    @Override
    protected void chL() {
        super.chL();
        this.jEN.J(this.cbO().kIn.kEE);
    }

    @Override
    protected void chK() {
        super.chK();
        this.jEN.J(lcq.COLORSHIFT_NEUTRAL);
    }

    @Override
    protected void FG() {
        super.FG();
        this.chM().cqr().a(false, this.jDY);
        this.jET.c(this);
    }

    @Override
    protected void FF() {
        super.FF();
        this.Initialized = true;
        this.kjs.cR(1, 0);
        this.chM().cqr().a(true, this.jDY);
        this.chV();
    }

    @Override
    protected void ccf() {
        super.ccf();
    }

    @Override
    protected void cce() {
        super.cce();
        this.chV();
    }

    private int chU() {
        int n;
        if (this.kjp >= this.kjn) {
            n = this.kjl.size();
        } else {
            assert (this.kjp >= 0);
            assert (this.kjp < this.kjn);
            n = this.Mk(this.kjp);
        }
        return n;
    }

    protected void chV() {
        this.kjs.h(this.getWidth() - this.kjs.getWidth(), 0, this.kjs.getWidth(), this.chO());
        int n = this.chU();
        this.chW();
        if (n >= this.kjl.size()) {
            this.Ml(this.kjn);
        } else {
            a a2 = this.kjl.get(n);
            this.Ml(a2.kjx + a2.kjy);
        }
    }

    private void chW() {
        if (this.chN() == this.kjo) {
            return;
        }
        this.kjo = this.chN();
        this.kjn = 0;
        this.kjm.clear();
        int n = 0;
        for (a a2 : this.kjl) {
            a2.kjx = this.kjn;
            this.kjm.put(a2.kjx, n);
            this.kjn += a2.Mm(this.kjo);
            ++n;
        }
    }

    private int chX() {
        return this.kjp - this.chO();
    }

    private int Mk(int n) {
        if (n < 0) {
            return -1;
        }
        if (n > this.kjn) {
            return this.kjl.size();
        }
        return this.kjm.floorEntry(n).getValue();
    }

    private void Ml(int n) {
        int n2;
        a a2;
        int n3;
        this.kjr = this.chO();
        this.kjq = this.chN();
        if (n < this.chO()) {
            n = this.chO();
        }
        if (n > this.kjn) {
            n = this.kjn;
        } else if (n < 0) {
            n = 0;
        }
        this.kjp = n;
        int n4 = this.chX();
        if (n4 < 0) {
            n4 = 0;
        }
        if (this.kjn <= 1) {
            this.kjs.cR(1, 0);
            return;
        }
        if (this.kjn == n4) {
            this.kjs.cR(this.kjn, n4 - 1);
        } else {
            this.kjs.cR(this.kjn, n4);
        }
        int n5 = this.Mk(n4);
        n4 = this.kjl.get((int)n5).kjx;
        for (n3 = n5; n4 < this.kjp && n3 < this.kjl.size(); ++n3, n4 += a2.Mm(this.kjo)) {
            a2 = this.kjl.get(n3);
            assert (a2.kjx == n4);
            int n6 = a2.Mm(this.kjo);
            if (n6 + n4 > this.kjp) {
                n6 = this.kjp - n4;
            }
            a2.b(new lgg(0, a2.kjx - this.chX()), new lhf(this.kjo, n6));
        }
        for (n2 = this.kjt; n2 < n5; ++n2) {
            a a3 = this.kjl.get(n2);
            a3.chY();
        }
        for (n2 = n3; n2 < this.kju && n2 < this.kjl.size(); ++n2) {
            a a4 = this.kjl.get(n2);
            a4.chY();
        }
        this.kjt = n5;
        this.kju = n3;
        assert (this.kju - this.kjt < 50);
    }

    static /* synthetic */ void a(hfn hfn2) {
        hfn2.chP();
    }

    static /* synthetic */ void b(hfn hfn2) {
        hfn2.chR();
    }

    static /* synthetic */ void c(hfn hfn2) {
        hfn2.chQ();
    }

    static /* synthetic */ void d(hfn hfn2) {
        hfn2.chS();
    }

    static /* synthetic */ void e(hfn hfn2) {
        hfn2.chT();
    }

    static /* synthetic */ boolean f(hfn hfn2) {
        return hfn2.Initialized;
    }

    static /* synthetic */ hen g(hfn hfn2) {
        return hfn2.chM();
    }
}

