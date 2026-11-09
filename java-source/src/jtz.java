/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kah
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jtz {
    public static final lju oRy = new lju(0, 1, 0);

    public void tY(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName("SFMapping");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map map = lea.eoq();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                try {
                    Node node = nodeList.item(i2);
                    int n = this.Q(node);
                    List<Node> list = jsy.c("SFResourceSpecialEffectMapping", node);
                    if (list.isEmpty()) {
                        throw new bg("No 'SFResourceSpecialEffectMapping' nodes found for event '" + bfo.eV(n) + "'");
                    }
                    lgz[] lgzArray = new lgz[list.size()];
                    for (int i3 = 0; i3 < list.size(); ++i3) {
                        try {
                            lgzArray[i3] = this.R(list.get(i3));
                            continue;
                        }
                        catch (bg bg2) {
                            throw new bg("Parsing of mapping " + i3 + " failed for event '" + bfo.eV(n) + "'", bg2);
                        }
                    }
                    Integer n2 = new Integer(n);
                    if (map.containsKey(n2)) {
                        throw new bp("A mapping for event '" + bfo.eV(n) + "' already exists in the map.");
                    }
                    map.put(n2, lgzArray);
                    continue;
                }
                catch (bg bg3) {
                    throw new bg("Parsing of event " + i2 + " failed.", bg3);
                }
            }
        }
        catch (bg bg4) {
            throw new bg("Parsing of file '" + string + "' failed.", bg4);
        }
    }

    private int Q(Node node) {
        Node node2 = jsy.d("SFEventName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFEventName' has invalid value.");
        }
        int n = bfo.ft(string);
        if (n <= 0) {
            throw new bj("EventName '" + string + "' is invalid.");
        }
        return n;
    }

    private lgz R(Node node) {
        Node node2 = jsy.d("SFResourceName", node);
        int n = kah.dv((Node)node2);
        if (n <= 0) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        List<Node> list = jsy.c("SFSpecialEffectName", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFSpecialEffectName' nodes found for resource '" + lea.enW().getName(n) + "'");
        }
        int[] nArray = new int[list.size()];
        int n2 = nArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            node2 = list.get(i2);
            String string = jsy.m(node2);
            if (string == null || string.trim().equals("")) {
                throw new bj("Node 'SFSpecialEffectName' has invalid value.");
            }
            nArray[i2] = del.dr(string);
            if (nArray[i2] > 0) continue;
            throw new bj("SpecialEffectName '" + string + "' is invalid.");
        }
        lgz lgz2 = new lgz();
        lgz2.ResourceType = n;
        lgz2.bsH = nArray;
        return lgz2;
    }
}

