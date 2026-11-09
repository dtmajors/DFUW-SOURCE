/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class st
extends qe {
    private String aDq;

    public st(md md2) {
        super(md2, me.ayr);
    }

    public void cc(String string) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCreateOneCity", "setCityFilename: Can't modify while working");
            assert (false);
            return;
        }
        this.aDq = string;
    }

    @Override
    protected void sO() {
        jwj jwj2 = new jwj();
        axs axs2 = jwj2.uJ(this.aDq);
        if (axs2 == null) {
            this.ca("Could not load and parse " + this.aDq);
            return;
        }
        for (axq axq2 : axs2.YG()) {
            axq2.Yi();
        }
        eix eix2 = (eix)this.MessageDelegator.h(18689, this.getGUID(), lcr.qCn);
        eix2.d(axs2);
        this.MessageDelegator.E(eix2);
        this.ca(null);
    }

    @Override
    protected void sP() {
    }
}

