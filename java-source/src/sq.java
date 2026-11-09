/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  qb
 */
public class sq
extends sm {
    private qb aQQ;
    private mb aQR;
    private na aRn;

    public sq(md md2, Class<? extends na> clazz) {
        super(md2, me.awW);
        try {
            this.aQQ = new qb(clazz);
        }
        catch (mb mb2) {
            this.aQR = mb2;
        }
    }

    @Override
    public String toString() {
        if (this.aQQ == null) {
            return super.toString() + " No Class, Error=" + this.aQR;
        }
        return super.toString() + " Class=" + this.aQQ.aLa.getSimpleName();
    }

    public void c(na na2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerWriteStorable", "setStorable: Can't set storable while working");
            assert (false);
            return;
        }
        if (na2 == null) {
            lfn.b(5, "SFPersistenceWorkerWriteStorable", "setStorable: Can't set a null storable");
            assert (false);
            return;
        }
        if (this.aQQ != null && !na2.getClass().equals(this.aQQ.aLa)) {
            lfn.b(5, "SFPersistenceWorkerWriteStorable", "setStorable: Expected " + this.aQQ.aLa.getName() + " but got " + na2.getClass().getName());
            assert (false);
            return;
        }
        this.aRn = na2;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerWriteStorable", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
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
        String string = this.aQQ.b(this.aRn);
        this.a(pw.aJG, string, null);
    }

    @Override
    protected void sP() {
    }
}

