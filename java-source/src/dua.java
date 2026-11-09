/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class dua {
    private static final String TC = "SFQuestDefinitionManager";
    private final Map<Integer, Integer> hdH = lcn.emw();
    private final Map<Integer, dty> hdI = lcn.emw();
    private final Map<Integer, due> hdJ = lcn.emw();
    private final Map<String, dty> hdK = lcn.emw();
    private final Map<String, due> hdL = lcn.emw();

    public void aM(List<dtz> list) {
        for (dtz dtz2 : list) {
            this.a(dtz2);
        }
    }

    private void a(dtz dtz2) {
        Integer n = dtz2.ID;
        switch (dtz2.Type) {
            case hdM: {
                dty dty2 = (dty)dtz2;
                this.hdI.put(dty2.ID, dty2);
                this.hdK.put(dty2.Name.toLowerCase(), dty2);
                int n2 = lea.enW().getType(dty2.FactionAvatar);
                if (n2 == -1) {
                    lfn.b(5, TC, "addQuestDefinition() There is no faction avatar set for Quest ID : " + n + " in file : " + dtz2.Filename);
                    break;
                }
                Integer n3 = this.hdH.get(n2);
                n3 = n3 != null ? Integer.valueOf(n3 + 1) : Integer.valueOf(1);
                this.hdH.put(n2, n3);
                break;
            }
            case hdN: 
            case hdO: 
            case hdP: 
            case hdQ: 
            case hdR: 
            case hdS: {
                due due2 = (due)dtz2;
                this.hdJ.put(due2.ID, due2);
                this.hdL.put(due2.Name.toLowerCase(), due2);
            }
        }
    }

    public dty Cf(int n) {
        return this.hdI.get(n);
    }

    public due Cg(int n) {
        return this.hdJ.get(n);
    }

    public due bZ(int n, int n2) {
        dty dty2 = this.hdI.get(n);
        if (dty2 == null) {
            lfn.b(5, TC, "getSimpleQuestDefinitionFromIndex() There is no SFComplexQuestDefinition with ComplexQuestDefinitionID : " + n);
            assert (false);
            return null;
        }
        if (n2 >= dty2.SubQuestIDs.length) {
            lfn.b(5, TC, "getSimpleQuestDefinitionFromIndex() SubQuestIndex : " + n2 + " SubQuestIDs Length : " + dty2.SubQuestIDs.length);
            assert (false);
            return null;
        }
        int n3 = dty2.SubQuestIDs[n2];
        return this.hdJ.get(n3);
    }

    public String Ch(int n) {
        dty dty2 = this.hdI.get(n);
        return dty2 != null ? dty2.Name : null;
    }

    public String Ci(int n) {
        due due2 = this.hdJ.get(n);
        return due2 != null ? due2.Name : null;
    }

    public int ju(String string) {
        dty dty2 = this.hdK.get(string.toLowerCase());
        if (dty2 != null) {
            return dty2.ID;
        }
        due due2 = this.hdL.get(string.toLowerCase());
        if (due2 != null) {
            return due2.ID;
        }
        return -1;
    }

    @Deprecated
    public boolean Cj(int n) {
        if (this.hdJ.isEmpty()) {
            return false;
        }
        return this.hdJ.containsKey(n);
    }

    public int Ck(int n) {
        for (dty dty2 : this.hdI.values()) {
            int[] nArray;
            for (int n2 : nArray = dty2.SubQuestIDs) {
                if (n2 != n) continue;
                return dty2.ID;
            }
        }
        return -1;
    }

    public final Map<Integer, Integer> bAJ() {
        return this.hdH;
    }

    public boolean jv(String string) {
        int n = lea.enW().getType(string);
        if (n == -1) {
            return false;
        }
        return this.hdH.containsKey(n);
    }

    @Deprecated
    public void Cl(int n) {
        dty dty2 = this.hdI.remove(n);
        if (dty2 == null) {
            return;
        }
        for (int n2 : dty2.SubQuestIDs) {
            due due2 = this.hdJ.remove(n2);
        }
    }

    public Map<Integer, due> bAK() {
        return this.hdJ;
    }

    public Map<Integer, dty> bAL() {
        return this.hdI;
    }
}

