/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class cdq
extends cdw {
    protected final byj enI;

    public cdq(boolean bl) {
        super(bl);
        this.ObjectType = 111;
        this.enI = this.dwG ? new byl((cds)this) : new byk((cdr)this);
    }

    public final byj aKs() {
        return this.enI;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.enI.doTick(ldz2);
    }

    public final byx aJD() {
        return this.enI;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.enI.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enI);
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.enI.setActive(false);
        this.MessageDelegator.hd(this.enI.getGUID());
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        cdq cdq2 = (cdq)cbx2;
        this.enI.b(cdq2.aJD());
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

