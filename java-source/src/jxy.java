/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jxy {
    private static lju fzk = new lju(0, 1);
    private static String ejK = "SFVoxelFileParser";

    public static Map<String, jza.a> cMr() {
        String string = "xml-files/zones/" + lcw.qGM;
        Document document = null;
        Map<String, jza.a> map = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            // empty catch block
        }
        try {
            map = jxy.a(document, jry.tn(string));
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
        return map;
    }

    private static Map<String, jza.a> a(Document document, String string) {
        Map<String, jza.a> map = lcn.emw();
        Node node = jsy.a("SFVoxelFile", (Node)document);
        if (node == null) {
            assert (false);
            throw new bp("Could not parse file [" + string + "]. Rootnode is invalid");
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(fzk)) {
            assert (false);
            throw new bp("Could not parse file [" + string + "]. Wrong Version [" + lju2 + "]. Supported Version = " + fzk);
        }
        Node node2 = jsy.a("VoxelList", node);
        if (node2 == null) {
            assert (false);
            throw new bp("Could not parse [" + node2 + "] Node");
        }
        List<Node> list = jsy.c("Level", node2);
        if (list == null) {
            assert (false);
            throw new bp("Could not parse [" + list + "] Node");
        }
        for (Node node32 : list) {
            if (node32 == null) continue;
            NamedNodeMap namedNodeMap = node32.getAttributes();
            jza.a a2 = new jza.a();
            a2.mZ = new ljq();
            a2.pay = new ljq();
            Node node4 = namedNodeMap.getNamedItem("Name");
            if (node4 == null) continue;
            String string2 = node4.getNodeValue();
            node4 = namedNodeMap.getNamedItem("CenterX");
            if (node4 == null) continue;
            a2.mZ.x = Float.parseFloat(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("CenterY");
            if (node4 == null) continue;
            a2.mZ.y = Float.parseFloat(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("CenterZ");
            if (node4 == null) continue;
            a2.mZ.rlV = Float.parseFloat(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("SizeX");
            if (node4 == null) continue;
            a2.pay.x = Float.parseFloat(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("SizeY");
            if (node4 == null) continue;
            a2.pay.y = Float.parseFloat(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("SizeZ");
            if (node4 == null) continue;
            a2.pay.rlV = Float.parseFloat(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("Resolution");
            if (node4 == null) continue;
            a2.bUC = Float.parseFloat(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("HasAperture");
            if (node4 == null) continue;
            a2.paA = Boolean.parseBoolean(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("Oversized");
            if (node4 == null) continue;
            a2.paz = Boolean.parseBoolean(node4.getNodeValue());
            node4 = namedNodeMap.getNamedItem("BlockSize");
            if (node4 == null) continue;
            a2.paB = Float.parseFloat(node4.getNodeValue());
            List<Node> list2 = jsy.c("BOFF", node32);
            if (list2.size() > 0) {
                a2.paC = new lek[list2.size()];
                int n = 0;
                for (Node node32 : list2) {
                    if (node32 == null) {
                        a2.paC = null;
                        break;
                    }
                    namedNodeMap = node32.getAttributes();
                    a2.paC[n] = new lek();
                    node4 = namedNodeMap.getNamedItem("X");
                    if (node4 == null) {
                        a2.paC = null;
                        break;
                    }
                    a2.paC[n].cf = Integer.parseInt(node4.getNodeValue());
                    node4 = namedNodeMap.getNamedItem("Y");
                    if (node4 == null) {
                        a2.paC = null;
                        break;
                    }
                    a2.paC[n].cg = Integer.parseInt(node4.getNodeValue());
                    node4 = namedNodeMap.getNamedItem("Z");
                    if (node4 == null) {
                        a2.paC = null;
                        break;
                    }
                    a2.paC[n].riS = Integer.parseInt(node4.getNodeValue());
                    ++n;
                }
            }
            map.put(string2, a2);
        }
        return map;
    }
}

