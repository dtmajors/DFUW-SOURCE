/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jzo {
    public static final lju oRy = new lju(0, 1, 0);

    public void dTX() {
        String string = "xml-files/gamelogicinfo/attachpoints.xml";
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            Node node = jsy.d("SFAttachpointFile", document);
            List<Node> list = jsy.c("SFAttachPointSet", node);
            if (list.isEmpty()) {
                lfn.b(3, "SFAttachPointFileParser", "parseFile() No 'SFAttachPointSet' nodes found.");
                return;
            }
            lea.eor().clear();
            Node node22 = null;
            String string2 = null;
            for (Node node22 : list) {
                Node node3 = jsy.d("DescriptionFilename", node22);
                string2 = jsy.m(node3);
                if (string2 == null || string2.trim().equals("")) {
                    throw new bj("Node 'DescriptionFilename' has invalid value.");
                }
                List<Node> list2 = jsy.c("SFAttachPoint", node22);
                if (list2.isEmpty()) {
                    throw new bj("No 'SFAttachPoint' nodes found for descriptionfile '" + string2 + "'");
                }
                Map<String, eh> map = ei.ao(string2);
                if (map != null) {
                    throw new bg("AttachPointMap already mapped to descriptionfile '" + string2 + "'");
                }
                map = lcn.emw();
                ei.a(string2, map);
                eh eh2 = null;
                int n = list2.size();
                for (int i2 = 0; i2 < n; ++i2) {
                    try {
                        eh2 = this.cG(list2.get(i2));
                        if (map.containsKey(eh2.getName())) {
                            throw new bg("AttachPoint '" + eh2.getName() + "' is already added.");
                        }
                        map.put(eh2.getName(), eh2);
                        continue;
                    }
                    catch (Exception exception) {
                        throw new bg("Parsing of attachpointnode " + i2 + " for descriptionfilename " + string2 + " failed.", exception);
                    }
                }
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private eh cG(Node node) {
        int n = 0;
        String string = null;
        String string2 = null;
        ljq ljq2 = null;
        ljq ljq3 = null;
        Node node2 = null;
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("SFAttachPointType")) {
                n = jsy.r(node2);
                continue;
            }
            if (node2.getNodeName().equals("SFAttachPointName")) {
                string = jsy.m(node2);
                continue;
            }
            if (node2.getNodeName().equals("SFFrameName")) {
                string2 = jsy.m(node2);
                continue;
            }
            if (node2.getNodeName().equals("SFTranslation")) {
                ljq2 = jsy.w(node2);
                continue;
            }
            if (!node2.getNodeName().equals("SFRotation")) continue;
            ljq3 = jsy.w(node2);
        }
        if (string == null || string.trim().isEmpty()) {
            throw new bj("Node 'SFAttachPointName' has invalid value.");
        }
        if (string2 == null || string2.trim().isEmpty()) {
            throw new bj("Node 'SFFrameName' has invalid value.");
        }
        if (ljq2 == null) {
            throw new bj("Node 'SFTranslation' has invalid value.");
        }
        if (ljq3 == null) {
            throw new bj("Node 'SFRotation' has invalid value.");
        }
        eh eh2 = new eh();
        eh2.ac(n);
        eh2.setName(string);
        eh2.setFrameName(string2);
        eh2.K(ljq2);
        eh2.setRotation(ljq3);
        return eh2;
    }
}

