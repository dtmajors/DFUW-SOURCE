/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  lcw
 */
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbw
extends jzm {
    public static final String pdO = "SpecialEffectFiles";
    public static final String pdP = "SFX";
    public static final String pdQ = "Filename";
    public static final lju oRy = new lju(0, 1, 0);
    private final dhj pdR = new dhj();
    private final Map pdS = lea.eoo();
    private final List<Integer> pdT = lcn.emv();

    public void dVe() {
        String string;
        Object object;
        Object object2;
        Document document = null;
        String string2 = "xml-files/common/specialeffect/specialeffects_for_objects_index.xml";
        try {
            document = jsy.tJ(string2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getSimpleName(), "parseAllEffects() : Error Parsing SFX Index file! -> " + bo2);
            return;
        }
        if (document == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseAllEffects() : Error Parsing SFX Index file. Document is null!");
            return;
        }
        Node node = jsy.a(pdO, (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "parseAllEffects() : SFFile [" + string2 + "] is invalid!");
            assert (false);
            return;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(oRy)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            return;
        }
        List<Node> list = jsy.c(pdP, node);
        ArrayList<String> arrayList = lcn.emv();
        for (Node object32 : list) {
            object2 = object32.getAttributes();
            object = object2.getNamedItem(pdQ);
            if (object != null) {
                string = object.getNodeValue();
                arrayList.add(string);
                continue;
            }
            assert (false) : "AttribNode is null";
        }
        Object object4 = "xml-files/common/specialeffect/specialeffects.xml";
        String string3 = "xml-files/common/specialeffect/specialeffects_1air_arc_em_fm_gm.xml";
        object2 = "xml-files/common/specialeffect/specialeffects_2lm_nm_sc_wat_wc.xml";
        object = "xml-files/common/specialeffect/specialeffects_magic.xml";
        string = "xml-files/common/specialeffect/specialeffects_larin.xml";
        kbw kbw2 = new kbw();
        if (lcw.enb()) {
            kbw2.j((String)object4, lea.bkO());
            kbw2.a(string3, lea.bkO(), false, false);
            kbw2.a((String)object2, lea.bkO(), false, false);
            kbw2.a((String)object, lea.bkO(), false, false);
            kbw2.a(string, lea.bkO(), false, false);
            lea.eoc().clear();
            kbw2.k((String)object4, lea.eod());
            kbw2.k(string3, lea.eod());
            kbw2.k((String)object2, lea.eod());
            kbw2.k((String)object, lea.eod());
            kbw2.k(string, lea.eod());
            for (String string4 : arrayList) {
                object4 = "xml-files/common/specialeffect/effects_for_objects/" + string4;
                kbw2.a((String)object4, lea.bkO(), false, true);
            }
        } else if (lcw.enf()) {
            kbw2.k((String)object4, lea.eod());
            kbw2.k(string3, lea.eod());
            kbw2.k((String)object2, lea.eod());
            kbw2.k((String)object, lea.eod());
            kbw2.k(string, lea.eod());
        } else {
            kbw2.j((String)object4, lea.bkO());
            kbw2.a(string3, lea.bkO(), false, false);
            kbw2.a((String)object2, lea.bkO(), false, false);
            kbw2.a((String)object, lea.bkO(), false, false);
            kbw2.a(string, lea.bkO(), false, false);
            for (String string4 : arrayList) {
                object4 = "xml-files/common/specialeffect/effects_for_objects/" + string4;
                kbw2.a((String)object4, lea.bkO(), false, true);
            }
        }
        del.anZ();
    }

    private void dVf() {
        assert (false);
        String string = "xml-files/common/specialeffect/specialeffects_worldbuilder.xml";
        lfn.b(0, this.getClass().getSimpleName(), "parseAllEffects() : File = " + string);
        kbw kbw2 = new kbw();
        kbw2.a(string, lea.bkO(), false, true);
        String string2 = "^se_animaudio:.*:[0-9]{2}$";
        Map<Integer, dgj> map = lea.bkO();
        HashSet<String> hashSet = new HashSet<String>();
        for (dgj object : map.values()) {
            String string3 = object.getSpecialEffectName();
            if (string3 == null || !Pattern.matches(string2, string3)) continue;
            lfn.b(0, this.getClass().getSimpleName(), "filterForAudioEffects() : Found an AudioEffect: " + string3);
            StringTokenizer stringTokenizer = new StringTokenizer(string3, ":");
            stringTokenizer.nextToken();
            String string4 = stringTokenizer.nextToken();
            lfn.b(0, this.getClass().getSimpleName(), "TEST_Split_Files() : AnimNamew = " + string4);
            hashSet.add(string4);
        }
        lfn.b(0, this.getClass().getSimpleName(), "TEST_Split_Files() : Done. This many Different Files: " + hashSet.size());
        for (String string5 : hashSet) {
            this.wv(string5);
        }
    }

    public void j(String string, Map<Integer, dgj> map) {
        this.a(string, map, true, false);
    }

    public void a(String string, Map<Integer, dgj> map, boolean bl, boolean bl2) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        if (map == null) {
            throw new bi("SpecialEffectMap is null.");
        }
        Document document = null;
        document = jsy.tJ(string);
        jsy.a(document, oRy);
        NodeList nodeList = document.getElementsByTagName("SFXML");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SFXML' node found.");
        }
        if (bl) {
            map.clear();
            lea.eoc().clear();
        }
        try {
            List<Node> list = jsy.c("SFSpecialEffect", nodeList.item(0));
            if (list.isEmpty()) {
                lfn.b(2, "SFSpecialEffectParser", "parseSpecialEffects() No 'SFSpecialEffect' nodes found.");
                return;
            }
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                Node node = list.get(i2);
                String string2 = null;
                try {
                    Node node2 = jsy.d("SFClassName", node);
                    String string3 = jsy.m(node2);
                    if (string3 == null || string3.trim().equals("")) {
                        throw new bj("Node 'SFClassName' has invalid value.");
                    }
                    int n2 = del.iF(string3);
                    if (n2 <= 0) {
                        throw new bj("EffectClassName '" + string3 + "' is invalid.");
                    }
                    node2 = jsy.d("SFName", node);
                    string2 = jsy.m(node2);
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Node 'SFName' has invalid value.");
                    }
                    int n3 = this.Q(string2, bl2);
                    Integer n4 = new Integer(n3);
                    this.d(n3, string2, bl2);
                    if (map.containsKey(n4) && !bl2) {
                        throw new bg("SpecialEffect '" + string2 + "' has already been added to the map.");
                    }
                    dgj dgj2 = this.c(n2, node);
                    dgj2.setSpecialEffectType(n3);
                    Node node3 = jsy.a("SFContainerManager", node);
                    if (node3 != null) {
                        dkw dkw2 = this.fd(node3);
                        dgj2.setContainerManager(dkw2);
                    }
                    map.put(n4, dgj2);
                    continue;
                }
                catch (bg bg2) {
                    if (string2 == null) {
                        throw new bg("Parsing of specialeffect " + i2 + " failed.", bg2);
                    }
                    throw new bg("Parsing of specialeffect '" + string2 + "' failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private void d(int n, String string, boolean bl) {
        Integer n2 = new Integer(n);
        Map map = lea.eoc();
        if (!bl) {
            if (map.containsKey(string.toLowerCase())) {
                throw new bg("A specialeffect with name='" + string + "' has already been addded to the map.");
            }
            if (map.containsKey(n2)) {
                throw new bg("A specialeffect with type=" + n + " has already been addded to the map.");
            }
        } else {
            if (!map.containsKey(string.toLowerCase()) && map.containsKey(n2)) {
                throw new bg("A specialeffect '" + string + "' overriding type but not name.");
            }
            if (map.containsKey(string.toLowerCase()) && !map.containsKey(n2)) {
                throw new bg("A specialeffect '" + string + "' overriding name but not type.");
            }
        }
        map.put(n2, string);
        map.put(string.toLowerCase(), n2);
    }

    public void k(String string, Map map) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        if (map == null) {
            throw new bi("SpecialEffectMap is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        NodeList nodeList = document.getElementsByTagName("SFXML");
        try {
            List<Node> list = jsy.c("SFSpecialEffect", nodeList.item(0));
            if (list.isEmpty()) {
                lfn.b(2, "SFSpecialEffectParser", "parseSpecialEffectsOnServer() No 'SFSpecialEffect' nodes found.");
                return;
            }
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                Node node = list.get(i2);
                String string2 = null;
                try {
                    Node node2 = jsy.d("SFName", node);
                    string2 = jsy.m(node2);
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Node 'SFName' has invalid value.");
                    }
                    int n2 = this.Q(string2, false);
                    Integer n3 = new Integer(n2);
                    this.d(n2, string2, false);
                    if (map.containsKey(n3)) {
                        throw new bg("SpecialEffect '" + string2 + "' has already been added to the map.");
                    }
                    det det2 = this.fc(node);
                    det2.SpecialEffectType = n2;
                    map.put(n3, det2);
                    continue;
                }
                catch (bg bg2) {
                    if (string2 == null) {
                        throw new bg("Parsing of specialeffect " + i2 + " failed.", bg2);
                    }
                    throw new bg("Parsing of specialeffect '" + string2 + "' failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void b(String string, Map<String, lae> map, Map<String, lae> map2) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        NodeList nodeList = document.getElementsByTagName("XML");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'XML' node found.");
        }
        lae lae2 = map.get("SpecialEffectNodes".toLowerCase());
        try {
            List<Node> list = jsy.c("SpecialEffect", nodeList.item(0));
            if (list.isEmpty()) {
                lfn.b(2, "SFSpecialEffectParser", "parseSpecialEffectTree() No 'SpecialEffect' nodes found.");
                return;
            }
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    this.a(lae2, list.get(i2), map, map2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of specialeffect " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
        if (!map2.isEmpty()) {
            for (lae lae3 : map2.values()) {
                lae2.add(lae3);
            }
        }
    }

    private dgj c(int n, Node node) {
        dgj dgj2 = this.pdR.Al(n);
        if (dgj2 == null) {
            throw new bi("EffectClassType " + n + " is not handled by factory.");
        }
        duf duf2 = (duf)this.pdS.get(dgj2.getEffectClassName());
        if (duf2 == null) {
            throw new bi("SFClass for EffectClass '" + dgj2.getEffectClassName() + "' was not found.");
        }
        this.a(node, duf2, dgj2);
        Node node2 = jsy.a("SFSpecialEffectComponents", node);
        if (node2 != null) {
            List<Node> list = jsy.c("SFSpecialEffectComponent", node2);
            for (Node node3 : list) {
                Node node4 = jsy.d("SFClassName", node3);
                String string = jsy.m(node4);
                if (string == null) {
                    lfn.b(5, this.getClass().getName(), "createSpecialEffect() : class name is null ");
                    continue;
                }
                short s2 = del.iE(string);
                if (s2 == -1) {
                    lfn.b(5, this.getClass().getName(), "createSpecialEffect() : " + string);
                    continue;
                }
                dgb dgb2 = dge.d(s2);
                if (dgb2 == null) {
                    lfn.b(5, this.getClass().getName(), "createSpecialEffect() : failed to create component " + string);
                    continue;
                }
                duf duf3 = (duf)this.pdS.get(string);
                if (duf3 == null) {
                    lfn.b(5, this.getClass().getName(), "createSpecialEffect() : failed to find reflected class " + string);
                    continue;
                }
                this.a(node3, duf3, dgb2);
                dgj2.addComponent(dgb2);
            }
        }
        return dgj2;
    }

    private det fc(Node node) {
        det det2 = new det();
        boolean bl = false;
        float f2 = -1.0f;
        Node node2 = null;
        NodeList nodeList = node.getChildNodes();
        int n = nodeList.getLength();
        for (int i2 = 0; i2 < n; ++i2) {
            node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("SFMainEffect")) {
                bl = jsy.t(node2);
                continue;
            }
            if (!node2.getNodeName().equals("SFDuration") || !((double)(f2 = (float)jsy.q(node2)) <= 0.0) || f2 == -2.0f) continue;
            throw new bj("Duration is invalid.");
        }
        det2.gnd = bl;
        det2.doT = f2;
        return det2;
    }

    private dkw fd(Node node) {
        dkw dkw2 = new dkw();
        List<Node> list = jsy.c("SFSpecialEffect", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFSpecialEffect' nodes found. ContainerManager has no subeffects defined.");
        }
        dgj[] dgjArray = new dgj[list.size()];
        int n = dgjArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            Node node2 = list.get(i2);
            try {
                Node node3 = jsy.d("SFClassName", node2);
                String string = jsy.m(node3);
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node 'SFClassName' has invalid value.");
                }
                int n2 = del.iF(string);
                if (n2 <= 0) {
                    throw new bj("EffectClassName '" + string + "' is invalid.");
                }
                dgj dgj2 = this.pdR.Al(n2);
                if (dgj2 == null) {
                    throw new bj("EffectClassType " + n2 + " is not handled by factory.");
                }
                duf duf2 = (duf)this.pdS.get(dgj2.getEffectClassName());
                if (duf2 == null) {
                    throw new bj("SFClass for EffectClass '" + dgj2.getEffectClassName() + "' was not found.");
                }
                dgjArray[i2] = this.c(n2, node2);
                dgjArray[i2].setSubEffect(true);
                dgjArray[i2].setEffectInstanceID(i2 + 1);
                if (dgjArray[i2].getDuration() == -2.0f && !dgjArray[i2].isInheritDuration()) {
                    dgjArray[i2].setInheritDuration(true);
                }
                if (dgjArray[i2].isMainEffect()) {
                    throw new bj("SubEffect '" + string + "' can't be a maineffect.");
                }
                Node node4 = jsy.a("SFContainerManager", node2);
                if (node4 == null) continue;
                dkw dkw3 = this.fd(node4);
                dgjArray[i2].setContainerManager(dkw3);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of subspecialeffect " + i2 + " failed.", bg2);
            }
        }
        dkw2.a(dgjArray);
        return dkw2;
    }

    public void a(String string, String string2, double d2) {
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/common/specialeffect/effects_for_objects/" + string);
        Document document = jsy.n(jrw2);
        NodeList nodeList = document.getElementsByTagName("SFName");
        if (nodeList.getLength() == 0) {
            throw new bo("No 'SFName' node found.");
        }
        int n = nodeList.getLength();
        for (int i2 = 0; i2 < n; ++i2) {
            Node node = jry.g(nodeList.item(i2));
            if (node == null) {
                assert (false);
                return;
            }
            String string3 = node.getNodeValue();
            if (!string3.equals(string2)) continue;
            this.a(document, nodeList.item(i2).getParentNode(), jrw2, d2);
            return;
        }
    }

    private void a(Document document, Node node, jrw jrw2, double d2) {
        Node node2 = jsy.a("SFLooping", node);
        if (node2 == null) {
            throw new bo("No 'SFLooping' node found.");
        }
        Node node3 = jry.h(node2);
        if (node3 == null) {
            assert (false);
            return;
        }
        boolean bl = Boolean.parseBoolean(node3.getNodeValue());
        if (bl) {
            lfn.b(0, "SFSpecialEffectParser", "setDuration() Looping. Setting duration to INFINITE");
            d2 = -2.0;
        }
        if ((node2 = jsy.a("SFDuration", node)) == null) {
            throw new bo("No 'SFXML' node found.");
        }
        node3 = jry.k(node2);
        if (node3 == null) {
            assert (false);
            return;
        }
        node3.setNodeValue("" + Double.toString(d2));
        jsz.a(document, jrw2);
    }

    public void a(String string, String string2, int n, boolean bl, del.a a2, String string3, float f2) {
        this.a(string, string2, n, bl, a2, string3, f2, false, 0.0f);
    }

    public void a(String string, String string2, int n, boolean bl, del.a a2, String string3, float f2, boolean bl2, float f3) {
        String string4 = null;
        switch (a2) {
            case glB: {
                string4 = "specialeffect_node_template.xml";
                break;
            }
            case glC: {
                string4 = "specialeffect_node_random_single_template.xml";
                break;
            }
            case glD: {
                string4 = "specialeffect_node_random_single_chance_template.xml";
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        jrw jrw2 = new jrw(lcw.qLb + "worldbuilder/templates/" + string4);
        Document document = jsy.n(jrw2);
        if (document == null) {
            return;
        }
        NodeList nodeList = document.getElementsByTagName("SFName");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SFXML' node found.");
        }
        Object object = jry.g(nodeList.item(0));
        if (object == null) {
            assert (false);
            return;
        }
        object.setNodeValue(string2);
        switch (a2) {
            case glB: {
                this.d(string, document);
                break;
            }
            case glC: 
            case glD: {
                this.e(string, document);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        nodeList = document.getElementsByTagName("SFType");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SFXML' node found.");
        }
        object = jry.i(nodeList.item(0));
        if (object == null) {
            assert (false);
            return;
        }
        object.setNodeValue(Integer.toString(n));
        nodeList = document.getElementsByTagName("SFDuration");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SFXML' node found.");
        }
        object = jry.k(nodeList.item(0));
        if (object == null) {
            assert (false);
            return;
        }
        if (bl) {
            object.setNodeValue("-2.0");
        } else {
            object.setNodeValue("" + Float.toString(f2));
        }
        nodeList = document.getElementsByTagName("SFLooping");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SFLooping' node found.");
        }
        object = jry.h(nodeList.item(0));
        if (object == null) {
            assert (false);
            return;
        }
        object.setNodeValue(Boolean.toString(bl));
        nodeList = document.getElementsByTagName("SFRelationEffect");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SFXML' node found.");
        }
        object = jry.h(nodeList.item(0));
        if (object == null) {
            assert (false) : "No boolean subnode value!!";
            return;
        }
        object.setNodeValue(Boolean.toString(bl2));
        nodeList = document.getElementsByTagName("SFEffectDelayTime");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SFXML' node found.");
        }
        object = jry.j(nodeList.item(0));
        if (object == null) {
            assert (false);
            return;
        }
        object.setNodeValue(Float.toString(f3));
        string3 = string3.toLowerCase();
        if (!string3.endsWith(".xml")) {
            string3 = string3 + ".xml";
        }
        boolean bl3 = false;
        object = "xml-files/common/specialeffect/effects_for_objects/" + string3;
        Document document2 = null;
        try {
            document2 = jsy.tJ((String)object);
        }
        catch (bo bo2) {
            lfn.b(3, this.getClass().getSimpleName(), "addSpecialEffectNode() : File not found. Creating new from template. File = " + (String)object);
            try {
                document2 = jsy.tJ("xml-files/common/specialeffect/template.xml");
                bl3 = true;
            }
            catch (bo bo3) {
                lfn.b(5, "SFSpecialEffectParser", "addSpecialEffectNode() Could not parse Original Doc: ");
                bo2.printStackTrace();
                lfn.b(0, "SFSpecialEffectParser", "addSpecialEffectNode() Could not parse Template file:" + bo3.getMessage());
                return;
            }
        }
        Node node = jsy.a("SFXML", (Node)document2);
        Node node2 = document2.importNode(document.getDocumentElement(), true);
        node.appendChild(node2);
        jsz.b(document2, lcw.qLb + (String)object);
        if (bl3) {
            this.dVg();
        }
    }

    private void dVg() {
        jrw[] jrwArray;
        jta jta2 = new jta();
        Document document = jta2.dSD();
        Element element = jta2.a(document, pdO, new lju(0, 1, 0));
        document.appendChild(element);
        jrw jrw2 = new jrw(lcw.qLb + "/" + "xml-files/common/specialeffect/effects_for_objects/");
        for (jrw jrw3 : jrwArray = jrw2.a(new jsl("xml"))) {
            if (!jrw3.isFile() || !jrw3.getName().endsWith(".xml")) continue;
            Element element2 = document.createElement(pdP);
            element2.setAttribute(pdQ, jrw3.getName());
            element.appendChild(element2);
        }
        String string = lcw.qLb + "xml-files/common/specialeffect/" + "specialeffects_for_objects_index.xml";
        jsz.b(document, string);
    }

    private void d(String string, Document document) {
        NodeList nodeList = document.getElementsByTagName("SFXMLFileName");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SFXML' node found.");
        }
        Node node = jry.g(nodeList.item(0));
        if (node == null) {
            assert (false);
            return;
        }
        node.setNodeValue(string);
    }

    private void e(String string, Document document) {
        String string2 = "SFXMLFileName";
        if ((string = string.toLowerCase()).endsWith(".xml")) {
            string = string.substring(0, string.lastIndexOf("."));
        }
        for (int i2 = 1; i2 <= 8; ++i2) {
            Object object;
            String string3 = null;
            if (i2 == 1) {
                string3 = string + ".xml";
                if (string.endsWith("1")) {
                    string = string.substring(0, string.length() - 1);
                }
            } else {
                string3 = string + i2 + ".xml";
                object = new File(lcw.qLb + "xml/" + "/" + string3);
                if (!((File)object).exists()) {
                    return;
                }
                lfn.b(0, this.getClass().getSimpleName(), "setMultiFilenameNode() : File for node [" + string3 + "] exists!");
            }
            if ((object = document.getElementsByTagName(string2 + i2)).getLength() != 1) {
                throw new bo("No 'SFXML' node found.");
            }
            Node node = jry.g(object.item(0));
            if (node == null) {
                assert (false);
                return;
            }
            node.setNodeValue(string3);
        }
    }

    public void wv(String string) {
        String string2 = "^se_animaudio:" + string + ":.*:[0-9]{2}$";
        Map<Integer, dgj> map = lea.bkO();
        Map<Integer, dgj> map2 = lcn.emw();
        for (dgj dgj2 : map.values()) {
            String string3 = dgj2.getSpecialEffectName();
            if (string3 == null || !Pattern.matches(string2, string3)) continue;
            lfn.b(0, this.getClass().getSimpleName(), "filterForAudioEffects() : Found an AudioEffect: " + string3);
            map2.put(new Integer(dgj2.getSpecialEffectType()), dgj2);
        }
        String string4 = lcw.qLb + "xml-files/common/specialeffect/effects_for_objects/" + string + ".xml";
        new kbx().g(map2, string4);
    }

    public void g(jrw jrw2, String string) {
        Document document = jsy.n(jrw2);
        if (document == null) {
            return;
        }
        NodeList nodeList = document.getElementsByTagName("SoundInformation");
        if (nodeList.getLength() != 1) {
            throw new bo("No 'SoundInformation' node found.");
        }
        NamedNodeMap namedNodeMap = nodeList.item(0).getAttributes();
        Node node = namedNodeMap.getNamedItem("FileName");
        if (node == null) {
            assert (false);
            return;
        }
        node.setNodeValue(string);
        jsz.a(document, jrw2);
    }

    private void a(lae lae2, Node node, Map<String, lae> map, Map<String, lae> map2) {
        assert (lae2 != null);
        assert (node != null);
        assert (map != null);
        assert (map2 != null);
        lae lae3 = null;
        try {
            boolean bl = jsy.f(node, "Group");
            String string = jsy.c(node, "Name");
            if (string == null || string.trim().equals("")) {
                throw new bj("Attribute 'Name' has invalid value.");
            }
            if (bl) {
                lae3 = new lae(20, 0, string);
                if (map.containsKey(lae3.getName().toLowerCase())) {
                    throw new bg("Group '" + string + "' already exists.");
                }
            } else {
                if (string.endsWith("*")) {
                    string = string.substring(0, string.length());
                    String[] stringArray = del.giv;
                    int n = stringArray.length;
                    for (int i2 = 0; i2 < n; ++i2) {
                        String string2 = string + stringArray[i2];
                        lae3 = map2.remove(string2.toLowerCase());
                        if (lae3 == null) continue;
                        lae2.add(lae3);
                    }
                } else {
                    lae3 = map2.remove(string.toLowerCase());
                    if (lae3 == null) {
                        lfn.b(5, "SFSpecialEffectParser", "parseSpecialEffectNode() Could not find node for specialeffect '" + string + "'");
                        return;
                    }
                    lae2.add(lae3);
                }
                return;
            }
            lae2.add(lae3);
            map.put(lae3.getName().toLowerCase(), lae3);
            List<Node> list = jsy.c("SpecialEffect", node);
            if (list.isEmpty()) {
                return;
            }
            int n = list.size();
            for (int i3 = 0; i3 < n; ++i3) {
                try {
                    this.a(lae3, list.get(i3), map, map2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of sub specialeffect " + i3 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            if (lae3 == null) {
                throw new bg("Parsing of group '" + lae2.getName() + "' failed.", bg3);
            }
            throw new bg("Parsing of group '" + lae3.getName() + "' failed.", bg3);
        }
    }

    private int Q(String string, boolean bl) {
        int n = string.hashCode();
        n = Math.abs(n);
        if (!bl && lcw.qHe) assert (!this.pdT.contains(n));
        this.pdT.add(n);
        return n;
    }
}

