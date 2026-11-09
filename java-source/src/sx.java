/*
 * Decompiled with CFR.
 */
public class sx
extends qe {
    private ldv ade = null;
    private px aMY = null;

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public px uk() {
        return this.aMY;
    }

    public void a(px px2) {
        this.aMY = px2;
    }

    public sx(md md2) {
        super(md2, me.ayu);
    }

    @Override
    protected void sO() {
        if (this.ade == null) {
            this.ca("Clan GUID is null!!!");
            return;
        }
        if (this.aMY == null) {
            this.ca("Current Operation is null!!!");
            return;
        }
        switch (this.aMY) {
            case aJT: {
                this.ul();
                break;
            }
            case aJU: {
                this.um();
                break;
            }
            case aJV: {
                this.un();
                break;
            }
            default: {
                this.ca("Invalid Clan Conquest Load Operation : " + (Object)((Object)this.aMY));
                return;
            }
        }
    }

    @Override
    protected void sP() {
    }

    private void ul() {
        this.MessageDelegator.F(this.MessageDelegator.h(7201, this.GUID, this.ade));
    }

    private void um() {
        this.MessageDelegator.F(this.MessageDelegator.h(7203, this.GUID, this.ade));
    }

    private void un() {
        this.MessageDelegator.F(this.MessageDelegator.h(7205, this.GUID, this.ade));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7202: {
                this.a((fzo)dxq2);
                break;
            }
            case 7204: {
                this.a((fyy)dxq2);
                break;
            }
            case 7206: {
                this.a((fyq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fzo fzo2) {
        this.ca(fzo2.vA() ? null : "Clan Challenge Restore Request for [" + this.ade.fk() + "] Failed!");
    }

    private void a(fyy fyy2) {
        this.ca(fyy2.vA() ? null : "Clan Challenge Link Request for [" + this.ade.fk() + "] Failed!");
    }

    private void a(fyq fyq2) {
        this.ca(fyq2.vA() ? null : "Clan Challenge Finalise Request for [" + this.ade.fk() + "] Failed!");
    }
}

