/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public enum cla {
    eHl(lqa.rWG),
    eHm(lqa.rWH),
    eHn(lqa.rWI);

    private lox NameString = null;

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private cla(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static cla getValueByOrdinal(int n) {
        return n < 0 || n >= cla.values().length ? null : cla.values()[n];
    }

    public static List<String> getDisplayNames() {
        ArrayList<String> arrayList = lcn.emv();
        if (!lcw.ena() && !lcw.enb()) {
            for (cla cla2 : cla.values()) {
                arrayList.add(cla2.name());
            }
        } else {
            for (cla cla3 : cla.values()) {
                arrayList.add(cla3.Zv().bD(new Object[0]).exA());
            }
        }
        return arrayList;
    }
}

