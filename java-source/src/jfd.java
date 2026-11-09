/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class jfd {
    private jff mUN;
    private int lBn;
    private jfc mWU;
    private jfa mWV = new jfa();
    private boolean mWW = false;
    private boolean mWX = false;
    private boolean mWY = false;
    private jfc mWZ;
    private jfa mXa = new jfa();
    private boolean mXb = this.mWW;
    private boolean mXc = this.mWY;
    private boolean mXd = this.mWX;

    public jff dzE() {
        return this.mUN;
    }

    public int dAr() {
        return this.lBn;
    }

    public boolean dAs() {
        return this.lBn < lea.epx().aQI() / 2;
    }

    public int dAt() {
        return this.lBn % (lea.epx().aQI() / 2);
    }

    public jfc dAu() {
        return this.mWU;
    }

    public void b(jfc jfc2) {
        if (jfc2 != null && !this.c(jfc2.cCs())) {
            assert (false);
            return;
        }
        if (jfc.a(this.mWU, jfc2)) {
            return;
        }
        this.mUN.c(this, jfc2);
    }

    public boolean c(bsj bsj2) {
        int n = ((bsn)bsj2.awE()).getType();
        return jfd.Up(n) != -1 || jfd.Uq(n);
    }

    public boolean Uk(int n) {
        return bsi.c(n, this.mWU != null ? this.mWU.cCs() : null);
    }

    public boolean u(hwo hwo2) {
        return hwo2 != null ? this.Uk(hwo2.cBq().getType()) : true;
    }

    public hwo Ql(int n) {
        return this.mWV.Ql(n);
    }

    public hwo Ul(int n) {
        return this.mXa.Ql(n);
    }

    public void v(hwo hwo2) {
        jfa jfa2 = new jfa(hwo2, this.mWV);
        this.a(jfa2);
    }

    public void b(hwo hwo2, boolean bl) {
        int n = this.mWV.a(hwo2, bl);
        if (n < 0) {
            return;
        }
        this.dzE().dzV().dzB().mUY.V(this);
    }

    public jfa dAv() {
        return this.mWV;
    }

    public void a(jfa jfa2) {
        if (jfa2 == null) {
            jfa2 = new jfa();
        }
        if (jfa.a(this.mWV, jfa2)) {
            return;
        }
        for (int i = 0; i < 2; ++i) {
            if (this.u(jfa2.Ql(i))) continue;
            assert (false);
            return;
        }
        this.mWV = jfa2;
        this.dzE().dzV().dzB().mUY.V(this);
    }

    public boolean dAw() {
        return this.mWW;
    }

    public void td(boolean bl) {
        if (bl == this.mWW) {
            return;
        }
        this.mWW = bl;
        this.dzE().dzV().dzB().mUV.V(this);
    }

    public boolean dAx() {
        return this.mWX;
    }

    public void te(boolean bl) {
        if (bl == this.mWX) {
            return;
        }
        this.mWX = bl;
        this.dzE().dzV().dzB().mUW.V(this);
    }

    public boolean dAy() {
        return this.mWY;
    }

    public void tf(boolean bl) {
        if (bl == this.mWY) {
            return;
        }
        this.mWY = bl;
        this.dzE().dzV().dzB().mUX.V(this);
    }

    public static jfc d(bsj bsj2) {
        if (bsj2 == null) {
            return null;
        }
        int n = ((bsn)bsj2.awE()).getType();
        if (lea.epx().qV(n)) {
            return new jfg(bsj2);
        }
        if (cxd.xq((int)n)) {
            return new jfb(bsj2);
        }
        return new jez(bsj2);
    }

    public static jfc Um(int n) {
        return jfd.d(jfd.Un(n));
    }

    public static bsj Un(int n) {
        cxc cxc2 = hso.cxK().cxP().cyZ().ht(n);
        return cxc2;
    }

    public static bsh b(long l2, int n) {
        bsh bsh2 = null;
        if (l2 != -1L) {
            bsh2 = hso.cxK().cxP().cza().al(l2);
        }
        if (n != -1 && bsh2 == null) {
            bsh2 = hso.cxK().cxP().cza().K(n, null);
        }
        return bsh2;
    }

    public static boolean Uo(int n) {
        boolean bl;
        boolean bl2 = bl = lea.enZ().isDescendant(n, cxd.fIl) || lea.enZ().isDescendant(n, cxd.fLc);
        if (!bl) {
            les les2 = lea.eob();
            ldy ldy2 = (ldy)les2.acv(n);
            if (ldy2 == null) {
                return false;
            }
            if (ldy2.cCr() != ldy.a.SKILL) {
                return false;
            }
        }
        return true;
    }

    public void a(int n, long l2, int n2) {
        bsh bsh2 = jfd.b(l2, n2);
        if (bsh2 != null) {
            this.mWV.b(n, new hwo(bsh2));
            return;
        }
        lgw lgw2 = (lgw)lea.enW().acv(n2);
        if (lgw2 != null) {
            this.mWV.b(n, new hwo(lgw2, l2));
        }
    }

    public int dAz() {
        int n = this.dAu() != null && this.dAu().cCs() != null && this.dAu().cCs().awE() != null ? this.dAu().cCs().awE().getType() : -1;
        return jfd.Up(n);
    }

    public static int Up(int n) {
        return cxd.xq((int)n) || cxd.xr((int)n) || cxd.xs((int)n) ? n : -1;
    }

    public static boolean Uq(int n) {
        return cxd.xz((int)n) || cxd.xs((int)n);
    }

    public boolean dAA() {
        return this.mWU != null && jfd.Uq(this.mWU.cCs().awE().getType());
    }

    public boolean dzG() {
        return this.dAB() || this.dAC() || this.dAE() || this.dAD() || this.dAF();
    }

    public boolean dAB() {
        return !jfc.a(this.mWU, this.mWZ);
    }

    public boolean dAC() {
        return this.mWY != this.mXc;
    }

    public boolean dAD() {
        return this.mWX != this.mXd;
    }

    public boolean dAE() {
        return this.mWW != this.mXb;
    }

    public boolean dAF() {
        return !jfa.a(this.mWV, this.mXa);
    }

    public void dAc() {
        this.b(this.mWZ);
        this.tf(this.mXc);
        this.td(this.mXb);
        this.te(this.mXd);
        this.a(this.mXa);
    }

    public void dzF() {
        this.dAG();
        this.dAH();
        this.dAI();
        this.dAJ();
        this.dAK();
    }

    public jfc dAG() {
        if (!this.dAB()) {
            return this.mWZ;
        }
        jfc jfc2 = this.mWZ;
        this.mWZ = this.mWU != null ? this.mWU.dAp() : null;
        jen.dzL().mUU.c(this, this.mWU, null);
        return jfc2;
    }

    public void dAH() {
        if (!this.dAC()) {
            return;
        }
        this.mXc = this.mWY;
        jen.dzL().mUX.V(this);
    }

    public void dAI() {
        if (!this.dAE()) {
            return;
        }
        this.mXb = this.mWW;
        jen.dzL().mUV.V(this);
    }

    public void dAJ() {
        if (!this.dAD()) {
            return;
        }
        this.mXd = this.mWX;
        jen.dzL().mUW.V(this);
    }

    public void dAK() {
        if (!this.dAF()) {
            return;
        }
        this.mXa = this.mWV.dAq();
        jen.dzL().mUY.V(this);
    }

    public jfc dAL() {
        return this.mWZ;
    }

    public void i(jfd jfd2) {
        jfd2.mWZ = this.mWZ;
        this.mWZ = null;
        jen.dzL().mUU.c(this, this.mWU, null);
        jen.dzL().mUU.c(jfd2, jfd2.mWU, null);
    }

    public void c(jfc jfc2) {
        if (jfc.a(jfc2, this.mWZ)) {
            return;
        }
        this.mWZ = jfc2;
        jen.dzL().mUU.c(this, this.mWU, null);
    }

    public void cDZ() {
        this.mWZ = this.mWU != null ? this.mWU.dAp() : null;
        this.mXc = this.mWY;
        this.mXb = this.mWW;
        this.mXd = this.mWX;
        this.mXa = this.mWV.dAq();
    }

    jfd(jff jff2, int n) {
        this.mUN = jff2;
        this.lBn = n;
    }

    void d(jfc jfc2) {
        if (jfc.a(this.mWU, jfc2)) {
            return;
        }
        jfc jfc3 = this.mWU;
        this.mWU = jfc2;
        this.dzE().dzV().dzB().mUU.c(this, jfc2, jfc3);
    }

    void j(jfd jfd2) {
        jfc jfc2 = this.mWU;
        this.mWU = jfd2.mWU;
        jfd2.mWU = jfc2;
        jfa jfa2 = this.mWV;
        this.mWV = jfd2.mWV;
        jfd2.mWV = jfa2;
    }
}

