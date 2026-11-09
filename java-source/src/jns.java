/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Map;
import java.util.Set;

public class jns {
    private static final jns nEp = new jns();
    private static Map<String, jns> nEq = null;
    private static Map<String, Boolean> nEr = null;
    private jns nEs = null;
    private Map<jnt, jns> nEt = null;
    private jnt nEu = null;
    private hc nEv = null;
    private int bcB = 0;
    private Set<String> nEw = null;

    public static void I(String string, boolean bl) {
        if (nEr == null) {
            nEr = lcn.emw();
        }
        nEr.put(string, bl);
    }

    public static boolean sS(String string) {
        return nEr == null ? false : nEr.containsKey(string);
    }

    public static boolean sT(String string) {
        return jns.sS(string) ? nEr.get(string) : false;
    }

    public jns dNU() {
        return this.nEs;
    }

    public boolean dNV() {
        return this.nEt != null && !this.nEt.isEmpty();
    }

    public int dNW() {
        return this.nEt == null ? 0 : this.nEt.size();
    }

    public boolean dNX() {
        return this.nEw != null && !this.nEw.isEmpty();
    }

    public int dNY() {
        return this.nEw == null ? 0 : this.nEw.size();
    }

    public jnt dNZ() {
        return this.nEu;
    }

    public boolean isVisible() {
        if (this.bcB != 0 && this.bcB != lcw.bcB) {
            return false;
        }
        if (this.nEv == null || lcw.SC == null) {
            return false;
        }
        if (this.nEv.ordinal() > lcw.SC.ordinal()) {
            return false;
        }
        return this.nEs == null ? true : this.nEs.isVisible();
    }

    public boolean dOa() {
        return this.nEu == null ? false : (this.nEu.dOa() ? true : (this.nEs == null ? false : this.nEs.dOa()));
    }

    public boolean dOb() {
        return this.nEu == null ? false : (this.nEu.dOb() ? true : (this.nEs == null ? false : this.nEs.dOb()));
    }

    public boolean dOc() {
        return this.nEu == null ? false : (this.nEu.dOc() ? true : (this.nEs == null ? false : this.nEs.dOc()));
    }

    public boolean dOd() {
        return this.nEu == null ? false : (this.nEu.dOd() ? true : (this.nEs == null ? false : this.nEs.dOd()));
    }

    public boolean cTR() {
        return this.nEu == null ? false : (this.nEu.cTR() ? true : (this.nEs == null ? false : this.nEs.cTR()));
    }

    public boolean dOe() {
        return this.nEu == null ? false : (this.nEu.dOe() ? true : (this.nEs == null ? false : this.nEs.dOe()));
    }

    public boolean a(jnt jnt2) {
        return this.nEu == null ? false : (this.nEu == jnt2 ? true : (this.nEs == null ? false : this.nEs.a(jnt2)));
    }

    public boolean isRoot() {
        return this.nEs == null && (this.nEu == null || this.nEu == jnt.nEx);
    }

    private jns() {
        this.nEu = jnt.nEx;
        this.nEv = hc.aaz;
        this.nEt = lcn.emw();
        this.bcB = 0;
    }

    private jns(jns jns2, jnt jnt2, hc hc2, int n) {
        this.nEs = jns2;
        this.nEu = jnt2;
        this.nEv = hc2 == null ? hc.aaz : hc2;
        this.bcB = n;
    }

    public boolean b(jnt jnt2) {
        return this.dNV() ? this.nEt.containsKey((Object)jnt2) : false;
    }

    private jns a(jnt[] jntArray, int n) {
        if (jntArray == null || jntArray.length == 0 || n < 0 || n >= jntArray.length) {
            return null;
        }
        if (this.isRoot()) {
            jns jns2 = this.c(jntArray[0]);
            return jns2 == null ? null : jns2.a(jntArray, 0);
        }
        if (this.nEu != jntArray[n]) {
            return null;
        }
        int n2 = n + 1;
        if (n2 >= jntArray.length) {
            return this;
        }
        jns jns3 = this.c(jntArray[n2]);
        return jns3 == null ? null : jns3.a(jntArray, n2);
    }

    private jns c(jnt jnt2) {
        return this.dNV() ? this.nEt.get((Object)jnt2) : null;
    }

    public jns[] dOf() {
        return this.dNV() ? this.nEt.values().toArray(new jns[this.nEt.size()]) : new jns[]{};
    }

    public jns a(jnt jnt2, hc hc2, int n) {
        jns jns2;
        if (jnt2 == null || jnt2 == jnt.nEx || this.a(jnt2)) {
            return null;
        }
        if (this.nEt == null) {
            this.nEt = lcn.emw();
        }
        if ((jns2 = this.nEt.get((Object)jnt2)) == null) {
            jns2 = new jns(this, jnt2, hc2, n);
            this.nEt.put(jnt2, jns2);
        }
        return jns2;
    }

    public boolean sU(String string) {
        return this.nEw == null ? false : this.nEw.contains(string);
    }

    public void sV(String string) {
        if (this.isRoot()) {
            return;
        }
        if (this.sU(string)) {
            return;
        }
        if (this.nEw == null) {
            this.nEw = lcn.emx();
        }
        this.nEw.add(string);
    }

    private void dOg() {
        if (this.dNX()) {
            for (String object : this.nEw) {
                nEq.put(object, this);
            }
        }
        if (this.dNV()) {
            for (jns jns2 : this.nEt.values()) {
                jns2.dOg();
            }
        }
    }

    public String toString() {
        return (this.nEs == null ? "\\" : this.nEs.toString()) + (this.nEu == jnt.nEx ? "" : this.nEu.toString() + "\\");
    }

    public static jns dOh() {
        return nEp;
    }

    public static jns a(jnt ... jntArray) {
        return nEp.a(jntArray, 0);
    }

    public static jns sW(String string) {
        if (nEq == null) {
            nEq = lcn.emw();
            nEp.dOg();
        }
        return nEq.get(string);
    }
}

