/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class dox
extends dpd {
    public static final int gLT = 3;
    public static final int gMd = 4;
    public static final int gMe = 5;
    public static final int gLU = 6;
    private static final int gLV = 10;
    private dns gLK = null;
    private boolean[] gLW = null;
    private int gLX = -1;
    private boolean gLY = false;
    private brt gMf = null;
    private boolean[] gMg = null;
    private boolean gMh = false;
    private bqs[] dvh = null;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            case 7954: {
                this.a((fmc)dxq2);
                break;
            }
            case 7994: {
                this.c((fmy)dxq2);
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
            dnzArray = this.gLK.gLm;
            n = dnzArray.length;
            for (int i = 0; i < n; ++i) {
                if (i >= this.gLX) continue;
                n2 += dnzArray[i].asi;
            }
            cte2 = new cte();
            cte2.ResourceType = cug.fkb;
            cte2.asi = n2;
            this.a(this.gLK.gLf, cte2, bqy.dGo);
        }
        if (this.mb >= 3) {
            n2 = 0;
            dnzArray = this.gLK.gLm;
            n = dnzArray.length;
            for (int i = 0; i < n; ++i) {
                n2 += dnzArray[i].asi;
            }
            cte2 = new cte();
            cte2.ResourceType = cug.fkb;
            cte2.asi = n2;
            this.a(this.gLK.gLf, cte2, bqy.dGo);
        }
        if (this.mb >= 6) {
            int n3 = this.dvh.length;
            for (n2 = 0; n2 < n3; ++n2) {
                if (this.dvh[n2] == null) continue;
                this.aH(this.dvh[n2].getGUID());
            }
        }
        this.a(this.gLK.gLc, this.gLK.gLk);
        this.a(this.gLK.gLc, this.gLK.gLl);
        dnz[] dnzArray2 = this.gLK.gLm;
        int n4 = dnzArray2.length;
        for (int i = 0; i < n4; ++i) {
            this.a(this.gLK.gLf, dnzArray2[i]);
        }
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLK.gLc, this.gLK.gLk);
        this.a(this.gLK.gLc, this.gLK.gLl);
        dnz[] dnzArray = this.gLK.gLm;
        int n = dnzArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(this.gLK.gLf, dnzArray[i]);
        }
    }

    @Override
    protected void c(int n, int n2, ldv ldv2, ldv ldv3) {
        if (n2 == 7953) {
            if (this.mb == 1) {
                lfn.b(5, "SFSellToPlayerPerformer", "handleMessageSendingFailed() Decreasing of one or more of ObjectB's currency items failed.");
                int n3 = n - 10;
                this.gLW[n3] = true;
                if (this.gLX < 0 && n3 > 0) {
                    this.gLX = n3;
                }
                if (this.brP()) {
                    this.gMm.b(this, this.gMn);
                }
            } else if (this.mb == 4) {
                lfn.b(5, "SFSellToPlayerPerformer", "handleMessageSendingFailed() Retrieving the sold item from ObjectA failed.");
                this.gMm.b(this, this.gMn);
            }
        } else if (n2 == 7939) {
            assert (this.mb == 3);
            lfn.b(5, "SFSellToPlayerPerformer", "handleMessageSendingFailed() Increasing ObjectA's currency item failed.");
            this.gMm.b(this, this.gMn);
        } else if (n2 == 7993) {
            assert (this.mb == 5);
            lfn.b(5, "SFSellToPlayerPerformer", "handleMessageSendingFailed() Sold item could not be autostacked.");
            this.gMm.b(this, this.gMn);
        } else if (n2 == 7974) {
            assert (this.mb == 6);
            lfn.b(5, "SFSellToPlayerPerformer", "handleMessageSendingFailed() Sold item could not be delivered.");
            this.gMm.b(this, this.gMn);
        } else {
            super.c(n, n2, ldv2, ldv3);
        }
    }

    @Override
    protected void brO() {
        this.gLK = (dns)this.gMn;
        dnz[] dnzArray = this.gLK.gLm;
        this.gLW = new boolean[dnzArray.length];
        int n = dnzArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(this.gLK.gLf, 10 + i, dnzArray[i], false, bqy.dHE);
        }
    }

    private bqs G(ldv ldv2, int n) {
        lgw lgw2 = (lgw)lea.enW().acv(n);
        assert (lgw2 != null);
        int n2 = cug.uF((int)n);
        if (cug.vQ((int)n)) {
            n2 *= this.gLK.gLk.asi;
        }
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
        if (fcs2.aqs == -1) {
            lfn.b(5, "SFSellToPlayerPerformer", "handleFunctionCompletionResultMessage() MessageTag is invalid.");
            return;
        }
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFSellToPlayerPerformer", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.iJq && fcs2.akX == null) {
            lfn.b(5, "SFSellToPlayerPerformer", "handleFunctionCompletionResultMessage() TargeObjectGUID is null.");
            return;
        }
        int n = fcs2.aVk() - 10;
        this.gMg[n] = fcs2.iJq;
        if (fcs2.iJq) {
            this.dvh[n] = this.G(fcs2.akX, this.gMf.az());
        } else {
            lfn.b(5, "SFSellToPlayerPerformer", "handleFunctionCompletionResultMessage() Resource '" + this.gMf.pa() + "' with index " + n + " could not be created.");
            this.gMh = true;
        }
        if (!this.brQ()) {
            return;
        }
        if (this.gMh) {
            this.gMm.b(this, this.gMn);
        } else {
            this.mb = 6;
            if (dng.gKK) {
                this.gMp = true;
            }
            brv[] brvArray = new brv[this.dvh.length];
            int n2 = brvArray.length;
            for (int i = 0; i < n2; ++i) {
                brvArray[i] = new brv();
                brvArray[i].dIY = this.dvh[i];
            }
            this.a(this.gLK.gLf, this.gLK.gLg, brvArray, bqy.dGn);
        }
    }

    private void a(fmo fmo2) {
        switch (fmo2.ilu) {
            case 7: {
                if (this.mb == 1) {
                    if (fmo2.aVk() == -1) {
                        lfn.b(5, "SFSellToPlayerPerformer", "handleInventoryOperationReceiptMessage() MessageTag is invalid.");
                        return;
                    }
                    int n = fmo2.aVk() - 10;
                    this.gLW[n] = true;
                    if (!fmo2.eo) {
                        lfn.b(5, "SFSellToPlayerPerformer", "handleInventoryOperationReceiptMessage() Quantity decrease failed for a currencyitem.");
                        lfn.b(5, "SFSellToPlayerPerformer", "handleInventoryOperationReceiptMessage() " + this.gLK.gLm[n]);
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
                    this.a(this.gLK.gLc, this.gLK.gLl, (int)this.gLK.gLk.aXV);
                    break;
                }
                if (fmo2.eo) break;
                lfn.b(5, "SFSellToPlayerPerformer", "handleInventoryOperationReceiptMessage() Sold item could not be removed.");
                lfn.b(5, "SFSellToPlayerPerformer", "handleInventoryOperationReceiptMessage() " + this.gLK.gLk);
                this.gMm.b(this, this.gMn);
                break;
            }
            case 15: {
                if (fmo2.eo) {
                    this.mb = 4;
                    this.a(this.gLK.gLc, this.gLK.gLk, this.gLK.gLk.asi, true, bqy.dHD);
                    break;
                }
                lfn.b(5, "SFSellToPlayerPerformer", "handleInventoryOperationReceiptMessage() Quantity of currencyitem " + this.gLK.gLl.GUID + " could not be changed.");
                lfn.b(5, "SFSellToPlayerPerformer", "handleInventoryOperationReceiptMessage() " + this.gLK.gLl);
                this.gMm.b(this, this.gMn);
                break;
            }
            case 1: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn);
                    if (!(this.gMn instanceof dns)) break;
                    dns dns2 = (dns)this.gMn;
                    ldv ldv2 = lcr.abW((int)dns2.gLf.enw());
                    fsn fsn2 = (fsn)this.MessageDelegator.h(30221, this.getGUID(), ldv2);
                    fsn2.ObjectType = cgd.ewU.ordinal();
                    fsn2.bSL = dns2.gLk.ResourceType;
                    this.MessageDelegator.F(fsn2);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFSellToPlayerPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
                return;
            }
        }
    }

    private void c(fmy fmy2) {
        if (fmy2.iQF) {
            this.mb = 2;
            this.gMm.a(this, this.gMn);
            return;
        }
        this.gMg = new boolean[1];
        this.dvh = new bqs[1];
        int n = cug.uF((int)this.gMf.az()) * this.gLK.gLk.asi;
        this.b(10, this.gLK.gLf, this.gMf.az(), n);
    }

    private void a(fmc fmc2) {
        if (fmc2.dIY == null) {
            lfn.b(5, "SFSellToPlayerPerformer", "handleItemQuantityDecreaseResponse() ItemBase is null.");
            return;
        }
        this.mb = 5;
        this.gMf = (brt)fmc2.dIY;
        if (dng.gKK) {
            this.gMp = true;
        }
        if (cug.vQ((int)this.gMf.az())) {
            int n = cug.uF((int)this.gMf.az()) * this.gLK.gLk.asi;
            this.b(this.gLK.gLf, this.gMf.az(), n, bqy.dGn);
        } else {
            this.gMg = new boolean[this.gLK.gLk.asi];
            this.dvh = new bqs[this.gLK.gLk.asi];
            int n = this.gMg.length;
            for (int i = 0; i < n; ++i) {
                this.b(10 + i, this.gLK.gLf, this.gMf.az(), 1);
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

    private boolean brQ() {
        int n = this.gMg.length;
        for (int i = 0; i < n; ++i) {
            if (this.gMg[i]) continue;
            return false;
        }
        return true;
    }

    private void b(int n, ldv ldv2, int n2, int n3) {
        assert (n > 0);
        assert (ldv2 != null);
        assert (n2 > 0);
        assert (n3 > 0);
        fcv fcv2 = (fcv)this.MessageDelegator.h(9243, this.GUID, ldv2.bFk());
        fcv2.aqs = n;
        fcv2.dul = 8;
        fcv2.bst = bkd.dqP;
        fcv2.aZG = this.GUID;
        fcv2.akX = this.gLK.gLf;
        fcv2.ResourceType = n2;
        fcv2.asi = n3;
        this.MessageDelegator.F(fcv2);
    }
}

