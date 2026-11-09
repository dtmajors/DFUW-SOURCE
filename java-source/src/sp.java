/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class sp
extends sm {
    private int aMI;
    private String aRr;
    private String aRs;
    private int aRt;
    private String aRu;

    public sp(md md2) {
        super(md2, me.axh);
    }

    public void a(int n, String string, String string2, int n2, String string3) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSetHistoricCharacterRestoreState", "setupWorker: Can't modify while working");
            assert (false);
            return;
        }
        this.aMI = n;
        this.aRr = string;
        this.aRs = string2;
        this.aRt = n2;
        this.aRu = string3;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        if (lmn2.euU() == 1) {
            this.ca(null);
            return;
        }
        this.ca("RestoreState could not be changed");
    }

    @Override
    protected void sO() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE df_persistence_historic.pso SET RestoreState='").append(this.aRs).append("'");
        if (this.aRt > 0) {
            stringBuilder.append(", RestoredTS=NOW(), RestoredCharacterID=").append(this.aRt);
        }
        stringBuilder.append(", RestoreErrorMessage=").append(pz.e(this.aRu));
        stringBuilder.append(" WHERE GameID=").append(lcw.qGe);
        stringBuilder.append(" AND WorldID=").append(lcw.qGf);
        stringBuilder.append(" AND CharacterID=").append(this.aMI);
        if (this.aRr != null) {
            stringBuilder.append(" AND RestoreState='").append(this.aRr).append("'");
        }
        String string = stringBuilder.toString();
        this.a(pw.aJH, string, null);
    }

    @Override
    protected void sP() {
    }

    public final int tl() {
        return this.aMI;
    }

    public final String ue() {
        return this.aRr;
    }

    public final String uf() {
        return this.aRs;
    }
}

