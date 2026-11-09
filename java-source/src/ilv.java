/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 */
import java.util.List;

public class ilv {
    private static int miq = -1;
    private static List<d> mir = lcn.emv();
    private ilt mis;

    public ilv(ilt ilt2) {
        this.mis = ilt2;
    }

    public void cleanUp() {
        int n = 0;
        while (n < mir.size()) {
            d d2 = mir.get(n);
            if (d2.mix == this) {
                this.Rs(n);
                continue;
            }
            ++n;
        }
    }

    public boolean e(ilx ilx2) {
        if (this.mis.auW() && ilx2.auW() && this.mis.cBu().az() == ilx2.uw()) {
            this.a(new b(this, ilx2.ddA().cBs(), ilx2.cBu().getGUID()));
            return true;
        }
        return false;
    }

    public boolean ed(int n, int n2) {
        if (this.mis.auW() && n2 > 0 && n2 < this.mis.vf()) {
            this.a(new e(this, n, n2));
            return true;
        }
        return false;
    }

    public boolean delete() {
        if (this.mis.ddq()) {
            this.a(new a(this));
            return true;
        }
        return false;
    }

    public boolean c(hxd hxd2) {
        this.a(new c(this, this, hxd2));
        return true;
    }

    public void ac(int n, boolean bl) {
        for (int i = 0; i < mir.size(); ++i) {
            d d2 = mir.get(i);
            if (d2.miy != n) continue;
            this.b(d2);
            break;
        }
    }

    void ddt() {
    }

    void ddu() {
    }

    private void F(int n, int n2, int n3) {
        bsh bsh2 = this.mis.cBu();
        fme fme2 = (fme)hso.cxK().cxP().cyJ().getMessageDelegator().h(7969, hso.cxK().cxP().cyJ().getGUID(), bsh2.avU());
        fme2.ilu = 2;
        fme2.gLy = bsh2.AW();
        fme2.iPE = bsh2.getGUID();
        fme2.iPP = n;
        fme2.gLC = n2;
        fme2.dJc = bsh2.AR();
        fme2.iPF = bsh2.avU();
        fme2.gLz = bsh2.AW();
        fme2.iPQ = null;
        fme2.iPR = bsh2.AW();
        fme2.aqs = 0;
        fme2.iPS = false;
        fme2.sk(n3);
        hso.cxK().cxP().cyJ().getMessageDelegator().F(fme2);
    }

    private void a(hxd hxd2, ldv ldv2, int n) {
        hxd hxd3 = hso.cxK().cxP().cza().ri(this.mis.cBu().AW());
        hxd2.a(ldv2, hxd3, this.mis.cBu().getGUID(), n);
    }

    public void ddv() {
        hzo hzo2 = hso.cxK().cxP().cyJ();
        bsh bsh2 = this.mis.cBu();
        flz flz2 = (flz)hzo2.getMessageDelegator().h(7960, hzo2.getMessageDelegator().getGUID(), bsh2.avU());
        flz2.iPE = bsh2.getGUID();
        flz2.gLy = bsh2.AW();
        flz2.dJc = -1;
        flz2.gLz = null;
        flz2.iPF = null;
        hzo2.getMessageDelegator().F(flz2);
    }

    private void d(hxd hxd2) {
        hxd hxd3 = hso.cxK().cxP().cza().ri(this.mis.cBu().AW());
        hxd3.a(this.mis.getGUID(), hxd2, false);
    }

    private void a(d d2) {
        mir.add(d2);
        this.ddt();
        if (mir.size() == 1) {
            d2.ddx();
        }
    }

    private void b(d d2) {
        int n = mir.indexOf(d2);
        if (n >= 0) {
            this.Rs(n);
        }
    }

    private void Rs(int n) {
        mir.remove(n);
        this.ddu();
        if (mir.size() > 0) {
            mir.get(0).ddx();
        }
    }

    static /* synthetic */ int ddw() {
        return ++miq;
    }

    static /* synthetic */ void a(ilv ilv2, int n, int n2, int n3) {
        ilv2.F(n, n2, n3);
    }

    static /* synthetic */ void a(ilv ilv2, hxd hxd2, ldv ldv2, int n) {
        ilv2.a(hxd2, ldv2, n);
    }

    static /* synthetic */ void a(ilv ilv2, hxd hxd2) {
        ilv2.d(hxd2);
    }
}

