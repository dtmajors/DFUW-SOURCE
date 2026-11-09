/*
 * Decompiled with CFR.
 */
public class rj
extends qd {
    private nc aPE;
    private sq aPF;
    private sr aPG;
    private sr aMF;
    private sr aPH;
    private sr aPI;
    private sq aPJ;
    private sr aPK;
    private sr aPL;
    private String aMH;

    public rj(md md2) {
        super(md2, me.ayj);
    }

    public void d(nc nc2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerWriteCharacterOnlineData", "setStoredOnlineCharacterData: Can't modify while working");
            assert (false);
            return;
        }
        this.aPE = nc2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPF = this.f(new sq((md)this, nd.class));
        this.aPG = this.f(new sr(this, nh.class, false));
        this.aMF = this.f(new sr(this, nb.class, true));
        this.aPH = this.f(new sr(this, oh.class, false));
        this.aPI = this.f(new sr(this, ne.class, true));
        this.aPJ = this.f(new sq((md)this, nf.class));
        this.aPK = this.f(new sr(this, oo.class, true));
        this.aPL = this.f(new sr(this, ng.class, true));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPF);
        this.e(this.aPG);
        this.e(this.aMF);
        this.e(this.aPH);
        this.e(this.aPI);
        this.e(this.aPJ);
        this.e(this.aPK);
        this.e(this.aPL);
        this.aPF = null;
        this.aPG = null;
        this.aMF = null;
        this.aPH = null;
        this.aPI = null;
        this.aPJ = null;
        this.aPK = null;
        this.aPL = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPF.c(this.aPE.aCL);
        this.aPF.start();
        if (this.aPE.aCM != null && !this.aPE.aCM.isEmpty()) {
            this.aPG.e(this.aPE.aCM);
            this.aPG.start();
        }
        if (this.aPE.aCN != null && !this.aPE.aCM.isEmpty()) {
            this.aMF.e(this.aPE.aCN);
            this.aMF.start();
        }
        if (this.aPE.aCO != null && !this.aPE.aCO.isEmpty()) {
            this.aPH.e(this.aPE.aCO);
            this.aPH.start();
        }
        if (this.aPE.aCP != null && !this.aPE.aCP.isEmpty()) {
            this.aPI.e(this.aPE.aCP);
            this.aPI.start();
        }
        if (this.aPE.aCR != null) {
            this.aPJ.c(this.aPE.aCR);
            this.aPJ.start();
        }
        if (this.aPE.aCQ != null && !this.aPE.aCQ.isEmpty()) {
            this.aPK.e(this.aPE.aCQ);
            this.aPK.start();
        }
        if (this.aPE.aCS != null && !this.aPE.aCS.isEmpty()) {
            this.aPL.e(this.aPE.aCS);
            this.aPL.start();
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

