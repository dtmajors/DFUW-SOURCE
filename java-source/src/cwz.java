/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cwz {
    int ResourceType;
    List<cwz> fGS;
    ctu bpC;
    int SkillType;
    float bqz;
    String fGT;
    String fGU;
    private boolean fGV;

    public cwz(int n2, ctu ctu2, float f2, int n3, boolean bl) {
        this.ResourceType = n2;
        this.bpC = ctu2;
        this.bqz = f2;
        this.SkillType = n3;
        this.fGT = lvm.sXa.bD(this.ResourceType).exA();
        this.fGU = this.fGT.toLowerCase();
        this.fGV = bl;
    }

    public int az() {
        return this.ResourceType;
    }

    public List<cwz> getChildren() {
        return this.fGS;
    }

    public int bfn() {
        return this.fGS != null ? this.fGS.size() : 0;
    }

    public ctu Dk() {
        return this.bpC;
    }

    public float Ds() {
        return this.bqz;
    }

    public int zg() {
        return this.SkillType;
    }

    public String bfo() {
        return this.fGT;
    }

    public String bfp() {
        return this.fGU;
    }

    public Set<Integer> bfq() {
        Set<Integer> set = lcn.emx();
        this.j(set);
        return set;
    }

    public void j(Set<Integer> set) {
        if (this.fGS != null && !this.fGS.isEmpty()) {
            if (this.bfr()) {
                for (cwz cwz2 : this.fGS) {
                    set.add(cwz2.az());
                }
            } else {
                for (cwz cwz3 : this.fGS) {
                    cwz3.j(set);
                }
            }
        } else {
            for (ctm ctm2 : this.bpC.Ingredients) {
                set.add(ctm2.ResourceType);
            }
        }
    }

    public int E(Map<Integer, Integer> map) {
        int n2 = 0;
        while (this.c(map, null)) {
            this.F(map);
            ++n2;
        }
        return n2;
    }

    public boolean c(Map<Integer, Integer> map, Map<Integer, Integer> map2) {
        boolean bl = true;
        if (this.fGS != null && !this.fGS.isEmpty()) {
            if (this.bfr()) {
                for (cwz cwz2 : this.fGS) {
                    Integer n2 = map.get(cwz2.az());
                    int n3 = (n2 != null ? n2 : 0) - 1;
                    if (n3 >= 0) continue;
                    if (map2 != null) {
                        Integer n4 = map2.get(cwz2.az());
                        map2.put(cwz2.az(), -n3 + (n4 != null ? n4 : 0));
                    }
                    bl = false;
                }
            } else {
                for (cwz cwz3 : this.fGS) {
                    bl = cwz3.c(map, map2) && bl;
                }
            }
        } else {
            for (ctm ctm2 : this.bpC.Ingredients) {
                Integer n5 = map.get(ctm2.ResourceType);
                int n6 = (n5 != null ? n5 : 0) - ctm2.asi;
                if (n6 >= 0) continue;
                if (map2 != null) {
                    Integer n7 = map2.get(ctm2.ResourceType);
                    map2.put(ctm2.ResourceType, -n6 + (n7 != null ? n7 : 0));
                }
                bl = false;
            }
        }
        return bl;
    }

    public void F(Map<Integer, Integer> map) {
        if (this.fGS != null && !this.fGS.isEmpty()) {
            for (cwz cwz2 : this.fGS) {
                cwz2.F(map);
            }
        } else {
            for (ctm ctm2 : this.bpC.Ingredients) {
                Integer n2 = map.get(ctm2.ResourceType);
                if (n2 == null) {
                    return;
                }
                map.put(ctm2.ResourceType, n2 - ctm2.asi);
            }
        }
    }

    public void print(int n2) {
        for (int i2 = 0; i2 < n2 * 4; ++i2) {
            System.out.print(" ");
        }
        System.out.println(this.fGT + "; required skill level " + this.bqz);
        if (this.fGS != null) {
            for (cwz cwz2 : this.fGS) {
                cwz2.print(n2 + 1);
            }
        }
    }

    public boolean bfr() {
        return this.fGV;
    }
}

