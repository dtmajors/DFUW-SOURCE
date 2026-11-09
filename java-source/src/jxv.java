/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jxv {
    private static final String oZV = "SFPlayerVillage";
    private static final String oZW = "ElementInfoList";
    private static final String oZX = "ElementInfo";
    private static final String oZY = "EnglishName";
    private static final String oQd = "ID";
    private static final String oTd = "ResourceTypeName";
    public static final lju avd = new lju(0, 1);
    private int oXS = -1;

    private ldv Wl(int n) {
        assert (this.oXS != -1);
        assert (n != -1);
        return new ldv(0, this.oXS, n);
    }

    public dpr vw(String string) {
        string = "xml-files/server/playervillage/" + string.toLowerCase();
        if (!string.endsWith(".xml")) {
            string = string + ".xml";
        }
        if (!jry.tj(string)) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : Village file not found!!!... Filename = " + string);
            assert (false);
            return null;
        }
        try {
            Document document = jsy.tJ(string);
            return this.q(document, jry.tn(string));
        }
        catch (bo bo2) {
            lfn.b(5, "SFPlayerVillageParser", "parseVillageInfo() : Village Xml file failed to parse!!!... Exception = " + bo2);
            assert (false);
            return null;
        }
    }

    private dpr q(Document document, String string) {
        Node node = jsy.a(oZV, (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : Unexpected root-node in Xml document!!!... Filename = " + string);
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(avd)) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : Parser version does not match Xml document version!!!... ParserVersion = " + avd + ", Xml document version = " + lju2);
            assert (false);
            return null;
        }
        dpr dpr2 = new dpr();
        dpr2.cd(string);
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oZY);
        if (node2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : English name attribute missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        dpr2.gh(node2.getNodeValue());
        Node node3 = namedNodeMap.getNamedItem(oQd);
        if (node3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : ID attribute missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        dpr2.setID(node3.getNodeValue());
        Node node4 = jsy.a("ObjectSpaceGuid", node);
        if (node4 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : Object-space GUID node missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        this.oXS = jsy.r(node4);
        Node node5 = jsy.a("Guid", node);
        if (node5 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : Object ID node missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        dpr2.setGUID(this.Wl(jsy.r(node5)));
        Node node6 = jsy.a(oZW, node);
        if (node6 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : Village element info list node missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        List<Node> list = jsy.c(oZX, node6);
        ArrayList<dpp> arrayList = lcn.emv();
        for (Node node7 : list) {
            dpp dpp2 = this.o(node7, string);
            if (dpp2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "parseVillageInfo() : Village element info failed to parse!!!... Filename = " + string);
                assert (false);
                return null;
            }
            arrayList.add(dpp2);
        }
        dpr2.aI(arrayList);
        return dpr2;
    }

    private dpp o(Node node, String string) {
        dpp dpp2 = new dpp();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oTd);
        if (node2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageElementInfo() : Village element info node resource name attribute missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        dpp2.eY(node2.getNodeValue().toLowerCase());
        dpp2.l(lea.enW().getType(dpp2.pa()));
        Node node3 = jsy.a("SFPosition", node);
        if (node3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageElementInfo() : Village element info node position node missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        dpp2.c(jsy.w(node3));
        Node node4 = jsy.a("SFRotation", node);
        if (node4 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageElementInfo() : Village element info node rotation node missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        dpp2.a(jsy.E(node4));
        Node node5 = jsy.a("Guid", node);
        if (node5 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseVillageElementInfo() : Village element info node object ID node missing!!!... Filename = " + string);
            assert (false);
            return null;
        }
        dpp2.setGUID(this.Wl(jsy.r(node5)));
        return dpp2;
    }
}

