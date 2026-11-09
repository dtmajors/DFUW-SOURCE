/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  lcr
 */
public abstract class ccz
extends ccx
implements bto {
    private boolean emx = true;

    public ccz(cdb cdb2) {
        super(cdb2);
    }

    public void fD(boolean bl) {
        this.emx = bl;
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20483: {
                this.a((fsj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected abstract void a(fsj var1);

    protected final void a(ldv ldv2, lgj lgj2) {
        assert (ldv2 != null);
        assert (lgj2 != null);
        ldv ldv3 = lcr.qAI;
        if (ldv2.ib() != this.GUID.ib()) {
            ldv3 = lcr.ak((ldv)lcr.qAI, (int)ldv2.ib());
        }
        gyl gyl2 = (gyl)this.MessageDelegator.h(12041, ldv2, ldv3);
        gyl2.ija = 4;
        gyl2.dTY = lgj2;
        this.MessageDelegator.F(gyl2);
    }

    private void fE(boolean bl) {
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.ts(this.GUID);
        kmj2.hC(this.aeg.aAG().axa());
        kmj2.Zf(1);
        kmj2.aO(bl);
        this.MessageDelegator.a(kmj2);
    }
}

