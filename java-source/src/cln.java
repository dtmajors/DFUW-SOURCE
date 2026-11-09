/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class cln {
    private Map<Integer, List<Integer>> eJb = lcn.emw();

    public boolean rE(int n) {
        return this.eJb.containsKey(n);
    }

    public int rC(int n) {
        for (Map.Entry<Integer, List<Integer>> entry : this.eJb.entrySet()) {
            for (Integer n2 : entry.getValue()) {
                if (n2 != n) continue;
                return entry.getKey();
            }
        }
        return -1;
    }

    public int rF(int n) {
        assert (this.rE(n));
        if (!this.rE(n)) {
            return -1;
        }
        List<Integer> list = this.eJb.get(n);
        double d2 = Math.random();
        double d3 = list.size();
        double d4 = d2 * d3;
        int n2 = (int)d4;
        n2 = lew.Q(n2, 0, list.size() - 1);
        return list.get(n2);
    }

    public void g(int n, List<Integer> list) {
        assert (!this.eJb.containsKey(n));
        this.eJb.put(n, list);
    }

    public final Map<Integer, List<Integer>> aSh() {
        return this.eJb;
    }

    public final void D(Map<Integer, List<Integer>> map) {
        this.eJb = map;
    }
}

