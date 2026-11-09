/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class sk
extends sm {
    private int di;
    private long aRd;
    private long aRe;
    private long aPz;

    public sk(md md2) {
        super(md2, me.awZ);
    }

    public void bN(int n) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerGetNextFreeItemIDOnServer", "setNodeID: Can't modify while working");
            assert (false);
            return;
        }
        this.di = n;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerGetNextFreeItemIDOnServer", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        if (lmn2.euT().length != 1) {
            lfn.b(5, "SFPersistenceWorkerGetNextFreeItemIDOnServer", "handleQueryResults: Unexpected number of rows " + lmn2.euT().length);
            this.ca("Unexpected result");
            return;
        }
        long l = -1L;
        lmi lmi2 = lmn2.euT()[0].euV()[0];
        if (lmi2.euR()) {
            l = this.aRd;
        } else {
            switch (lmi2.getType()) {
                case 0: 
                case 1: {
                    l = ((lml)lmi2).getValue();
                    break;
                }
                case 2: 
                case 3: {
                    l = ((lmm)lmi2).getValue();
                }
            }
        }
        if (l == -1L) {
            lfn.b(5, "SFPersistenceWorkerGetNextFreeItemIDOnServer", "handleQueryResults: Unexpected result " + lmi2);
            this.ca("Unexpected result " + lmi2);
            return;
        }
        if ((l = l - this.aRd + 1L) > this.aPz) {
            this.aPz = l;
        }
        if (this.tZ() == 0) {
            this.ca(null);
        }
    }

    @Override
    protected void sO() {
        this.aRd = mx.a(this.di, 0L);
        this.aRe = mx.a(this.di + 1, 0L);
        String string = "SELECT MAX(ItemID) FROM inventory WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND ItemID>=" + this.aRd + " AND ItemID<" + this.aRe;
        this.a(pw.aJF, string, null);
        string = "SELECT MAX(ItemID) FROM inventory WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND ItemID>=" + this.aRd + " AND ItemID<" + this.aRe;
        this.a(pw.aJH, string, null);
        string = "SELECT MAX(DatabasePersistentID)  FROM market_items  WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND DatabasePersistentID >= " + this.aRd + " AND DatabasePersistentID < " + this.aRe;
        this.a(pw.aJD, string, null);
    }

    @Override
    protected void sP() {
        this.aRe = -1L;
        this.aRd = -1L;
        this.aPz = -1L;
    }

    public final long tD() {
        return this.aPz;
    }
}

