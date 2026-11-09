/*
 * Decompiled with CFR.
 */
public class ri
extends qd {
    private oc aOa;
    private sq aPA;
    private sr aPB;
    private sr aPC;
    private sr aPD;
    private String aMH;

    public ri(md md2) {
        super(md2, me.ayk);
    }

    public void e(oc oc2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerWriteCharacterOfflineData", "setPersistenceDataPSO: Can't modify while working");
            assert (false);
            return;
        }
        this.aOa = oc2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPA = this.f(new sq((md)this, ol.class));
        this.aPB = this.f(new sr(this, od.class, false));
        this.aPC = this.f(new sr(this, og.class, false));
        this.aPD = this.f(new sr(this, ok.class, false));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPA);
        this.e(this.aPB);
        this.e(this.aPC);
        this.e(this.aPD);
        this.aPA = null;
        this.aPB = null;
        this.aPC = null;
        this.aPD = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPA.c(this.aOa.aFl);
        this.aPA.start();
        if (this.aOa.aFm != null && !this.aOa.aFm.isEmpty()) {
            this.aPB.e(this.aOa.aFm);
            this.aPB.start();
        }
        if (this.aOa.aFn != null && !this.aOa.aFn.isEmpty()) {
            this.aPC.e(this.aOa.aFn);
            this.aPC.start();
        }
        if (this.aOa.Zo != null && !this.aOa.Zo.isEmpty()) {
            this.aPD.e(this.aOa.Zo);
            this.aPD.start();
        }
    }

    @Override
    protected void sP() {
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS() && this.aMH == null) {
            this.aMH = qe2.getErrorMessage();
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }
}

