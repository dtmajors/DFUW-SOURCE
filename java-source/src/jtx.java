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

public class jtx {
    public static final lju oRy = new lju(0, 1, 0);
    private jzp oRz = new jzp();
    private les DX = lea.enT();

    public void tW(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName("SFMapping");
            if (nodeList.getLength() == 0) {
                lfn.b(2, "SFEffectToSpecialEffectParser", "loadEffectToSpecialEffectMap() No 'SFMapping' nodes found.");
                return;
            }
            Map<Integer, lgv[]> map = lea.eop();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                try {
                    Node node = nodeList.item(i2);
                    int n = this.O(node);
                    List<Node> list = jsy.c("SFResourceSpecialEffectMapping", node);
                    if (list.isEmpty()) {
                        throw new bg("No 'SFResourceSpecialEffectMapping' nodes found for effect '" + this.DX.getName(n) + "'");
                    }
                    lgv[] lgvArray = new lgv[list.size()];
                    for (int i3 = 0; i3 < list.size(); ++i3) {
                        try {
                            lgvArray[i3] = this.P(list.get(i3));
                            continue;
                        }
                        catch (bg bg2) {
                            throw new bg("Parsing of resourcespecialeffectmapping " + i3 + " failed for effect '" + this.DX.getName(n) + "'", bg2);
                        }
                    }
                    Integer n2 = new Integer(n);
                    if (map.containsKey(n2)) {
                        throw new bp("A mapping for effect '" + this.DX.getName(n) + "' already exists in the map.");
                    }
                    map.put(n2, lgvArray);
                    continue;
                }
                catch (bg bg3) {
                    throw new bg("Parsing of effect " + i2 + " failed.", bg3);
                }
            }
        }
        catch (bg bg4) {
            throw new bg("Parsing of file '" + string + "' failed.", bg4);
        }
    }

    private int O(Node node) {
        Node node2 = jsy.d("SFEffectName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFEffectName' has invalid value.");
        }
        int n = this.DX.getType(string);
        if (n <= 0) {
            throw new bj("EffectName '" + string + "' is invalid.");
        }
        return n;
    }

    private lgv P(Node node) {
        Node node2 = jsy.d("SFResourceName", node);
        int n = kah.dv((Node)node2);
        if (n <= 0) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        node2 = jsy.d("SFAttributeName", node);
        int n2 = this.oRz.cI(node2);
        if (n2 <= 0) {
            throw new bj("Node 'SFAttributeName' has invalid value.");
        }
        List<Node> list = jsy.c("SFSpecialEffectName", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFSpecialEffectName' nodes found for resource '" + lea.enW().getName(n) + "'");
        }
        int[] nArray = new int[list.size()];
        int n3 = nArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            node2 = list.get(i2);
            String string = jsy.m(node2);
            if (string == null || string.trim().equals("")) {
                throw new bj("Node 'SFSpecialEffectName' has invalid value.");
            }
            nArray[i2] = del.dr(string);
            if (nArray[i2] > 0) continue;
            throw new bj("SpecialEffectName '" + string + "' is invalid.");
        }
        lgv lgv2 = new lgv();
        lgv2.ResourceType = n;
        lgv2.bnM = n2;
        lgv2.bsH = nArray;
        return lgv2;
    }
}

