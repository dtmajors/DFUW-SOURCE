/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jjg
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class jjj {
    jjg nmT;
    private jjk nmU;
    private boolean mxb;
    private HashSet<jjh> nmV = new HashSet();
    private HashMap<ldv, jjh> nmW = new HashMap();
    private jjm[] nmX;

    public jjj(jjk jjk2, boolean bl, jjm[] jjmArray) {
        this.nmU = jjk2;
        this.mxb = this.nmU == jjk.nno ? true : bl;
        this.nmX = jjmArray;
    }

    public jjk dJO() {
        return this.nmU;
    }

    public boolean isVisible() {
        return this.mxb;
    }

    public void setVisible(boolean bl) {
        if (this.nmU == jjk.nno) {
            return;
        }
        if (bl == this.mxb) {
            return;
        }
        this.mxb = bl;
        for (jjf jjf2 : this.nmT.nkT) {
            jjf2.a(this);
        }
    }

    public HashSet<jjh> dJP() {
        return this.nmV;
    }

    public void F(jjh jjh2) {
        if (jjh2.nlU != null) {
            return;
        }
        this.nmV.add(jjh2);
        if (jjh2.getGUID() != null) {
            this.nmW.put(jjh2.getGUID(), jjh2);
        }
        jjh2.nlU = this;
        for (jjf jjf2 : this.nmT.nkT) {
            jjf2.a(jjh2);
        }
    }

    public void G(jjh jjh2) {
        if (jjh2.nlU != this) {
            return;
        }
        for (jjf jjf2 : this.nmT.nkT) {
            jjf2.b(jjh2);
        }
        this.nmV.remove(jjh2);
        if (jjh2.getGUID() != null) {
            this.nmW.remove(jjh2.getGUID());
        }
        jjh2.nlU = null;
    }

    public void dJQ() {
        HashSet<jjh> hashSet = new HashSet<jjh>();
        hashSet.addAll(this.nmV);
        for (jjh jjh2 : hashSet) {
            this.G(jjh2);
        }
    }

    public jjh rU(ldv ldv2) {
        return this.nmW.get(ldv2);
    }

    public jjh rV(ldv ldv2) {
        for (jjh jjh2 : this.nmV) {
            if (jjh2.oq() == null || !jjh2.oq().equals(ldv2)) continue;
            return jjh2;
        }
        return null;
    }

    public jjh a(jjm jjm2, ldv ldv2) {
        for (jjh jjh2 : this.nmV) {
            if (jjh2.dJr() != jjm2 || jjh2.oq() == null || !jjh2.oq().equals(ldv2)) continue;
            return jjh2;
        }
        return null;
    }

    public jjh a(jjm jjm2) {
        if (this.d(jjm2)) {
            for (jjh jjh2 : this.nmV) {
                if (jjh2.dJr() != jjm2) continue;
                return jjh2;
            }
        }
        return null;
    }

    public jjh a(jjm jjm2, ljq ljq2) {
        if (this.d(jjm2)) {
            for (jjh jjh2 : this.nmV) {
                if (jjh2.dJr() != jjm2 || !jjh2.av().ew(ljq2)) continue;
                return jjh2;
            }
        }
        return null;
    }

    public jjh cZ(ljq ljq2) {
        for (jjh jjh2 : this.nmV) {
            ljq ljq3 = jjh2.av();
            if (!ljq3.ew(ljq2)) continue;
            return jjh2;
        }
        return null;
    }

    public jjh Vb(int n) {
        for (jjh jjh2 : this.nmV) {
            if (jjh2.getId() != n) continue;
            return jjh2;
        }
        return null;
    }

    public jjh ab(String string, String string2) {
        for (jjh jjh2 : this.nmV) {
            String string3;
            if (jjh2.dJx() == null || (string3 = jjh2.getAttribute(string)) == null || !string3.equalsIgnoreCase(string2)) continue;
            return jjh2;
        }
        return null;
    }

    public jjh sw(String string) {
        return this.ab("Name", string);
    }

    public void a(Set<String> set, Set<jjh> set2) {
        for (jjh jjh2 : this.nmV) {
            String string = jjh2.dJK();
            if (string == null || string.isEmpty() || !set.contains(string)) continue;
            set2.add(jjh2);
        }
    }

    public jjh y(ljq ljq2, float f2) {
        jjh jjh2 = null;
        float f3 = Float.MAX_VALUE;
        for (jjh jjh3 : this.nmV) {
            ljq ljq3 = jjh3.av();
            float f4 = ljq3.ez(ljq2);
            if (!(f4 < f3) || !(f4 < f2)) continue;
            jjh2 = jjh3;
            f3 = f4;
        }
        return jjh2;
    }

    public jjh da(ljq ljq2) {
        return this.y(ljq2, Float.MAX_VALUE);
    }

    public jjm[] dJR() {
        return this.nmX;
    }

    public boolean d(jjm jjm2) {
        for (jjm jjm3 : this.nmX) {
            if (jjm3 != jjm2) continue;
            return true;
        }
        return false;
    }

    public int e(jjm jjm2) {
        int n = 0;
        for (jjh jjh2 : this.nmV) {
            if (jjh2.dJr() != jjm2) continue;
            ++n;
        }
        return n;
    }

    public void a(ldv ldv2, ArrayList<jjh> arrayList) {
        for (jjh jjh2 : this.nmV) {
            if (jjh2.oq() == null || !jjh2.oq().equals(ldv2)) continue;
            arrayList.add(jjh2);
        }
    }

    public boolean dJS() {
        return this.nmU != jjk.nnn && this.nmU != jjk.nnl;
    }

    public void a(String string, List<jjh> list, boolean bl) {
        if (this.dJS()) {
            for (jjh jjh2 : this.nmV) {
                jjh2.a(string, list, bl);
            }
        }
    }

    void H(jjh jjh2) {
        this.nmW.put(jjh2.getGUID(), jjh2);
    }
}

