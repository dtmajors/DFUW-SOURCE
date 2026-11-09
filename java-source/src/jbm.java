/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum jbm {
    mOg(lxs.txs.bD(new Object[0]).exA()),
    mOh(lxs.tae.bD(new Object[0]).exA()),
    mOi(lxs.sZX.bD(new Object[0]).exA()),
    mOj(lxs.tac.bD(new Object[0]).exA()),
    mOk(lxs.taf.bD(new Object[0]).exA()),
    mOl(lxs.txt.bD(new Object[0]).exA()),
    mOm(lxs.tgM.bD(new Object[0]).exA()),
    mOn(lxs.txv.bD(new Object[0]).exA()),
    mOo(lxs.txw.bD(new Object[0]).exA()),
    mOp(lxs.txu.bD(new Object[0]).exA());

    public static final List<jbm> ListOfValue;
    private String Name;

    private jbm(String string2) {
        this.Name = string2;
    }

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < jbm.getValueCount();
    }

    public static final jbm getValueByOrdinal(int n) {
        if (jbm.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final jbm getValueByName(String string) {
        for (jbm jbm2 : ListOfValue) {
            if (!jbm2.Name.equalsIgnoreCase(string)) continue;
            return jbm2;
        }
        return null;
    }

    public String getName() {
        return this.Name;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(jbm.class.getEnumConstants()));
    }
}

