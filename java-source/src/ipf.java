/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;
import java.util.Map;

public class ipf
implements ipo {
    private int hf = -1;
    private ioa mqP;
    iph mqQ;
    private int mqR;
    private int mqS;
    private int mbc;
    private int mbd;
    private hvr mqT = null;
    private float mqU = 1.0f;
    private int mom = 0;
    private ipd mqV = ipd.mqA;
    private float mqW = 1.0f;
    private float mqX = 1.0f;
    private iqz mdv = iqz.dnj();
    private String _name;
    private String mqY;
    private int mqZ = 0;
    private int mra = 0;
    private float mrb = 1.0f;
    private Map<String, lil<Object, hsu, Object>> mrc;
    private hss loj = null;
    private List<ipg> mrd;
    private static final double mre = 0.2;
    private double mrf = 0.0;
    private lie mrg;
    private static final long mrh = 1L;
    private static final long mri = 2L;
    private static final long mrj = 4L;
    private static final long mrk = 8L;
    private static final long mrl = 16L;
    private static final long mrm = 32L;
    private static final long mrn = 64L;
    private static final long mro = 128L;
    private static final long mrp = 256L;
    private static final long mrq = 512L;
    private static final long mrr = 1024L;
    private static final long mrs = 2048L;
    private static final long mrt = 4096L;
    private static final long mru = 8192L;
    private static final long mrv = 16384L;
    private static final long mrw = 32768L;
    private static final long mrx = 65536L;
    private static final long mry = 131072L;
    static final long mrz = 18L;
    private long mrA = 114691L;

    public void a(ioa ioa2) {
        assert (this.mqP == null);
        this.hf = ioa2.p(this);
        this.mqP = ioa2;
        if (this.mqV != ipd.mqA) {
            this.rw(true);
        }
        this.dlh();
        this.dlk();
    }

    public void cleanUp() {
        this.mqP.RC(this.mom);
        this.mqP.q(this);
        this.hf = -1;
        this.mqP = null;
        this.mom = 0;
        this.rq(false);
        this.rr(false);
        this.rp(false);
        this.rs(false);
        this.rt(false);
        this.ru(false);
        this.rv(false);
        this.rw(false);
        this.rx(false);
        this.ry(false);
        this.rz(false);
        this.rA(false);
        this.dll();
        this.dlm();
        this.dln();
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[id: " + this.hf + (this._name != null ? ", name: " + this._name : "") + "]";
    }

    @Override
    public ipf dik() {
        return this;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String string) {
        this._name = string;
    }

    public String djC() {
        return this.mqY;
    }

    public void qQ(String string) {
        this.mqY = string != null ? string : "";
    }

    public final boolean dhV() {
        return this.dkN();
    }

    public final boolean djD() {
        return this.mom > 0;
    }

    @Override
    public final ioa djE() {
        return this.mqP;
    }

    public final boolean isInitialized() {
        return this.hf != -1;
    }

    @Override
    public final int getId() {
        return this.hf;
    }

    public final void RF(int n) {
        if (this.mqP == null || !this.mqP.dhT()) {
            throw new RuntimeException("invalid operation");
        }
        this.hf = n;
    }

    public final boolean djF() {
        return !this.isVirtual();
    }

    public boolean djG() {
        return false;
    }

    public int djH() {
        return 0;
    }

    public int djI() {
        return 0;
    }

    public final iph djJ() {
        return this.mqQ;
    }

    @Override
    public final void removeFromParent() {
        if (this.mqQ != null) {
            this.mqQ.X(this);
        }
    }

    public final int djK() {
        return this.mqQ != null ? this.mqQ.getId() : -1;
    }

    public final int getIndexInParent() {
        return this.mqQ != null ? this.mqQ.V(this) : -1;
    }

    public final void RG(int n) {
        if (this.mqQ != null) {
            this.mqQ.b(this, n);
        }
    }

    public final void cqG() {
        if (this.mqQ != null) {
            this.mqQ.b(this, 0);
        }
    }

    public final void cqF() {
        if (this.mqQ != null) {
            this.mqQ.b(this, this.mqQ.bfn());
        }
    }

    public final iob dhJ() {
        return this.mqP != null ? this.mqP.dhJ() : null;
    }

    public boolean R(ipf ipf2) {
        return ipf2 == this;
    }

    public final boolean S(ipf ipf2) {
        for (ipf2 = ipf2.djJ(); ipf2 != null; ipf2 = ipf2.djJ()) {
            if (ipf2 != this) continue;
            return true;
        }
        return false;
    }

    public final boolean rd(boolean bl) {
        for (iph iph2 = this.djJ(); iph2 != null; iph2 = iph2.djJ()) {
            if (iph2.dlu() != bl) continue;
            return true;
        }
        return false;
    }

    public final boolean re(boolean bl) {
        for (iph iph2 = this.djJ(); iph2 != null; iph2 = iph2.djJ()) {
            if (iph2.djR() != bl) continue;
            return true;
        }
        return false;
    }

    @Override
    public final int getX() {
        return this.mqR;
    }

    @Override
    public final int getY() {
        return this.mqS;
    }

    @Override
    public final int getWidth() {
        return this.mbc;
    }

    @Override
    public final int getHeight() {
        return this.mbd;
    }

    @Override
    public final void r(int n, int n2, int n3, int n4) {
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        this.v(n, n2, n3, n4);
    }

    @Override
    public final void ek(int n, int n2) {
        this.r(n, n2, this.mbc, this.mbd);
    }

    public final void el(int n, int n2) {
        this.ek(n - this.getWidth() / 2, n2 - this.getHeight() / 2);
    }

    public final void s(int n, int n2, int n3, int n4) {
        this.el(n + n3, n2 + n4);
    }

    @Override
    public final void setSize(int n, int n2) {
        this.r(this.mqR, this.mqS, n, n2);
    }

    public final void RH(int n) {
        this.ek(n, this.mqS);
    }

    public final void RI(int n) {
        this.ek(this.mqR, n);
    }

    public final void setWidth(int n) {
        this.setSize(n, this.mbd);
    }

    public final void setHeight(int n) {
        this.setSize(this.mbc, n);
    }

    @Override
    public final boolean djL() {
        return this.dkL();
    }

    public final boolean djM() {
        ipf ipf2 = this;
        while (ipf2 != null) {
            if (!ipf2.dkL()) {
                return false;
            }
            ipf2 = ipf2.mqQ;
        }
        return this.mqP != null ? this.mqP.isVisible() : false;
    }

    public final boolean djN() {
        ipf ipf2 = this;
        while (ipf2 != null) {
            if (!ipf2.dkL()) {
                return false;
            }
            ipf2 = ipf2.mqQ;
        }
        return this.mqP != null ? this.mqP.cEU() : false;
    }

    public final boolean djO() {
        return this.dkL() || !this.dkM();
    }

    @Override
    public final void setVisible(boolean bl) {
        if (bl == this.dkL()) {
            return;
        }
        this.rn(bl);
        if (this.dkM()) {
            this.dlf();
            if (this.mqQ != null) {
                this.mqQ.a(this, this.dkL());
                this.mqQ.pack();
            }
        } else if (this.dkN()) {
            this.dkn();
        } else {
            this.dlf();
        }
        this.cEc();
        this.dkq();
    }

    public void rf(boolean bl) {
        if (this.djE() == null) {
            this.setVisible(bl);
            return;
        }
        this.dlm();
        this.mqT = bl ? new iog(this, this){
            final /* synthetic */ ipf mrB;
            {
                this.mrB = ipf2;
                super(ipf3);
            }

            public void czS() {
                ipf.T(this.mrB);
            }
        } : new iof(this, this){
            final /* synthetic */ ipf mrB;
            {
                this.mrB = ipf2;
                super(ipf3);
            }

            public void czS() {
                ipf.T(this.mrB);
            }
        };
        hso.cxK().cxP().czy().a(this.mqT);
    }

    public boolean djP() {
        return this.dkM();
    }

    @Override
    public void rg(boolean bl) {
        if (bl == this.dkM()) {
            return;
        }
        this.ro(bl);
        if (bl && this.mqQ != null) {
            this.mqQ.pack();
        }
    }

    public final float getAlpha() {
        return this.mqU;
    }

    public final void hz(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f == this.mqU) {
            return;
        }
        this.mqU = f;
        this.dlg();
        this.dkt();
    }

    @Override
    public final iqz djQ() {
        return this.mdv;
    }

    @Override
    public final void a(iqz iqz2) {
        if (iqz2 == this.mdv) {
            return;
        }
        this.mdv = iqz2;
        this.pack();
    }

    public boolean djR() {
        return false;
    }

    public final boolean djS() {
        return this.dkZ();
    }

    public final void rh(boolean bl) {
        if (bl == this.dkZ()) {
            return;
        }
        this.rB(bl);
        this.dkg();
    }

    public ipd djT() {
        return this.mqV;
    }

    public void a(ipd ipd2) {
        if (ipd2 == this.mqV) {
            return;
        }
        this.mqV = ipd2;
        this.rw(true);
        this.dkg();
    }

    public int djU() {
        return this.mqZ;
    }

    public int djV() {
        return this.mra;
    }

    public boolean djW() {
        return this.dla();
    }

    public float djX() {
        return this.mrb;
    }

    public boolean djY() {
        return this.dlb();
    }

    public boolean djZ() {
        return true;
    }

    public void setActive(boolean bl) {
        this.hz(bl ? 1.0f : 0.5f);
    }

    public float dka() {
        return this.mqW;
    }

    public void kK(float f) {
        this.N(f, this.mqX);
    }

    public float getScaleY() {
        return this.mqX;
    }

    public void setScaleY(float f) {
        this.N(this.mqW, f);
    }

    public void N(float f, float f2) {
        if (f == this.mqW && f2 == this.mqX) {
            return;
        }
        this.mqW = f;
        this.mqX = f2;
        this.dlj();
    }

    public boolean cZt() {
        return false;
    }

    @Override
    public boolean dkb() {
        return false;
    }

    @Override
    public void ri(boolean bl) {
    }

    public boolean dkc() {
        return this.dlc();
    }

    public void rj(boolean bl) {
        this.rE(bl);
    }

    public static hvs czy() {
        return hyn.czy();
    }

    public boolean dkd() {
        return true;
    }

    public final void dke() {
        if (this.mqP != null && this.dkd()) {
            ++this.mom;
            this.mqP.RB(1);
        }
    }

    public final void dkf() {
        if (this.mqP != null && this.dkd()) {
            --this.mom;
            assert (this.mom >= 0);
            this.mqP.RC(1);
        }
    }

    public final void dkg() {
        if (this.dkP()) {
            return;
        }
        this.rr(true);
        if (this.mqQ != null) {
            this.mqQ.dlx();
        }
    }

    public void pack() {
        this.dkE();
        this.dkF();
    }

    public final ioc em(int n, int n2) {
        ioc ioc2 = ioc.eh(n, n2);
        for (ipf ipf2 = this; ipf2 != null; ipf2 = ipf2.djJ()) {
            ioc2.cf += ipf2.mqR;
            ioc2.cg += ipf2.mqS;
        }
        return ioc2;
    }

    public final ioc en(int n, int n2) {
        ioc ioc2 = ioc.eh(n, n2);
        for (ipf ipf2 = this; ipf2 != null; ipf2 = ipf2.djJ()) {
            ioc2.cf -= ipf2.mqR;
            ioc2.cg -= ipf2.mqS;
        }
        return ioc2;
    }

    public final ioc eo(int n, int n2) {
        ioc ioc2 = this.em(n, n2);
        if (this.mqP != null) {
            ioc2.cf += (int)this.mqP.cEE();
            ioc2.cg += (int)this.mqP.cEF();
        }
        return ioc2;
    }

    public final ioc ep(int n, int n2) {
        return this.mqP != null ? this.en(n - (int)this.mqP.cEE(), n2 - (int)this.mqP.cEF()) : this.en(n, n2);
    }

    public final ioc a(int n, int n2, ipf ipf2) {
        ioc ioc2 = this.eo(n, n2);
        return ipf2.ep(ioc2.cf, ioc2.cg);
    }

    public float cMR() {
        return 1.0f;
    }

    @Override
    public void kh(float f) {
    }

    public void djx() {
    }

    public void dkh() {
        this.djE().b("DisplayObject_removeFromParent", new Object[]{this.hf});
    }

    public int qL(String string) {
        return this.mqP.qL(string);
    }

    public void dki() {
        if (this.dkX()) {
            this.cPj();
            this.rz(false);
        }
    }

    public void updateLayout() {
        if (this.dkY()) {
            this.cPk();
            this.rz(false);
            this.rA(false);
        }
    }

    public boolean dkj() {
        return this.mdv != null && this.mdv.dne();
    }

    public boolean dkk() {
        return this.mdv != null && this.mdv.dmP();
    }

    public void a(String string, hsu hsu2, int n) {
        if (!this.isInitialized()) {
            this.a(string, hsu2, (Object)n);
        } else {
            this.dlp();
            this.loj.a(string, hsu2, n);
        }
    }

    public void a(String string, hsu hsu2, String string2) {
        if (!this.isInitialized()) {
            this.a(string, hsu2, (Object)string2);
        } else {
            this.dlp();
            this.loj.a(string, hsu2, string2);
        }
    }

    public void a(String string, hsu hsu2, float f) {
        if (!this.isInitialized()) {
            this.a(string, hsu2, Float.valueOf(f));
        } else {
            this.dlp();
            this.loj.a(string, hsu2, Float.valueOf(f));
        }
    }

    public void a(String string, hsu hsu2, boolean bl) {
        if (!this.isInitialized()) {
            this.a(string, hsu2, (Object)bl);
        } else {
            this.dlp();
            this.loj.a(string, hsu2, bl);
        }
    }

    public Integer nh(String string) {
        return this.loj != null ? this.loj.nh(string) : (Integer)this.qR(string);
    }

    public Float ni(String string) {
        return this.loj != null ? this.loj.ni(string) : (Float)this.qR(string);
    }

    public String nj(String string) {
        return this.loj != null ? this.loj.nj(string) : (String)this.qR(string);
    }

    public Boolean nk(String string) {
        return this.loj != null ? this.loj.nk(string) : (Boolean)this.qR(string);
    }

    public final <T extends Enum<T>> T a(String string, T t) {
        int n = this.nh(string);
        Enum[] enumArray = (Enum[])t.getClass().getEnumConstants();
        return (T)(n >= 0 && n < enumArray.length ? enumArray[n] : t);
    }

    public boolean b(String string, mhs mhs2) {
        return this.loj != null ? this.loj.b(string, mhs2) : false;
    }

    public void w(String string, int n) {
        if (this.loj != null) {
            this.loj.w(string, n);
        } else {
            this.b(string, n);
        }
    }

    public void d(String string, float f) {
        if (this.loj != null) {
            this.loj.d(string, f);
        } else {
            this.b(string, Float.valueOf(f));
        }
    }

    public void q(String string, boolean bl) {
        if (this.loj != null) {
            this.loj.q(string, bl);
        } else {
            this.b(string, bl);
        }
    }

    public void B(String string, String string2) {
        if (this.loj != null) {
            this.loj.B(string, string2);
        } else {
            this.b(string, string2);
        }
    }

    public void nl(String string) {
        this.loj.nl(string);
    }

    public void dhU() {
    }

    public static boolean czu() {
        return hso.cxK().cxP().czu();
    }

    public static boolean t(int n, int n2, int n3, int n4) {
        return n >= 0 && n2 >= 0 && n < n3 && n2 < n4;
    }

    public static boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        return n < n5 && n2 < n6 && n + n3 >= 0 && n2 + n4 >= 0;
    }

    public void djy() {
    }

    public void eq(int n, int n2) {
        if (n != this.mbc || n2 != this.mbd) {
            this.mbc = n;
            this.mbd = n2;
            if (this.mqQ != null) {
                this.mqQ.pack();
            }
            this.dkF();
        }
    }

    public void cPj() {
        if (this.mdv != null) {
            this.mdv.e(this);
        }
    }

    public void cPk() {
        if (this.mdv != null) {
            this.mdv.i(this);
        }
    }

    public void ei(int n, int n2) {
        if (this.dkQ() && this.dkR()) {
            this.rs(false);
            this.rt(false);
            this.djn();
        } else if (this.dkQ()) {
            this.rs(false);
            this.dkm();
        } else if (this.dkR()) {
            this.rt(false);
            this.djo();
        }
        if (this.dkS()) {
            this.ru(false);
            this.dkn();
        }
        if (this.dkT()) {
            this.rv(false);
            this.dko();
        }
        this.dli();
        this.dkJ();
        this.ew(n, n2);
    }

    public void cCy() {
    }

    public void cWm() {
    }

    public void djm() {
        this.rr(false);
        this.rs(false);
        this.rt(false);
        this.ru(false);
        this.rv(false);
        if (this.mqV != ipd.mqA) {
            this.rw(true);
            this.dli();
        }
    }

    public void dA(int n, int n2) {
    }

    public void dkl() {
    }

    public void RJ(int n) {
        this.djE().b("DisplayObject_attach", new Object[]{this.getId(), this.djK(), this.djC()});
        this.dke();
    }

    public void did() {
        this.djE().b("DisplayObject_removeFromParent", new Object[]{this.getId()});
    }

    public void djn() {
        this.djE().b("DisplayObject_setGeometry", new Object[]{this.hf, this.mqR + this.djU(), this.mqS + this.djV(), this.mbc, this.mbd});
    }

    public void dkm() {
        this.djE().b("DisplayObject_setPosition", new Object[]{this.hf, this.mqR + this.djU(), this.mqS + this.djV()});
    }

    public void djo() {
        this.djE().b("DisplayObject_setSize", new Object[]{this.hf, this.mbc, this.mbd});
    }

    public void dkn() {
        this.djE().b("DisplayObject_setVisible", new Object[]{this.hf, this.dkL() && this.djW()});
    }

    public void dko() {
        this.djE().b("DisplayObject_setAlpha", new Object[]{this.hf, Float.valueOf(this.mqU * this.djX())});
    }

    public void dkp() {
        this.djE().b("DisplayObject_setBlendMode", new Object[]{this.getId(), this.mqV.ordinal()});
    }

    public void er(int n, int n2) {
        this.djE().b("DisplayObjectContainer_setChildIndex", new Object[]{n, this.hf, n2});
    }

    public void cEc() {
    }

    public void dkq() {
    }

    @Override
    public boolean dF(int n, int n2) {
        return false;
    }

    @Override
    public boolean u(int n, int n2, int n3, int n4) {
        return false;
    }

    public void rk(boolean bl) {
    }

    public void RK(int n) {
    }

    public void b(jnz jnz2, jnz jnz3) {
    }

    public void qQ(boolean bl) {
        if (bl) {
            this.dlh();
        }
    }

    public void m(int n, int n2, int n3, int n4) {
        this.a(n, n2, n3, n4, false);
    }

    public void RL(int n) {
        assert (this.mqQ != null);
        this.mqQ.e(this, n);
    }

    public void cDZ() {
    }

    public void dkr() {
        if (this.mrd != null) {
            for (ipg ipg2 : this.mrd) {
                ipg2.dkr();
            }
        }
    }

    public void dks() {
    }

    public void dkt() {
    }

    public void cZv() {
        if (this.mrd != null) {
            for (ipg ipg2 : this.mrd) {
                ipg2.cZv();
            }
        }
    }

    protected final void dku() {
        if (this.mqP != null && this.mqP.cEU()) {
            if (!this.dlc()) {
                this.djy();
            } else {
                double d2 = this.mqP.getMessageDelegator().arc().rgz;
                if (d2 - this.mrf >= 0.2) {
                    this.mrf = d2;
                    this.djy();
                    this.dln();
                } else if (this.mrg == null) {
                    this.mrg = new lie(this, 0.2, true){
                        final /* synthetic */ ipf mrB;
                        {
                            this.mrB = ipf2;
                            super(d2, bl);
                        }

                        public void dh(double d2) {
                            ipf.U(this.mrB);
                        }
                    };
                    this.mrg.e(this.mqP.getMessageDelegator());
                }
            }
        } else {
            this.rq(true);
        }
    }

    protected final void es(int n, int n2) {
        if (this.dkP()) {
            this.rr(false);
            if (this.dkN()) {
                if (this.djS()) {
                    this.ei(n, n2);
                    this.eu(n, n2);
                } else {
                    this.dkA();
                }
            } else if (this.djS() && this.djL()) {
                this.et(n, n2);
            } else {
                this.dkB();
            }
            this.cWm();
        } else if (this.dkN()) {
            this.eu(n, n2);
        }
    }

    protected final void dkv() {
        this.rp(false);
        this.dkC();
    }

    protected void dkw() {
    }

    public final boolean dkx() {
        return this.dkX();
    }

    public final boolean dky() {
        return this.dkY();
    }

    final boolean dkz() {
        return this.dkP();
    }

    final void et(int n, int n2) {
        this.rp(true);
        if (this.mqY == null) {
            this.dA(n, n2);
            this.dkJ();
        } else {
            this.RJ(n);
            this.ei(n, n2);
        }
        this.dkH();
        this.djm();
        this.ev(n, n2);
        this.cCy();
    }

    final void dkA() {
        this.did();
        this.dkI();
        this.dkv();
    }

    final void dkB() {
        this.djm();
        this.dkD();
    }

    void eu(int n, int n2) {
    }

    void ev(int n, int n2) {
    }

    void dkC() {
    }

    void dkD() {
    }

    void dkE() {
        if (this.dkX()) {
            return;
        }
        this.rz(true);
        if (this.mqQ != null) {
            this.mqQ.dly();
        }
    }

    void dkF() {
        if (this.dkY()) {
            return;
        }
        this.rA(true);
        if (this.mqQ != null) {
            this.mqQ.dlz();
        }
    }

    boolean isVirtual() {
        return false;
    }

    void RM(int n) {
        if (n == this.mqZ) {
            return;
        }
        this.mqZ = n;
        this.dld();
    }

    void RN(int n) {
        if (n == this.mra) {
            return;
        }
        this.mra = n;
        this.dld();
    }

    void rl(boolean bl) {
        if (bl == this.dla()) {
            return;
        }
        this.rC(bl);
        this.dlf();
    }

    void kL(float f) {
        if (f == this.mrb) {
            return;
        }
        this.mrb = f;
        this.dlg();
    }

    void rm(boolean bl) {
        if (bl == this.dlb()) {
            return;
        }
        this.rD(bl);
        this.dkw();
    }

    int dkG() {
        return this.dkN() ? 1 : 0;
    }

    void dkH() {
        if (this.mqQ != null) {
            this.mqQ.dlB();
        }
    }

    void dkI() {
        if (this.mqQ != null) {
            this.mqQ.dlC();
        }
    }

    void dkJ() {
        if (this.dkV()) {
            this.rx(false);
            this.djE().b("DisplayObject_setScale", new Object[]{this.getId(), Float.valueOf(this.mqW), Float.valueOf(this.mqX)});
        }
    }

    void ew(int n, int n2) {
        if (this.dkW()) {
            this.ry(false);
            this.er(n, n2);
        }
    }

    int a(StringBuilder stringBuilder, int n) {
        if (this.dkN()) {
            if (n > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.hf);
            ++n;
        }
        return n;
    }

    void dkK() {
        if (this.dkW()) {
            return;
        }
        this.ry(true);
        this.dkg();
    }

    void a(ipg ipg2) {
        if (this.mrd == null) {
            this.mrd = lcn.emv();
        }
        this.mrd.add(ipg2);
    }

    boolean ap(long l) {
        return (this.mrA & l) == l;
    }

    void a(long l, boolean bl) {
        this.mrA = bl ? (this.mrA |= l) : (this.mrA &= l ^ 0xFFFFFFFFFFFFFFFFL);
    }

    private boolean dkL() {
        return this.ap(1L);
    }

    private boolean dkM() {
        return this.ap(2L);
    }

    private boolean dkN() {
        return this.ap(4L);
    }

    private boolean dkO() {
        return this.ap(8L);
    }

    private boolean dkP() {
        return this.ap(16L);
    }

    private boolean dkQ() {
        return this.ap(32L);
    }

    private boolean dkR() {
        return this.ap(64L);
    }

    private boolean dkS() {
        return this.ap(128L);
    }

    private boolean dkT() {
        return this.ap(256L);
    }

    private boolean dkU() {
        return this.ap(512L);
    }

    private boolean dkV() {
        return this.ap(1024L);
    }

    private boolean dkW() {
        return this.ap(2048L);
    }

    private boolean dkX() {
        return this.ap(4096L);
    }

    private boolean dkY() {
        return this.ap(8192L);
    }

    private boolean dkZ() {
        return this.ap(16384L);
    }

    private boolean dla() {
        return this.ap(32768L);
    }

    private boolean dlb() {
        return this.ap(65536L);
    }

    private boolean dlc() {
        return this.ap(131072L);
    }

    private void rn(boolean bl) {
        this.a(1L, bl);
    }

    private void ro(boolean bl) {
        this.a(2L, bl);
    }

    private void rp(boolean bl) {
        this.a(4L, bl);
    }

    private void rq(boolean bl) {
        this.a(8L, bl);
    }

    private void rr(boolean bl) {
        this.a(16L, bl);
    }

    private void rs(boolean bl) {
        this.a(32L, bl);
    }

    private void rt(boolean bl) {
        this.a(64L, bl);
    }

    private void ru(boolean bl) {
        this.a(128L, bl);
    }

    private void rv(boolean bl) {
        this.a(256L, bl);
    }

    private void rw(boolean bl) {
        this.a(512L, bl);
    }

    private void rx(boolean bl) {
        this.a(1024L, bl);
    }

    private void ry(boolean bl) {
        this.a(2048L, bl);
    }

    private void rz(boolean bl) {
        this.a(4096L, bl);
    }

    private void rA(boolean bl) {
        this.a(8192L, bl);
    }

    private void rB(boolean bl) {
        this.a(16384L, bl);
    }

    private void rC(boolean bl) {
        this.a(32768L, bl);
    }

    private void rD(boolean bl) {
        this.a(65536L, bl);
    }

    private void rE(boolean bl) {
        this.a(131072L, bl);
    }

    private void dld() {
        if (this.dkQ()) {
            return;
        }
        this.rs(true);
        this.dkg();
    }

    private void dle() {
        if (this.dkR()) {
            return;
        }
        this.rt(true);
        this.dkg();
    }

    private void dlf() {
        if (this.dkS()) {
            return;
        }
        this.ru(true);
        this.dkg();
    }

    private void dlg() {
        if (this.dkT()) {
            return;
        }
        this.rv(true);
        this.dkg();
    }

    private void dlh() {
        if (this.dkO()) {
            this.rq(false);
            this.djy();
        }
    }

    private void dli() {
        if (this.dkU() && this.dhV()) {
            this.rw(false);
            this.dkp();
        }
    }

    private void a(int n, int n2, int n3, int n4, boolean bl) {
        boolean bl2;
        boolean bl3 = n != this.mqR || n2 != this.mqS;
        boolean bl4 = bl2 = n3 != this.mbc || n4 != this.mbd;
        if (!bl3 && !bl2) {
            return;
        }
        this.mqR = n;
        this.mqS = n2;
        this.mbc = n3;
        this.mbd = n4;
        if (bl) {
            if (bl3) {
                this.dld();
            }
            if (bl2) {
                this.dle();
            }
        }
        if (this.mqQ != null) {
            this.mqQ.pack();
            this.mqQ.a(this, this.mqR, this.mqS, this.mbc, this.mbd);
        }
        if (bl2) {
            this.pack();
        }
    }

    private void v(int n, int n2, int n3, int n4) {
        this.a(n, n2, n3, n4, true);
    }

    private void dlj() {
        if (this.dkV()) {
            return;
        }
        this.rx(true);
        this.dkg();
    }

    private void dlk() {
        hsu hsu2;
        String string;
        if (this.mrc == null) {
            return;
        }
        this.dlp();
        for (Map.Entry<String, lil<Object, hsu, Object>> entry : this.mrc.entrySet()) {
            string = entry.getKey();
            hsu2 = (hsu)((Object)entry.getValue().reY);
            Object t = entry.getValue().reZ;
            if (t instanceof Integer) {
                this.loj.a(string, hsu2, (Integer)t);
                continue;
            }
            if (t instanceof Float) {
                this.loj.a(string, hsu2, (Float)t);
                continue;
            }
            if (t instanceof Boolean) {
                this.loj.a(string, hsu2, (Boolean)t);
                continue;
            }
            this.loj.a(string, hsu2, (String)t);
        }
        this.loj.initialize();
        for (Map.Entry<String, lil<Object, hsu, Object>> entry : this.mrc.entrySet()) {
            string = entry.getKey();
            hsu2 = entry.getValue().reX;
            if (hsu2 == null) continue;
            if (hsu2 instanceof Integer) {
                this.loj.w(string, (Integer)((Object)hsu2));
                continue;
            }
            if (hsu2 instanceof Float) {
                this.loj.d(string, ((Float)((Object)hsu2)).floatValue());
                continue;
            }
            if (hsu2 instanceof Boolean) {
                this.loj.q(string, (Boolean)((Object)hsu2));
                continue;
            }
            this.loj.B(string, (String)((Object)hsu2));
        }
        this.mrc = null;
        this.cDZ();
    }

    private void dll() {
        if (this.loj != null) {
            this.loj.cleanUp();
            this.loj = null;
        }
    }

    private void dlm() {
        if (this.mqT != null) {
            hso.cxK().cxP().czy().b(this.mqT);
            this.mqT = null;
        }
    }

    private void dln() {
        if (this.mrg != null) {
            this.mrg.stop();
            this.mrg = null;
        }
    }

    private void dlo() {
        if (this.mqP != null && this.mqP.cEU()) {
            double d2 = this.mqP.getMessageDelegator().arc().rgz;
            if (d2 - this.mrf >= 0.2) {
                this.mrf = d2;
                this.djy();
                this.dln();
            }
        } else {
            this.dln();
        }
    }

    private void a(String string, hsu hsu2, Object object) {
        if (this.mrc == null) {
            this.mrc = lcn.emw();
        }
        this.mrc.put(string, new lil<Object, hsu, Object>(null, hsu2, object));
    }

    private Object qR(String string) {
        if (this.mrc == null) {
            return null;
        }
        lil<Object, hsu, Object> lil2 = this.mrc.get(string);
        return lil2 != null ? lil2.reX : null;
    }

    private void b(String string, Object object) {
        if (this.mrc == null) {
            return;
        }
        lil<Object, hsu, Object> lil2 = this.mrc.get(string);
        if (lil2 != null) {
            lil2.reX = object;
        }
    }

    private void dlp() {
        if (this.loj != null) {
            return;
        }
        this.loj = new hss(this, this.djE().cyg() + "." + (this._name != null ? this._name : this.dlq())){
            final /* synthetic */ ipf mrB;
            {
                this.mrB = ipf2;
                super(string);
            }

            public void cyi() {
                this.mrB.dkr();
            }

            public void cyj() {
                this.mrB.dks();
            }
        };
    }

    private String dlq() {
        return this._name != null && !this._name.isEmpty() ? this._name : this.getClass().getSimpleName() + this.hf;
    }

    static /* synthetic */ void T(ipf ipf2) {
        ipf2.dlm();
    }

    static /* synthetic */ void U(ipf ipf2) {
        ipf2.dlo();
    }
}

