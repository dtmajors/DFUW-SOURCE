/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;

public class sh
extends sm {
    private String aLb;
    private String aQU;
    private int di;
    private String aQV;
    private int aQW;
    private List<ldv> aQX;

    public sh(md md2) {
        super(md2, me.axa);
    }

    public void l(String string, String string2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerGetGUIDList", "setTableAndField: Can't modify while working");
            assert (false);
            return;
        }
        this.aLb = string;
        this.aQU = string2;
    }

    public void cV(int n) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerGetGUIDList", "setNodeIDFilter: Can't modify while working");
            assert (false);
            return;
        }
        this.di = n;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerGetGUIDList", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        if (lmn2.euT().length == 0) {
            this.ca(null);
            return;
        }
        for (int i = 0; i < lmn2.euT().length; ++i) {
            String string = ((lmp)lmn2.euT()[i].euV()[0]).getValue();
            ldv ldv2 = ldv.zp(string);
            if (ldv2 == null) {
                lfn.b(5, "SFPersistenceWorkerGetGUIDList", "handleQueryResults: Couldn't parse '" + string + "'");
                this.ca("Unparsable result");
                return;
            }
            this.aQX.add(ldv2);
        }
        if (lmn2.euT().length < 2000) {
            this.ca(null);
            return;
        }
        this.aQW += 2000;
        this.tQ();
    }

    @Override
    protected void sO() {
        this.aQW = 0;
        this.aQX = lcn.emA();
        this.aQV = "SELECT " + this.aQU + " FROM " + this.aLb + " WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf;
        if (this.di > 0) {
            this.aQV = this.aQV + " AND " + this.aQU + " LIKE '" + this.di + ".%'";
        }
        this.aQV = this.aQV + " ORDER BY " + this.aQU + " ASC";
        this.tQ();
    }

    @Override
    protected void sP() {
        this.aQV = null;
        this.aQW = 0;
        this.aQX = null;
    }

    private void tQ() {
        String string = this.aQV + " LIMIT " + this.aQW + ", " + (this.aQW + 2000);
        this.a(pw.aJF, string, null);
    }

    public final List<ldv> tR() {
        return this.aQX;
    }
}

