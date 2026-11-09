/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kah
 */
import java.util.HashMap;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jxn {
    private static String vn(String string) {
        String string2 = string;
        int n = string2.lastIndexOf(46);
        if (n < 0) {
            string2 = string2 + ".xml";
        }
        return "xml-files/object/spawntile/" + string2;
    }

    private static boolean vo(String string) {
        int n = lea.enW().getType(string);
        if (lea.eoA().containsKey(n)) {
            return true;
        }
        try {
            kah.vS((String)string);
        }
        catch (bg bg2) {
            lfn.b(5, "SFSpawnTileTemplateParser", "loadResource() WildlifeInfo of resource '" + string + "' could not be loaded.");
            lfn.log("SFSpawnTileTemplateParser", bg2);
            return false;
        }
        return true;
    }

    public static btk vp(String string) {
        lfn.b(5, "SFSpawnTileTemplateParser", string);
        assert (false);
        return null;
    }

    public static btk i(String string, ldv ldv2) {
        if (string == null) {
            return jxn.vp("FileName is null");
        }
        String string2 = jxn.vn(string);
        Document document = jsy.tK(string2);
        if (document == null) {
            return jxn.vp("Cannot load document: " + string2);
        }
        Node node = jsy.a("SFSpawnTile", (Node)document);
        if (node == null) {
            return jxn.vp("Cannot find root node");
        }
        String string3 = jsy.m(jsy.a("SpawnTileName", node));
        if (string3 == null) {
            return jxn.vp("Cannot find spawntile name");
        }
        int n = jsy.r(jsy.a("SpawnTileMaxNum", node));
        if (n == 0) {
            return jxn.vp("Maximum number of spawns missing or zero");
        }
        Node node2 = jsy.a("RespawnIndividualDelay", node);
        if (node2 == null) {
            return jxn.vp("Cannot find respawn delay node");
        }
        Node node3 = jsy.a("SpawnPointRespawnIndividualDelayMin", node2);
        Node node4 = jsy.a("SpawnPointRespawnIndividualDelayMax", node2);
        if (node3 == null || node4 == null) {
            return jxn.vp("Respawn delay node corrupted");
        }
        float f = jsy.o(node3);
        float f2 = jsy.o(node4);
        Node node5 = jsy.a("ResourceSpawnList", node);
        if (node5 == null) {
            return jxn.vp("Cannot find resource spawn list");
        }
        List<Node> list = jsy.c("ResourceSpawn", node5);
        if (list.size() == 0) {
            return jxn.vp("Resource spawn list is empty");
        }
        Node node6 = jsy.a("RadiusAroundBank", node);
        if (node6 == null) {
            return jxn.vp("Radius around bank nodde corrupted");
        }
        float f3 = jsy.o(node6);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Node node7 = list.get(i2);
            Node node8 = jsy.a("SFResourceName", node7);
            Node node9 = jsy.a("SpawnPointResourceSpawnProbability", node7);
            if (node8 == null || node9 == null) {
                return jxn.vp("Resource spawn list is corrupted");
            }
            String string4 = jsy.m(node8);
            int n2 = jsy.r(node9);
            if (!jxn.vo(string4)) {
                return null;
            }
            hashMap.put(string4, new Integer(n2));
        }
        arm arm2 = new arm(string3, hashMap, n, f, f2, f3);
        arm2.setGUID(ldv2);
        return arm2;
    }

    public static float vq(String string) {
        if (string == null) {
            return -1.0f;
        }
        String string2 = jxn.vn(string);
        Document document = jsy.tK(string2);
        if (document == null) {
            return -1.0f;
        }
        Node node = jsy.a("SFSpawnTile", (Node)document);
        if (node == null) {
            return -1.0f;
        }
        float f = jsy.o(jsy.a("RadiusAroundBank", node));
        return f;
    }

    public static int vr(String string) {
        if (string == null) {
            return -1;
        }
        String string2 = jxn.vn(string);
        Document document = jsy.tK(string2);
        if (document == null) {
            return -1;
        }
        Node node = jsy.a("SFSpawnTile", (Node)document);
        if (node == null) {
            return -1;
        }
        int n = jsy.r(jsy.a("SpawnTileMaxNum", node));
        return n;
    }
}

