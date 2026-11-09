/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cwx
 *  cxd
 *  cxg
 *  lcw
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cwy {
    private static final int fGz = 0;
    private static final int fGA = 1;
    private static final int fGB = 2;
    private static final int fGC = 1;
    private static final float fGD = 0.0f;
    public static final csv fGE = new csv();
    public static final csv brg = new csv();
    public static final csv brh = new csv();
    public static final csv fGF = new csv();
    public static final csv fGG = new csv();
    public static final csv fGH = new csv();
    public static final csv fGI = new csv();
    public static final csv fGJ = new csv();
    private static Map<Integer, ctu>[] fGK = null;
    public static final boolean fGL = false;
    private static final float fGM = 0.05f;
    private static final float fGN = 0.05f;
    private static final float fGO = 0.1f;
    private static Map<Integer, List<cwz>> fGP = null;
    private static int fGQ = -1;
    private static les ResourceTree = lea.enW();
    private static cwy fGR = new cwy();

    @Deprecated
    public static int[] a(cxc cxc2, ctu ctu2) {
        if (cxc2 == null) {
            lfn.b(5, "SFCraftingConstants", "getAvailableIngredientQuantities() Skill is null.");
            return null;
        }
        if (ctu2 == null) {
            lfn.b(5, "SFCraftingConstants", "getAvailableIngredientQuantities() Recipe is null.");
            return null;
        }
        if (!(cxc2 instanceof cwx)) {
            lfn.b(5, "SFCraftingConstants", "getAvailableIngredientQuantities() Skill '" + cxc2.getName() + "' is not an activeskill.");
            return null;
        }
        cwx cwx2 = (cwx)cxc2;
        aja[] ajaArray = cwx2.bek();
        if (ajaArray == null) {
            lfn.b(5, "SFCraftingConstants", "getAvailableIngredientQuantities() CraftingSkill '" + cxc2.getName() + "' contains no constraints.");
            return null;
        }
        boolean bl = true;
        int n2 = ajaArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(ajaArray[i2] instanceof ajd)) continue;
            return ((ajd)ajaArray[i2]).a(ctu2);
        }
        lfn.b(5, "SFCraftingConstants", "getAvailableIngredientQuantities() Skill '" + cxc2.getName() + "' contains no CraftingIngredientConstraint.");
        return null;
    }

    public static float b(cxc cxc2, ctu ctu2) {
        if (cxc2 == null) {
            lfn.b(5, "SFCraftingConstants", "getCraftingChanceOfSuccess() Skill is null.");
            return 0.0f;
        }
        if (ctu2 == null) {
            lfn.b(5, "SFCraftingConstants", "getCraftingChanceOfSuccess() Recipe is null.");
            return 0.0f;
        }
        if (!(cxc2 instanceof cwx)) {
            lfn.b(5, "SFCraftingConstants", "getCraftingChanceOfSuccess() Skill '" + cxc2.getName() + "' is not an activeskill.");
            return 0.0f;
        }
        cxc cxc3 = null;
        if (ctu2.bbI() != null && ctu2.bbI()[0].SkillType != cxc2.SkillType) {
            cxc3 = cxc2.emI.ht(ctu2.bbI()[0].SkillType);
        }
        if (!(cxc3 instanceof cwx)) {
            cxc3 = null;
        }
        if (cxc2.zg() == cxd.fLV) {
            return 1.0f;
        }
        float f2 = cxg.a((cxc)(cxc3 == null ? cxc2 : cxc3), (int)1537, (ctu)ctu2);
        if (f2 < 0.0f) {
            lfn.b(5, "SFCraftingConstants", "getCraftingChanceOfSuccess() ChanceOfSuccess < 0.0f");
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return f2;
    }

    public static ctm[] c(cxc cxc2, ctu ctu2) {
        if (cxc2 == null) {
            lfn.b(5, "SFCraftingConstants", "getCraftingIngredients() Skill is null.");
            return null;
        }
        if (ctu2 == null) {
            lfn.b(5, "SFCraftingConstants", "getCraftingIngredients() Recipe is null.");
            return null;
        }
        if (!(cxc2 instanceof cwx)) {
            lfn.b(5, "SFCraftingConstants", "getCraftingIngredients() Skill '" + cxc2.getName() + "' is not an activeskill.");
            return null;
        }
        assert (ctu2.Ingredients != null);
        assert (ctu2.Ingredients.length > 0);
        ctm[] ctmArray = new ctm[ctu2.Ingredients.length];
        System.arraycopy(ctu2.Ingredients, 0, ctmArray, 0, ctu2.Ingredients.length);
        return ctmArray;
    }

    public static ctu bm(int n2, int n3) {
        if (n2 <= 0) {
            lfn.b(5, "SFCraftingConstants", "getCraftingRecipe() CraftingSkillType is invalid.");
            return null;
        }
        if (n3 <= 0) {
            lfn.b(5, "SFCraftingConstants", "getCraftingRecipe() ResourceType is invalid.");
            return null;
        }
        return cwy.xj(n2).get(n3);
    }

    public static int[] bfh() {
        return new int[]{0, 1, 2};
    }

    public static Map<Integer, ctu> xh(int n2) {
        if (n2 != 0 && n2 != 1 && n2 != 2) {
            return null;
        }
        return fGK[n2];
    }

    public static int xi(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFCraftingConstants", "getCraftingRecipeMap() CraftingSkillType is invalid.");
            assert (false);
            return -1;
        }
        if (n2 == cxd.fLV) {
            return 1;
        }
        return 0;
    }

    public static Map<Integer, ctu> xj(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFCraftingConstants", "getCraftingRecipeMap() CraftingSkillType is invalid.");
            return null;
        }
        if (n2 == cxd.fLV) {
            return fGK[1];
        }
        return fGK[0];
    }

    public static int[] d(int n2, int n3, boolean bl) {
        if (n2 <= 0) {
            lfn.b(5, "SFCraftingConstants", "getCraftingResourceRoots() CraftingSkillType is invalid.");
            return null;
        }
        if (n3 <= 0) {
            lfn.b(5, "SFCraftingConstants", "getCraftingResourceRoots() WorkStationResourceType is invalid.");
            return null;
        }
        for (Map.Entry<cut, cus> entry : lea.yq(false).entrySet()) {
            cut cut2 = entry.getKey();
            if (cut2.fyi != n2 || cut2.fyj != n3) continue;
            cus cus2 = entry.getValue();
            return cus2.fxM;
        }
        if (!bl) {
            lfn.b(5, "SFCraftingConstants", "getCraftingResourceRoots() No workstationinfo found for craftingskill '" + lea.enZ().getName(n2) + "'");
        }
        return null;
    }

    public static float a(cwx cwx2, ctu ctu2) {
        if (cwx2 == null) {
            lfn.b(5, "SFCraftingConstants", "getCraftingSkillLevel() Skill is null.");
            return 0.0f;
        }
        if (ctu2 == null) {
            lfn.b(5, "SFCraftingConstants", "getCraftingSkillLevel() Recipe is null.");
            return 0.0f;
        }
        ctz[] ctzArray = ctu2.bbI();
        if (ctzArray == null) {
            return cwx2.bfw();
        }
        int n2 = ctzArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!ctzArray[i2].fgt) continue;
            return cwx2.aJz().yQ(ctzArray[i2].SkillType);
        }
        return cwx2.bfw();
    }

    public static double a(cxc cxc2, ctu ctu2, int n2, int n3, int n4) {
        if (cxc2 == null) {
            lfn.b(5, "SFCraftingConstants", "getEstimatedCraftingTime() Skill is null.");
            return 0.0;
        }
        if (ctu2 == null) {
            lfn.b(5, "SFCraftingConstants", "getEstimatedCraftingTime() Recipe is null.");
            return 0.0;
        }
        if (!(cxc2 instanceof cwx)) {
            lfn.b(5, "SFCraftingConstants", "getEstimatedCraftingTime() Skill '" + cxc2.getName() + "' is not an activeskill.");
            return 0.0;
        }
        cxc cxc3 = null;
        if (ctu2.bbI() != null && ctu2.bbI()[0].SkillType != cxc2.SkillType) {
            cxc3 = cxc2.emI.ht(ctu2.bbI()[0].SkillType);
        }
        if (!(cxc3 instanceof cwx)) {
            cxc3 = null;
        }
        double d2 = cxg.a((cxc)(cxc3 == null ? cxc2 : cxc3), (int)1538, (ctu)ctu2);
        d2 = d2 * (cug.we((int)n2) ? 0.75 : 1.0) + 0.0;
        if (lcw.emX() && n4 > 0) {
            float f2 = n4 * lea.epF();
            double d3 = d2 * (double)n3 - (double)f2;
            if (d3 < lea.fT(cxc2.zg(), n3)) {
                d3 = lea.fT(cxc2.zg(), n3);
            }
            d2 = d3 / (double)n3;
        }
        if (d2 < 0.0) {
            lfn.b(5, "SFCraftingConstants", "getEstimatedCraftingTime() CraftingTime < 0.0");
            d2 = 0.0;
        }
        return d2;
    }

    public static boolean a(cxc cxc2, int n2) {
        if (cxc2 == null) {
            lfn.b(5, "SFCraftingConstants", "isAvailableForCrafting() Skill is null.");
            return false;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFCraftingConstants", "isAvailableForCrafting() ResourceType is invalid.");
            return false;
        }
        if (!(cxc2 instanceof cwx)) {
            lfn.b(5, "SFCraftingConstants", "isAvailableForCrafting() Skill '" + cxc2.getName() + "' is not an activeskill.");
            return false;
        }
        ctu ctu2 = cwy.bm(cxc2.zg(), n2);
        if (ctu2 == null) {
            return false;
        }
        return cwy.d(cxc2, ctu2);
    }

    public static boolean a(bsn bsn2, boolean bl) {
        Map<cut, cus> map = lea.yq(bl);
        for (cus cus2 : map.values()) {
            if (bsn2.getType() != cus2.fyh.fyi) continue;
            return true;
        }
        return false;
    }

    private static boolean d(cxc cxc2, ctu ctu2) {
        if (cxc2 == null) {
            lfn.b(5, "SFCraftingConstants", "checkRecipeRequirements() Skill is null.");
            return false;
        }
        if (ctu2 == null) {
            lfn.b(5, "SFCraftingConstants", "checkRecipeRequirements() Recipe is null.");
            return false;
        }
        if (!(cxc2 instanceof cwx)) {
            lfn.b(5, "SFCraftingConstants", "checkRecipeRequirements() Skill '" + cxc2.getName() + "' is not an activeskill.");
            return false;
        }
        cwx cwx2 = (cwx)cxc2;
        aja[] ajaArray = cwx2.bek();
        if (ajaArray == null) {
            lfn.b(5, "SFCraftingConstants", "checkRecipeRequirements() CraftingSkill '" + cxc2.getName() + "' contains no constraints.");
            return false;
        }
        int n2 = ajaArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(ajaArray[i2] instanceof aje)) continue;
            return ((aje)ajaArray[i2]).b(ctu2);
        }
        lfn.b(5, "SFCraftingConstants", "checkRecipeRequirements() CraftingSkill '" + cxc2.getName() + "' contains no CraftingRequirementConstraint.");
        return false;
    }

    private static ctm i(cwx cwx2) {
        assert (cwx2 != null);
        aja[] ajaArray = cwx2.bek();
        if (ajaArray == null) {
            lfn.b(5, "SFCraftingConstants", "getCraftingToolIngredient() CraftingSkill '" + cwx2.getName() + "' contains no constraints.");
            return null;
        }
        int n2 = ajaArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ake ake2;
            if (!(ajaArray[i2] instanceof ake) || !ResourceTree.k((ake2 = (ake)ajaArray[i2]).az(), cug.fmO, false)) continue;
            ctm ctm2 = new ctm();
            ctm2.ResourceType = ake2.az();
            ctm2.asi = ake2.vf();
            return ctm2;
        }
        lfn.b(5, "SFCraftingConstants", "getCraftingToolIngredient() CraftingSkill '" + cwx2.getName() + "' contains no ResourceQuantityConstraint for the tool.");
        return null;
    }

    public static float C(int n2, boolean bl) {
        ctu ctu2;
        int n3 = n2;
        if (cug.wm((int)n2)) {
            n3 = cug.wn((int)n2);
        }
        if ((ctu2 = fGK[0].get(n3)) == null) {
            return 0.0f;
        }
        int n4 = 0;
        for (ctm ctm2 : ctu2.Ingredients) {
            if (ctm2.ResourceType != cug.fkb) continue;
            n4 = ctm2.asi;
            break;
        }
        if (bl) {
            n4 = Math.max(1, (int)((float)n4 * 0.9f));
        }
        return (int)((float)n4 * (bl ? 0.05f : 0.05f));
    }

    private cwy() {
        this.bfi();
        this.bfj();
    }

    private void bfi() {
        fGK = new Map[3];
        cwy.fGK[0] = lcn.emw();
        cwy.fGK[1] = lcn.emw();
        cwy.fGK[2] = lcn.emw();
    }

    private void bfj() {
        csv csv2 = fGE;
        csv2.bnM = 1234;
        csv2.fdT = false;
        csv2.fdW = -0.02f;
        csv2.fdU = 0.05f;
        csv2.fdX = -0.02f;
        csv2.fdV = 0.05f;
        csv2 = brg;
        csv2.bnM = 0;
        csv2.fdT = false;
        csv2.fdW = -0.02f;
        csv2.fdU = 0.05f;
        csv2.fdX = -0.02f;
        csv2.fdV = 0.05f;
        csv2 = brh;
        csv2.bnM = 640;
        csv2.fdT = true;
        csv2.fdW = -0.01f;
        csv2.fdU = 0.02f;
        csv2.fdX = -0.01f;
        csv2.fdV = 0.02f;
        csv2 = fGF;
        csv2.bnM = 0;
        csv2.fdT = false;
        csv2.fdW = -0.01f;
        csv2.fdU = 0.025f;
        csv2.fdX = -0.01f;
        csv2.fdV = 0.025f;
        csv2 = fGG;
        csv2.bnM = 1234;
        csv2.fdT = false;
        csv2.fdW = 0.0f;
        csv2.fdU = 0.1f;
        csv2.fdX = 0.0f;
        csv2.fdV = 0.1f;
        csv2 = fGH;
        csv2.bnM = 0;
        csv2.fdT = false;
        csv2.fdW = 0.0f;
        csv2.fdU = 0.1f;
        csv2.fdX = 0.0f;
        csv2.fdV = 0.1f;
        csv2 = fGI;
        csv2.bnM = 640;
        csv2.fdT = true;
        csv2.fdW = 0.0f;
        csv2.fdU = 0.05f;
        csv2.fdX = 0.0f;
        csv2.fdV = 0.05f;
        csv2 = fGJ;
        csv2.bnM = 0;
        csv2.fdT = false;
        csv2.fdW = 0.0f;
        csv2.fdU = 0.05f;
        csv2.fdX = 0.0f;
        csv2.fdV = 0.05f;
    }

    public static boolean xk(int n2) {
        for (ctu ctu2 : fGK[0].values()) {
            if (n2 != ctu2.az()) continue;
            return true;
        }
        return false;
    }

    public static boolean xl(int n2) {
        lgw lgw2 = (lgw)lea.enW().acv(n2);
        lgw lgw3 = (lgw)lea.enW().g(lgw2);
        while (lgw3 != null) {
            if (!cwy.xk(lgw3.getType())) {
                return false;
            }
            lgw3 = (lgw)lea.enW().h(lgw3);
        }
        return true;
    }

    public static Map<Integer, List<cwz>> bfk() {
        if (fGP == null || fGQ != lpd.rHs.exK()) {
            fGQ = lpd.rHs.exK();
            cwy.bfl();
        }
        return fGP;
    }

    private static void bfl() {
        fGP = lcn.f(new Comparator<Integer>(){

            public int b(Integer n2, Integer n3) {
                String string = lvm.sXe.bD(n2).exA();
                String string2 = lvm.sXe.bD(n3).exA();
                return string.compareTo(string2);
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.b((Integer)object, (Integer)object2);
            }
        });
        Map<cut, cus> map = lea.yq(false);
        Map map2 = lcn.emw();
        for (cus object : map.values()) {
            if (object.fxM == null) continue;
            for (int n2 : object.fxM) {
                Object object2;
                Object object3;
                int n3;
                Set<Integer> set;
                if (object.fyh == null || (set = (Set<Integer>)map2.get(n3 = object.fyh.fyi)) != null && set.contains(n2)) continue;
                if (set == null) {
                    set = lcn.emx();
                    map2.put(n3, set);
                }
                set.add(n2);
                if (fGP.get(n3) == null) {
                    object3 = lvm.sXe.bD(n3).exA();
                    if (((String)object3).contains("[") || ((String)object3).contains("test")) continue;
                    object2 = lcn.emv();
                    fGP.put(n3, (List<cwz>)object2);
                }
                if ((object2 = cwy.a(n3, (lgw)(object3 = (lgw)lea.enW().acv(n2)))) == null) continue;
                fGP.get(n3).add((cwz)object2);
            }
        }
        for (List list : fGP.values()) {
            if (list.size() == 1) {
                cwz cwz2 = (cwz)list.get(0);
                if (cwz2.fGS != null) {
                    list.remove(0);
                    list.addAll(cwz2.fGS);
                }
            }
            Collections.sort(list, cwy.bfm());
        }
    }

    private static cwz a(int n2, lgw lgw2) {
        if (!cug.wF((int)lgw2.getType())) {
            return null;
        }
        float f2 = cwy.a(lgw2, n2);
        if (f2 == Float.MAX_VALUE) {
            return null;
        }
        lgw lgw3 = (lgw)lea.enW().g(lgw2);
        if (lgw3 != null) {
            cwz cwz2;
            cwz cwz3 = null;
            while (lgw3 != null) {
                cwz2 = cwy.a(n2, lgw3);
                if (cwz2 != null) {
                    if (cwz3 == null) {
                        cwz3 = new cwz(lgw2.getType(), null, f2, n2, cwy.xm(lgw2.getType()));
                        cwz3.fGS = lcn.emv();
                    }
                    cwz3.fGS.add(cwz2);
                }
                lgw3 = (lgw)lea.enW().h(lgw3);
            }
            if (cwz3 != null) {
                if (cwz3.fGS.size() == 1) {
                    cwz2 = cwz3.fGS.get(0);
                    if (cwz2.fGS == null) {
                        return cwz2;
                    }
                    cwz3.fGS = cwz2.fGS;
                }
                Collections.sort(cwz3.fGS, cwy.bfm());
            }
            return cwz3;
        }
        ctu ctu2 = cwy.bm(n2, lgw2.getType());
        if (ctu2 == null) {
            return null;
        }
        return new cwz(lgw2.getType(), ctu2, f2, n2, true);
    }

    public static boolean xm(int n2) {
        return cug.mN((int)n2);
    }

    private static Comparator<cwz> bfm() {
        return new Comparator<cwz>(){

            public int a(cwz cwz2, cwz cwz3) {
                if (cwz2.Ds() < cwz3.Ds()) {
                    return -1;
                }
                if (cwz2.Ds() > cwz3.Ds()) {
                    return 1;
                }
                return cwz2.bfo().compareToIgnoreCase(cwz3.bfo());
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((cwz)object, (cwz)object2);
            }
        };
    }

    private static float a(lgw lgw2, int n2) {
        les les2 = lea.enW();
        ler ler2 = les2.g(lgw2);
        if (ler2 != null) {
            float f2 = Float.MAX_VALUE;
            while (ler2 != null) {
                f2 = Math.min(f2, cwy.a((lgw)ler2, n2));
                ler2 = les2.h(ler2);
            }
            return f2;
        }
        ctu ctu2 = cwy.bm(n2, lgw2.getType());
        if (ctu2 == null) {
            return Float.MAX_VALUE;
        }
        for (ctz ctz2 : ctu2.bbI()) {
            if (ctz2 == null || ctz2.SkillType != n2) continue;
            return ctz2.SkillLevel;
        }
        return Float.MAX_VALUE;
    }
}

