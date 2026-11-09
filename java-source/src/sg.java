/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.LinkedList;

public class sg
extends sm {
    private LinkedList<Integer> aPN;

    public sg(md md2) {
        super(md2, me.axf);
    }

    @Override
    protected void a(pv pv2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            this.ca("SQL Error " + lmn2.getErrorCode());
            return;
        }
        if (lmn2.euT().length == 0) {
            this.ca(null);
            return;
        }
        this.aPN = lcn.emA();
        for (int i = 0; i < lmn2.euT().length; ++i) {
            this.aPN.add(((lml)lmn2.euT()[i].euV()[1]).getValue());
        }
        this.ca(null);
    }

    @Override
    protected void sO() {
        int n = (int)((System.currentTimeMillis() - 86400000L * (long)pu.aJl) / 1000L);
        String string = "select darkfall.account_status.AccountID, df_persistence_read.pso.CharacterID FROM darkfall.account_status LEFT JOIN df_persistence_read.pso ON darkfall.account_status.AccountID = df_persistence_read.pso.AccountID WHERE df_persistence_read.pso.GameID=" + lcw.qGe + " AND df_persistence_read.pso.WorldID=" + lcw.qGf + " " + "AND darkfall.account_status.LastUpdate < FROM_UNIXTIME(" + n + ") " + "AND darkfall.account_status.Active = 0 " + "ORDER BY darkfall.account_status.LastUpdate ASC " + "LIMIT " + pu.aJk;
        this.a(pw.aJD, string, null);
    }

    @Override
    protected void sP() {
        this.aPN = null;
    }

    public final LinkedList<Integer> tP() {
        return this.aPN;
    }
}

