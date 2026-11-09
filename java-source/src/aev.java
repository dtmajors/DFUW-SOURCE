/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class aev {
    private static final String TC = "SFSpecialEventConfig";
    private static final jzy beG = new jzy();
    private static final lju avd = new lju(1, 0);
    private static final String beH = "Events";
    private static final String beI = "Group";
    private static final String beJ = "Select";
    private static final String beK = "NumberOfSimultaneouslyRunningEvents";
    private static final String beL = "Event";
    private static final String beM = "Info";
    private static final String beN = "ID";
    private static final String beO = "Name";
    private static final String beP = "DisplayName";
    private static final String beQ = "Description";
    private static final String beR = "IconName";
    private static final String avf = "Enabled";
    private static final String beS = "Persistent";
    private static final String beT = "Conditions";
    private static final String beU = "Start";
    private static final String beV = "Restart";
    private static final String beW = "Repeat";
    private static final String beX = "MinMinutesBeforeRestart";
    private static final String beY = "MaxMinutesBeforeRestart";
    private static final String beZ = "Index";
    private static final String bfa = "Step";
    private static final String bfb = "Type";
    private static final String bfc = "Monsters";
    private static final String bfd = "Monster";
    private static final String bfe = "Value";
    private static final String bff = "Limit";
    private static final String bfg = "Loot";
    private static final String bfh = "SFItem";
    private static final String bfi = "BossPreset";
    private static final String bfj = "MarkerIcon";
    private static final String bfk = "Boosts";
    private static final String bfl = "HealthBoost";
    private static final String bfm = "AttributesBoost";
    private static final String bfn = "ProtectionsBoost";
    private static final String bfo = "Rewards";
    private static final String bfp = "Reward";
    private static final String bfq = "Message";
    private static final String bfr = "Resource";
    private static final String bfs = "KeyResourceName";
    private static final String bft = "Keys";
    private static final String bfu = "Quantity";
    private static final String bfv = "Spawnpoints";
    private static final String bfw = "Spawnpoint";
    private static final String avv = "version_major";
    private static final String avw = "version_minor";
    private static final String avx = "debug_value";
    private static final String avy = "live_value";
    private static final boolean bfx = true;
    private static boolean avz = false;
    private static Map<String, aey> bfy = lcn.emw();
    private static Map<String, aex> bfz = lcn.emw();

    public static Map<String, aey> zh() {
        return bfy;
    }

    public static Map<String, aex> zi() {
        return bfz;
    }

    public static boolean isEnabled() {
        return avz;
    }

    public static void nJ() {
        String string = "xml-files/gamelogicinfo/special_events/special_events.xml";
        Document document = null;
        try {
            document = jsy.tJ("xml-files/gamelogicinfo/special_events/special_events.xml");
        }
        catch (bo bo2) {
            lfn.b(5, TC, "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw new bo("special_events.xml", bo2);
        }
        Element element = document.getDocumentElement();
        if (!element.getNodeName().equals(beH)) {
            lfn.b(5, TC, "parseConfig() : Unexpected root node encountered! Expected 'Events', Found '" + element.getLocalName() + "'!");
            assert (false);
            return;
        }
        lju lju2 = new lju(aev.d(avv, element), aev.d(avw, element));
        if (!lju2.b(avd)) {
            lfn.b(5, TC, "parseConfig() : Version number mismatch! Parser " + avd.toString() + ", Document " + lju2.toString());
            assert (false);
            throw new bo("special_events.xml");
        }
        List<Node> list = jsy.c(beI, element);
        if (list == null || list.isEmpty()) {
            avz = false;
            return;
        }
        for (Node node : list) {
            aey aey2 = aev.a(node);
            assert (!bfy.containsKey(aey2.getName()));
            bfy.put(aey2.getName(), aey2);
        }
        avz = !bfz.isEmpty();
    }

    private static aey a(Node node) {
        String string = jsy.i(node, beO);
        if (string == null || string.isEmpty()) {
            lfn.b(5, TC, "parseConfig() : Invalid group name 'Name', Found '" + string + "'!");
            assert (false);
            return null;
        }
        int n = Integer.parseInt(jsy.i(node, beK));
        Node node2 = jsy.d(beT, node);
        Node node3 = jsy.d(beJ, node2);
        afk afk2 = afk.getValueByName(jsy.i(node3, bfe));
        if (afk2 == null) {
            lfn.b(5, TC, "parseConfig() : Invalid select condition 'Select', Found in group '" + string + "'!");
            assert (false);
            return null;
        }
        Node node4 = jsy.d(beU, node2);
        afl afl2 = afl.getValueByName(jsy.i(node4, bfe));
        if (afl2 == null) {
            lfn.b(5, TC, "parseConfig() : No valid start condition node found for event : " + string);
            assert (false);
            return null;
        }
        Node node5 = jsy.d(beV, node2);
        afg afg2 = afg.getValueByName(jsy.i(node5, bfe));
        if (afg2 == null) {
            lfn.b(5, TC, "parseConfig() : No valid re start condition node found for event : " + string);
            assert (false);
            return null;
        }
        int n2 = 0;
        int n3 = 0;
        switch (afg2) {
            case bgx: {
                n2 = Integer.parseInt(jsy.i(node5, beX));
                n3 = Integer.parseInt(jsy.i(node5, beY));
            }
        }
        afj afj2 = new afj(afg2, n2, n3);
        Node node6 = jsy.d(beW, node2);
        afi afi2 = afi.getValueByName(jsy.i(node6, bfe));
        if (afi2 == null) {
            lfn.b(5, TC, "parseConfig() : No valid repeat condition node found for event : " + string);
            assert (false);
            return null;
        }
        int n4 = 0;
        switch (afi2) {
            case bgC: {
                n4 = Integer.parseInt(jsy.i(node6, bff));
            }
        }
        afh afh2 = new afh(afi2, n4);
        List<Node> list = jsy.c(beL, node);
        if (list == null || list.isEmpty()) {
            avz = false;
            return null;
        }
        ArrayList<aex> arrayList = lcn.abH(list.size());
        for (Node node7 : list) {
            aex aex2 = aev.a(node7, string);
            if (aex2 == null) continue;
            bfz.put(aex2.getName(), aex2);
            arrayList.add(aex2);
        }
        return new aey(string, afl2, afj2, afh2, afk2, n, arrayList);
    }

    private static aex a(Node node, String string) {
        String string2 = jsy.i(node, beO);
        lox lox2 = lpd.rHs.BE("SpecialEvents." + string2 + "_Name");
        lox lox3 = lpd.rHs.BE("SpecialEvents." + string2 + "_Description");
        String string3 = jsy.i(node, beR);
        boolean bl = Boolean.parseBoolean(jsy.i(node, beS));
        boolean bl2 = Boolean.parseBoolean(jsy.i(node, avf));
        return aev.a("xml-files/gamelogicinfo/special_events/events/" + string2 + ".xml", string2, lox2, lox3, string, bl2, string3, bl);
    }

    private static aex a(String string, String string2, lox lox2, lox lox3, String string3, boolean bl, String string4, boolean bl2) {
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, TC, "parseSpecialEventFile() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw new bo(string, bo2);
        }
        Element element = document.getDocumentElement();
        if (!element.getNodeName().equals(beL)) {
            lfn.b(5, TC, "parseSpecialEventFile() : Unexpected root node encountered! Expected 'Events', Found '" + element.getLocalName() + "'!");
            assert (false);
            return null;
        }
        lju lju2 = new lju(aev.d(avv, element), aev.d(avw, element));
        if (!lju2.b(avd)) {
            lfn.b(5, TC, "parseSpecialEventFile() : Version number mismatch! Parser " + avd.toString() + ", Document " + lju2.toString());
            assert (false);
            throw new bo(string);
        }
        List<Node> list = jsy.c(bfa, element);
        if (list == null || list.isEmpty()) {
            throw new bn("No step nodes found for event : " + string2);
        }
        ArrayList<aez> arrayList = lcn.abH(list.size());
        for (Node node : list) {
            aez aez2 = aev.b(node, string2);
            arrayList.add(aez2);
        }
        return new aex(string3, string2, lox2, lox3, string4, bl2, arrayList, bl);
    }

    private static aez b(Node node, String string) {
        int n = Integer.parseInt(jsy.i(node, beZ));
        lox lox2 = lpd.rHs.BE("SpecialEvents." + string + "_Step_" + n);
        afm afm2 = afm.getValueByName(jsy.i(node, bfb));
        if (afm2 == null) {
            throw new bn("No step type attribute found for event : " + string + " step index : " + n);
        }
        switch (afm2) {
            case bgP: {
                return aev.a(node, string, n, lox2);
            }
            case bgQ: {
                return aev.b(node, string, n, lox2);
            }
        }
        throw new bj("step type attribute : " + (Object)((Object)afm2) + " found for event : " + string + " step index : " + n + " is invalid.");
    }

    private static afb a(Node node, String string, int n, lox lox2) {
        Object object;
        Node node2 = jsy.d(bfc, node);
        List<Node> list = jsy.c(bfd, node2);
        if (list == null || list.isEmpty()) {
            throw new bn("No monster nodes found for event : " + string + " step : " + n);
        }
        ArrayList<Integer> arrayList = lcn.abH(list.size());
        for (Node object22 : list) {
            String n3 = jsy.i(object22, bfe);
            int ctoArray = lea.enW().getType(n3);
            if (ctoArray == -1) {
                throw new bn("Invalid monster name : " + n3 + " found for event : " + string + " step : " + n);
            }
            arrayList.add(ctoArray);
        }
        Node node3 = jsy.d(bff, node);
        String string2 = avy;
        int n2 = Integer.parseInt(jsy.i(node3, avy));
        if (n2 <= 0) {
            throw new bn("Invalid Limit : " + n2 + " found for event : " + string + " step : " + n);
        }
        cto[] ctoArray = null;
        Node node4 = jsy.a(bfg, node);
        if (node4 != null && (object = jsy.c(bfh, node4)) != null && !object.isEmpty()) {
            ctoArray = new cto[object.size()];
            int n3 = 0;
            Iterator<Node> iterator = object.iterator();
            while (iterator.hasNext()) {
                cto cto2;
                Node node5 = iterator.next();
                ctoArray[n3] = cto2 = beG.f(node5, false);
                ++n3;
            }
        }
        object = lpd.rHs.BE("SpecialEvents." + string + "_Step_" + n + "_Progress");
        return new afb(arrayList, ctoArray, n, lox2, n2, aev.a(node, string, n), (lox)object);
    }

    private static afa b(Node node, String string, int n, lox lox2) {
        Node node2 = jsy.d(bfi, node);
        String string2 = jsy.i(node2, bfe);
        dlt dlt2 = lea.epJ().get(string2);
        if (dlt2 == null) {
            throw new bj("Preset name : " + string2 + " found for event : " + string + " step index : " + n + " is invalid.");
        }
        Node node3 = jsy.a(bfk, node2);
        Node node4 = node3 != null ? jsy.d(bfl, node3) : null;
        float f = node4 != null ? Float.parseFloat(jsy.i(node4, bfe)) : 1.0f;
        Node node5 = node3 != null ? jsy.d(bfn, node3) : null;
        float f2 = node5 != null ? Float.parseFloat(jsy.i(node5, bfe)) : 1.0f;
        Node node6 = node3 != null ? jsy.d(bfm, node3) : null;
        float f3 = node6 != null ? Float.parseFloat(jsy.i(node6, bfe)) : 1.0f;
        Node node7 = jsy.d(bfv, node);
        List<Node> list = jsy.c(bfw, node7);
        ArrayList<String> arrayList = lcn.abH(list.size());
        for (Node object2 : list) {
            String n2 = jsy.i(object2, bfe);
            arrayList.add(n2);
        }
        Node node8 = jsy.d(bff, node);
        String string3 = avy;
        int n2 = Integer.parseInt(jsy.i(node8, avy));
        if (n2 <= 0) {
            throw new bn("Invalid Limit : " + n2 + " found for event : " + string + " step : " + n);
        }
        Node node9 = jsy.d(bfj, node2);
        String string4 = jsy.i(node9, bfe);
        lox lox3 = lpd.rHs.BE("SpecialEvents." + string + "_SpawingMessage_Step_" + n);
        lox lox4 = lpd.rHs.BE("SpecialEvents." + string + "_WarningMessage_Step_" + n);
        lox lox5 = lpd.rHs.BE("SpecialEvents." + string + "_DiedMessage_Step_" + n);
        lox lox6 = lpd.rHs.BE("SpecialEvents." + string + "_Step_" + n + "_Progress");
        return new afa(n, lox2, string2, f, f2, f3, arrayList, n2, aev.a(node, string, n), lox3, lox4, lox5, lox6, string4);
    }

    private static afq a(Node node, String string, int n) {
        Node node2 = jsy.a(bfo, node);
        if (node2 == null) {
            return null;
        }
        List<Node> list = jsy.c(bfp, node2);
        if (list == null || list.isEmpty()) {
            return null;
        }
        afp afp2 = afp.getValueByName(jsy.i(node2, bfb));
        if (afp2 == null) {
            assert (false);
            return null;
        }
        ArrayList<afn> arrayList = lcn.abH(list.size());
        for (Node node3 : list) {
            afn afn2 = aev.b(node3, string, n);
            arrayList.add(afn2);
        }
        return new afq(afp2, arrayList);
    }

    private static afn b(Node node, String string, int n) {
        afo afo2 = afo.getValueByName(jsy.i(node, bfb));
        Node node2 = jsy.a(bfq, node);
        lox lox2 = node2 != null ? lpd.rHs.BE("SpecialEvents." + string + "_Name" + "_RewardMessage_Step_" + n) : null;
        Node node3 = jsy.d(bfr, node);
        if (node3 == null) {
            throw new bn("Node : Resource not found for event : " + string + " in step : " + n);
        }
        String string2 = jsy.i(node3, bfe);
        int n2 = lea.enW().getType(string2);
        if (n2 == -1) {
            throw new bj("Invalid reward name : " + string2 + " found for event : " + string);
        }
        Node node4 = jsy.a(bft, node);
        int n3 = node4 != null ? Integer.parseInt(jsy.i(node4, bfu)) : -1;
        int n4 = node4 != null ? lea.enW().getType(jsy.i(node4, bfs)) : -1;
        String string3 = avy;
        Node node5 = jsy.d(bfu, node);
        if (node5 == null) {
            throw new bn("Node : " + node5 + " not found for event : " + string + " in step : " + n + " for rewards");
        }
        int n5 = Integer.parseInt(jsy.i(node5, avy));
        return new afn(afo2, n2, n5, n4, n3, lox2);
    }

    private static int d(String string, Element element) {
        if (string == null || element == null) {
            return 0;
        }
        if (!element.hasAttribute(string)) {
            lfn.b(5, TC, "parseIntegerAttribute() : Required XML Node Attribute Not Found! Attribute Name = '" + string + "', Element Tag = '" + element.getLocalName() + "!");
            assert (false);
            throw new bo("special_events.xml");
        }
        try {
            return Integer.parseInt(element.getAttribute(string));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, TC, "parseIntegerAttribute() : Attribute Value Parsing Failed! Attribute Name = " + string + ", Expected Type = Integer!");
            assert (false);
            throw new bo("special_events.xml");
        }
    }
}

