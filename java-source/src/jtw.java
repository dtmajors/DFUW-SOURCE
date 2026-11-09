/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jtw {
    public static final lju oRy = new lju(0, 1, 0);
    private les DX = lea.enT();

    public void tV(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            this.g(document);
            this.h(document);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private void g(Document document) {
        assert (document != null);
        NodeList nodeList = document.getElementsByTagName("SFEffectMapping");
        if (nodeList.getLength() == 0) {
            return;
        }
        Map map = lea.eoG();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            try {
                Node node = nodeList.item(i2);
                Node node2 = jsy.d("SFEffectName", node);
                String string = jsy.m(node2);
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node 'SFEffectName' has invalid value.");
                }
                int n = this.DX.getType(string);
                if (n <= 0) {
                    throw new bj("EffectName '" + string + "' is invalid.");
                }
                node2 = jsy.d("SFParameterCount", node);
                int n2 = jsy.r(node2);
                if (n2 <= 0) {
                    throw new bj("Node 'SFParameterCount' has invalid value.");
                }
                List<Node> list = jsy.c("SFChatMessage", node);
                if (list.isEmpty()) {
                    throw new bg("No 'SFChatMessage' nodes found for effect '" + this.DX.getName(n) + "'");
                }
                String[] stringArray = new String[list.size()];
                for (int i3 = 0; i3 < list.size(); ++i3) {
                    try {
                        stringArray[i3] = jsy.m(list.get(i3));
                        if (stringArray[i3] != null && !stringArray[i3].trim().equals("")) continue;
                        throw new bg("ChatMessage " + i3 + " has invalid value.");
                    }
                    catch (bg bg2) {
                        throw new bg("Parsing of chatmessage " + i3 + " failed for effect '" + this.DX.getName(n) + "'", bg2);
                    }
                }
                lfd lfd2 = new lfd(stringArray, n2);
                Integer n3 = new Integer(n);
                if (map.containsKey(n3)) {
                    throw new bp("A mapping for effect '" + this.DX.getName(n) + "' already exists in the map.");
                }
                map.put(n3, lfd2);
                continue;
            }
            catch (bg bg3) {
                throw new bg("Parsing of effect " + i2 + " failed.", bg3);
            }
        }
    }

    private void h(Document document) {
        assert (document != null);
        NodeList nodeList = document.getElementsByTagName("SFEventMapping");
        if (nodeList.getLength() == 0) {
            return;
        }
        Map map = lea.eoG();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            try {
                Node node = nodeList.item(i2);
                Node node2 = jsy.d("SFChatEventName", node);
                String string = jsy.m(node2);
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node 'SFChatEventName' has invalid value.");
                }
                aud.b b2 = aud.b.getValue(string);
                if (b2 == null) {
                    throw new bj("NotificationType '" + string + "' is invalid.");
                }
                node2 = jsy.d("SFParameterCount", node);
                int n = jsy.r(node2);
                if (n < 0) {
                    throw new bj("Node 'SFParameterCount' has invalid value.");
                }
                List<Node> list = jsy.c("SFChatMessage", node);
                if (list.isEmpty()) {
                    throw new bg("No 'SFChatMessage' nodes found for chateventtype '" + (Object)((Object)b2) + "'");
                }
                String[] stringArray = new String[list.size()];
                for (int i3 = 0; i3 < list.size(); ++i3) {
                    try {
                        stringArray[i3] = jsy.m(list.get(i3));
                        if (stringArray[i3] != null && !stringArray[i3].trim().equals("")) continue;
                        throw new bg("ChatMessage " + i3 + " has invalid value.");
                    }
                    catch (bg bg2) {
                        throw new bg("Parsing of chatmessage " + i3 + " failed for chateventtype '" + (Object)((Object)b2) + "'", bg2);
                    }
                }
                lfd lfd2 = new lfd(stringArray, n);
                Integer n2 = new Integer(b2.ordinal());
                if (map.containsKey(n2)) {
                    throw new bp("A mapping for chateventtype '" + (Object)((Object)b2) + "' already exists in the map.");
                }
                map.put(n2, lfd2);
                continue;
            }
            catch (bg bg3) {
                throw new bg("Parsing of effect " + i2 + " failed.", bg3);
            }
        }
    }
}

