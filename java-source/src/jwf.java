/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jwf {
    private lju fzk = new lju(0, 1);
    private String lEw = "feature_european/";

    public jwf(String string) {
        this.lEw = string;
    }

    public Map<String, cp> cMr() {
        String string = "xml-files/client/cc_config/" + (lcw.qOR ? "cc_setup_new.xml" : "cc_setup.xml");
        Document document = null;
        Map<String, cp> map = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            assert (false);
            return null;
        }
        try {
            map = this.a(document, jry.tn(string));
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
        return map;
    }

    private Map<String, cp> a(Document document, String string) {
        jwd jwd2 = new jwd(this.lEw);
        jwg jwg2 = new jwg();
        assert (document != null);
        Map<String, cp> map = lcn.emw();
        Node node = jsy.a("CharacterCreatorSetup", (Node)document);
        if (node == null) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Vrong Version [" + lju2 + "]. Supported Version = " + this.fzk);
        }
        String string2 = "Race";
        List<Node> list = jsy.c(string2, node);
        if (list == null || list.isEmpty()) {
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        for (Node node2 : list) {
            string2 = "Type";
            Node node3 = node2.getAttributes().getNamedItem(string2);
            if (node3 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            String string3 = node3.getNodeValue();
            string2 = "Title";
            Node node4 = node2.getAttributes().getNamedItem(string2);
            if (node4 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            String string4 = node4.getNodeValue();
            cp cp2 = new cp();
            cp2.K(string3);
            cp2.L(string4);
            string2 = "StartingVillageConfig";
            Node node5 = jsy.a(string2, node2);
            if (node5 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            cz cz2 = this.f(node5);
            assert (cz2 != null);
            cp2.a(cz2);
            string2 = "Description";
            Node node6 = jsy.a(string2, node2);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            string2 = "Text";
            if ((node6 = node6.getAttributes().getNamedItem(string2)) == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            cp2.setDescription(node6.getNodeValue());
            assert (cp2.getDescription() != null);
            string2 = "FactionDescription";
            node6 = jsy.a(string2, node2);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            string2 = "Text";
            if ((node6 = node6.getAttributes().getNamedItem(string2)) == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            cp2.M(node6.getNodeValue());
            assert (cp2.bP() != null);
            string2 = "EnvConfig";
            node6 = jsy.a(string2, node2);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            Object object = jsy.m(node6);
            Object object2 = new ber();
            Map<String, List<String>> map2 = "xml-files/object/environment/" + (String)object;
            jwo jwo2 = new jwo();
            jwo2.a((String)((Object)map2), (ber)object2);
            if (((ber)object2).anm() == 0) {
                lfn.b(4, this.getClass().getSimpleName(), "handeSetEnvironment() : EnvironmentFile not found: " + (String)((Object)map2));
                assert (false) : "Environment does not exist";
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            cp2.a((ber)object2);
            string2 = "CamPosRace";
            node6 = jsy.a(string2, node2);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object = jsy.w(jsy.a("Position", node6));
            object2 = jsy.w(jsy.a("Rotation", node6));
            cp2.i((ljq)object);
            cp2.n((ljq)object2);
            string2 = "Female";
            object = jsy.a(string2, node2);
            if (object == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            string2 = "MeshPosition";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.w(jsy.a("Position", node6));
            map2 = jsy.w(jsy.a("Rotation", node6));
            cp2.o((ljq)object2);
            cp2.r((ljq)((Object)map2));
            string2 = "CamPosCloseup";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.w(jsy.a("Position", node6));
            map2 = jsy.w(jsy.a("Rotation", node6));
            cp2.e((ljq)object2);
            cp2.j((ljq)((Object)map2));
            string2 = "CamPosCloseupFace";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.w(jsy.a("Position", node6));
            map2 = jsy.w(jsy.a("Rotation", node6));
            cp2.f((ljq)object2);
            cp2.k((ljq)((Object)map2));
            string2 = "FeatureSetConfig";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.m(node6);
            map2 = null;
            try {
                map2 = jwd2.uH((String)object2);
            }
            catch (bo bo2) {
                bo2.printStackTrace();
            }
            cp2.d(map2);
            string2 = "SkillSetConfig";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.m(node6);
            try {
                jwg2.eL((String)object2);
                cp2.i(jwg2.dUb());
                cp2.m(jwg2.dUc());
                cp2.k(jwg2.dUa());
                cp2.C(jwg2.dUe());
                cp2.E(jwg2.dUf());
                cp2.A(jwg2.dUd());
            }
            catch (bo bo3) {
                bo3.printStackTrace();
            }
            string2 = "Male";
            object = jsy.a(string2, node2);
            if (object == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            string2 = "MeshPosition";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.w(jsy.a("Position", node6));
            map2 = jsy.w(jsy.a("Rotation", node6));
            cp2.q((ljq)object2);
            cp2.p((ljq)((Object)map2));
            string2 = "CamPosCloseup";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.w(jsy.a("Position", node6));
            map2 = jsy.w(jsy.a("Rotation", node6));
            cp2.g((ljq)object2);
            cp2.l((ljq)((Object)map2));
            string2 = "CamPosCloseupFace";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.w(jsy.a("Position", node6));
            map2 = jsy.w(jsy.a("Rotation", node6));
            cp2.h((ljq)object2);
            cp2.m((ljq)((Object)map2));
            string2 = "FeatureSetConfig";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.m(node6);
            map2 = null;
            try {
                map2 = jwd2.uH((String)object2);
            }
            catch (bo bo4) {
                bo4.printStackTrace();
            }
            cp2.c(map2);
            string2 = "SkillSetConfig";
            node6 = jsy.a(string2, (Node)object);
            if (node6 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object2 = jsy.m(node6);
            try {
                jwg2.eL((String)object2);
                cp2.j(jwg2.dUb());
                cp2.n(jwg2.dUc());
                cp2.l(jwg2.dUa());
                cp2.D(jwg2.dUe());
                cp2.F(jwg2.dUf());
                cp2.B(jwg2.dUd());
            }
            catch (bo bo5) {
                bo5.printStackTrace();
            }
            map.put(string3, cp2);
        }
        return map;
    }

    private cz f(Node node) {
        String string = "texture";
        Node node2 = node.getAttributes().getNamedItem(string);
        if (node2 == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        String string2 = node2.getNodeValue();
        string = "StartingVillage";
        List<Node> list = jsy.c(string, node);
        if (list == null || list.isEmpty()) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        ch[] chArray = new ch[list.size()];
        for (Node object2 : list) {
            string = "index";
            node2 = object2.getAttributes().getNamedItem(string);
            if (node2 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            Integer n = Integer.valueOf(node2.getNodeValue());
            assert (n >= 0 && n < chArray.length) : "Index [" + n + "] is invalid!";
            string = "x";
            node2 = object2.getAttributes().getNamedItem(string);
            if (node2 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            Integer n2 = Integer.valueOf(node2.getNodeValue());
            string = "y";
            node2 = object2.getAttributes().getNamedItem(string);
            if (node2 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            Integer n3 = Integer.valueOf(node2.getNodeValue());
            string = "bindstone_name";
            node2 = object2.getAttributes().getNamedItem(string);
            if (node2 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            String string3 = node2.getNodeValue();
            string = "location_name";
            node2 = object2.getAttributes().getNamedItem(string);
            if (node2 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            String string4 = node2.getNodeValue();
            string = "texture";
            node2 = object2.getAttributes().getNamedItem(string);
            if (node2 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            String string5 = node2.getNodeValue();
            ch ch2 = new ch();
            ch2.c(new lgg(n2, n3));
            ch2.D(string3);
            ch2.F(string4);
            ch2.E(string5);
            ch ch3 = chArray[n];
            assert (ch3 == null) : "Object already at index [" + n + "] = " + ch3;
            chArray[n.intValue()] = ch2;
        }
        List<ch> list2 = Arrays.asList(chArray);
        cz cz2 = new cz(list2, string2);
        return cz2;
    }
}

