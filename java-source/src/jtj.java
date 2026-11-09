/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jtj {
    private static jtj oPY = new jtj();
    private boolean oPZ = false;
    private List dqr = lcn.abH(20);

    private jtj() {
    }

    public static jtj dSF() {
        return oPY;
    }

    public boolean dSG() {
        return this.oPZ;
    }

    public List dSH() {
        return this.dqr;
    }

    public void eL(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, new lju(0, 3, 0));
            NodeList nodeList = document.getElementsByTagName("SFMapping");
            if (nodeList.getLength() == 0) {
                throw new bn("Node SFMapping was not found.");
            }
            Node node = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node = nodeList.item(i);
                bkc bkc2 = this.I(node);
                this.dqr.add(bkc2);
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
        this.oPZ = true;
    }

    private bkc I(Node node) {
        assert (node != null) : "MappingNode is null!";
        Node node2 = jsy.d("SFObjectName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFObjectName' has invalid value.");
        }
        int n = amh.dn(string);
        if (n <= 0) {
            throw new bj("ObjectName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFFunctionName", node);
        int n2 = kbi.eN(node2);
        if (n2 <= 0) {
            throw new bj("Node 'SFFunctionName' has invalid value.");
        }
        node2 = jsy.d("SFFunctionObjectName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFFunctionObjectName' has invalid value.");
        }
        bkd.a a2 = bkd.a.getFunctionObjectType(string2);
        if (a2 == null) {
            throw new bj("FunctionObjectName '" + string2 + "' is invalid.");
        }
        node2 = jsy.d("SFReactionFunctionName", node);
        int n3 = kbi.eN(node2);
        if (n3 < 0) {
            throw new bj("Node 'SFReactionFunctionName' has invalid value.");
        }
        bkc bkc2 = new bkc();
        bkc2.ObjectType = n;
        bkc2.bst = n2;
        bkc2.dqv = a2;
        bkc2.dqw = n3;
        return bkc2;
    }
}

