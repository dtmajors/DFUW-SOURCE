/*
 * Decompiled with CFR.
 */
public class boi
extends bnw {
    private ldv dxn = null;
    private boolean dxC = false;

    public boi() {
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
        if (this.dxC) {
            return;
        }
        if (fky2.YN == null) {
            return;
        }
        if (fky2.aCK == null) {
            return;
        }
        if (this.dxn == null) {
            this.dxn = ((boj)this.dwJ).id(this.GUID);
        }
        fky2.f(this.GUID);
        fky2.on(this.dxn);
        this.MessageDelegator.E(fky2);
        this.dxC = true;
    }

    private void a(fkz fkz2) {
        this.dxC = false;
        if (fkz2.iPj) {
            this.a(mdd.uFp.bD(new Object[0]));
        } else {
            this.a(fkz2.Cw());
        }
    }
}

