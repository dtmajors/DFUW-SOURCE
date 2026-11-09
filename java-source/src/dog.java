/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class dog
extends don {
    private dnp gLH = null;

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
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.gLQ) {
            if (this.gLH.gKY != null) {
                int n = this.gLH.gKY.length;
                for (int i = 0; i < n; ++i) {
                    this.a(this.gLH.dAu, this.gLH.gKY[i]);
                }
            }
            if (this.gLH.gLb != null && this.gLH.gLb.dAy != null) {
                this.a(this.gLH.dAu, this.gLH.gLb);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFChangeStartingWeaponInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        switch (gre2.jqc) {
            case 7964: 
            case 7971: {
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
        this.gLH = (dnp)this.gLP.gKN;
        this.nw(this.gLH.dAu);
    }

    private void a(fmq fmq2) {
        if (fmq2.iQn == null) {
            lfn.b(5, "SFChangeStartingWeaponInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerGUID is null.");
            return;
        }
        if (fmq2.iJM <= 0) {
            lfn.b(5, "SFChangeStartingWeaponInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerResourceType is invalid.");
            return;
        }
        this.gLH.gKT = fmq2.iJM;
        int[] nArray = new int[]{cug.fkb, this.gLH.gLa};
        int[] nArray2 = new int[]{(int)this.gLH.gKX, 1};
        this.a(this.gLH.dAu, nArray, nArray2, true);
    }

    private void c(fmu fmu2) {
        if (fmu2.bqd == null) {
            lfn.b(5, "SFChangeStartingWeaponInfoAssembler", "handleQueryInfoResponse() ResourceTypes array is null.");
            return;
        }
        if (fmu2.iIY == null) {
            lfn.b(5, "SFChangeStartingWeaponInfoAssembler", "handleQueryInfoResponse() Quantities array is null.");
            return;
        }
        if (fmu2.iQy) {
            this.bok = mce.uev.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        if (fmu2.iQz == null) {
            lfn.b(5, "SFChangeStartingWeaponInfoAssembler", "handleQueryInfoResponse() ResourceQueryInfos array is null.");
            return;
        }
        assert (fmu2.iQz.length == 2);
        bsa bsa2 = fmu2.iQz[0];
        if (bsa2 == null) {
            this.bok = mce.uev.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        bsa bsa3 = fmu2.iQz[1];
        if (bsa3 == null) {
            this.bok = mce.usE.bD(new Object[0]);
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
        this.gLH.gKY = dnzArray;
        assert (bsa3.avX() != null);
        assert (bsa3.avX().length == 1);
        assert (bsa3.awJ() != null);
        assert (bsa3.avX().length == bsa3.awJ().length);
        brp brp2 = bsa3.avX()[0];
        dny dny2 = new dny();
        dny2.GUID = bsa3.avX()[0].GUID;
        dny2.dAy = bsa3.awJ()[0];
        this.gLH.gLb = dny2;
        this.gLO.a(this);
    }
}

