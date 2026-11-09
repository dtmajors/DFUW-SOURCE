/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class cec {
    private static final int eoE = 0;
    private static final int eoF = 1;
    private static final int eoG = 0;
    private ldv eoH = null;
    private String Name = null;
    private lmo[] eoI = null;
    private String eoJ = null;

    public cec(String string, ldv ldv2) {
        this.Name = string;
        this.eoH = ldv2;
    }

    public String aKM() {
        String string = "SELECT AttackerClanName, EndTimeStamp FROM clan_challenge_history";
        string = string + " WHERE GameID = " + lcw.qGe + " AND WorldID = " + lcw.qGf + " AND AttackerChallengeStatus = " + dxl.b.hnH.ordinal();
        string = string + " AND ObjectName = " + this.aD(this.Name) + " ORDER BY EndTimeStamp desc";
        return string;
    }

    public String aKN() {
        String string = "SELECT ClanName FROM city_found_history";
        string = string + " WHERE GameID = " + lcw.qGe + " AND WorldID = " + lcw.qGf;
        string = string + " AND ObjectName = " + this.aD(this.Name);
        return string;
    }

    public ldv aKO() {
        return this.eoH;
    }

    public boolean isComplete() {
        return this.eoI != null && this.eoJ != null;
    }

    public void e(kdk kdk2) {
        lmn lmn2 = kdk2.dVr();
        lmg[] lmgArray = lmn2.euS();
        lmo[] lmoArray = lmn2.euT();
        if (lmgArray.length > 0) {
            if (lmgArray[0].getName().compareTo("ClanName") == 0) {
                this.eoJ = lmoArray.length == 0 ? "" : lmoArray[0].euV()[0].toString();
            } else if (lmgArray[0].getName().compareTo("AttackerClanName") == 0) {
                this.eoI = lmoArray;
            }
        }
    }

    private String aD(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\'');
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (string.charAt(i2) == '\'') {
                stringBuilder.append("\\'");
                continue;
            }
            if (string.charAt(i2) == '\\') {
                stringBuilder.append("\\\\");
                continue;
            }
            stringBuilder.append(string.charAt(i2));
        }
        stringBuilder.append('\'');
        return stringBuilder.toString();
    }

    public loz[] aKP() {
        loz[] lozArray = new loz[this.isComplete() ? this.eoI.length + 2 : 2];
        int n = 0;
        lozArray[n++] = lzl.tWM.bD(this.Name);
        if (this.isComplete()) {
            for (int i2 = 0; i2 < this.eoI.length; ++i2) {
                lmi[] lmiArray = this.eoI[i2].euV();
                lozArray[n++] = lzl.tWN.bD(lmiArray[0].toString(), lmiArray[1].toString());
            }
            lozArray[n++] = this.eoJ.isEmpty() ? lzl.tWO.bD(this.Name) : lzl.tWP.bD(this.eoJ);
        } else {
            lozArray[n++] = lzl.tWQ.bD(new Object[0]);
        }
        return lozArray;
    }

    public String toString() {
        return "Clan City History Values for '" + this.Name + "' - Complete: " + this.isComplete();
    }
}

