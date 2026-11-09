/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  gg
 *  lcr
 */
import java.util.ArrayList;

public class rt
extends qd {
    private so aQd;

    public rt(md md2) {
        super(md2, me.axt);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQd = this.f(new so((md)this, pe.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQd);
        this.aQd = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aQd.start();
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
        } else {
            gg gg2 = (gg)this.MessageDelegator.bzx().bzt().d(lcr.hac);
            ArrayList arrayList = lcn.emv();
            this.aQd.d(arrayList);
            gg2.v(arrayList);
            this.ca(null);
        }
    }

    @Override
    protected void sP() {
    }
}

