/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jts {
    public static final String TC = "SFCityConfig";
    public static final boolean DEBUG = true;
    public static final boolean oQf = true;
    private static final boolean oQg = true;
    private static final boolean oQh = true;
    private static final boolean oQi = true;
    private static final boolean oQj = true;
    private static final boolean oQk = true;
    private static final boolean oQl = true;
    private static final lju avd = new lju(1, 0);
    private static final String ave = "cities_config";
    private static final String oQm = "capacity";
    private static final String oQn = "global_notification_offset_time";
    private static final String oQo = "points_required_to_complete";
    private static final String oQp = "base_pulse_time";
    private static final String oQq = "points_per_pulse";
    private static final String oQr = "points_decay_time";
    private static final String oQs = "points_per_decay";
    private static final String oQt = "owner_clan_member_double_ammo_chance";
    private static final String oQu = "point_removal_time_multiplier";
    private static final String oQv = "maximum_link_distance";
    private static final String bfo = "rewards";
    private static final String avv = "version_major";
    private static final String avw = "version_minor";
    private static final String oQw = "requisition_config";
    private static final String avx = "debug_value";
    private static final String avy = "live_value";
    private static final String oQx = "divide_amongst_parties";
    private static final String oQy = "maximum_party_member_distance";
    private static final String oQz = "owner_clan_tick_count";
    private static final String oQA = "tick_count";
    private static final String oQB = "city_id";
    private static boolean oQC = false;
    private static int jsn = 0;
    private static double oQD = 0.0;
    private static int oQE = 0;
    private static double oQF = 0.0;
    private static int oQG = 0;
    private static double oQH = 0.0;
    private static int oQI = 0;
    private static float oQJ = 0.0f;
    private static double oQK = 0.0;
    private static float iVQ = 0.0f;
    private static boolean oQL = false;
    private static float oQM = 0.0f;
    private static int lpr = 0;
    private static int oQN = 0;
    private static Map<String, Integer> oQO = lcn.emw();
    private static Map<String, Integer> oQP = lcn.emw();

    public static int tS(String string) {
        Integer n = oQO.get(string.toLowerCase());
        return n != null ? n : oQE;
    }

    public static int tT(String string) {
        Integer n = oQP.get(string.toLowerCase());
        return n != null ? n : jsn;
    }

    public static final boolean dSO() {
        return oQC;
    }

    public static final int bYb() {
        return jsn;
    }

    public static final double dSP() {
        return oQD;
    }

    public static final int dSQ() {
        return oQE;
    }

    public static final double dSR() {
        return oQF;
    }

    public static final int dSS() {
        return oQG;
    }

    public static final double dST() {
        return oQH;
    }

    public static final int dSU() {
        return oQI;
    }

    public static final float dSV() {
        return oQJ;
    }

    public static final double dSW() {
        return oQK;
    }

    public static final float dSX() {
        return iVQ;
    }

    public static final boolean dSY() {
        return oQL;
    }

    public static final float dSZ() {
        return oQM;
    }

    public static final int getTickCount() {
        return lpr;
    }

    public static final int dTa() {
        return oQN;
    }

    public static void nJ() {
        if (oQC) {
            return;
        }
        String string = "xml-files/server/city/cities_config.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, TC, "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw new bo("cities_config.xml", bo2);
        }
        Element element = document.getDocumentElement();
        if (!element.getNodeName().equals(ave)) {
            lfn.b(5, TC, "parseConfig() : Unexpected root node encountered! Expected 'cities_config', Found '" + element.getLocalName() + "'!");
            assert (false);
            return;
        }
        lju lju2 = new lju(jts.d(avv, element), jts.d(avw, element));
        if (!lju2.b(avd)) {
            lfn.b(5, TC, "parseConfig() : Version number mismatch! Parser " + avd.toString() + ", Document " + lju2.toString());
            assert (false);
            throw new bo("cities_config.xml");
        }
        jts.t(jts.a(oQw, element));
        oQC = true;
    }

    private static void t(Element element) {
        if (element == null) {
            lfn.b(5, TC, "parseRequisitionConfig() : RequisitionConfigRoot Parameter is null!");
            assert (false);
            throw new bo("cities_config.xml");
        }
        String string = avy;
        Set<Element> set = jts.b(oQm, element);
        for (Element object2 : set) {
            if (object2.hasAttribute(oQB)) {
                oQP.put(object2.getAttribute(oQB).toLowerCase(), jts.d(string, object2));
                continue;
            }
            jsn = jts.d(string, object2);
        }
        oQD = jts.u(jts.a(oQn, element));
        Set<Element> set2 = jts.b(oQo, element);
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()) {
            Element element2 = (Element)iterator.next();
            if (element2.hasAttribute(oQB)) {
                oQO.put(element2.getAttribute(oQB).toLowerCase(), jts.d(string, element2));
                continue;
            }
            oQE = jts.d(string, element2);
        }
        oQF = jts.u(jts.a(oQp, element));
        oQI = jts.d(string, jts.a(oQq, element));
        oQH = jts.u(jts.a(oQr, element));
        oQG = jts.d(string, jts.a(oQs, element));
        oQJ = jts.e(string, jts.a(oQt, element));
        oQK = jts.f(string, jts.a(oQu, element));
        iVQ = jts.e(string, jts.a(oQv, element));
        Element element3 = jts.a(bfo, element);
        oQL = jts.c(oQx, element3);
        oQM = jts.e(oQy, element3);
        lpr = jts.d(oQA, element3);
        oQN = jts.d(oQz, element3);
    }

    private static Set<Element> b(String string, Element element) {
        if (element == null || string == null) {
            lfn.b(5, TC, "getMultipleElements() : Invalid Method Parameters! TagName = '" + string + "', RootElement = '" + element + "'!");
            assert (false);
            throw new bo("cities_config.xml");
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
                lfn.b(5, TC, "getMultipleElements() : Required XML Elements Not Found! Element Name = '" + string + "'!");
                assert (false);
                throw new bo("cities_config.xml");
            }
            return set;
        }
        lfn.b(5, TC, "getMultipleElements() : Required XML Nodes Not Found! Node Name = '" + string + "'!");
        assert (false);
        throw new bo("cities_config.xml");
    }

    private static boolean c(String string, Element element) {
        if (string == null || element == null) {
            return false;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, TC, "parseBooleanAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("cities_config.xml");
        }
        return Boolean.parseBoolean(element.getAttribute(string));
    }

    private static Element a(String string, Element element) {
        if (element == null || string == null) {
            lfn.b(5, TC, "getSingleElement() : Invalid Method Parameters! TagName = '" + string + "', RootElement = '" + element + "'!");
            assert (false);
            throw new bo("cities_config.xml");
        }
        NodeList nodeList = element.getElementsByTagName(string);
        if (nodeList != null && nodeList.getLength() > 0) {
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                Node node = nodeList.item(i2);
                if (node.getNodeType() != 1) continue;
                return (Element)node;
            }
            lfn.b(5, TC, "getSingleElement() : Required XML Element Not Found! Element Name = '" + string + "'!");
            assert (false);
            throw new bo("cities_config.xml");
        }
        lfn.b(5, TC, "getSingleElement() : Required XML Node Not Found! Node Name = '" + string + "'!");
        assert (false);
        throw new bo("cities_config.xml");
    }

    private static int d(String string, Element element) {
        if (string == null || element == null) {
            return 0;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, TC, "parseIntegerAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("cities_config.xml");
        }
        try {
            return Integer.parseInt(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, TC, "parseIntegerAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Integer!");
            assert (false);
            throw new bo("cities_config.xml");
        }
    }

    private static double u(Element element) {
        if (element == null) {
            return 0.0;
        }
        String string = avy;
        return jts.f(string, element);
    }

    private static double f(String string, Element element) {
        if (string == null || element == null) {
            return 0.0;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, TC, "parseDoubleAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("cities_config.xml");
        }
        try {
            return Double.parseDouble(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, TC, "parseDoubleAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Double!");
            assert (false);
            throw new bo("cities_config.xml");
        }
    }

    private static float e(String string, Element element) {
        if (string == null || element == null) {
            return 0.0f;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, TC, "parseFloatAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("cities_config.xml");
        }
        try {
            return Float.parseFloat(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, TC, "parseFloatAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Float!");
            assert (false);
            throw new bo("cities_config.xml");
        }
    }

    public static void a(bqy bqy2, int[] nArray, int[] nArray2, ljq ljq2, dxr dxr2, ldv ldv2) {
        if (!jts.d(bqy2)) {
            return;
        }
        jts.a(nArray, nArray2, ljq2, dxr2, ldv2, bqy2);
    }

    public static void a(bqy bqy2, cte[] cteArray, ljq ljq2, dxr dxr2, ldv ldv2) {
        if (!jts.d(bqy2)) {
            return;
        }
        if (cteArray == null || cteArray.length == 0) {
            return;
        }
        int[] nArray = new int[cteArray.length];
        int[] nArray2 = new int[cteArray.length];
        for (int i2 = 0; i2 < cteArray.length; ++i2) {
            nArray[i2] = cteArray[i2].ResourceType;
            nArray2[i2] = cteArray[i2].asi;
        }
        jts.a(nArray, nArray2, ljq2, dxr2, ldv2, bqy2);
    }

    private static void a(int[] nArray, int[] nArray2, ljq ljq2, dxr dxr2, ldv ldv2, bqy bqy2) {
        gvd gvd2 = (gvd)dxr2.h(32279, ldv2, lcr.qEx);
        gvd2.c(ljq2);
        gvd2.d(nArray, nArray2);
        gvd2.c(bqy2);
        dxr2.E(gvd2);
    }

    private static boolean d(bqy bqy2) {
        switch (bqy2) {
            case dGa: {
                break;
            }
            case dGM: {
                break;
            }
            case dGQ: {
                break;
            }
            case dGL: {
                break;
            }
            case dGh: {
                break;
            }
            case dGZ: 
            case dGf: {
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }
}

