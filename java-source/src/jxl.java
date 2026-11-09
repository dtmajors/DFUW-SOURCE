/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  kah
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jxl {
    private final String oZm = "xml-files/object/spawnpoint/";
    private final String oZn = "xml-files/object/spawntile/";

    public ldv vi(String string) {
        Node node = this.vm(string);
        if (node == null) {
            return null;
        }
        Node node2 = jsy.a("Guid", node);
        if (node2 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() GUID Missing.Corrupted " + string);
            return null;
        }
        return jsy.D(node2);
    }

    public String vj(String string) {
        Node node = this.vm(string);
        if (node == null) {
            return null;
        }
        Node node2 = jsy.a("SpawnPointName", node);
        if (node2 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() Name Missing.Corrupted " + string);
            return null;
        }
        return jsy.c(node2, "Value");
    }

    public ari vk(String string) {
        Node node = this.vm(string);
        if (node == null) {
            return null;
        }
        ari ari2 = new ari();
        try {
            this.a(ari2, node);
        }
        catch (bp bp2) {
            bp2.printStackTrace();
            return null;
        }
        return ari2;
    }

    private ari a(ari ari2, Node node) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Node node2 = jsy.a("SpawnPointName", node);
        assert (node2 != null);
        ari2.setName(jsy.c(node2, "Value"));
        node2 = jsy.a("Radius", node);
        assert (node2 != null);
        ari2.setRadius(jsy.e(node2, "Value"));
        node2 = jsy.a("EnableSpawnFrenzy", node);
        if (node2 != null) {
            ari2.bM(jsy.f(node2, "Value"));
        }
        if ((node2 = jsy.a("SummoningRitual", node)) != null) {
            ari2.bK(jsy.f(node2, "Value"));
        }
        if ((node2 = jsy.a("Event", node)) != null) {
            ari2.bL(jsy.f(node2, "Value"));
        }
        if ((node2 = jsy.a("SpawnPointBossMob", node)) != null) {
            object5 = null;
            try {
                object5 = jsy.c(node2, "ResourceName").toLowerCase();
            }
            catch (bp bp2) {
                lfn.b(5, "SFSpawnPointTemplateParser", "getAttributes: While parsing spawnpoint " + ari2.getName() + ": " + bp2.getMessage());
                throw bp2;
            }
            ari2.dR((String)object5);
            this.vl((String)object5);
            ari2.bK(jsy.e(node2, "MinSpawnTime"));
            ari2.bJ(jsy.e(node2, "MaxSpawnTime"));
            object4 = jsy.c(node2, "SpawnCondition");
            if ("".equalsIgnoreCase((String)object4)) {
                ari2.e(arb.bNX.toString(), 0);
            } else {
                int n = 0;
                try {
                    object3 = jsy.c(node2, "SpawnConditionValue");
                    object2 = arb.getValue((String)object4);
                    switch (1.bOf[((Enum)object2).ordinal()]) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            n = Integer.parseInt((String)object3);
                            break;
                        }
                        case 3: {
                            n = lea.enW().getType((String)object3);
                            if (n >= 0) break;
                            throw new Exception("Resource value is invalid!");
                        }
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    throw new bp("Problems with SpawnConditionValue : " + exception.getMessage());
                }
                ari2.e((String)object4, n);
            }
            object = jsy.a("SpawnPosition", node2);
            if (object != null) {
                object3 = jsy.w((Node)object);
                ari2.ay((ljq)object3);
            }
            if ((object3 = jsy.a("SpawnRotation", node2)) != null) {
                try {
                    object2 = new ldq(jsy.o((Node)object3));
                }
                catch (NumberFormatException numberFormatException) {
                    arw.ct.error("bad format Boss rotation");
                    object2 = new ldq();
                }
                ari2.a((ldq)object2);
            }
        }
        node2 = jsy.a("SpawnPointMOBSNumber", node);
        assert (node2 != null);
        ari2.hz(jsy.d(node2, "Value"));
        node2 = jsy.a("ResourceSpawnList", node);
        assert (node2 != null);
        object5 = jsy.c("ResourceSpawn", node2);
        object4 = lcn.emw();
        object = object5.iterator();
        while (object.hasNext()) {
            object3 = (Node)object.next();
            object2 = jsy.c((Node)object3, "ResourceName").toLowerCase();
            int n = jsy.d((Node)object3, "Probability");
            object4.put(object2, new Integer(n));
            this.vl((String)object2);
        }
        ari2.r((Map)object4);
        node2 = jsy.a("RespawnDelay", node);
        assert (node2 != null);
        ari2.bI(jsy.e(node2, "MinSpawnTime"));
        ari2.bH(jsy.e(node2, "MaxSpawnTime"));
        node2 = jsy.a("SFNavMesh", node);
        assert (node2 != null);
        ari2.dQ(jsy.c(node2, "Name"));
        ari2.a(ash.c.getType(jsy.c(node2, "Type")));
        return null;
    }

    private void vl(String string) {
        if (!lea.eoz().containsKey(lea.enW().getType(string))) {
            try {
                kah.vl((String)string);
            }
            catch (bg bg2) {
                lfn.log(this.getClass().getName(), bg2);
            }
        }
    }

    private ari b(ari ari2, Node node) {
        Node node2;
        Node node3;
        Node node4 = jsy.a("SpawnPointName", node);
        if (node4 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() Name Missing.Corrupted " + ari2);
            return null;
        }
        ari2.setName(jsy.m(node4));
        Node node5 = jsy.a("Radius", node);
        if (node5 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() Radius Missing.Corrupted " + ari2);
            return null;
        }
        ari2.setRadius(jsy.o(node5));
        Node node6 = jsy.a("RespawnIndividualDelay", node);
        if (node6 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() RESPAWN_INDIVIDUAL_DELAY Missing.Corrupted " + ari2);
            return null;
        }
        Node node7 = jsy.a("SpawnPointRespawnIndividualDelayMin", node6);
        if (node7 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() RESPAWN_INDIVIDUAL_DELAY_MIN Missing.Corrupted " + ari2);
            return null;
        }
        Node node8 = jsy.a("SpawnPointRespawnIndividualDelayMax", node6);
        if (node8 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() RESPAWN_INDIVIDUAL_DELAY_MAX Missing.Corrupted " + ari2);
            return null;
        }
        float f = jsy.o(node7);
        float f2 = jsy.o(node8);
        ari2.bI(f);
        ari2.bH(f2);
        Node node9 = jsy.a("SpawnPointMOBSNumber", node);
        if (node9 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() SPAWNPOINT_MOBS_NUMBER Missing.Corrupted " + ari2);
            return null;
        }
        Node node10 = jsy.a("SpawnPointMOBSNumberMax", node9);
        if (node10 == null) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() SPAWNPOINT_MOBS_MAX Missing.Corrupted " + ari2);
            return null;
        }
        int n = jsy.r(node10);
        ari2.hz(n);
        Node node11 = jsy.a("SpawnPointRevengeMemory", node);
        Node node12 = jsy.a("ResourceSpawnList", node);
        List<Node> list = jsy.c("ResourceSpawn", node12);
        if (list.size() == 0) {
            assert (false);
            lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() Spawn List Corrupted.");
            return null;
        }
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            node3 = list.get(i2);
            node2 = jsy.a("SFResourceName", node3);
            Node node13 = jsy.a("SpawnPointResourceSpawnProbability", node3);
            if (node12 == null || node3 == null || node2 == null || node13 == null) {
                assert (false);
                lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() Spawn List Corrupted.");
                return null;
            }
            String string = jsy.m(node2);
            int n2 = jsy.r(node13);
            int n3 = lea.enW().getType(string);
            if (!lea.eoz().containsKey(n3)) {
                try {
                    kah.vl((String)string);
                }
                catch (bg bg2) {
                    lfn.b(5, "SFSpawnPointTemplateParser", "getCommonAttributes() MonsterInfo of resource '" + string + "' could not be loaded.");
                    lfn.log("SFSpawnPointTemplateParser", bg2);
                }
            }
            hashMap.put(string, new Integer(n2));
        }
        ari2.r(hashMap);
        Node node14 = jsy.a("SFNavMesh", node);
        node3 = jsy.a("SpawnPointNavMeshName", node14);
        node2 = jsy.a("SpawnPointNavMeshType", node14);
        ari2.dQ(jsy.m(node3));
        ari2.a(ash.c.getType(jsy.m(node2)));
        return ari2;
    }

    private Node vm(String string) {
        Document document;
        String string2 = string;
        int n = string.lastIndexOf(46);
        if (n < 0) {
            string2 = string2 + ".xml";
        }
        if ((document = jsy.tK("xml-files/object/spawnpoint/" + string2)) == null) {
            document = jsy.tK("xml-files/object/spawntile/" + string2);
        }
        if (document == null) {
            return null;
        }
        Node node = jsy.a("SFSpawnPoint", (Node)document);
        return node;
    }
}

