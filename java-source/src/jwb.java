/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jwb
extends jsy {
    public dld uE(String string) {
        lju lju2;
        dld dld2 = null;
        Document document = this.uF(string);
        if (document != null && (lju2 = jsy.c(document)) != null && lju2.getMajor() == 0 && lju2.getMinor() == 1) {
            NodeList nodeList = document.getElementsByTagName("SFCamera");
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                dld2 = this.aK(nodeList.item(i2));
            }
        }
        return dld2;
    }

    public Document uF(String string) {
        Document document = jsy.tK("xml-files/object/specialobject/" + string);
        return document;
    }

    private dld aK(Node node) {
        NodeList nodeList = node.getChildNodes();
        Node node2 = null;
        dld dld2 = new dld();
        ljq ljq2 = null;
        ljq ljq3 = null;
        float f = -1.0f;
        float f2 = -1.0f;
        float f3 = 0.0f;
        int n = 0;
        int n2 = 0;
        boolean bl = false;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("Position")) {
                ljq2 = jsy.w(node2);
            } else if (node2.getNodeName().equals("Rotation")) {
                ljq3 = jsy.w(node2);
            } else if (node2.getNodeName().equals("NearPlane")) {
                f = jsy.o(node2);
            } else if (node2.getNodeName().equals("FarPlane")) {
                f2 = jsy.o(node2);
            } else if (node2.getNodeName().equals("FieldOfView")) {
                f3 = jsy.o(node2);
            }
            if (node2.getNodeName().equals("ViewPortWidth")) {
                n = jsy.r(node2);
                continue;
            }
            if (node2.getNodeName().equals("ViewPortHeight")) {
                n2 = jsy.r(node2);
                continue;
            }
            if (!node2.getNodeName().equals("Active")) continue;
            bl = jsy.t(node2);
        }
        if (n2 != 0 && n != 0 && f3 != 0.0f && f != -1.0f && f2 != -1.0f && ljq2 != null && ljq3 != null) {
            dld2.c(ljq2);
            dld2.d(ljq3);
            dld2.gZ(f);
            dld2.ha(f2);
            dld2.hb(f3);
            dld2.As(n);
            dld2.At(n2);
            dld2.setActive(bl);
        }
        return dld2;
    }
}

