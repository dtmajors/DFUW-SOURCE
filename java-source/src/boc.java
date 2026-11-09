/*
 * Decompiled with CFR.
 */
public class boc
extends bnr {
    private ldv dxn = null;
    private fky dxo = null;

    public boc() {
        super(false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7978: {
                this.a((flq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(fky fky2) {
        if (this.dxo != null) {
            return;
        }
        this.dxo = fky2;
        flp flp2 = (flp)this.MessageDelegator.h(7977, this.GUID, fky2.dxt);
        flp2.dxF = ((boj)this.dwJ).asp();
        this.MessageDelegator.F(flp2);
    }

    @Override
    protected void a(fkz fkz2) {
        if (fkz2.iPj) {
            this.a(mdd.uFo.bD(new Object[0]));
        } else {
            this.a(fkz2.Cw());
        }
    }

    @Override
    protected void setDefaultState() {
        super.setDefaultState();
        this.dxn = null;
        this.dxo = null;
    }

    private void a(flq flq2) {
        if (flq2.dJg == null) {
            return;
        }
        if (this.dxo == null) {
            return;
        }
        if (this.dxn == null) {
            this.dxn = ((boj)this.dwJ).id(this.GUID);
        }
        this.dxo.f(this.GUID);
        this.dxo.on(this.dxn);
        this.dxo.iPg = flq2.dJg;
        this.MessageDelegator.E(this.dxo);
        this.dxo = null;
    }
}

