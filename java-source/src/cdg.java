/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class cdg
extends cdw {
    protected final bxp enf;

    public cdg(boolean bl) {
        super(bl);
        this.ObjectType = 125;
        this.enf = this.dwG ? new bxr((cdi)this) : new bxq((cdh)this);
    }

    public final bxp aKh() {
        return this.enf;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.enf.doTick(ldz2);
    }

    public final byx aJD() {
        return this.enf;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.enf.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enf);
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.enf.setActive(false);
        this.MessageDelegator.hd(this.enf.getGUID());
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        cdg cdg2 = (cdg)cbx2;
        this.enf.b(cdg2.aJD());
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

