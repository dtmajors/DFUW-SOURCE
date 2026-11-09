/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jwt {
    public static final String oWL = "GUI_Colors";
    lju fzk = new lju(0, 1);

    public void dTX() {
        String string = "xml-files/client/gui/gui_colors.xml";
        if (!jry.tj(string)) {
            return;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return;
        }
        this.h(document, jry.tn(string));
    }

    private void h(Document document, String string) {
        ArrayList arrayList = lcn.emv();
        Node node = jsy.a(oWL, (Node)document);
        if (node == null) {
            assert (false);
            return;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            return;
        }
        Node node2 = jsy.a("COLOR_TEXT_HEADERS", node);
        if (node2 != null) {
            hlu.kEL = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("COLOR_TEXT_DESCRIPTIONS", node);
        if (node2 != null) {
            hlu.kEM = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("COLOR_TEXT_DEFAULT", node);
        if (node2 != null) {
            hlu.kEN = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("TOOLTIP_COLOR_DEBUG", node);
        if (node2 != null) {
            hlu.kEZ = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("TOOLTIP_COLOR_DESCRIPTION", node);
        if (node2 != null) {
            hlu.kFa = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("TOOLTIP_COLOR_HEAVY", node);
        if (node2 != null) {
            hlu.kFb = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("TOOLTIP_COLOR_NORMAL", node);
        if (node2 != null) {
            hlu.kFc = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("TOOLTIP_COLOR_MEDIUM", node);
        if (node2 != null) {
            hlu.kFd = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("TOOLTIP_COLOR_RED", node);
        if (node2 != null) {
            hlu.kFe = this.bh(node2);
        } else assert (false);
        node2 = jsy.a("COLOR_TEXT_WINDOW_TITLE_FOCUSED", node);
        if (node2 != null) {
            hlu.kEK = this.bh(node2);
        } else assert (false);
    }

    private lcq bh(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                node2 = nodeList.item(i2);
                if (!node2.getNodeName().equals("SFColor")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("R");
                int n2 = Integer.parseInt(node.getNodeValue());
                node = namedNodeMap.getNamedItem("G");
                int n3 = Integer.parseInt(node.getNodeValue());
                node = namedNodeMap.getNamedItem("B");
                int n4 = Integer.parseInt(node.getNodeValue());
                return new lcq(new Color(n2, n3, n4));
            }
        }
        return null;
    }
}

