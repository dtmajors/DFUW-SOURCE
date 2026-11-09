/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class si
extends sm {
    private int aMI;
    private int aFG;
    private int hB;
    private int aQY;
    private String FirstName;
    private String LastName;
    private String aQZ;
    private long aRa;
    private long aRb;

    public si(md md2) {
        super(md2, me.axg);
    }

    public void cW(int n) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerRestoreCharacter", "setupWorker: Can't modify while working");
            assert (false);
            return;
        }
        this.aMI = n;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        if (lmn2.euT().length != 1) {
            this.ca("Character " + this.aMI + " not found");
            return;
        }
        for (int i = 0; i < lmn2.euS().length; ++i) {
            String string = lmn2.euS()[i].getName();
            if (string.equals("CharacterState")) {
                this.aFG = ((lml)lmn2.euT()[0].euV()[i]).getValue();
                continue;
            }
            if (string.equals("AccountID")) {
                this.hB = ((lml)lmn2.euT()[0].euV()[i]).getValue();
                continue;
            }
            if (string.equals("FirstName")) {
                this.FirstName = ((lmp)lmn2.euT()[0].euV()[i]).getValue();
                continue;
            }
            if (string.equals("LastName")) {
                this.LastName = ((lmp)lmn2.euT()[0].euV()[i]).getValue();
                continue;
            }
            if (string.equals("DeletedUnixTime")) {
                this.aRa = ((lmm)lmn2.euT()[0].euV()[i]).getValue() * 1000L;
                continue;
            }
            if (string.equals("RestoreState")) {
                this.aQZ = ((lmp)lmn2.euT()[0].euV()[i]).getValue();
                continue;
            }
            if (string.equals("RestoredUnixTime")) {
                if (lmn2.euT()[0].euV()[i].euR()) {
                    this.aRb = 0L;
                    continue;
                }
                this.aRb = ((lmm)lmn2.euT()[0].euV()[i]).getValue() * 1000L;
                continue;
            }
            if (!string.equals("RestoredCharacterID")) continue;
            this.aQY = lmn2.euT()[0].euV()[i].euR() ? 0 : ((lml)lmn2.euT()[0].euV()[i]).getValue();
        }
        this.ca(null);
    }

    @Override
    protected void sO() {
        this.a(pw.aJH, "SELECT *, UNIX_TIMESTAMP(DeletedTS) as DeletedUnixTime, UNIX_TIMESTAMP(RestoredTS) as RestoredUnixTime FROM df_persistence_historic.pso WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND CharacterID=" + this.aMI, null);
    }

    @Override
    protected void sP() {
        this.aFG = 0;
        this.hB = 0;
        this.aQY = 0;
        this.FirstName = null;
        this.LastName = null;
        this.aQZ = null;
        this.aRa = 0L;
        this.aRb = 0L;
    }

    public final int tl() {
        return this.aMI;
    }

    public final int tS() {
        return this.aFG;
    }

    public final int aN() {
        return this.hB;
    }

    public final int tT() {
        return this.aQY;
    }

    public final String cz() {
        return this.FirstName;
    }

    public final String cA() {
        return this.LastName;
    }

    public final String tU() {
        return this.aQZ;
    }

    public final long tV() {
        return this.aRa;
    }

    public final long tW() {
        return this.aRb;
    }
}

