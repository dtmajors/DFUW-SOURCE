/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collection;

public class hhz
extends hmt {
    private final lbn kuw = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhz kuy;
        {
            this.kuy = hhz2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhz.a(this.kuy)) {
                throw new AssertionError();
            }
            hhz.b(this.kuy);
        }

        static {
            $assertionsDisabled = !hhz.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private int kux;

    public hhz(hdm hdm2, String string, lgg lgg2) {
        super((hnc)hdm2, string, lgg2, hdm2.jXk.jOf);
    }

    @Override
    protected void FF() {
        super.FF();
        this.Initialized = true;
        this.cc(true);
        this.kux = (this.cbO().jXk.jOf.rmN - this.cbO().jXk.jOe.rmN) / (lcw.qPa.rmN + this.cbO().jXk.jOe.rmN);
        this.refresh();
    }

    @Override
    protected void FG() {
        this.cc(false);
        super.FG();
        this.Initialized = false;
    }

    private void refresh() {
        int n;
        assert (this.Initialized);
        alu[] aluArray = this.cbP().kck.cnj();
        double d2 = this.kLu.kAz.emb();
        for (int i = 0; i < aluArray.length; ++i) {
            alu alu2 = aluArray[i];
            if (alu2.Ep() < d2 || alu2.Em() > d2) continue;
            if (!alu2.Eq().kLY.r(lcw.qPa)) {
                // empty if block
            }
            boolean bl = false;
            n = 0;
            for (hgx hgx2 : lin.a(this.crn(), hgx.class)) {
                if (hgx2.kpp.equals(alu2)) {
                    bl = true;
                    break;
                }
                ++n;
            }
            if (bl) continue;
            int n2 = n++;
            hgx hgx3 = new hgx(this.cbO(), (String)null, this.cv(n2, n), alu2);
            this.j(hgx3);
        }
        ArrayList<hgx> arrayList = new ArrayList<hgx>();
        for (hgx hgx2 : lin.a(this.crn(), hgx.class)) {
            n = 0;
            for (int i = 0; i < aluArray.length; ++i) {
                alu alu2 = aluArray[i];
                if (!alu2.equals(hgx2.kpp)) continue;
                n = 1;
                break;
            }
            if (n != 0) continue;
            arrayList.add(hgx2);
        }
        for (hgx hgx3 : arrayList) {
            hgx3.remove();
        }
        int n3 = 0;
        Collection<hgx> collection = lin.a(this.crn(), hgx.class);
        n = collection.size();
        for (hgx hgx4 : collection) {
            lgg lgg2 = this.cv(n3++, n);
            this.cbO().jXk.getClass();
            hgx4.a(lgg2, 300.0f);
        }
    }

    private lgg cv(int n, int n2) {
        int n3 = n / this.kux;
        int n4 = n - n3 * this.kux;
        int n5 = n4 * (lcw.qPa.rmN + this.cbO().jXk.jOe.rmN);
        int n6 = n3 * (lcw.qPa.H + this.cbO().jXk.jOe.H);
        int n7 = n2 - n3 * this.kux;
        assert (n7 >= 1);
        if (n7 > this.kux) {
            n7 = this.kux;
        }
        int n8 = n7 * (lcw.qPa.rmN + this.cbO().jXk.jOe.rmN) - this.cbO().jXk.jOe.rmN;
        return new lgg(n5 += (this.getWidth() - n8) / 2, n6);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void cc(boolean bl) {
        this.cbO().cbP().kck.cnc().a(bl, this.kuw);
    }

    static /* synthetic */ boolean a(hhz hhz2) {
        return hhz2.Initialized;
    }

    static /* synthetic */ void b(hhz hhz2) {
        hhz2.refresh();
    }
}

