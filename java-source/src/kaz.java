/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ep
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kaz {
    public static final lju oRy = new lju(0, 1, 0);
    public static final String pbh = "SFDeployableObjectDefinitions";
    public static final String pbi = "SFDeployableObjectInfo";
    public static final String pbj = "ItemResourceType";
    public static final String oYw = "ResourceType";
    public static final String pbk = "MaxNumPrPlayer";
    public static final String pbl = "Global";
    public static final String pbm = "MaxPerTile";
    public static final String pbn = "MinDist";
    public static final String pbo = "MinAcess";
    public static final String pbp = "TTL";
    public static final String pbq = "AnnotationResourceType";
    public static final String pbr = "AnnotationText";
    public static final String pbs = "RemovalSFX";
    public static final String pbt = "FullSFX";
    public static final String VALUE = "Value";
    public static final String pbu = "HitPoints";
    public static final String pbv = "LootingList";
    public static final String pbw = "RefillRate";
    public static final String pbx = "AttributesMaxBonus";
    public static final String pby = "AttributesBonus";
    public static final String oAf = "Duration";
    public static final String oJW = "CoolDown";
    public static final String oGB = "Attribute";
    public static final String NAME = "Name";
    public static final String pbz = "Explode";
    public static final String oYk = "Magnitude";
    public static final String pbA = "Force";
    public static final String oYl = "Radius";

    public void wa(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName(pbi);
            if (nodeList.getLength() == 0) {
                return;
            }
            ti ti2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                ti2 = this.eB(nodeList.item(i2));
                if (lea.eol().containsKey(ti2.uw())) {
                    throw new bg("A ItemResourceType already exists with ResourceName='" + lea.enW().getName(ti2.uw()));
                }
                if (lea.eom().containsKey(ti2.az())) {
                    throw new bg("A Resource already exists with ResourceName='" + lea.enW().getName(ti2.az()));
                }
                lea.eol().put(ti2.uw(), ti2);
                lea.eom().put(ti2.az(), ti2);
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private ti eB(Node node) {
        Node node2;
        float f2;
        int n;
        Object object;
        Node node3;
        Object object2;
        Map<Integer, Float> map;
        Object object3;
        int n2;
        Node node4;
        Object object4;
        int n3;
        Object object5;
        Node node5;
        Object object6;
        Object object7;
        ti ti2 = new ti();
        Node node6 = jsy.d(pbj, node);
        String string = jsy.i(node6, VALUE);
        int n4 = lea.enW().getType(string);
        assert (n4 != -1) : "ItemResourceName : " + string;
        ti2.da(n4);
        Node node7 = jsy.d(oYw, node);
        String string2 = jsy.i(node7, VALUE);
        int n5 = lea.enW().getType(string2);
        assert (n5 != -1) : "ResourceName : " + string2;
        ti2.l(n5);
        Node node8 = jsy.a(pbq, node);
        if (node8 != null) {
            object7 = jsy.i(node8, VALUE);
            int n6 = lea.enW().getType((String)object7);
            assert (n6 != -1) : "AnnotationResourceTypeName : " + (String)object7;
            ti2.dd(n6);
            Node node9 = jsy.d(pbr, node);
            object6 = jsy.i(node9, VALUE);
            ti2.cf((String)(object6 != null ? object6 : cug.uG((int)ti2.az())));
        }
        if ((object7 = jsy.a(pbs, node)) != null) {
            String string3 = jsy.i((Node)object7, VALUE);
            int n7 = del.dr(string3);
            assert (n7 > 0) : "RemovalSFX : " + string3;
            ti2.de(n7);
        }
        Node node10 = jsy.d(pbk, node);
        int n8 = Integer.parseInt(jsy.i(node10, VALUE));
        ti2.db(n8);
        object6 = jsy.d(pbm, node);
        int n9 = Integer.parseInt(jsy.i((Node)object6, VALUE));
        ti2.dc(n9);
        Node node11 = jsy.d(pbm, node);
        float f3 = Float.parseFloat(jsy.i(node11, VALUE));
        ti2.setMinDistance(f3);
        Node node12 = jsy.d(pbp, node);
        float f4 = Float.parseFloat(jsy.i(node12, VALUE));
        ti2.M(f4);
        Node node13 = jsy.d(pbl, node);
        boolean bl = Boolean.parseBoolean(jsy.i(node13, VALUE));
        ti2.ap(bl);
        Node node14 = jsy.d(pbo, node);
        hc hc2 = hc.getAccessLevelType(jsy.i(node14, VALUE));
        ti2.e(hc2);
        Node node15 = jsy.a(pbu, node);
        if (node15 != null) {
            int n10 = Integer.parseInt(jsy.i(node15, VALUE));
            ti2.df(n10);
        }
        if ((node5 = jsy.a(pbt, node)) != null) {
            object5 = jsy.i(node5, VALUE);
            n3 = del.dr((String)object5);
            assert (n3 > 0) : "FullSFX : " + (String)object5;
            ti2.dg(n3);
        }
        if ((object5 = jsy.a(pbv, node)) != null) {
            n3 = Integer.parseInt(jsy.i((Node)object5, pbw));
            ti2.dh(n3);
            object4 = this.cU((Node)object5);
            ti2.G((List)object4);
        }
        if ((node4 = jsy.a(pbx, node)) != null) {
            int n11 = Integer.parseInt(jsy.i(node4, oAf));
            n2 = Integer.parseInt(jsy.i(node4, oJW));
            object3 = jsy.c(oGB, node4);
            assert (object3 != null && !object3.isEmpty());
            map = lcn.emw();
            object2 = object3.iterator();
            while (object2.hasNext()) {
                node3 = (Node)object2.next();
                object = jsy.i(node3, NAME);
                n = ep.as((String)object);
                assert (n != -1);
                f2 = Float.parseFloat(jsy.i(node3, VALUE));
                map.put(n, Float.valueOf(f2));
            }
            ti2.p(n11);
            ti2.q(n2);
            ti2.n(map);
        }
        if ((object4 = jsy.a(pby, node)) != null) {
            n2 = Integer.parseInt(jsy.i((Node)object4, oJW));
            object3 = jsy.c(oGB, (Node)object4);
            assert (object3 != null && !object3.isEmpty());
            map = lcn.emw();
            object2 = object3.iterator();
            while (object2.hasNext()) {
                node3 = (Node)object2.next();
                object = jsy.i(node3, NAME);
                n = ep.as((String)object);
                assert (n != -1);
                f2 = Float.parseFloat(jsy.i(node3, VALUE));
                map.put(n, Float.valueOf(f2));
            }
            ti2.r(n2);
            ti2.o(map);
        }
        if ((node2 = jsy.a(pbz, node)) != null) {
            object3 = jsy.d(oYk, node2);
            float f5 = Float.parseFloat(jsy.i((Node)object3, VALUE));
            object2 = jsy.d(oYl, node2);
            float f6 = Float.parseFloat(jsy.i((Node)object2, VALUE));
            object = jsy.a(pbA, node2);
            float f7 = Float.parseFloat(jsy.i((Node)object, VALUE));
            ti2.N(f5);
            ti2.setRadius(f6);
            ti2.O(f7);
        }
        return ti2;
    }

    protected final List cU(Node node) {
        Object object;
        int n;
        int n2;
        ArrayList<Object> arrayList = lcn.abH(2);
        List<Node> list = jsy.c("SFItem", node);
        if (!list.isEmpty()) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                try {
                    object = this.f(list.get(n), false);
                    arrayList.add(object);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of item " + n + " failed.", bg2);
                }
            }
        }
        if (!(list = jsy.c("SFRandomItem", node)).isEmpty()) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                try {
                    object = this.r(list.get(n), node.getNodeName());
                    float f2 = 0.0f;
                    int n3 = object.size();
                    for (int i2 = 0; i2 < n3; ++i2) {
                        cto cto2 = (cto)object.get(i2);
                        f2 += cto2.Probability;
                    }
                    if ((double)f2 <= 0.0 || (double)f2 > 1.0000049999998737) {
                        throw new bg("ProbabilitySum is invalid: " + f2);
                    }
                    if (f2 < 1.0f) {
                        // empty if block
                    }
                    arrayList.add(object);
                    continue;
                }
                catch (bg bg3) {
                    throw new bg("Parsing of randomitem " + n + " failed.", bg3);
                }
            }
        }
        return arrayList;
    }

    protected cto f(Node node, boolean bl) {
        List<Node> list;
        int n;
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n2 = lea.enW().getType(string);
        if (n2 <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        cto cto2 = new cto();
        cto2.ResourceType = n2;
        if (jsy.g(node, "Droppable")) {
            cto2.fez = n = jsy.f(node, "Droppable");
        }
        if (jsy.g(node, "Quantity")) {
            n = jsy.d(node, "Quantity");
            if (n < 1) {
                throw new bj("Attribute 'Quantity' for resource '" + string + "' has invalid value.");
            }
            cto2.asi = n;
        } else if (jsy.g(node, "MaxQuantity")) {
            n = jsy.d(node, "MaxQuantity");
            if (n <= 0) {
                throw new bj("Attribute 'MaxQuantity' for resource '" + string + "' has invalid value.");
            }
            int n3 = jsy.d(node, "MinQuantity");
            if (n3 < 0) {
                throw new bj("Attribute 'MinQuantity' for resource '" + string + "' has invalid value.");
            }
            if (n3 > n) {
                throw new bj("MinQuantity > MaxQuantity.");
            }
            cto2.dpT = n;
            cto2.dpS = n3;
        }
        if (!bl && jsy.g(node, "Probability")) {
            float f2 = jsy.e(node, "Probability");
            if (f2 <= 0.0f || f2 > 1.0f) {
                throw new bj("Attribute 'Probability' for resource '" + string + "' has invalid value.");
            }
            cto2.Probability = f2;
        }
        if (jsy.g(node, "BuildType")) {
            int n4;
            cto2.bcB = n4 = jsy.d(node, "BuildType");
        }
        if (!(list = jsy.c("SFItem", node)).isEmpty()) {
            cto[] ctoArray = new cto[list.size()];
            int n5 = list.size();
            for (int i2 = 0; i2 < n5; ++i2) {
                try {
                    ctoArray[i2] = this.f(list.get(i2), true);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of item " + i2 + " for resource '" + string + "' failed.", bg2);
                }
            }
            cto2.fgf = ctoArray;
        }
        return cto2;
    }

    private List r(Node node, String string) {
        ArrayList<cto> arrayList = lcn.abH(2);
        List<Node> list = jsy.c("SFItem", node);
        if (!list.isEmpty()) {
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    cto cto2 = this.f(list.get(i2), false);
                    arrayList.add(cto2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of randomitem " + i2 + " failed.", bg2);
                }
            }
        }
        Collections.sort(arrayList, new ctp());
        return arrayList;
    }
}

