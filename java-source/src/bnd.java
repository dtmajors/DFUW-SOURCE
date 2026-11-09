/*
 * Decompiled with CFR.
 */
public class bnd
extends bne {
    private bne dvR;
    private bne dvS;

    public bnd(ldv ldv2) {
        super("Character", ldv2, ldv2, bqm.b.dEm, null, bqm.b.dEm);
    }

    public final bne arQ() {
        assert (this.Initialized);
        return this.dvR;
    }

    public final bne arR() {
        assert (this.Initialized);
        return this.dvS;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dvR = new bne("Backpack", this.MessageDelegator.bzv(), this.GUID, bqm.b.dEn, this.GUID, bqm.b.dEn);
        this.MessageDelegator.a(this.dvR);
        ldv ldv2 = this.MessageDelegator.bzv();
        this.dvS = new bne("Paperdoll", ldv2, ldv2, bqm.b.dEQ, this.GUID, bqm.b.dEQ);
        this.MessageDelegator.a(this.dvS);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2 instanceof flt) {
            this.a((flt)dxq2);
            return;
        }
        super.receiveMessage(dxq2);
    }

    private void a(flt flt2) {
        ldv ldv2 = flt2.aCK;
        if (ldv2 == this.getGUID()) {
            this.dvR.activate();
        } else if (ldv2 == this.dvS.getGUID()) {
            this.dvS.activate();
        } else assert (false);
    }
}

