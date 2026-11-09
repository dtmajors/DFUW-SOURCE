/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hdm
 *  lcy
 */
import java.util.LinkedList;
import java.util.List;

public class hfw
extends hmt
implements hma {
    public static final lhf kld = new lhf(16, 16);
    public static final lhf kle = new lhf(32, 32);
    private final hpa klf;
    private final hpa klg;
    private final hpa klh;
    private final hne kli;
    private final hpa klj;
    private final lbn klk;
    private final lbn kll;
    private boolean Initialized;

    public hfw(hdm hdm2, String string, lgg lgg2) {
        super((hnc)hdm2, string, lgg2, new lhf(hfw.kld.rmN + hfw.kle.rmN * hjo.kzH.rmN, hfw.kld.H + hfw.kle.H * hjo.kzH.H));
        hpe hpe2;
        int n;
        this.kli = new hne(new lhf(1 + hjo.kzH.rmN, 1 + hjo.kzH.H), null);
        this.klk = new lbn(this){
            final /* synthetic */ hfw klm;
            {
                this.klm = hfw2;
            }

            public final void W() {
                hfw.a(this.klm);
            }
        };
        this.kll = new lbn(this){
            final /* synthetic */ hfw klm;
            {
                this.klm = hfw2;
            }

            public final void W() {
                hfw.b(this.klm);
            }
        };
        assert (hdm2.jXk.jOn.kLY.H == hdm2.jXk.jOo.kLY.H);
        this.klg = new hpa(this.kLu, (String)null, lgg.rlI, new lhf(hfw.kld.rmN + hfw.kle.rmN * hjo.kzH.rmN, hfw.kld.H), hdm2.jXk.jOw);
        this.j(this.klg);
        this.klh = new hpa(this.kLu, (String)null, new lgg(0, hfw.kld.H), new lhf(hfw.kld.rmN, hfw.kld.H + hfw.kle.H * hjo.kzH.H), hdm2.jXk.jOw);
        this.j(this.klh);
        this.klf = new hpa(this.kLu, (String)null, new lgg(hfw.kld.rmN, hfw.kld.H), new lhf(hfw.kle.rmN * hjo.kzH.rmN, hfw.kle.H * hjo.kzH.H), hdm2.jXk.jOw);
        this.j(this.klf);
        this.kli.a(ldb.rep, 0, hfw.kld.H);
        this.kli.a(ldb.reo, 0, hfw.kld.rmN);
        for (n = 0; n < hjo.kzH.H; ++n) {
            this.kli.a(ldb.rep, 1 + n, hfw.kle.H);
        }
        for (n = 0; n < hjo.kzH.rmN; ++n) {
            this.kli.a(ldb.reo, 1 + n, hfw.kle.rmN);
        }
        this.klj = new hpa(this.kLu, (String)null, this.kli.cG(0, 1), this.kli.cF(0, 1), hdm2.jXk.kDs);
        this.j(this.klj);
        this.klj.H(new lcq(1.0f, 1.0f, 1.0f, 0.5f));
        for (n = 0; n < hjo.kzH.rmN; ++n) {
            hpe2 = new hpe(this.kLu, null, new lgg(hfw.kld.rmN + n * hfw.kle.rmN, 0), new lhf(hfw.kle.rmN, hfw.kld.H), hdm2.kIY, n == 9 ? "0" : String.valueOf(1 + n));
            this.j(hpe2);
        }
        for (n = 0; n < hjo.kzH.H; ++n) {
            hpe2 = new hpe(this.kLu, null, new lgg(0, hfw.kld.H + n * hfw.kle.H), new lhf(hfw.kld.rmN, hfw.kle.H), hdm2.kIY, String.valueOf(n));
            this.j(hpe2);
        }
    }

    public final int b(ldb ldb2, int n) {
        int n2 = n - kld.e(ldb2);
        if (n2 < 0 || n2 >= hjo.kzH.e(ldb2) * kle.e(ldb2)) {
            return -1;
        }
        return n2 /= kle.e(ldb2);
    }

    public final int c(ldb ldb2, int n) {
        assert (n >= 0 && n < hjo.kzH.e(ldb2));
        return kld.e(ldb2) + n * kle.e(ldb2);
    }

    public final lgg m(lgg lgg2) {
        int n = this.b(ldb.reo, lgg2.cf);
        int n2 = this.b(ldb.rep, lgg2.cg);
        if (n == -1 || n2 == -1) {
            return null;
        }
        return new lgg(n, n2);
    }

    public final lgg n(lgg lgg2) {
        return new lgg(this.c(ldb.reo, lgg2.cf), this.c(ldb.rep, lgg2.cg));
    }

    public final boolean a(hcc hcc2, boolean bl) {
        assert (this.cbO().jZG.cpN() == this);
        lgg lgg2 = this.cqu();
        lgg lgg3 = this.m(lgg2);
        if (lgg3 != null) {
            if (!bl) {
                hcc2.c(this);
                hcc2.z(this.cbO().jZG.cpO());
                this.cbP().kcm.g(lgg3.cg, lgg3.cf, hcc2.jEO, hcc2.jEP);
            }
            return true;
        }
        return false;
    }

    public final boolean a(hgq hgq2, boolean bl) {
        lgg lgg2 = this.cqu();
        lgg lgg3 = this.m(lgg2);
        if (lgg3 != null) {
            if (hgq2.kmX == null) {
                return false;
            }
            if (!hgq2.kaW.awQ()) {
                return false;
            }
            if (!this.cbP().kck.kyz.d(hgq2.kmX)) {
                return false;
            }
            if (!bl) {
                this.cbP().kcm.a(lgg3.cg, lgg3.cf, hgq2.kmX);
                return false;
            }
            return true;
        }
        if (!bl) {
            // empty if block
        }
        return false;
    }

    @Override
    public boolean b(hms hms2) {
        assert (this.Initialized);
        if (hms2 instanceof hcc) {
            return true;
        }
        return hms2 instanceof hgq;
    }

    @Override
    public void cge() {
    }

    @Override
    public void cgf() {
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.civ();
        this.ciw();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        lgg lgg2 = this.cqu();
        lgg lgg3 = this.m(lgg2);
        if (lgg3 != null) {
            Object object;
            Object object2 = this.cbP().kcm.cy(lgg3.cg, lgg3.cf);
            if (object2 != null && object2 instanceof hea) {
                object = (hdx)((hdu)object2).kaW;
                if (object == null) {
                    return;
                }
                if (lea.enZ().isDescendant(((hdx)object).Type, cxd.fJq)) {
                    hmv hmv2 = new hmv(this.kLu, "test tooltip", this.cqu(), new lhf(256, 145), ((hdm)this.kLu).jYH, ((hdx)object).atw(), (hdx)object);
                    this.kLu.a(((hdx)object).atw(), (hms)hmv2);
                    return;
                }
            }
            object2 = new LinkedList();
            object = null;
            hdv hdv2 = this.cbP().kcm.cx(lgg3.cg, lgg3.cf);
            if (hdv2 == null) {
                object2.add(new hnt(this.cbO().kKo, lcy.qZb.esy()));
                object2.add(new hnt(this.cbO().jGV, lcy.qZc.esy()));
            } else {
                hdu hdu2 = this.cbP().kcm.cy(lgg3.cg, lgg3.cf);
                this.cbO().a(hdu2, hdv2, (List)object2);
                object = hdv2.atw();
            }
            this.kLu.a((lhu)object, (List<hnt>)object2);
            return;
        }
        LinkedList<hnt> linkedList = new LinkedList<hnt>();
        linkedList.add(new hnt(this.cbO().jGU, lcy.qZa.esy()));
        this.kLu.a(null, linkedList);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void civ() {
        for (int i = 0; i < hjo.kzH.H; ++i) {
            for (int j = 0; j < hjo.kzH.rmN; ++j) {
                hcc hcc2 = (hcc)this.kli.cE(i + 1, j + 1);
                hdv hdv2 = this.cbP().kcm.cx(i, j);
                if (hdv2 == null != (hcc2 == null)) {
                    hcc hcc3 = hcc2 = hdv2 == null ? null : new hcc(this.cbO(), null, lgg.rlI, kle, this.cbO().kJH, i, j);
                    if (hcc2 != null) {
                        this.j(hcc2);
                    }
                    this.kli.b(i + 1, j + 1, hcc2);
                }
                if (hcc2 == null) continue;
                hcc2.refresh();
            }
        }
    }

    private void ciw() {
        int n = this.cbP().kcm.kzO.getValue();
        this.klj.z(this.kli.cG(0, 1 + n));
    }

    private void mU(boolean bl) {
        this.cbP().kcm.cnR().a(bl, this.klk);
        this.cbP().kcm.kzO.cec().a(bl, this.kll);
    }

    static /* synthetic */ void a(hfw hfw2) {
        hfw2.civ();
    }

    static /* synthetic */ void b(hfw hfw2) {
        hfw2.ciw();
    }
}

