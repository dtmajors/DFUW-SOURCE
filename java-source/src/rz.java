/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  gg
 *  lcr
 */
import java.util.List;

public class rz
extends qd {
    private sd aPd;
    private sd aPe;
    private sr aQw;

    public rz(md md2) {
        super(md2, me.axs);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQw = this.f(new sr(this, pe.class, false));
        this.aPd = this.f(new sd((md)this, "SaveSpecialEventsDataBegin"));
        this.aPe = this.f(new sd((md)this, "SaveSpecialEventsDataEnd"));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQw);
        this.e(this.aPd);
        this.e(this.aPe);
        this.aQw = null;
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
            gg gg2 = (gg)this.MessageDelegator.bzx().bzt().d(lcr.hac);
            List list = gg2.hW();
            if (list == null) {
                this.c(this.aQw);
                return;
            }
            this.aQw.e(list);
            this.aQw.start();
        } else if (qe2 == this.aQw) {
            this.aPe.start();
        } else if (qe2 == this.aPe) {
            this.ca(null);
        }
    }
}

