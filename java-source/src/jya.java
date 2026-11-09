/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import spenefett.util.jni.SFJNIUtils;

public class jya {
    private lju fzk = new lju(0, 1);
    private final String oWD = "Could not parse Node = ";

    public void dTX() {
        int n = -1;
        if (lcw.eng()) {
            n = SFJNIUtils.Instance.globalMutexOpen("Zones");
            SFJNIUtils.Instance.globalMutexLock(n, -1);
        }
        String string = "xml-files/zones/" + lcw.qGL;
        Document document = null;
        Map<String, btg> map = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            // empty catch block
        }
        try {
            map = this.a(document, jry.tn(string));
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
        fy.ax.clear();
        fy.ax.putAll(map);
        if (lcw.eng() && n != -1) {
            SFJNIUtils.Instance.globalMutexUnlock(n);
            SFJNIUtils.Instance.globalMutexClose(n);
        }
    }

    private Map<String, btg> a(Document document, String string) {
        Map<String, btg> map = lcn.emw();
        Node node = jsy.a("SFZoneFile", (Node)document);
        if (node == null) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Vrong Version [" + lju2 + "]. Supported Version = " + this.fzk);
        }
        String string2 = "ZoneList";
        Node node22 = jsy.a(string2, node);
        if (node22 == null) {
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        string2 = "Zone";
        List<Node> list = jsy.c(string2, node22);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        btg btg2 = null;
        for (Node node22 : list) {
            if (node22 != null) {
                btg2 = this.cl(node22);
            }
            if (btg2 == null) continue;
            map.put(btg2.axz(), btg2);
        }
        return map;
    }

    private btg cl(Node node) {
        btg btg2 = new btg();
        btg2.gl(jsy.i(node, "Name"));
        String string = "LevelList";
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        string = "Level";
        List<Node> list = jsy.c(string, node2);
        ArrayList<bst> arrayList = lcn.emv();
        for (Node node3 : list) {
            NamedNodeMap namedNodeMap = node3.getAttributes();
            Node node4 = namedNodeMap.getNamedItem("Filename");
            String string2 = node4.getNodeValue();
            node4 = namedNodeMap.getNamedItem("LevelID");
            int n = -1;
            if (node4 != null) {
                n = Integer.parseInt(node4.getNodeValue());
            }
            ljq ljq2 = new ljq();
            ljq ljq3 = new ljq();
            node4 = namedNodeMap.getNamedItem("MinBBoxX");
            if (node4 != null) {
                ljq2.x = Float.parseFloat(node4.getNodeValue());
            }
            if ((node4 = namedNodeMap.getNamedItem("MinBBoxY")) != null) {
                ljq2.y = Float.parseFloat(node4.getNodeValue());
            }
            if ((node4 = namedNodeMap.getNamedItem("MinBBoxZ")) != null) {
                ljq2.rlV = Float.parseFloat(node4.getNodeValue());
            }
            if ((node4 = namedNodeMap.getNamedItem("MaxBBoxX")) != null) {
                ljq3.x = Float.parseFloat(node4.getNodeValue());
            }
            if ((node4 = namedNodeMap.getNamedItem("MaxBBoxY")) != null) {
                ljq3.y = Float.parseFloat(node4.getNodeValue());
            }
            if ((node4 = namedNodeMap.getNamedItem("MaxBBoxZ")) != null) {
                ljq3.rlV = Float.parseFloat(node4.getNodeValue());
            }
            bst bst2 = new bst(string2, n);
            if (!ljq3.esJ() && !ljq2.esJ()) {
                bss bss2 = new bss();
                bss2.dJw = ljq2.x;
                bss2.dJx = ljq2.y;
                bss2.dJy = ljq2.rlV;
                bss2.dJz = ljq3.x;
                bss2.dJA = ljq3.y;
                bss2.dJB = ljq3.rlV;
                bst2.a(bss2);
            } else assert (false);
            arrayList.add(bst2);
        }
        btg2.an(arrayList);
        return btg2;
    }
}

