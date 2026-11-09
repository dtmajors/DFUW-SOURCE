/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  qb
 */
public class se
extends sm {
    private qb aQQ;
    private mb aQR;
    private Object aQS;
    private Object aQT;

    public se(md md2, Class<? extends na> clazz, String string) {
        super(md2, me.axd);
        try {
            this.aQQ = new qb(clazz, string);
        }
        catch (mb mb2) {
            this.aQR = mb2;
        }
    }

    public final void b(Object object, Object object2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCopyToHistoric", "setKeyValues: Can't modify while working");
            assert (false);
            return;
        }
        this.aQS = object;
        this.aQT = object2;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerCopyToHistoric", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        this.ca(null);
    }

    @Override
    protected void sO() {
        if (this.aQR != null) {
            this.ca(this.aQR.getMessage());
            return;
        }
        String string = this.aQQ.a(this.aQS, this.aQT);
        this.a(pw.aJH, string, null);
    }

    @Override
    protected void sP() {
    }
}

