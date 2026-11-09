/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.HashMap;
import java.util.TreeMap;

public class hcg {
    public final hdm dXw;
    private final TreeMap<String, TreeMap<Integer, TreeMap<Integer, TreeMap<Boolean, hnb>>>> jFC = new TreeMap();
    private final HashMap<hnb, a> jFD = new HashMap();

    public hcg(hdm hdm2) {
        this.dXw = hdm2;
    }

    public hnb a(String string, int n, int n2, boolean bl) {
        TreeMap<Integer, TreeMap<Integer, TreeMap<Boolean, hnb>>> treeMap = null;
        TreeMap<Integer, TreeMap<Boolean, hnb>> treeMap2 = null;
        TreeMap<Boolean, hnb> treeMap3 = null;
        hnb hnb2 = null;
        treeMap = this.jFC.get(string);
        if (treeMap == null) {
            treeMap = new TreeMap();
            this.jFC.put(string, treeMap);
        }
        if ((treeMap2 = treeMap.get(n)) == null) {
            treeMap2 = new TreeMap();
            treeMap.put(n, treeMap2);
        }
        if ((treeMap3 = treeMap2.get(n2)) == null) {
            treeMap3 = new TreeMap();
            treeMap2.put(n2, treeMap3);
        }
        if ((hnb2 = treeMap3.get(bl)) == null) {
            hnb2 = new hnb(string, n, n2, bl);
            treeMap3.put(bl, hnb2);
        }
        return hnb2;
    }

    public lhf a(hnb hnb2, char c2) {
        a a2 = this.jFD.get(hnb2);
        if (a2 == null) {
            a2 = new a(this, hnb2);
            this.jFD.put(hnb2, a2);
        }
        return a2.d(c2);
    }

    public lhf b(hnb hnb2, char c2) {
        hnb hnb3 = this.a(hnb2.kNa, hnb2.kNb, hnb2.kNc, hnb2.kNd);
        return this.a(hnb3, c2);
    }

    public int a(hnb hnb2) {
        a a2 = this.jFD.get(hnb2);
        if (a2 == null) {
            a2 = new a(this, hnb2);
            this.jFD.put(hnb2, a2);
        }
        return a2.jFF;
    }

    public int b(hnb hnb2) {
        hnb hnb3 = this.a(hnb2.kNa, hnb2.kNb, hnb2.kNc, hnb2.kNd);
        return this.a(hnb3);
    }
}

