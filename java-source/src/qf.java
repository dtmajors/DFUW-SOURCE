/*
 * Decompiled with CFR.
 */
public class qf
extends qd {
    private String[] aMz;
    private ldv Rs;
    private int aMA;
    private sc aMB;

    public qf(md md2) {
        super(md2, me.ayn);
    }

    public void a(String[] stringArray, ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCallProcSeries", "setupWorker: Can't modify while working");
            assert (false);
            return;
        }
        this.aMz = stringArray;
        this.Rs = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aMB = this.f(new sc(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aMB);
        this.aMB = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aMA = 0;
        this.sT();
    }

    @Override
    protected void sP() {
    }

    private void sT() {
        if (this.aMA >= this.aMz.length) {
            this.ca(null);
            return;
        }
        this.aMB.a(this.aMz[this.aMA], this.Rs);
        this.aMB.start();
        ++this.aMA;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
        } else {
            this.sT();
        }
    }
}

