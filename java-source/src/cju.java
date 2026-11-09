/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class cju {
    private SortedMap<Integer, cjr> eEm = lcn.emD();
    public String eEn;
    public Map<Integer, lfs<Integer, String>> dPk = lcn.emw();
    public int eEo;
    public int eEp;
    public int eEq;
    public int eEr;
    private Map<Integer, List<cjp>> eEs = lcn.emw();

    public void b(int n, int n2, String string) {
        if (this.dPk.containsKey(n)) {
            assert (false);
            return;
        }
        this.dPk.put(n, new lfs<Integer, String>(n2, string));
    }

    public int qM(int n) {
        lfs<Integer, String> lfs2 = this.dPk.get(n);
        return lfs2 != null ? (Integer)lfs2.reX : -1;
    }

    public cjr qN(int n) {
        return (cjr)this.eEm.get(n);
    }

    public final SortedMap<Integer, cjr> aQi() {
        return this.eEm;
    }

    public final void a(SortedMap<Integer, cjr> sortedMap) {
        this.eEm = sortedMap;
    }

    public void a(int n, cjp cjp2) {
        List<cjp> list = this.eEs.get(n);
        if (list == null) {
            list = lcn.emv();
            this.eEs.put(n, list);
        }
        list.add(cjp2);
    }

    public List<cjp> qO(int n) {
        return this.eEs.get(n);
    }

    public final Map<Integer, lfs<Integer, String>> aQj() {
        return this.dPk;
    }
}

