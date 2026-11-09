/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jzu
extends jzy {
    private static final String paO = "SFGlobalItem";
    private static final String paP = "DropPerDay";
    private static final String paQ = "GroupID";
    private static final String paR = "SFDroppedByMonsterList";
    private static final String paS = "SFDropper";
    private final lju fzk = new lju(0, 1);

    public Map<Integer, cth> dUO() {
        String string = "xml-files/server/globalloot/globalloot.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
            jsy.a(document, this.fzk);
        }
        catch (bg bg2) {
            lfn.b(5, "SFGlobalLootParser", "parseGlobalLoot: Failed to parse " + string + ": " + bg2);
            assert (false);
            return null;
        }
        Map<Integer, cth> map = lcn.emw();
        for (Node node = document.getDocumentElement().getFirstChild(); node != null; node = node.getNextSibling()) {
            if (!(node instanceof Element) || !node.getNodeName().equals(paO)) continue;
            Element element = (Element)node;
            cth cth2 = this.L(element);
            if (cth2 == null) {
                lfn.b(5, "SFGlobalLootParser", "parseGlobalLoot: Error parsing global loot element in " + string);
                assert (false);
                return null;
            }
            if (map.containsKey(cth2.aFg)) {
                lfn.b(5, "SFGlobalLootParser", "parseGlobalLoot: Multiple GroupID " + cth2.aFg + " entries in " + string);
                assert (false);
                return null;
            }
            map.put(cth2.aFg, cth2);
        }
        return map;
    }

    private String c(Element element, String string) {
        if (!element.hasAttribute(string)) {
            throw new bg("Element '" + element.getNodeName() + "' without '" + string + "' attribute");
        }
        return element.getAttribute(string);
    }

    private double d(Element element, String string) {
        try {
            return Double.parseDouble(this.c(element, string));
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Element '" + element.getNodeName() + "' attribute '" + string + "' is not a double");
        }
    }

    private int e(Element element, String string) {
        try {
            return Integer.parseInt(this.c(element, string));
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Element '" + element.getNodeName() + "' attribute '" + string + "' is not an int");
        }
    }

    private cth L(Element element) {
        cth cth2 = new cth();
        try {
            cth2.ResourceName = this.c(element, "ResourceName");
            cth2.aFg = this.e(element, paQ);
            cth2.ffO = this.d(element, paP);
            if (element.hasAttribute("Quantity")) {
                cth2.asi = this.e(element, "Quantity");
            } else {
                cth2.dpS = this.e(element, "MinQuantity");
                cth2.dpT = this.e(element, "MaxQuantity");
            }
            cth2.ffP = element.hasAttribute("Probability") ? this.d(element, "Probability") : 1.0;
            cth2.DR = this.p(element, cth2.ResourceName);
            cth2.ffQ = this.q(element, cth2.ResourceName);
            cth2.ffR = lcn.emx();
            for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
                if (!node.getNodeName().equals(paR)) continue;
                for (Node node2 = node.getFirstChild(); node2 != null; node2 = node2.getNextSibling()) {
                    if (!node2.getNodeName().equals(paS) || !(node2 instanceof Element)) continue;
                    Element element2 = (Element)node2;
                    cth2.ffR.add(this.c(element2, "ResourceName"));
                }
                break;
            }
        }
        catch (bg bg2) {
            lfn.b(5, "SFGlobalLootParser", "parseGlobalLootItem: " + bg2.getMessage());
            assert (false);
            return null;
        }
        return cth2;
    }
}

