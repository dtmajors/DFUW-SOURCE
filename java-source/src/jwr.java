/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jwr {
    public static final String oWL = "FortressSystemTypeInfo";
    public static final String oXU = "FortressSystem";
    public static final String oXO = "Name";
    public static final String oXV = "VulnerabilityTime";
    public static final String oXW = "FortressSystemReward";
    public static final String oXX = "ResourceType";
    public static final String oXY = "Probability";
    public static final String oXZ = "Min";
    public static final String oYa = "Max";
    public static final String oYb = "InvulnerableCountDownTimerDuration";
    public static final String oYc = "InvulnerableCountDownTimerDurationDebug";
    public static final String oYd = "TotalLootTime";
    public static final String oYe = "TotalLootTimeDebug";
    public static final String oYf = "RubbleStayTime";
    public static final String oYg = "RubbleStayTimeDebug";
    public static final lju fzk = new lju(0, 3);

    public void uR(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, fzk);
        try {
            NodeList nodeList = document.getElementsByTagName(oXU);
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<String, bjz> map = lea.epc();
            bjz bjz2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                bjz2 = null;
                bjz2 = this.bf(nodeList.item(i2));
                assert (bjz2 != null);
                assert (!map.containsKey(bjz2.aqd()));
                map.put(bjz2.aqd(), bjz2);
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private bjz bf(Node node) {
        bjz bjz2 = new bjz();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oXO);
        assert (node2 != null);
        bjz2.fL(node2.getNodeValue().toLowerCase());
        Node node3 = namedNodeMap.getNamedItem(oXV);
        assert (node3 != null);
        bjz2.fO(node3.getNodeValue());
        Node node4 = namedNodeMap.getNamedItem(oYd);
        assert (node4 != null);
        bjz2.kT(Integer.valueOf(node4.getNodeValue()));
        node3 = namedNodeMap.getNamedItem(oYb);
        assert (node3 != null);
        Node node5 = namedNodeMap.getNamedItem(oYf);
        assert (node5 != null);
        bjz2.kU(Integer.valueOf(node5.getNodeValue()));
        double d2 = this.uS(node3.getNodeValue());
        bjz2.aW(d2);
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node6 = nodeList.item(i2);
            assert (node6 != null);
            if (node6.getNodeName() != oXW) continue;
            bjw bjw2 = new bjw();
            namedNodeMap = node6.getAttributes();
            Node node7 = namedNodeMap.getNamedItem(oXX);
            assert (node7 != null);
            String string = node7.getNodeValue();
            int n = lea.enW().getType(string);
            assert (n > 0);
            bjw2.kS(n);
            node7 = namedNodeMap.getNamedItem(oXY);
            assert (node7 != null);
            bjw2.cQ(Float.parseFloat(node7.getNodeValue()));
            node7 = namedNodeMap.getNamedItem(oXZ);
            assert (node7 != null);
            bjw2.kQ(Integer.parseInt(node7.getNodeValue()));
            node7 = namedNodeMap.getNamedItem(oYa);
            bjw2.kR(Integer.parseInt(node7.getNodeValue()));
            bjz2.a(bjw2);
        }
        return bjz2;
    }

    private double uS(String string) {
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        String[] stringArray = string.split(":");
        if (stringArray == null || stringArray.length != 4) {
            assert (false);
            return -1.0;
        }
        n = Integer.parseInt(stringArray[0]);
        n2 = Integer.parseInt(stringArray[1]);
        n3 = Integer.parseInt(stringArray[2]);
        n4 = Integer.parseInt(stringArray[3]);
        return (double)n * 86400.0 + (double)n2 * 3600.0 + (double)n3 * 60.0 + (double)n4 * 1.0;
    }
}

