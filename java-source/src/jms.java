/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class jms {
    public final jme nuJ;
    private Map<String, jmr> nBU = lcn.emw();
    private Map<String, Set<jmr>> nBV = lcn.emw();
    private Map<String, Set<jmr>> nBW = lcn.emw();
    private Set<jmr> nBX = lcn.emx();
    private Set<jmr> nBY = lcn.emx();
    private jmr nBZ = null;
    private Set<jmt> nCa = lcn.emx();

    public jms(jme jme2) {
        this.nuJ = jme2;
        for (jmv.a a2 : jmv.nCe) {
            this.b(a2.iNW, a2.iMe, 0);
        }
    }

    public jmr l(jmq jmq2) {
        for (jmr jmr2 : this.nBU.values()) {
            if (jmr2.iMe != jmq2) continue;
            return jmr2;
        }
        return null;
    }

    public void dMI() {
        this.nBU.clear();
        this.nBV.clear();
        this.nBW.clear();
    }

    public jmr a(jmu jmu2, jmq jmq2, int n) {
        this.d(jmq2, n);
        jmr jmr2 = this.b(jmu2, jmq2, n);
        for (jmt jmt2 : this.nCa) {
            jmt2.a(jmr2);
        }
        return jmr2;
    }

    public void a(jmt jmt2) {
        this.nCa.add(jmt2);
    }

    public void b(jmt jmt2) {
        this.nCa.remove(jmt2);
    }

    public jmr b(jmu jmu2, jmq jmq2, int n) {
        String string = jmr.c(jmq2, n);
        if (this.nBU.containsKey(string)) {
            assert (false);
            this.d(jmq2, n);
        }
        if (jmu2.dMK() != null) {
            jmr jmr2;
            assert (jmu2.dML() != null);
            assert (jmu2.dML() != jmd.nvc);
            Set<jmr> set = this.nBV.get(jmu2.dMK());
            if (set == null) {
                set = lcn.emx();
                this.nBV.put(jmu2.dMK(), set);
            }
            if (set.contains(jmr2 = new jmr(jmu2, jmq2, n))) {
                assert (false) : "Inconsistent binding maps";
                return null;
            }
            set.add(jmr2);
            this.nBU.put(string, jmr2);
            return jmr2;
        }
        jmr jmr3 = new jmr(jmu2, jmq2, n);
        if (jmu2.dMM() != null) {
            for (String string2 : jmu2.dMM()) {
                Set<jmr> set = this.nBW.get(string2);
                if (set == null) {
                    set = lcn.emx();
                    this.nBW.put(string2, set);
                }
                if (set.contains(jmr3)) assert (false);
                set.add(jmr3);
            }
        }
        this.nBU.put(string, jmr3);
        return jmr3;
    }

    public boolean d(jmq jmq2, int n) {
        String string = jmr.c(jmq2, n);
        if (!this.nBU.containsKey(string)) {
            return false;
        }
        jmr jmr2 = this.nBU.remove(string);
        for (String string2 : this.nBV.keySet()) {
            this.nBV.get(string2).remove(jmr2);
        }
        for (String string2 : this.nBW.keySet()) {
            this.nBW.get(string2).remove(jmr2);
        }
        return true;
    }

    public void a(jmf jmf2, jmi jmi2) {
        Set<jmr> set = this.nBV.get(jmf2.dMs());
        if (set != null) {
            for (jmr jmr2 : set) {
                if (jmr2.iNW.dML() != jmd.nvd || !this.a(jmr2.iNW, jmi2, hso.cxK().cxN(), false, jmr2)) continue;
                this.g(jmr2);
            }
        }
        if ((set = this.nBV.get(jmf2.dMr())) != null) {
            for (jmr jmr2 : set) {
                if (jmr2.iNW.dML() != jmd.nvd || !this.a(jmr2.iNW, jmi2, hso.cxK().cxN(), false, jmr2)) continue;
                this.g(jmr2);
            }
        }
    }

    public void b(jmf jmf2, jmi jmi2) {
        Set<jmr> set = this.nBV.get(jmf2.dMs());
        if (set != null) {
            for (jmr jmr2 : set) {
                if (jmr2.iNW.dML() != jmd.nve || !this.a(jmr2.iNW, jmi2, hso.cxK().cxN(), false, jmr2)) continue;
                this.g(jmr2);
            }
        }
        if ((set = this.nBV.get(jmf2.dMr())) != null) {
            for (jmr jmr2 : set) {
                if (jmr2.iNW.dML() != jmd.nve || !this.a(jmr2.iNW, jmi2, hso.cxK().cxN(), false, jmr2)) continue;
                this.g(jmr2);
            }
        }
    }

    public void a(jmf jmf2, jmi jmi2, double d2) {
        Set<jmr> set = this.nBV.get(jmf2.dMs());
        if (set != null) {
            for (jmr jmr2 : set) {
                if (jmr2.iNW.dML() != jmd.nvf || !this.a(jmr2.iNW, jmi2, hso.cxK().cxN(), false, jmr2)) continue;
                this.a(jmr2, d2);
            }
        }
        if ((set = this.nBV.get(jmf2.dMr())) != null) {
            for (jmr jmr2 : set) {
                if (jmr2.iNW.dML() != jmd.nvf || !this.a(jmr2.iNW, jmi2, hso.cxK().cxN(), false, jmr2)) continue;
                this.a(jmr2, d2);
            }
        }
    }

    public void a(jmi jmi2) {
        Collection<jmf> collection = jmi2.dMB();
        Set<jmr> set = this.nBX;
        this.nBX = this.nBY;
        this.nBY = set;
        this.nBY.clear();
        for (jmr object : this.nBU.values()) {
            object.nBT = false;
        }
        if (collection != null) {
            int n = this.nuJ.getMessageDelegator().arc().lpr;
            for (jmf jmf2 : collection) {
                Set<jmr> set2 = this.nBW.get(jmf2.dMr());
                if (set2 != null) {
                    for (jmr jmr2 : set2) {
                        jmr2.nBT = true;
                        if (!this.a(jmr2.iNW, jmi2, hso.cxK().cxN(), jmr2.nBP >= n - 1, jmr2)) continue;
                        ++jmr2.nBQ;
                        this.h(jmr2);
                        this.nBY.add(jmr2);
                    }
                }
                if ((set2 = this.nBW.get(jmf2.dMs())) == null) continue;
                for (jmr jmr2 : set2) {
                    jmr2.nBT = true;
                    if (!this.a(jmr2.iNW, jmi2, hso.cxK().cxN(), jmr2.nBP >= n - 1, jmr2)) continue;
                    ++jmr2.nBQ;
                    this.h(jmr2);
                    this.nBY.add(jmr2);
                }
            }
        }
        for (jmr jmr3 : this.nBU.values()) {
            if (jmr3.nBT) continue;
            jmr3.nBS = 0;
        }
        if (!this.nBX.isEmpty()) {
            for (jmr jmr4 : this.nBX) {
                if (this.nBY.contains(jmr4)) continue;
                jmr4.nBQ = 0;
                this.h(jmr4);
            }
        }
    }

    private void g(jmr jmr2) {
        jmr2.nBP = this.nuJ.getMessageDelegator().arc().lpr;
        this.nBZ = jmr2;
        this.nuJ.dMa().k(jmr2.iMe);
    }

    private void h(jmr jmr2) {
        jmr2.nBP = this.nuJ.getMessageDelegator().arc().lpr;
        this.nBZ = jmr2;
        this.nuJ.dMa().b(jmr2.iMe, jmr2.nBQ);
    }

    private void a(jmr jmr2, double d2) {
        jmr2.nBP = this.nuJ.getMessageDelegator().arc().lpr;
        this.nBZ = jmr2;
        this.nuJ.dMa().b(jmr2.iMe, d2 *= jmr2.dMH());
    }

    private boolean a(jmu jmu2, jmi jmi2, jnz jnz2, boolean bl, jmr jmr2) {
        Set<String> set;
        int n = 1 << jnz2.ordinal();
        if ((jmu2.dMO() & n) == 0) {
            if (!bl) {
                return false;
            }
            if ((jmu2.dMP() & n) == 0) {
                return false;
            }
        }
        if ((set = jmu2.dMM()) != null && !set.isEmpty()) {
            for (String string : set) {
                if (jmi2.sF(string)) continue;
                jmr2.nBS = 1;
                return false;
            }
        }
        if ((set = jmu2.dMN()) != null && !set.isEmpty()) {
            for (String string : set) {
                if (jmi2.sG(string)) continue;
                jmr2.nBS = 2;
                return false;
            }
        }
        return jmr2.nBS != 2;
    }

    public jmr dMJ() {
        return this.nBZ;
    }

    public jmr sL(String string) {
        return this.nBU.get(string);
    }
}

