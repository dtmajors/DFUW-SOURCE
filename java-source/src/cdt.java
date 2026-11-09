/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class cdt
extends cdw
implements bzz {
    protected final bym enL;

    public cdt(boolean bl) {
        super(bl);
        this.ObjectType = 112;
        this.enL = this.dwG ? new byo((cdv)this) : new byn((cdu)this);
    }

    public final bym aKt() {
        return this.enL;
    }

    public abstract caq aKu();

    public abstract void a(caq var1);

    public final void addRelation(dul dul2) {
        if (dul2 == null) {
            return;
        }
        if (dul2.Bq().equals(this.GUID) && dul2.Br().equals(this.GUID)) {
            return;
        }
        switch (dul2.getRelationType()) {
            case 1034: {
                amf amf2 = this.MessageDelegator.d(dul2.Br());
                if (amf2 == null) {
                    return;
                }
                if (!(amf2 instanceof caq)) {
                    return;
                }
                if (this.aKu() == null) {
                    this.a((caq)amf2);
                    this.aKu().a(this);
                    break;
                }
                if (this.aKu().getGUID().equals(amf2.getGUID())) {
                    return;
                }
                this.a((caq)amf2);
                this.aKu().a(this);
                break;
            }
            default: {
                super.addRelation(dul2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.enL.doTick(ldz2);
    }

    public final byx aJD() {
        return this.enL;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.enL.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enL);
    }

    public final void removeRelation(dul dul2) {
        if (dul2 == null) {
            return;
        }
        if (dul2.Bq().equals(this.GUID) && dul2.Br().equals(this.GUID)) {
            return;
        }
        switch (dul2.getRelationType()) {
            case 1034: {
                if (this.aKu() == null) {
                    return;
                }
                if (!this.aKu().getGUID().equals(dul2.Br())) {
                    return;
                }
                this.a((caq)null);
                break;
            }
            default: {
                super.removeRelation(dul2);
            }
        }
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.enL.setActive(false);
        this.MessageDelegator.hd(this.enL.getGUID());
    }

    @Override
    public final void i(boolean bl, boolean bl2) {
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        cdt cdt2 = (cdt)cbx2;
        this.enL.b(cdt2.aJD());
    }

    public void fH(boolean bl) {
        this.fF(bl);
    }

    public void aKi() {
        this.aJS();
    }

    public void aKj() {
        this.aJU();
    }

    public void aKk() {
        this.aJV();
    }
}

