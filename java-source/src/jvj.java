/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jvj {
    private static final Map<String, arf> oTN = lcn.emw();
    private static final String oTO = "spawnlinkedgroups.xml";

    public static void dTy() {
        Object object;
        Object object2;
        HashSet<arf> hashSet = new HashSet<arf>();
        hashSet.addAll(jvj.dTz());
        File file = new File(lcw.qLb + "xml-files/object/spawnpoint/");
        String[] stringArray = file.list(new FilenameFilter(){

            public boolean accept(File file, String string) {
                return string.contains(".xml");
            }
        });
        HashSet<String> hashSet2 = new HashSet<String>(Arrays.asList(stringArray));
        HashSet<arf> hashSet3 = new HashSet<arf>();
        for (arf object32 : hashSet) {
            object2 = object32.QG().iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                if (hashSet2.contains(object)) continue;
                object2.remove();
            }
            if (object32.QG().size() <= 1) continue;
            hashSet3.add(object32);
        }
        Object object4 = null;
        DocumentBuilder documentBuilder = jtf.dSE();
        object2 = documentBuilder.getDOMImplementation();
        object = null;
        object4 = object2.createDocument(null, "SpawnLinkedGroups", null);
        Element element = object4.getDocumentElement();
        for (arf arf2 : hashSet3) {
            object = object4.createElementNS(null, "LinkedGroup");
            object.setAttributeNS(null, "Value", arf2.QH().toString());
            for (String string : arf2.QG()) {
                Element element2 = object4.createElementNS(null, "SFString");
                element2.setAttributeNS(null, "Value", string);
                object.appendChild(element2);
            }
            element.appendChild((Node)object);
        }
        jsz.a((Document)object4, new jrw(lcw.qLb + "xml-files/object/spawnpoint/" + "links" + "/" + oTO));
    }

    public static arf uu(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(".xml");
        return oTN.get(stringBuilder.toString());
    }

    public static Collection<arf> dTz() {
        return oTN.values();
    }

    static {
        Document document = jsy.tK("xml-files/object/spawnpoint/links/spawnlinkedgroups.xml");
        assert (document != null);
        Node node = jsy.a("SpawnLinkedGroups", (Node)document);
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node2 = nodeList.item(i2);
            NamedNodeMap namedNodeMap = node2.getAttributes();
            if (namedNodeMap == null || namedNodeMap.getLength() == 0) continue;
            Node node3 = namedNodeMap.getNamedItem("Value");
            arf.b b2 = null;
            if (node3 != null) {
                b2 = arf.b.getType(node3.getNodeValue());
            }
            NodeList nodeList2 = node2.getChildNodes();
            ArrayList<String> arrayList = lcn.emv();
            for (int i3 = 0; i3 < nodeList2.getLength(); ++i3) {
                node2 = nodeList2.item(i3);
                namedNodeMap = node2.getAttributes();
                if (namedNodeMap == null || namedNodeMap.getLength() == 0 || (node3 = namedNodeMap.getNamedItem("Value")) == null) continue;
                arrayList.add(node3.getNodeValue());
            }
            if (arrayList.isEmpty()) continue;
            arf arf2 = new arf(arrayList, b2);
            for (String string : arrayList) {
                if (oTN.containsKey(string)) {
                    assert (false);
                    continue;
                }
                oTN.put(string, arf2);
            }
        }
    }
}

