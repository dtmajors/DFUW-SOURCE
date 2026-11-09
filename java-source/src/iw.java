/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class iw {
    private static final lju ahC = new lju(1, 0);
    private static Map<String, Integer> ahD = lcn.emw();
    private static Map<String, Boolean> ahE = lcn.emw();
    private static Map<aud.a, lfs<Boolean, Boolean>> ahF = lcn.emw();
    private static int ahG = 10000;
    private static float ahH = 0.5f;
    private static boolean ahI = false;
    private static boolean ahJ = false;
    private static boolean ahK = false;
    private static boolean ahL = false;
    private static boolean ahM = false;
    private static boolean ahN = false;
    private static boolean ahO = false;
    private static boolean ahP = false;
    private static boolean ahQ = true;
    private static boolean ahR = false;
    private static final String ahS = "trial_accounts_config";
    private static final String ahT = "prowess_restrictions";
    private static final String ahU = "prowess_cap";
    private static final String ahV = "encumbrance_restrictions";
    private static final String ahW = "encumbrance_modifier";
    private static final String ahX = "ownership_restrictions";
    private static final String ahY = "own_house";
    private static final String ahZ = "clan_restrictions";
    private static final String aia = "create_clan";
    private static final String aib = "become_leader";
    private static final String aic = "initiate_conquest";
    private static final String aid = "capture_territorial_objects";
    private static final String aie = "market_restrictions";
    private static final String aif = "issue_buy_orders";
    private static final String aig = "fulfil_buy_orders";
    private static final String aih = "issue_sell_orders";
    private static final String aii = "fulfil_sell_orders";
    private static final String aij = "harvesting_restrictions";
    private static final String aik = "harvesting_limit";
    private static final String ail = "use_restrictions";
    private static final String aim = "use_restriction";
    private static final String ain = "chat_restrictions";
    private static final String aio = "chat_restriction";
    private static final String aip = "version_major";
    private static final String aiq = "version_minor";
    private static final String air = "clear_defaults";
    private static final String ais = "value";
    private static final String ait = "skill";
    private static final String aiu = "resource";
    private static final String aiv = "channel";
    private static final String aiw = "read";
    private static final String aix = "write";

    public static int ny() {
        return ahG;
    }

    public static float nz() {
        return ahH;
    }

    public static boolean nA() {
        return ahI;
    }

    public static boolean nB() {
        return ahJ;
    }

    public static boolean nC() {
        return ahK;
    }

    public static boolean nD() {
        return ahL;
    }

    public static boolean nE() {
        return ahM;
    }

    public static boolean nF() {
        return ahN;
    }

    public static boolean nG() {
        return ahO;
    }

    public static boolean nH() {
        return ahP;
    }

    public static boolean nI() {
        return ahQ;
    }

    public static int aY(String string) {
        return string == null ? 0 : (ahD.containsKey(string.toLowerCase()) ? ahD.get(string.toLowerCase()) : -1);
    }

    public static int cv(int n) {
        return iw.aY(lea.enZ().getName(n));
    }

    public static boolean aZ(String string) {
        if (string == null) {
            return false;
        }
        if (ahE.containsKey(string.toLowerCase())) {
            return ahE.get(string.toLowerCase());
        }
        int n = cug.ih((String)string);
        for (String string2 : ahE.keySet()) {
            if (!lea.enW().isDescendant(n, cug.ih((String)string2))) continue;
            return ahE.get(string2);
        }
        return true;
    }

    public static boolean cw(int n) {
        return iw.aZ(lea.enW().getName(n));
    }

    public static boolean c(aud.a a2) {
        return ahF.containsKey((Object)a2) ? (Boolean)iw.ahF.get((Object)((Object)a2)).reX : true;
    }

    public static boolean d(aud.a a2) {
        return ahF.containsKey((Object)a2) ? (Boolean)iw.ahF.get((Object)((Object)a2)).reY : true;
    }

    public static void nJ() {
        if (ahR) {
            return;
        }
        String string = "xml-files/gamelogicinfo/trial_accounts_config.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, iw.class.getSimpleName(), "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw new bo("trial_accounts_config.xml", bo2);
        }
        Element element = document.getDocumentElement();
        if (!element.getNodeName().equals(ahS)) {
            lfn.b(5, iw.class.getSimpleName(), "parseConfig() : Unexpected root node encountered! Expected 'trial_accounts_config', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        lju lju2 = new lju(iw.d(aip, element), iw.d(aiq, element));
        if (!lju2.b(ahC)) {
            lfn.b(5, iw.class.getSimpleName(), "parseConfig() : Version number mismatch! Parser " + ahC.toString() + ", Document " + lju2.toString());
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        iw.a(iw.a(ahT, element));
        iw.b(iw.a(ahV, element));
        iw.c(iw.a(ahX, element));
        iw.d(iw.a(ahZ, element));
        iw.e(iw.a(aie, element));
        iw.f(iw.a(aij, element));
        iw.g(iw.a(ail, element));
        iw.h(iw.a(ain, element));
        ahR = true;
    }

    private static void a(Element element) {
        if (element == null) {
            lfn.b(5, iw.class.getSimpleName(), "parseProwessRestrictions() : RestrictionsRoot Element is Null!!!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (!element.getNodeName().equals(ahT)) {
            lfn.b(5, iw.class.getSimpleName(), "parseProwessRestrictions() : Unexpected root node encountered! Expected 'prowess_restrictions', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        ahG = iw.d(ais, iw.a(ahU, element));
    }

    private static void b(Element element) {
        if (element == null) {
            lfn.b(5, iw.class.getSimpleName(), "parseEncumberanceRestrictions() : RestrictionsRoot Element is Null!!!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (!element.getNodeName().equals(ahV)) {
            lfn.b(5, iw.class.getSimpleName(), "parseEncumbranceRestrictions() : Unexpected root node encountered! Expected 'encumbrance_restrictions', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        ahH = iw.e(ais, iw.a(ahW, element));
    }

    private static void c(Element element) {
        if (element == null) {
            lfn.b(5, iw.class.getSimpleName(), "parseOwnershipRestrictions() : RestrictionsRoot Element is Null!!!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (!element.getNodeName().equals(ahX)) {
            lfn.b(5, iw.class.getSimpleName(), "parseOwnershipRestrictions() : Unexpected root node encountered! Expected 'ownership_restrictions', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        ahI = iw.c(ais, iw.a(ahY, element));
    }

    private static void d(Element element) {
        if (element == null) {
            lfn.b(5, iw.class.getSimpleName(), "parseClanRestrictions() : RestrictionsRoot Element is Null!!!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (!element.getNodeName().equals(ahZ)) {
            lfn.b(5, iw.class.getSimpleName(), "parseClanRestrictions() : Unexpected root node encountered! Expected 'clan_restrictions', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        ahJ = iw.c(ais, iw.a(aia, element));
        ahK = iw.c(ais, iw.a(aib, element));
        ahL = iw.c(ais, iw.a(aic, element));
        ahM = iw.c(ais, iw.a(aid, element));
    }

    private static void e(Element element) {
        if (element == null) {
            lfn.b(5, iw.class.getSimpleName(), "parseMarketRestrictions() : RestrictionsRoot Element is Null!!!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (!element.getNodeName().equals(aie)) {
            lfn.b(5, iw.class.getSimpleName(), "parseMarketRestrictions() : Unexpected root node encountered! Expected 'market_restrictions', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        ahN = iw.c(ais, iw.a(aif, element));
        ahO = iw.c(ais, iw.a(aig, element));
        ahP = iw.c(ais, iw.a(aih, element));
        ahQ = iw.c(ais, iw.a(aii, element));
    }

    private static void f(Element element) {
        if (element == null) {
            lfn.b(5, iw.class.getSimpleName(), "parseHarvestingRestrictions() : RestrictionsRoot Element is Null!!!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (!element.getNodeName().equals(aij)) {
            lfn.b(5, iw.class.getSimpleName(), "parseHarvestingRestrictions() : Unexpected root node encountered! Expected 'harvesting_restrictions', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (iw.c(air, element)) {
            ahD.clear();
        }
        for (Element element2 : iw.b(aik, element)) {
            String string = element2.getAttribute(ait);
            int n = iw.d(ais, element2);
            if (string == null || string.isEmpty()) {
                lfn.b(5, iw.class.getSimpleName(), "parseHarvestingRestrictions() : Invalid Skill Name!!!");
                assert (false);
                throw new bo("trial_accounts_config.xml");
            }
            ahD.put(string.toLowerCase(), n);
        }
    }

    private static void g(Element element) {
        if (element == null) {
            lfn.b(5, iw.class.getSimpleName(), "parseUseRestrictions() : RestrictionsRoot Element is Null!!!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (!element.getNodeName().equals(ail)) {
            lfn.b(5, iw.class.getSimpleName(), "parseUseRestrictions() : Unexpected root node encountered! Expected 'use_restrictions', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (iw.c(air, element)) {
            ahE.clear();
        }
        for (Element element2 : iw.b(aim, element)) {
            String string = element2.getAttribute(aiu);
            boolean bl = iw.c(ais, element2);
            if (string == null || string.isEmpty()) {
                lfn.b(5, iw.class.getSimpleName(), "parseUseRestrictions() : Invalid Resource Name!!!");
                assert (false);
                throw new bo("trial_accounts_config.xml");
            }
            ahE.put(string.toLowerCase(), bl);
        }
    }

    private static void h(Element element) {
        if (element == null) {
            lfn.b(5, iw.class.getSimpleName(), "parseChatRestrictions() : RestrictionsRoot Element is Null!!!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (!element.getNodeName().equals(ain)) {
            lfn.b(5, iw.class.getSimpleName(), "parseChatRestrictions() : Unexpected root node encountered! Expected 'chat_restrictions', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        if (iw.c(air, element)) {
            ahF.clear();
        }
        for (Element element2 : iw.b(aio, element)) {
            aud.a a2 = aud.a.parse(element2.getAttribute(aiv));
            boolean bl = iw.c(aiw, element2);
            boolean bl2 = iw.c(aix, element2);
            if (a2 == null) {
                lfn.b(5, iw.class.getSimpleName(), "parseChatRestrictions() : Invalid Chat Channel Name!!!");
                assert (false);
                throw new bo("trial_accounts_config.xml");
            }
            ahF.put(a2, new lfs<Boolean, Boolean>(bl, bl2));
        }
    }

    private static Element a(String string, Element element) {
        if (element == null || string == null) {
            lfn.b(5, iw.class.getSimpleName(), "getSingleElement() : Invalid Method Parameters! TagName = '" + string + "', RootElement = '" + element + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        NodeList nodeList = element.getElementsByTagName(string);
        if (nodeList != null && nodeList.getLength() > 0) {
            for (int i = 0; i < nodeList.getLength(); ++i) {
                Node node = nodeList.item(i);
                if (node.getNodeType() != 1) continue;
                return (Element)node;
            }
            lfn.b(5, iw.class.getSimpleName(), "getSingleElement() : Required XML Element Not Found! Element Name = '" + string + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        lfn.b(5, iw.class.getSimpleName(), "getSingleElement() : Required XML Node Not Found! Node Name = '" + string + "'!");
        assert (false);
        throw new bo("trial_accounts_config.xml");
    }

    private static Set<Element> b(String string, Element element) {
        if (element == null || string == null) {
            lfn.b(5, iw.class.getSimpleName(), "getMultipleElements() : Invalid Method Parameters! TagName = '" + string + "', RootElement = '" + element + "'!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        NodeList nodeList = element.getElementsByTagName(string);
        if (nodeList != null && nodeList.getLength() > 0) {
            Set<Element> set = lcn.emx();
            for (int i = 0; i < nodeList.getLength(); ++i) {
                Node node = nodeList.item(i);
                if (node.getNodeType() != 1) continue;
                set.add((Element)node);
            }
            if (set.isEmpty()) {
                lfn.b(5, iw.class.getSimpleName(), "getMultipleElements() : Required XML Elements Not Found! Element Name = '" + string + "'!");
                assert (false);
                throw new bo("trial_accounts_config.xml");
            }
            return set;
        }
        lfn.b(5, iw.class.getSimpleName(), "getMultipleElements() : Required XML Nodes Not Found! Node Name = '" + string + "'!");
        assert (false);
        throw new bo("trial_accounts_config.xml");
    }

    private static boolean c(String string, Element element) {
        if (string == null || element == null) {
            return false;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, iw.class.getSimpleName(), "parseBooleanAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        return Boolean.parseBoolean(element.getAttribute(string));
    }

    private static int d(String string, Element element) {
        if (string == null || element == null) {
            return 0;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, iw.class.getSimpleName(), "parseIntegerAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        try {
            return Integer.parseInt(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, iw.class.getSimpleName(), "parseIntegerAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Integer!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
    }

    private static float e(String string, Element element) {
        if (string == null || element == null) {
            return 0.0f;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, iw.class.getSimpleName(), "parseFloatAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
        try {
            return Float.parseFloat(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, iw.class.getSimpleName(), "parseFloatAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Float!");
            assert (false);
            throw new bo("trial_accounts_config.xml");
        }
    }

    static {
        ahG = 10000;
        ahH = 0.5f;
        ahI = false;
        ahJ = false;
        ahK = false;
        ahL = false;
        ahM = false;
        ahN = false;
        ahO = false;
        ahP = false;
        ahQ = true;
        ahD.put("s_digging", 100);
        ahD.put("s_fishing", 100);
        ahD.put("s_herb gathering", 100);
        ahD.put("s_logging", 100);
        ahD.put("s_mining", 100);
        ahD.put("s_skinning_advanced", 100);
        ahE.put("r_artillery", false);
        ahE.put("r_siegeengine wheel", false);
        ahE.put("r_ships helm", false);
        ahE.put("r_deeds", false);
        ahF.put(aud.a.cap, new lfs<Boolean, Boolean>(true, false));
        ahF.put(aud.a.caG, new lfs<Boolean, Boolean>(true, false));
    }
}

