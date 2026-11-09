/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bob
extends bnq {
    private ldv dxn = null;

    public bob() {
        super(false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11781: {
                this.a((fky)dxq2);
                break;
            }
            case 11782: {
                this.a((fkz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void setDefaultState() {
        super.setDefaultState();
        this.dxn = null;
    }

    private void a(fky fky2) {
        if (fky2.ims == null) {
            lfn.b(5, "SFInteractionLogicBarberClient", "handleTransactionRequest() LayerTypeOrdinals array is null.");
            return;
        }
        if (fky2.imt == null) {
            lfn.b(5, "SFInteractionLogicBarberClient", "handleTransactionRequest() ExtraTypes array is null.");
            return;
        }
        if (fky2.ims.length != fky2.imt.length) {
            lfn.b(5, "SFInteractionLogicBarberClient", "handleTransactionRequest() LayerTypeOrdinals array have different length than ExtraTypes array.");
            return;
        }
        if (this.dxn == null) {
            this.dxn = ((boj)this.dwJ).id(this.GUID);
        }
        fky2.f(this.GUID);
        fky2.on(this.dxn);
        this.MessageDelegator.E(fky2);
    }

    private void a(fkz fkz2) {
        if (fkz2.iPj) {
            this.a(mdd.uFt.bD(new Object[0]));
        } else {
            this.a(fkz2.Cw());
        }
        ghy ghy2 = (ghy)this.MessageDelegator.h(7688, this.GUID, lcr.acL);
        ghy2.ex = 2;
        ghy2.eei = null;
        this.MessageDelegator.F(ghy2);
    }
}

