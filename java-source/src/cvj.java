/*
 * Decompiled with CFR.
 */
public abstract class cvj
extends btk
implements bto {
    protected cvk.a bqu = null;
    protected ldv Xe = null;
    protected ldv fzI = null;

    public cvj(cvk.a a2) {
        this.ObjectType = 31;
        this.bqu = a2;
    }

    public final cvk.a Do() {
        return this.bqu;
    }

    public final ldv mq() {
        return this.Xe;
    }

    public final void aX(ldv ldv2) {
        this.Xe = ldv2;
    }

    public final ldv bcw() {
        return this.fzI;
    }

    public final void lQ(ldv ldv2) {
        this.fzI = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.bcx();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 515: {
                this.a((ghr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected final void Dq() {
        ghq ghq2 = (ghq)this.MessageDelegator.h(520, this.GUID, this.Xe);
        this.MessageDelegator.F(ghq2);
    }

    private void a(ghr ghr2) {
        assert (this.Xe != null);
        if (ghr2.iBr) {
            ghs ghs2 = (ghs)this.MessageDelegator.h(516, this.GUID, this.Xe);
            this.MessageDelegator.F(ghs2);
        }
        this.Active = false;
        this.MessageDelegator.hd(this.GUID);
    }

    private void bcx() {
        assert (this.Xe != null);
        assert (this.fzI != null);
        ghj ghj2 = (ghj)this.MessageDelegator.h(514, this.GUID, this.Xe);
        ghj2.jhz = this.bqu.ordinal();
        ghj2.fzI = this.fzI;
        ghj2.Ud = this.GUID;
        this.MessageDelegator.F(ghj2);
    }
}

