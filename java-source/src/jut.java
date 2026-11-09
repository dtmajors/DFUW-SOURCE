/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jut {
    private static final String oSz = "quest";
    private static final String oSA = "node";
    private static final String oSB = "condition";
    private static final String oSC = "task";
    private static final String oSD = "action";
    private static final String oSE = "edge";
    private static final String oSF = "quest_line";
    private static final String oSG = "localisation";
    private static final String oSH = "instruction";
    private static final String oSI = "journal_entry";
    private static final String oSJ = "task_instruction";
    private static final String oSK = "quest_item";
    private static final String oSL = "voice_over";
    private static final String oSM = "file";
    private static final String oQd = "id";
    private static final String oSN = "category";
    private static final String oSO = "tag";
    private static final String oSP = "type";
    private static final String oSQ = "value";
    private static final String oSR = "from";
    private static final String oSS = "to";
    public static final String oST = "access_level";
    public static final String oSU = "alignment";
    public static final String oSV = "comparison_type";
    public static final String oSW = "build_mode";
    public static final String oSX = "build_type";
    public static final String oSY = "gender";
    public static final String oSZ = "race";
    public static final String oTa = "faction";
    public static final String oTb = "standing";
    public static final String oTc = "area_id";
    public static final String oTd = "resource_name";
    public static final String oTe = "consume";
    public static final String oTf = "quantity";
    public static final String oTg = "inventory_type";
    public static final String oTh = "distance";
    public static final String oTi = "quest_id";
    public static final String oTj = "quest_line_id";
    public static final String oTk = "timer_length";
    public static final String oTl = "hour_of_day";
    public static final String oTm = "day_period";
    public static final String oTn = "slide_id";
    public static final String oTo = "vendor_id";
    public static final String oTp = "weather_state";
    public static final String oTq = "magnitude";
    public static final String oTr = "skill_name";
    public static final String oTs = "sfx_name";
    public static final String oTt = "world_x";
    public static final String oTu = "world_y";
    public static final String oTv = "world_z";
    public static final String oTw = "fail_fast";
    public static final String oTx = "reward_node_id";
    public static final String oTy = "optional_tasks";
    public static final String oTz = "image_locked";
    public static final String oTA = "image_unlocked";
    public static final String oTB = "item_id";
    public static final String oTC = "language";
    public static final String oTD = "reward_type";

    private jut() {
    }

    public static void dTu() {
        Node node;
        String string = "xml-files/quests/quests.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, jut.class.getSimpleName(), "loadQuests() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            return;
        }
        NodeList nodeList = document.getElementsByTagName(oSz);
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node2 = nodeList.item(i2);
            if (node2.getNodeType() != 1) continue;
            node = (Element)node2;
            jut.um(node.getAttribute(oSM));
        }
        if (lcw.ena()) {
            NodeList nodeList2 = document.getElementsByTagName(oSF);
            for (int i3 = 0; i3 < nodeList2.getLength(); ++i3) {
                node = nodeList2.item(i3);
                if (node.getNodeType() != 1) continue;
                Element element = (Element)node;
                jut.un(element.getAttribute(oSM));
            }
        }
    }

    private static void um(String string) {
        String string2 = "xml-files/quests/" + string;
        Document document = null;
        try {
            document = jsy.tJ(string2);
        }
        catch (bo bo2) {
            lfn.b(5, jut.class.getSimpleName(), "loadQuest() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            return;
        }
        NodeList nodeList = document.getElementsByTagName(oSz);
        if (nodeList.getLength() != 1) {
            return;
        }
        Node node = nodeList.item(0);
        if (node.getNodeType() != 1) {
            return;
        }
        Element element = (Element)node;
        String string3 = element.getAttribute(oTi);
        if (string3 == null || string3.isEmpty()) {
            assert (false) : "Quest Without ID!!!... Quest = " + string;
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 0) {
            return;
        }
        String string4 = element.getAttribute(oSN);
        if (string4 == null || string4.isEmpty()) {
            return;
        }
        xa xa2 = xa.parse(string4);
        if (xa2 == xa.bah) {
            return;
        }
        if (xa2 == xa.bam) {
            return;
        }
        wy wy2 = null;
        wy2 = new wy(n, xa2);
        NodeList nodeList2 = document.getElementsByTagName(oSA);
        for (int i2 = 0; i2 < nodeList2.getLength(); ++i2) {
            Node node2 = nodeList2.item(i2);
            if (node2.getNodeType() != 1) continue;
            jut.a(wy2, (Element)node2);
        }
        NodeList nodeList3 = document.getElementsByTagName(oSE);
        for (int i3 = 0; i3 < nodeList3.getLength(); ++i3) {
            Node node3 = nodeList3.item(i3);
            if (node3.getNodeType() != 1) continue;
            jut.b(wy2, (Element)node3);
        }
        NodeList nodeList4 = document.getElementsByTagName(oSK);
        for (int i4 = 0; i4 < nodeList4.getLength(); ++i4) {
            Node node4 = nodeList4.item(i4);
            if (node4.getNodeType() != 1) continue;
            jut.c(wy2, (Element)node4);
        }
        xc.a(wy2);
    }

    private static void un(String string) {
        String string2 = "xml-files/quests/" + string;
        Document document = null;
        try {
            document = jsy.tJ(string2);
        }
        catch (bo bo2) {
            lfn.b(5, jut.class.getSimpleName(), "loadQuestLine() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            return;
        }
        NodeList nodeList = document.getElementsByTagName(oSF);
        if (nodeList.getLength() != 1) {
            return;
        }
        Node node = nodeList.item(0);
        if (node.getNodeType() != 1) {
            return;
        }
        Element element = (Element)node;
        String string3 = element.getAttribute(oTj);
        if (string3 == null || string3.isEmpty()) {
            assert (false) : "Quest-Line Without ID!!!... Quest-Line = " + string;
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 0) {
            return;
        }
        String string4 = element.getAttribute(oSN);
        if (string4 == null || string4.isEmpty()) {
            return;
        }
        xa xa2 = xa.parse(string4);
        if (xa2 == xa.bah) {
            return;
        }
        if (xa2 == xa.bam) {
            return;
        }
        xb xb2 = null;
        xb2 = new xb(n, xa2);
        NodeList nodeList2 = element.getElementsByTagName(oSz);
        if (nodeList2.getLength() == 0) {
            assert (false) : "Quest-Line Without Quests!!!... Quest-Line = " + string;
            return;
        }
        for (int i2 = 0; i2 < nodeList2.getLength(); ++i2) {
            Node node2 = nodeList2.item(i2);
            if (node2.getNodeType() != 1) continue;
            Element element2 = (Element)node2;
            String string5 = element2.getAttribute(oTi);
            if (string5 == null || string5.isEmpty()) {
                assert (false) : "Quest Tag Without ID!!!... Quest-Line = " + string;
                return;
            }
            int n2 = -1;
            try {
                n2 = Integer.parseInt(string5);
            }
            catch (NumberFormatException numberFormatException) {
                return;
            }
            if (n2 < 0) {
                return;
            }
            wy wy2 = xc.dN(n2);
            if (wy2 == null) {
                assert (false) : "Quest With ID Not Found!!!... Quest-Line = " + string;
                return;
            }
            xb2.a(wy2);
        }
        if (xb2.ws() == 0) {
            assert (false) : "Quest-Line Without Quests!!!... Quest-Line = " + string;
            return;
        }
        xc.b(xb2);
    }

    private static void a(wy wy2, Element element) {
        NodeList nodeList;
        NodeList nodeList2;
        Node node;
        NodeList nodeList3;
        if (wy2 == null || element == null) {
            return;
        }
        String string = element.getAttribute(oQd);
        if (string == null || string.isEmpty()) {
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 0) {
            return;
        }
        String string2 = element.getAttribute(oSP);
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        abc abc2 = abc.bdt;
        abo abo2 = abo.bdC;
        if (string2.startsWith("event_")) {
            abc2 = abc.bdv;
            abo2 = abo.parse(string2);
            if (abo2 == abo.bdC) {
                return;
            }
        } else {
            abc2 = abc.parse(string2);
            if (abc2 == abc.bdt) {
                return;
            }
        }
        aaz aaz2 = null;
        aaz2 = aba.a(abc2, abo2, wy2, n);
        if (aaz2 == null) {
            return;
        }
        if (element.hasAttribute(oTD)) {
            aaz2.a(abb.ParseRewardType(element.getAttribute(oTD)));
        }
        aaz2.az((nodeList3 = element.getElementsByTagName(oSH)) != null && nodeList3.getLength() > 0);
        NodeList nodeList4 = element.getElementsByTagName(oSI);
        aaz2.aA(nodeList4 != null && nodeList4.getLength() > 0);
        NodeList nodeList5 = element.getElementsByTagName(oSL);
        if (nodeList5.getLength() > 0) {
            for (int i2 = 0; i2 < nodeList5.getLength(); ++i2) {
                String string3;
                yw yw2;
                String string4;
                Node node2 = nodeList5.item(i2);
                if (node2.getNodeType() != 1 || (string4 = (node = (Element)node2).getAttribute(oTC)) == null || string4.isEmpty() || (yw2 = yw.parse(string4)) == null || (string3 = node.getAttribute(oSM)) == null || string3.isEmpty()) continue;
                aaz2.a(yw2, string3);
            }
        }
        if (aaz2 instanceof aay && element.hasAttribute(oTy)) {
            String string5 = element.getAttribute(oTy);
            ((aay)aaz2).ax(Boolean.parseBoolean(string5));
        }
        if (aaz2 instanceof zb) {
            NodeList nodeList6;
            if (aaz2 instanceof za) {
                String string6 = element.getAttribute(oTw);
                if (string6 == null || string6.isEmpty()) {
                    return;
                }
                ((za)((Object)aaz2)).aw(Boolean.parseBoolean(string6));
            }
            if ((nodeList6 = element.getElementsByTagName(oSB)).getLength() > 0) {
                for (int i3 = 0; i3 < nodeList6.getLength(); ++i3) {
                    node = nodeList6.item(i3);
                    if (node.getNodeType() != 1) continue;
                    jut.a(wy2, (zb)((Object)aaz2), (Element)node);
                }
            }
        }
        if (aaz2 instanceof acr && (nodeList2 = element.getElementsByTagName(oSC)).getLength() > 0) {
            for (int i4 = 0; i4 < nodeList2.getLength(); ++i4) {
                node = nodeList2.item(i4);
                if (node.getNodeType() != 1) continue;
                jut.a(wy2, (acr)((Object)aaz2), (Element)node);
            }
        }
        if (aaz2 instanceof xl && (nodeList = element.getElementsByTagName(oSD)).getLength() > 0) {
            for (int i5 = 0; i5 < nodeList.getLength(); ++i5) {
                node = nodeList.item(i5);
                if (node.getNodeType() != 1) continue;
                jut.a(wy2, (xl)((Object)aaz2), (Element)node);
            }
        }
        wy2.a(aaz2);
    }

    private static void a(wy wy2, zb zb2, Element element) {
        if (wy2 == null || zb2 == null || element == null) {
            return;
        }
        String string = element.getAttribute(oQd);
        if (string == null || string.isEmpty()) {
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 0) {
            return;
        }
        String string2 = element.getAttribute(oSP);
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        zc zc2 = zc.parse(string2);
        if (zc2 == zc.bca) {
            return;
        }
        String string3 = element.getAttribute(oSQ);
        if (string3 == null || string3.isEmpty()) {
            return;
        }
        int n2 = -1;
        try {
            n2 = Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n2 < 0) {
            return;
        }
        yy yy2 = yz.a(wy2, zb2, zc2, n, n2);
        if (yy2 == null) {
            return;
        }
        if (!yy2.i(element)) {
            return;
        }
        zb2.b(yy2);
    }

    private static void a(wy wy2, acr acr2, Element element) {
        if (wy2 == null || acr2 == null || element == null) {
            return;
        }
        String string = element.getAttribute(oQd);
        if (string == null || string.isEmpty()) {
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 0) {
            return;
        }
        String string2 = element.getAttribute(oSP);
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        acs acs2 = acs.parse(string2);
        if (acs2 == acs.bee) {
            return;
        }
        String string3 = element.getAttribute(oSQ);
        if (string3 == null || string3.isEmpty()) {
            return;
        }
        int n2 = -1;
        try {
            n2 = Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n2 < 0) {
            return;
        }
        acp acp2 = null;
        acp2 = acq.a(wy2, acr2, acs2, n, n2);
        if (acp2 == null) {
            return;
        }
        NodeList nodeList = element.getElementsByTagName(oSJ);
        acp2.az(nodeList != null && nodeList.getLength() > 0);
        if (!acp2.i(element)) {
            return;
        }
        acr2.b(acp2);
    }

    private static void a(wy wy2, xl xl2, Element element) {
        if (wy2 == null || xl2 == null || element == null) {
            return;
        }
        String string = element.getAttribute(oQd);
        if (string == null || string.isEmpty()) {
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 0) {
            return;
        }
        String string2 = element.getAttribute(oSP);
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        xm xm2 = xm.parse(string2);
        if (xm2 == xm.bbl) {
            return;
        }
        xj xj2 = xk.a(wy2, xl2, xm2, n);
        if (xj2 == null) {
            return;
        }
        if (!xj2.i(element)) {
            return;
        }
        xl2.b(xj2);
    }

    private static void b(wy wy2, Element element) {
        if (wy2 == null || element == null) {
            return;
        }
        String string = element.getAttribute(oQd);
        if (string == null || string.isEmpty()) {
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 0) {
            return;
        }
        String string2 = element.getAttribute(oSR);
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        int n2 = -1;
        try {
            n2 = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (wy2.dE(n2) == null) {
            return;
        }
        String string3 = element.getAttribute(oSS);
        if (string3 == null || string3.isEmpty()) {
            return;
        }
        int n3 = -1;
        try {
            n3 = Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (wy2.dE(n3) == null) {
            return;
        }
        String string4 = element.getAttribute(oSQ);
        if (string4 == null || string4.isEmpty()) {
            return;
        }
        int n4 = -1;
        try {
            n4 = Integer.parseInt(string4);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n4 < 0) {
            return;
        }
        aaw aaw2 = new aaw(wy2, n, n2, n3, n4);
        wy2.a(aaw2);
    }

    private static void c(wy wy2, Element element) {
        if (wy2 == null || element == null) {
            return;
        }
        String string = element.getAttribute(oTB);
        if (string == null || string.isEmpty()) {
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 0) {
            return;
        }
        ach ach2 = null;
        String string2 = element.getAttribute(oTz);
        String string3 = element.getAttribute(oTA);
        ach2 = new ach(n, string2, string3, wy2);
        wy2.a(ach2);
    }
}

