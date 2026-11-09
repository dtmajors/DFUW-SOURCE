/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bwa {
    private static final boolean dTO = true;
    private ljq dTP = null;
    private lgl dTQ = null;
    private ljq dTR = null;
    private lgl dTS = null;
    private double oV = 0.0;
    private double aTo = 0.0;
    private bvd Uk = null;
    private boolean dTT = false;
    private ljq dTU = new ljq();
    private lgl dTV = new lgl();
    private int bnh = -1;
    private dxr MessageDelegator = null;
    private boolean dwG = true;
    private boolean dTW = false;
    private bvx dTX = null;
    private lgj dTY = null;
    private boolean fE = true;
    private bwb dTZ = null;

    public void cleanUp() {
        if (this.dTZ != null) {
            this.dTZ.cleanUp();
            this.dTZ = null;
        }
        if (this.dTX != null) {
            this.MessageDelegator.hd(this.dTX.getGUID());
            this.dTX = null;
        }
    }

    public void a(String string, int n, String string2, int n2) {
        assert (this.dTZ != null);
        this.dTZ.l(string, n);
        this.dTZ.k(string2, n2);
    }

    public void a(int n, int n2, int n3, int n4) {
        assert (this.Uk != null);
        assert (this.MessageDelegator != null);
        if (this.dTZ == null) {
            this.dTZ = new bwb();
        }
        this.dTZ.no(n);
        this.dTZ.nr(n2);
        this.dTZ.np(n3);
        this.dTZ.nq(n4);
        this.dTZ.d(this.Uk);
        this.dTZ.setMessageDelegator(this.MessageDelegator);
    }

    public void initialize() {
        this.dTT = false;
        this.bnh = 0;
        if (this.dwG) {
            return;
        }
        assert (this.Uk != null);
        if (this.dTX != null) {
            this.MessageDelegator.hd(this.dTX.getGUID());
            this.dTX = null;
        }
        this.dTX = new bvx(this.Uk);
        this.dTX.setGUID(this.MessageDelegator.bzv());
        this.dTX.eH(true);
        this.dTX.ba(this.dTP);
        this.dTX.j(this.dTQ);
        this.dTX.o(this.oV);
        this.dTX.bb(this.dTR);
        this.dTX.k(this.dTS);
        this.dTX.be(this.oV + this.aTo);
        this.dTX.setInterpolationType(0);
        this.MessageDelegator.a(this.dTX);
        this.dTX.aAz();
        this.dTY = new lgj();
    }

    public void doTick(ldz ldz2) {
        assert (this.Uk != null);
        assert (this.dTP != null);
        assert (this.dTQ != null);
        assert (this.dTR != null);
        assert (this.dTS != null);
        assert (this.MessageDelegator != null);
        if (this.dTT) {
            return;
        }
        if (!this.Uk.isReadyToRun()) {
            return;
        }
        if (ldz2.rgz < this.oV) {
            return;
        }
        if (this.dwG) {
            this.N(ldz2);
        } else {
            this.O(ldz2);
        }
    }

    public void aAC() {
        if (this.dTT) {
            return;
        }
        if (this.bnh < 0) {
            return;
        }
        assert (this.Uk != null);
        assert (this.dTP != null);
        assert (this.dTQ != null);
        assert (this.dTR != null);
        assert (this.dTS != null);
        assert (this.MessageDelegator != null);
        lgj lgj2 = new lgj(this.bnh + 2, this.dTU, this.dTV, true);
        gyl gyl2 = (gyl)this.MessageDelegator.h(12041, this.Uk.getGUID(), lcr.qAI);
        gyl2.ija = 4;
        gyl2.dTY = lgj2;
        this.MessageDelegator.F(gyl2);
        if (this.dTX != null) {
            this.MessageDelegator.hd(this.dTX.getGUID());
            this.dTX = null;
        }
    }

    private void N(ldz ldz2) {
        int n = mfz.ex(ldz2.rgz);
        if (n == this.bnh) {
            return;
        }
        this.bnh = n;
        float f2 = (float)((ldz2.rgz - this.oV) / this.aTo);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            this.dTT = true;
            f2 = 1.0f;
        }
        ljq.a(this.dTP, this.dTR, f2, this.dTU);
        this.dTV.c(this.dTQ, this.dTS, f2);
        this.Uk.g(this.dTU, this.dTV);
        if (this.dTW || this.dTT) {
            gyl gyl2 = (gyl)this.MessageDelegator.h(12041, this.Uk.getGUID(), lcr.qAI);
            gyl2.ija = 1;
            gyl2.Position = this.dTU;
            gyl2.Rotation = this.dTV;
            this.MessageDelegator.F(gyl2);
        }
    }

    private void O(ldz ldz2) {
        if (this.fE && this.dTZ != null) {
            this.dTZ.i(new ljq(this.dTR), new lgl(this.dTS));
        }
        this.fE = false;
        float f2 = (float)((ldz2.rgz - this.oV) / this.aTo);
        f2 = lew.A(f2, 0.0f, 1.0f);
        ljq.a(this.dTP, this.dTR, f2, this.dTU);
        this.dTV.c(this.dTQ, this.dTS, f2);
        if (this.Uk != null) {
            this.Uk.aX(this.dTU);
            this.Uk.h(this.dTV);
        }
        if (ldz2.rgz > this.aTo + this.oV) {
            lfn.b(0, "SFMeshObjectAnimator", "doClientAnimation() Done Animating");
            this.dTT = true;
            if (this.dTZ != null) {
                this.dTZ.be(this.dTR);
            }
            this.MessageDelegator.hd(this.dTX.getGUID());
            this.dTX = null;
        }
    }

    private void aAD() {
        assert (!this.dwG);
        klz klz2 = (klz)this.MessageDelegator.h(3341);
        klz2.wD(false);
        klz2.jM(false);
        klz2.lQ(false);
    }

    public boolean aAE() {
        return this.dTT;
    }

    public void eK(boolean bl) {
        this.dTT = bl;
    }

    public int aAF() {
        return this.bnh;
    }

    public void nn(int n) {
        this.bnh = n;
    }

    public bvd aAG() {
        return this.Uk;
    }

    public void d(bvd bvd2) {
        this.Uk = bvd2;
    }

    public dxr getMessageDelegator() {
        return this.MessageDelegator;
    }

    public void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }

    public double aAH() {
        return this.aTo;
    }

    public void bf(double d2) {
        this.aTo = d2;
    }

    public ljq aAI() {
        return this.dTP;
    }

    public void bc(ljq ljq2) {
        this.dTP = ljq2;
    }

    public lgl aAJ() {
        return this.dTQ;
    }

    public void l(lgl lgl2) {
        this.dTQ = lgl2;
    }

    public ljq aAK() {
        return this.dTR;
    }

    public void bd(ljq ljq2) {
        this.dTR = ljq2;
    }

    public lgl aAL() {
        return this.dTS;
    }

    public void m(lgl lgl2) {
        this.dTS = lgl2;
    }

    public double aAw() {
        return this.oV;
    }

    public void o(double d2) {
        this.oV = d2;
    }

    public boolean isServerObject() {
        return this.dwG;
    }

    public void setServerObject(boolean bl) {
        this.dwG = bl;
    }

    public boolean aAM() {
        return this.dTW;
    }

    public void eL(boolean bl) {
        this.dTW = bl;
    }
}

