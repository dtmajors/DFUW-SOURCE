/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class dwh {
    private static dwh hiW = null;
    static final String hiX = "leader_board_config";
    static final String hiY = "system_settings";
    static final String hiZ = "term_length";
    static final String hja = "season_length";
    static final String hjb = "calculation";
    static final String hjc = "calculation_values";
    static final String hjd = "basic_values";
    static final String hje = "diminishing_returns";
    static final String hjf = "danger_levels";
    static final String hjg = "rank_differences";
    static final String hjh = "rank_configuration";
    static final String hji = "rank";
    static final String hjj = "season_rewards";
    static final String hjk = "reward";
    static final String hjl = "live";
    static final String hjm = "debug";
    static final String hjn = "method";
    static final String hjo = "starting_points";
    static final String hjp = "base_points";
    static final String hjq = "loss_multiplier";
    static final String hjr = "max_points";
    static final String hjs = "allow_negative_points";
    static final String hjt = "kill_count";
    static final String hju = "multiplier";
    static final String hjv = "danger_level";
    static final String hjw = "difference";
    static final String hjx = "include_rank_difference_for_loss";
    static final String hjy = "rank";
    static final String hjz = "max_players";
    static final String hjA = "season_points";
    static final String hjB = "resource_name";
    static final String hjC = "quantity";
    static final String hjD = "player_min";
    static final String hjE = "player_max";
    private boolean hjF = false;
    private int hjG = 30;
    private int hjH = 7;
    private int hjI = 26;
    private int hjJ = 26;
    private dwg hjK = dwg.hiS;
    private Map<dwg, dwi> hjL = lcn.emw();
    private Map<dwl, Integer> hjM = lcn.emw();
    private Map<dwl, Integer> hjN = lcn.emw();
    private List<dwm> hjO = lcn.emA();
    private int hjP = 0;

    public static dwh bCC() {
        if (hiW == null) {
            hiW = new dwh();
        }
        return hiW;
    }

    public boolean bCD() {
        return this.hjF;
    }

    public int bCE() {
        return this.hjH;
    }

    public int bCF() {
        return this.hjJ;
    }

    public dwg bCG() {
        return this.hjK;
    }

    public dwi bCH() {
        return this.hjL.get((Object)this.hjK);
    }

    public boolean a(dwl dwl2) {
        return this.hjM.containsKey((Object)dwl2);
    }

    public int b(dwl dwl2) {
        return this.hjM.containsKey((Object)dwl2) ? this.hjM.get((Object)dwl2) : -1;
    }

    public int c(dwl dwl2) {
        return this.hjN.containsKey((Object)dwl2) ? this.hjN.get((Object)dwl2) : 0;
    }

    private dwh() {
        this.hjM.put(dwl.hkl, 1);
        this.hjM.put(dwl.hkk, 2);
        this.hjM.put(dwl.hkj, 3);
        this.hjM.put(dwl.hki, 4);
        this.hjM.put(dwl.hkh, 10);
        this.hjM.put(dwl.hkg, 16);
        this.hjM.put(dwl.hkf, 24);
        this.hjM.put(dwl.hke, 30);
        this.hjM.put(dwl.hkd, 50);
        this.hjM.put(dwl.hkc, 60);
        this.hjN.put(dwl.hkl, 1);
        this.hjN.put(dwl.hkk, 2);
        this.hjN.put(dwl.hkj, 3);
        this.hjN.put(dwl.hki, 4);
        this.hjN.put(dwl.hkh, 10);
        this.hjN.put(dwl.hkg, 16);
        this.hjN.put(dwl.hkf, 24);
        this.hjN.put(dwl.hke, 30);
        this.hjN.put(dwl.hkd, 50);
        this.hjN.put(dwl.hkc, 60);
        this.hjO.add(new dwm("r_DUEL Item", 1, 1, 1));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 1));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 2));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 3));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 4));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 5));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 6));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 7));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 8));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 9));
        this.hjO.add(new dwm("r_Selentine Coin", 10, 1, 10));
        this.hjP = 10;
    }

    public boolean g(dwp dwp2) {
        Calendar calendar = dwh.a(Calendar.getInstance());
        Calendar calendar2 = dwh.a(Calendar.getInstance(), dwp2.bDs());
        int n2 = (int)dwh.a(calendar2, calendar);
        return (int)dwh.a(calendar2, calendar) >= this.bCE();
    }

    public int h(dwp dwp2) {
        Calendar calendar = dwh.a(Calendar.getInstance());
        Calendar calendar2 = dwh.a(Calendar.getInstance(), dwp2.bDs());
        return this.bCE() - (int)dwh.a(calendar2, calendar);
    }

    public boolean i(dwp dwp2) {
        return dwp2.bDr() - dwp2.bDu() >= this.bCF();
    }

    public int j(dwp dwp2) {
        return this.bCE() * (dwp2.bDr() - dwp2.bDu() - 1) + this.h(dwp2);
    }

    private static Calendar a(Calendar calendar, Timestamp timestamp) {
        calendar.setTimeInMillis(timestamp.getTime());
        return dwh.a(calendar);
    }

    private static Calendar a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    private static long a(Calendar calendar, Calendar calendar2) {
        int n2 = 86400000;
        long l2 = calendar2.getTimeInMillis();
        int n3 = (int)((l2 - calendar.getTimeInMillis()) / (long)n2);
        Calendar calendar3 = (Calendar)calendar.clone();
        calendar3.add(6, n3);
        long l3 = calendar3.getTimeInMillis();
        if (l3 == l2) {
            return n3;
        }
        int n4 = l3 < l2 ? 1 : -1;
        do {
            calendar3.add(5, n4);
            n3 += n4;
        } while (calendar3.getTimeInMillis() != l2);
        return n3;
    }

    public int bCI() {
        return this.hjP - 1;
    }

    public List<lfs<String, Integer>> CD(int n2) {
        LinkedList<lfs<String, Integer>> linkedList = lcn.emA();
        int n3 = n2 + 1;
        if (n3 <= this.hjP) {
            Map<String, Integer> map = lcn.emw();
            for (dwm object : this.hjO) {
                if (n3 < object.bCT() || n3 > object.bCU()) continue;
                map.put(object.pa().toLowerCase(), object.vf() + (map.containsKey(object.pa().toLowerCase()) ? (Integer)map.get(object.pa().toLowerCase()) : 0));
            }
            for (Map.Entry entry : map.entrySet()) {
                linkedList.add(new lfs(entry.getKey(), entry.getValue()));
            }
        }
        return linkedList;
    }

    public void bCJ() {
        Object object;
        String string = "xml-files/server/gamelogicinfo/leader_board_config.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            throw bo2;
        }
        NodeList nodeList = document.getElementsByTagName(hiY);
        if (nodeList == null || nodeList.getLength() != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : Invalid System Settings Nodes Count!!!... Expected 1, Found " + (nodeList == null ? "0" : Integer.valueOf(nodeList.getLength())));
            assert (false);
            throw new bg("Invalid System Settings Node Counts!!!");
        }
        this.k((Element)nodeList.item(0));
        NodeList nodeList2 = document.getElementsByTagName(hjc);
        if (nodeList2 == null || nodeList2.getLength() == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : No Calculation Values Nodes Found!!!");
            assert (false);
            throw new bg("No Calculation Values Nodes Found!!!");
        }
        for (int i2 = 0; i2 < nodeList2.getLength(); ++i2) {
            object = nodeList2.item(i2);
            if (object.getNodeType() != 1) continue;
            Element element = (Element)object;
            String string2 = element.getAttribute(hjn);
            if (string2 == null || string2.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : Calculation Values Node Without Method Attribute Found!!!");
                assert (false);
                throw new bg("Calculation Values Node Without Method Attribute Found!!!");
            }
            dwg dwg2 = dwg.parse(string2);
            if (dwg2 == dwg.hiS) {
                lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : Unrecognised Calculation Method Found!!!... Value = " + string2);
                assert (false);
                throw new bg("Unrecognised Calculation Method Found!!!... Value = " + string2);
            }
            if (this.hjL.containsKey((Object)dwg2)) {
                lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : Duplicate Calculation Method Found!!!... Value = " + (Object)((Object)dwg2));
                assert (false);
                throw new bg("Duplicate Calculation Method Found!!!... Value = " + (Object)((Object)dwg2));
            }
            dwi dwi2 = dwi.a(dwg2);
            if (dwi2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : Failed to Create Calculator for Calculation Method!!!... Method = " + (Object)((Object)dwg2));
                assert (false);
                throw new bg("Failed to Create Calculator for Calculation Method!!!... Method = " + (Object)((Object)dwg2));
            }
            dwi2.n(element);
            this.hjL.put(dwg2, dwi2);
        }
        NodeList nodeList3 = document.getElementsByTagName(hjh);
        if (nodeList3 == null || nodeList3.getLength() != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : Invalid Rank Configuration Nodes Count!!!... Expected 1, Found " + (nodeList3 == null ? "0" : Integer.valueOf(nodeList3.getLength())));
            assert (false);
            throw new bg("Invalid Rank Configuration Node Counts!!!");
        }
        this.l((Element)nodeList3.item(0));
        object = document.getElementsByTagName(hjj);
        if (object == null || object.getLength() != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "loadConfig() : Invalid Season Rewards Nodes Count!!!... Expected 1, Found " + (object == null ? "0" : Integer.valueOf(object.getLength())));
            assert (false);
            throw new bg("Invalid Season Rewards Node Counts!!!");
        }
        this.m((Element)object.item(0));
    }

    private void k(Element element) {
        if (element == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSystemSettings() : Root Element is Null!");
            assert (false);
            throw new bg("Root Element is Null!");
        }
        if (!element.getNodeName().equals(hiY)) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSystemSettings() : Invalid Root Element!!!... Expected: system_settings, Found: " + element.getNodeName());
            assert (false);
            throw new bg("Invalid Root Element!!!... Expected: system_settings, Found: " + element.getNodeName());
        }
        NodeList nodeList = element.getElementsByTagName(hiZ);
        if (nodeList == null || nodeList.getLength() != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSystemSettings() : Invalid Term Length Nodes Count!!!... Expected 1, Found " + (nodeList == null ? "0" : Integer.valueOf(nodeList.getLength())));
            assert (false);
            throw new bg("Invalid Term Length Node Counts!!!");
        }
        Element element2 = (Element)nodeList.item(0);
        String string = element2.getAttribute(hjl);
        String string2 = element2.getAttribute(hjm);
        try {
            this.hjH = Integer.parseInt(string);
            this.hjG = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Failed to Parse Term Length Values", numberFormatException);
        }
        NodeList nodeList2 = element.getElementsByTagName(hja);
        if (nodeList2 == null || nodeList2.getLength() != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSystemSettings() : Invalid Season Length Nodes Count!!!... Expected 1, Found " + (nodeList2 == null ? "0" : Integer.valueOf(nodeList2.getLength())));
            assert (false);
            throw new bg("Invalid Season Length Node Counts!!!");
        }
        Element element3 = (Element)nodeList2.item(0);
        String string3 = element3.getAttribute(hjl);
        String string4 = element3.getAttribute(hjm);
        try {
            this.hjJ = Integer.parseInt(string3);
            this.hjI = Integer.parseInt(string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Failed to Parse Season Length Values", numberFormatException);
        }
        NodeList nodeList3 = element.getElementsByTagName(hjb);
        if (nodeList3 == null || nodeList3.getLength() != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSystemSettings() : Invalid Calculation Method Nodes Count!!!... Expected 1, Found " + (nodeList3 == null ? "0" : Integer.valueOf(nodeList3.getLength())));
            assert (false);
            throw new bg("Invalid Calculation Method Node Counts!!!");
        }
        Element element4 = (Element)nodeList3.item(0);
        this.hjK = dwg.parse(element4.getAttribute(hjn));
        if (this.hjK == dwg.hiS) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSystemSettings() : Invalid Calculation Method!!!");
            assert (false);
            throw new bg("Invalid Calculation Method!!!");
        }
    }

    private void l(Element element) {
        int n2;
        if (element == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Root Element is Null!");
            assert (false);
            throw new bg("Root Element is Null!");
        }
        if (!element.getNodeName().equals(hjh)) {
            lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Invalid Root Element!!!... Expected: rank_configuration, Found: " + element.getNodeName());
            assert (false);
            throw new bg("Invalid Root Element!!!... Expected: rank_configuration, Found: " + element.getNodeName());
        }
        NodeList nodeList = element.getElementsByTagName("rank");
        if (nodeList == null || nodeList.getLength() == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : No Rank Config Nodes Found!!!");
            assert (false);
            throw new bg("No Rank Config Nodes Found!!!");
        }
        this.hjM.clear();
        this.hjN.clear();
        for (n2 = 0; n2 < nodeList.getLength(); ++n2) {
            Node node = nodeList.item(n2);
            if (node.getNodeType() != 1) continue;
            Element element2 = (Element)node;
            String string = element2.getAttribute("rank");
            String string2 = element2.getAttribute(hjz);
            String object = element2.getAttribute(hjA);
            try {
                int n3 = Integer.parseInt(string);
                int n4 = Integer.parseInt(string2);
                int n5 = Integer.parseInt(object);
                if (n3 <= 0 || n3 >= dwl.values().length) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Invalid Rank Ordinal!!!... Value = " + n3);
                    assert (false);
                    throw new bg("Invalid Rank Ordinal!!!... Value = " + n3);
                }
                dwl dwl2 = dwl.getValueByOrdinal(n3);
                if (n4 <= 0) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Invalid Max Players!!!... Rank = " + (Object)((Object)dwl2) + ", Value = " + n4);
                    assert (false);
                    throw new bg("Invalid Max Players!!!... Rank = " + (Object)((Object)dwl2) + ", Value = " + n4);
                }
                if (n5 <= 0) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Invalid Season Points!!!... Rank = " + (Object)((Object)dwl2) + ", Value = " + n5);
                    assert (false);
                    throw new bg("Invalid Season Points!!!... Rank = " + (Object)((Object)dwl2) + ", Value = " + n5);
                }
                if (this.hjM.containsKey((Object)dwl2)) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Duplicate Rank Encountered!!!... Rank = " + (Object)((Object)dwl2));
                    assert (false);
                    throw new bg("Duplicate Rank Encountered!!!... Value = " + (Object)((Object)dwl2));
                }
                this.hjM.put(dwl2, n4);
                this.hjN.put(dwl2, n5);
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Failed to Parse Rank Configuration Numeric Values!!!");
                assert (false);
                throw new bg("Failed to Parse Rank Limit Numeric Values!!!", numberFormatException);
            }
        }
        n2 = 0;
        int n6 = 0;
        for (dwl dwl3 : dwl.values()) {
            if (dwl3 == dwl.hkb) continue;
            if (!this.hjM.containsKey((Object)dwl3)) {
                lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : No Player Limit Defined for Rank!!!... Rank = " + dwl3);
                assert (false);
                throw new bg("No Player Limit Defined for Rank!!!... Rank = " + dwl3);
            }
            if (n2 > 0 && this.hjM.get((Object)dwl3) > n2) {
                lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Max Players Increasing With Rank!!!... Rank = " + dwl3);
                assert (false);
                throw new bg("Max Players Increasing With Rank!!!... Rank = " + dwl3);
            }
            if (!this.hjN.containsKey((Object)dwl3)) {
                lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : No Season Points Defined for Rank!!!... Rank = " + dwl3);
                assert (false);
                throw new bg("No Season Points Defined for Rank!!!... Rank = " + dwl3);
            }
            if (n6 <= 0 || this.hjN.get((Object)dwl3) >= n6) continue;
            lfn.b(5, this.getClass().getSimpleName(), "parseRankConfig() : Season Points Decreasing With Rank!!!... Rank = " + dwl3);
            assert (false);
            throw new bg("Season Points Decreasing With Rank!!!... Rank = " + dwl3);
        }
    }

    private void m(Element element) {
        if (element == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSeasonRewards() : Root Element is Null!");
            assert (false);
            throw new bg("Root Element is Null!");
        }
        if (!element.getNodeName().equals(hjj)) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSeasonRewards() : Invalid Root Element!!!... Expected: season_rewards, Found: " + element.getNodeName());
            assert (false);
            throw new bg("Invalid Root Element!!!... Expected: season_rewards, Found: " + element.getNodeName());
        }
        NodeList nodeList = element.getElementsByTagName(hjk);
        if (nodeList == null || nodeList.getLength() == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSeasonRewards() : No Reward Nodes Found!!!");
            assert (false);
            throw new bg("No Reward Nodes Found!!!");
        }
        this.hjO.clear();
        this.hjP = 0;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element2 = (Element)node;
            String string = element2.getAttribute(hjB);
            String string2 = element2.getAttribute(hjC);
            String string3 = element2.getAttribute(hjD);
            String string4 = element2.getAttribute(hjE);
            try {
                int n2 = Integer.parseInt(string2);
                int n3 = Integer.parseInt(string3);
                int n4 = Integer.parseInt(string4);
                if (n2 <= 0) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseSeasonRewards() : Invalid Quantity!!!... Reward Resource = " + string + ", Value = " + n2);
                    assert (false);
                    throw new bg("Invalid Quantity!!!... Reward Resource = " + string + ", Value = " + n2);
                }
                if (n3 <= 0 || n4 <= 0 || n4 < n3) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseSeasonRewards() : Invalid Min/Max Players!!!... Reward Resource = " + string + ", Min = " + n3 + ", Max = " + n4);
                    assert (false);
                    throw new bg("Invalid Min/Max Players!!!... Reward Resource = " + string + ", Value = " + n2);
                }
                this.hjO.add(new dwm(string, n2, n3, n4));
                if (n4 <= this.hjP) continue;
                this.hjP = n4;
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, this.getClass().getSimpleName(), "parseSeasonRewards() : Failed to Parse Season Rewards Numeric Values!!!... Reward Resource = " + string);
                assert (false);
                throw new bg("Failed to Parse Season Rewards Numeric Values!!!... Reward Resource = " + string, numberFormatException);
            }
        }
    }
}

