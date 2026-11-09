/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayInputStream;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class jtb {
    private static final lju nWG = new lju(0, 0);
    private static final lfo ct = new lfo("MB");
    private loi eF = loi.exd();

    public void a(String string, String string2, lht lht2) {
        byte[] byArray = this.eF.AR(string);
        if (byArray == null) {
            throw new bg("Could not read configuration file '" + string + "'");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        InputSource inputSource = new InputSource(byteArrayInputStream);
        Document document = jsy.a(inputSource);
        assert (document != null);
        Node node = this.e(document, string2);
        assert (node != null);
        this.c(document, nWG);
        this.a(node, lht2);
    }

    private void a(Node node, lht lht2) {
        NodeList nodeList = node.getChildNodes();
        int n = nodeList.getLength();
        block14: for (int i = 0; i < n; ++i) {
            Node node2 = nodeList.item(i);
            short s2 = node2.getNodeType();
            switch (s2) {
                case 3: {
                    continue block14;
                }
                case 1: {
                    break;
                }
                case 8: {
                    continue block14;
                }
                case 2: {
                    assert (false);
                    continue block14;
                }
                case 4: {
                    assert (false);
                    continue block14;
                }
                case 5: {
                    assert (false);
                    continue block14;
                }
                case 6: {
                    assert (false);
                    continue block14;
                }
                case 7: {
                    assert (false);
                    continue block14;
                }
                case 9: {
                    assert (false);
                    continue block14;
                }
                case 10: {
                    assert (false);
                    continue block14;
                }
                case 11: {
                    assert (false);
                    continue block14;
                }
                case 12: {
                    assert (false);
                    continue block14;
                }
                default: {
                    assert (false);
                    continue block14;
                }
            }
            String string = node2.getNodeName();
            if (string.equalsIgnoreCase("VersionInformation")) continue;
            lht lht3 = new lht(string);
            lht2.add(lht3);
            this.b(node2, lht3);
            this.a(node2, lht3);
        }
    }

    private void b(Node node, lht lht2) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        block3: for (int i = 0; i < namedNodeMap.getLength(); ++i) {
            lht lht3;
            Node node2 = namedNodeMap.item(i);
            short s2 = node2.getNodeType();
            switch (s2) {
                case 2: {
                    break;
                }
                default: {
                    assert (false);
                    continue block3;
                }
            }
            String string = node2.getNodeName();
            String string2 = node2.getNodeValue();
            if (string.equals("Value") && namedNodeMap.getLength() == 1) {
                lht3 = new lht(string2);
                lht2.add(lht3);
                continue;
            }
            lht3 = new lht(string);
            lht lht4 = new lht(string2);
            lht2.add(lht3);
            lht3.add(lht4);
        }
    }

    private void c(Document document, lju lju2) {
        NodeList nodeList = document.getElementsByTagName("VersionInformation");
        if (nodeList == null || nodeList.getLength() == 0) {
            throw new bn("VersionInformation");
        }
        if (nodeList.getLength() > 1) {
            throw new bo("multiple version nodes");
        }
        lju lju3 = jsy.C(nodeList.item(0));
        assert (lju3 != null);
        if (!lju2.b(lju3)) {
            throw new bk(lju2, lju3);
        }
    }

    private Node e(Document document, String string) {
        Node node = null;
        NodeList nodeList = document.getChildNodes();
        block14: for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node2 = nodeList.item(i);
            short s2 = node2.getNodeType();
            switch (s2) {
                case 8: {
                    continue block14;
                }
                case 1: {
                    break;
                }
                case 2: {
                    assert (false);
                    continue block14;
                }
                case 3: {
                    assert (false);
                    continue block14;
                }
                case 4: {
                    assert (false);
                    continue block14;
                }
                case 5: {
                    assert (false);
                    continue block14;
                }
                case 6: {
                    assert (false);
                    continue block14;
                }
                case 7: {
                    assert (false);
                    continue block14;
                }
                case 9: {
                    assert (false);
                    continue block14;
                }
                case 10: {
                    assert (false);
                    continue block14;
                }
                case 11: {
                    assert (false);
                    continue block14;
                }
                case 12: {
                    assert (false);
                    continue block14;
                }
                default: {
                    assert (false);
                    continue block14;
                }
            }
            if (!node2.getNodeName().equalsIgnoreCase(string)) continue;
            if (node != null) {
                ct.error("multiple root nodes!");
            }
            node = node2;
        }
        if (node == null) {
            throw new bn(string);
        }
        return node;
    }
}

