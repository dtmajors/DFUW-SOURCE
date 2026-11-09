/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class sc
extends sm {
    private String aQN;
    private ldv Rs;

    public sc(md md2) {
        super(md2, me.axc);
    }

    public void a(String string, ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCallObjectProcedure", "setupWorker: Can't modify while working");
            assert (false);
            return;
        }
        this.aQN = string;
        this.Rs = ldv2;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerCallObjectProcedure", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        this.ca(null);
    }

    @Override
    protected void sO() {
        String string = null;
        string = "CALL " + this.aQN + "(" + lcw.qGe + "," + lcw.qGf + "," + pz.e(this.Rs.fk()) + ")";
        this.a(pw.aJG, string, null);
    }

    @Override
    protected void sP() {
    }

    public final String tO() {
        return this.aQN;
    }

    public final ldv oq() {
        return this.Rs;
    }
}

