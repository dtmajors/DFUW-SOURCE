/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cug
 */
public class doj
extends don {
    private dns gLK = null;

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
            case 7951: {
                this.b((fly)dxq2);
                break;
            }
            case 7965: {
                this.c((fmu)dxq2);
                break;
            }
            case 7972: {
                this.a((fmq)dxq2);
                break;
            }
            case 7989: {
                this.a((fmh)dxq2);
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
            if (this.gLK.gLk.dAy != null) {
                this.a(this.gLK.gLc, this.gLK.gLk);
            }
            if (this.gLK.gLl.dAy != null) {
                this.a(this.gLK.gLc, this.gLK.gLl);
            }
            if (this.gLK.gLm != null) {
                int n = this.gLK.gLm.length;
                for (int i = 0; i < n; ++i) {
                    this.a(this.gLK.gLf, this.gLK.gLm[i]);
                }
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFSellToPlayerInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        switch (gre2.jqc) {
            case 7949: 
            case 7964: 
            case 7971: 
            case 7989: {
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
        this.gLK = (dns)this.gLP.gKN;
        this.nw(this.gLK.gLf);
    }

    private void a(fmq fmq2) {
        if (fmq2.iQn == null) {
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerGUID is null.");
            return;
        }
        if (fmq2.iJM <= 0) {
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerResourceType is invalid.");
            return;
        }
        this.gLK.gKT = fmq2.iJM;
        this.a(this.gLK.gLf, new int[]{cug.fkb}, new int[]{(int)this.gLK.gLk.aXV}, true);
    }

    private void b(fly fly2) {
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        assert (fly2.iPs.length == 1);
        if (fly2.aO().equals(this.gLK.gLc) && this.gLK.gLk.dAy == null) {
            if (!fly2.iPs[0].equals(this.gLK.gLk.GUID)) {
                lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ObjectAItemGUID=" + this.gLK.gLk.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
                return;
            }
            if (fly2.dJh == null) {
                this.bok = mce.usr.bD(new Object[0]);
                this.gLO.b(this);
                return;
            }
            assert (fly2.dJh.length == 1);
            assert (fly2.dJh[0] != null);
            this.gLK.gLk.dAy = fly2.dJh[0];
            this.Z(this.gLK.gLc, this.gLK.gLl.GUID);
        } else if (fly2.aO().equals(this.gLK.gLc) && this.gLK.gLl.dAy == null) {
            if (!fly2.iPs[0].equals(this.gLK.gLl.GUID)) {
                lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ObjectACurrencyItemGUID=" + this.gLK.gLl.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
                return;
            }
            if (fly2.dJh == null) {
                this.bok = mce.urY.bD(new Object[0]);
                this.gLO.b(this);
                return;
            }
            assert (fly2.dJh.length == 1);
            assert (fly2.dJh[0] != null);
            this.gLK.gLl.dAy = fly2.dJh[0];
            bqk bqk2 = this.gLO.bry().asf();
            if (bqk2 == null) {
                lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemLockResponse() TransactionRequestor inventory is null.");
                this.gLO.b(this);
                return;
            }
            brt brt2 = (brt)bqk2.iF(this.gLK.gLk.GUID);
            if (brt2 == null) {
                lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemLockResponse() Item " + this.gLK.gLk.GUID + " was not found.");
                this.gLO.b(this);
                return;
            }
            float f2 = cug.mr((int)brt2.az());
            if (f2 < 0.0f) {
                lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemLockResponse() UnitWeight was not found for resource '" + brt2.pa() + "'");
                this.gLO.b(this);
                return;
            }
            this.gLK.gLk.gLA = f2;
            if (this.gLK.gLk.asi > 1) {
                doa doa2 = this.gLK.gLk;
                int n = doa2.asi;
                if (cug.vQ((int)doa2.ResourceType)) {
                    n = 1;
                }
                this.a(this.gLK.gLf, this.gLK.gLg, 1, n, doa2.ResourceType, -1);
            } else {
                this.gLO.a(this);
            }
        } else {
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemLockResponse() Received message from unknown inventory: " + fly2.aO());
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemLockResponse() ObjectAInventoryGUID=" + this.gLK.gLc + " ObjectBInventoryGUID=" + this.gLK.gLf);
            this.gLO.b(this);
        }
    }

    private void a(fmh fmh2) {
        if (fmh2.iPT) {
            this.gLO.a(this);
        } else {
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleItemTransferCheckResponse() TransferCheck was not completed.");
            this.bok = mce.usN.bD(new Object[0]);
            this.gLO.b(this);
        }
    }

    private void c(fmu fmu2) {
        if (fmu2.bqd == null) {
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleQueryInfoResponse() ResourceTypes array is null.");
            return;
        }
        if (fmu2.iIY == null) {
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleQueryInfoResponse() Quantities array is null.");
            return;
        }
        if (fmu2.iQy) {
            this.bok = mce.uev.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        if (fmu2.iQz == null) {
            lfn.b(5, "SFSellToPlayerInfoAssembler", "handleQueryInfoResponse() ResourceQueryInfos array is null.");
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
        this.gLK.gLm = dnzArray;
        this.Z(this.gLK.gLc, this.gLK.gLk.GUID);
    }
}

