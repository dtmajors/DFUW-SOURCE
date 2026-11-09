/*
 * Decompiled with CFR.
 */
public class cag {
    private int eeC = -1;
    private String[] eeD = null;

    public int aFO() {
        return this.eeC;
    }

    public void oo(int n) {
        assert (n >= 0);
        this.eeC = n;
    }

    public String[] aFP() {
        return this.eeD;
    }

    public void j(String[] stringArray) {
        assert (stringArray != null);
        this.eeD = stringArray;
    }

    public boolean k(String[] stringArray) {
        assert (this.eeD != null);
        if (stringArray == null) {
            return false;
        }
        if (this.eeD.length != stringArray.length) {
            return false;
        }
        int n = this.eeD.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (this.eeD[i2].equalsIgnoreCase(stringArray[i2])) continue;
            return false;
        }
        return true;
    }

    public cag aFQ() {
        cag cag2 = new cag();
        this.a(cag2);
        return cag2;
    }

    public boolean equals(Object object) {
        cag cag2;
        assert (this.eeC >= 0);
        assert (this.eeD != null);
        return object instanceof cag && (cag2 = (cag)object).aFO() == this.eeC && cag2.k(this.eeD);
    }

    public String[] aFR() {
        assert (this.eeC >= 0);
        assert (this.eeD != null);
        String[] stringArray = new String[this.eeD.length];
        System.arraycopy(this.eeD, 0, stringArray, 0, this.eeD.length);
        return stringArray;
    }

    public String toString() {
        assert (this.eeC >= 0);
        assert (this.eeD != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFMaterialItem: MaterialID=");
        stringBuilder.append(this.eeC);
        stringBuilder.append(" TextureNames=[");
        int n = this.eeD.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.eeD[i2]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected void a(cag cag2) {
        assert (this.eeD != null);
        cag2.oo(this.eeC);
        cag2.j(this.aFR());
    }
}

