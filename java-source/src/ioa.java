/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 *  hyn
 */
import java.util.List;
import java.util.Map;

public class ioa
extends hzk
implements bto,
hsn {
    private int mnX = 0;
    private boolean mnY = false;
    private Map<Integer, ipf> mnZ = lcn.emw();
    private iob moa;
    private ipq mob;
    private ipq moc;
    private int mod = 0;
    private int moe = 0;
    private int mof = 0;
    private int lEY = 0;
    private int mog = 0;
    private int moh = 0;
    private int moi = 0;
    private int moj = 0;
    private boolean mok;
    private boolean mol;
    private int mom;
    private double mon = 0.0;
    private boolean moo = false;
    private Map<String, Integer> mop = lcn.emw();
    private int moq = 0;
    inz mor;
    private boolean mos = false;
    private boolean lCh = false;
    private int loG;
    private int loH;
    private float mot = super.cEE();
    private float mou = super.cEF();
    private boolean mov = super.isVisible();
    private int mow = super.cEX();
    private boolean mox = super.a(hya.lmr);
    private boolean moy = super.a(hya.lms);
    private int moz;
    private int moA;
    private static iqz moB = new iqz(){

        public void e(ipf ipf2) {
        }

        public void i(ipf ipf2) {
            ipf2.djE().cuf();
        }
    };

    public ioa(String string, String string2) {
        super(string, string2);
        super.R(65536.0f, 65536.0f);
        super.setVisible(true);
        super.OQ(-1);
        super.a(hya.lmr, false);
        super.a(hya.lms, false);
        this.a(hya.lmt, true);
        this.OQ(jnz.nGi);
    }

    public void initialize() {
        super.initialize();
        hso.cxK().a(this);
        hso.cxK().lcK.b(new jlq<ioa>(this, this){
            final /* synthetic */ ioa moC;
            {
                this.moC = ioa2;
                super(ioa3);
            }

            public void b(ioa ioa2) {
                ioa2.cZv();
            }

            public /* synthetic */ void R(Object object) {
                this.b((ioa)object);
            }
        });
    }

    public void cleanUp() {
        super.cleanUp();
        this.dhZ();
        if (hso.cxK() != null) {
            hso.cxK().b(this);
        }
    }

    public float cEE() {
        return this.lCh ? super.cEE() : this.mot;
    }

    public float cEF() {
        return this.lCh ? super.cEF() : this.mou;
    }

    public void R(float f, float f2) {
        if (this.lCh) {
            super.R(f, f2);
        } else {
            this.mot = f;
            this.mou = f2;
        }
    }

    public boolean isVisible() {
        return this.lCh ? super.isVisible() : this.mov;
    }

    public void setVisible(boolean bl) {
        if (this.lCh) {
            super.setVisible(bl);
        } else {
            this.mov = bl;
        }
    }

    public int cEX() {
        return this.lCh ? super.cEX() : this.mow;
    }

    public void OQ(int n) {
        if (this.lCh) {
            super.OQ(n);
        } else {
            this.mow = n;
        }
    }

    public boolean a(hya hya2) {
        switch (hya2) {
            case lmr: {
                return this.lCh ? super.a(hya2) : false;
            }
            case lms: {
                return this.lCh ? super.a(hya2) : false;
            }
        }
        return super.a(hya2);
    }

    public void a(hya hya2, boolean bl) {
        switch (hya2) {
            case lmr: {
                if (this.lCh) {
                    super.a(hya2, bl);
                } else {
                    this.mox = bl;
                }
                return;
            }
            case lms: {
                if (this.lCh) {
                    super.a(hya2, bl);
                } else {
                    this.moy = bl;
                }
                return;
            }
        }
        super.a(hya2, bl);
    }

    public iob dhJ() {
        return this.moa;
    }

    public ipq dhK() {
        return this.mob;
    }

    public void a(ipq ipq2) {
        if (ipq2 != null && ipq2.djE() != this) {
            return;
        }
        if (ipq2 != null && ipq2.rd(false)) {
            return;
        }
        if (ipq2 != null && ipq2.re(false)) {
            return;
        }
        if (ipq2 == this.mob) {
            return;
        }
        this.mob = ipq2;
        if (ipq2 != null) {
            this.cEZ();
        } else {
            this.cFa();
        }
    }

    public ipq dhL() {
        return this.moc;
    }

    public void b(ipq ipq2) {
        if (ipq2 != null) {
            ipq2.L();
        } else {
            this.b("Focus_set", new Object[]{-1});
        }
    }

    public boolean dhM() {
        return this.cFe() && this.cEU();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dhM()) {
            this.dhX();
        }
    }

    public boolean d(int n, int n2, String string) {
        int n3 = (int)((float)n - this.cEE());
        int n4 = (int)((float)n2 - this.cEF());
        if (n3 < this.cXH() || (float)n3 > this.cFw() - (float)this.dhN()) {
            return false;
        }
        if (n4 < this.cXI() || (float)n4 > this.cFx() - (float)this.dhO()) {
            return false;
        }
        return this.moa != null ? this.moa.dF(n3 - this.moa.getX(), n4 - this.moa.getY()) : false;
    }

    public hyn s(int n, int n2, String string) {
        if (this.moa != null) {
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                return this.moa.dd(n3 - this.moa.getX(), n4 - this.moa.getY());
            }
            int n5 = n3;
            int n6 = n4;
            for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                n5 -= ipq2.getX();
                n6 -= ipq2.getY();
            }
            return this.mob.dd(n5, n6);
        }
        return null;
    }

    public void q(hyn hyn2) {
        if (this.moa != null) {
            this.moa.q(hyn2);
        }
    }

    public hyn f(int n, int n2, String string) {
        if (this.moa != null) {
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    return this.moa.dz(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                return this.mob.dz(n5, n6);
            }
        }
        return null;
    }

    public int cXH() {
        return this.mod;
    }

    public int cXI() {
        return this.moe;
    }

    public int dhN() {
        return this.mof;
    }

    public int dhO() {
        return this.lEY;
    }

    public void p(int n, int n2, int n3, int n4) {
        this.mod = n;
        this.moe = n2;
        this.mof = n3;
        this.lEY = n4;
    }

    public void QT(int n) {
        this.mod = n;
    }

    public void QU(int n) {
        this.moe = n;
    }

    public void Rz(int n) {
        this.mof = n;
    }

    public void RA(int n) {
        this.lEY = n;
    }

    public int dhP() {
        return this.mog;
    }

    public int dhQ() {
        return this.moh;
    }

    public int dhR() {
        return this.moi;
    }

    public int dhS() {
        return this.moj;
    }

    public void q(int n, int n2, int n3, int n4) {
        this.mog = n;
        this.moh = n2;
        this.moi = n3;
        this.moj = n4;
    }

    public static hvj cxP() {
        return hyn.cxP();
    }

    public int p(ipf ipf2) {
        assert (ipf2.djE() == null);
        int n = this.dib();
        this.mnZ.put(n, ipf2);
        return n;
    }

    public void q(ipf ipf2) {
        ipf ipf3 = this.mnZ.remove(ipf2.getId());
        assert (ipf3 == ipf2);
    }

    public boolean dhT() {
        return this.mnY;
    }

    public void RB(int n) {
        this.mom += n;
        assert (this.mom > 0);
    }

    public void RC(int n) {
        this.mom -= n;
        assert (this.mom >= 0);
        if (this.mom == 0) {
            this.cFP();
        }
    }

    public void pack() {
        if (this.moa != null) {
            this.moa.pack();
        }
        this.moo = true;
    }

    public static ifg a(int n, int n2, ioa ioa2) {
        return new inw(n, n2, ioa2);
    }

    public static boolean a(ifg ifg2, Class clazz) {
        return ifg2 instanceof inw && ((inw)ifg2).dhq().getClass().isAssignableFrom(clazz);
    }

    public static ioa o(ifg ifg2) {
        return ifg2 instanceof inw ? ((inw)ifg2).dhq() : null;
    }

    public int qL(String string) {
        if (string == null || string.isEmpty()) {
            return -1;
        }
        Integer n = this.mop.get(string);
        if (n != null) {
            return n;
        }
        int n2 = this.moq++;
        this.mop.put(string, n2);
        this.b("addResource", new Object[]{n2, string});
        return n2;
    }

    public boolean cFO() {
        return this.mom == 0;
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    @Override
    public void oo() {
    }

    @Override
    public boolean op() {
        return true;
    }

    public void cFb() {
        super.cFb();
        if (this.mor != null) {
            this.mor.cqF();
        }
    }

    public boolean cZt() {
        return false;
    }

    public void dhU() {
        if (this.moa != null) {
            this.moa.dhU();
        }
    }

    public boolean a(jmf jmf2) {
        if (jmf2.dLX()) {
            if (jmf2.dMt()) {
                return this.oN(jmf2.dMq());
            }
            return this.qM(jmf2.dMq());
        }
        return false;
    }

    public boolean dhV() {
        return !this.mos;
    }

    protected void cBa() {
        super.cBa();
        this.mos = true;
    }

    protected void cEf() {
        super.cEf();
        if (this.moa != null) {
            this.moa.dii();
        }
        this.dhZ();
    }

    protected final void cEg() {
        super.cEg();
        this.dia();
    }

    protected void cCu() {
        this.moa = new iob();
        this.moa.a(moB);
        this.moa.a(this);
    }

    protected void cGQ() {
    }

    protected void cGo() {
    }

    protected void cCy() {
    }

    protected void cMX() {
    }

    protected void cGq() {
    }

    protected void cYd() {
        this.cCw();
    }

    protected void cKg() {
    }

    protected void cKh() {
    }

    protected void cCw() {
        super.cCw();
        if (this.moa != null) {
            this.moa.setSize((int)this.cFw(), (int)this.cFx());
        }
    }

    protected void dhx() {
        this.T(this.moa.getWidth(), this.moa.getHeight());
    }

    protected void g(int n, int n2, String string) {
        if (this.moa != null) {
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.du(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                this.mob.du(n5, n6);
            }
        }
    }

    protected void e(int n, int n2, String string) {
        if (this.moa != null) {
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.dN(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                this.mob.dN(n5, n6);
            }
        }
    }

    protected void h(int n, int n2, String string) {
        if (this.moa != null) {
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.dv(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                this.mob.dv(n5, n6);
            }
        }
    }

    protected void i(int n, int n2, String string) {
        if (this.moa != null) {
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.eB(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                this.mob.eB(n5, n6);
            }
        }
    }

    protected void j(int n, int n2, String string) {
        if (this.moa != null) {
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.eC(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                this.mob.eC(n5, n6);
            }
        }
    }

    protected void k(int n, int n2, String string) {
        if (this.moa != null) {
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.eD(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                this.mob.eD(n5, n6);
            }
        }
    }

    protected void w(int n, int n2, int n3) {
        if (this.moa != null) {
            this.loG = n;
            this.loH = n2;
            int n4 = (int)((float)n - this.cEE());
            int n5 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.ri(true);
                    this.moa.dK(n4 - this.moa.getX(), n5 - this.moa.getY());
                }
            } else {
                int n6 = n4;
                int n7 = n5;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n6 -= ipq2.getX();
                    n7 -= ipq2.getY();
                }
                this.mob.ri(true);
                this.mob.dK(n6, n7);
            }
        }
    }

    protected void b(int n, int n2, int n3, String string) {
        if (this.moa != null) {
            this.loG = n;
            this.loH = n2;
            int n4 = (int)((float)n - this.cEE());
            int n5 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.dM(n4 - this.moa.getX(), n5 - this.moa.getY());
                }
            } else {
                int n6 = n4;
                int n7 = n5;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n6 -= ipq2.getX();
                    n7 -= ipq2.getY();
                }
                this.mob.dM(n6, n7);
            }
        }
    }

    protected void v(int n, int n2, int n3) {
        if (this.moa != null) {
            int n4 = (int)((float)this.loG - this.cEE());
            int n5 = (int)((float)this.loH - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.ri(false);
                    this.moa.dL(n4 - this.moa.getX(), n5 - this.moa.getY());
                }
            } else {
                int n6 = n4;
                int n7 = n5;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n6 -= ipq2.getX();
                    n7 -= ipq2.getY();
                }
                this.mob.ri(false);
                this.mob.dL(n6, n7);
            }
        }
    }

    protected void a(int n, int n2, int n3, int n4, String string) {
        if (this.moa != null) {
            int n5 = (int)((float)n - this.cEE());
            int n6 = (int)((float)n2 - this.cEF());
            float f = n3 / 120;
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.c(n5 - this.moa.getX(), n6 - this.moa.getY(), f);
                }
            } else {
                int n7 = n5;
                int n8 = n6;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n7 -= ipq2.getX();
                    n8 -= ipq2.getY();
                }
                this.mob.c(n7, n8, f);
            }
        }
    }

    protected void cEp() {
        this.mob = null;
    }

    protected boolean cFC() {
        return !this.moo;
    }

    @Override
    protected boolean og(String string) {
        boolean bl = false;
        if (this.moa != null) {
            int n = ioa.cxP().bpb();
            int n2 = ioa.cxP().bpc();
            this.moz = n;
            this.moA = n2;
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    bl = this.moa.dx(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                bl = this.mob.dx(n5, n6);
            }
        }
        return bl;
    }

    @Override
    protected ifg of(String string) {
        ifg ifg2 = null;
        if (this.moa != null) {
            int n = this.moz;
            int n2 = this.moA;
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    ifg2 = this.moa.dy(n3 - this.moa.getX(), n4 - this.moa.getY());
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                ifg2 = this.mob.dy(n5, n6);
            }
        }
        return ifg2;
    }

    @Override
    protected void f(hzk hzk2, ifg ifg2) {
        if (this.moa != null) {
            int n = ioa.cxP().bpb();
            int n2 = ioa.cxP().bpc();
            this.loG = n;
            this.loH = n2;
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.c(n3 - this.moa.getX(), n4 - this.moa.getY(), hzk2, ifg2);
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                this.mob.c(n5, n6, hzk2, ifg2);
            }
        }
    }

    @Override
    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        if (this.moa != null) {
            int n = ioa.cxP().bpb();
            int n2 = ioa.cxP().bpc();
            this.loG = n;
            this.loH = n2;
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    return this.a(this.moa, n3 - this.moa.getX(), n4 - this.moa.getY(), hzk2, ifg2);
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                return this.a(this.mob, n5, n6, hzk2, ifg2);
            }
        }
        return false;
    }

    @Override
    protected void g(hzk hzk2, ifg ifg2) {
        if (this.moa != null) {
            int n = this.loG;
            int n2 = this.loH;
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.d(n3 - this.moa.getX(), n4 - this.moa.getY(), hzk2, ifg2);
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                this.mob.d(n5, n6, hzk2, ifg2);
            }
        }
    }

    @Override
    protected boolean b(hzk hzk2, ifg ifg2, String string) {
        if (this.moa != null) {
            int n = ioa.cxP().bpb();
            int n2 = ioa.cxP().bpc();
            int n3 = (int)((float)n - this.cEE());
            int n4 = (int)((float)n2 - this.cEF());
            if (this.mob == null) {
                if (this.moa.djR()) {
                    return this.moa.b(n3 - this.moa.getX(), n4 - this.moa.getY(), hzk2, ifg2);
                }
            } else {
                int n5 = n3;
                int n6 = n4;
                for (ipq ipq2 = this.mob; ipq2 != null; ipq2 = ipq2.djJ()) {
                    n5 -= ipq2.getX();
                    n6 -= ipq2.getY();
                }
                return this.mob.b(n5, n6, hzk2, ifg2);
            }
        }
        return false;
    }

    @Override
    protected void d(ifg ifg2) {
        if (this.moa != null) {
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.d(ifg2);
                }
            } else {
                this.mob.d(ifg2);
            }
        }
    }

    @Override
    protected void a(ifg ifg2, hzk hzk2) {
        if (this.moa != null) {
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.a(ifg2, hzk2);
                }
            } else {
                this.mob.a(ifg2, hzk2);
            }
        }
    }

    @Override
    protected boolean e(ifg ifg2) {
        boolean bl = false;
        if (this.moa != null) {
            if (this.mob == null) {
                if (this.moa.djR()) {
                    bl = this.moa.e(ifg2);
                }
            } else {
                bl = this.mob.e(ifg2);
            }
        }
        return bl;
    }

    @Override
    protected boolean f(ifg ifg2) {
        boolean bl = false;
        if (this.moa != null) {
            if (this.mob == null) {
                if (this.moa.djR()) {
                    bl = this.moa.f(ifg2);
                }
            } else {
                bl = this.mob.f(ifg2);
            }
        }
        return bl;
    }

    @Override
    protected void g(ifg ifg2) {
        if (this.moa != null) {
            if (this.mob == null) {
                if (this.moa.djR()) {
                    this.moa.g(ifg2);
                }
            } else {
                this.mob.g(ifg2);
            }
        }
    }

    protected void b(hzk hzk2, ifg ifg2) {
        if (this.moa != null) {
            this.moa.b(hzk2, ifg2);
        }
    }

    protected void c(hzk hzk2, ifg ifg2) {
        if (this.moa != null) {
            this.moa.c(hzk2, ifg2);
        }
    }

    protected void cEc() {
        super.cEc();
        this.dia();
        this.a((ipq)null);
        this.b((ipq)null);
        this.dhY();
        this.cFd();
        if (this.moa != null) {
            this.moa.rk(this.isVisible());
            this.moa.qQ(this.cEU());
            this.moa.dkq();
        }
    }

    protected void cEd() {
        super.cEd();
        this.dia();
        this.a((ipq)null);
        this.b((ipq)null);
        this.dhY();
        this.cFd();
        if (this.moa != null) {
            this.moa.RK(this.cEX());
            this.moa.qQ(this.cEU());
        }
    }

    protected void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        this.dia();
        this.a((ipq)null);
        this.b((ipq)null);
        this.dhY();
        this.cFd();
        if (this.moa != null) {
            this.moa.b(jnz2, jnz3);
            this.moa.qQ(this.cEU());
        }
    }

    protected void a(ipq ipq2, ipq ipq3) {
    }

    protected void cEj() {
        this.a((ipq)null);
        this.b((ipq)null);
        hyn hyn2 = ioa.cxP().czk();
        inz inz2 = this.mor;
        while (inz2 != null) {
            if (inz2 == hyn2) {
                return;
            }
            inz2 = inz2.mor;
        }
        this.dhY();
    }

    protected void cYf() {
    }

    protected void cuf() {
    }

    protected void cFT() {
        super.cFT();
        this.b((ipq)null);
    }

    protected void cZv() {
        if (this.moa != null) {
            this.moa.cZv();
        }
    }

    protected boolean oN(String string) {
        if (this.dic()) {
            return false;
        }
        if (this.moa != null) {
            if (this.mob == null) {
                if (this.moa.djR()) {
                    if (this.moc != null && this.moc.S(this.moa) && this.moc.djR() && this.moc.oN(string)) {
                        return true;
                    }
                    return this.moa.qD(string);
                }
            } else if (this.mob.djR()) {
                if (this.moc != null && this.moc.S(this.mob) && this.moc.djR() && this.moc.oN(string)) {
                    return true;
                }
                return this.mob.qD(string);
            }
        }
        return false;
    }

    protected boolean qM(String string) {
        if (this.dic()) {
            return false;
        }
        if (this.moa != null) {
            if (this.mob == null) {
                if (this.moa.djR()) {
                    if (this.moc != null && this.moc.S(this.moa) && this.moc.djR() && this.moc.qM(string)) {
                        return true;
                    }
                    return this.moa.qU(string);
                }
            } else if (this.mob.djR()) {
                if (this.moc != null && this.moc.S(this.mob) && this.moc.djR() && this.moc.qM(string)) {
                    return true;
                }
                return this.mob.qU(string);
            }
        }
        return false;
    }

    private void dhW() {
        this.moa.cleanUp();
        this.moa = null;
        this.mnX = 0;
        this.mnZ.clear();
        this.mob = null;
        this.moc = null;
        this.mom = 0;
        this.moo = false;
    }

    private boolean a(ipq ipq2, int n, int n2, hzk hzk2, ifg ifg2) {
        boolean bl = false;
        boolean bl2 = ipq2.dF(n, n2);
        if (ipq2.dkb() && bl2) {
            bl = ipq2.a(n, n2, hzk2, ifg2);
        } else if (ipq2.dkb()) {
            ipq2.ri(false);
            ipq2.d(n, n2, hzk2, ifg2);
        } else if (bl2) {
            ipq2.ri(true);
            bl = ipq2.c(n, n2, hzk2, ifg2);
        }
        return bl;
    }

    @llk
    private void _inputComponentGotFocus(int n) {
        ipf ipf2;
        if (n >= 0 && (ipf2 = this.mnZ.get(n)) != null && ipf2 instanceof ipq && ipf2 != this.moc) {
            ipq ipq2 = this.moc;
            if (this.moc != null) {
                this.moc.cEj();
            }
            this.moc = (ipq)ipf2;
            this.cFc();
            this.moc.dmh();
            this.a(ipq2, this.moc);
        }
    }

    @llk
    private void _inputComponentLostFocus(int n) {
        ipq ipq2;
        if (this.moc != null && n >= 0 && (ipq2 = (ipq)this.mnZ.get(n)) != null && ipq2 == this.moc) {
            this.moc = null;
            ipq2.cEj();
            this.a((ipq)null, (ipq)null);
        }
    }

    private void dhX() {
        if (this.moa != null && this.mom == 0) {
            if (this.mok) {
                this.mok = false;
                this.mol = true;
                this.cYd();
            }
            int n = this.moa.getWidth();
            int n2 = this.moa.getHeight();
            this.moa.dif();
            if (this.moo) {
                this.cYf();
            }
            if (this.moa.getWidth() != n || this.moa.getHeight() != n2) {
                this.dhx();
            }
            boolean bl = false;
            if (this.moo) {
                this.moo = false;
                this.cKg();
                bl = this.moo;
            }
            this.moa.dig();
            this.moa.dih();
            if (bl) {
                this.pack();
            }
        }
    }

    @llk
    private void _bitmapMeasured(int n, String string, int n2, int n3) {
        ipc ipc2 = (ipc)this.mnZ.get(n);
        if (ipc2 != null) {
            ipc.c(this.loi, string, n2, n3);
            ipc2.o(string, n2, n3);
            ipc2.dkf();
        }
    }

    @llk
    private void _textMeasured(int n, int n2, int n3) {
        ist ist2 = (ist)this.mnZ.get(n);
        if (ist2 != null) {
            ist2.eq(n2, n3);
            ist2.dkf();
        }
    }

    @llk
    private void _htmlTextMeasured(int n, int n2, int n3) {
        isi isi2 = (isi)this.mnZ.get(n);
        if (isi2 != null) {
            isi2.eq(n2, n3);
            isi2.dkf();
        }
    }

    @llk
    private void _textInputMeasured(int n, int n2, int n3) {
        isy isy2 = (isy)this.mnZ.get(n);
        if (isy2 != null) {
            isy2.eq(n2, n3);
            isy2.dkf();
        }
    }

    @llk
    private void _textFieldRetrievedText(int n, String string) {
        isw isw2 = (isw)this.mnZ.get(n);
        if (isw2 != null) {
            isw2.pI(string);
        }
    }

    @llk
    private void _ITextInputTextChanged(int n, String string) {
        isj isj2 = (isj)((Object)this.mnZ.get(n));
        if (isj2 != null) {
            isj2.od(string);
        }
    }

    @llk
    private void _ITextInputValidityChanged(int n, String string, boolean bl) {
        isj isj2 = (isj)((Object)this.mnZ.get(n));
        if (isj2 != null) {
            isj2.v(string, bl);
        }
    }

    @llk
    private void _ITextInputKeyboardEventHandler(int n, int n2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        isj isj2 = (isj)((Object)this.mnZ.get(n));
        if (isj2 != null) {
            isj2.c(n2, bl, bl2, bl3, bl4);
        }
    }

    @llk
    private void _ITextInputTextPasted(int n, String string, int n2) {
        isj isj2 = (isj)((Object)this.mnZ.get(n));
        if (isj2 != null) {
            isj2.C(string, n2);
        }
    }

    @llk
    private void _ITextInputUpdateText(int n, String string) {
        isj isj2 = (isj)((Object)this.mnZ.get(n));
        if (isj2 != null) {
            isj2.rk(string);
        }
    }

    @llk
    private void _multilineTextFieldTextStripped(int n, String string) {
        isp isp2 = (isp)this.mnZ.get(n);
        if (isp2 != null) {
            isp2.rn(string);
        }
    }

    @llk
    private void _multilineTextFieldRetrievedVerticalScrollInfo(int n, int n2, int n3, int n4, int n5) {
        isp isp2 = (isp)this.mnZ.get(n);
        if (isp2 != null) {
            isp2.z(n2, n3, n4, n5);
        }
    }

    @llk
    private void _multilineTextVerticalScrollInfoChanged(int n, int n2, int n3, int n4, int n5) {
        isp isp2 = (isp)this.mnZ.get(n);
        if (isp2 != null) {
            isp2.A(n2, n3, n4, n5);
        }
    }

    @llk
    private void _multilineTextMeasured(int n, int n2, int n3) {
        iso iso2 = (iso)this.mnZ.get(n);
        if (iso2 != null) {
            iso2.eq(n2, n3);
            iso2.dkf();
        }
    }

    @llk
    private void _multilineHtmlTextMeasured(int n, int n2, int n3) {
        isn isn2 = (isn)this.mnZ.get(n);
        if (isn2 != null) {
            isn2.eq(n2, n3);
            isn2.dkf();
        }
    }

    @llk
    private void _multilineTextInputMeasured(int n, int n2, int n3) {
        isq isq2 = (isq)this.mnZ.get(n);
        if (isq2 != null) {
            isq2.eq(n2, n3);
            isq2.dkf();
        }
    }

    private void dhY() {
        if (this.mor != null) {
            this.mor.close();
        }
    }

    @llk
    private void _htmlTextLinkLeftButtonClick(int n, String string) {
        isw isw2 = (isw)this.mnZ.get(n);
        if (isw2 != null) {
            isw2.rs(string);
        }
    }

    @llk
    private void _htmlTextLinkRightButtonClick(int n, String string) {
        isw isw2 = (isw)this.mnZ.get(n);
        if (isw2 != null) {
            isw2.rt(string);
        }
    }

    @llk
    private void _htmlTextLinkMouseEnter(int n, String string) {
        isw isw2 = (isw)this.mnZ.get(n);
        if (isw2 != null) {
            isw2.ru(string);
        }
    }

    @llk
    private void _htmlTextLinkMouseLeave(int n, String string) {
        isw isw2 = (isw)this.mnZ.get(n);
        if (isw2 != null) {
            isw2.rv(string);
        }
    }

    private void dhZ() {
        this.mop.clear();
        if (this.mor != null) {
            this.mor.close();
        }
    }

    private void dia() {
        if (!this.mos) {
            return;
        }
        if (!this.cFe() || !this.cEU()) {
            return;
        }
        this.b("setWindowIdentifier", new Object[]{this.cyg()});
        if (this.moa == null) {
            this.mok = true;
            this.cCu();
            this.moa.b(null, hso.cxK().cxN());
            this.moa.rk(this.isVisible());
            this.moa.RK(this.cEX());
            this.moa.qQ(this.cEU());
            if (this.b("Valid", mhs.BOOLEAN)) {
                if (this.nk("Valid").booleanValue()) {
                    this.cGQ();
                } else {
                    this.q("Valid", true);
                    this.cGo();
                }
            } else {
                this.cGo();
            }
            this.cCy();
        } else {
            this.moa.dkl();
            this.moa.dkg();
            this.moa.pack();
            this.pack();
            this.cMX();
        }
        this.cGq();
        this.cZv();
        this.mos = false;
        ioa.cyJ().updateLayout();
    }

    @llk
    private void _rectChanged(int n, int n2, int n3, int n4, int n5) {
        ipf ipf2 = this.mnZ.get(n);
        if (ipf2 != null) {
            ipf2.m(n2, n3, n4, n5);
        }
    }

    @llk
    private void _DisplayObject_attached(int n, int n2, int n3, int n4, int n5, int n6) {
        ipf ipf2 = this.mnZ.get(n);
        if (ipf2 != null) {
            ipf2.m(n2, n3, n4, n5);
            ipf2.RL(n6);
            ipf2.dkf();
        }
    }

    private int dib() {
        int n = this.mnX++;
        if (this.mnX < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            this.mnY = true;
            this.mnX = 0;
            this.a((ipf)this.moa, stringBuilder);
            this.mnY = false;
            String string = stringBuilder.toString();
            if (!string.isEmpty()) {
                this.b("remapObjectIds", new Object[]{string});
            }
        }
        return n;
    }

    private void a(ipf ipf2, StringBuilder stringBuilder) {
        if (ipf2.djE() == null) {
            return;
        }
        if (ipf2.djF() && ipf2.dhV()) {
            stringBuilder.append(ipf2.getId());
            stringBuilder.append(',');
            stringBuilder.append(this.mnX);
        }
        ipf2.RF(this.mnX);
        this.mnZ.put(this.mnX, ipf2);
        ++this.mnX;
        if (ipf2 instanceof iph) {
            List<ipf> list = ((iph)ipf2).getChildren();
            for (ipf ipf3 : list) {
                this.a(ipf3, stringBuilder);
            }
        }
    }

    @llk
    private void _movieCreated() {
        this.lCh = true;
        super.R(this.mot, this.mou);
        super.setVisible(this.mov);
        super.OQ(this.mow);
        super.a(hya.lmr, this.mox);
        super.a(hya.lms, this.moy);
        if (this.mov) {
            hso.cxK().cxP().czy().a(new hvm(this, 0.0f, 1.0f, 0.2f){
                final /* synthetic */ ioa moC;
                {
                    this.moC = ioa2;
                    super(f, f2, d2);
                }

                public void hz(float f) {
                    this.moC.dhJ().hz(f);
                }
            });
        }
        this.cKh();
    }

    private boolean dic() {
        return ioa.cxP().czB() != null && ioa.cxP().czB() != this;
    }
}

