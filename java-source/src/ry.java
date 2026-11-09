/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class ry
extends qd {
    private sd aPd;
    private sd aPe;
    private sr aQv;

    public ry(md md2) {
        super(md2, me.axv);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQv = this.f(new sr(this, oz.class, false));
        this.aPd = this.f(new sd((md)this, "SaveSlotMachinesBegin"));
        this.aPe = this.f(new sd((md)this, "SaveSlotMachinesEnd"));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQv);
        this.e(this.aPd);
        this.e(this.aPe);
        this.aQv = null;
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
            dee dee2 = (dee)this.MessageDelegator.bzx().bzt().d(lcr.qEs);
            oy oy2 = dee2.bkA();
            this.aQv.e(oy2.aGu);
            this.aQv.start();
        } else if (qe2 == this.aQv) {
            this.aPe.start();
        } else if (qe2 == this.aPe) {
            this.ca(null);
        }
    }
}

