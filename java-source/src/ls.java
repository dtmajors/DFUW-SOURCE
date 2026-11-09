/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ls {
    public static final String TC = "Mentoring";
    private static final lju avd = new lju(1, 0);
    private static final String ave = "Mentoring";
    private static final String avf = "Enabled";
    private static final String avg = "SystemOpenForApprentices";
    private static final String avh = "MaxApprentices";
    private static final String avi = "MentorMinProwess";
    private static final String avj = "ApprenticeMaxProwess";
    private static final String avk = "MaximumScore";
    private static final String avl = "MinRatesBeforeView";
    private static final String avm = "MinCancelScore";
    private static final String avn = "ExpirationScore";
    private static final String avo = "ProwessPointsMaxReward";
    private static final String avp = "ProwessPointsDeltaMult";
    private static final String avq = "ProwessPointsDeltaMultFeat";
    private static final String avr = "ProwessPointsDeltaMultHarv";
    private static final String avs = "ProwessPointsDeltaMultCraft";
    private static final String avt = "CancelCoolDown";
    private static final String avu = "PendingExpirationTime";
    private static final String avv = "version_major";
    private static final String avw = "version_minor";
    private static final String avx = "debug_value";
    private static final String avy = "live_value";
    private static boolean avz = false;
    private static int avA = 0;
    private static int avB = 0;
    private static int avC = 0;
    private static float avD = 0.0f;
    private static int avE = 0;
    private static float avF = 0.0f;
    private static float avG = 0.0f;
    private static float avH = 0.0f;
    private static float avI = 0.0f;
    private static float avJ = 0.0f;
    private static float avK = 0.0f;
    private static float avL = 0.0f;
    private static double avM = 0.0;
    private static double avN = 0.0;
    private static boolean avO = false;

    public static final boolean isEnabled() {
        return avz;
    }

    public static final int px() {
        return avA;
    }

    public static final int py() {
        return avB;
    }

    public static final int pz() {
        return avC;
    }

    public static final float pA() {
        return avD;
    }

    public static final int pB() {
        return avE;
    }

    public static final double pC() {
        return avM;
    }

    public static final float pD() {
        return avF;
    }

    public static final double pE() {
        return avN;
    }

    public static final float pF() {
        return avG;
    }

    public static final float pG() {
        return avH;
    }

    public static final float pH() {
        return avI;
    }

    public static final float pI() {
        return avJ;
    }

    public static final float pJ() {
        return avK;
    }

    public static final float pK() {
        return avL;
    }

    public static final boolean pL() {
        return avO;
    }

    public static void nJ() {
        String string = "xml-files/gamelogicinfo/mentoring_config.xml";
        Document document = null;
        try {
            document = jsy.tJ("xml-files/gamelogicinfo/mentoring_config.xml");
        }
        catch (bo bo2) {
            lfn.b(5, "Mentoring", "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw new bo("mentoring_config.xml", bo2);
        }
        Element element = document.getDocumentElement();
        if (!element.getNodeName().equals("Mentoring")) {
            lfn.b(5, "Mentoring", "parseConfig() : Unexpected root node encountered! Expected 'Mentoring', Found '" + element.getLocalName() + "'!");
            assert (false);
            return;
        }
        lju lju2 = new lju(ls.d(avv, element), ls.d(avw, element));
        if (!lju2.b(avd)) {
            lfn.b(5, "Mentoring", "parseConfig() : Version number mismatch! Parser " + avd.toString() + ", Document " + lju2.toString());
            assert (false);
            throw new bo("mentoring_config.xml");
        }
        String string2 = avy;
        avz = ls.c(avy, ls.a(avf, element));
        avO = ls.c(avy, ls.a(avg, element));
        avA = ls.d(avy, ls.a(avh, element));
        avB = ls.d(avy, ls.a(avi, element));
        avC = ls.d(avy, ls.a(avj, element));
        avD = ls.e(avy, ls.a(avk, element));
        avE = ls.d(avy, ls.a(avl, element));
        avF = ls.e(avy, ls.a(avm, element));
        avG = ls.e(avy, ls.a(avn, element));
        avH = ls.e(avy, ls.a(avo, element));
        avI = ls.e(avy, ls.a(avp, element));
        avJ = ls.e(avy, ls.a(avq, element));
        avK = ls.e(avy, ls.a(avr, element));
        avL = ls.e(avy, ls.a(avs, element));
        avM = ls.f(avy, ls.a(avt, element));
        avN = ls.f(avy, ls.a(avu, element));
    }

    private static Element a(String string, Element element) {
        if (element == null || string == null) {
            lfn.b(5, "Mentoring", "getSingleElement() : Invalid Method Parameters! TagName = '" + string + "', RootElement = '" + element + "'!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
        NodeList nodeList = element.getElementsByTagName(string);
        if (nodeList != null && nodeList.getLength() > 0) {
            for (int i = 0; i < nodeList.getLength(); ++i) {
                Node node = nodeList.item(i);
                if (node.getNodeType() != 1) continue;
                return (Element)node;
            }
            lfn.b(5, "Mentoring", "getSingleElement() : Required XML Element Not Found! Element Name = '" + string + "'!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
        lfn.b(5, "Mentoring", "getSingleElement() : Required XML Node Not Found! Node Name = '" + string + "'!");
        assert (false);
        throw new bo("mentoring_config.xml");
    }

    private static boolean c(String string, Element element) {
        if (string == null || element == null) {
            return false;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, "Mentoring", "parseBooleanAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
        return Boolean.parseBoolean(element.getAttribute(string));
    }

    private static int d(String string, Element element) {
        if (string == null || element == null) {
            return 0;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, "Mentoring", "parseIntegerAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
        try {
            return Integer.parseInt(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "Mentoring", "parseIntegerAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Integer!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
    }

    private static float e(String string, Element element) {
        if (string == null || element == null) {
            return 0.0f;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, "Mentoring", "parseFloatAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
        try {
            return Float.parseFloat(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "Mentoring", "parseFloatAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Float!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
    }

    private static double f(String string, Element element) {
        if (string == null || element == null) {
            return 0.0;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, "Mentoring", "parseDoubleAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
        try {
            return Double.parseDouble(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "Mentoring", "parseDoubleAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Double!");
            assert (false);
            throw new bo("mentoring_config.xml");
        }
    }
}

