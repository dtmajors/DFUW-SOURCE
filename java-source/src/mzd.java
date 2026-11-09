/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mzd
extends jsy {
    private jwx EUW = new jwx();

    public Map Eh(String string) {
        Map map = null;
        Document document = jsy.tK("worldbuilder/logicobject_library.xml");
        NodeList nodeList = document.getElementsByTagName("VersionInformation");
        Node node = null;
        if (nodeList.getLength() > 0) {
            node = nodeList.item(0);
        }
        boolean bl = false;
        lju lju2 = jsy.c(document);
        if (lju2.getMajor() == 0 && lju2.getMinor() == 1) {
            map = this.w(document);
        } else {
            lfn.print("SFObjectListFileParser: Version (" + lju2.getMajor() + "," + lju2.getMinor() + ") not supported!");
        }
        return map;
    }

    private Map w(Document document) {
        Map<String, List> map = lcn.emw();
        NodeList nodeList = document.getElementsByTagName("SFCategory");
        Node node = null;
        List list = null;
        for (int i = 0; i < nodeList.getLength(); ++i) {
            node = nodeList.item(i);
            NamedNodeMap namedNodeMap = node.getAttributes();
            Node node2 = namedNodeMap.getNamedItem("ID");
            String string = node2.getNodeValue();
            list = this.fp(node);
            map.put(string, list);
        }
        return map;
    }

    private List fp(Node node) {
        NodeList nodeList = node.getChildNodes();
        ArrayList<btl> arrayList = lcn.emv();
        Node node2 = null;
        for (int i = 0; i < nodeList.getLength(); ++i) {
            btl btl2;
            node2 = nodeList.item(i);
            if (!node2.getNodeName().equals("SFLogicObject") || (btl2 = this.fq(node2)) == null) continue;
            arrayList.add(btl2);
        }
        return arrayList;
    }

    private btl fq(Node node) {
        btl btl2 = null;
        NodeList nodeList = node.getChildNodes();
        Node node2 = null;
        Object var5_5 = null;
        String string = null;
        for (int i = 0; i < nodeList.getLength(); ++i) {
            node2 = nodeList.item(i);
            if (!node2.getNodeName().equals("DescriptionFilename")) continue;
            string = jsy.m(node2);
        }
        if (string != null) {
            btl2 = this.EUW.uW(string);
        } else {
            lfn.print("SFLogicObjectListFileParser: Could not create new SFLogicObjectDesc. A variable was null!");
        }
        return btl2;
    }
}

