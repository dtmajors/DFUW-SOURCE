/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  ha
 *  lcr
 */
public class tm
extends btk
implements btn,
bto,
cbq {
    private cnz aTG = null;
    private cnz aTH = null;
    private static final double aTI = 7200.0;
    private static final double aTs = 7200.0;
    private static final double aTt = 60.0;
    private static final double aTu = 1.0;
    private static final float aTv = 10.0f;
    private int aTJ = 0;
    private double aTK = 0.0;
    private double aTL = 0.0;
    private double aTM = 0.0;
    private boolean aTN = false;
    private boolean aTO = false;
    private boolean aTP = false;
    private boolean aTQ = false;
    private static final int aTR = 1;
    private static final int aTS = 2;
    private static final int aTT = 3;
    private final ha hF;
    private static final ljq akL = new ljq(0.0, -1.0, 0.0);
    private static final float akM = 0.5f;
    private static final float aTw = 1.0f;
    private static final float akO = 0.75f;
    private ljq aTA = null;
    private int aTU = -1;
    private static final int aTq = 1;
    private static final int aTV = 2;
    private static final int aTW = 3;

    public tm(ha ha2) {
        this.hF = ha2;
    }

    @Override
    public void doTick(ldz ldz2) {
        this.u(ldz2);
    }

    private void u(ldz ldz2) {
        if (this.aTN || this.aTO || this.aTP) {
            return;
        }
        if (this.aTG != null && this.aTH == null) {
            if (this.aTK + 7200.0 > ldz2.rgz) {
                return;
            }
            this.b(this.aTG);
            this.aTG = null;
            this.aTJ = 0;
            this.hF.c(mcx.uCB.bD(cug.frN));
            return;
        }
        if (this.aTG != null && this.aTH != null) {
            if (this.aTL + 7200.0 > ldz2.rgz) {
                return;
            }
            this.b(this.aTG);
            this.aTG = null;
            this.b(this.aTH);
            this.aTH = null;
            this.aTJ = 0;
            this.hF.c(mcx.uCC.bD(cug.frN));
            return;
        }
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

    public boolean uU() {
        if (this.aTN) {
            return false;
        }
        if (this.aTG != null) {
            return false;
        }
        if (this.aTP) {
            return false;
        }
        if (this.aTQ) {
            return false;
        }
        assert (this.aTH == null);
        return this.aTH == null;
    }

    public boolean uV() {
        if (this.aTG == null) {
            return false;
        }
        if (this.aTO) {
            return false;
        }
        if (this.aTH != null) {
            return false;
        }
        return !this.aTQ;
    }

    public void dk(int n) {
        ljq ljq2;
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
        if (lea.enW().isDescendant(n, cug.frQ)) {
            if (!this.uU()) {
                this.hF.c(mcx.uCE.bD(n));
                return;
            }
        } else if (lea.enW().isDescendant(n, cug.frR)) {
            if (!this.uV()) {
                if (this.aTG == null) {
                    this.hF.c(mcx.uCG.bD(n));
                } else {
                    this.hF.c(mcx.uCF.bD(n));
                }
                return;
            }
            assert (this.aTG != null);
            ljq2 = this.aTG.aAG().av();
            ljq2.et(this.hF.jf().aAG().av());
            float f2 = ljq2.eqN();
            if (f2 < 10.0f) {
                this.hF.c(mcx.uCH.bD(n));
                return;
            }
        } else {
            assert (false);
            return;
        }
        this.aTU = n;
        ljq2 = this.hF.jf().aAG().av();
        ljq2.y += 0.5f;
        this.ae(ljq2);
    }

    private void a(gue gue2) {
        if (gue2.aVk() == 1) {
            assert (this.aTN);
            this.aTN = false;
            assert (gue2.jrW != null);
            assert (gue2.jrV != null);
            this.aTG = gue2.jrW;
            assert (this.aTH == null);
            this.a(this.aTG);
            this.aTG.oM(del.gji);
            this.aTK = this.MessageDelegator.arc().rgz;
            this.aTH.fi().a(12384, this.aTK + 7200.0);
        } else if (gue2.aVk() == 3) {
            assert (this.aTP);
            this.aTP = false;
            assert (gue2.jrW != null);
            assert (this.aTG == null);
            if (this.aTH == null) {
                this.b(gue2.jrW);
                return;
            }
            this.aTG = gue2.jrW;
            this.aTG.oM(del.gji);
            this.aTM = this.MessageDelegator.arc().rgz;
            this.a(this.aTG);
            this.aTG.fi().i(1248, this.aTJ);
            this.aTG.fi().i(12576, this.aTG.aUN());
            this.aTG.fi().a(12384, this.aTM + 60.0);
        } else if (gue2.aVk() == 2) {
            assert (this.aTO);
            this.aTO = false;
            assert (gue2.jrW != null);
            assert (gue2.jrV != null);
            assert (this.aTH == null);
            if (this.aTG == null) {
                this.b(gue2.jrW);
                return;
            }
            this.aTH = gue2.jrW;
            this.a(this.aTH);
            this.aTH.oM(del.gji);
            this.b(this.aTG);
            this.aTP = true;
            this.a(cug.frN, 3, this.aTG.aAG().av());
            this.aTG = null;
            this.aTL = this.MessageDelegator.arc().rgz;
            this.aTH.fi().a(12384, this.aTL + 7200.0);
        } else assert (false);
        gue2.jrW.fi().b(10432, this.hF.iU());
    }

    private void a(cnz cnz2) {
        cnz2.a(this);
        cnz2.a(this);
    }

    public void af(ljq ljq2) {
        assert (this.uV());
        if (!this.uV()) {
            return;
        }
        this.aTO = true;
        this.a(cug.frP, 2, ljq2);
    }

    public void ag(ljq ljq2) {
        assert (this.uU());
        if (!this.uU()) {
            return;
        }
        this.aTN = true;
        this.a(cug.frO, 1, ljq2);
    }

    private void a(int n, int n2, ljq ljq2) {
        gud gud2 = (gud)this.MessageDelegator.h(24577, this.getGUID(), lcr.qBF);
        gud2.sk(n2);
        gud2.l(n);
        gud2.c(ljq2);
        float f2 = (float)(Math.PI * Math.random());
        gud2.a(new lgl(new ljq(0.0f, f2, 0.0f)));
        gud2.jS(true);
        gud2.oF(null);
        this.MessageDelegator.F(gud2);
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
        if (!(cbx2 instanceof cnz)) {
            // empty if block
        }
        cnz cnz2 = (cnz)cbx2;
        bfl bfl2 = (bfl)cnz2.aIv().aof();
        ldv ldv2 = null;
        if (bfl2.aYF != null && !lea.enW().isDescendant(bfl2.bsG, cug.fgG)) {
            ldv2 = lcr.tQ((ldv)bfl2.aYF);
        }
        if (cnz2 == this.aTH) {
            if (ldv2 != null) {
                eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
                eef2.sk(2);
                this.MessageDelegator.F(eef2);
            } else {
                this.hF.c(mcx.uCT.bD(cug.frP));
            }
            this.b(this.aTH);
            this.aTH = null;
            if (this.aTG != null) {
                this.b(this.aTG);
                this.aTG = null;
            }
        } else if (cnz2 == this.aTG) {
            if (ldv2 != null) {
                eef eef3 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
                eef3.sk(3);
                this.MessageDelegator.F(eef3);
            } else {
                this.hF.c(mcx.uCU.bD(cug.frN));
            }
            this.b(this.aTG);
            this.aTG = null;
            if (this.aTH != null) {
                this.b(this.aTH);
                this.aTH = null;
            }
        }
        this.aTJ = 0;
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
        if (cnz2 == this.aTG) {
            this.hF.c(mcx.uCK.bD(cug.frN));
        } else if (cnz2 == this.aTH) {
            this.hF.c(mcx.uCL.bD(cug.frP));
        } else assert (false);
    }

    private boolean a(gub gub2, btk btk2) {
        if (!(btk2 instanceof cnz)) {
            assert (false);
            return false;
        }
        cnz cnz2 = (cnz)((Object)btk2);
        guc guc2 = (guc)this.MessageDelegator.h(24581, cnz2.getGUID(), gub2.aO());
        this.MessageDelegator.b(gub2, guc2);
        if (cnz2 != this.aTG) {
            guc2.ew = 5;
            this.MessageDelegator.F(guc2);
            return true;
        }
        if (this.aTG == null || this.aTH == null) {
            guc2.ew = 5;
            this.MessageDelegator.F(guc2);
            return true;
        }
        assert (cnz2 == this.aTG);
        if (!this.aTG.aIs()) {
            guc2.ew = 3;
            this.MessageDelegator.F(guc2);
            return true;
        }
        if (this.aTJ >= cnz2.aUN()) {
            guc2.ew = 3;
            this.MessageDelegator.F(guc2);
            return true;
        }
        if (this.aTM + 60.0 > this.MessageDelegator.arc().rgz) {
            guc2.ew = 1;
            this.MessageDelegator.F(guc2);
            return true;
        }
        guc2.jrU = this.aTH.aAG().av();
        guc2.jrU.y += 1.0f;
        guc2.ew = 4;
        this.MessageDelegator.F(guc2);
        this.a(gub2);
        return true;
    }

    private void a(gub gub2) {
        ++this.aTJ;
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), gub2.diQ);
        eef2.sk(1);
        this.MessageDelegator.F(eef2);
        this.aTM = this.MessageDelegator.arc().rgz;
        if (this.aTG != null) {
            this.aTG.fi().i(1248, this.aTJ);
            this.aTG.fi().a(12384, this.aTM + 60.0);
        }
        if (this.aTJ >= this.aTG.aUN()) {
            this.hF.c(mcx.uCM.bD(cug.frN));
            if (this.aTG != null) {
                this.b(this.aTG);
                this.aTG = null;
            }
            if (this.aTH != null) {
                this.b(this.aTH);
                this.aTH = null;
            }
            this.aTJ = 0;
        }
    }

    private void ae(ljq ljq2) {
        this.aTQ = true;
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

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.bqd == null) {
            this.aTQ = false;
            this.hF.c(mcx.uCI.bD(cug.frN));
            return;
        }
        if (kuj2.bqd.length <= 0) {
            this.aTQ = false;
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
            this.aTQ = false;
            this.hF.c(mcx.uCI.bD(cug.frN));
            return;
        }
        this.aTA = kuj2.ilP[n];
        fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), this.hF.getGUID());
        fne2.hsP = true;
        fne2.aqs = this.aTU;
        fne2.ResourceType = this.aTU;
        fne2.asi = 1;
        fne2.b(bqy.dHw);
        this.hF.receiveMessage((dxq)fne2);
    }

    private void a(fnf fnf2) {
        this.aTQ = false;
        if (!fnf2.iQM) {
            this.hF.c(mcx.uCJ.bD(cug.frK));
            return;
        }
        assert (this.aTU > 0);
        assert (this.aTA != null);
        if (this.aTU == cug.frK) {
            this.ag(this.aTA);
        } else if (this.aTU == cug.frL) {
            this.af(this.aTA);
        } else assert (false);
    }

    private void a(eeg eeg2) {
        if (eeg2.aVk() == 1) {
            if (eeg2.iV() != null) {
                this.hF.c(mcx.uCO.bD(eeg2.kE().toString(), eeg2.iP() + " " + eeg2.iR(), eeg2.iV(), cug.frN));
            } else {
                this.hF.c(mcx.uCN.bD(eeg2.iP() + " " + eeg2.iR(), cug.frN));
            }
        } else if (eeg2.aVk() == 3) {
            if (eeg2.iV() != null) {
                this.hF.c(mcx.uCS.bD(eeg2.kE().toString(), eeg2.iP() + " " + eeg2.iR(), eeg2.iV(), cug.frN));
            } else {
                this.hF.c(mcx.uCR.bD(eeg2.iP() + " " + eeg2.iR(), cug.frN));
            }
        } else if (eeg2.aVk() == 2) {
            if (eeg2.iV() != null) {
                this.hF.c(mcx.uCQ.bD(eeg2.kE().toString(), eeg2.iP() + " " + eeg2.iR(), eeg2.iV(), cug.frP));
            } else {
                this.hF.c(mcx.uCP.bD(eeg2.iP() + " " + eeg2.iR(), cug.frP));
            }
        } else assert (false);
    }
}

