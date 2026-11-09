/*
 * Decompiled with CFR.
 */
public class cav {
    private boolean eim = false;
    private int eeC = 0;
    private String dBL = null;

    public boolean aGZ() {
        return this.eim;
    }

    public void fv(boolean bl) {
        this.eim = bl;
    }

    public int aFO() {
        return this.eeC;
    }

    public void oo(int n) {
        this.eeC = n;
    }

    public String aHa() {
        return this.dBL;
    }

    public void gW(String string) {
        assert (string != null);
        this.dBL = string;
    }

    public cav aHb() {
        assert (this.dBL != null);
        cav cav2 = new cav();
        cav2.fv(this.eim);
        cav2.oo(this.eeC);
        cav2.gW(this.dBL);
        return cav2;
    }

    public boolean equals(Object object) {
        cav cav2;
        if (object instanceof cav && (cav2 = (cav)object).aGZ() == this.eim && cav2.aHa().equalsIgnoreCase(this.dBL)) {
            if (this.eim) {
                return true;
            }
            if (cav2.aFO() == this.eeC) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFShaderItem:");
        stringBuilder.append(" MaterialID=");
        stringBuilder.append(this.eeC);
        stringBuilder.append(" Name='");
        stringBuilder.append(this.dBL);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

