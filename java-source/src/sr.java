/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  qb
 */
import java.util.ArrayList;
import java.util.Collection;

public class sr
extends sm {
    private qb aQQ;
    private mb aQR;
    private ArrayList<na> aRv;
    private boolean aRw;
    private boolean aRx;
    private String aMH;

    public sr(md md2, Class<? extends na> clazz, boolean bl) {
        super(md2, me.awY);
        this.aRw = bl;
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

    public <T extends na> void e(Collection<T> collection) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerWriteStorableArray", "setStorables: Can't set storable while working");
            assert (false);
            return;
        }
        ArrayList<na> arrayList = lcn.abH(collection.size());
        for (na na2 : collection) {
            if (!na2.getClass().equals(this.aQQ.aLa)) {
                lfn.b(5, "SFPersistenceWorkerWriteStorableArray", "setStorables: Expected " + this.aQQ.aLa.getName() + " but got " + na2.getClass().getName());
                assert (false);
                return;
            }
            arrayList.add(na2);
        }
        this.aRv = arrayList;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerWriteStorableArray", "handleQueryResults: SQL Error " + lmn2.getErrorCode());
            if (this.aMH == null) {
                this.aMH = "SQL Error " + lmn2.getErrorCode();
            }
        }
        if (this.tZ() == 0) {
            this.ca(this.aMH);
        }
    }

    @Override
    protected void sO() {
        if (this.aQR != null) {
            this.ca(this.aQR.getMessage());
            return;
        }
        if (this.aRv.isEmpty()) {
            this.ca(null);
            return;
        }
        int n = this.aQQ.sL();
        for (int i = 0; i < this.aRv.size(); i += n) {
            String string = this.aRw ? this.aQQ.b(this.aRv, i, i + n) : this.aQQ.a(this.aRv, i, i + n);
            this.a(this.aRx ? pw.aJF : pw.aJG, string, null);
        }
    }

    public void ao(boolean bl) {
        this.aRx = bl;
    }

    @Override
    protected void sP() {
        this.aMH = null;
    }
}

