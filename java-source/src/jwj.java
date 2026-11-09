/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jwj {
    public static final String oWL = "SFCity";
    public static final String ID = "ID";
    public static final String nml = "CityEnglishName";
    public static final String oWN = "Radius";
    public static final String oWO = "PowerLevel";
    public static final String oWP = "Type";
    public static final String oWQ = "StoneElementInfo";
    public static final String oWR = "ElementInfoList";
    public static final String oWS = "ElementInfo";
    public static final String oWT = "PreReqList";
    public static final String oWU = "Category";
    public static final String oWV = "ResourceTypeName";
    public static final String oWW = "RubbleResourceName";
    public static final String oWX = "RacialReqs";
    public static final String oWY = "NPCName";
    public static final String oWZ = "SFPair";
    public static final String oXa = "Resource";
    public static final String oXb = "Level";
    public static final String oXc = "GUID";
    public static final String oXd = "LevyCollectorInfo";
    lju fzk = new lju(0, 1);

    public axs uJ(String string) {
        if (!(string = string.toLowerCase()).endsWith(".xml")) {
            string = string + ".xml";
        }
        if (!jry.tj(string = "xml-files/server/city/" + string)) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.j(document, jry.tn(string));
    }

    private axs j(Document document, String string) {
        axs axs2;
        block23: {
            axs2 = new axs();
            axs2.cc(string);
            Node node = jsy.a(oWL, (Node)document);
            if (node == null) {
                assert (false);
                return null;
            }
            lju lju2 = jsy.c(document);
            if (!lju2.equals(this.fzk)) {
                return axs2;
            }
            NamedNodeMap namedNodeMap = node.getAttributes();
            Node node2 = namedNodeMap.getNamedItem(ID);
            if (node2 != null) {
                axs2.setID(node2.getNodeValue());
            } else assert (false);
            node2 = namedNodeMap.getNamedItem(nml);
            if (node2 != null) {
                axs2.eK(node2.getNodeValue());
            } else assert (false);
            node2 = namedNodeMap.getNamedItem(oWN);
            if (node2 != null) {
                float f = Float.parseFloat(node2.getNodeValue());
                axs2.X(f);
            } else assert (false);
            node2 = namedNodeMap.getNamedItem(oWO);
            if (node2 != null) {
                int n = Integer.parseInt(node2.getNodeValue());
                axs2.iq(n);
            } else assert (false);
            node2 = namedNodeMap.getNamedItem(oWP);
            if (node2 != null) {
                int n = Integer.parseInt(node2.getNodeValue());
                axs2.iD(n);
            }
            Node node3 = jsy.a("SFPosition", node);
            ljq ljq2 = jsy.w(node3);
            axs2.al(ljq2);
            ArrayList<axq> arrayList = lcn.emv();
            Node node4 = jsy.a(oWR, node);
            List<Node> list = jsy.c(oWS, node4);
            boolean bl = false;
            if (string.toLowerCase().contains("_default_")) {
                bl = true;
            }
            for (Node object : list) {
                axq n = this.b(object, bl);
                assert (n != null);
                arrayList.add(n);
            }
            axs2.V(arrayList);
            Node node5 = jsy.a(oXd, node);
            if (node5 != null) {
                try {
                    String bp2 = jsy.i(node5, oWV);
                    int n = lea.enW().getType(bp2);
                    assert (n != -1);
                    Node node6 = jsy.a("SFPosition", node5);
                    ljq ljq3 = jsy.w(node6);
                    Node node7 = jsy.a("SFRotation", node5);
                    lgl lgl2 = jsy.E(node7);
                    clq clq2 = new clq(n, ljq3, lgl2);
                    axs2.a(clq2);
                }
                catch (bp bp2) {
                    if ($assertionsDisabled) break block23;
                    throw new AssertionError();
                }
            }
        }
        return axs2;
    }

    private axq b(Node node, boolean bl) {
        Cloneable cloneable;
        Object object;
        axq axq2 = new axq();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oWU);
        if (node2 != null) {
            object = Enum.valueOf(axp.class, node2.getNodeValue());
            if (object != null) {
                axq2.a((axp)((Object)object));
            } else assert (false);
        } else assert (false);
        if ((node2 = namedNodeMap.getNamedItem(oWV)) != null) {
            object = node2.getNodeValue();
            object = ((String)object).toLowerCase();
            axq2.eI((String)object);
            axq2.iy(lea.enW().getType((String)object));
        } else assert (false);
        node2 = namedNodeMap.getNamedItem(oWY);
        if (node2 != null) {
            axq2.eJ(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem(oWX)) != null) {
            boolean bl2 = Boolean.parseBoolean(node2.getNodeValue());
            axq2.ci(bl2);
        } else assert (false);
        Node node3 = jsy.a("SFPosition", node);
        ljq ljq2 = jsy.w(node3);
        axq2.c(ljq2);
        Node node4 = jsy.a("SFRotation", node);
        lgl lgl2 = jsy.E(node4);
        axq2.a(lgl2);
        Node node5 = jsy.a(oXc, node);
        if (node5 != null) {
            cloneable = jsy.D(node5);
            axq2.dr((ldv)cloneable);
        } else if (!bl) {
            // empty if block
        }
        cloneable = lcn.emv();
        Node node6 = jsy.a(oWT, node);
        List<Node> list = jsy.c(oWZ, node6);
        for (Node node7 : list) {
            NamedNodeMap namedNodeMap2 = node7.getAttributes();
            lfs lfs2 = new lfs();
            Node node8 = namedNodeMap2.getNamedItem(oXa);
            if (node8 != null) {
                lfs2.reX = node8.getNodeValue().toLowerCase();
            } else assert (false);
            node8 = namedNodeMap2.getNamedItem(oXb);
            if (node8 != null) {
                lfs2.reY = Integer.valueOf(node8.getNodeValue());
            } else assert (false);
            cloneable.add(lfs2);
        }
        axq2.U((List<lfs<String, Integer>>)((Object)cloneable));
        axq2.EM();
        return axq2;
    }
}

