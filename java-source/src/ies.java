/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ies {
    lOx(lxf.toq),
    lOy(lxf.tos),
    lOz(lxf.tot),
    lOA(lxf.tou),
    lOB(lxf.tov),
    lOC(lxf.tow),
    lOD(lxf.tox),
    lOE(lxf.toy),
    lOF(lxf.toD),
    lOG(lxf.toE),
    lOH(lxf.toU);

    public static final List<ies> ListOfValue;
    private lox lOI;

    private ies(lox lox2) {
        this.lOI = lox2;
    }

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < ies.getValueCount();
    }

    public static final ies getValueByOrdinal(int n) {
        if (ies.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final ies getValueByName(String string) {
        for (ies ies2 : ListOfValue) {
            if (!ies2.getName().equalsIgnoreCase(string)) continue;
            return ies2;
        }
        return null;
    }

    public String getName() {
        return this.lOI.bD(new Object[0]).exA().toUpperCase();
    }

    public lox cQp() {
        return this.lOI;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(ies.class.getEnumConstants()));
    }
}

