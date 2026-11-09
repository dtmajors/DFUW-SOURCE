/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;

public class rv
extends qd {
    private sd aPd;
    private sd aPe;
    private sr aQs;

    public rv(md md2) {
        super(md2, me.ayc);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQs = this.f(new sr(this, nv.class, false));
        this.aPd = this.f(new sd((md)this, "SaveCraftingOrdersBegin"));
        this.aPe = this.f(new sd((md)this, "SaveCraftingOrdersEnd"));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQs);
        this.aQs = null;
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
            kx kx2 = (kx)this.MessageDelegator.bzx().bzt().d(lcr.qEC);
            List<nv> list = kx2.oz();
            this.aQs.e(list);
            this.aQs.start();
        } else if (qe2 == this.aQs) {
            this.aPe.start();
        } else if (qe2 == this.aPe) {
            this.ca(null);
        }
    }
}

