/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class sj
extends sm {
    protected long aCF = 0L;
    protected int aRc = 0;

    public sj(md md2) {
        super(md2, me.ayw);
    }

    @Override
    protected void sO() {
        String string = "SELECT COUNT(*) FROM " + nb.class.getAnnotation(mh.class).qC() + " WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND ItemID = " + this.aCF;
        this.a(pw.aJF, string, null);
    }

    @Override
    protected void sP() {
        this.aRc = 0;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0 || lmn2.euT().length == 0) {
            lfn.b(5, "SFPersistenceWorkerGetItemCountForId", "handleQueryResults() error executing query");
            this.ca("Could not get number of items for item id ");
            return;
        }
        this.aRc = (int)((lmm)lmn2.euT()[0].euV()[0]).getValue();
        this.ca(null);
    }

    public long si() {
        return this.aCF;
    }

    public void r(long l) {
        this.aCF = l;
    }

    public int getItemCount() {
        return this.aRc;
    }
}

