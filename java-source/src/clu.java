/*
 * Decompiled with CFR.
 */
public class clu
extends clt
implements bto {
    private bwa eld = null;
    private fuj ele = null;
    private ldv eJN = null;

    public clu() {
        super(false);
    }

    public void cleanUp() {
        if (this.eld != null) {
            this.eld.cleanUp();
        }
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.eld != null) {
            this.eld.doTick(ldz2);
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1038: {
                this.a((fuj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void d(et et2, float f) {
        super.d(et2, f);
    }

    protected void aIw() {
        super.aIw();
        if (this.ele != null) {
            this.b(this.ele);
            this.ele = null;
        }
    }

    private void a(fuj fuj2) {
        if (this.aAG() == null) {
            this.ele = fuj2;
            return;
        }
        this.b(fuj2);
    }

    private void b(fuj fuj2) {
        assert (this.aAG() != null);
        if (this.eld != null) {
            this.eld.cleanUp();
        }
        this.eld = new bwa();
        this.eld.setServerObject(false);
        this.eld.eL(false);
        this.eld.d(this.aAG());
        this.eld.setMessageDelegator(this.MessageDelegator);
        this.eld.bf(fuj2.eKm);
        this.eld.bc(fuj2.gon);
        this.eld.l(fuj2.iWX);
        this.eld.bd(fuj2.goo);
        this.eld.m(fuj2.iWY);
        this.eld.o(fuj2.oV);
        this.eld.initialize();
    }
}

