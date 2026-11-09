/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class doe
extends don {
    private dnn gLF = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        fkz fkz2 = (fkz)this.MessageDelegator.h(11782, this.GUID, this.gLP.gKM);
        fkz2.sk(this.gLP.aqs);
        fkz2.iPj = bl;
        if (!bl) {
            fkz2.s(this.bok != null ? this.bok : mce.usK.bD(new Object[0]));
        }
        return fkz2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7965: {
                this.c((fmu)dxq2);
                break;
            }
            case 7972: {
                this.a((fmq)dxq2);
                break;
            }
            case 7998: {
                this.a((fnq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.gLQ && this.gLF.gKY != null) {
            int n = this.gLF.gKY.length;
            for (int i = 0; i < n; ++i) {
                this.a(this.gLF.dAu, this.gLF.gKY[i]);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFAddStartingWeaponInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        switch (gre2.jqc) {
            case 7964: 
            case 7971: 
            case 7997: {
                this.bok = mce.usL.bD(new Object[0]);
                this.gLO.b(this);
                break;
            }
            default: {
                super.handleSystemMessageSendingErrorMessage(gre2);
            }
        }
    }

    @Override
    protected void brI() {
        this.gLF = (dnn)this.gLP.gKN;
        this.nw(this.gLF.dAu);
    }

    private void a(fmq fmq2) {
        if (fmq2.iQn == null) {
            lfn.b(5, "SFAddStartingWeaponInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerGUID is null.");
            return;
        }
        if (fmq2.iJM <= 0) {
            lfn.b(5, "SFAddStartingWeaponInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerResourceType is invalid.");
            return;
        }
        this.gLF.gKT = fmq2.iJM;
        this.ab(this.gLF.dAu, this.gLF.gKW);
    }

    private void a(fnq fnq2) {
        if (fnq2.iRi) {
            this.a(this.gLF.dAu, new int[]{cug.fkb}, new int[]{(int)this.gLF.gKX}, true);
        } else {
            this.bok = !fnq2.iRj ? mce.usM.bD(new Object[0]) : mdc.uEP.bD(new Object[0]);
            this.gLO.b(this);
        }
    }

    private void c(fmu fmu2) {
        if (fmu2.bqd == null) {
            lfn.b(5, "SFAddStartingWeaponInfoAssembler", "handleQueryInfoResponse() ResourceTypes array is null.");
            return;
        }
        if (fmu2.iIY == null) {
            lfn.b(5, "SFAddStartingWeaponInfoAssembler", "handleQueryInfoResponse() Quantities array is null.");
            return;
        }
        if (fmu2.iQy) {
            this.bok = mce.uev.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        if (fmu2.iQz == null) {
            lfn.b(5, "SFAddStartingWeaponInfoAssembler", "handleQueryInfoResponse() ResourceQueryInfos array is null.");
            return;
        }
        assert (fmu2.iQz.length == 1);
        bsa bsa2 = fmu2.iQz[0];
        if (bsa2 == null) {
            this.bok = mce.uev.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        assert (bsa2.avX() != null);
        assert (bsa2.avX().length > 0);
        assert (bsa2.awJ() != null);
        assert (bsa2.avX().length == bsa2.awJ().length);
        int n = bsa2.vf();
        brp[] brpArray = bsa2.avX();
        lef[] lefArray = bsa2.awJ();
        dnz[] dnzArray = new dnz[bsa2.avX().length];
        int n2 = bsa2.avX().length;
        for (int i = 0; i < n2; ++i) {
            dnzArray[i] = new dnz();
            dnzArray[i].GUID = brpArray[i].GUID;
            dnzArray[i].dAy = lefArray[i];
            dnzArray[i].asi = n >= brpArray[i].asi ? brpArray[i].asi : n;
            n -= dnzArray[i].asi;
        }
        assert (n == 0);
        this.gLF.gKY = dnzArray;
        this.gLO.a(this);
    }

    private void ab(ldv ldv2, int n) {
        assert (ldv2 != null);
        assert (n > 0);
        fnp fnp2 = (fnp)this.MessageDelegator.h(7997, this.GUID, ldv2);
        fnp2.hsP = true;
        fnp2.iRh = 1;
        fnp2.gKW = n;
        this.MessageDelegator.F(fnp2);
    }
}

