/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jue {
    public void ua(String string) {
        try {
            Document document = jsy.tJ(string);
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFItem", node);
            if (list.isEmpty()) {
                lfn.b(4, this.getClass().getSimpleName(), "no resource duplication probabilities found");
                return;
            }
            Map<Integer, Float> map = lea.epR();
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    Node node2 = list.get(i2);
                    if (!(node2 instanceof Element)) {
                        throw new bp("Node at index " + i2 + " not an element");
                    }
                    Element element = (Element)node2;
                    String string2 = element.getAttribute("ResourceName");
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Attribute 'ResourceName' has invalid value.");
                    }
                    int n2 = lea.enW().getType(string2);
                    if (n2 == -1) {
                        throw new bj("Attribute 'ResourceName' has invalid value.");
                    }
                    String string3 = element.getAttribute("Probability");
                    if (string3 == null || string3.trim().equals("")) {
                        throw new bj("Attribute 'Probability' has invalid value.");
                    }
                    float f = -1.0f;
                    try {
                        f = Float.valueOf(string3).floatValue();
                        if (f < 0.0f || f > 1.0f) {
                            throw new bj("Attribute 'Probability' has invalid value.");
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new bj("Attribute 'Probability' has invalid value.");
                    }
                    map.put(n2, Float.valueOf(f));
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of node " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }
}

