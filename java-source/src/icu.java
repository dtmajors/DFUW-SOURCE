/*
 * Decompiled with CFR.
 */
import java.util.Map;

public enum icu {
    lHJ("Helmet"),
    lHK("Gear"),
    lHL("Ink"),
    lHM("Axe"),
    lHN("Prowess"),
    lHO("Bag"),
    lHP("QuestionMark"),
    lHQ("Spiral"),
    lHR("House"),
    lHS("Monster"),
    lHT("SwordSwing"),
    lHU("Flag"),
    lHV("Party"),
    lHW("Shield");

    private String lHX;
    private String lHY;
    private String lHZ;
    private String lIa;
    private String lIb;
    private String lIc;
    private String lId;
    private String lIe;
    private static Map<String, String> lIf;
    private static Map<String, String> lIg;

    private icu(String string2) {
        this.lHX = icu._addResource(string2, "Off", "Disabled");
        this.lHY = icu._addResource(string2, "Off", "Hover");
        this.lHZ = icu._addResource(string2, "Off", "Normal");
        this.lIa = icu._addResource(string2, "Off", "Pushing");
        this.lIb = icu._addResource(string2, "On", "Disabled");
        this.lIc = icu._addResource(string2, "On", "Hover");
        this.lId = icu._addResource(string2, "On", "Normal");
        this.lIe = icu._addResource(string2, "On", "Pushing");
    }

    public String cNT() {
        return this.lHX;
    }

    public String cNU() {
        return this.lHY;
    }

    public String cNV() {
        return this.lHZ;
    }

    public String cNW() {
        return this.lIa;
    }

    public String cNX() {
        return this.lIb;
    }

    public String cNY() {
        return this.lIc;
    }

    public String cNZ() {
        return this.lId;
    }

    public String cOa() {
        return this.lIe;
    }

    public static icu getDefaultChatIcon() {
        return lHQ;
    }

    public static icu getIconFromResource(String string) {
        for (icu icu2 : icu.values()) {
            if (!icu2.pJ(string)) continue;
            return icu2;
        }
        return null;
    }

    public boolean pJ(String string) {
        if (lhn.equal(string, this.lHX)) {
            return true;
        }
        if (lhn.equal(string, this.lHY)) {
            return true;
        }
        if (lhn.equal(string, this.lHZ)) {
            return true;
        }
        if (lhn.equal(string, this.lIa)) {
            return true;
        }
        if (lhn.equal(string, this.lIb)) {
            return true;
        }
        if (lhn.equal(string, this.lIc)) {
            return true;
        }
        if (lhn.equal(string, this.lId)) {
            return true;
        }
        return lhn.equal(string, this.lIe);
    }

    public String cOb() {
        return this.lHZ;
    }

    public static String convertResourceNameToResourceId(String string) {
        return lIf.get(string);
    }

    public static String convertResourceIdToResourceName(String string) {
        return lIg.get(string);
    }

    private static String _addResource(String string, String string2, String string3) {
        if (lIf == null) {
            lIf = lcn.emw();
        }
        if (lIg == null) {
            lIg = lcn.emw();
        }
        String string4 = string.toLowerCase();
        String string5 = "/dfdata/texture/gui/j2f/chat/button_tab_icon_" + string4 + "/button_tab_icon_" + string4 + "_" + string2.toLowerCase() + "_" + string3.toLowerCase() + ".png";
        String string6 = "ChatIcon" + string + string2 + string3;
        lIf.put(string5, string6);
        lIg.put(string6, string5);
        return string5;
    }
}

