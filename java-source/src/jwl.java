/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jwl {
    private static final lju avd = new lju(4, 0);
    private static final String ave = "conquest_config";
    private static final String oXh = "timer";
    private static final String oXi = "option_int";
    private static final String oXj = "option_float";
    private static final String oXk = "option_boolean";
    private static final String oXl = "option_string";
    private static final String oXm = "option_enumeration";
    private static final String avv = "version_major";
    private static final String avw = "version_minor";
    private static final String oXn = "id";
    private static final String oXo = "debug";
    private static final String oXp = "live";
    private static final String oXq = "value";
    private static final Map<bad.a, String> oXr = lcn.emw();

    public void dTi() {
        String string = "xml-files/server/conquest/conquest_config.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw bo2;
        }
        Element element = document.getDocumentElement();
        String string2 = element.getAttribute(avv);
        String string3 = element.getAttribute(avw);
        int n = 0;
        int n2 = 0;
        try {
            n = Integer.parseInt(string2);
            n2 = Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : Error parsing version number from document! Document Version[" + string2 + "," + string3 + "]");
            assert (false);
            throw new bq("Unable to parse XML document version string!", numberFormatException);
        }
        lju lju2 = new lju(n, n2);
        if (!lju2.b(avd)) {
            lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : Version number mismatch! Parser " + avd.toString() + ", Document " + lju2.toString());
            assert (false);
            throw new bo(string);
        }
        NodeList nodeList = document.getElementsByTagName(oXh);
        this.d(nodeList);
        nodeList = document.getElementsByTagName(oXi);
        this.e(nodeList);
        nodeList = document.getElementsByTagName(oXj);
        this.f(nodeList);
        nodeList = document.getElementsByTagName(oXk);
        this.g(nodeList);
        nodeList = document.getElementsByTagName(oXl);
        this.h(nodeList);
        nodeList = document.getElementsByTagName(oXm);
        this.i(nodeList);
    }

    private void d(NodeList nodeList) {
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element = (Element)node;
            String string = element.getAttribute(oXn);
            String string2 = element.getAttribute(oXp);
            if (string == null || string.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseTimers() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXh, oXn);
            }
            if (string2 == null || string2.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseTimers() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXh, oXq);
            }
            bad.b b2 = bad.b.getSettingByName(string);
            if (b2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "parseTimers() : Unrecognised option encountered! Node = " + node.toString());
                assert (false);
                throw new bq("Unrecognised option encountered! Node = " + node.toString());
            }
            if (oXr.get((Object)b2.ahC()).compareTo(oXh) != 0) {
                lfn.b(5, this.getClass().getSimpleName(), "parseTimers() : Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
                assert (false);
                throw new bq("Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
            }
            double d2 = 0.0;
            try {
                d2 = Double.parseDouble(string2);
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, this.getClass().getSimpleName(), "parseTimers() : Unparsable timer node encountered! Node = " + node.toString() + ", Time Attribute = " + string2);
                assert (false);
                throw new bq("Invalid timer option value encountered!", numberFormatException);
            }
            bad.c c2 = bad.b(b2, d2);
            if (c2 != bad.c.cLs) {
                lfn.b(5, this.getClass().getSimpleName(), "parseTimers() : Validation failed for setting '" + b2.name() + "'... Value = " + d2 + "... ValidationResult = " + (Object)((Object)c2));
                assert (false);
                throw new bq("Validation failed for setting '" + b2.name() + "'... Value = " + d2 + "... ValidationResult = " + (Object)((Object)c2));
            }
            bad.a(b2, d2);
        }
    }

    private void e(NodeList nodeList) {
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element = (Element)node;
            String string = element.getAttribute(oXn);
            String string2 = element.getAttribute(oXq);
            if (string == null || string.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseIntegerOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXi, oXn);
            }
            if (string2 == null || string2.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseIntegerOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXi, oXq);
            }
            bad.b b2 = bad.b.getSettingByName(string);
            if (b2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "parseIntegerOptions() : Unrecognised option encountered! Node = " + node.toString());
                assert (false);
                throw new bq("Unrecognised option encountered! Node = " + node.toString());
            }
            if (oXr.get((Object)b2.ahC()).compareTo(oXi) != 0) {
                lfn.b(5, this.getClass().getSimpleName(), "parseIntegerOptions() : Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
                assert (false);
                throw new bq("Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
            }
            int n = 0;
            try {
                n = Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, this.getClass().getSimpleName(), "parseIntegerOptions() : Unparsable integer option node encountered! Node = " + node.toString() + ", Time Attribute = " + string2);
                assert (false);
                throw new bq("Invalid integer option value encountered!", numberFormatException);
            }
            bad.c c2 = bad.b(b2, n);
            if (c2 != bad.c.cLs) {
                lfn.b(5, this.getClass().getSimpleName(), "parseIntegerOptions() : Validation failed for setting '" + b2.name() + "'... Value = " + n + "... ValidationResult = " + (Object)((Object)c2));
                assert (false);
                throw new bq("Validation failed for setting '" + b2.name() + "'... Value = " + n + "... ValidationResult = " + (Object)((Object)c2));
            }
            bad.a(b2, n);
        }
    }

    private void f(NodeList nodeList) {
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element = (Element)node;
            String string = element.getAttribute(oXn);
            String string2 = element.getAttribute(oXq);
            if (string == null || string.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseFloatOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXj, oXn);
            }
            if (string2 == null || string2.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseFloatOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXj, oXq);
            }
            bad.b b2 = bad.b.getSettingByName(string);
            if (b2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "parseFloatOptions() : Unrecognised option encountered! Node = " + node.toString());
                assert (false);
                throw new bq("Unrecognised option encountered! Node = " + node.toString());
            }
            if (oXr.get((Object)b2.ahC()).compareTo(oXj) != 0) {
                lfn.b(5, this.getClass().getSimpleName(), "parseFloatOptions() : Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
                assert (false);
                throw new bq("Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
            }
            float f = 0.0f;
            try {
                f = Float.parseFloat(string2);
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, this.getClass().getSimpleName(), "parseFloatOptions() : Unparsable float option node encountered! Node = " + node.toString() + ", Time Attribute = " + string2);
                assert (false);
                throw new bq("Invalid float option value encountered!", numberFormatException);
            }
            bad.c c2 = bad.b(b2, f);
            if (c2 != bad.c.cLs) {
                lfn.b(5, this.getClass().getSimpleName(), "parseFloatOptions() : Validation failed for setting '" + b2.name() + "'... Value = " + f + "... ValidationResult = " + (Object)((Object)c2));
                assert (false);
                throw new bq("Validation failed for setting '" + b2.name() + "'... Value = " + f + "... ValidationResult = " + (Object)((Object)c2));
            }
            bad.a(b2, f);
        }
    }

    private void g(NodeList nodeList) {
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element = (Element)node;
            String string = element.getAttribute(oXn);
            String string2 = element.getAttribute(oXq);
            if (string == null || string.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseBooleanOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXk, oXn);
            }
            if (string2 == null || string2.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseBooleanOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXk, oXq);
            }
            bad.b b2 = bad.b.getSettingByName(string);
            if (b2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "parseBooleanOptions() : Unrecognised option encountered! Node = " + node.toString());
                assert (false);
                throw new bq("Unrecognised option encountered! Node = " + node.toString());
            }
            if (oXr.get((Object)b2.ahC()).compareTo(oXk) != 0) {
                lfn.b(5, this.getClass().getSimpleName(), "parseBooleanOptions() : Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
                assert (false);
                throw new bq("Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
            }
            boolean bl = this.parseBoolean(string2);
            bad.c c2 = bad.b(b2, bl);
            if (c2 != bad.c.cLs) {
                lfn.b(5, this.getClass().getSimpleName(), "parseBooleanOptions() : Validation failed for setting '" + b2.name() + "'... Value = " + bl + "... ValidationResult = " + (Object)((Object)c2));
                assert (false);
                throw new bq("Validation failed for setting '" + b2.name() + "'... Value = " + bl + "... ValidationResult = " + (Object)((Object)c2));
            }
            bad.a(b2, bl);
        }
    }

    private void h(NodeList nodeList) {
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element = (Element)node;
            String string = element.getAttribute(oXn);
            String string2 = element.getAttribute(oXq);
            if (string == null || string.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseStringOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXl, oXn);
            }
            if (string2 == null || string2.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseStringOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXl, oXq);
            }
            bad.b b2 = bad.b.getSettingByName(string);
            if (b2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "parseStringOptions() : Unrecognised option encountered! Node = " + node.toString());
                assert (false);
                throw new bq("Unrecognised option encountered! Node = " + node.toString());
            }
            if (oXr.get((Object)b2.ahC()).compareTo(oXl) != 0) {
                lfn.b(5, this.getClass().getSimpleName(), "parseStringOptions() : Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
                assert (false);
                throw new bq("Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
            }
            bad.c c2 = bad.b(b2, string2);
            if (c2 != bad.c.cLs) {
                lfn.b(5, this.getClass().getSimpleName(), "parseStringOptions() : Validation failed for setting '" + b2.name() + "'... Value = " + string2 + "... ValidationResult = " + (Object)((Object)c2));
                assert (false);
                throw new bq("Validation failed for setting '" + b2.name() + "'... Value = " + string2 + "... ValidationResult = " + (Object)((Object)c2));
            }
            bad.a(b2, string2);
        }
    }

    private void i(NodeList nodeList) {
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            bad.c c2;
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element = (Element)node;
            String string = element.getAttribute(oXn);
            String string2 = element.getAttribute(oXq);
            if (string == null || string.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseEnumerationOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXm, oXn);
            }
            if (string2 == null || string2.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseEnumerationOptions() : Invalid attributes encountered! Node = " + node.toString());
                assert (false);
                throw new bu(oXm, oXq);
            }
            bad.b b2 = bad.b.getSettingByName(string);
            if (b2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "parseEnumerationOptions() : Unrecognised option encountered! Node = " + node.toString());
                assert (false);
                throw new bq("Unrecognised option encountered! Node = " + node.toString());
            }
            if (oXr.get((Object)b2.ahC()).compareTo(oXm) != 0) {
                lfn.b(5, this.getClass().getSimpleName(), "parseEnumerationOptions() : Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
                assert (false);
                throw new bq("Data-type mismatch encountered! Node = " + node.toString() + ", Expected Data Type = " + b2.ahC().name());
            }
            Enum enum_ = bab.getPhaseByName(string2);
            if (enum_ == null) {
                enum_ = bax.getWagerDivisionByName(string2);
            }
            if (enum_ == null) {
                enum_ = azs.getLossConditionByName(string2);
            }
            if ((c2 = bad.b(b2, enum_)) != bad.c.cLs) {
                lfn.b(5, this.getClass().getSimpleName(), "parseEnumerationOptions() : Validation failed for setting '" + b2.name() + "'... Value = " + string2 + "... ValidationResult = " + (Object)((Object)c2));
                assert (false);
                throw new bq("Validation failed for setting '" + b2.name() + "'... Value = " + string2 + "... ValidationResult = " + (Object)((Object)c2));
            }
            bad.a(b2, enum_);
        }
    }

    private boolean parseBoolean(String string) {
        if ("false".compareToIgnoreCase(string) == 0 || "true".compareToIgnoreCase(string) == 0) {
            return Boolean.parseBoolean(string);
        }
        throw new bq("String cannot be parsed to a valid boolean value! String = " + string);
    }

    static {
        oXr.put(bad.a.cJj, oXh);
        oXr.put(bad.a.cJk, oXi);
        oXr.put(bad.a.cJl, oXj);
        oXr.put(bad.a.cJm, oXk);
        oXr.put(bad.a.cJn, oXl);
        oXr.put(bad.a.cJp, oXm);
        oXr.put(bad.a.cJo, oXl);
    }
}

