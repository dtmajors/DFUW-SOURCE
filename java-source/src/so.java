/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  qb
 */
import java.util.Collection;
import java.util.List;

public class so
extends sm {
    private qb aQQ;
    private mb aQR;
    private Object aRm;
    private List<na> aRp;
    private String aLc;
    private int aRq;

    public so(md md2, Class<? extends na> clazz) {
        this(md2, clazz, null);
    }

    public so(md md2, Class<? extends na> clazz, String string) {
        super(md2, me.awX);
        try {
            this.aQQ = new qb(clazz, this.aLc);
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
            lfn.b(5, "SFPersistenceWorkerReadStorableArray", "setKeyValue: Can't set key value while working");
            assert (false);
            return;
        }
        this.aRm = object;
    }

    public final Object uc() {
        return this.aRm;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerReadStorableArray", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        if (this.aRp == null) {
            this.aRp = lcn.emA();
        }
        try {
            this.aQQ.a(lmn2, this.aRp);
        }
        catch (mb mb2) {
            lfn.b(5, "SFPersistenceWorkerReadStorableArray", "handleQueryResults: " + mb2.getMessage());
            this.ca(mb2.getMessage());
            return;
        }
        if (lmn2.euT().length < this.aQQ.sL()) {
            this.ca(null);
            return;
        }
        this.aRq += this.aQQ.sL();
        this.cZ(this.aRq);
    }

    @Override
    protected void sO() {
        if (this.aQR != null) {
            this.ca(this.aQR.getMessage());
            return;
        }
        this.aRq = 0;
        this.cZ(this.aRq);
    }

    private void cZ(int n) {
        String string = this.aQQ.f(this.aRm);
        string = string + " LIMIT " + n + "," + this.aQQ.sL();
        this.a(pw.aJF, string, null);
    }

    @Override
    protected void sP() {
        this.aRp = null;
        this.aRq = 0;
    }

    public final <T extends na> void d(Collection<T> collection) {
        if (this.aRp == null) {
            return;
        }
        if (this.aRp.isEmpty()) {
            return;
        }
        for (na na2 : this.aRp) {
            collection.add(na2);
        }
    }

    public final List<na> ud() {
        return this.aRp;
    }
}

