/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class sb
extends sm {
    private int aQL;
    private int aQM;

    public sb(md md2) {
        super(md2, me.axe);
    }

    public void w(int n, int n2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerChangeEventCharacterID", "setCharacterIDs: Can't modify while working");
            assert (false);
            return;
        }
        this.aQL = n;
        this.aQM = n2;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        this.ca(null);
    }

    @Override
    protected void sO() {
        if (this.aQL < 50000) {
            this.ca("Invalid old character ID");
            return;
        }
        if (this.aQM < 50000) {
            this.ca("Invalid new character ID");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("call changeCharacterID(").append(lcw.qGe).append(", ").append(lcw.qGf).append(", ");
        stringBuilder.append(this.aQL).append(", ").append(this.aQM).append(")");
        this.a(pw.aJE, stringBuilder.toString(), null);
    }

    @Override
    protected void sP() {
    }
}

