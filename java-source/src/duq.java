/*
 * Decompiled with CFR.
 */
public class duq {
    protected int eeC = 0;
    protected String[] eeD = null;
    protected dur hfc = null;

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
        this.eeD = stringArray;
    }

    public boolean k(String[] stringArray) {
        assert (this.eeD != null);
        assert (stringArray != null);
        if (this.eeD.length != stringArray.length) {
            return false;
        }
        for (int i = 0; i < this.eeD.length; ++i) {
            if (this.eeD[i].equalsIgnoreCase(stringArray[i])) continue;
            return false;
        }
        return true;
    }

    public duq bBl() {
        assert (this.eeD != null);
        duq duq2 = new duq();
        duq2.oo(this.eeC);
        duq2.j(this.aFR());
        return duq2;
    }

    public boolean equals(Object object) {
        duq duq2;
        return object instanceof duq && (duq2 = (duq)object).aFO() == this.eeC && this.k(duq2.aFP());
    }

    public dur bBm() {
        assert (this.eeC >= 0);
        if (this.hfc == null) {
            this.hfc = new dur(this.eeC);
        }
        return this.hfc;
    }

    public String[] aFR() {
        assert (this.eeD != null);
        String[] stringArray = new String[this.eeD.length];
        System.arraycopy(this.eeD, 0, stringArray, 0, this.eeD.length);
        return stringArray;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSubsetMaterial: MaterialID=" + this.eeC);
        for (int i = 0; i < this.eeD.length; ++i) {
            stringBuilder.append(" TextureName[" + i + "]='" + this.eeD[i] + "'");
            if (i >= this.eeD.length - 1) continue;
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}

