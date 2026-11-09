/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbj {
    public static final String oWs = "SFXML";
    public static final String pcI = "SFStructureSpawnUpSpecialEffect";
    public static final String pcJ = "SFStructureSpawnDownSpecialEffect";
    public static final String pcK = "SFStructureSpawnUpLargeSpecialEffect";
    public static final String pcL = "SFStructureSpawnDownLargeSpecialEffect";
    public static final String pcM = "SFStructureEndSpawningUpSpecialEffect";
    public static final String pcN = "SFStructureDestroySpecialEffect";
    public static final String pcO = "SFStructureDamageSpecialEffect";
    public static final String pcP = "SFStructureSFXSpecialEffect";
    public static final String pcQ = "SFStructureSpawnUpSingleSpecialEffect";
    public static final String pcR = "SFStructureSpawnDownSingleSpecialEffect";
    public static final String pcS = "SFStructureDamageLevelChangeSpecialEffect";
    public static final String pcT = "SFStructureEndSpawningDownSpecialEffect";
    public static final String pcU = "SFAttributeBonus";
    public static final String pcV = "Scope";
    public static final String pcW = "AttributeType";
    public static final String cvJ = "Value";
    public static final String cvI = "Type";
    public static final String pcB = "SFMineInfo";
    public static final String pcX = "SFStructureInfo";
    public static final String pcY = "SFGateMesh";
    public static final String pcZ = "AssociatedObjects";
    public static final String pda = "Object";
    public static final lju oRy = new lju(0, 1, 0);

    public void wn(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName(pcX);
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, amm> map = lea.eoN();
            amm amm2 = null;
            String string2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                amm2 = null;
                try {
                    amm2 = this.eY(nodeList.item(i2));
                    string2 = amm2.Gz();
                    if (map.containsKey(new Integer(amm2.Gy()))) {
                        throw new bg("A Structure with ResourceName='" + string2 + "' already exists.");
                    }
                    map.put(new Integer(amm2.Gy()), amm2);
                    continue;
                }
                catch (bg bg2) {
                    if (amm2 != null && string2 != null) {
                        throw new bg("Parsing of Structure With ResourceName'" + string2 + "' failed.", bg2);
                    }
                    throw new bg("Parsing of Structure " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private amm eY(Node node) {
        Object object;
        Object object2;
        Object object3;
        String string;
        Node node2;
        Object object4;
        Object object5;
        Node node3;
        Object object6;
        Object object7;
        String string2 = this.e(node, "SFResourceName", true);
        int n = lea.enW().getType(string2);
        if (n < 0) {
            throw new bj("Node 'SFResourceName' has invalid value [" + string2 + "]");
        }
        amm amm2 = new amm();
        amm2.dq(string2);
        amm2.gP(n);
        String string3 = this.e(node, pcI, true);
        String string4 = this.e(node, pcJ, true);
        String string5 = this.e(node, pcM, true);
        String string6 = this.e(node, pcN, true);
        String string7 = this.e(node, pcK, true);
        String string8 = this.e(node, pcL, true);
        String string9 = this.e(node, pcQ, true);
        String string10 = this.e(node, pcR, true);
        String string11 = this.e(node, pcT, true);
        String string12 = this.e(node, pcS, true);
        String string13 = this.e(node, pcY, false);
        amm2.gX(del.dr(string9));
        amm2.gY(del.dr(string10));
        amm2.ha(del.dr(string11));
        amm2.gZ(del.dr(string12));
        amm2.gT(del.dr(string3));
        amm2.gS(del.dr(string4));
        amm2.gW(del.dr(string7));
        amm2.gV(del.dr(string8));
        amm2.gR(del.dr(string5));
        amm2.gQ(del.dr(string6));
        amm2.ds(string13);
        int n2 = 0;
        while ((object7 = this.e(node, (String)(object6 = pcO + n2), false)) != null) {
            amm2.dp((String)object7);
            ++n2;
        }
        n2 = 0;
        while ((object7 = this.e(node, (String)(object6 = pcP + n2), false)) != null) {
            amm2.do((String)object7);
            ++n2;
        }
        object6 = jsy.c(pcU, node);
        object7 = object6.iterator();
        while (object7.hasNext()) {
            float f2;
            node3 = (Node)object7.next();
            NamedNodeMap namedNodeMap = node3.getAttributes();
            object5 = namedNodeMap.getNamedItem(pcV).getNodeValue();
            object4 = namedNodeMap.getNamedItem(pcW).getNodeValue();
            node2 = namedNodeMap.getNamedItem(cvI);
            string = node2 != null ? namedNodeMap.getNamedItem(cvI).getNodeValue() : null;
            String string14 = namedNodeMap.getNamedItem(cvJ).getNodeValue();
            object3 = null;
            object2 = mhs.getTypeByName(string);
            if (object2 != null) {
                switch (object2) {
                    case FLOAT: {
                        f2 = Float.parseFloat(string14);
                        object3 = new mhn(f2);
                        break;
                    }
                    case BOOLEAN: {
                        boolean bl = Boolean.parseBoolean(string14);
                        object3 = new mhl(bl);
                        break;
                    }
                    default: {
                        assert (false) : "Unhandled type : " + (Object)object2;
                        {
                            break;
                        }
                    }
                }
            } else {
                f2 = Float.parseFloat(string14);
                object3 = new mhn(f2);
            }
            object = dlp.valueOf((String)object5);
            assert (object5 != null);
            aml aml2 = new aml((dlp)((Object)object), (String)object4, (mhk)object3);
            amm2.a(aml2);
        }
        object7 = (lgw)lea.enW().acv(n);
        node3 = jsy.d(pcB, node);
        boolean bl = jsy.t(node3);
        amm2.be(bl);
        node3 = jsy.a(pcZ, node);
        if (node3 != null) {
            object5 = jsy.c(pda, node3);
            object4 = object5.iterator();
            while (object4.hasNext()) {
                node2 = (Node)object4.next();
                string = jsy.i(node2, "ResourceName");
                int n3 = lea.enW().getType(string);
                if (n3 == -1) continue;
                object3 = jsy.i(node2, "AttachpointName");
                object2 = lea.eor().get(jry.tp(((lgw)object7).bBt()));
                if (object2 == null || (object = (eh)object2.get(object3)) == null) continue;
                amm2.a(n3, (eh)object);
            }
        }
        return amm2;
    }

    private String e(Node node, String string, boolean bl) {
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            if (bl) {
                throw new bj("Node '" + string + "' does not exist.");
            }
            return null;
        }
        String string2 = jsy.m(node2);
        if ((string2 == null || string2.trim().equals("")) && bl) {
            throw new bj("Node '" + string + "' has invalid value.");
        }
        return string2;
    }

    public void wo(String string) {
        String string2 = "xml-files/gamelogicinfo/structuresinfolist.xml";
        Document document = jsy.tJ(string2);
        jsy.a(document, oRy);
        try {
            Node node = this.c(string, document);
            if (node == null) {
                throw new bg("Could not find The Node to remove (" + string + ")");
            }
            node.getParentNode().removeChild(node);
            jsz.b(document, lcw.qLb + string2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string2 + "' failed.", bg2);
        }
    }

    public boolean P(String string, boolean bl) {
        String string2 = "structtemplate.xml";
        return this.b(string, bl, string2);
    }

    public boolean b(String string, boolean bl, String string2) {
        String string3 = "xml-files/worldbuilder/structure-templates/" + string2;
        Document document = jsy.tJ(string3);
        jsy.a(document, oRy);
        string3 = "xml-files/gamelogicinfo/structuresinfolist.xml";
        Document document2 = jsy.tJ(string3);
        jsy.a(document2, oRy);
        try {
            Node node;
            Node node2;
            Node node3 = this.c(string, document2);
            if (node3 != null) {
                if (!bl) {
                    return false;
                }
                node3.getParentNode().removeChild(node3);
            }
            if ((node2 = jsy.a(pcX, node = jsy.a(oWs, (Node)document))) == null) {
                return false;
            }
            Node node4 = jsy.a("SFResourceName", node2);
            if (node4 == null) {
                throw new bj("Node 'SFResourceName' does not exist.");
            }
            Node node5 = this.g(node4);
            node5.setNodeValue(string);
            Node node6 = jsy.a(oWs, (Node)document2);
            Node node7 = document2.importNode(node2, true);
            node6.appendChild(node7);
            jsz.b(document2, lcw.qLb + string3);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string3 + "' failed.", bg2);
        }
        return true;
    }

    private Node c(String string, Document document) {
        NodeList nodeList = document.getElementsByTagName(pcX);
        if (nodeList.getLength() == 0) {
            return null;
        }
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            try {
                String string2 = this.e(nodeList.item(i2), "SFResourceName", true);
                if (!string.equalsIgnoreCase(string2)) continue;
                return nodeList.item(i2);
            }
            catch (bg bg2) {
                throw new bg("Parsing of Structure " + i2 + " failed.", bg2);
            }
        }
        return null;
    }

    public Node g(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                node2 = nodeList.item(i2);
                if (!node2.getNodeName().equals("SFString")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem(cvJ);
                return node;
            }
        }
        return null;
    }
}

