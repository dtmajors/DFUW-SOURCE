/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class dwr
extends dvx {
    private static final String hld = "df_persistence_read.pso";
    private static final String hmj = "darkfall.player_pvp_highscore_summary";
    private static final String hlp = "Name";
    private static final String hmk = "Kills";
    static final String hmd = "SELECT CONCAT(df_persistence_read.pso.FirstName, \" \", df_persistence_read.pso.LastName) AS Name, SUM(darkfall.player_pvp_highscore_summary.Counter) AS Kills FROM darkfall.player_pvp_highscore_summary INNER JOIN df_persistence_read.pso ON darkfall.player_pvp_highscore_summary.GameID = df_persistence_read.pso.GameID AND darkfall.player_pvp_highscore_summary.WorldID = df_persistence_read.pso.WorldID AND darkfall.player_pvp_highscore_summary.CharacterID = df_persistence_read.pso.CharacterID WHERE darkfall.player_pvp_highscore_summary.GameID = " + lcw.qGe + " " + "AND " + "darkfall.player_pvp_highscore_summary" + ".WorldID = " + lcw.qGf + " " + "GROUP BY " + "darkfall.player_pvp_highscore_summary" + ".CharacterID " + "ORDER BY " + "Kills" + " DESC";
    private String[] hml = null;
    private int[] hmm = null;

    public String[] bDE() {
        return this.hml;
    }

    public int[] bDF() {
        return this.hmm;
    }

    public int getEntryCount() {
        return this.hml.length;
    }

    public dwr CN(int n2) {
        String[] stringArray = new String[Math.min(Math.max(n2, 1), this.hml.length)];
        int[] nArray = new int[Math.min(Math.max(n2, 1), this.hmm.length)];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            stringArray[i2] = this.hml[i2];
            nArray[i2] = this.hmm[i2];
        }
        return new dwr(stringArray, nArray);
    }

    private dwr(String[] stringArray, int[] nArray) {
        this.hml = stringArray;
        this.hmm = nArray;
    }

    public void jG(String string) {
        int n2;
        boolean bl = false;
        for (n2 = 0; n2 < this.hml.length; ++n2) {
            if (this.hml[n2].compareToIgnoreCase(string) != 0) continue;
            int n3 = n2;
            this.hmm[n3] = this.hmm[n3] + 1;
            bl = true;
        }
        if (bl) {
            n2 = this.hmm.length - 1;
            boolean bl2 = false;
            while (!bl2) {
                bl2 = true;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (this.hmm[i2] >= this.hmm[i2 + 1]) continue;
                    String string2 = this.hml[i2];
                    int n4 = this.hmm[i2];
                    this.hml[i2] = this.hml[i2 + 1];
                    this.hmm[i2] = this.hmm[i2 + 1];
                    this.hml[i2 + 1] = string2;
                    this.hmm[i2 + 1] = n4;
                    bl2 = false;
                }
                --n2;
            }
        } else {
            String[] stringArray = new String[this.hml.length + 1];
            int[] nArray = new int[this.hmm.length + 1];
            for (int i3 = 0; i3 < this.hml.length; ++i3) {
                stringArray[i3] = this.hml[i3];
                nArray[i3] = this.hmm[i3];
            }
            stringArray[stringArray.length - 1] = string;
            nArray[nArray.length - 1] = 1;
            this.hml = stringArray;
            this.hmm = nArray;
        }
    }

    static dwr c(lmo[] lmoArray, lmg[] lmgArray) {
        if (lmgArray == null || lmoArray == null) {
            return null;
        }
        int n2 = 0;
        String[] stringArray = new String[lmoArray.length];
        int n3 = 0;
        int[] nArray = new int[lmoArray.length];
        for (int i2 = 0; i2 < lmoArray.length; ++i2) {
            for (int i3 = 0; i3 < lmgArray.length; ++i3) {
                if (lmgArray[i3].getName().equals(hlp)) {
                    stringArray[n2++] = dwr.c(lmoArray[i2].euV()[i3]);
                    continue;
                }
                if (!lmgArray[i3].getName().equals(hmk)) continue;
                nArray[n3] = (int)dwr.f(lmoArray[i2].euV()[i3]);
                if (nArray[n3] < 0 || nArray[n3] == Integer.MAX_VALUE) {
                    nArray[n3] = 0;
                }
                ++n3;
            }
            if (n2 == stringArray.length || n3 == nArray.length) break;
        }
        if (n2 != n3) {
            lfn.b(5, dwr.class.getSimpleName(), "parse() : Inconsistent Number of Values Parsed!!!");
            assert (false);
            return null;
        }
        return new dwr(stringArray, nArray);
    }
}

