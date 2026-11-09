/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.sql.Timestamp;
import java.util.Set;

public class dvi
extends btk
implements dwb {
    private dvh hfD = null;

    public dvi(dvh dvh2) {
        this.hfD = dvh2;
    }

    public boolean r(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3597: 
            case 3600: 
            case 3602: 
            case 20001: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3597: {
                this.a((gmc)dxq2);
                break;
            }
            case 3602: {
                this.a((gmg)dxq2);
                break;
            }
            case 20001: {
                this.a((etm)dxq2);
                break;
            }
            case 3600: {
                assert (false) : "Not handled anymore";
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(dvv dvv2) {
        dvp[] dvpArray;
        lfn.b(2, "ConquestHistoryLog", "====================================================================================================");
        lfn.b(2, "ConquestHistoryLog", "Conquest History for: " + dvv2.bCm());
        lfn.b(2, "ConquestHistoryLog", "----------------------------------------------------------------------------------------------------");
        int n = 0;
        for (dvp dvp2 : dvpArray = dvv2.bCk()) {
            dvp2.a("ConquestHistoryLog", true, "    ");
            if (n < dvpArray.length - 1) {
                lfn.b(2, "ConquestHistoryLog", "------------------------------------------------------------------------------------------------");
            }
            ++n;
        }
        lfn.b(2, "ConquestHistoryLog", "====================================================================================================");
    }

    private void a(gmc gmc2) {
        String string;
        long l2 = gmc2.jln;
        ldv ldv2 = gmc2.jlp;
        String string2 = "'" + gmc2.jlq + "'";
        int n = gmc2.jlr;
        if (!dxl.b.isValidOrdinal(n)) {
            assert (false) : "Invalid Status:" + n;
            return;
        }
        ldv ldv3 = gmc2.aDk;
        String string3 = dvx.aD(gmc2.bhD);
        ldv ldv4 = gmc2.aEs;
        String string4 = "'" + gmc2.cGO + "'";
        ldv ldv5 = gmc2.jlo;
        switch (dxl.b.getValueByOrdinal(n)) {
            case hnH: {
                String string5 = "'" + new Timestamp(this.getMessageDelegator().bzy().getTimeInMillis()) + "'";
                int n2 = dxl.b.hnI.ordinal();
                string = "Update clan_challenge_history Set AttackerChallengeStatus=" + n + "," + "DefenderChallengeStatus=" + n2 + "," + "EndTimeStamp=" + string5 + " Where GameID=" + lcw.qGe + " And WorldID=" + lcw.qGf + " And AttackerClanGUID=" + dvx.aD(ldv2.fk()) + " And AttackerClanName=" + string2 + " And DefenderClanGUID=" + dvx.aD(ldv4.fk()) + " And DefenderClanName=" + string4 + " And ObjectGUID=" + ldv3.eny() + " And ChallengeID=" + l2;
                break;
            }
            case hnI: {
                String string6 = "'" + new Timestamp(this.getMessageDelegator().bzy().getTimeInMillis()) + "'";
                int n3 = dxl.b.hnH.ordinal();
                string = "Update clan_challenge_history Set AttackerChallengeStatus=" + n + "," + "DefenderChallengeStatus=" + n3 + "," + "EndTimeStamp=" + string6 + " Where GameID=" + lcw.qGe + " And WorldID=" + lcw.qGf + " And AttackerClanGUID=" + dvx.aD(ldv2.fk()) + " And AttackerClanName=" + string2 + " And DefenderClanGUID=" + dvx.aD(ldv4.fk()) + " And DefenderClanName=" + string4 + " And ObjectGUID=" + ldv3.eny() + " And ChallengeID=" + l2;
                break;
            }
            case hnJ: 
            case hnK: {
                String string7 = "'" + new Timestamp(this.getMessageDelegator().bzy().getTimeInMillis()) + "'";
                int n4 = n;
                string = "Update clan_challenge_history Set AttackerChallengeStatus=" + n + "," + "DefenderChallengeStatus=" + n4 + "," + "EndTimeStamp=" + string7 + " Where GameID=" + lcw.qGe + " And WorldID=" + lcw.qGf + " And AttackerClanGUID=" + dvx.aD(ldv2.fk()) + " And AttackerClanName=" + string2 + " And DefenderClanGUID=" + dvx.aD(ldv4.fk()) + " And DefenderClanName=" + string4 + " And ObjectGUID=" + ldv3.eny() + " And ChallengeID=" + l2;
                break;
            }
            case hnG: {
                int n5 = n;
                String string8 = "'" + new Timestamp(this.getMessageDelegator().bzy().getTimeInMillis()) + "'";
                string = "Insert into clan_challenge_history(ChallengeID,GameID,WorldID,AttackerClanGUID,AttackerClanName,DefenderClanGUID,DefenderClanName,ObjectGUID,ObjectName,CharacterID,AttackerChallengeStatus,DefenderChallengeStatus,TimeStamp) VALUES(" + l2 + "," + lcw.qGe + "," + lcw.qGf + "," + ldv2.eny() + "," + string2 + "," + dvx.aD(ldv4.fk()) + "," + string4 + "," + ldv3.eny() + "," + string3 + "," + ldv5.eny() + "," + n + "," + n5 + "," + string8 + ")" + " ON DUPLICATE KEY UPDATE AttackerChallengeStatus=" + n + ", DefenderChallengeStatus=" + n5;
                break;
            }
            default: {
                return;
            }
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gmg gmg2) {
        switch (gmg2.bHc()) {
            case 0: {
                String string = dvl.a(gmg2.adE(), gmg2.adF(), gmg2.bLJ(), gmg2.bLw(), gmg2.bVW());
                if (string == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : CHALLENGE_START : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz(string));
                break;
            }
            case 1: {
                String string = dvl.a(gmg2.adE(), gmg2.bLw(), gmg2.bVY().afr(), gmg2.bVY().afs(), gmg2.bVY().aid(), gmg2.bVY().adB(), gmg2.bVY().bBD(), gmg2.bVY().Dl(), gmg2.bVY().adA());
                if (string == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : ATTACKER_JOINED : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz(string));
                break;
            }
            case 2: {
                String string = dvl.a(gmg2.adE(), gmg2.bLw(), gmg2.bVY().afr(), gmg2.bVZ().bVS(), gmg2.bVZ().bVT(), gmg2.bVZ().bVU());
                if (string == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : ATTACKER_SIEGE_STONE_PLACED : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz(string));
                break;
            }
            case 3: {
                String string = dvl.a(gmg2.adE(), gmg2.bLw(), gmg2.bVY().afr(), gmg2.bVZ().bVT(), gmg2.bVZ().bBP(), gmg2.bVZ().bBQ(), gmg2.bVZ().bBR());
                if (string == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : ATTACKER_SIEGE_STONE_DESTROYED : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz(string));
                break;
            }
            case 4: {
                String string = dvl.a(gmg2.adE(), gmg2.bLw(), gmg2.bVY().afr(), gmg2.bVY().bVR());
                if (string == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : ATTACKER_REMOVED : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz(string));
                break;
            }
            case 5: {
                String string = dvl.a(gmg2.adE(), gmg2.bLw(), gmg2.bVY().afr(), gmg2.bVY().bVR(), gmg2.bVY().bBH());
                if (string == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : ATTACKER_WON : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz(string));
                break;
            }
            case 7: {
                String string = dvl.a(gmg2.adE(), gmg2.bLw(), gmg2.bWa().afM(), gmg2.bWa().afN(), gmg2.bWa().bCc(), gmg2.bWa().bCd(), gmg2.bWa().afP(), gmg2.bWa().afO());
                if (string == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : MERCENARY_JOINED : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz(string));
                break;
            }
            case 8: {
                String string = dvl.b(gmg2.adE(), gmg2.bLw(), gmg2.bWa().afM(), gmg2.bWa().bVV());
                if (string == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : MERCENARY_REMOVED : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz(string));
                break;
            }
            case 6: {
                Object object;
                Object object2;
                Set<ldv> set = lcn.emx();
                if (gmg2.bWb() != null && gmg2.bWb().length > 0) {
                    object2 = gmg2.bWb();
                    int n = ((bge[])object2).length;
                    for (int i = 0; i < n; ++i) {
                        bge bge2 = object2[i];
                        object = "";
                        String string = "";
                        String string2 = "";
                        int n2 = -1;
                        bgd[] bgdArray = bge2.aoy();
                        for (int j = 0; j < bgdArray.length; ++j) {
                            set.add(bgdArray[j].getGUID());
                            object = (String)object + (((String)object).isEmpty() ? "" : ":") + Long.toString(bgdArray[j].getGUID().enw());
                            string = string + (string.isEmpty() ? "" : ":") + bgdArray[j].getName();
                            string2 = string2 + (string2.isEmpty() ? "" : ":") + Integer.toString((int)bgdArray[j].aou());
                            if (!bgdArray[j].aov()) continue;
                            n2 = j;
                        }
                        String string3 = dvl.a(gmg2.adE(), gmg2.bLw(), bge2.getGUID(), bge2.getName(), (String)object, string, string2, n2);
                        if (string3 == null) {
                            lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : CHALLENGE_END : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                            assert (false);
                            return;
                        }
                        this.hfD.a(new dvz(string3));
                    }
                }
                if (gmg2.bWc() != null && gmg2.bWc().length > 0) {
                    object2 = "";
                    String string = "";
                    String string4 = "";
                    int n = -1;
                    object = gmg2.bWc();
                    for (int i = 0; i < ((bgd[])object).length; ++i) {
                        if (set.contains(object[i].getGUID())) continue;
                        object2 = (String)object2 + (((String)object2).isEmpty() ? "" : ":") + Long.toString(object[i].getGUID().enw());
                        string = string + (string.isEmpty() ? "" : ":") + ((bgd)object[i]).getName();
                        string4 = string4 + (string4.isEmpty() ? "" : ":") + Integer.toString((int)((bgd)object[i]).aou());
                        if (!((bgd)object[i]).aov()) continue;
                        n = i;
                    }
                    if (!(((String)object2).isEmpty() || string.isEmpty() || string4.isEmpty())) {
                        String string5 = dvl.a(gmg2.adE(), gmg2.bLw(), (String)object2, string, string4, n);
                        if (string5 == null) {
                            lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : CHALLENGE_END : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                            assert (false);
                            return;
                        }
                        this.hfD.a(new dvz(string5));
                    }
                }
                if ((object2 = dvl.a(gmg2.adE(), gmg2.bLw(), gmg2.bVX())) == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanChallengeMessage() : CHALLENGE_END : Failed to generate an SQL statement for received update message!!!... Message = " + gmg2);
                    assert (false);
                    return;
                }
                this.hfD.a(new dvz((String)object2));
                break;
            }
        }
    }

    private void a(etm etm2) {
        dvv dvv2 = null;
        if (etm2.acm() != null) {
            dvv2 = new dvv(dvv.a.hhO, etm2.acm(), etm2.bBW());
        } else if (etm2.iG() != null) {
            dvv2 = new dvv(dvv.a.hhP, etm2.iG(), etm2.iV());
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestLogHistoryMessage() : No City OR Clan GUID contained in message, no query sent to database!");
            return;
        }
        dvv2.a(this);
        this.hfD.a(dvv2);
    }

    @Override
    public void b(dvy dvy2) {
        lfn.b(5, this.getClass().getSimpleName(), "workFailed() : Database worker failed to complete its work!!!... Worker = " + dvy2);
        assert (false);
    }

    @Override
    public void c(dvy dvy2) {
        if (dvy2 instanceof dvv) {
            this.a((dvv)dvy2);
        }
    }
}

