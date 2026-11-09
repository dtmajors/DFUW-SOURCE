/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jul {
    public static final String TC = "SFPerksParser";
    public static final String dyC = ":";

    public void ag(String string, String string2) {
        cid cid2 = lea.epN();
        Document document = jsy.tJ(string);
        if (document == null) {
            lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
            assert (false);
            return;
        }
        Node node = jsy.a("Perks", (Node)document);
        if (node == null) {
            throw new bn("Perks");
        }
        cid.eAW = Boolean.parseBoolean(jsy.i(node, "Enabled"));
        this.a(node, cid2);
        this.b(node, cid2);
        Map<String, List<cib>> map = lea.epN().aOR();
        Map<Integer, String> map2 = lea.epN().aOS();
        document = jsy.tJ(string2);
        if (document == null) {
            lfn.b(5, TC, "parseFile() Invalid Document: [" + string2 + "]");
            assert (false);
            return;
        }
        node = jsy.a("Cities", (Node)document);
        if (node == null) {
            throw new bn("Cities");
        }
        List<Node> list = jsy.c("City", node);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Node node2 : list) {
            String string3 = jsy.i(node2, "Name");
            List<Node> list2 = jsy.c("Perk", node2);
            if (list2 == null) {
                throw new bn("Perks");
            }
            for (Node node3 : list2) {
                String string4 = jsy.i(node3, "Type");
                cib cib2 = cib.getValueByName(string4);
                if (cib2 == null) {
                    assert (false) : "Invalid perk type name : " + string4 + " for city : " + string3;
                    continue;
                }
                cia cia2 = cid2.a(cib2);
                if (cia2 == null) {
                    assert (false) : "Perk : " + (Object)((Object)cib2) + " for city : " + string3 + " is not valid.";
                    continue;
                }
                if (!cia2.aON()) {
                    assert (false) : "Perk : " + string4 + " for city : " + string3 + " is not a clan perk.";
                    continue;
                }
                List<cib> list3 = map.get(string3);
                if (list3 == null) {
                    list3 = lcn.abH(list2.size());
                    assert (!map.containsKey(string3));
                    map.put(string3, list3);
                }
                list3.add(cib2);
                map2.put(cib2.ordinal(), string3);
            }
        }
    }

    private void a(Node node, cid cid2) {
        Node node2 = jsy.a("Player", node);
        if (node2 == null) {
            throw new bn("Player");
        }
        String string = jsy.i(node2, "Currency");
        if (string == null || string.isEmpty()) {
            throw new bj("Currency");
        }
        int n = Integer.parseInt(jsy.i(node2, "NumOfActives"));
        if (n <= 0) {
            throw new bj("NumOfActives");
        }
        int n2 = Integer.parseInt(jsy.i(node2, "NumOfActivesPerGroup"));
        if (n2 <= 0) {
            throw new bj("NumOfActivesPerGroup");
        }
        cid.eAX = chy.getValueByName(string);
        cid.eAY = n;
        cid.eAZ = n2;
        this.a(node2, cid2, false);
    }

    private void b(Node node, cid cid2) {
        Node node2 = jsy.a("Clan", node);
        if (node2 == null) {
            throw new bn("Clan");
        }
        String string = jsy.i(node2, "Currency");
        if (string == null || string.isEmpty()) {
            throw new bj("Currency");
        }
        int n = Integer.parseInt(jsy.i(node2, "NumOfActives"));
        if (n <= 0) {
            throw new bj("NumOfActives");
        }
        int n2 = Integer.parseInt(jsy.i(node2, "NumOfActivesPerGroup"));
        if (n2 <= 0) {
            throw new bj("NumOfActivesPerGroup");
        }
        cid.eBa = chy.getValueByName(string);
        cid.eBb = n;
        cid.eBc = n2;
        this.a(node2, cid2, true);
    }

    private void a(Node node, cid cid2, boolean bl) {
        List<Node> list = jsy.c("Perk", node);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Node node2 : list) {
            boolean bl2;
            int n;
            int n2 = Integer.parseInt(jsy.i(node2, "Build"));
            if (lcw.bcB != n2 && n2 != 0) continue;
            String string = jsy.i(node2, "Type");
            if (string == null) {
                throw new bj("Type");
            }
            cib cib2 = cib.getValueByName(string);
            if (cib2 == null) {
                throw new bj(string);
            }
            boolean bl3 = Boolean.parseBoolean(jsy.i(node2, "Locked"));
            int n3 = 0;
            String string2 = jsy.i(node2, "Duration");
            if (string2 != null) {
                n3 = this.ui(string2);
            }
            if ((n = Integer.parseInt(jsy.i(node2, "SFCost"))) <= 0) {
                throw new bj("SFCost");
            }
            String[] stringArray = jsy.i(node2, "Group").split(dyC);
            if (stringArray == null || stringArray.length != 2) {
                throw new bj("Group");
            }
            String string3 = stringArray[0];
            cic cic2 = cic.getValueByName(string3);
            int n4 = Integer.valueOf(stringArray[1]);
            String[] stringArray2 = jsy.i(node2, "TierValues").split(dyC);
            if (stringArray2 == null) {
                throw new bj("TierValues");
            }
            float[] fArray = new float[stringArray2.length];
            for (bl2 = false; bl2 < stringArray2.length; bl2 += 1) {
                fArray[bl2] = Float.parseFloat(stringArray2[bl2]);
            }
            bl2 = Boolean.parseBoolean(jsy.i(node2, "Percentage"));
            cid2.a(cic2, n4, cib2, bl3, fArray, n3, n, bl, bl2);
        }
    }

    private int ui(String string) {
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        String[] stringArray = string.split(dyC);
        if (stringArray == null || stringArray.length != 4) {
            assert (false);
            return -1;
        }
        n = Integer.parseInt(stringArray[0]);
        n2 = Integer.parseInt(stringArray[1]);
        n3 = Integer.parseInt(stringArray[2]);
        n4 = Integer.parseInt(stringArray[3]);
        return (int)((double)n * 86400.0 + (double)n2 * 3600.0 + (double)n3 * 60.0 + (double)n4 * 1.0);
    }
}

