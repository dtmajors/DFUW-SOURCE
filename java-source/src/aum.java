/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class aum
extends aul {
    private static final int cdk = 0;
    private static final int cdl = 1;
    private static final int cdm = 2;
    private static final int cdn = 3;
    private static final int cdo = 4;
    private static final int cdp = 5;
    private static final int cdq = 6;
    private static final int cdr = 7;
    private static final int cds = 8;
    private static final int cdt = 9;
    private static final int cdu = 10;
    private static final egg[] cdv = new egg[]{new egg("param1", egg.a.ipq, true, lcy.qSF)};
    private static final egg[] cdw = new egg[]{new egg("type", egg.a.ipq, false, lcy.qSK), new egg("value", egg.a.ipm, false, lcy.qSL)};
    private static final egg[] cdx = new egg[]{new egg("type", egg.a.ipq, false, lcy.qSK), new egg("value", egg.a.ipp, false, lcy.qSL)};
    private static final egg[] cdy = new egg[]{new egg("mode", egg.a.ipq, false, lcy.qSO), new egg("direction", egg.a.ipq, false, lcy.qSP), new egg("distance", egg.a.ipp, true, lcy.qSQ)};
    private static final egg[] cdz = new egg[]{new egg("amount", egg.a.ipp, false, lcy.qSR)};
    private static final egg[] cdA = new egg[0];
    private static final egg[] cdB = new egg[]{new egg("friendly", egg.a.ipm, false, lcy.qSS)};
    private static final egg[] cdC = new egg[0];
    private boolean Initialized;
    private ldv cdD;
    private ldv afF;
    private Object cdE;

    public aum() {
        super(cdc);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "ai_test", lcy.qSE, cdv);
        this.a(hc.aaP, 1, "ai_die", lcy.qST, cdA);
        this.a(hc.aaP, 2, "ai_move", lcy.qSY, cdy);
        this.a(hc.aaP, 3, "ai_rotate", lcy.qSZ, cdz);
        this.a(hc.aaP, 4, "ai_global_config", lcy.qSW, cdw);
        this.a(hc.aaP, 5, "ai_global_property", lcy.qSZ, cdx);
        this.a(hc.aaP, 6, "ai_config", lcy.qSW, cdw);
        this.a(hc.aaP, 7, "ai_property", lcy.qSZ, cdx);
        this.a(hc.aaP, 8, "ai_befriend", lcy.qSU, cdB);
        this.a(hc.aaP, 9, "ai_judas", lcy.qSV, cdC);
    }

    private ldv oq() {
        bun bun2 = (bun)this.MessageDelegator.bzx().bzt().d(lcr.qBP);
        ldv ldv2 = bun2.axO();
        if (ldv2 == null) {
            return null;
        }
        return ldv2;
    }

    private void a(egk egk2) {
        if (egk2.cdD == null) {
            return;
        }
        this.cdD = egk2.cdD;
        this.afF = egk2.afF;
        this.cdE = egk2.Tr;
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            case 0: {
                this.j(objectArray);
                return;
            }
            case 1: {
                this.Wg();
                return;
            }
            case 2: {
                this.g(objectArray);
                return;
            }
            case 3: {
                this.f(objectArray);
                return;
            }
            case 6: {
                this.d(objectArray);
                return;
            }
            case 7: {
                this.e(objectArray);
                return;
            }
            case 4: {
                this.h(objectArray);
                return;
            }
            case 5: {
                this.i(objectArray);
                return;
            }
            case 8: {
                this.c(objectArray);
                return;
            }
            case 9: {
                this.Wf();
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    private void Wf() {
        ldv ldv2 = this.oq();
        if (ldv2 == null) {
            this.h(lzj.tWz.bD(new Object[0]));
            return;
        }
        dyi dyi2 = (dyi)this.e(13328, ldv2);
        this.a(dyi2);
    }

    private void c(Object[] objectArray) {
        ldv ldv2 = this.oq();
        if (ldv2 == null) {
            this.h(lzj.tWz.bD(new Object[0]));
            return;
        }
        boolean bl = ((lch)objectArray[0]).booleanValue();
        dyb dyb2 = (dyb)this.e(13327, ldv2);
        dyb2.iiA = this.cdD;
        dyb2.iiB = bl;
        this.a(dyb2);
    }

    private void d(Object[] objectArray) {
        ldv ldv2 = this.oq();
        if (ldv2 == null) {
            this.h(lzj.tWz.bD(new Object[0]));
            return;
        }
        dyf dyf2 = (dyf)this.e(13322, ldv2);
        int n = dyf.jP((String)objectArray[0]);
        boolean bl = ((lch)objectArray[1]).booleanValue();
        dyf2.aZF = n;
        dyf2.iiE = bl;
        this.a(dyf2);
    }

    private void e(Object[] objectArray) {
        ldv ldv2 = this.oq();
        if (ldv2 == null) {
            this.h(lzj.tWz.bD(new Object[0]));
            return;
        }
        dyo dyo2 = (dyo)this.e(13326, ldv2);
        int n = dyo.jS((String)objectArray[0]);
        float f2 = ((ldq)objectArray[1]).floatValue();
        dyo2.dVm = n;
        dyo2.iiT = f2;
        this.a(dyo2);
    }

    private void f(Object[] objectArray) {
        ldv ldv2 = this.oq();
        if (ldv2 == null) {
            this.h(lzj.tWz.bD(new Object[0]));
            return;
        }
        float f2 = ((ldq)objectArray[0]).floatValue();
        dyq dyq2 = (dyq)this.e(13324, ldv2);
        dyq2.iiV = f2;
        this.a(dyq2);
    }

    private void g(Object[] objectArray) {
        ldv ldv2 = this.oq();
        if (ldv2 == null) {
            this.h(lzj.tWz.bD(new Object[0]));
            return;
        }
        float f2 = 5.0f;
        int n = dyn.jQ((String)objectArray[0]);
        int n2 = dyn.jR((String)objectArray[1]);
        if (objectArray.length > 2) {
            f2 = ((ldq)objectArray[2]).floatValue();
        }
        dyn dyn2 = (dyn)this.e(13323, ldv2);
        dyn2.eW = n;
        dyn2.iiK = n2;
        dyn2.mB = f2;
        this.a(dyn2);
    }

    private void h(Object[] objectArray) {
        eru eru2 = (eru)this.e(16648, this.cdD);
        eru2.aZF = dyf.jP((String)objectArray[0]);
        eru2.iiE = ((lch)objectArray[1]).booleanValue();
        this.a(eru2);
    }

    private void i(Object[] objectArray) {
        erw erw2 = (erw)this.e(16650, this.cdD);
        erw2.dVm = dyo.jS((String)objectArray[0]);
        erw2.iiT = ((ldq)objectArray[1]).floatValue();
        this.a(erw2);
    }

    private void Wg() {
        ldv ldv2 = this.oq();
        if (ldv2 == null) {
            this.h(lzj.tWz.bD(new Object[0]));
            return;
        }
        dyg dyg2 = (dyg)this.e(13316, ldv2);
        this.a(dyg2);
    }

    private void j(Object[] objectArray) {
        ldv ldv2 = this.oq();
        if (ldv2 == null) {
            this.h(lzj.tWz.bD(new Object[0]));
            return;
        }
        dyz dyz2 = (dyz)this.e(13313, ldv2);
        dyz2.jT((String)objectArray[0]);
        this.a(dyz2);
    }
}

