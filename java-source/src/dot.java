/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class dot
extends dpd {
    public static final int gLT = 3;
    public static final int gLU = 4;
    private static final int gLV = 10;
    private dnp gLH = null;
    private boolean[] gLW = null;
    private int gLX = -1;
    private boolean gLY = false;
    private bqs gbf = null;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
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
    protected void brM() {
        cte cte2;
        int n;
        dnz[] dnzArray;
        int n2;
        assert (this.mb != 2);
        if (dng.gKK) {
            dng.gKK = false;
        }
        if (this.gLX > 0) {
            n2 = 0;
            dnzArray = this.gLH.gKY;
            n = dnzArray.length;
            for (int i = 0; i < n; ++i) {
                if (i >= this.gLX) continue;
                n2 += dnzArray[i].asi;
            }
            cte2 = new cte();
            cte2.ResourceType = cug.fkb;
            cte2.asi = n2;
            this.a(this.gLH.dAu, cte2, bqy.dFZ);
        }
        if (this.mb >= 3) {
            n2 = 0;
            dnzArray = this.gLH.gKY;
            n = dnzArray.length;
            for (int i = 0; i < n; ++i) {
                n2 += dnzArray[i].asi;
            }
            cte2 = new cte();
            cte2.ResourceType = cug.fkb;
            cte2.asi = n2;
            this.a(this.gLH.dAu, cte2, bqy.dFZ);
        }
        if (this.mb >= 4) {
            assert (this.gbf != null);
            this.aH(this.gbf.getGUID());
        }
        dnz[] dnzArray2 = this.gLH.gKY;
        int n3 = dnzArray2.length;
        for (int i = 0; i < n3; ++i) {
            this.a(this.gLH.dAu, dnzArray2[i]);
        }
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        dnz[] dnzArray = this.gLH.gKY;
        int n = dnzArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(this.gLH.dAu, dnzArray[i]);
        }
    }

    @Override
    protected void c(int n, int n2, ldv ldv2, ldv ldv3) {
        if (n2 == 7953) {
            lfn.b(5, "SFChangeStartingWeaponPerformer", "handleMessageSendingFailed() Decreasing of one or more currency items failed.");
            int n3 = n - 10;
            this.gLW[n3] = true;
            if (this.gLX < 0 && n3 > 0) {
                this.gLX = n3;
            }
            if (this.brP()) {
                this.gMm.b(this, this.gMn);
            }
        } else if (n2 == 7996) {
            assert (this.mb == 4);
            lfn.b(5, "SFChangeStartingWeaponPerformer", "handleMessageSendingFailed() Starting weapon could not be updated.");
            this.gMm.b(this, this.gMn);
        } else {
            super.c(n, n2, ldv2, ldv3);
        }
    }

    @Override
    protected void brO() {
        this.gLH = (dnp)this.gMn;
        dnz[] dnzArray = this.gLH.gKY;
        this.gLW = new boolean[dnzArray.length];
        int n = dnzArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(this.gLH.dAu, 10 + i, dnzArray[i], false, bqy.dHZ);
        }
    }

    private bqs G(ldv ldv2, int n) {
        lgw lgw2 = (lgw)lea.enW().acv(n);
        assert (lgw2 != null);
        int n2 = cug.uF((int)n);
        float f2 = cug.mr((int)n);
        et et2 = new et();
        et2.setType(1104);
        et2.o((float)n2 * f2);
        bqs bqs2 = new bqs();
        bqs2.setGUID(ldv2);
        bqs2.l(n);
        bqs2.do(n2);
        bqs2.b(lgw2.auO());
        bqs2.g(et2);
        bqs2.avb();
        return bqs2;
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFChangeStartingWeaponPerformer", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.iJq && fcs2.akX == null) {
            lfn.b(5, "SFChangeStartingWeaponPerformer", "handleFunctionCompletionResultMessage() TargeObjectGUID is null.");
            return;
        }
        if (!fcs2.iJq) {
            lfn.b(5, "SFChangeStartingWeaponPerformer", "handleFunctionCompletionResultMessage() Resource '" + this.gLH.brF() + "' could not be created.");
            this.gMm.b(this, this.gMn);
            return;
        }
        this.mb = 4;
        this.gbf = this.G(fcs2.akX, this.gLH.gKW);
        if (dng.gKK) {
            this.gMp = true;
        }
        this.F(this.gbf);
    }

    private void a(fmo fmo2) {
        switch (fmo2.ilu) {
            case 7: {
                if (fmo2.aVk() == -1) {
                    lfn.b(5, "SFChangeStartingWeaponPerformer", "handleInventoryOperationReceiptMessage() MessageTag is invalid.");
                    return;
                }
                int n = fmo2.aVk() - 10;
                this.gLW[n] = true;
                if (!fmo2.eo) {
                    lfn.b(5, "SFChangeStartingWeaponPerformer", "handleInventoryOperationReceiptMessage() Quantity decrease failed for a currencyitem.");
                    lfn.b(5, "SFChangeStartingWeaponPerformer", "handleInventoryOperationReceiptMessage() " + this.gLH.gKY[n]);
                    this.gLY = true;
                }
                if (!this.brP()) {
                    return;
                }
                if (this.gLY) {
                    this.gMm.b(this, this.gMn);
                    break;
                }
                this.mb = 3;
                this.ac(this.gLH.dAu, this.gLH.gKW);
                break;
            }
            case 17: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFChangeStartingWeaponPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
                return;
            }
        }
    }

    private boolean brP() {
        int n = this.gLW.length;
        for (int i = 0; i < n; ++i) {
            if (this.gLW[i]) continue;
            return false;
        }
        return true;
    }

    private void ac(ldv ldv2, int n) {
        assert (ldv2 != null);
        assert (n > 0);
        fcv fcv2 = (fcv)this.MessageDelegator.h(9243, this.GUID, ldv2.bFk());
        fcv2.dul = 8;
        fcv2.bst = bkd.dqP;
        fcv2.aZG = this.GUID;
        fcv2.akX = ldv2;
        fcv2.ResourceType = n;
        this.MessageDelegator.F(fcv2);
    }

    private void F(bqs bqs2) {
        assert (bqs2 != null);
        fnr fnr2 = (fnr)this.MessageDelegator.h(7996, this.GUID, this.gLH.dAu);
        fnr2.hsP = true;
        fnr2.ija = 2;
        fnr2.dJc = this.gLH.dJc;
        fnr2.iRm = this.gLH.gLb.GUID;
        fnr2.iRn = this.gLH.gLb.dAy;
        fnr2.iRo = bqs2;
        this.MessageDelegator.F(fnr2);
    }
}

