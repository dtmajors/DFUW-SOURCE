/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jwe {
    lju fzk = new lju(0, 1);
    private Map<String, List<String>> oWy = lcn.emw();
    private Map<String, mgp> oWz = lcn.emw();
    private List<mgo> oWA = lcn.emv();
    private boolean oWB;
    private String oWC;

    public void dTX() {
        Document document;
        block3: {
            if (this.oWB) {
                this.oWC = "\n--- Results for RandomNames SFFile Parsing ---\n";
            }
            document = null;
            try {
                document = jsy.tJ("xml-files/client/cc_config/cc_names.xml");
            }
            catch (bo bo2) {
                if (!this.oWB) break block3;
                this.oWC = this.oWC + "\n" + bo2;
                return;
            }
        }
        this.h(document, "cc_names.xml");
    }

    private void h(Document document, String string) {
        Node node = jsy.a("XML", (Node)document);
        if (node == null) assert (false);
        lju lju2 = jsy.c(document);
        if (lju2.equals(this.fzk)) {
            this.aN(node);
            this.aO(node);
            this.aP(node);
        }
    }

    private void aN(Node node) {
        this.oWy.clear();
        Node node2 = null;
        node2 = jsy.a("Phonemes", node);
        NodeList nodeList = node2.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (!node2.getNodeName().equals("Phoneme")) continue;
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("Name");
            if (node3 == null) {
                assert (false);
                return;
            }
            String string = node3.getNodeValue();
            List<Node> list = jsy.c("Item", node2);
            ArrayList<String> arrayList = lcn.emv();
            for (Node node4 : list) {
                namedNodeMap = node4.getAttributes();
                node3 = namedNodeMap.getNamedItem("Value");
                if (node3 == null) {
                    assert (false);
                    return;
                }
                String string2 = node3.getNodeValue();
                arrayList.add(string2);
            }
            if (arrayList.isEmpty()) continue;
            this.oWy.put(string, arrayList);
        }
    }

    private void aO(Node node) {
        this.oWz.clear();
        Node node2 = null;
        node2 = jsy.a("Templates", node);
        NodeList nodeList = node2.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (!node2.getNodeName().equals("Template")) continue;
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("Name");
            if (node3 == null) {
                assert (false);
                return;
            }
            String string = node3.getNodeValue();
            List<Node> list = jsy.c("Part", node2);
            ArrayList<mgq> arrayList = lcn.emv();
            for (Node node4 : list) {
                mgq mgq2 = new mgq();
                namedNodeMap = node4.getAttributes();
                node3 = namedNodeMap.getNamedItem("Index");
                assert (node3 != null);
                int n = Integer.parseInt(node3.getNodeValue());
                mgq2.setIndex(n);
                node3 = namedNodeMap.getNamedItem("Type");
                assert (node3 != null);
                String string2 = node3.getNodeValue();
                mgq2.setType(string2);
                List<String> list2 = this.oWy.get(string2);
                if (list2 == null) {
                    // empty if block
                }
                node3 = namedNodeMap.getNamedItem("Capital");
                assert (node3 != null);
                mgq2.yU(Boolean.parseBoolean(node3.getNodeValue()));
                arrayList.add(mgq2);
            }
            if (arrayList.isEmpty()) continue;
            Collections.sort(arrayList);
            mgp mgp2 = new mgp();
            mgp2.setName(string);
            mgp2.ch(arrayList);
            this.oWz.put(string, mgp2);
        }
    }

    private void aP(Node node) {
        this.oWA.clear();
        Node node2 = null;
        node2 = jsy.a("Definitions", node);
        NodeList nodeList = node2.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (!node2.getNodeName().equals("Definition")) continue;
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("Race");
            if (node3 == null) {
                assert (false);
                return;
            }
            String string = node3.getNodeValue();
            node3 = namedNodeMap.getNamedItem("Type");
            if (node3 == null) {
                assert (false);
                return;
            }
            String string2 = node3.getNodeValue();
            List<Node> list = jsy.c("Template", node2);
            ArrayList<String> arrayList = lcn.emv();
            for (Node node4 : list) {
                namedNodeMap = node4.getAttributes();
                node3 = namedNodeMap.getNamedItem("Name");
                assert (node3 != null);
                arrayList.add(node3.getNodeValue());
            }
            if (arrayList.isEmpty()) continue;
            mgo mgo2 = new mgo();
            mgo2.BN(string);
            mgo2.setType(string2);
            ArrayList<mgp> arrayList2 = lcn.abH(arrayList.size());
            for (String string3 : arrayList) {
                mgp mgp2 = this.oWz.get(string3);
                if (mgp2 == null) {
                    if (this.oWB) {
                        this.oWC = this.oWC + "\nTemplate for [" + string3 + "] does not exist!";
                    } else assert (false) : "Template for [" + string3 + "] does not exist!";
                }
                arrayList2.add(mgp2);
            }
            mgo2.cg(arrayList2);
            this.oWA.add(mgo2);
        }
    }

    public List<mgo> dTY() {
        return this.oWA;
    }

    public Map<String, List<String>> dTZ() {
        return this.oWy;
    }

    public String bIk() {
        return this.oWC;
    }

    public void uY(boolean bl) {
        this.oWB = bl;
    }
}

