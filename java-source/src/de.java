/*
 * Decompiled with CFR.
 */
public class de
extends btk
implements bto {
    private ldz lO = null;
    private int lP = 0;
    private double lQ = 5.0;
    private ldv lR;

    @Override
    public void doTick(ldz ldz2) {
        if (this.lR != null) {
            if (this.lO == null) {
                this.lO = this.MessageDelegator.arc();
                this.cK();
                ++this.lP;
            } else if (this.lO.rgz + this.lQ <= this.MessageDelegator.arc().rgz) {
                this.lO = this.MessageDelegator.arc();
                this.cK();
                ++this.lP;
            }
        }
    }

    private void cK() {
        grm grm2 = (grm)this.MessageDelegator.h(11025, this.GUID, this.lR);
        grm2.aw(this.MessageDelegator.arc());
        this.MessageDelegator.F(grm2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 11026) {
            this.a((grp)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    private void a(grp grp2) {
        --this.lP;
    }

    public final ldv cL() {
        return this.lR;
    }

    public final void l(ldv ldv2) {
        this.lR = ldv2;
    }
}

