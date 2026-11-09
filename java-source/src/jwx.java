/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jwx {
    public btl uW(String string) {
        btl btl2 = new btl();
        Document document = jsy.tK("xml-files/object/logicobject/" + string);
        if (document != null) {
            lju lju2 = jsy.c(document);
            NodeList nodeList = document.getElementsByTagName("SFLogicObject");
            if ((nodeList == null || nodeList.getLength() == 1) && lju2 != null && lju2.getMajor() == 0 && lju2.getMinor() == 1) {
                String string2 = this.j(document);
                btl2.gm(string2);
                btl2.setObjectDescriptionFilename(string);
            }
        }
        return btl2;
    }

    private String j(Document document) {
        boolean bl = false;
        String string = null;
        NodeList nodeList = document.getElementsByTagName("LogicObjectClassName");
        Node node = null;
        if (nodeList.getLength() > 0) {
            node = nodeList.item(0);
            string = jsy.m(node);
        }
        return string;
    }
}

