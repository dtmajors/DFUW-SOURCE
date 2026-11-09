/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.ArrayList;

public class hhp
extends hmt
implements hho.a {
    public static final lhu krZ = new lhu(452, 361, "gui/vendor/vendor_background_item.dds");
    private final hpa kgd;
    private int ksa;
    private int ksQ;
    private int ksb;
    private int ksc;
    private int ksd;
    private final boolean ksf;
    private hqg ksg;
    private final hdm dXw;
    private final a ksR;
    private int ksh;
    private int ksi;
    private ArrayList<hho> ksj;
    private final lbn kjg;
    private final lbn kjh;
    private final lbn kji;
    private final lbn kjj;
    private final lbn kjk;

    public hhp(hdm hdm2, lgg lgg2, lhf lhf2, boolean bl, a a2) {
        super((hnc)hdm2, null, lgg2, lhf2);
        this.ksa = hho.krZ.kLY.H - 4;
        this.ksQ = hho.krZ.kLY.rmN;
        this.ksb = 2;
        this.ksc = 0;
        this.ksd = this.ksa + this.ksb + this.ksc;
        this.ksh = -1;
        this.ksi = 0;
        this.ksj = lcn.emv();
        this.kjg = new lbn(this){
            final /* synthetic */ hhp ksS;
            {
                this.ksS = hhp2;
            }

            public final void W() {
                this.ksS.My(hhp.a(this.ksS) - hhp.b(this.ksS));
            }
        };
        this.kjh = new lbn(this){
            final /* synthetic */ hhp ksS;
            {
                this.ksS = hhp2;
            }

            public final void W() {
                this.ksS.My(hhp.a(this.ksS) - hhp.b(this.ksS) * 3);
            }
        };
        this.kji = new lbn(this){
            final /* synthetic */ hhp ksS;
            {
                this.ksS = hhp2;
            }

            public final void W() {
                this.ksS.My(hhp.a(this.ksS) + hhp.b(this.ksS));
            }
        };
        this.kjj = new lbn(this){
            final /* synthetic */ hhp ksS;
            {
                this.ksS = hhp2;
            }

            public final void W() {
                this.ksS.My(hhp.a(this.ksS) + hhp.b(this.ksS) * 2);
            }
        };
        this.kjk = new lbn(this){
            final /* synthetic */ hhp ksS;
            {
                this.ksS = hhp2;
            }

            public final void W() {
                this.ksS.My(hhp.c(this.ksS).cwd());
            }
        };
        this.dXw = hdm2;
        this.ksf = bl;
        this.ksR = a2;
        this.kgd = new hpa((hnc)this.dXw, "Background", lgg.rlI, hhp.krZ.kLY, krZ);
        this.j(this.kgd);
        int n = this.dXw.kJV.kYx.kLY.e(ldb.reo);
        this.ksg = new hqg((hnc)this.dXw, null, lgg.rlI, lhf.rnv, this.dXw.kJV, ldb.rep, this.kjg, this.kjh, this.kjk, this.kjj, this.kji);
        this.ksg.h(lhf2.rmN - n, 0, n, lhf2.H);
        this.j(this.ksg);
    }

    @Override
    public void cce() {
        super.cce();
        this.ksg.h(this.getWidth() - this.ksg.getWidth(), 0, this.ksg.getWidth(), this.getHeight());
        this.My(this.ksi);
    }

    @Override
    public void FF() {
        super.FF();
        this.My(0);
    }

    @Override
    protected boolean LM(int n) {
        if (super.LM(n)) {
            return true;
        }
        this.My(this.ksi + this.ksd * -n);
        return true;
    }

    public void Mz(int n) {
        if (n == this.ksj.size()) {
            return;
        }
        while (n < this.ksj.size()) {
            int n2 = this.ksj.size() - 1;
            this.ksj.get(n2).remove();
            this.ksj.remove(n2);
        }
        while (n > this.ksj.size()) {
            hho hho2 = new hho(this.dXw, "Button " + this.ksj.size(), lgg.rlI, lhf.rnv, this, this.ksf);
            this.ksj.add(hho2);
            this.j(hho2);
        }
        this.setSelectedIndex(this.ksh);
        this.My(this.ksi);
    }

    public void cs(int n, int n2) {
        if (n < 0 || n >= this.ksj.size()) {
            return;
        }
        this.ksj.get(n).Hq(n2);
    }

    public void ct(int n, int n2) {
        if (n < 0 || n >= this.ksj.size()) {
            return;
        }
        this.ksj.get(n).do(n2);
    }

    public void MB(int n) {
        this.ksj.get(n).h((dph)null);
        this.clt();
    }

    public void i(dph dph2) {
        this.ksj.get(dph2.brY().gMx).h(dph2);
        this.clt();
    }

    private int d(hho hho2) {
        return this.ksj.indexOf(hho2);
    }

    int cls() {
        if (this.ksf) {
            return this.ksj.size();
        }
        int n = 0;
        for (int i = 0; i < this.ksj.size(); ++i) {
            if (this.ksj.get(i).clz() == null) continue;
            ++n;
        }
        return n;
    }

    void My(int n) {
        int n2;
        int n3 = this.cls() * this.ksd;
        if (n > n3 - (n2 = this.getHeight())) {
            n = n3 - n2;
        }
        if (n < 0) {
            n = 0;
        }
        this.ksi = n;
        this.clt();
    }

    private void clt() {
        int n = this.ksb;
        boolean bl = false;
        for (int i = 0; i < this.ksj.size(); ++i) {
            hho hho2 = this.ksj.get(i);
            int n2 = n;
            int n3 = (this.getWidth() - this.ksg.getWidth() - this.ksQ) / 2;
            int n4 = this.ksQ;
            int n5 = this.ksa;
            hho2.h(n3, n2 -= this.ksi, n4, n5);
            boolean bl2 = false;
            if (!this.ksf) {
                if (hho2.clz() == null) {
                    bl2 = true;
                } else if (hho2.bQQ() <= 0) {
                    bl2 = true;
                }
            }
            bl = bl || hho2.cqB() != bl2;
            hho2.nR(bl2);
            if (bl2) continue;
            n += this.ksd;
        }
        this.ksg.cR(n, this.ksi);
        if (bl) {
            this.My(0);
        }
    }

    void setSelectedIndex(int n) {
        if (n >= this.ksj.size()) {
            n = -1;
        } else if (n < 0) {
            n = -1;
        }
        if (n == this.ksh) {
            return;
        }
        for (int i = 0; i < this.ksj.size(); ++i) {
            this.ksj.get(i).setPressed(n == i);
        }
        this.ksh = n;
    }

    public void N(int n, boolean bl) {
        if (n >= 0 && n < this.ksj.size()) {
            this.ksj.get(n).nD(bl);
        }
    }

    public boolean MC(int n) {
        if (n >= 0 && n < this.ksj.size()) {
            return this.ksj.get(n).clA();
        }
        return false;
    }

    public void cu(int n, int n2) {
        if (n >= 0 && n < this.ksj.size()) {
            this.ksj.get(n).do(n2);
        }
    }

    public int MD(int n) {
        if (n >= 0 && n < this.ksj.size()) {
            return this.ksj.get(n).clB();
        }
        return 0;
    }

    @Override
    public void a(ldv ldv2, hho hho2) {
        int n = this.d(hho2);
        if (n < 0) {
            assert (false);
            return;
        }
        this.ksR.H(this.d(hho2), ldv2);
    }

    @Override
    public void a(dph dph2, int n) {
        this.ksR.a(dph2, n);
    }

    @Override
    public void b(dph dph2, boolean bl) {
        this.ksR.a(dph2, bl);
    }

    @Override
    public void d(dph dph2, int n) {
        this.ksR.b(dph2, n);
    }

    @Override
    public void f(dph dph2) {
        this.ksR.f(dph2);
    }

    @Override
    public void c(dph dph2, int n) {
        this.ksR.c(dph2, n);
    }

    @Override
    public void c(hho hho2) {
    }

    static /* synthetic */ int a(hhp hhp2) {
        return hhp2.ksi;
    }

    static /* synthetic */ int b(hhp hhp2) {
        return hhp2.ksd;
    }

    static /* synthetic */ hqg c(hhp hhp2) {
        return hhp2.ksg;
    }
}

