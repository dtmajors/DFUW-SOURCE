/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jty {
    public static final lju oRy = new lju(0, 1, 0);

    public void tX(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("Emote", node);
            if (list.isEmpty()) {
                return;
            }
            Map<Integer, ldj> map = lea.eoE();
            Map<Integer, ldj> map2 = lea.eoF();
            int n = 1;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                try {
                    ldj ldj2 = this.a(n++, list.get(i2));
                    if (map.containsKey(ldj2.ipt)) {
                        throw new bg("EmoteCommand with commandname '" + ldj2.ipt + "' already exists.");
                    }
                    map.put(ldj2.ipx, ldj2);
                    assert (!map2.containsKey(ldj2.aWe));
                    map2.put(ldj2.aWe, ldj2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of emotenode " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private ldj a(int n, Node node) {
        Node node2 = jsy.d("CommandName", node);
        String string = jsy.i(node2, "Value");
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'CommandName' has invalid value.");
        }
        node2 = jsy.d("AnimationStateName", node);
        String string2 = jsy.i(node2, "Value");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'AnimationStateName' has invalid value.");
        }
        int n2 = lkv.AG((String)string2);
        if (n2 <= 0) {
            throw new bj("AnimationStateName '" + string2 + "' is invalid.");
        }
        node2 = jsy.a("Locked", node);
        boolean bl = node2 != null ? Boolean.parseBoolean(jsy.i(node2, "Value")) : false;
        return new ldj(n, string, n2, bl);
    }
}

