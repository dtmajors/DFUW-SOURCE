/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Set;

public class ta
extends sm {
    public final int aAB;
    private Set<Integer> aRE = null;

    public ta(md md2, int n) {
        super(md2, me.axC);
        this.aAB = n;
    }

    @Override
    public String toString() {
        return super.toString() + " ServerIndex=" + this.aAB;
    }

    @Override
    protected void sO() {
        int n = 50000 + this.aAB * 10000;
        int n2 = n + 10000;
        String string = "SELECT CharacterID FROM " + ol.class.getAnnotation(mh.class).qC() + " WHERE GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND CharacterID>=" + n + " AND CharacterID<" + n2 + " ORDER BY CharacterID ASC";
        this.aRE = lcn.emH();
        this.a(pw.aJF, string, null);
    }

    @Override
    protected void sP() {
        this.aRE = null;
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, "SFPersistenceWorkerGetCharacterListOnServer", "handleQueryResults: Error " + lmn2.getErrorCode());
            this.ca("Could not get character ID list from DB");
            return;
        }
        if (this.aRE == null || !this.aRE.isEmpty()) {
            lfn.b(5, "SFPersistenceWorkerGetCharacterListOnServer", "handleQueryResults: Got query results in unexpected state");
            this.ca("Internal error");
            return;
        }
        for (int i = 0; i < lmn2.euT().length; ++i) {
            int n = ((lml)lmn2.euT()[i].euV()[0]).getValue();
            this.aRE.add(n);
        }
        this.ca(null);
    }

    public final Set<Integer> up() {
        return this.aRE;
    }
}

