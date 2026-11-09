/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jtt {
    private static final String oQQ = "clan_points_config";
    private static final String oQR = "config";
    private static final String oQS = "initial_clan_points";
    private static final String oQT = "player_points_to_clan_points_exchange_rate";
    private static final String oQU = "challenge_costs";
    private static final String oQV = "challenge_cost";
    private static final String oQW = "challenge_rewards";
    private static final String oQX = "attacker_reward";
    private static final String oQY = "defender_reward";
    private static final String oQZ = "protection_costs";
    private static final String oRa = "protection_cost";
    private static final String oRb = "cost_multiplier";
    private static final String oRc = "static_costs";
    private static final String oRd = "cost";
    private static final String oRe = "asset_damage_multiplier";
    private static final String ijc = "value";
    private static final String oRf = "city_type";
    private static final String oRg = "index";
    private static final String oRh = "cost";
    private static final String oRi = "action";
    private static final String oRj = "total";
    private static final String oRk = "winner_amount";
    private static final String oRl = "defender_amount";
    private static final String oRm = "cost_per_hour";
    private static final String oRn = "per_protected_holding";
    private static final String oRo = "limit_to_type";
    private static final String oRp = "per_holding_power_level";
    private int cEq = 0;
    private float cEr = 1.0f;
    private int oRq = 250;
    private int oRr = 125;
    private int oRs = 0;
    private int oRt = 0;
    private Map<ayb, Integer> cEu = lcn.emw();
    private float oRu = 1.0f;
    private boolean oRv = false;
    private float oRw = 1.0f;
    private Map<ayb, int[]> cEs = lcn.emw();
    private Map<String, Integer> oRx = lcn.emw();

    public int dTb() {
        return this.cEq;
    }

    public int dTc() {
        return this.oRq;
    }

    public int dTd() {
        return this.oRr;
    }

    public int dTe() {
        return this.oRs;
    }

    public int dTf() {
        return this.oRt;
    }

    public float adb() {
        return this.cEr;
    }

    public Map<ayb, int[]> ade() {
        return this.cEs;
    }

    public Map<String, Integer> dTg() {
        return this.oRx;
    }

    public Map<ayb, Integer> adf() {
        return this.cEu;
    }

    public float adg() {
        return this.oRu;
    }

    public boolean adh() {
        return this.oRv;
    }

    public float dTh() {
        return this.oRw;
    }

    /*
     * WARNING - void declaration
     */
    public void dTi() {
        void var9_25;
        Object object;
        Object object2;
        Node node;
        Object nodeList7;
        Object object3;
        int n;
        Object object6;
        String string = "xml-files/server/gamelogicinfo/clan_points_config.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw bo2;
        }
        NodeList nodeList = document.getElementsByTagName(oQX);
        if (nodeList != null && nodeList.getLength() > 0) {
            try {
                object6 = (Element)nodeList.item(0);
                int n2 = Integer.parseInt(object6.getAttribute(oRj));
                n = Integer.parseInt(object6.getAttribute(oRk));
                this.oRq = n2;
                this.oRr = n;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if ((object6 = document.getElementsByTagName(oQY)) != null && object6.getLength() > 0) {
            try {
                Element element = (Element)object6.item(0);
                n = Integer.parseInt(element.getAttribute(oRj));
                int n3 = Integer.parseInt(element.getAttribute(oRl));
                this.oRs = n;
                this.oRt = n3;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        NodeList nodeList2 = document.getElementsByTagName(oQR);
        for (n = 0; n < nodeList2.getLength(); ++n) {
            Node node2 = nodeList2.item(n);
            if (node2.getNodeType() != 1) continue;
            Element element = (Element)node2;
            NodeList object52 = element.getChildNodes();
            for (int i9 = 0; i9 < object52.getLength(); ++i9) {
                object3 = object52.item(i9);
                if (object3.getNodeType() != 1) continue;
                Element object7 = (Element)object3;
                if (object7.getTagName().compareTo(oQS) == 0) {
                    nodeList7 = object7.getAttribute(ijc);
                    if (nodeList7 == null) {
                        throw new bu(oQS, ijc);
                    }
                    try {
                        this.cEq = Integer.parseInt((String)nodeList7);
                        continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new bq("Failed to Parse initial_clan_points value Attribute!!!... value = " + (String)nodeList7, numberFormatException);
                    }
                }
                if (object7.getTagName().compareTo(oQT) != 0) continue;
                nodeList7 = object7.getAttribute(ijc);
                if (nodeList7 == null) {
                    throw new bu(oQT, ijc);
                }
                try {
                    this.cEr = Float.parseFloat((String)nodeList7);
                    continue;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new bq("Failed to Parse player_points_to_clan_points_exchange_rate value Attribute!!!... value = " + (String)nodeList7, numberFormatException);
                }
            }
        }
        Map map = lcn.emw();
        NodeList nodeList3 = document.getElementsByTagName(oQU);
        for (int i3 = 0; i3 < nodeList3.getLength(); ++i3) {
            Node nodeList6 = nodeList3.item(i3);
            if (nodeList6.getNodeType() != 1) continue;
            Element element = (Element)nodeList6;
            object3 = element.getChildNodes();
            for (int nodeList5 = 0; nodeList5 < object3.getLength(); ++nodeList5) {
                nodeList7 = object3.item(nodeList5);
                if (nodeList7.getNodeType() != 1 || (node = (Element)nodeList7).getTagName().compareTo(oQV) != 0) continue;
                object2 = node.getAttribute(oRf);
                if (object2 == null) {
                    throw new bu(oQV, oRf);
                }
                int n2 = -1;
                try {
                    n2 = Integer.parseInt((String)object2);
                }
                catch (NumberFormatException string6) {
                    throw new bq("Failed to Parse challenge_cost city_type Attribute!!!... city_type = " + (String)object2, string6);
                }
                if (!ayb.isValidOrdinal(n2)) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : city_type Value, " + n2 + ", is Not A Valid SFCityType Ordinal!!!");
                    throw new bo("clan_points_config.xml");
                }
                ayb numberFormatException = ayb.getValueByOrdinal(n2);
                object = node.getAttribute(oRg);
                if (object == null) {
                    throw new bu(oQV, oRg);
                }
                int n3 = -1;
                try {
                    n3 = Integer.parseInt(object);
                }
                catch (NumberFormatException numberFormatException2) {
                    throw new bq("Failed to Parse challenge_cost index Attribute!!!... index = " + object, numberFormatException2);
                }
                if (n3 < 0) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : index Value, " + n3 + ", is Not A Valid Index!!!");
                    throw new bo("clan_points_config.xml");
                }
                String string2 = node.getAttribute("cost");
                if (string2 == null) {
                    throw new bu(oQV, "cost");
                }
                int n4 = -1;
                try {
                    n4 = Integer.parseInt(string2);
                }
                catch (NumberFormatException numberFormatException3) {
                    throw new bq("Failed to Parse challenge_cost cost Attribute!!!... cost = " + string2, numberFormatException3);
                }
                if (n4 < 0) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : cost Value, " + n4 + ", is Not A Valid Cost!!!");
                    throw new bo("clan_points_config.xml");
                }
                Set<lfs<Integer, Integer>> set = (Set<lfs<Integer, Integer>>)map.get((Object)numberFormatException);
                if (set == null) {
                    set = lcn.emx();
                    map.put(numberFormatException, set);
                }
                boolean bl = false;
                for (lfs lfs2 : set) {
                    if ((Integer)lfs2.reX != n3) continue;
                    bl = true;
                }
                if (bl) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : Multiple challenge_cost Tags Contain the Same Index, " + n3 + ", for the City-Type, " + (Object)((Object)numberFormatException) + "!!!");
                    throw new bo("clan_points_config.xml");
                }
                set.add(new lfs<Integer, Integer>(n3, n4));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            int n5 = 0;
            for (lfs element : (Set)entry.getValue()) {
                if ((Integer)element.reX <= n5) continue;
                n5 = (Integer)element.reX;
            }
            object3 = new int[n5 + 1];
            for (int i2 = 0; i2 < ((Object)object3).length; ++i2) {
                object3[i2] = -1;
            }
            for (lfs lfs3 : (Set)entry.getValue()) {
                object3[((Integer)lfs3.reX).intValue()] = (Integer)lfs3.reY;
            }
            if (object3[0] < 0) {
                lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : No Zero-Index Challenge Cost Exists for CityType, " + entry.getKey() + "... All CityTypes Must Have a Zero-Index Cost Defined!!!");
                throw new bo("clan_points_config.xml");
            }
            Object object4 = object3[0];
            for (int i3 = 1; i3 < ((Object)object3).length; ++i3) {
                if (object3[i3] < 0) {
                    object3[i3] = object4;
                    continue;
                }
                object4 = object3[i3];
            }
            this.cEs.put((ayb)((Object)entry.getKey()), (int[])object3);
        }
        NodeList nodeList4 = document.getElementsByTagName(oQZ);
        boolean bl = false;
        while (var9_25 < nodeList4.getLength()) {
            Node node2 = nodeList4.item((int)var9_25);
            if (node2.getNodeType() == 1) {
                object3 = (Element)node2;
                NodeList nodeList5 = object3.getChildNodes();
                for (int i4 = 0; i4 < nodeList5.getLength(); ++i4) {
                    String string3;
                    node = nodeList5.item(i4);
                    if (node.getNodeType() != 1) continue;
                    object2 = (Element)node;
                    if (object2.getTagName().compareTo(oRa) == 0) {
                        string3 = object2.getAttribute(oRf);
                        if (string3 == null) {
                            throw new bu(oRa, oRf);
                        }
                        int n6 = -1;
                        try {
                            n6 = Integer.parseInt(string3);
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new bq("Failed to Parse protection_cost city_type Attribute!!!... city_type = " + string3, numberFormatException);
                        }
                        if (!ayb.isValidOrdinal(n6)) {
                            lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : city_type Value, " + n6 + ", is Not A Valid SFCityType Ordinal!!!");
                            throw new bo("clan_points_config.xml");
                        }
                        object = ayb.getValueByOrdinal(n6);
                        String string4 = object2.getAttribute(oRm);
                        if (string4 == null) {
                            throw new bu(oRa, oRm);
                        }
                        int n7 = -1;
                        try {
                            n7 = Integer.parseInt(string4);
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new bq("Failed to Parse protection_cost cost_per_hour Attribute!!!... cost_per_hour = " + string4, numberFormatException);
                        }
                        if (n7 < 0) {
                            lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : cost Value, " + n7 + ", is Not A Valid Cost!!!");
                            throw new bo("clan_points_config.xml");
                        }
                        this.cEu.put((ayb)((Object)object), n7);
                        continue;
                    }
                    if (object2.getTagName().compareTo(oRb) == 0) {
                        string3 = object2.getAttribute(oRn);
                        if (string3 == null) {
                            throw new bu(oRb, oRn);
                        }
                        try {
                            this.oRu = Float.parseFloat(string3);
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new bq("Failed to Parse cost_multiplier per_protected_holding Attribute!!!... per_protected_holding = " + string3, numberFormatException);
                        }
                        String string5 = object2.getAttribute(oRo);
                        if (string5 == null) {
                            throw new bu(oRb, oRo);
                        }
                        this.oRv = Boolean.parseBoolean(string5);
                        continue;
                    }
                    if (object2.getTagName().compareTo(oRe) != 0) continue;
                    string3 = object2.getAttribute(oRp);
                    if (string3 == null) {
                        throw new bu(oRe, oRp);
                    }
                    try {
                        this.oRw = Float.parseFloat(string3);
                        continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new bq("Failed to Parse asset_damage_multiplier per_holding_power_level Attribute!!!... per_holding_power_level = " + string3, numberFormatException);
                    }
                }
            }
            ++var9_25;
        }
        NodeList nodeList6 = document.getElementsByTagName(oRc);
        for (int i5 = 0; i5 < nodeList3.getLength(); ++i5) {
            object3 = nodeList6.item(i5);
            if (object3.getNodeType() != 1) continue;
            Element element = (Element)object3;
            NodeList nodeList8 = element.getChildNodes();
            for (int i6 = 0; i6 < nodeList8.getLength(); ++i6) {
                Element element2;
                object2 = nodeList8.item(i6);
                if (object2.getNodeType() != 1 || (element2 = (Element)object2).getTagName().compareTo("cost") != 0) continue;
                String string6 = element2.getAttribute(oRi);
                if (string6 == null) {
                    throw new bu("cost", oRi);
                }
                object = element2.getAttribute("cost");
                if (object == null) {
                    throw new bu("cost", "cost");
                }
                int n8 = -1;
                try {
                    n8 = Integer.parseInt(object);
                }
                catch (NumberFormatException numberFormatException) {
                    throw new bq("Failed to Parse cost cost Attribute!!!... cost = " + object, numberFormatException);
                }
                if (string6.isEmpty() || n8 < 0) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : Invalid attributes from static cost!!!... Action = " + string6 + ", Cost = " + n8);
                    throw new bo("clan_points_config.xml");
                }
                if (this.oRx.containsKey(string6)) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseConfigFile() : Duplicate static cost declaration!!!... Action = " + string6);
                    throw new bo("clan_points_config.xml");
                }
                this.oRx.put(string6, n8);
            }
        }
    }
}

