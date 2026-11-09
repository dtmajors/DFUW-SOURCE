/*
 * Decompiled with CFR.
 */
import java.util.List;

public class isd
extends ipx {
    private ipx mct;
    private ipx mww;
    private List<ipf> lXe = lcn.emv();
    private List<ipf> mwx = lcn.emv();
    private int mwL = -1;

    public isd() {
        this.a(iqo.dmS());
        this.W(ipx.j(ipx.a(1, 18, new ipf[0]), this.daL()));
        this.W(this.dpt());
    }

    public int doH() {
        return this.lXe.size();
    }

    public ipf SO(int n) {
        return this.lXe.get(n);
    }

    public ipf SP(int n) {
        return this.mwx.get(n);
    }

    public int ah(ipf ipf2) {
        return this.lXe.indexOf(ipf2);
    }

    public void a(int n, ipf ipf2, ipf ipf3) {
        this.lXe.add(n, ipf2);
        this.mwx.add(n, ipf3);
        this.mct.c(this.aj(ipf2), n);
        this.mww.c(ipf3, n);
        ipf3.setVisible(false);
    }

    public void c(ipf ipf2, ipf ipf3) {
        this.a(this.doH(), ipf2, ipf3);
    }

    public void SG(int n) {
        this.mct.X(this.ak(this.lXe.remove(n)));
        this.mww.X(this.mwx.remove(n));
        if (n == this.mwL) {
            this.mwL = -1;
        }
    }

    public int doI() {
        return this.mwL;
    }

    public void SH(int n) {
        if (n == this.mwL) {
            return;
        }
        if (this.mwL >= 0) {
            this.ad(this.mwL, false);
        }
        this.mwL = n;
        if (this.mwL >= 0) {
            this.ad(this.mwL, true);
        }
        this.PU(this.mwL);
    }

    public void ai(ipf ipf2) {
        this.SH(this.mwx.indexOf(ipf2));
    }

    public int ab(ipf ipf2) {
        return this.mwx.indexOf(ipf2);
    }

    @Override
    public void kh(float f) {
        for (ipf ipf2 : this.lXe) {
            ipf2.kh(f);
        }
        for (ipf ipf2 : this.mwx) {
            ipf2.kh(f);
        }
    }

    public void dps() {
        int n = this.doI();
        if (n < this.doH() - 1) {
            this.SH(n + 1);
        } else {
            this.SH(0);
        }
    }

    public void so(boolean bl) {
        for (ipf ipf2 : this.mwx) {
            if (!(ipf2 instanceof ipq)) continue;
            ((ipq)ipf2).rF(bl);
        }
    }

    public ipf aj(ipf ipf2) {
        return ipf2;
    }

    public void PU(int n) {
    }

    private ipf daL() {
        this.mct = ipx.j(new ipf[0]);
        return this.mct;
    }

    private ipf dpt() {
        this.mww = ipx.c(new ipf[0]);
        return this.mww;
    }

    private void ad(int n, boolean bl) {
        ipf ipf2 = this.lXe.get(n);
        if (ipf2 instanceof ior) {
            ((ior)((Object)ipf2)).hX(bl);
        } else {
            ipf2.setActive(bl);
        }
        this.mwx.get(n).setVisible(bl);
    }

    private ipf ak(ipf ipf2) {
        while (ipf2.djJ() != this.mct) {
            ipf2 = ipf2.djJ();
        }
        return ipf2;
    }
}

