/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class cxj {
    private static List<dbs> fWz = lcn.emv();
    private static Map<Integer, cts> fWA = lcn.emw();
    private static Map<String, cui> fWB = lcn.emw();
    private static Map<Integer, Map<Integer, cuj>> fWC = lcn.emw();
    private static Map<Integer, ctr> fWD = lcn.emw();
    private static Map<cxd.b, dcj> fWE = new EnumMap<cxd.b, dcj>(cxd.b.class);
    private static Map<Integer, dck> fWF = lcn.emw();
    private static Map<Integer, dcp> fWG = lcn.emw();
    private static Map<Integer, List<dcr>> fWH = lcn.emw();
    private static Map<Integer, dcw> fWI = lcn.emw();
    private static Map<Integer, ddi> fWJ = lcn.emw();
    private static Map<cxd.u, List<ddw>> fWK = new EnumMap<cxd.u, List<ddw>>(cxd.u.class);
    private static Map<Integer, cuo> fWL = lcn.emw();
    private static Map<Integer, ddz> fWM = lcn.emw();
    private static Map<Integer, cxl> fWN = lcn.emw();
    private static Map<Integer, cxl> fWO = lcn.emw();
    private static Map<Integer, Map<Integer, Integer>> fWP = lcn.emw();
    private static Map<Integer, List<cak.c>> fWQ = lcn.emw();
    private static les ResourceTree = lea.enW();
    private static les aqN = lea.enZ();
    public static int fWR = 0;
    public static final String fWS = "tg_Creatures And Structures";

    private cxj() {
    }

    public static void q(int n2, int n3, int n4) {
        Map<Integer, Integer> map = fWP.get(n2);
        if (map == null) {
            map = lcn.emw();
            map.put(n3, n4);
            fWP.put(n2, map);
            return;
        }
        assert (!map.containsKey(n3));
        map.put(n3, n4);
    }

    public static int bs(int n2, int n3) {
        Map<Integer, Integer> map = fWP.get(n2);
        if (map != null) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (n3 == -1) {
                    return n2;
                }
                if (!ResourceTree.isDescendant(n3, entry.getKey())) continue;
                return entry.getValue();
            }
        }
        return -1;
    }

    public static void a(dbs dbs2) {
        if (dbs2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addCommonConstraintMapping() Mapping is null.");
            return;
        }
        if (cxj.ye(dbs2.SkillType)) {
            lfn.b(5, "SFSkillSystemConfig", "addCommonConstraintMapping() Mapping for skill '" + dbs2.Bu() + "' already exists.");
            return;
        }
        fWz.add(dbs2);
    }

    public static boolean ye(int n2) {
        if (fWz.isEmpty()) {
            return false;
        }
        int n3 = fWz.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            dbs dbs2 = fWz.get(i2);
            if (!aqN.isDescendant(n2, dbs2.SkillType)) continue;
            return true;
        }
        return false;
    }

    public static dbs yf(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getCommonConstraintMapping() SkillType is invalid.");
            return null;
        }
        int n3 = fWz.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            dbs dbs2 = fWz.get(i2);
            if (!aqN.isDescendant(n2, dbs2.SkillType)) continue;
            return dbs2;
        }
        return null;
    }

    public static void e(cts cts2) {
        if (cts2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addMovementSpeedInfo() Info is null.");
            return;
        }
        fWA.put(cts2.ResourceType, cts2);
    }

    public static boolean yg(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsMovementSpeedInfo() ResourceType is invalid.");
            return false;
        }
        return fWA.containsKey(n2);
    }

    public static cts yh(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getMovementSpeedInfo() ResourceType is invalid.");
            return null;
        }
        int n3 = n2;
        do {
            cts cts2;
            if ((cts2 = fWA.get(n3)) == null) continue;
            return cts2;
        } while ((n3 = ResourceTree.uW(n3)) > 0);
        return null;
    }

    public static void a(cui cui2) {
        if (cui2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addResourceGroup() Group is null.");
            return;
        }
        fWB.put(cui2.Name.toLowerCase(), cui2);
    }

    public static boolean iz(String string) {
        if (string == null) {
            lfn.b(5, "SFSkillSystemConfig", "containsResourceGroup() GroupName is null.");
            return false;
        }
        return fWB.containsKey(string.toLowerCase());
    }

    public static cui iA(String string) {
        if (string == null) {
            lfn.b(5, "SFSkillSystemConfig", "getResourceGroup() GroupName is null.");
            return null;
        }
        return fWB.get(string.toLowerCase());
    }

    public static void a(cuj cuj2) {
        if (cuj2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addResourceHarvestingInfo() ResourceHarvestingInfo is null.");
            return;
        }
        Map<Integer, cuj> map = fWC.get(cuj2.az());
        if (map == null) {
            map = lcn.emw();
            fWC.put(cuj2.az(), map);
        }
        map.put(cuj2.FW(), cuj2);
    }

    public static boolean bt(int n2, int n3) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsResourceHarvestingInfo() ResourceType is invalid.");
            return false;
        }
        return fWC.containsKey(n2) ? fWC.get(n2).containsKey(n3) : false;
    }

    public static cuj bu(int n2, int n3) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getResourceHarvestingInfo() ResourceType is invalid.");
            return null;
        }
        lgw lgw2 = (lgw)ResourceTree.acv(n2);
        while (lgw2 != null) {
            Map<Integer, cuj> map = fWC.get(lgw2.getType());
            if (map != null) {
                cuj cuj2 = map.get(n3);
                for (int i2 = 0; cuj2 == null && i2 < 999; ++i2) {
                    cuj2 = map.get(i2);
                }
                if (cuj2 == null) continue;
                return cuj2;
            }
            lgw2 = (lgw)ResourceTree.i(lgw2);
        }
        lfn.b(5, "SFSkillSystemConfig", "getResourceHarvestingInfo() Could not find resourceharvestinginfo for resource '" + ResourceTree.getName(n2) + "'");
        return null;
    }

    public static cuj yi(int n2) {
        for (Map<Integer, cuj> map : fWC.values()) {
            for (cuj cuj2 : map.values()) {
                if (!cuj2.contains(n2)) continue;
                return cuj2;
            }
        }
        return null;
    }

    public static void a(ctr ctr2) {
        if (ctr2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addMovableObjectResourceHarvestingInfo() ResourceHarvestingInfo is null.");
            return;
        }
        fWD.put(ctr2.ResourceType, ctr2);
    }

    public static boolean yj(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsMovableObjectResourceHarvestingInfo() ResourceType is invalid.");
            return false;
        }
        return fWD.containsKey(n2);
    }

    public static ctr yk(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getMovableObjectResourceHarvestingInfo() ResourceType is invalid.");
            return null;
        }
        lgw lgw2 = (lgw)ResourceTree.acv(n2);
        while (lgw2 != null) {
            ctr ctr2 = fWD.get(lgw2.getType());
            if (ctr2 != null) {
                return ctr2;
            }
            lgw2 = (lgw)ResourceTree.i(lgw2);
        }
        lfn.b(5, "SFSkillSystemConfig", "getMovableObjectResourceHarvestingInfo() Could not find resourceharvestinginfo for resource '" + ResourceTree.getName(n2) + "'");
        return null;
    }

    public static void a(cxd.b b2, dcj dcj2) {
        if (b2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillBlockingGroup() BlockingGroupType is null.");
            return;
        }
        if (dcj2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillBlockingGroup() SkillBlockingGroup is null.");
            return;
        }
        if (cxj.a(b2)) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillBlockingGroup() A blockinggroup with blockinggrouptype '" + (Object)((Object)b2) + "' has already been added.");
            return;
        }
        fWE.put(b2, dcj2);
    }

    public static boolean a(cxd.b b2) {
        if (b2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "containsSkillBlockingGroup() BlockingGroupType is invalid.");
            return false;
        }
        return fWE.containsKey((Object)b2);
    }

    public static dcj b(cxd.b b2) {
        if (b2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "getSkillBlockingGroup() BlockingGroupType is invalid.");
            return null;
        }
        return fWE.get((Object)b2);
    }

    public static void a(dck dck2) {
        if (dck2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillCheckInfo() SkillCheckInfo is null.");
            return;
        }
        fWF.put(dck2.SkillType, dck2);
    }

    public static dck yl(int n2) {
        if (n2 < 0) {
            lfn.b(5, "SFSkillSystemConfig", "getSkillCheckInfo() SkillType is invalid.");
            return null;
        }
        return fWF.get(n2);
    }

    public static void bfR() {
        fWF.clear();
    }

    public static void ym(int n2) {
        if (n2 < 0) {
            lfn.b(5, "SFSkillSystemConfig", "removeSkillCheckInfo() SkillType is invalid.");
            return;
        }
        dck dck2 = fWF.remove(n2);
        if (dck2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "removeSkillCheckInfo() No skillcheckinfo mapped to skilltype '" + aqN.getName(n2) + "'");
        }
    }

    public static boolean yn(int n2) {
        if (n2 < 0) {
            lfn.b(5, "SFSkillSystemConfig", "shouldSkillAlwaysFail() SkillType is invalid.");
            return false;
        }
        if (fWF.isEmpty()) {
            return false;
        }
        for (dck dck2 : fWF.values()) {
            if (!aqN.isDescendant(n2, dck2.SkillType) || !dck2.gcT) continue;
            return true;
        }
        return false;
    }

    public static boolean yo(int n2) {
        if (n2 < 0) {
            lfn.b(5, "SFSkillSystemConfig", "shouldSkillAlwaysSucceed() SkillType is invalid.");
            return false;
        }
        if (fWF.isEmpty()) {
            return false;
        }
        for (dck dck2 : fWF.values()) {
            if (!aqN.isDescendant(n2, dck2.SkillType) || dck2.gcT) continue;
            return true;
        }
        return false;
    }

    public static void a(dcr dcr2) {
        if (dcr2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillFunctionRule() Rule is null.");
            return;
        }
        if (cxj.bv(dcr2.SkillType, dcr2.bnR)) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillFunctionRule() The skillfunctionrule has already been added.");
            lfn.b(5, "SFSkillSystemConfig", "addSkillFunctionRule() " + dcr2);
            return;
        }
        List<dcr> list = fWH.get(dcr2.SkillType);
        if (list == null) {
            list = lcn.emv();
            fWH.put(dcr2.SkillType, list);
        }
        list.add(dcr2);
    }

    public static boolean bv(int n2, int n3) {
        if (n2 < 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsSkillFunctionRule() SkillType is invalid.");
            return false;
        }
        if (n3 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsSkillFunctionRule() SkillFunctionType is invalid.");
            return false;
        }
        List<dcr> list = fWH.get(n2);
        if (list != null) {
            int n4 = list.size();
            for (int i2 = 0; i2 < n4; ++i2) {
                dcr dcr2 = list.get(i2);
                if (dcr2.SkillType != n2 || dcr2.bnR != n3) continue;
                return true;
            }
        }
        return false;
    }

    public static dcr bw(int n2, int n3) {
        if (n2 < 0) {
            lfn.b(5, "SFSkillSystemConfig", "getSkillFunctionRule() SkillType is invalid.");
            return null;
        }
        if (n3 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getSkillFunctionRule() SkillFunctionType is invalid.");
            return null;
        }
        List<dcr> list = fWH.get(n2);
        if (list != null) {
            int n4 = list.size();
            for (int i2 = 0; i2 < n4; ++i2) {
                dcr dcr2 = list.get(i2);
                if (dcr2.SkillType != n2 || dcr2.bnR != n3) continue;
                return dcr2;
            }
        }
        return null;
    }

    public static void a(int n2, dcw dcw2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillRelationSet() SkillType is invalid.");
            return;
        }
        if (dcw2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillRelationSet() SkillRelationSet is null.");
            return;
        }
        if (cxj.yp(n2)) {
            lfn.b(5, "SFSkillSystemConfig", "addSkillRelationSet() A skillrelationset for skill '" + aqN.getName(n2) + "' has already been added.");
            return;
        }
        fWI.put(n2, dcw2);
    }

    public static boolean yp(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsSkillRelationSet() SkillType is invalid.");
            return false;
        }
        return fWI.containsKey(n2);
    }

    public static dcw yq(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getSkillRelationSet() SkillType is invalid.");
            return null;
        }
        return fWI.get(n2);
    }

    public static int a(int n2, cxd.l l2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillConstants", "getRelatedSkillType() SkillType is invalid.");
            return -1;
        }
        if (fWI.isEmpty()) {
            return -1;
        }
        for (Map.Entry<Integer, dcw> entry : fWI.entrySet()) {
            dcv[] dcvArray;
            dcw dcw2 = entry.getValue();
            for (dcv dcv2 : dcvArray = dcw2.gdz) {
                if (dcv2.gdx != cxd.l.fRN || dcw2.SkillType != n2) continue;
                return dcv2.gdy;
            }
        }
        return -1;
    }

    public static int yr(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillConstants", "getRelatedSkillType() SkillType is invalid.");
            return -1;
        }
        if (fWI.isEmpty()) {
            return -1;
        }
        for (Map.Entry<Integer, dcw> entry : fWI.entrySet()) {
            dcv[] dcvArray;
            dcw dcw2 = entry.getValue();
            for (dcv dcv2 : dcvArray = dcw2.gdz) {
                if (dcv2.gdy != n2) continue;
                return cxj.a(dcw2.SkillType, cxd.l.fRN);
            }
        }
        return -1;
    }

    public static int b(int n2, cxd.l l2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillConstants", "getRelatedSkillType() SkillType is invalid.");
            return -1;
        }
        if (fWI.isEmpty()) {
            return -1;
        }
        for (Map.Entry<Integer, dcw> entry : fWI.entrySet()) {
            dcw dcw2 = entry.getValue();
            if (!lea.enZ().isDescendant(n2, dcw2.SkillType)) continue;
            return dcw2.a(l2);
        }
        return -1;
    }

    public static void a(int n2, ddi ddi2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "addTargetGroup() TargetGroupType is invalid.");
            return;
        }
        if (ddi2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addTargetGroup() TargetGroup is null.");
            return;
        }
        if (cxj.ys(n2)) {
            lfn.b(5, "SFSkillSystemConfig", "addTargetGroup() A targetgroup with targetgrouptype '" + n2 + "' has already been added.");
            return;
        }
        fWJ.put(n2, ddi2);
    }

    public static boolean ys(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsTargetGroup() TargetGroupType is invalid.");
            return false;
        }
        return fWJ.containsKey(n2);
    }

    public static boolean iB(String string) {
        if (string == null) {
            lfn.b(5, "SFSkillSystemConfig", "containsTargetGroup() TargetGroupName is null.");
            return false;
        }
        if (fWJ.isEmpty()) {
            return false;
        }
        for (ddi ddi2 : fWJ.values()) {
            if (!ddi2.aEN.equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    public static ddi yt(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getTargetGroup() TargetGroupType is invalid.");
            return null;
        }
        return fWJ.get(n2);
    }

    public static String yu(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getTargetGroupName() TargetGroupType is invalid.");
            return null;
        }
        ddi ddi2 = fWJ.get(n2);
        if (ddi2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "getTargetGroupName() TargetGroupType is invalid.");
            return null;
        }
        return ddi2.aEN;
    }

    public static int iC(String string) {
        if (string == null) {
            lfn.b(5, "SFSkillSystemConfig", "getTargetGroupType() TargetGroupName is invalid.");
            return -1;
        }
        for (ddi ddi2 : fWJ.values()) {
            if (!ddi2.aEN.equalsIgnoreCase(string)) continue;
            return ddi2.geg;
        }
        lfn.b(5, "SFSkillSystemConfig", "getTargetGroupType() Could not find targetgroup '" + string + "'");
        return -1;
    }

    public static void a(cxd.u u2, List list) {
        if (u2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addTimeStepList() TimeStepListType is null.");
            return;
        }
        if (list == null) {
            lfn.b(5, "SFSkillSystemConfig", "addTimeStepList() TimeStepList is null.");
            return;
        }
        if (cxj.a(u2)) {
            lfn.b(5, "SFSkillSystemConfig", "addTimeStepList() A timesteplist with timesteplisttype '" + (Object)((Object)u2) + "' has already been added.");
            return;
        }
        fWK.put(u2, list);
    }

    public static boolean a(cxd.u u2) {
        if (u2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "containsTimeStepList() TimeStepListType is null.");
            return false;
        }
        return fWK.containsKey((Object)u2);
    }

    public static float a(cxd.u u2, float f2) {
        List<ddw> list = fWK.get((Object)u2);
        if (list == null) {
            lfn.b(5, "SFSkillConstants", "getTimeStepValue() No TimeStepList mapped to TimeStepListType '" + u2.name() + "'");
            return 0.0f;
        }
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ddw ddw2 = list.get(i2);
            if (!ddw2.gg(f2)) continue;
            return ddw2.gey;
        }
        lfn.b(5, "SFSkillConstants", "getTimeStepValue() No TimeStep found for Value=" + f2);
        return 0.0f;
    }

    public static void a(cuo cuo2) {
        if (cuo2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addTrainingRule() Rule is null.");
            return;
        }
        fWL.put(cuo2.SkillType, cuo2);
    }

    public static boolean bx(int n2, int n3) {
        cuo cuo2 = fWL.get(n3);
        if (cuo2 == null) {
            return true;
        }
        if (cuo2.Requirements == null) {
            return true;
        }
        return cxj.a(n2, cuo2.Requirements);
    }

    private static boolean a(int n2, cua[] cuaArray) {
        int n3 = cuaArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (!(cuaArray[i2] instanceof cub ? !cxj.a(n2, ((cub)cuaArray[i2]).Requirements) : cuaArray[i2] instanceof cud && !ResourceTree.isDescendant(n2, ((cud)cuaArray[i2]).ResourceType))) continue;
            return false;
        }
        return true;
    }

    public static boolean f(cdb cdb2, int n2) {
        if (cdb2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "canLearnSkill() SkillOwner is null.");
            return false;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "canLearnSkill() SkillType is invalid.");
            return false;
        }
        cuo cuo2 = fWL.get(n2);
        if (cuo2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "canLearnSkill() No trainingrule found for skill '" + aqN.getName(n2) + "'");
            return false;
        }
        if (cuo2.Requirements != null) {
            return cxj.a(cdb2, cuo2.Requirements);
        }
        return true;
    }

    public static boolean yv(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsTrainingRule() SkillType is invalid.");
            return false;
        }
        return fWL.containsKey(n2);
    }

    public static cuo yw(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getTrainingRule() SkillType is invalid.");
            return null;
        }
        return fWL.get(n2);
    }

    public static Map<Integer, cuo> bfS() {
        return fWL;
    }

    public static void yx(int n2) {
        if (n2 < 0) {
            lfn.b(5, "SFSkillSystemConfig", "removeTrainingRule() SkillType is invalid.");
            return;
        }
        cuo cuo2 = fWL.remove(n2);
        if (cuo2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "removeTrainingRule() No trainingrule found for skill '" + aqN.getName(n2) + "'");
        }
    }

    private static boolean a(cdb cdb2, cub cub2) {
        assert (cdb2 != null);
        assert (cub2 != null);
        assert (cub2.Requirements != null);
        cua[] cuaArray = cub2.Requirements;
        int n2 = cuaArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (cuaArray[i2] instanceof cub) {
                if (!cxj.a(cdb2, (cub)cuaArray[i2])) continue;
                return true;
            }
            if (cuaArray[i2] instanceof cuc) {
                if (!cxj.a(cdb2, (cuc)cuaArray[i2])) continue;
                return true;
            }
            if (cuaArray[i2] instanceof cud) {
                if (!cxj.a(cdb2, (cud)cuaArray[i2])) continue;
                return true;
            }
            if (cuaArray[i2] instanceof cue) {
                if (!cxj.a(cdb2, (cue)cuaArray[i2])) continue;
                return true;
            }
            lfn.b(5, "SFSkillSystemConfig", "checkRequirementComposite() Invalid requirement provided: " + cuaArray[i2].getClass().getName());
            assert (false);
            return false;
        }
        return false;
    }

    private static boolean a(cdb cdb2, cuc cuc2) {
        assert (cdb2 != null);
        assert (cuc2 != null);
        float f2 = cdb2.fi().am(cuc2.bnM);
        return !(f2 < cuc2.AttributeValue);
    }

    private static boolean a(cdb cdb2, cud cud2) {
        assert (cdb2 != null);
        assert (cud2 != null);
        return ResourceTree.isDescendant(cdb2.az(), cud2.ResourceType);
    }

    private static boolean a(cdb cdb2, cue cue2) {
        assert (cdb2 != null);
        assert (cue2 != null);
        float f2 = cdb2.aJz().yQ(cue2.SkillType);
        return !(f2 < cue2.SkillLevel);
    }

    private static boolean a(cdb cdb2, cua[] cuaArray) {
        assert (cdb2 != null);
        assert (cuaArray != null);
        int n2 = cuaArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (cuaArray[i2] instanceof cub) {
                if (cxj.a(cdb2, (cub)cuaArray[i2])) continue;
                return false;
            }
            if (cuaArray[i2] instanceof cuc) {
                if (cxj.a(cdb2, (cuc)cuaArray[i2])) continue;
                return false;
            }
            if (cuaArray[i2] instanceof cud) {
                if (cxj.a(cdb2, (cud)cuaArray[i2])) continue;
                return false;
            }
            if (cuaArray[i2] instanceof cue) {
                if (cxj.a(cdb2, (cue)cuaArray[i2])) continue;
                return false;
            }
            lfn.b(5, "SFSkillSystemConfig", "checkTrainingRequirements() Invalid requirement provided: " + cuaArray[i2].getClass().getName());
            assert (false);
            return false;
        }
        return true;
    }

    public static void a(ddz ddz2) {
        if (ddz2 == null) {
            lfn.b(5, "SFSkillSystemConfig", "addWeaponMagnitudeModifier() Modifier is null.");
            return;
        }
        if (cxj.yy(ddz2.ResourceType)) {
            lfn.b(5, "SFSkillSystemConfig", "addWeaponMagnitudeModifier() A modifier for resourcetype '" + ddz2.pa() + "' has already been added.");
            return;
        }
        fWM.put(ddz2.ResourceType, ddz2);
    }

    public static boolean yy(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "containsWeaponMagnitudeModifier() ResourceType is invalid.");
            return false;
        }
        return fWM.containsKey(n2);
    }

    public static float by(int n2, int n3) {
        ddz ddz2 = fWM.get(n2);
        if (ddz2 == null) {
            return 0.0f;
        }
        dbu[] dbuArray = ddz2.geU;
        int n4 = dbuArray.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            if (!aqN.isDescendant(n3, dbuArray[i2].SkillType)) continue;
            return dbuArray[i2].bsv;
        }
        return 0.0f;
    }

    public static int yz(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getWeaponSkillForWeaponResource() ResourceType is invalid.");
            return -1;
        }
        String string = ResourceTree.getName(n2);
        while (n2 > 0) {
            cxl cxl2 = fWN.get(n2);
            if (cxl2 != null) {
                return cxl2.fWU;
            }
            n2 = ResourceTree.uW(n2);
        }
        lfn.b(5, "SFSkillSystemConfig", "getWeaponSkillForWeaponResource() Could not find weaponskill for resource '" + string + "'");
        return -1;
    }

    public static int yA(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillSystemConfig", "getWeaponResourceForWeaponSkill() SkillType is invalid.");
            return -1;
        }
        String string = aqN.getName(n2);
        while (n2 > 0) {
            cxl cxl2 = fWO.get(n2);
            if (cxl2 != null) {
                return cxl2.fWT;
            }
            n2 = aqN.uW(n2);
        }
        lfn.b(5, "SFSkillSystemConfig", "getWeaponResourceForWeaponSkill() Could not find weaponresource for skill '" + string + "'");
        return -1;
    }

    public static void bz(int n2, int n3) {
        assert (n2 > 0);
        assert (n3 > 0);
        cxl cxl2 = new cxl(n2, n3);
        fWN.put(n2, cxl2);
        fWO.put(n3, cxl2);
    }

    public static boolean yB(int n2) {
        return fWQ.containsKey(n2);
    }

    public static Map<Integer, List<cak.c>> bfT() {
        return fWQ;
    }

    public static void h(int n2, List<cak.c> list) {
        fWQ.put(n2, list);
    }
}

