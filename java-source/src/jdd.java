/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public abstract class jdd
extends ipz
implements iua {
    private boolean lMW;
    private ipf lMX;
    private ipf mSJ;
    private ipb mSK;
    private ipb mSL;
    private hvr mSM;
    private ist lCt;
    private iwv mSN;

    public jdd() {
        this.a(irl.dnr());
        this.W(ipx.a(300, 26, new ipf[0]));
        this.lMX = new ipk(0x181818, 321, 22);
        this.W(ipx.d(this.lMX));
        this.W(this.dyt());
    }

    public ipf dqP() {
        return this.lMX;
    }

    @Override
    public boolean getSelected() {
        return this.lMW;
    }

    @Override
    public void setSelected(boolean bl) {
        this.lMW = bl;
        iul.b(this, bl);
        this.cND();
    }

    public void rX(String string) {
        this.mSK.qP(string);
    }

    public void rY(String string) {
        if (string != null && !string.isEmpty()) {
            this.mSL.qP(string);
            if (this.mSM == null) {
                this.mSM = new hvl(this, 1.0f, 0.0f, 1.0){
                    final /* synthetic */ jdd mSO;
                    {
                        this.mSO = jdd2;
                        super(f, f2, d2);
                    }

                    public void hz(float f) {
                        jdd.a(this.mSO).hz(f);
                    }
                };
                hso.cxK().cxP().czy().a(this.mSM);
            }
        } else {
            this.mSL.qP(null);
            if (this.mSM != null) {
                hso.cxK().cxP().czy().b(this.mSM);
                this.mSM = null;
            }
        }
    }

    public ipf dys() {
        return this.mSJ;
    }

    public void D(loz loz2) {
        this.lCt.o(loz2);
    }

    public void rZ(String string) {
        this.mSN.qP(string);
    }

    public boolean dxi() {
        return false;
    }

    public abstract jcg dyp();

    @Override
    public void kh(float f) {
        super.kh(f);
        if (this.lMX != null) {
            this.lMX.hz(f);
        }
    }

    @Override
    public void cND() {
        if (this.lMW) {
            this.lCt.Rk(12357465);
        } else if (this.dkb()) {
            this.lCt.Rk(0xC0C0C0);
        } else {
            this.lCt.Rk(0xABABAB);
        }
    }

    public void dyq() {
    }

    public abstract hyn dyr();

    public abstract jbx dxe();

    protected void b(jbx jbx2, boolean bl) {
        this.rX(jbx2.path + "off_normal.png");
        this.rY(bl ? jbx2.path + "glow.png" : null);
    }

    private ipf dyt() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.h(this.dyu(), this.dyw())));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        this.mSJ = new ipk(0x2F2F2F, 1, 18);
        ipx2.W(ipx.d(this.mSJ));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.duM()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x2F2F2F, 1, 18)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dyx()));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dyu() {
        ipx ipx2 = new ipx(this, irl.dnr()){
            final /* synthetic */ jdd mSO;
            {
                this.mSO = jdd2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                jbx jbx2 = this.mSO.dxe();
                return iae.oJ(jbx2.mQf.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(this.dyv());
        return ipx2;
    }

    private ipf dyv() {
        this.mSK = new ipb(null, 22, 22);
        return this.mSK;
    }

    private ipf dyw() {
        this.mSL = new ipb(null, 22, 22);
        return this.mSL;
    }

    private ipf duM() {
        this.lCt = new ist(isf.mwO, 14, 0xABABAB);
        return this.lCt;
    }

    private ipf dyx() {
        this.mSN = new iwv(this, null, 22, 22, null){
            final /* synthetic */ jdd mSO;
            {
                this.mSO = jdd2;
                super(string, n, n2, loz2);
            }

            public hyn dd(int n, int n2) {
                return this.mSO.dyr();
            }
        };
        return this.mSN;
    }

    static /* synthetic */ ipb a(jdd jdd2) {
        return jdd2.mSL;
    }
}

