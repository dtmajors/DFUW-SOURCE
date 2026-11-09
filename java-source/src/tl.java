/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  ha
 *  lcr
 */
public class tl
extends btk
implements btn,
bto,
cbq {
    private static final double aTo = 5.0;
    private static final float aTp = 10.0f;
    private static final int aTq = 1;
    private static final int aTr = 2;
    private static final double aTs = 7200.0;
    private static final double aTt = 60.0;
    private static final double aTu = 1.0;
    private static final float aTv = 10.0f;
    private static final ljq akL = new ljq(0.0, -1.0, 0.0);
    private static final float akM = 0.5f;
    private static final float aTw = 1.0f;
    private static final float akO = 0.75f;
    private final ha hF;
    private cnz aTx = null;
    private cnz aTy = null;
    private a aTz = a.aTC;
    private ljq aTA = null;

    public tl(ha ha2) {
        this.hF = ha2;
    }

    public void dk(int n) {
        ljq ljq2;
        cnz cnz2;
        if (!this.hF.iY()) {
            return;
        }
        if (this.hF.jf() == null) {
            return;
        }
        if (this.hF.jf().aAG() == null) {
            return;
        }
        if (this.hF.jf().aAG().azb() == null) {
            return;
        }
        if (this.hF.jf().aLU() == null) {
            return;
        }
        if (this.hF.jf().aLU().aEP() == null) {
            return;
        }
        if (this.hF.jf().aLU().aEP().vO() != 6) {
            return;
        }
        if (this.hF.jf().aLU().aEP().vN() != 1) {
            return;
        }
        if (this.hF.jf().aLU().aEP().vP() != 1) {
            return;
        }
        if (this.hF.jf().aLU().aEP().vK() != 3) {
            return;
        }
        if (!lea.enW().isDescendant(n, cug.frQ)) {
            assert (false);
            return;
        }
        if (this.aTx != null && this.aTy != null) {
            this.hF.c(mcx.uCE.bD(n));
            return;
        }
        switch (this.aTz) {
            case aTD: {
                this.hF.c(mcx.uCE.bD(n));
                return;
            }
            case aTE: {
                this.hF.c(mcx.uCE.bD(n));
                return;
            }
        }
        cnz cnz3 = cnz2 = this.aTx != null ? this.aTx : this.aTy;
        if (cnz2 != null) {
            ljq2 = cnz2.aAG().av();
            ljq2.et(this.hF.jf().aAG().av());
            float f2 = ljq2.eqN();
            if (f2 < 10.0f) {
                this.hF.c(mcx.uCH.bD(n, n));
                return;
            }
        }
        ljq2 = this.hF.jf().aAG().av();
        ljq2.y += 0.5f;
        this.ae(ljq2);
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.bqd == null) {
            this.aTz = a.aTC;
            this.hF.c(mcx.uCI.bD(cug.frN));
            return;
        }
        if (kuj2.bqd.length <= 0) {
            this.aTz = a.aTC;
            this.hF.c(mcx.uCI.bD(cug.frN));
            return;
        }
        int n = -1;
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < kuj2.bqd.length; ++i) {
            if (kuj2.bqd[i] != cug.fkp && kuj2.bqd[i] != cug.fly && kuj2.bqd[i] != cug.fkr || !(kuj2.pJh[i] < f2)) continue;
            f2 = kuj2.pJh[i];
            n = i;
        }
        if (n < 0) {
            this.aTz = a.aTC;
            this.hF.c(mcx.uCI.bD(cug.frN));
            return;
        }
        this.aTA = kuj2.ilP[n];
        fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), this.hF.getGUID());
        fne2.hsP = true;
        fne2.ResourceType = cug.frK;
        fne2.asi = 1;
        fne2.b(bqy.dHw);
        this.hF.receiveMessage((dxq)fne2);
    }

    private void a(fnf fnf2) {
        this.aTz = a.aTC;
        if (!fnf2.iQM) {
            this.hF.c(mcx.uCJ.bD(cug.frK));
            return;
        }
        assert (this.aTA != null);
        int n = this.aTx != null || this.aTy != null ? cug.frN : cug.frO;
        this.a(this.aTA, n);
    }

    private void a(ljq ljq2, int n) {
        this.aTz = a.aTD;
        this.g(n, ljq2);
    }

    private void a(gue gue2) {
        assert (this.aTz == a.aTD);
        this.aTz = a.aTC;
        assert (gue2.jrW != null);
        assert (gue2.jrV != null);
        if (this.aTx == null) {
            this.aTx = gue2.jrW;
            this.aTx.bz(this.MessageDelegator.arc().rgz);
            this.aTx.oM(del.gji);
            this.aTx.fi().a(12384, this.aTx.aUP() + 7200.0);
            this.aTx.fi().b(10432, this.hF.iU());
            this.a(this.aTx);
            if (this.aTx.az() == cug.frN) {
                if (this.aTy == null) {
                    this.b(this.aTx);
                    this.a(this.aTx.aAG().av(), cug.frO);
                    this.aTx = null;
                } else if (this.aTy.az() == cug.frO) {
                    this.b(this.aTy);
                    this.a(this.aTy.aAG().av(), cug.frN);
                    this.aTy = null;
                }
            }
            return;
        }
        if (this.aTy == null) {
            this.aTy = gue2.jrW;
            this.aTy.bz(this.MessageDelegator.arc().rgz);
            this.aTy.oM(del.gji);
            this.aTy.fi().a(12384, this.aTy.aUP() + 7200.0);
            this.aTy.fi().b(10432, this.hF.iU());
            this.a(this.aTy);
            if (this.aTy.az() == cug.frN) {
                if (this.aTx == null) {
                    this.b(this.aTy);
                    this.a(this.aTy.aAG().av(), cug.frO);
                    this.aTy = null;
                } else if (this.aTx.az() == cug.frO) {
                    this.b(this.aTx);
                    this.a(this.aTx.aAG().av(), cug.frN);
                    this.aTx = null;
                }
            }
            return;
        }
        assert (false);
    }

    private void u(ldz ldz2) {
        switch (this.aTz) {
            case aTD: 
            case aTE: {
                return;
            }
        }
        if (this.aTx != null) {
            if (this.aTx.aUP() + 7200.0 > ldz2.rgz) {
                return;
            }
            this.b(this.aTx);
            this.aTx = null;
            if (this.aTy != null && this.aTy.az() == cug.frN) {
                this.b(this.aTy);
                this.a(this.aTy.aAG().av(), cug.frO);
                this.aTy = null;
            }
            this.hF.c(mcx.uCB.bD(cug.frN));
            return;
        }
        if (this.aTy != null) {
            if (this.aTy.aUP() + 7200.0 > ldz2.rgz) {
                return;
            }
            this.b(this.aTy);
            this.aTy = null;
            if (this.aTx != null && this.aTx.az() == cug.frN) {
                this.b(this.aTx);
                this.a(this.aTx.aAG().av(), cug.frO);
                this.aTx = null;
            }
            this.hF.c(mcx.uCB.bD(cug.frN));
            return;
        }
    }

    private void g(int n, ljq ljq2) {
        ljq ljq3 = new ljq(ljq2);
        ljq3.et(new ljq(0.0f, 10.0f, 0.0f));
        float f2 = (float)(Math.PI * Math.random());
        lgl lgl2 = new lgl(new ljq(0.0f, f2, 0.0f));
        f2 = (float)(Math.PI * Math.random());
        lgl lgl3 = new lgl(new ljq(0.0f, f2, 0.0f));
        gud gud2 = (gud)this.MessageDelegator.h(24577, this.getGUID(), lcr.qBF);
        gud2.l(n);
        gud2.c(ljq2);
        gud2.a(lgl3);
        gud2.ilS = ljq3;
        gud2.ilT = lgl2;
        gud2.aTo = 5.0;
        gud2.ilR = true;
        gud2.jS(true);
        gud2.oF(null);
        this.MessageDelegator.F(gud2);
    }

    private void a(cnz cnz2) {
        cnz2.a(this);
        cnz2.a(this);
    }

    private void b(cnz cnz2) {
        assert (cnz2 != null);
        cnz2.oM(del.gjj);
        guh guh2 = (guh)this.MessageDelegator.h(24579, this.getGUID(), lcr.qBF);
        guh2.jrX = false;
        guh2.jrV = cnz2.getGUID();
        this.MessageDelegator.F(guh2);
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return true;
    }

    @Override
    public void b(cbx cbx2) {
        cnz cnz2 = (cnz)cbx2;
        bfl bfl2 = (bfl)cnz2.aIv().aof();
        ldv ldv2 = null;
        if (bfl2.aYF != null && !lea.enW().isDescendant(bfl2.bsG, cug.fgG)) {
            ldv2 = lcr.tQ((ldv)bfl2.aYF);
        }
        if (ldv2 != null) {
            eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
            eef2.sk(2);
            this.MessageDelegator.F(eef2);
        } else {
            this.hF.c(mcx.uCT.bD(cug.frP));
        }
        if (this.aTx == cnz2) {
            this.b(this.aTx);
            this.aTx = null;
            if (this.aTy != null && this.aTy.az() == cug.frN) {
                this.b(this.aTy);
                this.a(this.aTy.aAG().av(), cug.frO);
                this.aTy = null;
            }
            return;
        }
        if (this.aTy == cnz2) {
            this.b(this.aTy);
            this.aTy = null;
            if (this.aTx != null && this.aTx.az() == cug.frN) {
                this.b(this.aTx);
                this.a(this.aTx.aAG().av(), cug.frO);
                this.aTx = null;
            }
            return;
        }
        assert (false);
    }

    @Override
    public void a(cbx cbx2, et et2) {
        if (!(cbx2 instanceof cnz)) {
            return;
        }
        if (et2.getType() != 352) {
            return;
        }
        cnz cnz2 = (cnz)cbx2;
        this.hF.c(mcx.uCK.bD(cug.frN));
    }

    private boolean a(gub gub2, btk btk2) {
        cnz cnz2;
        if (!(btk2 instanceof cnz)) {
            assert (false);
            return false;
        }
        cnz cnz3 = (cnz)((Object)btk2);
        guc guc2 = (guc)this.MessageDelegator.h(24581, cnz3.getGUID(), gub2.aO());
        this.MessageDelegator.b(gub2, guc2);
        if (cnz3 != this.aTx && cnz3 != this.aTy) {
            guc2.ew = 5;
            this.MessageDelegator.F(guc2);
            return true;
        }
        if (this.aTx == null || this.aTy == null) {
            guc2.ew = 5;
            this.MessageDelegator.F(guc2);
            return true;
        }
        assert (cnz3 == this.aTx || cnz3 == this.aTy);
        cnz cnz4 = cnz3;
        cnz cnz5 = cnz2 = cnz4 == this.aTx ? this.aTy : this.aTx;
        if (!cnz4.aIs()) {
            guc2.ew = 3;
            this.MessageDelegator.F(guc2);
            return true;
        }
        guc2.jrU = cnz2.aAG().av();
        guc2.jrU.y += 1.0f;
        guc2.ew = 4;
        this.MessageDelegator.F(guc2);
        this.a(gub2);
        return true;
    }

    private void a(gub gub2) {
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), gub2.diQ);
        eef2.sk(1);
        this.MessageDelegator.F(eef2);
    }

    private void ae(ljq ljq2) {
        this.aTz = a.aTE;
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(akL);
        kji2.setLength(0.75f);
        this.MessageDelegator.a(kji2);
    }

    private void a(eeg eeg2) {
        if (eeg2.aVk() == 1) {
            if (eeg2.iV() != null) {
                this.hF.c(mcx.uCO.bD(eeg2.kE().toString(), eeg2.iP() + " " + eeg2.iR(), eeg2.iV(), cug.frN));
            } else {
                this.hF.c(mcx.uCN.bD(eeg2.iP() + " " + eeg2.iR(), cug.frN));
            }
        } else if (eeg2.aVk() == 2) {
            if (eeg2.iV() != null) {
                this.hF.c(mcx.uCS.bD(eeg2.kE().toString(), eeg2.iP() + " " + eeg2.iR(), eeg2.iV(), cug.frN));
            } else {
                this.hF.c(mcx.uCR.bD(eeg2.iP() + " " + eeg2.iR(), cug.frN));
            }
        } else assert (false);
    }

    @Override
    public void doTick(ldz ldz2) {
        this.u(ldz2);
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        switch (dxq2.bEz()) {
            case 24580: {
                return this.a((gub)dxq2, btk2);
            }
        }
        return false;
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

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24578: {
                this.a((gue)dxq2);
                break;
            }
            case 7982: {
                this.a((fnf)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

