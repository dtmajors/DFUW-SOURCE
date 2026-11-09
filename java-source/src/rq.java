/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class rq
extends qd {
    private so aQa;

    public rq(md md2) {
        super(md2, me.axo);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQa = this.f(new so((md)this, nz.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQa);
        this.aQa = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aQa.h(null);
        this.aQa.start();
    }

    @Override
    protected void sP() {
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
        } else {
            cti cti2 = (cti)this.MessageDelegator.bzx().bzt().d(lcr.qBb);
            ny ny2 = new ny();
            ny2.aDA = lcn.emA();
            this.aQa.d(ny2.aDA);
            cti2.a(ny2);
            this.ca(null);
        }
    }
}

