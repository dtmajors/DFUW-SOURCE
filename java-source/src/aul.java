/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 *  lcy
 */
import java.util.Set;

public class aul
extends amc {
    private static final int ccZ = 10000;
    private static final lip cda = new ljg("null");
    protected static final avz cbY = avz.crc;
    private static final cqi[] bui = new cqi[0];
    private Set<Integer> cdb = lcn.emH();
    public static final amd cdc = new amd(aul.class, amc.buj, "ChatProxy", bui, null);
    protected static final egg[] cdd = new egg[0];
    private final lbi<egr> ccd = new lbi<egr>(this){
        final /* synthetic */ aul cdi;
        {
            this.cdi = aul2;
        }

        public void a(egr egr2) {
            if (egr2.ipj >= 10000) {
                aul.a(this.cdi, egr2.ipj - 10000, egr2.ccm);
            } else {
                this.cdi.b(egr2.ipj, egr2.ccm, egr2.ccT);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((egr)object);
        }
    };
    private final lbi<dxq> cde = new lbi<dxq>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ aul cdi;
        {
            this.cdi = aul2;
        }

        public final void p(dxq dxq2) {
            if (!$assertionsDisabled && !aul.a(this.cdi)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && dxq2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && dxq2.amk() == null) {
                throw new AssertionError();
            }
            if (dxq2.aO() == null) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                dxq2.f(aul.b(this.cdi));
            }
            if (!$assertionsDisabled && dxq2.aO() != aul.c(this.cdi)) {
                throw new AssertionError();
            }
            this.cdi.a(dxq2);
        }

        public /* synthetic */ void m(Object object) {
            this.p((dxq)object);
        }

        static {
            $assertionsDisabled = !aul.class.desiredAssertionStatus();
        }
    };
    private final lbm<dxq> cdf = new lbm<dxq>(this){
        private final dxs cdj;
        final /* synthetic */ aul cdi;
        {
            this.cdi = aul2;
            this.cdj = new dxs();
        }

        public final dxq ij(int n) {
            dxq dxq2 = this.cdj.CW(n);
            dxq2.f(aul.d(this.cdi));
            return dxq2;
        }

        public /* synthetic */ Object ik(int n) {
            return this.ij(n);
        }
    };
    private final lde<dxq> cdg = new lde();
    protected final lha<dxq, dxq> cdh;
    private boolean Initialized;

    public aul(amd amd2) {
        super(amd2);
        this.cdh = new lha(this.cdg.rex, this.cdf, this.cde);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        assert (this.Initialized);
        assert (dxq2.amk().equals(this.getGUID()));
        if (this.cdg.Y(dxq2)) {
            return;
        }
        super.receiveMessage(dxq2);
    }

    @Override
    protected void FF() {
        this.Initialized = true;
        super.FF();
        this.cc(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.cc(false);
        super.FG();
        this.Initialized = false;
    }

    protected void b(int n, Object[] objectArray, String string) {
        assert (this.Initialized);
        assert (lda.by(objectArray));
        assert (false) : n;
    }

    private void a(int n, Object[] objectArray) {
        switch (objectArray.length) {
            case 0: {
                this.ih(n);
                break;
            }
            case 1: {
                this.d(n, objectArray[0]);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void ih(int n) {
        Object object = this.gG(n);
        cqi cqi2 = this.FC().gH(n);
        lip lip2 = object == null ? cda : cqi2.x(object);
        this.h(lzn.tXd.bD(cqi2.getPropertyName(), lip2.esy()));
    }

    private void d(int n, Object object) {
        cqi cqi2 = this.FC().gH(n);
        Object object2 = object;
        Class clazz = cqi2.aYD();
        if (clazz == ljq.class) {
            object2 = ljq.Aw((String)object);
        } else if (clazz == lgl.class) {
            object2 = lgl.zG((String)object);
        }
        int n2 = cqi2.u(object2);
        if (n2 != 0) {
            if (cqi2 instanceof cqp) {
                cqp cqp2 = (cqp)cqi2;
                lip lip2 = cqp2.x(object);
                switch (n2) {
                    case 3: {
                        this.h(maf.FailedToSetPropertyValueBelowMinimum.bD(object.toString(), cqp2.aYO().toString()));
                        break;
                    }
                    case 4: {
                        this.h(maf.FailedToSetPropertyValueAboveMaximum.bD(object.toString(), cqp2.aYP().toString()));
                    }
                }
            }
            this.h(maf.FailedToSetProperty.bD(new Object[0]));
            return;
        }
        this.a(n, object2);
    }

    protected final void a(hc hc2, int n, String string, lip lip2, egg[] eggArray) {
        if (lcw.SC.ordinal() >= hc2.ordinal()) {
            this.a(true, n, string, lip2, eggArray);
            this.cdb.add(n);
        }
    }

    protected final void We() {
        for (Integer n : this.cdb) {
            this.a(false, (int)n, null, null, null);
        }
        this.cdb.clear();
    }

    private final void a(boolean bl, int n, String string, lip lip2, egg[] eggArray) {
        if (bl) {
            assert (string != null);
            assert (lip2 != null);
            assert (eggArray != null);
            egh egh2 = (egh)this.e(2306, lcr.qCL);
            egh2.ipj = n;
            egh2.ipt = string;
            egh2.ipu = lip2;
            egh2.ipv = eggArray;
            this.a(egh2);
        } else {
            ege ege2 = (ege)this.e(2307, lcr.qCL);
            ege2.ipj = n;
            this.a(ege2);
        }
    }

    protected void h(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    protected final dxq e(int n, ldv ldv2) {
        dxq dxq2 = this.MessageDelegator.h(n, this.GUID, ldv2);
        assert (dxq2 != null);
        assert (dxq2.bEz() == 0 || dxq2.bEz() == n);
        return dxq2;
    }

    protected final void a(dxq dxq2) {
        assert (this.Initialized);
        assert (dxq2.aO() == this.GUID);
        assert (dxq2.amk() != null);
        this.MessageDelegator.E(dxq2);
    }

    protected final void d(ldv ldv2, dxq dxq2) {
        assert (this.Initialized);
        assert (ldv2 != null);
        assert (dxq2 != null);
        grd grd2 = (grd)this.MessageDelegator.h(11078, this.GUID, ldv2);
        grd2.jpX = dxq2;
        this.MessageDelegator.E(grd2);
    }

    protected final khd ii(int n) {
        khd khd2 = this.MessageDelegator.h(n);
        assert (khd2 != null);
        assert (khd2.bUV() == n) : khd2.bUV();
        khd2.ts(this.GUID);
        return khd2;
    }

    protected final void a(khd khd2) {
        assert (this.Initialized);
        assert (khd2.dXh() == this.GUID) : khd2.dXh();
        this.MessageDelegator.a(khd2);
    }

    protected final void a(kgh kgh2) {
        assert (this.Initialized);
        this.MessageDelegator.b(kgh2);
    }

    private egg.a b(Class<?> clazz) {
        if (clazz == lch.class) {
            return egg.a.ipm;
        }
        if (clazz == lei.class) {
            return egg.a.ipn;
        }
        if (clazz == ldq.class) {
            return egg.a.ipp;
        }
        if (clazz == ldf.class) {
            return egg.a.ipo;
        }
        if (clazz == String.class) {
            return egg.a.ipq;
        }
        return egg.a.ipq;
    }

    private void cb(boolean bl) {
        if (!bl) {
            return;
        }
        amd amd2 = this.FC();
        int n = amd2.getPropertyCount();
        for (int i = 0; i < n; ++i) {
            cqi cqi2 = amd2.gH(i);
            if (lcw.SC.ordinal() < cqi2.eUS.ordinal()) continue;
            int n2 = 10000 + i;
            String string = null;
            lip lip2 = null;
            egg[] eggArray = null;
            if (bl) {
                string = cqi2.getPropertyName();
                lip2 = cqi2.aYB();
                assert (lip2 != null);
                egg.a a2 = this.b(cqi2.aYD());
                lip lip3 = null;
                if (cqi2 instanceof cqp) {
                    cqp cqp2 = (cqp)cqi2;
                    lip3 = lcy.rad.a(cqi2.x(cqi2.getDefaultValue()), cqi2.x(cqp2.aYO()), cqi2.x(cqp2.aYP()));
                } else {
                    lip3 = lcy.rae.a(cqi2.x(cqi2.getDefaultValue()));
                }
                eggArray = new egg[]{new egg("value", a2, true, lip3)};
            }
            this.a(bl, n2, string, lip2, eggArray);
        }
    }

    private void cc(boolean bl) {
        this.cb(bl);
        this.cdh.rex.a(bl, egr.class, this.ccd);
    }

    static /* synthetic */ void a(aul aul2, int n, Object[] objectArray) {
        aul2.a(n, objectArray);
    }

    static /* synthetic */ boolean a(aul aul2) {
        return aul2.Initialized;
    }

    static /* synthetic */ ldv b(aul aul2) {
        return aul2.GUID;
    }

    static /* synthetic */ ldv c(aul aul2) {
        return aul2.GUID;
    }

    static /* synthetic */ ldv d(aul aul2) {
        return aul2.GUID;
    }
}

