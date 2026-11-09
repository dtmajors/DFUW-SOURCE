/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.ArrayList;

public class hhl
extends hmt {
    public static final lhu krZ = new lhu(452, 123, "gui/vendor/vendor_background_category.dds");
    private final int ksa;
    private final int ksb = 4;
    private final int ksc = 0;
    private final int ksd;
    private final a kse;
    private final hpa kgd;
    private final boolean ksf;
    private hqg ksg;
    private final hdm dXw;
    private int ksh;
    private int ksi;
    private ArrayList<hhm> ksj;
    private final lbn kjg;
    private final lbn kjh;
    private final lbn kji;
    private final lbn kjj;
    private final lbn kjk;

    public hhl(hdm hdm2, lgg lgg2, lhf lhf2, boolean bl, a a2) {
        super((hnc)hdm2, null, lgg2, lhf2);
        this.ksa = hhm.krZ.kLY.H;
        this.ksb = 4;
        this.ksc = 0;
        this.ksd = this.ksa + 4 + 0;
        this.ksh = -1;
        this.ksi = 0;
        this.ksj = lcn.emv();
        this.kjg = new lbn(this){
            final /* synthetic */ hhl ksk;
            {
                this.ksk = hhl2;
            }

            public final void W() {
                hhl.a(this.ksk);
            }
        };
        this.kjh = new lbn(this){
            final /* synthetic */ hhl ksk;
            {
                this.ksk = hhl2;
            }

            public final void W() {
                hhl.b(this.ksk);
            }
        };
        this.kji = new lbn(this){
            final /* synthetic */ hhl ksk;
            {
                this.ksk = hhl2;
            }

            public final void W() {
                hhl.c(this.ksk);
            }
        };
        this.kjj = new lbn(this){
            final /* synthetic */ hhl ksk;
            {
                this.ksk = hhl2;
            }

            public final void W() {
                hhl.d(this.ksk);
            }
        };
        this.kjk = new lbn(this){
            final /* synthetic */ hhl ksk;
            {
                this.ksk = hhl2;
            }

            public final void W() {
                hhl.e(this.ksk);
            }
        };
        this.dXw = hdm2;
        this.ksf = bl;
        this.kse = a2;
        this.kgd = new hpa((hnc)this.dXw, "Background", lgg.rlI, hhl.krZ.kLY, krZ);
        this.j(this.kgd);
        this.ksg = new hqg((hnc)this.dXw, null, lgg.rlI, lhf.rnv, this.dXw.kJV, ldb.rep, this.kjg, this.kjh, this.kjk, this.kjj, this.kji);
        int n = this.dXw.kJV.kYx.kLY.e(ldb.reo);
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
        this.clt();
    }

    private void chP() {
        this.My(this.ksi - this.ksd);
    }

    private void chQ() {
        this.My(this.ksi + this.ksd);
    }

    private void chR() {
        this.My(this.ksi - this.ksd * 5);
    }

    private void chS() {
        this.My(this.ksi + this.ksd * 5);
    }

    private void chT() {
        this.My(this.ksg.cwd());
    }

    @Override
    protected boolean LM(int n) {
        if (super.LM(n)) {
            return true;
        }
        this.My(this.ksi + this.ksd * -n);
        return true;
    }

    int cls() {
        if (this.ksf) {
            return this.ksj.size();
        }
        int n = 0;
        for (int i = 0; i < this.ksj.size(); ++i) {
            if (this.ksj.get(i).cqB()) continue;
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
        this.kse.Mu(n);
    }

    public int getSelectedIndex() {
        return this.ksh;
    }

    void a(hhm hhm2) {
        this.setSelectedIndex(this.ksj.indexOf(hhm2));
    }

    void b(hhm hhm2) {
        int n = this.ksj.indexOf(hhm2);
        if (n < 0) {
            return;
        }
        this.kse.z(n, hhm2.getLabel());
    }

    public int getCount() {
        return this.ksj.size();
    }

    public void Mz(int n) {
        if (n > this.ksj.size()) {
            for (int i = this.ksj.size(); i < n; ++i) {
                hhm hhm2 = new hhm(this.dXw, "Button " + i, lgg.rlI, lhf.rnv, this, this.ksf);
                this.j(hhm2);
                this.ksj.add(hhm2);
            }
        } else if (n < this.ksj.size()) {
            while (n < this.ksj.size()) {
                this.ksj.get(n).remove();
                this.ksj.remove(n);
            }
            if (this.ksh >= n) {
                this.ksh = n - 1;
            }
        }
        this.setSelectedIndex(this.ksh);
        this.My(this.ksi);
    }

    public void M(int n, boolean bl) {
        this.ksj.get(n).nR(!bl);
        this.clt();
    }

    public void A(int n, String string) {
        this.ksj.get(n).setLabel(string);
    }

    public String MA(int n) {
        return this.ksj.get(n).getLabel();
    }

    private void clt() {
        int n = 4;
        for (int i = 0; i < this.ksj.size(); ++i) {
            int n2 = n;
            int n3 = 5;
            int n4 = hhm.krZ.kLY.rmN;
            int n5 = this.ksa;
            this.ksj.get(i).h(n3, n2 -= this.ksi, n4, n5);
            if (this.ksj.get(i).cqB()) continue;
            n += this.ksd;
        }
        this.ksg.cR(n, this.ksi);
    }

    static /* synthetic */ void a(hhl hhl2) {
        hhl2.chP();
    }

    static /* synthetic */ void b(hhl hhl2) {
        hhl2.chR();
    }

    static /* synthetic */ void c(hhl hhl2) {
        hhl2.chQ();
    }

    static /* synthetic */ void d(hhl hhl2) {
        hhl2.chS();
    }

    static /* synthetic */ void e(hhl hhl2) {
        hhl2.chT();
    }
}

