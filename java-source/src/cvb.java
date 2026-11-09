/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 *  lcw
 */
public class cvb
extends btk
implements bto {
    private final cvf fed;
    private final cvd fyU;
    private static final double fyp = 15.0;
    private static final ljq akL = new ljq(0.0, -1.0, 0.0);
    private static final float akO = 2000.0f;
    private ldv fyV;
    private int fyW = -1;
    private double fyX = 0.0;
    private double fyx = 0.0;
    private kji fys = null;
    private fem fyY = null;
    private static final boolean fyZ = false;

    public cvb(cvf cvf2, cvd cvd2) {
        this.fed = cvf2;
        this.fyU = cvd2;
        this.fyX = -this.fyU.bcq();
    }

    @Override
    public void doTick(ldz ldz2) {
        this.bcn();
    }

    public boolean bck() {
        if (!this.bcl()) {
            this.lO(this.fyV);
            this.fyV = null;
            return false;
        }
        if (this.fyV == null) {
            return false;
        }
        this.lO(this.fyV);
        this.fyV = null;
        return true;
    }

    private boolean bcl() {
        if (this.fyV != null) {
            return true;
        }
        return this.fyY != null;
    }

    private boolean bcm() {
        return this.fys != null;
    }

    private void bcn() {
        if (this.bcl()) {
            if (this.fyX + (double)this.fyU.bcp() < this.MessageDelegator.arc().rgz && this.fyV != null) {
                this.lO(this.fyV);
                this.fyV = null;
            }
        } else if (!this.bcm() && this.fyX + (double)this.fyU.bcq() < this.MessageDelegator.arc().rgz && this.fyx + 15.0 < this.MessageDelegator.arc().rgz) {
            this.fyx = this.MessageDelegator.arc().rgz + Math.random();
            this.aCY();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25346: {
                this.c((fen)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void c(fen fen2) {
        assert (this.fyY != null);
        assert (this.fyV == null);
        assert (fen2.bOL() != null);
        this.fyV = fen2.bOL();
        this.fyX = this.MessageDelegator.arc().rgz;
        this.fyY = null;
        this.fed.a(this.fyV, this);
    }

    private void lO(ldv ldv2) {
        assert (ldv2 != null);
        ldv ldv3 = null;
        ldv3 = lcw.enb() ? lcr.qBI : lcr.ak((ldv)lcr.qBI, (int)this.fyW);
        feq feq2 = (feq)this.MessageDelegator.h(25347, this.getGUID(), ldv3);
        feq2.kN(false);
        feq2.pC(ldv2);
        this.MessageDelegator.F(feq2);
        this.fed.b(ldv2, this);
    }

    private ljq bch() {
        float f2 = lcw.fyn.x;
        float f3 = lcw.fyn.rlV;
        float f4 = lew.o(-f2, f2, (float)Math.random());
        float f5 = lew.o(-f3, f3, (float)Math.random());
        return new ljq(f4, 1000.0f, f5);
    }

    private void aCY() {
        ljq ljq2 = this.bch();
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(1);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(akL);
        kji2.setLength(2000.0f);
        this.MessageDelegator.a(kji2);
        this.fys = kji2;
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        assert (this.fys != null);
        this.fys = null;
        if (kuj2.bqd == null) {
            return;
        }
        if (kuj2.bqd.length <= 0) {
            return;
        }
        if (kuj2.bqd.length != 1) {
            // empty if block
        }
        if (kuj2.bqd[0] != cug.fkp && kuj2.bqd[0] != cug.fly && kuj2.bqd[0] != cug.fkr) {
            return;
        }
        assert (kuj2.ilP[0] != null);
        if (!this.fyU.bcr().bD(kuj2.ilP[0])) {
            return;
        }
        this.bC(kuj2.ilP[0]);
    }

    private void bC(ljq ljq2) {
        assert (this.fyY == null);
        ldv ldv2 = null;
        if (lcw.enb()) {
            ldv2 = lcr.qBI;
        } else {
            this.fyW = this.fed.bbl();
            ldv2 = lcr.ak((ldv)lcr.qBI, (int)this.fyW);
        }
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), ldv2);
        fem2.sk(0);
        fem2.l(this.fyU.az());
        fem2.c(ljq2);
        float f2 = (float)(Math.PI * Math.random());
        fem2.a(new lgl(new ljq(0.0f, f2, 0.0f)));
        fem2.jS(true);
        fem2.oF(null);
        this.MessageDelegator.F(fem2);
        this.fyY = fem2;
    }
}

