/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class atj
extends btk
implements bto {
    private boolean fE = true;
    private atl bYo = new atl();
    private atm bYp = new atm();
    private atn bYq = new atn();

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.bYo != null) {
            this.MessageDelegator.hd(this.bYo.getGUID());
        }
        if (this.bYp != null) {
            this.MessageDelegator.hd(this.bYp.getGUID());
        }
        if (this.bYq != null) {
            this.MessageDelegator.hd(this.bYq.getGUID());
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            this.fE = false;
            this.Vh();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2576: {
                this.a((fex)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void Vg() {
        atk atk2 = new atk();
        fex fex2 = (fex)this.MessageDelegator.h(2576, this.getGUID(), lcr.acL);
        fex2.iKH = atk2;
        this.MessageDelegator.F(fex2);
    }

    private void a(fex fex2) {
        if (fex2.iKH == null) {
            return;
        }
        atk atk2 = fex2.iKH;
        this.bYo.a(atk2);
        this.bYp.a(atk2);
        this.bYq.a(atk2);
    }

    private void Vh() {
        this.bYo.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.bYo);
        this.bYp.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.bYp);
        this.bYq.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.bYq);
    }
}

