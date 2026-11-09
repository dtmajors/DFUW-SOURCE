/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbl {
    private static final String pdb = "SFTrackFlagInfo";
    private static final String pdc = "SFTrackFlagExtensionsXMLName";
    private static final String pdd = "SFSpawnSFX";
    public static final lju oRy = new lju(0, 1, 0);

    public void wq(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName(pdb);
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, cog> map = lea.epi();
            cog cog2 = null;
            Object var6_7 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                cog2 = null;
                try {
                    cog2 = this.fa(nodeList.item(i2));
                    if (map.containsKey(cog2.aVb())) {
                        throw new bg("A trackflaginfo with ResourceName='" + cog2.aVc() + "' already exists.");
                    }
                    map.put(cog2.aVb(), cog2);
                    continue;
                }
                catch (bg bg2) {
                    if (cog2 != null) {
                        throw new bg("Parsing of TrackFlagInfo With ResourceName'" + cog2.aVc() + "' failed.", bg2);
                    }
                    throw new bg("Parsing of TrackFlagInfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private cog fa(Node node) {
        Node node2 = jsy.d("SFResourceName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        int n = lea.enW().getType(string);
        if (n < 0) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        node2 = jsy.d(pdc, node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFTrackFlagExtensionsXMLName' has invalid value.");
        }
        node2 = jsy.d(pdd, node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFSpawnSFX' has invalid value.");
        }
        int n2 = del.dr(string3);
        if (n2 < 0) {
            throw new bj("Node 'SFSpawnSFX' has invalid value. Type not existing.");
        }
        cog cog2 = new cog();
        cog2.si(n);
        cog2.hI(string2);
        cog2.sj(n2);
        return cog2;
    }
}

