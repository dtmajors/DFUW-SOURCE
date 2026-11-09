/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Set;

public class jmu {
    private final String nCb;
    private final jmd nuG;
    private final Set<String> nuH;
    private final Set<String> nuI;
    private final int nCc;
    private final int nCd;

    public jmu(String string, jmd jmd2, int n) {
        this(string, jmd2, (String[])null, null, n, n);
    }

    public jmu(String string, jmd jmd2, Collection<String> collection, Collection<String> collection2, int n, int n2) {
        this.nCb = string;
        this.nuG = jmd2;
        this.nCc = n;
        this.nCd = n2;
        if (collection == null) {
            this.nuH = null;
        } else {
            this.nuH = lcn.emx();
            for (String string2 : collection) {
                this.nuH.add(string2);
            }
        }
        if (collection2 == null) {
            this.nuI = null;
        } else {
            this.nuI = lcn.emx();
            for (String string2 : collection2) {
                this.nuI.add(string2);
            }
        }
    }

    public jmu(String string, jmd jmd2, String[] stringArray, String[] stringArray2, int n, int n2) {
        this.nCb = string;
        this.nuG = jmd2;
        this.nCc = n;
        this.nCd = n2;
        if (stringArray == null) {
            this.nuH = null;
        } else {
            this.nuH = lcn.emx();
            for (String string2 : stringArray) {
                this.nuH.add(string2);
            }
        }
        if (stringArray2 == null) {
            this.nuI = null;
        } else {
            this.nuI = lcn.emx();
            for (String string2 : stringArray2) {
                this.nuI.add(string2);
            }
        }
    }

    public final String dMK() {
        return this.nCb;
    }

    public final jmd dML() {
        return this.nuG;
    }

    public final Set<String> dMM() {
        return this.nuH;
    }

    public final void q(Set<String> set) {
        this.nuH.clear();
        if (set != null) {
            this.nuH.addAll(set);
        }
    }

    public final Set<String> dMN() {
        return this.nuI;
    }

    public final int dMO() {
        return this.nCc;
    }

    public final int dMP() {
        return this.nCd;
    }

    public boolean isEmpty() {
        if (this.nuH != null) {
            for (String string : this.nuH) {
                if (string == null || string.isEmpty()) continue;
                return false;
            }
        }
        if (this.nuI != null) {
            for (String string : this.nuI) {
                if (string == null || string.isEmpty()) continue;
                return false;
            }
        }
        return true;
    }
}

