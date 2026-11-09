/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
import java.sql.Timestamp;
import java.util.Map;

public class dwc
extends btk {
    private int dAS = 0;
    private dvh hfD = null;
    private final Map<Integer, gnh> hii = lcn.emw();

    public dwc(dvh dvh2) {
        this.hfD = dvh2;
    }

    public boolean r(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3588: 
            case 3589: 
            case 3590: 
            case 3591: 
            case 3604: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 3589: {
                this.a((gnk)dxq2);
                break;
            }
            case 3588: {
                this.a((gmr)dxq2);
                break;
            }
            case 3590: {
                this.a((gnj)dxq2);
                break;
            }
            case 3591: {
                this.a((gnm)dxq2);
                break;
            }
            case 3604: {
                this.a((gnl)dxq2);
                break;
            }
            case 11034: {
                if (((gre)dxq2).bWR() != 12811) break;
                gnh gnh2 = this.hii.remove(((gre)dxq2).bWS());
                lfn.b(5, this.getClass().getName(), "receiveMessage() : " + gnh2.getClass() + " Failed");
                assert (false);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
                return;
            }
        }
    }

    private void y(ldv ldv2, int n2) {
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.GUID, ldv2);
        eef2.sk(n2);
        eef2.jM(true);
        this.MessageDelegator.F(eef2);
    }

    private void a(eeg eeg2) {
        gnh gnh2 = this.hii.remove(eeg2.aVk());
        if (gnh2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleCharacterNamedPropertiesResponseMessage() : No requesting message found for received response message!!!... Response = " + eeg2);
            assert (false);
            return;
        }
        switch (gnh2.bEz()) {
            case 3589: {
                this.a((gnk)gnh2, eeg2);
                break;
            }
            case 3588: {
                this.a((gmr)gnh2, eeg2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleCharacterNamedPropertiesResponseMessage() : Unhandled request message type encountered!!!... Message = " + gnh2);
                assert (false);
                return;
            }
        }
    }

    private void a(gnk gnk2) {
        this.hii.put(this.dAS, gnk2);
        this.y(gnk2.ijo, this.dAS++);
    }

    private void a(gnk gnk2, eeg eeg2) {
        if (gnk2.jne.enw() == gnk2.ijo.enw()) {
            String string = dwd.a(gnk2.jne.enw(), new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gnk2.jnk);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsPlayerKillMessage() : Failed to generate an SQL statement for player suicide!!!... Message = " + gnk2);
                assert (false);
                return;
            }
            this.hfD.a(new dvz(string));
        } else {
            String string = dwd.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gnk2.jne.enw(), cg.s(gnk2.jmX), cg.r(gnk2.jmX), gnk2.jnh, lea.enZ().getName(gnk2.jmW), gnk2.ijo.enw(), cg.s(gnk2.jnd), cg.r(gnk2.jnd), eeg2.iV(), gnk2.jnk);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsPlayerKillMessage() : Failed to generate an SQL stored procedure call to update PvP tables!!!... Message = " + gnk2);
                assert (false);
                return;
            }
            this.hfD.a(new dvz(string));
        }
    }

    private void a(gmr gmr2) {
        this.hii.put(this.dAS, gmr2);
        this.y(gmr2.dvC, this.dAS++);
    }

    private void a(gmr gmr2, eeg eeg2) {
        String string = dwd.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gmr2.jmd.enw(), gmr2.jmh, gmr2.dvC.enw(), eeg2.iV(), gmr2.aZD, gmr2.jmc);
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsGankReviveMessage() : Failed to generate an SQL stored procedure call to update player gank/revive tables!!!... Message = " + gmr2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
        if (gmr2.jmg == null || !gmr2.jmg.equals(gmr2.jmj) || gmr2.jmc) {
            return;
        }
        string = dwd.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gmr2.jmg, gmr2.jmd.enw(), gmr2.dvC.enw());
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsGankReviveMessage() : Failed to generate an SQL stored procedure call to update clan member revive tables!!!... Message = " + gmr2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gnj gnj2) {
        if (gnj2.ijo.enw() == gnj2.ijj.enw()) {
            String string = dwd.a(gnj2.ijj.enw(), new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gnj2.jmY);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsPlayerDiedMessage() : Failed to generate an SQL statement for player suicide!!!... Message = " + gnj2);
                assert (false);
                return;
            }
            this.hfD.a(new dvz(string));
        } else {
            String string = dwd.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gnj2.ijj, lea.enW().getName(gnj2.jmX), lea.enZ().getName(gnj2.jmW), gnj2.ijo.enw(), gnj2.hmz, gnj2.jmY);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsPlayerDiedMessage() : Failed to generate an SQL stored procedure call for monster killed player!!!... Message = " + gnj2);
                assert (false);
                return;
            }
            this.hfD.a(new dvz(string));
        }
    }

    private void a(gnm gnm2) {
        String string = null;
        boolean bl = lea.enW().isDescendant(gnm2.jnd, cug.fgG);
        if (bl) {
            string = dwd.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gnm2.ijj.enw(), lea.enZ().getName(gnm2.jmW), lea.enW().getName(gnm2.jnd), gnm2.jnk, cug.uM((int)gnm2.jnd));
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsResourceKillMessage() : Failed to generate an SQL statement for monster kill message!!!... Message = " + gnm2);
                assert (false);
                return;
            }
        } else {
            String string2 = null;
            string2 = lea.enW().isDescendant(gnm2.jnd, cug.fnw) ? lea.enW().getName(cug.fnw) : (lea.enW().isDescendant(gnm2.jnd, cug.fpm) ? lea.enW().getName(cug.fpm) : (lea.enW().isDescendant(gnm2.jnd, cug.fnO) ? lea.enW().getName(cug.fnO) : (lea.enW().isDescendant(gnm2.jnd, cug.fnD) ? lea.enW().getName(cug.fnD) : (lea.enW().isDescendant(gnm2.jnd, cug.fst) ? lea.enW().getName(cug.fst) : (lea.enW().isDescendant(gnm2.jnd, cug.fss) ? lea.enW().getName(cug.fss) : "NotInGroup")))));
            string = dwd.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gnm2.ijj.enw(), lea.enZ().getName(gnm2.jmW), string2, lea.enW().getName(gnm2.jnd), cug.uL((int)gnm2.jnd), gnm2.jnk, dvg.Cz(gnm2.jnd));
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsResourceKillMessage() : Failed to generate an SQL stored procedure call for resource destroyed!!!... Message = " + gnm2);
                assert (false);
                return;
            }
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gnl gnl2) {
        int n2 = gnl2.bWH();
        int n3 = gnl2.qe();
        int n4 = gnl2.bWI();
        int n5 = gnl2.aNM();
        String string = dvx.aD(new Timestamp(gnl2.getStartTime()).toString());
        String string2 = null;
        switch (n2) {
            case 0: {
                string2 = "Insert Into player_pvp_duels(GameID,WorldID,CharacterID,TargetCharacterID,StartTime,DuelFee)  Values (" + lcw.qGe + "," + lcw.qGf + "," + n3 + "," + n4 + "," + string + "," + n5 + ")";
                break;
            }
            case 1: {
                String string3 = dvx.aD(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()).toString());
                String string4 = "\"" + cfy.pN(gnl2.getReason()) + "\"";
                int n6 = gnl2.getReason() == 3 ? 0 : gnl2.bWJ();
                string2 = "Update player_pvp_duels Set WinnerCharacterID = " + n6 + ", EndTime = " + string3 + ", Reason = " + string4 + " Where GameID = " + lcw.qGe + " And WorldID = " + lcw.qGf + " And CharacterID = " + n3 + " And TargetCharacterID = " + n4 + " And StartTime = " + string;
                break;
            }
            default: {
                assert (false) : "DuelState : " + n2;
                return;
            }
        }
        this.hfD.a(new dvz(string2));
    }
}

