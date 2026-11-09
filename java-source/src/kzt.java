/*
 * Decompiled with CFR.
 */
public class kzt
implements Comparable {
    private int qoL = 0;
    private kyk.a qkC = null;
    private String eQ = null;
    private String qkE = null;
    private boolean avz = true;

    public int eki() {
        return this.qoL;
    }

    public void abq(int n) {
        this.qoL = n;
    }

    public kyk.a eiK() {
        return this.qkC;
    }

    public void a(kyk.a a2) {
        this.qkC = a2;
    }

    public String getNodeName() {
        return this.eQ;
    }

    public void w(String string) {
        this.eQ = string;
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

    public int compareTo(Object object) {
        int n = ((kzt)object).eki();
        if (this.qoL > n) {
            return 1;
        }
        if (this.qoL < n) {
            return -1;
        }
        return 0;
    }

    public kzt ekj() {
        kzt kzt2 = new kzt();
        kzt2.abq(this.qoL);
        kzt2.a(this.qkC);
        kzt2.w(this.eQ);
        kzt2.setExpression(this.qkE);
        kzt2.setEnabled(this.avz);
        return kzt2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.qoL);
        stringBuilder.append(" '");
        stringBuilder.append(this.eQ);
        stringBuilder.append("' '");
        stringBuilder.append(this.qkC.name());
        stringBuilder.append("' '");
        stringBuilder.append(this.qkE);
        stringBuilder.append("' ");
        if (this.avz) {
            stringBuilder.append("Enabled");
        } else {
            stringBuilder.append("Disabled");
        }
        return stringBuilder.toString();
    }

    public static String[] eiN() {
        kyk.a[] aArray = kyk.a.values();
        String[] stringArray = new String[aArray.length];
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            stringArray[i2] = aArray[i2].name();
        }
        return stringArray;
    }

    public static kyk.a xG(String string) {
        if (string == null) {
            lfn.b(5, "SFSpecialEffectViewFilter", "getCheckType() CheckTypeName is null.");
            return null;
        }
        kyk.a[] aArray = kyk.a.values();
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            if (!aArray[i2].name().equalsIgnoreCase(string)) continue;
            return aArray[i2];
        }
        lfn.b(5, "SFSpecialEffectViewFilter", "getCheckType() CheckTypeName '" + string + "' is invalid.");
        return null;
    }
}

