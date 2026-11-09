/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ain {
    bnp,
    bnq,
    bnr,
    bns,
    bnt,
    bnu,
    bnv,
    bnw,
    bnx,
    bny,
    bnz,
    bnA,
    bnB,
    bnC,
    bnD;

    public static final List<ain> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < ain.getValueCount();
    }

    public static final ain getValueByOrdinal(int n) {
        if (ain.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return bnp;
    }

    public static ain getUnlockableTypeByName(String string) {
        for (ain ain2 : ListOfValue) {
            if (!ain2.name().equalsIgnoreCase(string)) continue;
            return ain2;
        }
        return null;
    }

    public static ain getUnlockableTypeForResourceType(int n) {
        if (lea.enW().isDescendant(n, cug.fgH)) {
            return bnr;
        }
        if (lea.enW().isDescendant(n, cug.fiJ)) {
            return bns;
        }
        if (lea.enW().isDescendant(n, cug.fit)) {
            return bnu;
        }
        if (lea.enW().isDescendant(n, cug.fiv)) {
            return bnw;
        }
        if (lea.enW().isDescendant(n, cug.fiy)) {
            return bnt;
        }
        if (lea.enW().isDescendant(n, cug.fiw)) {
            return bnv;
        }
        if (lea.enW().isDescendant(n, cug.fix)) {
            return bnx;
        }
        if (lea.enW().isDescendant(n, cug.fiH)) {
            return bnz;
        }
        if (lea.enW().isDescendant(n, cug.fiA)) {
            return bny;
        }
        if (lea.enW().isDescendant(n, cug.fiu)) {
            return bnA;
        }
        if (lea.enW().isDescendant(n, cug.fiB)) {
            return bnB;
        }
        if (lea.enW().isDescendant(n, cug.fkF)) {
            return bnC;
        }
        return bnp;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(ain.class.getEnumConstants()));
    }
}

