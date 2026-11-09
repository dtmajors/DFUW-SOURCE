/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public enum ayx {
    cCo(lpy.rWv),
    cCp(lpy.rWw),
    cCq(lpy.rWx),
    cCr(lpy.rWy);

    private lox NameString = null;

    public lox Zv() {
        return this.NameString;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private ayx(lox lox2) {
        this.NameString = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static ayx getValueByOrdinal(int n) {
        return n < 0 || n >= ayx.values().length ? null : ayx.values()[n];
    }

    public static List<String> getDisplayNames() {
        ArrayList<String> arrayList = lcn.emv();
        if (!lcw.ena() && !lcw.enb()) {
            for (ayx ayx2 : ayx.values()) {
                arrayList.add(ayx2.name());
            }
        } else {
            for (ayx ayx3 : ayx.values()) {
                arrayList.add(ayx3.Zv().bD(new Object[0]).exA());
            }
        }
        return arrayList;
    }
}

