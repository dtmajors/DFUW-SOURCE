/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class rw
extends qd {
    private sd aPd;
    private sd aPe;
    private sr aQt;

    public rw(md md2) {
        super(md2, me.axp);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQt = this.f(new sr(this, nz.class, false));
        this.aPd = this.f(new sd((md)this, "SaveGlobalLootBegin"));
        this.aPe = this.f(new sd((md)this, "SaveGlobalLootEnd"));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQt);
        this.e(this.aPd);
        this.e(this.aPe);
        this.aQt = null;
        this.aPd = null;
        this.aPe = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPd.start();
    }

    @Override
    protected void sP() {
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
        } else if (qe2 == this.aPd) {
            cti cti2 = (cti)this.MessageDelegator.bzx().bzt().d(lcr.qBb);
            ny ny2 = cti2.bbA();
            this.aQt.e(ny2.aDA);
            this.aQt.start();
        } else if (qe2 == this.aQt) {
            this.aPe.start();
        } else if (qe2 == this.aPe) {
            this.ca(null);
        }
    }
}

