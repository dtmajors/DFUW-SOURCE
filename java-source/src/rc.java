/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 */
public class rc
extends qd {
    private ldv ade;
    private ss aOK;
    private sd aOR;
    private qf aOS;
    private sq aOT;
    private sr aOU;
    private sr aOV;
    private sr aOW;
    private sr aOX;
    private sr aOY;
    private sr aOZ;
    private sr aPa;
    private nm aPb;
    private String aMH;
    private boolean aPc;

    public rc(md md2) {
        super(md2, me.axV);
    }

    public final void ch(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSaveOneClan", "setClanGUID: Can't modify while working.");
            assert (false);
            return;
        }
        this.ade = ldv2;
    }

    public final ldv iG() {
        return this.ade;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aOK = this.f(new ss(this));
        this.aOR = this.f(new sd((md)this, "ProcClearClanTables"));
        this.aOS = this.f(new qf(this));
        this.aOT = this.f(new sq((md)this, nn.class));
        this.aOU = this.f(new sr(this, no.class, false));
        this.aOV = this.f(new sr(this, nr.class, false));
        this.aOW = this.f(new sr(this, ns.class, false));
        this.aOX = this.f(new sr(this, nb.class, true));
        this.aOY = this.f(new sr(this, nt.class, false));
        this.aOZ = this.f(new sr(this, np.class, false));
        this.aPa = this.f(new sr(this, nq.class, false));
    }

    @Override
    public void cleanUp() {
        this.e(this.aOK);
        this.e(this.aOR);
        this.e(this.aOS);
        this.e(this.aOT);
        this.e(this.aOU);
        this.e(this.aOV);
        this.e(this.aOW);
        this.e(this.aOX);
        this.e(this.aOY);
        this.e(this.aOZ);
        this.e(this.aPa);
        this.aOK = null;
        this.aOR = null;
        this.aOS = null;
        this.aOT = null;
        this.aOU = null;
        this.aOV = null;
        this.aOW = null;
        this.aOX = null;
        this.aOY = null;
        this.aOZ = null;
        this.aPa = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.ade);
        if (amf2 == null || !(amf2 instanceof ayd)) {
            lfn.b(5, "SFPersistenceWorkerSaveOneClan", "startWork: Object " + this.ade + " is not a clan");
            assert (false);
            this.ca("Object isn't a clan");
            return;
        }
        ayd ayd2 = (ayd)amf2;
        this.aPb = ayd2.ZP();
        if (this.aPb == null) {
            lfn.b(4, "SFPersistenceWorkerSaveOneClan", "startWork() : Clan " + this.ade + " (" + ayd2.iV() + ") Returned null PersistenceData.");
            this.ca(null);
            return;
        }
        this.aOK.F(this.aPb.aCN);
        this.aOK.start();
    }

    @Override
    protected void sP() {
        this.aPb = null;
        this.aMH = null;
        this.aPc = false;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aOK) {
            this.aPc = false;
            this.aOR.g(this.ade);
            this.aOR.start();
        } else if (qe2 == this.aOR) {
            if (!this.aPc) {
                if (this.aPb.aCN != null && !this.aPb.aCN.isEmpty()) {
                    this.aOX.e(this.aPb.aCN);
                    this.aOX.start();
                }
                if (this.aPb.aDB != null && !this.aPb.aDB.isEmpty()) {
                    this.aOW.e(this.aPb.aDB);
                    this.aOW.start();
                }
                if (this.aPb.aDA != null && !this.aPb.aDA.isEmpty()) {
                    this.aOV.e(this.aPb.aDA);
                    this.aOV.start();
                }
                if (this.aPb.aDz != null && !this.aPb.aDz.isEmpty()) {
                    this.aOU.e(this.aPb.aDz);
                    this.aOU.start();
                }
                if (this.aPb.aDC != null && !this.aPb.aDC.isEmpty()) {
                    this.aOY.e(this.aPb.aDC);
                    this.aOY.start();
                }
                if (this.aPb.aDD != null && !this.aPb.aDD.isEmpty()) {
                    this.aOZ.e(this.aPb.aDD);
                    this.aOZ.start();
                }
                if (this.aPb.aDE != null && !this.aPb.aDE.isEmpty()) {
                    this.aPa.e(this.aPb.aDE);
                    this.aPa.start();
                }
                this.aOT.c(this.aPb.aDy);
                this.aOT.start();
            }
        } else if (qe2 == this.aOS) {
            this.aPc = true;
            this.aOR.g(this.ade);
            this.aOR.start();
        } else if (this.su() == 0 && this.aMH == null) {
            this.aOS.a(pu.aJz, this.ade);
            this.aOS.start();
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }
}

