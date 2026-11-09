/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jvv {
    private static final lju avd = new lju(1, 0);
    private static final String ave = "villages_config";
    private static final String oUx = "master_switch";
    private static final String oUy = "capture_config";
    private static final String oUz = "inactivity_reset_time";
    private static final String oUA = "invulnerability_time";
    private static final String oUB = "invulnerability_random_time";
    private static final String oUC = "invulnerability_random_time_interval";
    private static final String oQn = "global_notification_offset_time";
    private static final String oUD = "capture_rewards";
    private static final String oQw = "requisition_config";
    private static final String oUE = "fill_time";
    private static final String oUF = "points_required_to_complete";
    private static final String oQq = "points_per_pulse";
    private static final String oQp = "base_pulse_time";
    private static final String oQr = "points_decay_time";
    private static final String oQs = "points_per_decay";
    private static final String oQt = "owner_clan_member_double_ammo_chance";
    private static final String oQu = "point_removal_time_multiplier";
    private static final String oQv = "maximum_link_distance";
    private static final String oUG = "requisition_rewards";
    private static final String oUH = "rewards_config";
    private static final String oUI = "house_rent_reward";
    private static final String oUJ = "common_rewards";
    private static final String oUK = "village_rewards";
    private static final String bfp = "reward";
    private static final String oUL = "cycle_options";
    private static final String oUM = "cycle_option";
    private static final String oUN = "length";
    private static final String oUO = "points_required";
    private static final String oUP = "reward_ticks";
    private static final String avv = "version_major";
    private static final String avw = "version_minor";
    private static final String oUQ = "debug_value";
    private static final String oUR = "live_value";
    private static final String nWL = "value";
    private static final String oUS = "to_critical_hitter";
    private static final String oUT = "to_clan";
    private static final String oUU = "critical_hitter_must_be_clan_member";
    private static final String oQA = "tick_count";
    private static final String oQx = "divide_amongst_parties";
    private static final String oQy = "maximum_party_member_distance";
    private static final String oQz = "owner_clan_tick_count";
    private static final String oUV = "gold_per_house_per_tick";
    private static final String oUW = "percentage_to_owner_clan";
    private static final String oUX = "resource";
    private static final String oUY = "probability";
    private static final String oUZ = "quantity";
    private static final String oVa = "reward_type";
    private static final String oVb = "village_id";
    private static final String oVc = "id";
    private static final String oVd = ":";
    private static boolean oQC = false;
    private static double oVe = 0.0;
    private static double dpK = 0.0;
    private static long oVf = 0L;
    private static long oVg = 0L;
    private static double oVh = 0.0;
    private static boolean oVi = false;
    private static boolean oVj = false;
    private static boolean oVk = false;
    private static int oVl = 0;
    private static double oVm = 0.0;
    private static Map<String, Double> oVn = lcn.emw();
    private static double oVo = 0.0;
    private static int oVp = 0;
    private static Map<String, Integer> oVq = lcn.emw();
    private static double oQF = 0.0;
    private static int oQI = 0;
    private static double oQH = 0.0;
    private static int oQG = 0;
    private static float oVr = 0.0f;
    private static double oQK = 0.0;
    private static float iVQ = 0.0f;
    private static boolean oVs = false;
    private static float oQM = 0.0f;
    private static int oVt = 0;
    private static int oVu = 0;
    private static int oVv = 0;
    private static float oVw = 0.0f;
    private static Set<dpt> oVx = lcn.emx();
    private static Map<String, Set<dpt>> oVy = lcn.emw();
    private static Map<Integer, dpv> oVz = lcn.emw();
    private static List<dpv> oVA = null;
    private static dpv[] oVB = null;

    public static double dTE() {
        return oVe;
    }

    private static double aqY() {
        return dpK;
    }

    public static double dTF() {
        long l2 = (long)(Math.random() * (double)oVf);
        l2 = (l2 + oVg - 1L) / oVg * oVg;
        return dpK + (double)l2;
    }

    public static double dTG() {
        return oVh;
    }

    public static boolean dTH() {
        return oVi;
    }

    public static boolean dTI() {
        return oVj;
    }

    public static boolean dTJ() {
        return oVk;
    }

    public static double dTK() {
        return oVo;
    }

    public static double dSR() {
        return oQF;
    }

    public static int dSU() {
        return oQI;
    }

    public static double dST() {
        return oQH;
    }

    public static int dSS() {
        return oQG;
    }

    public static float dTL() {
        return oVr;
    }

    public static double dSW() {
        return oQK;
    }

    public static float bRK() {
        return iVQ;
    }

    public static boolean dTM() {
        return oVs;
    }

    public static float dSZ() {
        return oQM;
    }

    public static double dTN() {
        return oVm;
    }

    public static int dTO() {
        return oVp;
    }

    public static int dTP() {
        return oVt;
    }

    public static List<dpv> dTQ() {
        if (oVA == null) {
            oVA = lcn.emA();
            int n = 0;
            while (oVA.size() < oVz.size()) {
                dpv dpv2 = oVz.get(n);
                if (dpv2 != null) {
                    oVA.add(dpv2);
                }
                ++n;
            }
        }
        return oVA;
    }

    public static dpv[] dTR() {
        if (oVB == null) {
            oVB = jvv.dTQ().toArray(new dpv[jvv.dTQ().size()]);
            boolean bl = false;
            int n = oVB.length - 1;
            while (!bl) {
                bl = true;
                for (int i2 = 0; i2 < n; ++i2) {
                    if (oVB[i2].a(oVB[i2 + 1]) <= 0) continue;
                    dpv dpv2 = oVB[i2];
                    jvv.oVB[i2] = oVB[i2 + 1];
                    jvv.oVB[i2 + 1] = dpv2;
                    bl = false;
                }
                --n;
            }
        }
        return oVB;
    }

    public static dpv Wj(int n) {
        return oVz.get(n);
    }

    public static dpv dTS() {
        dpv dpv2 = null;
        for (dpv dpv3 : jvv.dTQ()) {
            if (dpv2 != null && !(dpv2.bss() > dpv3.bss())) continue;
            dpv2 = dpv3;
        }
        return dpv2;
    }

    public static int dTT() {
        int n = 0;
        for (dpv dpv2 : jvv.dTQ()) {
            if (dpv2.bsu() <= n) continue;
            n = dpv2.bsu();
        }
        return n;
    }

    public static int uz(String string) {
        if (oVq.containsKey(string.toLowerCase())) {
            return oVq.get(string.toLowerCase());
        }
        return oVp;
    }

    public static double uA(String string) {
        if (oVn.containsKey(string.toLowerCase())) {
            return oVn.get(string.toLowerCase());
        }
        return oVm;
    }

    private jvv() {
    }

    public static Set<lfs<Integer, Integer>> a(String string, dpu dpu2, boolean bl, int n) {
        int n2 = 0;
        switch (dpu2) {
            case gNi: {
                n2 = bl ? oVl : 0;
                break;
            }
            case gNj: {
                n2 = bl ? 0 : oVl;
                break;
            }
            case gNk: {
                n2 = bl ? oVu : oVt;
            }
        }
        return jvv.a(string, dpu2, n2, bl, n);
    }

    /*
     * WARNING - void declaration
     */
    public static Set<lfs<Integer, Integer>> a(String string, dpu dpu2, int n, boolean bl, int n2) {
        Set<lfs<Integer, Integer>> set = lcn.emx();
        if (string != null && dpu2 != null && (n > 0 || dpu2 == dpu.gNk && bl && oVw > 0.0f)) {
            int n3;
            void var11_18;
            Set<dpt> set2 = lcn.emx();
            Set<dpt> set3 = lcn.emx();
            for (dpt object2 : oVx) {
                if (!object2.a(dpu2)) continue;
                set2.add(object2);
            }
            if (oVy.containsKey(string.toLowerCase())) {
                for (dpt dpt2 : oVy.get(string.toLowerCase())) {
                    if (!dpt2.a(dpu2)) continue;
                    set3.add(dpt2);
                }
            }
            Iterator<dpt> iterator = lcn.emx();
            Set<Integer> set4 = lcn.emx();
            for (dpt dpt3 : set3) {
                if (dpt3.aqG() > 0.0f) {
                    iterator.add(dpt3);
                }
                set4.add(dpt3.az());
            }
            for (dpt dpt4 : set2) {
                if (set4.contains(dpt4.az())) continue;
                iterator.add(dpt4);
            }
            Map map = lcn.emw();
            boolean bl2 = false;
            while (var11_18 < n) {
                Iterator iterator2 = iterator.iterator();
                while (iterator2.hasNext()) {
                    dpt dpt5 = (dpt)iterator2.next();
                    if (!dpt5.vA()) continue;
                    int n4 = dpt5.vf();
                    if (map.containsKey(dpt5.az())) {
                        n4 += ((Integer)map.get(dpt5.az())).intValue();
                    }
                    map.put(dpt5.az(), n4);
                }
                ++var11_18;
            }
            if (dpu2 == dpu.gNk && (n3 = oVv * n2 * n) > 0) {
                int n5;
                int n6 = (int)((float)n3 * oVw + 0.5f);
                int n7 = n5 = bl ? n6 : n3 - n6;
                if (n5 > 0) {
                    if (map.containsKey(cug.fkb)) {
                        n5 += ((Integer)map.get(cug.fkb)).intValue();
                    }
                    map.put(cug.fkb, n5);
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                if ((Integer)entry.getValue() <= 0) continue;
                set.add(new lfs(entry.getKey(), entry.getValue()));
            }
        }
        return set;
    }

    public static int[] r(Set<lfs<Integer, Integer>> set) {
        if (set == null) {
            return new int[0];
        }
        int[] nArray = new int[set.size()];
        int n = 0;
        for (lfs<Integer, Integer> lfs2 : set) {
            nArray[n++] = (Integer)lfs2.reX;
        }
        return nArray;
    }

    public static int[] s(Set<lfs<Integer, Integer>> set) {
        if (set == null) {
            return new int[0];
        }
        int[] nArray = new int[set.size()];
        int n = 0;
        for (lfs<Integer, Integer> lfs2 : set) {
            nArray[n++] = (Integer)lfs2.reY;
        }
        return nArray;
    }

    public static void nJ() {
        if (oQC) {
            return;
        }
        String string = "xml-files/server/playervillage/villages_config.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, jvv.class.getSimpleName(), "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw new bo("villages_config.xml", bo2);
        }
        Element element = document.getDocumentElement();
        if (!element.getNodeName().equals(ave)) {
            lfn.b(5, jvv.class.getSimpleName(), "parseConfig() : Unexpected root node encountered! Expected 'villages_config', Found '" + element.getLocalName() + "'!");
            assert (false);
            return;
        }
        lju lju2 = new lju(jvv.d(avv, element), jvv.d(avw, element));
        if (!lju2.b(avd)) {
            lfn.b(5, jvv.class.getSimpleName(), "parseConfig() : Version number mismatch! Parser " + avd.toString() + ", Document " + lju2.toString());
            assert (false);
            throw new bo("villages_config.xml");
        }
        jvv.I(jvv.a(oUy, element));
        jvv.t(jvv.a(oQw, element));
        jvv.K(jvv.a(oUH, element));
        oQC = true;
    }

    private static void I(Element element) {
        if (element == null) {
            lfn.b(5, jvv.class.getSimpleName(), "parseCaptureConfig() : CaptureConfigRoot Parameter is null!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        oVe = jvv.u(jvv.a(oUz, element));
        dpK = jvv.u(jvv.a(oUA, element));
        oVf = (long)jvv.u(jvv.a(oUB, element));
        oVg = (long)jvv.u(jvv.a(oUC, element));
        oVh = jvv.u(jvv.a(oQn, element));
        Element element2 = jvv.a(oUD, element);
        oVi = jvv.c(oUS, element2);
        oVj = jvv.c(oUT, element2);
        oVk = jvv.c(oUU, element2);
        oVl = jvv.d(oQA, element2);
    }

    private static void t(Element element) {
        Object object;
        if (element == null) {
            lfn.b(5, jvv.class.getSimpleName(), "parseRequisitionConfig() : RequisitionConfigRoot Parameter is null!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        Set<Element> set = jvv.b(oUM, element);
        if (set != null) {
            for (Element object22 : set) {
                object = jvv.J(object22);
                if (object == null) continue;
                oVz.put(((dpv)object).getID(), (dpv)object);
            }
        }
        Set<Element> set2 = jvv.b(oUE, element);
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()) {
            object = (Element)iterator.next();
            if (object.hasAttribute(oVb)) {
                oVn.put(object.getAttribute(oVb).toLowerCase(), jvv.u(object));
                continue;
            }
            oVm = jvv.u((Element)object);
        }
        oVo = jvv.u(jvv.a(oQn, element));
        Set<Element> set3 = jvv.b(oUF, element);
        for (Element element2 : set3) {
            if (element2.hasAttribute(oVb)) {
                oVq.put(element2.getAttribute(oVb).toLowerCase(), jvv.d(nWL, element2));
                continue;
            }
            oVp = jvv.d(nWL, element2);
        }
        oQF = jvv.u(jvv.a(oQp, element));
        oQI = jvv.d(nWL, jvv.a(oQq, element));
        oQH = jvv.u(jvv.a(oQr, element));
        oQG = jvv.d(nWL, jvv.a(oQs, element));
        oVr = jvv.e(nWL, jvv.a(oQt, element));
        oQK = jvv.f(nWL, jvv.a(oQu, element));
        iVQ = jvv.e(nWL, jvv.a(oQv, element));
        object = jvv.a(oUG, element);
        oVs = jvv.c(oQx, (Element)object);
        oQM = jvv.e(oQy, (Element)object);
        oVt = jvv.d(oQA, (Element)object);
        oVu = jvv.d(oQz, (Element)object);
    }

    private static dpv J(Element element) {
        if (element == null) {
            lfn.b(5, jvv.class.getSimpleName(), "parseRewardsCycleOption() : RewardsCycleElement Parameter is null!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        int n = jvv.d(oVc, element);
        Element element2 = jvv.a(oUN, element);
        if (element2 == null) {
            lfn.b(5, jvv.class.getSimpleName(), "parseRewardsCycleOption() : RewardsCycleElement Without Length Sub-Element!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        double d2 = jvv.u(element2);
        Element element3 = jvv.a(oUO, element);
        if (element3 == null) {
            lfn.b(5, jvv.class.getSimpleName(), "parseRewardsCycleOption() : RewardsCycleElement Without Required Points Sub-Element!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        int n2 = jvv.d(nWL, element3);
        Element element4 = jvv.a(oUP, element);
        if (element4 == null) {
            lfn.b(5, jvv.class.getSimpleName(), "parseRewardsCycleOption() : RewardsCycleElement Without Reward Ticks Sub-Element!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        int n3 = jvv.d(nWL, element4);
        return new dpv(n, d2, n2, n3);
    }

    private static void K(Element element) {
        if (element == null) {
            lfn.b(5, jvv.class.getSimpleName(), "parseRewardsConfig() : RewardsConfigRoot Parameter is null!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        Element element2 = jvv.a(oUI, element);
        oVv = jvv.d(oUV, element2);
        oVw = jvv.e(oUW, element2);
        jvv.a(jvv.a(oUJ, element), null);
        Set<Element> set = jvv.b(oUK, element);
        if (set != null) {
            for (Element element3 : set) {
                jvv.a(element3, element3.getAttribute(oVb).toLowerCase());
            }
        }
    }

    private static void a(Element element, String string) {
        Set<Element> set;
        if (element == null) {
            lfn.b(5, jvv.class.getSimpleName(), "parseRewardsGroup() : RewardsGroup Parameter is null!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        Set<dpt> set2 = null;
        if (string != null && (set2 = oVy.get(string)) == null) {
            set2 = lcn.emx();
            oVy.put(string, set2);
        }
        if ((set = jvv.b(bfp, element)) != null) {
            for (Element element2 : set) {
                dpt dpt2 = jvv.b(element2, string);
                if (dpt2 == null) continue;
                if (set2 == null) {
                    oVx.add(dpt2);
                    continue;
                }
                set2.add(dpt2);
            }
        }
    }

    private static Element a(String string, Element element) {
        if (element == null || string == null) {
            lfn.b(5, jvv.class.getSimpleName(), "getSingleElement() : Invalid Method Parameters! TagName = '" + string + "', RootElement = '" + element + "'!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        NodeList nodeList = element.getElementsByTagName(string);
        if (nodeList != null && nodeList.getLength() > 0) {
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                Node node = nodeList.item(i2);
                if (node.getNodeType() != 1) continue;
                return (Element)node;
            }
            lfn.b(5, jvv.class.getSimpleName(), "getSingleElement() : Required XML Element Not Found! Element Name = '" + string + "'!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        lfn.b(5, jvv.class.getSimpleName(), "getSingleElement() : Required XML Node Not Found! Node Name = '" + string + "'!");
        assert (false);
        throw new bo("villages_config.xml");
    }

    private static Set<Element> b(String string, Element element) {
        if (element == null || string == null) {
            lfn.b(5, jvv.class.getSimpleName(), "getMultipleElements() : Invalid Method Parameters! TagName = '" + string + "', RootElement = '" + element + "'!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        NodeList nodeList = element.getElementsByTagName(string);
        if (nodeList != null && nodeList.getLength() > 0) {
            Set<Element> set = lcn.emx();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                Node node = nodeList.item(i2);
                if (node.getNodeType() != 1) continue;
                set.add((Element)node);
            }
            if (set.isEmpty()) {
                lfn.b(5, jvv.class.getSimpleName(), "getMultipleElements() : Required XML Elements Not Found! Element Name = '" + string + "'!");
                assert (false);
                throw new bo("villages_config.xml");
            }
            return set;
        }
        return null;
    }

    private static boolean c(String string, Element element) {
        if (string == null || element == null) {
            return false;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, jvv.class.getSimpleName(), "parseBooleanAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        return Boolean.parseBoolean(element.getAttribute(string));
    }

    private static int d(String string, Element element) {
        if (string == null || element == null) {
            return 0;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, jvv.class.getSimpleName(), "parseIntegerAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        try {
            return Integer.parseInt(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, jvv.class.getSimpleName(), "parseIntegerAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Integer!");
            assert (false);
            throw new bo("villages_config.xml");
        }
    }

    private static float e(String string, Element element) {
        if (string == null || element == null) {
            return 0.0f;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, jvv.class.getSimpleName(), "parseFloatAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        try {
            return Float.parseFloat(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, jvv.class.getSimpleName(), "parseFloatAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Float!");
            assert (false);
            throw new bo("villages_config.xml");
        }
    }

    private static double f(String string, Element element) {
        if (string == null || element == null) {
            return 0.0;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, jvv.class.getSimpleName(), "parseDoubleAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        try {
            return Double.parseDouble(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, jvv.class.getSimpleName(), "parseDoubleAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Double!");
            assert (false);
            throw new bo("villages_config.xml");
        }
    }

    private static double u(Element element) {
        if (element == null) {
            return 0.0;
        }
        String string = oUR;
        return jvv.f(string, element);
    }

    private static dpt b(Element element, String string) {
        if (element == null) {
            return null;
        }
        if (!element.hasAttribute(oUX)) {
            lfn.b(5, jvv.class.getSimpleName(), "parseReward() : Required XML Node Attribute Not Found! Attribute Name = 'resource', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        if (!element.hasAttribute(oVa)) {
            lfn.b(5, jvv.class.getSimpleName(), "parseReward() : Required XML Node Attribute Not Found! Attribute Name = 'reward_type', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("villages_config.xml");
        }
        EnumSet<dpu> enumSet = EnumSet.noneOf(dpu.class);
        String[] stringArray = element.getAttribute(oVa).split(oVd);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            dpu dpu2 = dpu.getValueByName(stringArray[i2]);
            if (dpu2 == null) {
                lfn.b(5, jvv.class.getSimpleName(), "parseReward() : Unexpected Reward-Type Value Encountered! Reward-Type = '" + stringArray[i2] + "'!");
                assert (false);
                throw new bo("villages_config.xml");
            }
            enumSet.add(dpu2);
        }
        return new dpt(string, element.getAttribute(oUX), jvv.e(oUY, element), jvv.d(oUZ, element), enumSet);
    }
}

