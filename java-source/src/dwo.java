/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class dwo
extends dvx {
    private static final String hld = "df_persistence_read.pso";
    private static final String hle = "darkfall.leaderboard_entries";
    private static final String hlf = "GameID";
    private static final String hlg = "WorldID";
    private static final String hlh = "CharacterID";
    private static final String hli = "Rank";
    private static final String hlj = "CurrentPoints";
    private static final String hlk = "SeasonPoints";
    private static final String hll = "TermNumber";
    private static final String hlm = "SeasonNumber";
    private static final String hln = "FirstName";
    private static final String hlo = "LastName";
    private static final String hlp = "Name";
    private static final String hlq = "CurrentTerm";
    private static final String hlr = "PreviousTerm";
    private static final String hls = "UpToNow";
    private static final String hlt = "UpToLastTerm";
    private static final String hlu = "{TID}";
    private static final String hlv = "{SID}";
    private static final String hlw = "SELECT CONCAT(df_persistence_read.pso.FirstName, \" \", df_persistence_read.pso.LastName) AS Name, IFNULL(PreviousTerm.Rank, 0) AS Rank, CurrentTerm.CurrentPoints, CurrentTerm.CharacterID FROM darkfall.leaderboard_entries CurrentTerm INNER JOIN df_persistence_read.pso ON CurrentTerm.GameID = df_persistence_read.pso.GameID AND CurrentTerm.WorldID = df_persistence_read.pso.WorldID AND CurrentTerm.CharacterID = df_persistence_read.pso.CharacterID LEFT JOIN darkfall.leaderboard_entries PreviousTerm ON CurrentTerm.GameID = PreviousTerm.GameID AND CurrentTerm.WorldID = PreviousTerm.WorldID AND CurrentTerm.CharacterID = PreviousTerm.CharacterID AND (CurrentTerm.TermNumber - 1) = PreviousTerm.TermNumber WHERE CurrentTerm.GameID = " + lcw.qGe + " " + "AND " + "CurrentTerm" + "." + "WorldID" + " = " + lcw.qGf + " " + "AND " + "CurrentTerm" + "." + "TermNumber" + " = " + "{TID}" + " " + "ORDER BY " + "CurrentTerm" + "." + "CurrentPoints" + " DESC, " + "Name" + " ASC";
    private static final String hlx = "SELECT CONCAT(df_persistence_read.pso.FirstName, \" \", df_persistence_read.pso.LastName) AS Name, SUM(CurrentTerm.SeasonPoints) AS UpToNow, (SELECT SUM(PreviousTerm.SeasonPoints) FROM darkfall.leaderboard_entries PreviousTerm WHERE PreviousTerm.GameID = " + lcw.qGe + " " + "AND " + "PreviousTerm" + "." + "WorldID" + " = " + lcw.qGf + " " + "AND " + "PreviousTerm" + "." + "SeasonNumber" + " = " + "{SID}" + " " + "AND " + "PreviousTerm" + "." + "CharacterID" + " = " + "CurrentTerm" + "." + "CharacterID" + " " + "AND " + "PreviousTerm" + "." + "TermNumber" + " < ((" + "SELECT MAX(" + "TermNumber" + ") " + "FROM " + "darkfall.leaderboard_entries" + " " + "WHERE " + "GameID" + " = " + lcw.qGe + " " + "AND " + "WorldID" + " = " + lcw.qGf + " " + ") - 1) " + "GROUP BY " + "PreviousTerm" + "." + "CharacterID" + "" + ") AS " + "UpToLastTerm" + " " + "FROM " + "darkfall.leaderboard_entries" + " " + "CurrentTerm" + " " + "INNER JOIN " + "df_persistence_read.pso" + " " + "ON " + "CurrentTerm" + "." + "GameID" + " = " + "df_persistence_read.pso" + "." + "GameID" + " " + "AND " + "CurrentTerm" + "." + "WorldID" + " = " + "df_persistence_read.pso" + "." + "WorldID" + " " + "AND " + "CurrentTerm" + "." + "CharacterID" + " = " + "df_persistence_read.pso" + "." + "CharacterID" + " " + "WHERE " + "CurrentTerm" + "." + "GameID" + " = " + lcw.qGe + " " + "AND " + "CurrentTerm" + "." + "WorldID" + " = " + lcw.qGf + " " + "AND " + "CurrentTerm" + "." + "SeasonNumber" + " = " + "{SID}" + " " + "GROUP BY " + "CurrentTerm" + "." + "CharacterID" + " " + "ORDER BY " + "UpToNow" + " DESC, " + "Name" + " ASC";
    private static final String hly = "SELECT CONCAT(df_persistence_read.pso.FirstName, \" \", df_persistence_read.pso.LastName) AS Name, CharacterID, SUM(SeasonPoints) AS SeasonPoints FROM darkfall.leaderboard_entries INNER JOIN df_persistence_read.pso ON darkfall.leaderboard_entries.GameID = df_persistence_read.pso.GameID AND darkfall.leaderboard_entries.WorldID = df_persistence_read.pso.WorldID AND darkfall.leaderboard_entries.CharacterID = df_persistence_read.pso.CharacterID WHERE darkfall.leaderboard_entries.GameID = " + lcw.qGe + " " + "AND " + "darkfall.leaderboard_entries" + "." + "WorldID" + " = " + lcw.qGf + " " + "AND " + "darkfall.leaderboard_entries" + "." + "SeasonNumber" + " = " + "{SID}" + " " + "GROUP BY " + "darkfall.leaderboard_entries" + "." + "CharacterID" + " " + "ORDER BY " + "SeasonPoints" + " DESC, " + "Name" + " ASC";
    private String[] hlz = null;
    private int[] hlA = null;
    private int[] hlB = null;
    private float[] hlC = null;
    private int[] hlD = null;
    private int[] hlE = null;
    private int[] hlF = null;

    public String[] getNames() {
        return this.hlz;
    }

    public int[] bDl() {
        return this.hlA;
    }

    public int[] bDm() {
        return this.hlB;
    }

    public float[] bDn() {
        return this.hlC;
    }

    public int[] bDo() {
        return this.hlD;
    }

    public int[] bDp() {
        return this.hlE;
    }

    public int[] bDq() {
        return this.hlF;
    }

    public dwo CI(int n2) {
        String[] stringArray = new String[Math.min(Math.max(n2, 1), this.hlz.length)];
        int[] nArray = this.hlA == null ? null : new int[Math.min(Math.max(n2, 1), this.hlA.length)];
        int[] nArray2 = this.hlB == null ? null : new int[Math.min(Math.max(n2, 1), this.hlB.length)];
        float[] fArray = this.hlC == null ? null : new float[Math.min(Math.max(n2, 1), this.hlC.length)];
        int[] nArray3 = this.hlD == null ? null : new int[Math.min(Math.max(n2, 1), this.hlD.length)];
        int[] nArray4 = this.hlE == null ? null : new int[Math.min(Math.max(n2, 1), this.hlE.length)];
        int[] nArray5 = this.hlF == null ? null : new int[Math.min(Math.max(n2, 1), this.hlF.length)];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            stringArray[i2] = this.hlz[i2];
            if (nArray != null) {
                nArray[i2] = this.hlA[i2];
            }
            if (nArray2 != null) {
                nArray2[i2] = this.hlB[i2];
            }
            if (fArray != null) {
                fArray[i2] = this.hlC[i2];
            }
            if (nArray3 != null) {
                nArray3[i2] = this.hlD[i2];
            }
            if (nArray4 != null) {
                nArray4[i2] = this.hlE[i2];
            }
            if (nArray5 == null) continue;
            nArray5[i2] = this.hlF[i2];
        }
        return new dwo(stringArray, nArray, nArray2, fArray, nArray3, nArray4, nArray5);
    }

    private dwo(String[] stringArray, int[] nArray, int[] nArray2, float[] fArray, int[] nArray3, int[] nArray4, int[] nArray5) {
        this.hlz = stringArray;
        this.hlA = nArray;
        this.hlB = nArray2;
        this.hlC = fArray;
        this.hlD = nArray3;
        this.hlE = nArray4;
        this.hlF = nArray5;
    }

    public void a(dwn dwn2, String string) {
        Object object;
        int n2;
        if (this.hlC == null) {
            return;
        }
        boolean bl = false;
        for (n2 = 0; n2 < this.hlz.length; ++n2) {
            if (this.hlA[n2] != dwn2.qe()) continue;
            int n3 = n2;
            this.hlC[n3] = this.hlC[n3] + dwn2.bCX();
            bl = true;
        }
        if (!bl) {
            String[] stringArray = new String[this.hlz.length + 1];
            int[] nArray = this.hlA == null ? null : new int[this.hlA.length + 1];
            int[] nArray2 = this.hlB == null ? null : new int[this.hlB.length + 1];
            object = new float[this.hlC.length + 1];
            int[] nArray3 = this.hlD == null ? null : new int[this.hlD.length + 1];
            int[] nArray4 = this.hlE == null ? null : new int[this.hlE.length + 1];
            int[] nArray5 = this.hlF == null ? null : new int[this.hlF.length + 1];
            for (int i2 = 0; i2 < this.hlz.length; ++i2) {
                stringArray[i2] = this.hlz[i2];
                if (nArray != null) {
                    nArray[i2] = this.hlA[i2];
                }
                if (nArray2 != null) {
                    nArray2[i2] = this.hlB[i2];
                }
                if (object != null) {
                    object[i2] = this.hlC[i2];
                }
                if (nArray3 != null) {
                    nArray3[i2] = this.hlD[i2];
                }
                if (nArray4 != null) {
                    nArray4[i2] = this.hlE[i2];
                }
                if (nArray5 == null) continue;
                nArray5[i2] = this.hlF[i2];
            }
            stringArray[stringArray.length - 1] = string;
            if (nArray != null) {
                nArray[nArray.length - 1] = dwn2.qe();
            }
            if (nArray2 != null) {
                nArray2[nArray2.length - 1] = dwn2.bDc();
            }
            object[((float[])object).length - 1] = dwn2.bCW();
            if (nArray3 != null) {
                nArray3[nArray3.length - 1] = dwn2.bCR();
            }
            if (nArray4 != null) {
                nArray4[nArray4.length - 1] = dwn2.bCR();
            }
            if (nArray5 != null) {
                nArray5[nArray5.length - 1] = -1;
            }
            this.hlz = stringArray;
            this.hlA = nArray;
            this.hlB = nArray2;
            this.hlC = object;
            this.hlD = nArray3;
            this.hlE = nArray4;
            this.hlF = nArray5;
        }
        n2 = this.hlC.length - 1;
        boolean bl2 = false;
        while (!bl2) {
            bl2 = true;
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!(this.hlC[i3] < this.hlC[i3 + 1])) continue;
                object = this.hlz[i3];
                this.hlz[i3] = this.hlz[i3 + 1];
                this.hlz[i3 + 1] = object;
                float f2 = this.hlC[i3];
                this.hlC[i3] = this.hlC[i3 + 1];
                this.hlC[i3 + 1] = f2;
                if (this.hlA != null) {
                    int n4 = this.hlA[i3];
                    this.hlA[i3] = this.hlA[i3 + 1];
                    this.hlA[i3 + 1] = n4;
                }
                if (this.hlB != null) {
                    int n5 = this.hlB[i3];
                    this.hlB[i3] = this.hlB[i3 + 1];
                    this.hlB[i3 + 1] = n5;
                }
                if (this.hlD != null) {
                    int n6 = this.hlD[i3];
                    this.hlD[i3] = this.hlD[i3 + 1];
                    this.hlD[i3 + 1] = n6;
                }
                if (this.hlE != null) {
                    int n7 = this.hlE[i3];
                    this.hlE[i3] = this.hlE[i3 + 1];
                    this.hlE[i3 + 1] = n7;
                }
                if (this.hlF != null) {
                    int n8 = this.hlF[i3];
                    this.hlF[i3] = this.hlF[i3 + 1];
                    this.hlF[i3 + 1] = n8;
                }
                bl2 = false;
            }
            --n2;
        }
    }

    static dwo b(lmo[] lmoArray, lmg[] lmgArray) {
        int n2;
        if (lmgArray == null || lmoArray == null) {
            return null;
        }
        String[] stringArray = new String[lmoArray.length];
        int[] nArray = null;
        int[] nArray2 = null;
        float[] fArray = null;
        int[] nArray3 = null;
        int[] nArray4 = null;
        for (n2 = 0; n2 < lmgArray.length; ++n2) {
            if (lmgArray[n2].getName().equals(hli)) {
                nArray2 = new int[lmoArray.length];
                continue;
            }
            if (lmgArray[n2].getName().equals(hlh)) {
                nArray = new int[lmoArray.length];
                continue;
            }
            if (lmgArray[n2].getName().equals(hlj)) {
                fArray = new float[lmoArray.length];
                continue;
            }
            if (lmgArray[n2].getName().equals(hls) || lmgArray[n2].getName().equals(hlk)) {
                nArray3 = new int[lmoArray.length];
                continue;
            }
            if (!lmgArray[n2].getName().equals(hlt)) continue;
            nArray4 = new int[lmoArray.length];
        }
        for (n2 = 0; n2 < lmoArray.length; ++n2) {
            for (int i2 = 0; i2 < lmgArray.length; ++i2) {
                if (lmgArray[i2].getName().equals(hlp)) {
                    stringArray[n2] = dwo.c(lmoArray[n2].euV()[i2]);
                    continue;
                }
                if (lmgArray[i2].getName().equals(hlh)) {
                    if (nArray == null) continue;
                    nArray[n2] = dwo.d(lmoArray[n2].euV()[i2]);
                    if (nArray[n2] >= 0 && nArray[n2] != Integer.MAX_VALUE) continue;
                    nArray[n2] = 0;
                    continue;
                }
                if (lmgArray[i2].getName().equals(hli)) {
                    if (nArray2 == null) continue;
                    nArray2[n2] = dwo.d(lmoArray[n2].euV()[i2]);
                    if (nArray2[n2] >= 0 && nArray2[n2] != Integer.MAX_VALUE) continue;
                    nArray2[n2] = 0;
                    continue;
                }
                if (lmgArray[i2].getName().equals(hlj)) {
                    if (fArray == null) continue;
                    fArray[n2] = dwo.e(lmoArray[n2].euV()[i2]);
                    if (!(fArray[n2] < 0.0f) && fArray[n2] != Float.MAX_VALUE) continue;
                    fArray[n2] = 0.0f;
                    continue;
                }
                if (lmgArray[i2].getName().equals(hls) || lmgArray[i2].getName().equals(hlk)) {
                    if (nArray3 == null) continue;
                    nArray3[n2] = dwo.d(lmoArray[n2].euV()[i2]);
                    if (nArray3[n2] >= 0 && nArray3[n2] != Integer.MAX_VALUE) continue;
                    nArray3[n2] = 0;
                    continue;
                }
                if (!lmgArray[i2].getName().equals(hlt) || nArray4 == null) continue;
                nArray4[n2] = dwo.d(lmoArray[n2].euV()[i2]);
                if (nArray4[n2] >= 0 && nArray4[n2] != Integer.MAX_VALUE) continue;
                nArray4[n2] = 0;
            }
        }
        int[] nArray5 = null;
        int[] nArray6 = null;
        if (nArray3 != null && nArray4 != null) {
            int n3;
            int n4;
            int n5;
            String[] stringArray2 = new String[stringArray.length];
            for (n5 = 0; n5 < stringArray.length; ++n5) {
                stringArray2[n5] = stringArray[n5];
            }
            n5 = 0;
            int n6 = nArray4.length - 1;
            while (n5 == 0) {
                n5 = 1;
                for (n4 = 0; n4 < n6; ++n4) {
                    if (nArray4[n4] >= nArray4[n4 + 1]) continue;
                    String string = stringArray2[n4];
                    stringArray2[n4] = stringArray2[n4 + 1];
                    stringArray2[n4 + 1] = string;
                    n3 = nArray4[n4];
                    nArray4[n4] = nArray4[n4 + 1];
                    nArray4[n4 + 1] = n3;
                    n5 = 0;
                }
                --n6;
            }
            nArray5 = new int[nArray3.length];
            nArray6 = new int[nArray3.length];
            for (n4 = 0; n4 < stringArray.length; ++n4) {
                boolean bl = false;
                n3 = 0;
                if (n3 < stringArray2.length) {
                    nArray5[n4] = nArray3[n4] - nArray4[n3];
                    nArray6[n4] = n4 - n3;
                    bl = true;
                }
                if (bl) continue;
                nArray5[n4] = nArray3[n4];
                nArray6[n4] = -1;
            }
        }
        return new dwo(stringArray, nArray, nArray2, fArray, nArray3, nArray5, nArray6);
    }

    static String CJ(int n2) {
        return hlw.replace(hlu, Integer.toString(n2));
    }

    static String CK(int n2) {
        return hlx.replace(hlv, Integer.toString(n2));
    }

    static String CL(int n2) {
        return hlx.replace(hlv, Integer.toString(n2));
    }
}

