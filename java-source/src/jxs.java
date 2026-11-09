/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jxs {
    public static final String oZu = "TradeRouteTypeInfo";
    public static final String NAME = "Name";
    public static final String oZv = "SFTradeRouteResourceType";
    public static final String oZw = "SFTradeRouteItemResourceType";
    public static final String fzf = "ResourceType";
    public static final String oZx = "SFTradeRouteExchangeRates";
    public static final String oZy = "ExchangeRate";
    public static final String oZz = "ExchangeRateMax";
    public static final String oZA = "ReimburcementRate";
    public static final String oZB = "LogoutReimurcementRate";
    public static final String oZC = "SFTradeRouteItemCounts";
    public static final String oZD = "MaxCount";
    public static final String oZE = "MinimumAnte";
    public static final String oZF = "SFTradeRoutePrimaryReward";
    public static final String oZG = "SFTradeRouteSecondaryRewards";
    public static final String oDM = "Reward";
    public static final String nXJ = "Probability";
    public static final String nXL = "Quantity";
    public static final String oZH = "FactionName";
    public static final String oZI = "SFTradeRouteOperationTimers";
    public static final String oZJ = "SFTradeRouteDeliveryTimers";
    public static final String oZK = "OpenTime";
    public static final String oZL = "ClosedTime";
    public static final String oZM = "MinClosedTime";
    public static final String oZN = "MinTime";
    public static final String oZO = "MaxTime";
    public static final String oZP = "LowTime";
    public static final String oZQ = "MediumTime";
    public static final lju fzk = new lju(0, 1);

    public void vu(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, fzk);
        try {
            NodeList nodeList = document.getElementsByTagName(oZu);
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<String, dnf> map = lea.epd();
            Map<Integer, dnf> map2 = lea.epe();
            dnf dnf2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                dnf2 = null;
                dnf2 = this.ck(nodeList.item(i2));
                assert (dnf2 != null);
                assert (!map.containsKey(dnf2.vk()));
                map.put(dnf2.vk(), dnf2);
                map2.put(dnf2.brq(), dnf2);
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private dnf ck(Node node) {
        dnf dnf2 = new dnf();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(NAME);
        assert (node2 != null);
        dnf2.ch(node2.getNodeValue());
        Node node3 = namedNodeMap.getNamedItem(oZH);
        assert (node3 != null);
        dnf2.iR(node3.getNodeValue());
        Node node4 = null;
        Node node5 = null;
        node4 = jsy.a(oZv, node);
        assert (node4 != null);
        namedNodeMap = node4.getAttributes();
        node5 = namedNodeMap.getNamedItem(fzf);
        assert (node5 != null);
        int n = lea.enW().getType(node5.getNodeValue());
        assert (n > 0);
        dnf2.AU(n);
        node4 = jsy.a(oZw, node);
        assert (node4 != null);
        namedNodeMap = node4.getAttributes();
        node5 = namedNodeMap.getNamedItem(fzf);
        assert (node5 != null);
        n = lea.enW().getType(node5.getNodeValue());
        assert (n > 0);
        dnf2.AQ(n);
        node4 = jsy.a(oZx, node);
        assert (node4 != null);
        namedNodeMap = node4.getAttributes();
        assert (namedNodeMap != null);
        float f = Float.parseFloat(namedNodeMap.getNamedItem(oZy).getNodeValue());
        dnf2.P(f);
        float f2 = Float.parseFloat(namedNodeMap.getNamedItem(oZz).getNodeValue());
        dnf2.R(f2);
        float f3 = Float.parseFloat(namedNodeMap.getNamedItem(oZA).getNodeValue());
        dnf2.Q(f3);
        float f4 = Float.parseFloat(namedNodeMap.getNamedItem(oZB).getNodeValue());
        dnf2.S(f4);
        node4 = jsy.a(oZC, node);
        assert (node4 != null);
        namedNodeMap = node4.getAttributes();
        assert (namedNodeMap != null);
        int n2 = Integer.parseInt(namedNodeMap.getNamedItem(oZD).getNodeValue());
        dnf2.AR(n2);
        int n3 = Integer.parseInt(namedNodeMap.getNamedItem(oZE).getNodeValue());
        dnf2.AS(n3);
        node4 = jsy.a(oZI, node);
        assert (node4 != null);
        namedNodeMap = node4.getAttributes();
        assert (namedNodeMap != null);
        dnf2.bS(Double.parseDouble(namedNodeMap.getNamedItem(oZK).getNodeValue()));
        dnf2.bT(Double.parseDouble(namedNodeMap.getNamedItem(oZL).getNodeValue()));
        dnf2.bU(Double.parseDouble(namedNodeMap.getNamedItem(oZM).getNodeValue()));
        node4 = jsy.a(oZJ, node);
        assert (node4 != null);
        namedNodeMap = node4.getAttributes();
        assert (namedNodeMap != null);
        dnf2.bV(Double.parseDouble(namedNodeMap.getNamedItem(oZN).getNodeValue()));
        dnf2.bW(Double.parseDouble(namedNodeMap.getNamedItem(oZO).getNodeValue()));
        dnf2.bX(Double.parseDouble(namedNodeMap.getNamedItem(oZP).getNodeValue()));
        dnf2.bY(Double.parseDouble(namedNodeMap.getNamedItem(oZQ).getNodeValue()));
        node4 = jsy.a(oZF, node);
        assert (node4 != null);
        namedNodeMap = node4.getAttributes();
        assert (namedNodeMap != null);
        int n4 = lea.enW().getType(namedNodeMap.getNamedItem(fzf).getNodeValue());
        assert (n4 > 0);
        dnf2.AT(n4);
        node4 = jsy.a(oZG, node);
        List<Node> list = null;
        if (node4 != null && (list = jsy.c(oDM, node4)) != null && !list.isEmpty()) {
            int[] nArray = new int[list.size()];
            int[] nArray2 = new int[list.size()];
            float[] fArray = new float[list.size()];
            int n5 = 0;
            for (Node node6 : list) {
                namedNodeMap = node6.getAttributes();
                nArray[n5] = lea.enW().getType(namedNodeMap.getNamedItem(fzf).getNodeValue());
                assert (nArray[n5] > 0);
                nArray2[n5] = Integer.parseInt(namedNodeMap.getNamedItem(nXL).getNodeValue());
                fArray[n5] = Float.parseFloat(namedNodeMap.getNamedItem(nXJ).getNodeValue());
                ++n5;
            }
            dnf2.K(nArray);
            dnf2.L(nArray2);
            dnf2.e(fArray);
        }
        return dnf2;
    }
}

