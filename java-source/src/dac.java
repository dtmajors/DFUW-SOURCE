/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 */
public class dac
extends czc {
    private boolean gaA = false;

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1028: {
                this.a((ftz)dxq2);
                break;
            }
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGw && this.gaA) {
            return true;
        }
        return super.b(a2, a3);
    }

    @Override
    protected void a(czc.a a2) {
        assert (!this.gaA);
        if (a2 == czc.a.fZG) {
            ljq ljq2;
            assert (!this.fGZ);
            assert (this.fGh.akX != null);
            assert (this.fGi == null);
            int n2 = cug.uI((int)this.fGh.dhr);
            if (lea.enW().isDescendant(n2, cug.fno) && this.jk() != null && this.jk().bgR() != null && this.jk().bgR().aAG() != null && this.jk().bgR().aAG().azb() != null && (ljq2 = this.jk().bgR().aAG().azb()) != null && !lea.b(ljq2, lea.enW().getName(n2))) {
                ha ha2 = this.jk().bgR().mA();
                if (ha2 != null) {
                    ha2.c(lzz.tZt.bD(lea.enW().getName(n2).replace("r_Figurine ", "r_")));
                }
                this.ber();
                this.beQ();
                return;
            }
        } else if (a2 != czc.a.fZH && a2 == czc.a.fZI) {
            ftz ftz2 = (ftz)this.MessageDelegator.h(1028, this.GUID, this.fGh.dsL);
            ftz2.hsP = true;
            ftz2.aqs = this.aYH;
            this.MessageDelegator.F(ftz2);
            this.gaA = true;
        }
    }

    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        if (!this.gaA) {
            return;
        }
        this.gaA = false;
        this.fXv = true;
        this.beQ();
    }

    @Override
    protected void bex() {
        super.bex();
        this.gaA = false;
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            return;
        }
        if (fcs2.iJq) {
            this.b(cxd.p.fSi);
            this.bhr();
        } else {
            this.ber();
        }
    }

    private void a(ftz ftz2) {
        if (!this.gaA) {
            return;
        }
        if (ftz2.aqs != this.aYH) {
            return;
        }
        this.gaA = false;
        if (ftz2.Position != null && this.a(this.fGh.dhr, this.emI.bgQ().aAG().av(), ftz2.Position)) {
            this.mr(this.fGh.akX);
        }
        this.fXv = true;
        this.beQ();
    }

    private void mr(ldv ldv2) {
        assert (ldv2 != null);
        fdr fdr2 = (fdr)this.MessageDelegator.h(9238, this.GUID, this.MessageDelegator.getGUID());
        fdr2.dul = 8;
        fdr2.bst = this.getFunctionType();
        fdr2.aZG = this.emI.bgQ().getGUID();
        fdr2.akX = ldv2;
        fdr2.aYF = fdr2.aZG;
        fdr2.bsG = this.emI.bgQ().az();
        fdr2.aYC = this.SkillType;
        fdr2.dXG = this.emI.bgQ().az();
        fdr2.diS = this.emI.bgQ().aAG().av();
        fdr2.dAu = this.emI.bgQ().aJC().asf().getGUID();
        this.MessageDelegator.F(fdr2);
    }
}

