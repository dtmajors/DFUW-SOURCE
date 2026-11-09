/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcr
 */
public class dqo {
    private ljq dTP = null;
    private lgl dTQ = null;
    private ljq dTR = null;
    private lgl dTS = null;
    private double oV = 0.0;
    private double aTo = 0.0;
    private dqk gPc = null;
    private boolean dTT = false;
    private ljq dTU = new ljq();
    private lgl dTV = new lgl();
    private int bnh = -1;
    private dxr MessageDelegator = null;
    private boolean dwG = true;
    private boolean dTW = false;
    private boolean fE = true;
    private dqp gPd = null;

    public void cleanUp() {
        if (this.gPd != null) {
            this.gPd.cleanUp();
        }
    }

    public void a(String string, int n, int n2, int n3) {
        assert (this.gPc != null);
        assert (this.MessageDelegator != null);
        this.gPd = new dqp();
        this.gPd.no(n2);
        this.gPd.np(n3);
        this.gPd.b(this.gPc);
        this.gPd.setMessageDelegator(this.MessageDelegator);
        this.gPd.p(string, n);
    }

    public void doTick(ldz ldz2) {
        assert (this.gPc != null);
        assert (this.dTP != null);
        assert (this.dTQ != null);
        assert (this.dTR != null);
        assert (this.dTS != null);
        assert (this.MessageDelegator != null);
        if (this.dTT) {
            return;
        }
        if (!this.gPc.isReadyToRun()) {
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
        assert (this.gPc != null);
        assert (this.dTP != null);
        assert (this.dTQ != null);
        assert (this.dTR != null);
        assert (this.dTS != null);
        assert (this.MessageDelegator != null);
        lgj lgj2 = new lgj(this.bnh + 2, this.dTU, this.dTV, true);
        gyl gyl2 = (gyl)this.MessageDelegator.h(12041, this.gPc.getGUID(), lcr.qAI);
        gyl2.ija = 4;
        gyl2.dTY = lgj2;
        this.MessageDelegator.F(gyl2);
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
        this.gPc.s(this.dTU, this.dTV);
    }

    private void O(ldz ldz2) {
        if (this.fE && this.gPd != null) {
            this.gPd.cj(new ljq(this.dTR));
        }
        this.fE = false;
        float f2 = (float)((ldz2.rgz - this.oV) / this.aTo);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            this.dTT = true;
            f2 = 1.0f;
            if (this.gPd != null) {
                this.gPd.be(this.dTR);
            }
        }
        ljq.a(this.dTP, this.dTR, f2, this.dTU);
        this.dTV.c(this.dTQ, this.dTS, f2);
        ftv ftv2 = (ftv)this.MessageDelegator.h(1025, this.gPc.getGUID(), this.gPc.getGUID());
        ftv2.HT(8);
        ftv2.c(this.dTU);
        ftv2.a(this.dTV);
        this.gPc.receiveMessage((dxq)ftv2);
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

    public dqk bun() {
        return this.gPc;
    }

    public void a(dqk dqk2) {
        this.gPc = dqk2;
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

