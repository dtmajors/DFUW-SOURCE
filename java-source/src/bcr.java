/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public enum bcr {
    cXe(lqb.rWK),
    cXf(lqb.rWL),
    cXg(lqb.rWM),
    cXh(lqb.rWN),
    cXi(lqb.rWO);

    private lox NameString = null;

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private bcr(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static bcr getValueByOrdinal(int n) {
        return n < 0 || n >= bcr.values().length ? cXg : bcr.values()[n];
    }

    public static List<String> getDisplayNames() {
        ArrayList<String> arrayList = lcn.emv();
        if (!lcw.ena() && !lcw.enb()) {
            for (bcr bcr2 : bcr.values()) {
                arrayList.add(bcr2.name());
            }
        } else {
            for (bcr bcr3 : bcr.values()) {
                arrayList.add(bcr3.Zv().bD(new Object[0]).exA());
            }
        }
        return arrayList;
    }
}

