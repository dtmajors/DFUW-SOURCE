/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Set;

public class ipq
extends ipf
implements ipp {
    private static int loG;
    private static int loH;
    private static int msh;
    private static int msi;
    private iqe msj;
    private Set<String> msk = null;
    private lie msl = null;
    private static final long msm = 262144L;
    private static final long msn = 524288L;
    private static final long mso = 0x100000L;
    private static final long msp = 0x200000L;
    private static final long msq = 0x400000L;
    private static final long msr = 0x800000L;
    static final long mss = 24L;

    public ipq() {
        this.a(262144L, true);
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        if (this.msk != null) {
            this.dmp();
        }
    }

    @Override
    public void cleanUp() {
        if (this.djE().dhK() == this) {
            this.djE().a((ipq)null);
        }
        if (this.djE().dhL() == this) {
            this.djE().b((ipq)null);
        }
        this.dmd();
        super.cleanUp();
        this.rX(false);
        this.rY(false);
        this.rZ(false);
        this.dmq();
    }

    @Override
    public final boolean djR() {
        return this.dmi();
    }

    public void rF(boolean bl) {
        if (bl == this.dmi()) {
            return;
        }
        this.rU(bl);
        this.dkw();
        this.cPv();
    }

    @Override
    public final boolean dkb() {
        return this.dmj();
    }

    @Override
    public final void ri(boolean bl) {
        if (bl == this.dmj()) {
            return;
        }
        this.rV(bl);
        this.cND();
    }

    public final boolean dma() {
        return this.djE() != null && this.djE().dhK() == this;
    }

    public final void rS(boolean bl) {
        if (this.djE() != null) {
            if (bl) {
                this.djE().a(this);
            } else if (this.djE().dhK() == this) {
                this.djE().a((ipq)null);
            }
        }
    }

    public boolean dmb() {
        return this.djE() != null && this.djE().dhL() == this;
    }

    @Override
    public void L() {
        this.dmc();
    }

    @Override
    public boolean djZ() {
        return this.dmk();
    }

    @Override
    public void setActive(boolean bl) {
        if (bl == this.dmk()) {
            return;
        }
        this.rW(bl);
        this.cPw();
    }

    public final boolean Ow() {
        return this.dml();
    }

    public void ez(int n, int n2) {
        if (this.dml()) {
            this.eA(n, n2);
        }
        this.rX(true);
        this.djE();
        loG = ioa.cxP().bpb();
        this.djE();
        loH = ioa.cxP().bpc();
        msh = this.getX();
        msi = this.getY();
        this.rS(true);
        this.x(msh, msi, 0, 0);
    }

    public void eH(int n, int n2) {
        if (!this.dml()) {
            return;
        }
        this.djE();
        int n3 = ioa.cxP().bpb();
        this.djE();
        int n4 = ioa.cxP().bpc();
        int n5 = n3 - loG;
        int n6 = n4 - loH;
        loG = n3;
        loH = n4;
        this.n(msh += n5, msi += n6, n5, n6);
    }

    public void eA(int n, int n2) {
        this.rX(false);
        this.rS(false);
        this.o(msh, msi, 0, 0);
    }

    public void dmc() {
        if (this.dmn()) {
            return;
        }
        this.rZ(true);
        this.dkg();
    }

    public void d(int n, int n2, double d2) {
        this.dmd();
        this.msj = new iqe(this, this, n, n2, d2){
            final /* synthetic */ ipq mst;
            {
                this.mst = ipq2;
                super(ipq3, n, n2, d2);
            }

            public void cGR() {
                this.mst.dmd();
            }
        };
        this.msj.e(hso.cxK().cxP().cyJ().getMessageDelegator());
    }

    public void dmd() {
        if (this.msj != null) {
            this.msj.close();
            this.msj = null;
        }
    }

    public void z(String string, boolean bl) {
        if (bl) {
            if (this.msk == null || !this.msk.contains(string)) {
                if (this.msk == null) {
                    this.msk = lcn.emx();
                }
                this.msk.add(string);
                this.dmp();
            }
        } else if (this.msk != null && this.msk.remove(string) && this.msk.isEmpty()) {
            this.dmq();
        }
    }

    public boolean dme() {
        if (this.djL()) {
            ioc ioc2 = this.ep(hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc());
            return this.dF(ioc2.cf, ioc2.cg);
        }
        return false;
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        if (jnz3 == jnz.nFE) {
            this.ri(false);
        }
    }

    @Override
    public boolean dF(int n, int n2) {
        return ipq.t(n, n2, this.getWidth(), this.getHeight());
    }

    @Override
    public boolean u(int n, int n2, int n3, int n4) {
        return ipq.a(n, n2, n3, n4, this.getWidth(), this.getHeight());
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.dmm()) {
            this.rY(false);
            this.dmf();
        }
        this.dmo();
    }

    public void dmf() {
        this.djE().b("InteractiveObject_setMouseEnabled", new Object[]{this.getId(), this.dmi()});
    }

    @Override
    public void djm() {
        super.djm();
        this.rY(false);
        this.dmo();
    }

    public void cPv() {
    }

    public void dmg() {
    }

    public void cND() {
    }

    public boolean du(int n, int n2) {
        return false;
    }

    public boolean dN(int n, int n2) {
        return false;
    }

    public boolean dv(int n, int n2) {
        return false;
    }

    public boolean eB(int n, int n2) {
        return false;
    }

    public boolean eC(int n, int n2) {
        return false;
    }

    public boolean eD(int n, int n2) {
        return false;
    }

    public boolean dK(int n, int n2) {
        this.dmd();
        return false;
    }

    public boolean dM(int n, int n2) {
        return false;
    }

    public boolean dL(int n, int n2) {
        return false;
    }

    public boolean c(int n, int n2, float f) {
        return false;
    }

    public boolean dx(int n, int n2) {
        return false;
    }

    public ifg dy(int n, int n2) {
        return null;
    }

    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        return false;
    }

    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        return false;
    }

    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        return false;
    }

    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        return false;
    }

    public void d(ifg ifg2) {
    }

    public void a(ifg ifg2, hzk hzk2) {
    }

    public boolean e(ifg ifg2) {
        return false;
    }

    public boolean f(ifg ifg2) {
        return false;
    }

    public void g(ifg ifg2) {
    }

    public void b(hzk hzk2, ifg ifg2) {
    }

    public void c(hzk hzk2, ifg ifg2) {
    }

    public hyn dd(int n, int n2) {
        return null;
    }

    public void q(hyn hyn2) {
    }

    public hyn dz(int n, int n2) {
        return null;
    }

    public void dmh() {
    }

    public void cEj() {
    }

    public void cPw() {
    }

    public void x(int n, int n2, int n3, int n4) {
    }

    public void n(int n, int n2, int n3, int n4) {
    }

    public void o(int n, int n2, int n3, int n4) {
    }

    public boolean oN(String string) {
        return false;
    }

    public boolean qM(String string) {
        return false;
    }

    public boolean qD(String string) {
        return false;
    }

    public boolean qV(String string) {
        return false;
    }

    public boolean qU(String string) {
        return false;
    }

    @Override
    protected final void dkw() {
        if (this.dmm()) {
            return;
        }
        this.rY(true);
        this.dkg();
    }

    void rT(boolean bl) {
        boolean bl2 = this.dmi();
        this.rU(bl);
        this.cPv();
        this.rH(bl);
        this.rU(bl2);
    }

    void rH(boolean bl) {
    }

    private boolean dmi() {
        return this.ap(262144L);
    }

    private boolean dmj() {
        return this.ap(524288L);
    }

    private boolean dmk() {
        return this.ap(0x100000L);
    }

    private boolean dml() {
        return this.ap(0x200000L);
    }

    private boolean dmm() {
        return this.ap(0x400000L);
    }

    private boolean dmn() {
        return this.ap(0x800000L);
    }

    private void rU(boolean bl) {
        this.a(262144L, bl);
    }

    private void rV(boolean bl) {
        this.a(524288L, bl);
    }

    private void rW(boolean bl) {
        this.a(0x100000L, bl);
    }

    private void rX(boolean bl) {
        this.a(0x200000L, bl);
    }

    private void rY(boolean bl) {
        this.a(0x400000L, bl);
    }

    private void rZ(boolean bl) {
        this.a(0x800000L, bl);
    }

    private void dmo() {
        if (this.dmn()) {
            this.rZ(false);
            this.djE().cFc();
            this.djE().b("Focus_set", new Object[]{this.getId()});
        }
    }

    private void dmp() {
        if (this.msl == null && this.djE() != null) {
            this.msl = new lie(this, 0.3, true){
                final /* synthetic */ ipq mst;
                {
                    this.mst = ipq2;
                    super(d2, bl);
                }

                public void dh(double d2) {
                    for (String string : ipq.c(this.mst)) {
                        this.mst.qV(string);
                    }
                }
            };
            this.msl.e(this.djE().getMessageDelegator());
        }
    }

    private void dmq() {
        if (this.msl != null) {
            this.msl.stop();
            this.msl = null;
        }
    }

    static /* synthetic */ Set c(ipq ipq2) {
        return ipq2.msk;
    }
}

