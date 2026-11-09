/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public enum azh {
    cEi(lps.rTX),
    cEj(lps.rTY),
    cEk(lps.rTY),
    cEl(lps.rTY),
    cEm(lps.rTY),
    cEn(lps.rTY);

    private lox NameString = null;

    public int getLength() {
        switch (this) {
            case cEj: {
                return (int)(lcw.enf() ? bad.agr() : jnr.itF.agr());
            }
            case cEk: {
                return (int)(lcw.enf() ? bad.ags() : jnr.itF.ags());
            }
            case cEl: {
                return (int)(lcw.enf() ? bad.agt() : jnr.itF.agt());
            }
            case cEm: {
                return (int)(lcw.enf() ? bad.agu() : jnr.itF.agu());
            }
            case cEn: {
                return (int)(lcw.enf() ? bad.agv() : jnr.itF.agv());
            }
        }
        return 0;
    }

    public boolean acZ() {
        switch (this) {
            case cEj: 
            case cEk: {
                return true;
            }
        }
        return false;
    }

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private azh(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(this.getLength()).exA() : super.toString();
    }

    public static azh getValueByOrdinal(int n) {
        return n < 0 || n >= azh.values().length ? cEi : azh.values()[n];
    }

    public static List<String> getDisplayNames() {
        ArrayList<String> arrayList = lcn.emv();
        if (!lcw.ena() && !lcw.enb()) {
            for (azh azh2 : azh.values()) {
                arrayList.add(azh2.name());
            }
        } else {
            for (azh azh3 : azh.values()) {
                arrayList.add(azh3.Zv().bD(azh3.getLength()).exA());
            }
        }
        return arrayList;
    }
}

