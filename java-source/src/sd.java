/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.LinkedList;
import java.util.List;

public class sd
extends sm {
    private List<Object> aQO;
    private final String aQN;
    private pw aQP = pw.aJG;

    public sd(md md2, String string) {
        super(md2, me.axb);
        this.aQN = string;
    }

    @Override
    public String toString() {
        return super.toString() + " ProcedureName=" + this.aQN;
    }

    public void a(Iterable<Object> iterable) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCallStoredProcedure", "setParameterList: Can't modify while working");
            assert (false);
            return;
        }
        this.aQO = new LinkedList<Object>();
        for (Object object : iterable) {
            this.aQO.add(object);
        }
    }

    public void g(Object object) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCallStoredProcedure", "setParameter: Can't modify while working");
            assert (false);
            return;
        }
        this.aQO = new LinkedList<Object>();
        this.aQO.add(object);
    }

    public void a(pw pw2) {
        this.aQP = pw2;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerCallStoredProcedure", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        this.ca(null);
    }

    @Override
    protected void sO() {
        String string = null;
        if (this.aQO == null) {
            string = "CALL " + this.aQN + "(" + lcw.qGe + "," + lcw.qGf + ")";
        } else {
            string = "CALL " + this.aQN + "(" + lcw.qGe + "," + lcw.qGf;
            for (Object object : this.aQO) {
                string = string + ", " + pz.e(object);
            }
            string = string + ")";
        }
        this.a(this.aQP, string, null);
    }

    @Override
    protected void sP() {
    }
}

