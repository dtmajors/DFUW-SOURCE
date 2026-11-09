/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class rs
extends qd {
    private so aQc;

    public rs(md md2) {
        super(md2, me.axu);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQc = this.f(new so((md)this, oz.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQc);
        this.aQc = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aQc.h(null);
        this.aQc.start();
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
            dee dee2 = (dee)this.MessageDelegator.bzx().bzt().d(lcr.qEs);
            oy oy2 = new oy();
            oy2.aGu = lcn.emA();
            this.aQc.d(oy2.aGu);
            dee2.a(oy2);
            this.ca(null);
        }
    }
}

