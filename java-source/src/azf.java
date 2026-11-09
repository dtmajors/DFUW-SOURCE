/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public enum azf {
    cDW(lpz.rWA),
    cDX(lpz.rWB),
    cDY(lpz.rWC),
    cDZ(lpz.rWD),
    cEa(lpz.rWE);

    private lox NameString = null;

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private azf(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static azf getValueByOrdinal(int n) {
        return n < 0 || n >= azf.values().length ? null : azf.values()[n];
    }

    public static List<String> getDisplayNames() {
        ArrayList<String> arrayList = lcn.emv();
        if (!lcw.ena() && !lcw.enb()) {
            for (azf azf2 : azf.values()) {
                arrayList.add(azf2.name());
            }
        } else {
            for (azf azf3 : azf.values()) {
                arrayList.add(azf3.Zv().bD(new Object[0]).exA());
            }
        }
        return arrayList;
    }
}

