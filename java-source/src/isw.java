/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class isw
extends ipq {
    private isu mxf = isu.mxO;
    private isf mxd = isf.mwO;
    private int mjJ = 12;
    private int mxW = 0xFFFFFF;
    private int mxX = 0xFFFFFF;
    private int mxY = 0x888888;
    private isx mxg = null;
    private ite mxh = ite.myE;
    boolean mxZ = false;
    boolean mya = false;
    int myb = 0xFFFFFF;
    private boolean myc;
    private boolean myd;
    private boolean mye;
    private boolean myf;
    private boolean myg;
    private boolean myh;
    private boolean myi;
    private int myj;
    private int myk;
    private String myl;
    private String mym;
    private boolean myn = true;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            isw isw2 = (isw)ipf2;
            if (isw2.dqi() != isu.mxO) {
                isw2.setSize(isw.i(isw2), isw.j(isw2));
            }
        }
    };

    public isw() {
        this.a(mdv);
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.myc = false;
        this.myd = false;
        this.mye = false;
        this.myf = false;
        this.myg = false;
        this.myh = false;
        this.myi = false;
    }

    public int dqg() {
        return this.myj;
    }

    public int dqh() {
        return this.myk;
    }

    public String getText() {
        return "";
    }

    public void o(loz loz2) {
    }

    public void setText(String string) {
    }

    public void b(loz loz2, int n) {
    }

    public void K(String string, int n) {
    }

    public isu dqi() {
        return this.mxf;
    }

    public void a(isu isu2) {
        if (isu2 == this.mxf) {
            return;
        }
        this.mxf = isu2;
        this.dqu();
        this.dku();
    }

    public boolean dqj() {
        return this.myn;
    }

    public void sv(boolean bl) {
        this.myn = bl;
    }

    public isf dqk() {
        return this.mxd;
    }

    public int bll() {
        return this.mjJ;
    }

    public void a(isf isf2, int n) {
        if (isf2 == this.mxd && n == this.mjJ) {
            return;
        }
        this.mxd = isf2;
        this.mjJ = n;
        this.dqv();
        this.dku();
    }

    public void b(isf isf2) {
        this.a(isf2, this.mjJ);
    }

    public void zY(int n) {
        this.a(this.mxd, n);
    }

    public int dql() {
        return this.mxW;
    }

    public void Rk(int n) {
        if (n == this.mxW) {
            return;
        }
        this.mxW = n;
        this.mxX = n;
        this.mxY = n;
        this.dqy();
    }

    public isx dqm() {
        return this.mxg;
    }

    public void a(isx isx2) {
        if (isx2 == this.mxg) {
            return;
        }
        this.mxg = isx2;
        this.dqw();
        this.dku();
    }

    public ite dqn() {
        return this.mxh;
    }

    public void a(ite ite2) {
        if (ite2 == this.mxh) {
            return;
        }
        this.mxh = ite2;
        this.dqx();
        this.dku();
    }

    public int dqo() {
        return this.mxX;
    }

    public void ST(int n) {
        if (this.mxX == n) {
            return;
        }
        this.mxX = n;
        if (this.djR()) {
            this.Rk(this.mxX);
        }
    }

    public int dqp() {
        return this.mxY;
    }

    public void SU(int n) {
        if (this.mxY == n) {
            return;
        }
        this.mxY = n;
        if (!this.djR()) {
            this.Rk(this.mxY);
        }
    }

    public boolean dqq() {
        return this.mxZ;
    }

    public void sw(boolean bl) {
        if (bl == this.mxZ) {
            return;
        }
        this.mxZ = bl;
        this.myh = true;
        this.dkg();
    }

    public boolean dqr() {
        return this.mya;
    }

    public void sr(boolean bl) {
        if (bl == this.mya) {
            return;
        }
        this.mya = bl;
        this.myi = true;
        this.dkg();
    }

    public int dqs() {
        return this.myb;
    }

    public void SR(int n) {
        if (n == this.myb) {
            return;
        }
        this.myb = n;
        this.myi = true;
        this.dkg();
    }

    public void dpv() {
        this.djE().b("TextField_retrieveText", new Object[]{this.getId()});
    }

    public void rs(String string) {
        this.oZ(string);
    }

    public void rt(String string) {
        this.pa(string);
    }

    public void ru(String string) {
        this.myl = string;
    }

    public void rv(String string) {
        this.myl = null;
    }

    @Override
    public void djx() {
        if (this.djD()) {
            lfn.b(4, this.getClass().getSimpleName(), this.djE().getClass().getSimpleName() + ": SFJ2FWindow: UI locked; waiting for text = " + this.getText());
        }
    }

    @Override
    public void eq(int n, int n2) {
        this.myj = n;
        this.myk = n2;
        if (this.myn) {
            super.eq(n, n2);
        }
    }

    @Override
    public void m(int n, int n2, int n3, int n4) {
        this.myj = n3;
        this.myk = n4;
        super.m(n, n2, n3, n4);
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.myd) {
            this.myd = false;
            this.djE().b("TextField_setAutoSize", new Object[]{this.getId(), this.mxf.ordinal()});
        }
        if (this.myc) {
            this.myc = false;
            this.dpx();
        }
        if (this.mye) {
            this.mye = false;
            this.djE().b("TextField_setHorizontalAlign", new Object[]{this.getId(), this.dqt()});
        }
        if (this.myf) {
            this.myf = false;
            this.djE().b("TextField_setVerticalAlign", new Object[]{this.getId(), this.mxh.ordinal()});
        }
        if (this.myg) {
            this.myg = false;
            this.dpy();
        }
        this.dqz();
    }

    @Override
    public void dkl() {
        super.dkl();
        this.dku();
    }

    @Override
    public void djm() {
        super.djm();
        this.myd = false;
        this.myc = false;
        this.mye = false;
        this.myf = false;
        this.myg = false;
        this.dqz();
        this.dqA();
    }

    @Override
    public void djo() {
        this.djE().b("TextField_setSize", new Object[]{this.getId(), this.getWidth(), this.getHeight()});
    }

    @Override
    public void cPv() {
        this.Rk(this.djR() ? this.mxX : this.mxY);
    }

    public void pI(String string) {
    }

    @Override
    public boolean dK(int n, int n2) {
        return this.dqB();
    }

    @Override
    public boolean dM(int n, int n2) {
        return this.dqB();
    }

    @Override
    public boolean dL(int n, int n2) {
        return this.dqC();
    }

    @Override
    public hyn dd(int n, int n2) {
        return this.mym != null ? this.pk(this.mym) : super.dd(n, n2);
    }

    public void oZ(String string) {
    }

    public void pa(String string) {
    }

    public void rw(String string) {
        this.djE().b(hxv.llj);
    }

    public void rx(String string) {
        this.djE().b(hxv.llh);
    }

    public hyn pk(String string) {
        return null;
    }

    public void dpx() {
        this.djE().b("TextField_setFont", new Object[]{this.getId(), this.qL(this.mxd.getFontFamily()), this.mjJ});
    }

    public void dpy() {
        this.djE().b("TextField_setTextColor", new Object[]{this.getId(), this.mxW});
    }

    protected int dqt() {
        return this.mxg != null ? this.qL(this.mxg.getValue()) : -1;
    }

    public void dqu() {
        if (this.myd) {
            return;
        }
        this.myd = true;
        this.dkg();
    }

    public void dqv() {
        if (this.myc) {
            return;
        }
        this.myc = true;
        this.dkg();
    }

    public void dqw() {
        if (this.mye) {
            return;
        }
        this.mye = true;
        this.dkg();
    }

    public void dqx() {
        if (this.myf) {
            return;
        }
        this.myf = true;
        this.dkg();
    }

    public void dqy() {
        if (this.myg) {
            return;
        }
        this.myg = true;
        this.dkg();
    }

    public void dqz() {
        if (this.myh && this.dhV()) {
            this.myh = false;
            this.djE().b("TextField_setSelectable", new Object[]{this.getId(), this.mxZ});
        }
    }

    public void dqA() {
        if (this.myi && this.dhV()) {
            this.myi = false;
            this.djE().b("TextField_setBackground", new Object[]{this.getId(), this.mya, this.myb});
        }
    }

    private boolean dqB() {
        if (!lhn.equal(this.myl, this.mym)) {
            if (this.mym != null) {
                this.rx(this.mym);
            }
            this.mym = this.myl;
            if (this.mym != null) {
                this.rw(this.mym);
            }
            return true;
        }
        return false;
    }

    private boolean dqC() {
        if (this.mym != null) {
            this.rx(this.mym);
            return true;
        }
        return false;
    }

    static /* synthetic */ int i(isw isw2) {
        return isw2.myj;
    }

    static /* synthetic */ int j(isw isw2) {
        return isw2.myk;
    }
}

