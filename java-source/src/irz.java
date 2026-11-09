/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public abstract class irz
extends ipx {
    private isa mwv;
    private ipx mbe;
    private ipf lMX;
    private ipx mww;
    private List<isb> lXe = lcn.emv();
    private List<ipf> mwx = lcn.emv();
    private hyn mwy;

    public irz() {
        this.a(iqo.dmV());
        this.mbe = ipx.c(new ipf[0]);
        this.W(this.mbe);
        this.mww = ipx.h(new ipf[0]);
        this.mbe.W(this.mww);
    }

    public isa doG() {
        return this.mwv;
    }

    public void a(isa isa2) {
        if (isa2 == this.mwv) {
            return;
        }
        if (this.mwv != null) {
            this.mwv.removeFromParent();
        }
        this.mwv = isa2;
        if (this.mwv != null) {
            this.W(this.mwv);
        }
    }

    public ipf dip() {
        return this.lMX;
    }

    public void h(ipf ipf2) {
        if (ipf2 == this.lMX) {
            return;
        }
        if (this.lMX != null) {
            this.lMX.removeFromParent();
        }
        this.lMX = ipf2;
        if (this.lMX != null) {
            this.mbe.c(this.lMX, 0);
        }
    }

    public int doH() {
        return this.lXe.size();
    }

    public isb SE(int n) {
        return this.lXe.get(n);
    }

    public int eM(int n, int n2) {
        ioc ioc2 = this.a(n, n2, (ipf)this.mwv.doM());
        for (int i = 0; i < this.lXe.size(); ++i) {
            isb isb2 = this.lXe.get(i);
            if (ioc2.cf >= isb2.getX() + isb2.getWidth() / 2) continue;
            return i;
        }
        return this.lXe.size();
    }

    public int rf(String string) {
        for (int i = 0; i < this.lXe.size(); ++i) {
            isb isb2 = this.lXe.get(i);
            if (!lhn.equal(isb2.dan().getText(), string)) continue;
            return i;
        }
        return -1;
    }

    public int c(isb isb2) {
        return this.lXe.indexOf(isb2);
    }

    public ipf SF(int n) {
        return this.mwx.get(n);
    }

    public int ab(ipf ipf2) {
        return this.mwx.indexOf(ipf2);
    }

    public void a(ipf ipf2, ipf ipf3, ist ist2, int n) {
        if (ipf2.djJ() != null) {
            throw new IllegalArgumentException("Page is already a child of another container");
        }
        if (ipf3 != null && ipf3.djJ() != null) {
            throw new IllegalArgumentException("Icon is already a child of another container");
        }
        isb isb2 = this.cMK();
        isb2.ag(ipf3);
        isb2.a(ist2);
        this.lXe.add(n, isb2);
        this.mwx.add(n, ipf2);
        ipf2.setVisible(false);
        this.mwv.a(isb2, n);
        this.mww.W(ipf2);
        if (this.mwx.size() == 1) {
            this.SH(n);
        }
        this.PL(n);
    }

    public void SG(int n) {
        isb isb2 = this.lXe.get(n);
        ipf ipf2 = this.mwx.get(n);
        this.lXe.remove(n);
        this.mwx.remove(n);
        this.mwv.e(isb2);
        ipf2.removeFromParent();
        this.PM(n);
    }

    public int doI() {
        for (int i = 0; i < this.lXe.size(); ++i) {
            if (!this.lXe.get(i).djZ()) continue;
            return i;
        }
        return -1;
    }

    public void SH(int n) {
        ipf ipf2;
        if (n < 0 || n >= this.lXe.size()) {
            return;
        }
        int n2 = this.doI();
        if (n == n2) {
            return;
        }
        if (n2 >= 0) {
            this.lXe.get(n2).setActive(false);
            ipf2 = this.mwx.get(n2);
            ipf2.setVisible(false);
        }
        if (n >= 0) {
            this.lXe.get(n).setActive(true);
            ipf2 = this.mwx.get(n);
            ipf2.setVisible(true);
        }
        if (this.mwv != null) {
            this.mwv.doX();
        }
        this.PU(n);
    }

    public String SI(int n) {
        return this.lXe.get(n).dan().getText();
    }

    public void H(String string, int n) {
        if (lhn.equal(this.SI(n), string)) {
            return;
        }
        this.lXe.get(n).dan().setText(string);
        if (n == this.doI() && this.mwv != null) {
            this.mwv.doX();
        }
        this.PV(n);
    }

    public String SJ(int n) {
        return this.lXe.get(n).dpl();
    }

    public void I(String string, int n) {
        this.lXe.get(n).rg(string);
        if (n == this.doI() && this.mwv != null) {
            this.mwv.doX();
        }
    }

    public void f(boolean bl, int n) {
        this.lXe.get(n).qm(bl);
    }

    public int ac(ipf ipf2) {
        return this.mwx.indexOf(ipf2);
    }

    public void SK(int n) {
        this.mwv.SK(n);
    }

    public void SL(int n) {
        this.mwv.SL(n);
    }

    public abstract isb cMK();

    public ifg a(isb isb2, int n, int n2) {
        return null;
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        if (super.c(n, n2, hzk2, ifg2)) {
            return true;
        }
        if (!this.m(ifg2)) {
            return false;
        }
        this.djE().cqF();
        return true;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        if (super.a(n, n2, hzk2, ifg2)) {
            return true;
        }
        if (!this.m(ifg2)) {
            return false;
        }
        int n3 = this.eM(n, n2);
        isb isb2 = n3 < this.mwv.doU() ? this.mwv.SE(n3) : null;
        int n4 = 0;
        int n5 = 0;
        if (isb2 == null) {
            isb2 = this.mwv.SE(this.mwv.doU() - 1);
            n4 = isb2.getWidth();
        }
        ioc ioc2 = isb2.eo(n4, n5);
        n4 = ioc2.cf;
        n5 = ioc2.cg;
        if (this.djE().d(n4, n5, null)) {
            if (this.mwy == null) {
                this.mwy = this.doJ();
                this.mwy.setGUID(this.djE().getMessageDelegator().bzv());
                this.djE().getMessageDelegator().a((amf)this.mwy);
                this.mwy.cqF();
            }
            this.a(this.mwy, n4, n5);
        } else {
            this.doK();
        }
        return true;
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        if (super.d(n, n2, hzk2, ifg2)) {
            return true;
        }
        if (!this.m(ifg2)) {
            return false;
        }
        this.doK();
        return true;
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        if (!this.m(ifg2)) {
            return false;
        }
        this.doK();
        this.a(ifg2, this.eM(n, n2));
        return true;
    }

    public hyn doJ() {
        return null;
    }

    public void a(hyn hyn2, int n, int n2) {
        hyn2.R((float)n, (float)n2);
    }

    public boolean m(ifg ifg2) {
        return false;
    }

    public void a(ifg ifg2, int n) {
    }

    public void a(isb isb2) {
        this.SG(this.c(isb2));
    }

    public void b(isb isb2) {
    }

    public void d(joa joa2) {
    }

    public void PL(int n) {
    }

    public void PM(int n) {
    }

    public void PU(int n) {
    }

    public void PV(int n) {
    }

    private void doK() {
        if (this.mwy != null) {
            this.djE().getMessageDelegator().hd(this.mwy.getGUID());
            this.mwy = null;
        }
    }
}

