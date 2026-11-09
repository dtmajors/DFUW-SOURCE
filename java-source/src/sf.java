/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class sf
extends sm {
    private int aBH;

    public sf(md md2) {
        super(md2, me.axx);
    }

    @Override
    protected void sO() {
        String string = "SELECT MAX(CharacterID) FROM pso WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf;
        this.a(pw.aJH, string, null);
    }

    @Override
    protected void sP() {
        this.aBH = -1;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerDetermineNextHistoricID", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        this.aBH = lmn2.euT()[0].euV()[0].euR() ? 1000000 : ((lml)lmn2.euT()[0].euV()[0]).getValue() + 1;
        if (this.aBH < 1000000) {
            this.aBH = 1000000;
        }
        this.ca(null);
    }

    public final int tN() {
        return this.aBH;
    }
}

