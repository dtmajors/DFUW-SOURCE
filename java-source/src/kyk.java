/*
 * Decompiled with CFR.
 */
public class kyk {
    private b qkB = null;
    private a qkC = null;
    private int qkD = 0;
    private String qkE = null;
    private boolean avz = true;

    public b eiJ() {
        return this.qkB;
    }

    public void a(b b2) {
        this.qkB = b2;
    }

    public a eiK() {
        return this.qkC;
    }

    public void a(a a2) {
        this.qkC = a2;
    }

    public int eiL() {
        return this.qkD;
    }

    public void abj(int n) {
        this.qkD = n;
    }

    public String getExpression() {
        return this.qkE;
    }

    public void setExpression(String string) {
        this.qkE = string;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }

    public kyk eiM() {
        kyk kyk2 = new kyk();
        kyk2.a(this.qkB);
        kyk2.a(this.qkC);
        kyk2.abj(this.qkD);
        kyk2.setExpression(this.qkE);
        kyk2.setEnabled(this.avz);
        return kyk2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(this.qkB.name());
        stringBuilder.append("'   '");
        stringBuilder.append(this.qkC.name());
        stringBuilder.append("'   '");
        stringBuilder.append(lfn.rkl[this.qkD]);
        stringBuilder.append("'   '");
        stringBuilder.append(this.qkE);
        stringBuilder.append("'   ");
        if (this.avz) {
            stringBuilder.append("Enabled");
        } else {
            stringBuilder.append("Disabled");
        }
        return stringBuilder.toString();
    }

    public boolean validate() {
        if (this.qkB == null) {
            return false;
        }
        if (this.qkC == null) {
            return false;
        }
        if (this.qkD < 0 || this.qkD > 6) {
            return false;
        }
        return this.qkE != null && !this.qkE.trim().equals("");
    }

    public static String[] eiN() {
        a[] aArray = a.values();
        String[] stringArray = new String[aArray.length];
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            stringArray[i2] = aArray[i2].name();
        }
        return stringArray;
    }

    public static String[] eiO() {
        b[] bArray = b.values();
        String[] stringArray = new String[bArray.length];
        for (int i2 = 0; i2 < bArray.length; ++i2) {
            stringArray[i2] = bArray[i2].name();
        }
        return stringArray;
    }

    public static String[] eiP() {
        return lfn.rkl;
    }

    public static a xG(String string) {
        if (string == null) {
            lfn.b(5, "SFLogViewFilter", "getCheckType() CheckTypeName is null.");
            return null;
        }
        a[] aArray = a.values();
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            if (!aArray[i2].name().equalsIgnoreCase(string)) continue;
            return aArray[i2];
        }
        lfn.b(5, "SFLogViewFilter", "getCheckType() CheckTypeName '" + string + "' is invalid.");
        return null;
    }

    public static b xH(String string) {
        if (string == null) {
            lfn.b(5, "SFLogViewFilter", "getFilterType() FilterName is null.");
            return null;
        }
        b[] bArray = b.values();
        for (int i2 = 0; i2 < bArray.length; ++i2) {
            if (!bArray[i2].name().equalsIgnoreCase(string)) continue;
            return bArray[i2];
        }
        lfn.b(5, "SFLogViewFilter", "getFilterType() FilterName '" + string + "' is invalid.");
        return null;
    }

    public static int xI(String string) {
        if (string == null) {
            lfn.b(5, "SFLogViewFilter", "getLogLevel() LogLevelName is null.");
            return -1;
        }
        for (int i2 = 0; i2 < lfn.rkl.length; ++i2) {
            if (!lfn.rkl[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        lfn.b(5, "SFLogViewFilter", "getLogLevel() LogLevelName '" + string + "' is invalid.");
        return -1;
    }
}

