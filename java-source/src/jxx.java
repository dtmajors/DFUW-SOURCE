/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jxx {
    private static lju fzk = new lju(0, 1);
    private static String ejK = "SFVoxelExceptionFileParser";

    public static ArrayList<String> dUI() {
        String string = "xml-files/zones/" + lcw.qGN;
        Document document = null;
        ArrayList<String> arrayList = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            // empty catch block
        }
        try {
            arrayList = jxx.r(document, jry.tn(string));
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
        return arrayList;
    }

    private static ArrayList<String> r(Document document, String string) {
        ArrayList<String> arrayList = lcn.emv();
        Node node = jsy.a("SFVoxelExceptionFile", (Node)document);
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
        for (Node node3 : list) {
            NamedNodeMap namedNodeMap;
            Node node4;
            if (node3 == null || (node4 = (namedNodeMap = node3.getAttributes()).getNamedItem("Name")) == null) continue;
            String string2 = node4.getNodeValue();
            arrayList.add(string2);
        }
        return arrayList;
    }
}

