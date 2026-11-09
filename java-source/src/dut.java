/*
 * Decompiled with CFR.
 */
public class dut {
    private int bhh = -1;
    private boolean eim = false;
    private int eeC = -1;
    private String dBL = null;
    private dus eeH = null;
    private int hfi = 0;

    public int aFZ() {
        return this.bhh;
    }

    public void eA(int n) {
        this.bhh = n;
    }

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
        this.dBL = string;
    }

    public dus aFV() {
        return this.eeH;
    }

    public void a(dus dus2) {
        this.eeH = dus2;
    }

    public int bBq() {
        return this.hfi;
    }

    public void Cv(int n) {
        this.hfi = n;
    }

    public dut bBr() {
        assert (this.bhh >= 0);
        assert (this.dBL != null);
        dut dut2 = new dut();
        dut2.eA(this.bhh);
        dut2.fv(this.eim);
        dut2.oo(this.eeC);
        dut2.gW(this.dBL);
        if (this.eeH != null) {
            dut2.a(this.eeH.bBp());
        }
        dut2.Cv(this.hfi);
        return dut2;
    }

    public boolean equals(Object object) {
        dut dut2;
        if (object instanceof dut && (dut2 = (dut)object).aFZ() == this.bhh && dut2.aGZ() == this.eim && dut2.aHa().equalsIgnoreCase(this.dBL)) {
            if (this.eim) {
                return true;
            }
            if (dut2.aFO() == this.eeC) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFShader: SubsetID=");
        stringBuilder.append(this.bhh);
        stringBuilder.append(" GlobalShader=");
        stringBuilder.append(this.eim);
        stringBuilder.append(" MaterialID=");
        stringBuilder.append(this.eeC);
        stringBuilder.append(" Name='");
        stringBuilder.append(this.dBL);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

