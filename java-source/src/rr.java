/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  gg
 *  lcr
 */
import java.util.ArrayList;

public class rr
extends qd {
    private so aQb;

    public rr(md md2) {
        super(md2, me.axr);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQb = this.f(new so((md)this, oj.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQb);
        this.aQb = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aQb.start();
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
        } else {
            gg gg2 = (gg)this.MessageDelegator.bzx().bzt().d(lcr.hac);
            ArrayList arrayList = lcn.emv();
            this.aQb.d(arrayList);
            gg2.u(arrayList);
            this.ca(null);
        }
    }

    @Override
    protected void sP() {
    }
}

