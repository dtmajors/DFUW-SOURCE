/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class ian
extends btk
implements hvv,
hwf {
    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().a((hvv)this);
        hso.cxK().cxP().cyZ().a((hwf)this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            hso.cxK().cxP().cyZ().b((hvv)this);
            hso.cxK().cxP().cyZ().b((hwf)this);
        }
    }

    public boolean a(int n, hwo hwo2) {
        if (!ial.Pi(n)) {
            return false;
        }
        if (hwo2 != null) {
            iap iap2;
            iap iap3 = iao.cKB().e(hwo2);
            if (iap3 != null) {
                iao.cKB().b(iap3);
                if (iap3.lBT != n && iap3.lBT == iao.cKB().cKE() && iao.cKB().Po(iap3.lBT)) {
                    iao.cKB().Pr(n);
                }
            }
            if (hwo2.cBP() && (iap2 = iao.cKB().Pp(n)) != null) {
                iap iap4 = iao.cKB().Pq(n);
                if (iap4 != null) {
                    iao.cKB().b(iap4);
                }
                hwo hwo3 = iao.cKB().a(iap2);
                iao.cKB().b(iap2);
                iao.cKB().a((hwo)hwo2.cBl(), n);
                iao.cKB().a(hwo3, n);
                return true;
            }
            if (hwo2.cBR() && (iap2 = iao.cKB().Pq(n)) != null) {
                iap iap5 = iao.cKB().Pp(n);
                if (iap5 != null) {
                    iao.cKB().b(iap5);
                }
                iao.cKB().a((hwo)hwo2.cBl(), n);
                return true;
            }
            int n2 = iao.cKB().cKD();
            if (ial.Pi(n2)) {
                iao.cKB().dt(n, n2);
            } else {
                iao.cKB().Pn(n);
            }
            iao.cKB().a((hwo)hwo2.cBl(), n);
            return true;
        }
        iao.cKB().removeItem(n);
        if (n == iao.cKB().cKE() && iao.cKB().Po(n)) {
            iao.cKB().Pr(-1);
        }
        return true;
    }

    @Override
    public void p(bsh bsh2) {
        if (!(bsh2 instanceof bsl)) {
            return;
        }
        iap iap2 = iao.cKB().am(((bsl)bsh2).AQ());
        if (iap2 == null && (iap2 = iao.cKB().Pm(bsh2.az())) == null) {
            return;
        }
        hwo hwo2 = iao.cKB().a(iap2);
        iao.cKB().a(hwo2, bsh2);
    }

    @Override
    public void q(bsh bsh2) {
        if (hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().cza() == null) {
            return;
        }
        iap iap2 = iao.cKB().ag(bsh2.getGUID(), bsh2.az());
        if (iap2 == null) {
            return;
        }
        bsh bsh3 = hso.cxK().cxP().cza().K(bsh2.az(), null);
        hwo hwo2 = iao.cKB().a(iap2);
        iao.cKB().a(hwo2, bsh3);
    }

    @Override
    public void r(bsh bsh2) {
        iap iap2 = iao.cKB().ag(bsh2.getGUID(), bsh2.az());
        if (iap2 == null) {
            return;
        }
        hwo hwo2 = iao.cKB().a(iap2);
        iao.cKB().a(hwo2, bsh2);
    }

    public void update() {
        if (hso.cxK() == null) {
            return;
        }
        if (hso.cxK().cxP() == null) {
            return;
        }
        hxb hxb2 = hso.cxK().cxP().cza();
        if (hxb2 == null) {
            return;
        }
        List<hxd> list = hxb2.cCL();
        for (hxd hxd2 : list) {
            Map<ldv, bsh> map = hxd2.cCO();
            for (bsh bsh2 : map.values()) {
                this.p(bsh2);
            }
        }
    }

    @Override
    public void cf(cxc cxc2) {
    }

    @Override
    public void ck(cxc cxc2) {
    }

    @Override
    public void cl(cxc cxc2) {
    }

    @Override
    public void i(cxc cxc2, int n) {
    }

    @Override
    public void a(cxc cxc2, float f, double d2) {
        iao.cKB().b(cxc2, f, this.MessageDelegator.arc().lpr);
    }

    @Override
    public void c(cxc cxc2, boolean bl) {
    }
}

