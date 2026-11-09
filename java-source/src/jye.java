/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jye {
    lfn ga = lfn.eqw();
    lju fzk = new lju(0, 1);

    public lkj vA(String string) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/animation/parts/" + string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.t(document, jry.tn(string));
    }

    private lkj t(Document document, String string) {
        lju lju2;
        lkj lkj2 = null;
        Node node = jsy.a("SFAnimationPartTemplate", (Node)document);
        if (node != null && (lju2 = jsy.c(document)).equals(this.fzk)) {
            lkj2 = this.cs(node);
            lkj2.cd(string);
        }
        return lkj2;
    }

    private lkj cs(Node node) {
        Object object;
        lkj lkj2 = null;
        int n = 0;
        String[] stringArray = null;
        String string = null;
        String string2 = null;
        String string3 = "";
        Node node2 = jsy.a("NumberOfParts", node);
        if (node2 == null) {
            object = "Error parsing AnimationPartTemplate. No \"\" node!";
            assert (false) : object;
        }
        n = jsy.r(node2);
        object = jsy.a("Directory", node);
        if (object != null) {
            string3 = jsy.m((Node)object);
        }
        if (n > 0) {
            stringArray = new String[n];
            NodeList nodeList = node.getChildNodes();
            Node node3 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                node3 = nodeList.item(i2);
                for (int i3 = 0; i3 < n; ++i3) {
                    if (!node3.getNodeName().equals("AnimationPart" + Integer.toString(i3))) continue;
                    stringArray[i3] = jsy.m(node3);
                }
                if (node3.getNodeName().equals("Name")) {
                    string = jsy.m(node3);
                }
                if (!node3.getNodeName().equals("AnimationFilename")) continue;
                string2 = jsy.m(node3);
            }
            Node node4 = jsy.a("SFASFileList", node);
            Map map = this.ct(node4);
            lkj2 = new lkj();
            lkj2.setName(string);
            lkj2.ada(n);
            lkj2.U(stringArray);
            lkj2.y(string2);
            lkj2.aj(map);
            lkj2.setDirectory(string3);
        } else {
            String string4 = "Number of Animation Parts is Zero or less!";
            assert (false) : string4;
        }
        return lkj2;
    }

    private Map ct(Node node) {
        Map map = lcn.emw();
        if (node != null) {
            List<Node> list = jsy.c("SFASFile", node);
            for (Node node2 : list) {
                this.a(node2, map);
            }
        }
        return map;
    }

    private void a(Node node, Map map) {
        List<Node> list;
        Node node2 = jsy.a("Filename", node);
        String string = null;
        if (node2 != null) {
            string = jsy.m(node2);
        }
        if ((list = jsy.c("PSAFile", node)) == null) {
            return;
        }
        ArrayList<String> arrayList = lcn.emv();
        for (Node node3 : list) {
            String string2 = jsy.m(node3);
            arrayList.add(string2);
        }
        if (!arrayList.isEmpty() && string != null) {
            map.put(string, arrayList);
        }
    }
}

