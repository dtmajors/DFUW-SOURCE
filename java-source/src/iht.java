/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;

public class iht
extends ipx {
    private static final int lWW = 26;
    private int lWX;
    private ipx lWY;
    private ipx lWZ;
    private ipx lXa;
    private ipx lXb;
    private ihv lXc;
    private ihu lXd;
    private List<ioo> lXe = lcn.emv();
    private ios lXf;
    private iox lXg;
    private ios lXh;
    private ihw lXi = ihw.lXB;
    private ipx lXj;
    private ipx lXk;

    public iht() {
        this.a(iqo.dmT());
        this.lWX = 1;
        this.lWY = ipx.a(1, this.lWX, new ipf[0]);
        this.W(this.lWY);
        this.lWZ = ipx.h(new ipf[0]);
        this.W(this.lWZ);
        this.lXa = ipx.h(new ipf[0]);
        this.lWZ.W(this.lXa);
        this.lXb = new a(this);
        this.lWZ.W(this.lXb);
        this.lXc = this.cXJ();
        this.lXb.W(this.lXc);
        this.lXj = ipx.c(new ipf[0]);
        this.lXb.W(this.lXj);
        this.lXd = this.cYn();
        this.lXb.W(this.lXd);
        this.lXf = this.cGS();
        this.b(this.lXf);
        this.lXg = this.cGl();
        this.b(this.lXg);
        this.lXh = this.cGk();
        this.b(this.lXh);
        this.lXk = ipx.a(0, 0, new ipf[0]);
        this.lXb.W(this.lXk);
        this.setActive(true);
    }

    public ihw cYo() {
        return this.lXi;
    }

    public void a(ihw ihw2) {
        if (ihw2 == this.lXi) {
            return;
        }
        this.lXi = ihw2;
        switch (this.lXi) {
            case lXA: {
                this.lXj.a(new iqu(2, 0));
                this.lXk.a(iqv.dnf());
                break;
            }
            case lXB: {
                this.lXj.a(iqv.dnf());
                this.lXk.a(new iqu(0, 0));
            }
        }
    }

    public ihv cYp() {
        return this.lXc;
    }

    public int getIconWidth() {
        return this.lXc != null ? this.lXc.getIconWidth() : 0;
    }

    public void E(int n, int n2, int n3) {
        if (this.lXc != null) {
            this.lXc.E(n, n2, n3);
        }
    }

    public int cYq() {
        return this.lWX;
    }

    public void QX(int n) {
        if (n == this.lWX) {
            return;
        }
        this.lWX = n;
        this.lWY.a(new iqu(1, n));
    }

    public String cYr() {
        return this.lXc != null ? this.lXc.cYr() : null;
    }

    public void b(itd itd2) {
        if (this.lXc != null) {
            this.lXc.b(itd2);
        }
    }

    public void ql(String string) {
        if (this.lXc != null) {
            this.lXc.ql(string);
        }
    }

    public void A(loz loz2) {
        if (this.lXc != null) {
            this.lXc.A(loz2);
        }
    }

    public String cYs() {
        return this.lXc != null ? this.lXc.cYs() : null;
    }

    public void c(itd itd2) {
        if (this.lXc != null) {
            this.lXc.c(itd2);
        }
    }

    public void qm(String string) {
        if (this.lXc != null) {
            this.lXc.qm(string);
        }
    }

    public void B(loz loz2) {
        if (this.lXc != null) {
            this.lXc.B(loz2);
        }
    }

    public void b(jmr jmr2) {
        this.B(iht.c(jmr2));
    }

    public void e(jmq jmq2) {
        this.B(this.f(jmq2));
    }

    public List<ioo> cGD() {
        return Collections.unmodifiableList(this.lXe);
    }

    public int a(ioo ioo2) {
        return this.lXe.indexOf(ioo2);
    }

    public ios cYt() {
        return this.lXf;
    }

    public iox cYu() {
        return this.lXg;
    }

    public ios cYv() {
        return this.lXh;
    }

    public void a(ioo ioo2, int n) {
        if (ioo2 == null) {
            return;
        }
        this.lXe.add(n, ioo2);
        this.lXd.a(ioo2, n);
    }

    public void b(ioo ioo2) {
        this.a(ioo2, this.lXe.size());
    }

    public boolean c(ioo ioo2) {
        int n = this.lXe.indexOf(ioo2);
        if (n == -1) {
            return false;
        }
        this.lXe.remove(n);
        this.lXd.QS(n);
        return true;
    }

    public ioo QY(int n) {
        ioo ioo2 = this.lXe.remove(n);
        ioo2.removeFromParent();
        return ioo2;
    }

    public void a(int n, int n2, int n3, loz loz2, loz loz3) {
        this.QX(n3);
        this.E(n, 0, n2);
        this.A(loz2);
        if (loz3 != null) {
            this.B(loz3);
        }
    }

    public void a(int n, int n2, int n3, String string, loz loz2) {
        this.QX(n3);
        this.E(n, 0, n2);
        this.ql(string);
        if (loz2 != null) {
            this.B(loz2);
        }
    }

    public void a(int n, int n2, int n3, loz loz2, jmq jmq2) {
        this.a(n, n2, n3, loz2, this.f(jmq2));
    }

    public void a(int n, int n2, int n3, String string, jmq jmq2) {
        this.a(n, n2, n3, string, this.f(jmq2));
    }

    public void a(int n, int n2, int n3, loz loz2) {
        this.a(n, n2, n3, loz2, (loz)null);
    }

    public ipx cYw() {
        return this.lXj;
    }

    public ipx cYx() {
        return this.lXk;
    }

    public String cYy() {
        return this.lXc != null ? this.lXc.cYy() : null;
    }

    public ist cYz() {
        return this.lXc != null ? this.lXc.cYz() : null;
    }

    public void d(itd itd2) {
        if (this.lXc != null) {
            this.lXc.d(itd2);
        }
    }

    public void C(loz loz2) {
        if (this.lXc != null) {
            this.lXc.C(loz2);
        }
    }

    public void qn(String string) {
        if (this.lXc != null) {
            this.lXc.qn(string);
        }
    }

    public boolean cYA() {
        return this.lXc != null ? this.lXc.cYA() : false;
    }

    public void qp(boolean bl) {
        if (this.lXc != null) {
            this.lXc.qp(bl);
        }
    }

    public void h(ipf ipf2) {
        this.lXa.removeAllChildren();
        this.lXa.W(ipf2);
    }

    @Override
    public void cPw() {
        this.lWZ.hz(this.djZ() ? 1.0f : 0.5f);
    }

    protected void dH(int n, int n2) {
    }

    protected void dI(int n, int n2) {
    }

    protected void dJ(int n, int n2) {
    }

    protected void a(ios ios2) {
    }

    protected void qn(boolean bl) {
    }

    protected void cGR() {
    }

    public ihv cXJ() {
        return new ihv();
    }

    public ihu cYn() {
        return new ihl();
    }

    public ios cGS() {
        return new ivy(this){
            final /* synthetic */ iht lXl;
            {
                this.lXl = iht2;
            }

            public void cLq() {
                this.lXl.a(this);
            }
        };
    }

    public iox cGl() {
        return new ivr(this){
            final /* synthetic */ iht lXl;
            {
                this.lXl = iht2;
            }

            public void pn(boolean bl) {
                this.lXl.qn(bl);
            }
        };
    }

    public ios cGk() {
        return new ivc(this){
            final /* synthetic */ iht lXl;
            {
                this.lXl = iht2;
            }

            public void cLq() {
                this.lXl.cGR();
            }
        };
    }

    private loz f(jmq jmq2) {
        return jjd.h(jmq2);
    }

    private static loz c(jmr jmr2) {
        return jjd.d(jmr2);
    }

    static /* synthetic */ ihw a(iht iht2) {
        return iht2.lXi;
    }

    static /* synthetic */ ipx b(iht iht2) {
        return iht2.lXk;
    }

    static /* synthetic */ ihu c(iht iht2) {
        return iht2.lXd;
    }
}

