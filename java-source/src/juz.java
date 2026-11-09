/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class juz {
    private lfn ga = lfn.eqw();

    public void eL(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, new lju(0, 1, 0));
            NodeList nodeList = document.getElementsByTagName("SFXML");
            if (nodeList.getLength() == 0) {
                throw new bn("Node 'SFXML' was not found.");
            }
            Node node = nodeList.item(0);
        }
        catch (bg bg2) {
            throw new bs("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private void al(Node node) {
    }
}

