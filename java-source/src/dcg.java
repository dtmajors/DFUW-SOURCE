/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class dcg {
    public static final int gcM = 1;
    public static final int gcN = 2;
    private static final String[] gcO = new String[]{"Undefined ResistanceInfoName", "Resistance Duration", "Resistance Magnitude"};
    private int SkillType = -1;
    public int gcP = 0;
    public String SkillName = null;

    public int zg() {
        if (this.SkillType < 0 && this.SkillName != null) {
            this.SkillType = cxd.ip((String)this.SkillName);
            if (this.SkillType < 0) {
                this.SkillName = null;
            }
        }
        return this.SkillType;
    }

    public static int iD(String string) {
        if (string == null) {
            return -1;
        }
        int n2 = gcO.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!gcO[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        return -1;
    }

    public String bjp() {
        if (this.gcP < 0 || this.gcP >= gcO.length) {
            return null;
        }
        return gcO[this.gcP];
    }
}

