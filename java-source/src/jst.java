/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jst
extends jsy {
    public void c(String string, String string2, Map<String, String> map) {
        Document document = jst.tJ(string);
        if (document == null) {
            throw new Exception("SFXMLFileParser.parseDocument() failed (don't know anything else)");
        }
        lju lju2 = jst.c(document);
        assert (lju2 != null);
        assert (lju2.getMajor() != 0 || lju2.getMinor() > 1);
        NodeList nodeList = document.getElementsByTagName("SFMapping");
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node = jst.a("SFNeutral", nodeList.item(i));
            assert (node != null);
            String string3 = jst.m(node);
            assert (string3 != null);
            Node node2 = jst.a(string2, nodeList.item(i));
            if (node2 == null) continue;
            String string4 = jst.m(node2);
            assert (string4 != null);
            map.put(string3, string4);
        }
    }
}

