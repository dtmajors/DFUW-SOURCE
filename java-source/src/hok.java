/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class hok
extends hpw {
    private final hpa khX;
    private final b kSo;
    private final ldl kSp = new ldl();
    private final List<hmc.a> kSq;
    private final lbn kSr = new lbn(this){
        final /* synthetic */ hok kSv;
        {
            this.kSv = hok2;
        }

        public final void W() {
            this.kSv.refresh();
        }
    };
    private final hmc kSs = new hmc(this){
        final /* synthetic */ hok kSv;
        {
            this.kSv = hok2;
        }

        public final lbl<lbn> cpU() {
            return hok.b(this.kSv);
        }

        public final hmc.a cpV() {
            if (hok.c(this.kSv) == null) {
                return null;
            }
            return a.b(hok.c(this.kSv));
        }

        public final void refresh() {
            this.kSv.refresh();
        }
    };
    private boolean Initialized;
    private a kSt;
    private int kSu;

    public hok(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, List<hmc.a> list) {
        super(hnc2, string, lgg2, lhf2, b2.kSy);
        this.kSo = b2;
        this.kSq = list;
        this.khX = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kSo.kiM);
        this.j(this.khX);
        this.ccu();
    }

    public final hmc cue() {
        return this.kSs;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccd() {
        this.ccu();
        super.ccd();
    }

    @Override
    protected void cbM() {
        super.cbM();
        a a2 = this.a(this.cqu(), a.class);
        if (a2 != null) {
            this.a(a2);
        } else {
            this.a((a)null);
        }
    }

    @Override
    protected int a(ldb ldb2, int n) {
        assert (lda.by(new Object[]{ldb2}));
        assert (lda.acc(n));
        return 0;
    }

    @Override
    protected int a(ldb ldb2) {
        switch (ldb2) {
            case reo: {
                return 0;
            }
            case rep: {
                return 20;
            }
        }
        return 0;
    }

    private void a(a a2) {
        assert (a2 == null || this.crn().contains(a2));
        if (a2 == this.kSt) {
            return;
        }
        this.kSt = a2;
        this.kSp.enp();
        this.refresh();
    }

    private a a(hmc.a a2) {
        for (a a3 : lin.a(this.crn(), a.class)) {
            if (!((Object)a3.kSx).equals(a2)) continue;
            return a3;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ccu() {
        if (this.kSu > 0) {
            return;
        }
        ++this.kSu;
        try {
            ArrayList<a> arrayList = new ArrayList<a>();
            for (a object : lin.a(this.crn(), a.class)) {
                if (this.kSq.contains(object.kSx)) continue;
                assert (!arrayList.contains(object));
                arrayList.add(object);
            }
            for (a a2 : arrayList) {
                if (this.kSt == a2) {
                    this.a((a)null);
                }
                a2.remove();
            }
            for (hmc.a a3 : this.kSq) {
                a a4 = this.a(a3);
                if (a4 == null) {
                    a4 = new a(this, this.kLu, (String)null, a3);
                    this.j(a4);
                    continue;
                }
                a4.b(a3);
            }
            Collection<a> collection = lin.a(this.crn(), a.class);
            int n = this.getWidth();
            int n2 = 0;
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                a a5 = (a)iterator.next();
                n2 = Math.max(n2, a5.getWidth());
            }
            int n3 = Math.max(n, this.kSo.kri.rmN + n2);
            int n4 = this.kSo.kri.rmN;
            int n5 = this.kSo.kri.H;
            int n6 = 0;
            Object object = collection.iterator();
            while (object.hasNext()) {
                a a6 = (a)object.next();
                if (n4 > this.kSo.kri.rmN && n4 + a6.getWidth() >= n3) {
                    n4 = this.kSo.kri.rmN;
                    n5 += n6 + this.kSo.kSz.H;
                    n6 = 0;
                }
                a6.cB(n4, n5);
                n4 += a6.getWidth() + this.kSo.kSz.rmN;
                n6 = Math.max(n6, a6.getHeight());
            }
            if (collection.size() > 0) {
                n5 -= this.kSo.kSz.H;
            }
            this.cC(n3, n5 += n6 + this.kSo.kri.H);
            object = this.kSt == null ? new lgs() : this.kSt.cqD();
            this.khX.j((lgs)object);
        }
        finally {
            --this.kSu;
        }
    }

    private void mU(boolean bl) {
        this.cqt().cqn().a(bl, this.kSr);
    }

    static /* synthetic */ b a(hok hok2) {
        return hok2.kSo;
    }

    static /* synthetic */ ldl b(hok hok2) {
        return hok2.kSp;
    }

    static /* synthetic */ a c(hok hok2) {
        return hok2.kSt;
    }
}

