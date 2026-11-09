/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum jjk {
    nmY,
    nmZ,
    nna,
    nnb,
    nnc,
    nnd,
    nne,
    nnf,
    nng,
    nnh,
    nni,
    nnj,
    nnk,
    nnl,
    nnm,
    nnn,
    nno;

    public static final List<jjk> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < jjk.getValueCount();
    }

    public static final jjk getValueByOrdinal(int n) {
        if (jjk.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final jjk getValueByName(String string) {
        for (jjk jjk2 : ListOfValue) {
            if (!jjk2.toString().equalsIgnoreCase(string)) continue;
            return jjk2;
        }
        return null;
    }

    public boolean isPersistent() {
        return this != nno && this != nnl;
    }

    public boolean dJT() {
        switch (this) {
            case nno: 
            case nmY: 
            case nmZ: 
            case nnn: {
                return true;
            }
        }
        return false;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(jjk.class.getEnumConstants()));
    }
}

