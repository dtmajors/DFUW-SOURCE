/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class ccq
extends cco {
    private bwc elc = new bwc(false);
    protected bwa eld = null;
    private fuj ele = null;

    public ccq() {
        super(false);
    }

    @Override
    public void cleanUp() {
        this.elc.cleanUp();
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

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1038: {
                this.a((fuj)dxq2);
                break;
            }
            case 1045: {
                this.a((fuk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void d(et et2, float f2) {
        if (et2.getType() == 352) {
            this.g(et2);
        }
        super.d(et2, f2);
    }

    private void g(et et2) {
        float f2 = this.fi().ai(352);
        this.elc.b(et2, f2);
    }

    @Override
    protected void aIw() {
        super.aIw();
        assert (this.elb != null);
        if (this.elb != null && !this.elb.GB().isEmpty()) {
            this.elc.setMessageDelegator(this.MessageDelegator);
            this.elc.d(this.aAG());
            this.elc.f("AttachPoint_Structure Damage 01", 20, this.elb.GB().get(0));
            et et2 = this.fi().ah(352);
            if (et2 != null) {
                float f2 = this.fi().ai(352);
                this.elc.b(et2, f2);
            }
        }
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

    private void a(fuk fuk2) {
        if (this.elL == null) {
            return;
        }
        this.elL.e(fuk2.iWZ, fuk2.oV);
    }

    public void b(eq eq2, boolean bl) {
        super.b(eq2, bl);
        if (eq2.getType() == 1408 && this.elL != null) {
            this.elL.fw(eq2.getBooleanValue());
        }
    }

    private void b(fuj fuj2) {
        assert (this.aAG() != null);
        assert (this.elb != null);
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        if (fuj2.goo.y > fuj2.gon.y) {
            boolean bl = ResourceTree.isDescendant(this.az(), cug.fwx);
            n = this.elb.GF();
            n2 = this.elb.GI();
            n3 = !bl ? this.elb.GD() : -1;
            n4 = this.elb.GJ();
        } else {
            n = this.elb.GE();
            n2 = this.elb.GH();
            n3 = this.elb.GM();
            n4 = this.elb.GK();
        }
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
        this.eld.a(n, n2, n3, n4);
        this.eld.a("AttachPoint_Structure Spawn 01", 20, "AttachPoint_Structure Big Spawn 01", 10);
        this.eld.initialize();
    }
}

