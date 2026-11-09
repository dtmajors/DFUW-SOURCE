/*
 * Decompiled with CFR.
 */
public class rh
extends qd {
    private sk aPx;
    private int aPy;
    private long aPz;

    public rh(md md2) {
        super(md2, me.axG);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPx = this.f(new sk(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPx);
        this.aPx = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPy = 0;
        this.aPx.bN(this.getGUID().ib());
        this.aPx.start();
    }

    @Override
    protected void sP() {
        this.aPz = -1L;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
            return;
        }
        if (qe2 == this.aPx) {
            this.aPz = this.aPx.tD();
        } else assert (false);
        this.ca(null);
    }

    public final long tD() {
        return this.aPz;
    }
}

