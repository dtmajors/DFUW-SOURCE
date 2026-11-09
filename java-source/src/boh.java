/*
 * Decompiled with CFR.
 */
public class boh
extends bnv {
    private ldv dxn = null;
    private ldv dxA;
    private boolean dxB;

    public boh() {
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
        if (fky2.SkillType <= 0) {
            lfn.b(5, "SFInteractionLogicSkillExtensionClient", "handleTransactionRequest() SkillType is invalid.");
            return;
        }
        if (fky2.imo < 0) {
            lfn.b(5, "SFInteractionLogicSkillExtensionClient", "handleTransactionRequest() ExtensionTypeOrdinal is invalid.");
            return;
        }
        if (this.dxn == null) {
            this.dxn = ((boj)this.dwJ).id(this.GUID);
        }
        this.dxA = fky2.aO();
        this.dxB = fky2.cZn == 5;
        fky2.f(this.GUID);
        fky2.on(this.dxn);
        this.MessageDelegator.E(fky2);
    }

    private void a(fkz fkz2) {
        if (this.dxB) {
            if (fkz2.iPj) {
                this.a(mdd.uFv.bD(new Object[0]));
            } else {
                this.a(fkz2.Cw());
            }
        } else if (fkz2.iPj) {
            this.a(mdd.uFq.bD(new Object[0]));
        } else {
            this.a(fkz2.Cw());
        }
        if (this.dxA != null) {
            fkz2.f(this.getGUID());
            fkz2.on(this.dxA);
            this.MessageDelegator.E(fkz2);
            this.dxA = null;
        }
    }
}

