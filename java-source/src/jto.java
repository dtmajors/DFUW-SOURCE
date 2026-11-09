/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jto {
    public static void dSK() {
        int n;
        lea.rhD.clear();
        String string = "xml-files/client/chat/chatcolors.xml";
        Document document = jsy.tJ(string);
        NodeList nodeList = document.getElementsByTagName("Color");
        TreeMap<Integer, hez> treeMap = lcn.emG();
        for (n = 0; n < nodeList.getLength(); ++n) {
            Node node = nodeList.item(n);
            try {
                hez hez2 = jto.J(node);
                if (treeMap.containsKey(hez2.kgs)) {
                    throw new bg("Duplicate ListIndex " + hez2.kgs + " in chat color config");
                }
                for (hez hez3 : treeMap.values()) {
                    if (hez3.kgr.charValue() != hez2.kgr.charValue()) continue;
                    throw new bg("Duplicate ShortcutChar " + hez2.kgr + " in chat color config");
                }
                treeMap.put(hez2.kgs, hez2);
                continue;
            }
            catch (bg bg2) {
                throw new bo(string, bg2);
            }
        }
        if (treeMap.size() < 3) {
            throw new bo(string, new bg("Need to define at least 3 chat colors"));
        }
        n = 0;
        for (hez hez2 : treeMap.values()) {
            lea.rhD.add(new hez(hez2.DisplayName, hez2.dMT, hez2.kgr, n));
            ++n;
        }
    }

    private static hez J(Node node) {
        int n;
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem("DisplayName");
        if (node2 == null) {
            throw new bg("DisplayName attribute not found");
        }
        String string = node2.getNodeValue();
        node2 = namedNodeMap.getNamedItem("ShortcutChar");
        if (node2 == null) {
            throw new bg("ShortcutChar attribute not found");
        }
        if (node2.getNodeValue().length() != 1) {
            throw new bg("ShortcutChar attribute not a single character");
        }
        Character c2 = Character.valueOf(Character.toLowerCase(node2.getNodeValue().charAt(0)));
        node2 = namedNodeMap.getNamedItem("ListIndex");
        if (node2 == null) {
            throw new bg("ListIndex attribute not found");
        }
        try {
            n = Integer.parseInt(node2.getNodeValue());
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("ListIndex attribute not an integer");
        }
        node2 = namedNodeMap.getNamedItem("RGBA");
        if (node2 == null) {
            throw new bg("RGBA attribute not found");
        }
        String string2 = node2.getNodeValue();
        if (string2.length() != 8 && string2.length() != 6) {
            throw new bg("Color attribute not a RRGGBB[AA] value");
        }
        lcq lcq2 = jto.tR(string2);
        if (lcq2 == null) {
            throw new bg("Color attribute not a RRGGBB[AA] value");
        }
        return new hez(string, lcq2, c2, n);
    }

    public static lcq tR(String string) {
        long l;
        if (string.length() == 6) {
            string = string + "FF";
        }
        try {
            l = Long.parseLong(string, 16);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        float f = (float)(l >> 24 & 0xFFL) / 255.0f;
        float f2 = (float)(l >> 16 & 0xFFL) / 255.0f;
        float f3 = (float)(l >> 8 & 0xFFL) / 255.0f;
        float f4 = (float)(l & 0xFFL) / 255.0f;
        return new lcq(f, f2, f3, f4);
    }
}

