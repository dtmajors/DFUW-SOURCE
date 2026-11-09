/*
 * Decompiled with CFR.
 */
public class cdk
extends ccy {
    private bea enA = null;

    public cdk(cdw cdw2) {
        super(cdw2);
    }

    @Override
    public final void oW(int n) {
    }

    @Override
    public final void aGx() {
        if (((cdh)this.aeg).aJI()) {
            this.emw = this.enA;
        }
    }

    @Override
    public final void h(lgj lgj2) {
        fsj fsj2 = (fsj)this.MessageDelegator.h(20483, this.GUID, this.aeg.getServerGUID());
        fsj2.dTY = lgj2;
        this.MessageDelegator.E(fsj2);
    }

    @Override
    protected final void aJs() {
        assert (this.emv == null);
        assert (this.enA == null);
        this.enA = new bea(this.aeg);
        this.enA.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enA);
        this.emw = this.enA;
        this.enA.amv();
    }

    @Override
    protected final void aJt() {
        if (this.enA.amP()) {
            this.enA.amK();
        }
        this.MessageDelegator.hd(this.enA.getGUID());
    }
}

