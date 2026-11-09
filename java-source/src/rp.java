/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;

public class rp
extends qd {
    private so aPZ;

    public rp(md md2) {
        super(md2, me.ayd);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPZ = this.f(new so((md)this, nv.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPZ);
        this.aPZ = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPZ.start();
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
        } else {
            kx kx2 = (kx)this.MessageDelegator.bzx().bzt().d(lcr.qEC);
            ArrayList<nv> arrayList = lcn.emv();
            this.aPZ.d(arrayList);
            kx2.A(arrayList);
            this.ca(null);
        }
    }

    @Override
    protected void sP() {
    }
}

