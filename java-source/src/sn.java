/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  qb
 */
public class sn
extends sm {
    private qb aQQ;
    private mb aQR;
    private Object aRm;
    private na aRn;
    private boolean aRo;

    public sn(md md2, Class<? extends na> clazz) {
        this(md2, clazz, null);
    }

    public sn(md md2, Class<? extends na> clazz, String string) {
        super(md2, me.awV);
        try {
            this.aQQ = new qb(clazz, string);
        }
        catch (mb mb2) {
            this.aQR = mb2;
        }
    }

    @Override
    public String toString() {
        if (this.aQQ == null) {
            return super.toString() + " KeyValue=" + this.aRm + " No Class, Error=" + this.aQR;
        }
        return super.toString() + " KeyValue=" + this.aRm + " Class=" + this.aQQ.aLa.getSimpleName();
    }

    public final void h(Object object) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerReadStorable", "setKeyValue: Can't set key value while working");
            assert (false);
            return;
        }
        this.aRm = object;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerReadStorable", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        try {
            this.aRn = this.aQQ.a(lmn2);
            if (this.aRn == null && !this.aRo) {
                this.ca("Object not found");
            } else {
                this.ca(null);
            }
        }
        catch (mb mb2) {
            lfn.b(5, "SFPersistenceWorkerReadStorable", "handleQueryResults: " + mb2.getMessage());
            this.ca(mb2.getMessage());
        }
    }

    @Override
    protected void sO() {
        if (this.aQR != null) {
            this.ca(this.aQR.getMessage());
            return;
        }
        String string = this.aQQ.f(this.aRm);
        this.a(pw.aJF, string, null);
    }

    @Override
    protected void sP() {
        this.aRn = null;
    }

    public final na ub() {
        return this.aRn;
    }

    public void an(boolean bl) {
        this.aRo = bl;
    }
}

