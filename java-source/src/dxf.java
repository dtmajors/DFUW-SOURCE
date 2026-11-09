/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  lcw
 */
import java.sql.Timestamp;

public class dxf
extends btk {
    private dvh hfD = null;

    public dxf(dvh dvh2) {
        this.hfD = dvh2;
    }

    public boolean r(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3605: 
            case 3606: 
            case 35083: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3605: {
                this.a((gng)dxq2);
                break;
            }
            case 3606: {
                this.a((gmo)dxq2);
                break;
            }
            case 35083: {
                this.a((gfg)dxq2);
            }
        }
    }

    private void a(gng gng2) {
        int n2 = gng2.getState();
        int n3 = gng2.bWD();
        int n4 = gng2.bWE();
        String string = dvx.aD(new Timestamp(gng2.getStartTime()).toString());
        String string2 = null;
        switch (n2) {
            case 0: {
                float f2 = gng2.bWF();
                string2 = "Insert Into mentoring_log(GameID,WorldID,MentorCharacterID,ApprenticeCharacterID,StartTimestamp,StartProwessPoints)  Values (" + lcw.qGe + "," + lcw.qGf + "," + n3 + "," + n4 + "," + string + "," + f2 + ")";
                break;
            }
            case 1: {
                float f3 = gng2.bWG();
                String string3 = "\"" + (Object)((Object)ls.a.getValueByOrdinal(gng2.getReason())) + "\"";
                string2 = "Update mentoring_log Set EndProwessPoints = " + f3 + ", Reason = " + string3 + " Where GameID = " + lcw.qGe + " And WorldID = " + lcw.qGf + " And MentorCharacterID = " + n3 + " And ApprenticeCharacterID = " + n4 + " And StartTimestamp = " + string;
                break;
            }
            case 2: {
                float f4 = gng2.bWG();
                float f5 = gng2.pV();
                String string4 = "\"" + (Object)((Object)ls.a.getValueByOrdinal(gng2.getReason())) + "\"";
                String string5 = gng2.bRn() != null ? "'" + gng2.bRn() + "'" : "''";
                String string6 = dvx.aD(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()).toString());
                string2 = "Update mentoring_log Set EndProwessPoints = " + f4 + ", EndTimestamp = " + string6 + ", Rating = " + f5 + ", Reason = " + string4 + ", Feedback = " + string5 + " Where GameID = " + lcw.qGe + " And WorldID = " + lcw.qGf + " And MentorCharacterID = " + n3 + " And ApprenticeCharacterID = " + n4 + " And StartTimestamp = " + string;
                break;
            }
            default: {
                assert (false) : "State : " + n2;
                return;
            }
        }
        this.hfD.a(new dvz(string2));
    }

    private void a(gmo gmo2) {
        int n2;
        int n3;
        int n4;
        int n5 = gmo2.aO().enw();
        int[] nArray = gmo2.bUE();
        int[] nArray2 = gmo2.bUF();
        int[] nArray3 = gmo2.bUI();
        int[] nArray4 = gmo2.bUJ();
        StringBuffer stringBuffer = new StringBuffer("\"");
        if (nArray != null && nArray.length > 0) {
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                n4 = nArray[i2];
                String string = lea.enZ().getName(n4);
                if (string == null) {
                    assert (false) : "Invalid skill type : " + n4;
                    continue;
                }
                stringBuffer.append(string + "|");
            }
            stringBuffer.setLength(stringBuffer.length() - 1);
        }
        stringBuffer.append("\"");
        StringBuffer stringBuffer2 = new StringBuffer("\"");
        if (nArray2 != null && nArray2.length > 0) {
            for (n4 = 0; n4 < nArray2.length; ++n4) {
                int n6 = nArray2[n4];
                ckk ckk2 = lea.epw().ro(n6);
                if (ckk2 == null) {
                    assert (false) : "Invalid booster index : " + n6;
                    continue;
                }
                stringBuffer2.append(ckk2.getName() + "|");
            }
            stringBuffer2.setLength(stringBuffer2.length() - 1);
        }
        stringBuffer2.append("\"");
        if (nArray3 == null || nArray3.length != 4 || nArray4 == null || nArray4.length != 4) {
            assert (false) : "ArmorAttributeConnections : " + nArray3 + " WeaponAttributeConnections : " + nArray4;
            return;
        }
        StringBuffer stringBuffer3 = new StringBuffer("\"");
        for (cjv cjv2 : cjv.values()) {
            if (cjv2 == cjv.ALL) break;
            n3 = nArray3[cjv2.ordinal()];
            if (!ep.aT((int)n3)) {
                assert (false) : "Attribute : " + n3 + " is not a base attribute.";
                return;
            }
            n2 = cjv.getConnectionAttribute(cjv2);
            if (n2 == -1) {
                assert (false) : "There is no attribute connection for ArmorType : " + (Object)((Object)cjv2);
                return;
            }
            stringBuffer3.append(ep.aM((int)n2) + ":" + ep.aM((int)n3) + "|");
        }
        for (ckh ckh2 : ckh.values()) {
            n3 = nArray4[ckh2.ordinal()];
            if (!ep.aT((int)n3)) {
                assert (false) : "Attribute : " + n3 + " is not a base attribute.";
                return;
            }
            n2 = ckh.getWeaponTypeConnectedAttribute(ckh2);
            if (n2 == -1) {
                assert (false) : "There is no attribute connection for WeaponType : " + (Object)((Object)ckh2);
                return;
            }
            stringBuffer3.append(ep.aM((int)n2) + ":" + ep.aM((int)n3) + "|");
        }
        stringBuffer3.setLength(stringBuffer3.length() - 1);
        stringBuffer3.append("\"");
        String string = "Insert Into player_custombuilds_log(GameID,WorldID,CharacterID,Skills,Boosters,AttributeConnections)  Values (" + lcw.qGe + "," + lcw.qGf + "," + n5 + "," + stringBuffer.toString() + "," + stringBuffer2.toString() + "," + stringBuffer3.toString() + ")";
        this.hfD.a(new dvz(string));
    }

    private void a(gfg gfg2) {
        String string = gfg2.aIQ() != null ? gfg2.aIQ() : "";
        String string2 = gfg2.bBW() != null ? gfg2.bBW() : "";
        String string3 = gfg2.acl() != null ? gfg2.acl() : "";
        String string4 = gfg2.iU() != null ? gfg2.iU() : "";
        ljq ljq2 = gfg2.av() != null ? gfg2.av() : ljq.roQ;
        String string5 = ayc.c.getNameByOrdinal(gfg2.lF());
        int n2 = gfg2.bHc();
        gfg.a a2 = gfg.a.getValueByOrdinal(n2);
        String string6 = a2 != null ? a2.getDisplayName() : "INVALID";
        String string7 = "Insert Into relics_log(GameID,WorldID,UpdateType,RelicID,PlayerName,PlayerClanName,CityClanOwnerName,CityName,Position)  Values (" + lcw.qGe + "," + lcw.qGf + ",'" + string6 + "','" + string5 + "','" + string4 + "','" + string3 + "','" + string + "','" + string2 + "','" + ljq2.fk() + "')";
        this.hfD.a(new dvz(string7));
    }
}

