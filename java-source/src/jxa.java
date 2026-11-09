/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jxa {
    public static final int oYD = 0;
    public static final int oYE = 1;
    public static final String[] oYF = new String[]{"MESHOBJECT", "ANIMATEDOBJECT"};
    private final String oYG = "ElevatorData";
    private final String oYH = "Points";
    private final String oYI = "Point";
    private final String oYJ = "Position";
    private final String oYK = "Rotation";
    private final String oYL = "Looping";
    private final String oYM = "MaxSpeed";
    private final String oYN = "Acceleration";
    private final String oYO = "PauseTime";
    private final String oYP = "PauseTimeAlternate";

    public String q(jrw jrw2) {
        String string = jry.tr(jrw2.getAbsolutePath());
        assert (string != null);
        return this.uY(string);
    }

    public String uY(String string) {
        String string2 = "ShaderDefault.xml";
        if (!jry.tj(string)) {
            return string2;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        string2 = this.l(document);
        return string2;
    }

    public static List<String> k(Document document) {
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            return null;
        }
        Node node2 = jsy.a("RenderInformation", node);
        Node node3 = jsy.a("Shaders", node2);
        Node node4 = jsy.a("ActiveVersion", node3);
        String string = jsy.m(node4);
        Node node5 = jsy.a(string, node3);
        Node node6 = jsy.a("GlobalShader", node5);
        boolean bl = jsy.t(node6);
        ArrayList<String> arrayList = lcn.emv();
        if (bl) {
            arrayList.add(jsy.m(node6));
        } else {
            Node node7 = jsy.a("SubsetShaders", node5);
            NodeList nodeList = node7.getChildNodes();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                Node node8 = nodeList.item(i2);
                if (!node8.getNodeName().toLowerCase().contains("shader")) continue;
                arrayList.add(jsy.m(node8));
            }
        }
        return arrayList;
    }

    public String l(Document document) {
        String string = "ShaderDefault.xml";
        Node node = jsy.a("SFObject", (Node)document);
        if (node != null) {
            node = jsy.a("RenderInformation", node);
            node = jsy.a("Shaders", node);
            Node node2 = jsy.a("ActiveVersion", node);
            String string2 = jsy.m(node2);
            node = jsy.a(string2, node);
            boolean bl = jsy.t(node = jsy.a("GlobalShader", node));
            if (bl) {
                string = jsy.m(node);
            } else {
                return string;
            }
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String r(jrw jrw2) {
        String string = this.q(jrw2);
        assert (string != null);
        string = "xml/shader/" + string;
        String string2 = null;
        if (!jrw2.exists()) return string2;
        Document document = null;
        try {
            document = jsy.tJ(string);
            string2 = this.m(document);
            if (string2 != null) return string2;
        }
        catch (bo bo2) {
            return null;
        }
        return string2;
    }

    public String m(Document document) {
        String string = null;
        Node node = jsy.a("SFShader", (Node)document);
        if (node != null) {
            node = jsy.a("Shader", node);
            node = jsy.a("RenderEffect", node);
            string = jsy.m(node);
        }
        return string;
    }

    public String s(jrw jrw2) {
        String string = jry.tr(jrw2.getAbsolutePath());
        assert (string != null);
        return this.uZ(string);
    }

    public String uZ(String string) {
        if (!jry.tj(string)) {
            return null;
        }
        String string2 = null;
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        string2 = this.n(document);
        if (string2 == null) {
            // empty if block
        }
        return string2;
    }

    public String n(Document document) {
        String string = null;
        Node node = jsy.a("SFObject", (Node)document);
        if (node != null) {
            node = jsy.a("RenderInformation", node);
            node = jsy.a("FileName", node);
            Node node2 = jsy.a("ActiveVersion", node);
            String string2 = jsy.m(node2);
            node = jsy.a(string2, node);
            string = jsy.m(node);
        }
        return string;
    }

    public String o(Document document) {
        String string = null;
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            return null;
        }
        node = jsy.a("RenderInformation", node);
        if ((node = jsy.a("DynamicHitConfigFile", node)) == null) {
            return null;
        }
        NamedNodeMap namedNodeMap = node.getAttributes();
        string = namedNodeMap.getNamedItem("Value").getNodeValue();
        if (string == null) {
            return null;
        }
        return string;
    }

    public List p(Document document) {
        String[] stringArray = null;
        String[] stringArray2 = null;
        ArrayList<String> arrayList = lcn.emv();
        Node node = jsy.a("SFObject", (Node)document);
        if (node != null) {
            String string;
            int n;
            node = jsy.a("RenderInformation", node);
            node = jsy.a("FileName", node);
            Node node2 = jsy.a("ActiveVersion", node);
            String string2 = jsy.m(node2);
            Node node3 = jsy.a(string2, node);
            stringArray = this.bj(jsy.a("Meshes", node3));
            stringArray2 = this.bj(jsy.a("Animations", node3));
            for (n = 0; n < stringArray2.length; ++n) {
                string = stringArray2[n];
                string = "sfa/" + string;
                arrayList.add(string);
            }
            for (n = 0; n < stringArray.length; ++n) {
                string = stringArray[n];
                string = "sfa/" + string;
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    private String[] bj(Node node) {
        Node node2 = null;
        Node node3 = jsy.a("NumberOfSets", node);
        int n = jsy.r(node3);
        String string = null;
        String[] stringArray = new String[n];
        for (int i2 = 0; i2 < n; ++i2) {
            string = "Set" + Integer.toString(i2);
            node2 = jsy.a(string, node);
            stringArray[i2] = jsy.m(node2);
        }
        return stringArray;
    }

    public String[] t(jrw jrw2) {
        String[] stringArray = null;
        if (jrw2.exists()) {
            Document document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                return null;
            }
            stringArray = jxa.q(document);
        }
        return stringArray;
    }

    public static String[] q(Document document) {
        String[] stringArray = null;
        Node node = jsy.a("SFObject", (Node)document);
        if (node != null) {
            node = jsy.a("RenderInformation", node);
            node = jsy.a("Shaders", node);
            Node node2 = jsy.a("NumberOfSubsets", node);
            int n = jsy.r(node2);
            Node node3 = jsy.a("DefaultTextures", node);
            String string = null;
            String string2 = null;
            stringArray = new String[n];
            for (int i2 = 0; i2 < n; ++i2) {
                string2 = "Subset" + Integer.toString(i2);
                string = "Texture" + Integer.toString(0);
                node = jsy.a(string2, node3);
                node = jsy.a(string, node);
                stringArray[i2] = jsy.m(node);
            }
        }
        return stringArray;
    }

    public List u(jrw jrw2) {
        List list = lcn.emv();
        if (jrw2.exists()) {
            Document document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                return null;
            }
            list = this.r(document);
        }
        return list;
    }

    public List r(Document document) {
        ArrayList<String> arrayList = lcn.emv();
        String string = null;
        Node node = jsy.a("SFObject", (Node)document);
        Node node2 = null;
        if (node == null) {
            return arrayList;
        }
        node = jsy.a("CollisionInformation", node);
        Node node3 = jsy.a("StaticScheme", node = jsy.a("CollisionModelInformation", node));
        node2 = jsy.a("FileName", node3);
        if (node2 == null) {
            return arrayList;
        }
        NamedNodeMap namedNodeMap = node2.getAttributes();
        string = namedNodeMap.getNamedItem("Value").getNodeValue();
        if (string != null) {
            arrayList.add(string);
            arrayList.add("partial/" + string);
        }
        if ((string = (namedNodeMap = (node2 = jsy.a("FileName", node3 = jsy.a("DynamicScheme", node))).getAttributes()).getNamedItem("Value").getNodeValue()) != null) {
            arrayList.add(string);
            arrayList.add("partial/" + string);
        }
        if ((string = (namedNodeMap = (node2 = jsy.a("FileName", node3 = jsy.a("AnimatedInfluenceScheme", node))).getAttributes()).getNamedItem("Value").getNodeValue()) != null) {
            arrayList.add(string);
            arrayList.add("partial/" + string);
        }
        return arrayList;
    }

    public String v(jrw jrw2) {
        Object var2_2 = null;
        if (!jrw2.exists()) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            return null;
        }
        return this.s(document);
    }

    public String s(Document document) {
        String string = null;
        Node node = jsy.a("SFObject", (Node)document);
        Node node2 = null;
        if (node == null) {
            return string;
        }
        node = jsy.a("CollisionInformation", node);
        Node node3 = jsy.a("StaticScheme", node = jsy.a("CollisionModelInformation", node));
        node2 = jsy.a("FileName", node3);
        if (node2 == null) {
            return string;
        }
        NamedNodeMap namedNodeMap = node2.getAttributes();
        string = namedNodeMap.getNamedItem("Value").getNodeValue();
        if (string == null) {
            lfn.b(4, this.getClass().getSimpleName(), "getCollisionFileForStaticScheme() : Static scheme collisionfilename is null.");
        }
        return string;
    }

    public void b(jrw jrw2, int n) {
        if (jrw2.exists()) {
            Document document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                return;
            }
            Node node = jsy.a("SFObject", (Node)document);
            if (node != null) {
                node = jsy.a("RenderInformation", node);
                String string = jsy.m(node = jsy.a("ObjectType", node));
                if (string != null && !string.equals(oYF[n])) {
                    node = this.g(node);
                    node.setNodeValue(oYF[n]);
                    jsz.a(document, jrw2);
                }
            }
        }
    }

    public dql va(String string) {
        dql dql2 = null;
        if (!jry.tt(string)) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        Node node = jsy.a("SFObject", (Node)document);
        Node node2 = null;
        boolean bl = false;
        if (node == null) {
            return null;
        }
        if ((node = jsy.a("Tint", node)) == null) {
            return null;
        }
        dql2 = new dql();
        lcq lcq2 = null;
        float f = 0.0f;
        node2 = jsy.a("TintColor", node);
        if (node2 != null) {
            lcq2 = jsy.A(node2);
            if (lcq2 != null) {
                dql2.j(lcq2);
            }
            bl = true;
        }
        if ((node2 = jsy.a("TintPower", node)) != null) {
            f = jsy.o(node2);
            dql2.setPower(f);
            bl = true;
        }
        if (!bl) {
            dql2 = null;
        }
        return dql2;
    }

    public Node g(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                node2 = nodeList.item(i2);
                if (!node2.getNodeName().equals("SFString")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
        }
        return null;
    }

    public boolean d(jrw jrw2, String string) {
        if (jrw2.exists()) {
            Document document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                return false;
            }
            Node node = jsy.a("SFObject", (Node)document);
            if (node != null) {
                node = jsy.a("RenderInformation", node);
                node = jsy.a("FileName", node);
                Node node2 = jsy.a("ActiveVersion", node);
                String string2 = jsy.m(node2);
                if ((node = jsy.a(string2, node)) == null) {
                    return false;
                }
                if ((node = this.g(node)) == null) {
                    return false;
                }
                node.setNodeValue(string);
                jsz.a(document, jrw2);
            }
        }
        return true;
    }

    public void b(jrw jrw2, boolean bl) {
        if (jrw2.exists()) {
            Document document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                return;
            }
            Node node = jsy.a("SFObject", (Node)document);
            if (node != null) {
                node = jsy.a("RenderInformation", node);
                if ((node = jsy.a("Extras", node)) == null) {
                    return;
                }
                node = jsy.a("Veg", node);
                Node node2 = jry.h(node);
                node2.setNodeValue(Boolean.toString(bl));
                jsz.a(document, jrw2);
            }
        }
    }

    public void w(jrw jrw2) {
        if (jrw2.exists()) {
            Document document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                return;
            }
            Node node = jsy.a("SFObject", (Node)document);
            if (node != null) {
                jta jta2 = new jta();
                Node node2 = jsy.a("Extras", node = jsy.a("RenderInformation", node));
                if (node2 != null) {
                    return;
                }
                node2 = document.createElement("Extras");
                node2.appendChild(jta2.a(document, true, "Veg"));
                node2.appendChild(jta2.a(document, true, "DetailTextures"));
                node.appendChild(node2);
                jsz.a(document, jrw2);
            }
        }
    }

    public float x(jrw jrw2) {
        if (!jrw2.exists()) {
            return 0.0f;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            return 0.0f;
        }
        float f = 0.0f;
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            return 0.0f;
        }
        node = jsy.a("RenderInformation", node);
        node = jsy.a("VisibilityInformation", node);
        node = jsy.a("BoundingInformation", node);
        node = jsy.a("BoundingSphere", node);
        Node node2 = jsy.a("Radius", node);
        f = jsy.o(node2);
        return f;
    }

    public String y(jrw jrw2) {
        String string = null;
        if (!jrw2.exists()) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            return null;
        }
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            return null;
        }
        if ((node = jsy.a("GameInfo", node)) == null) {
            return null;
        }
        if ((node = jsy.a("ResourceType", node)) == null) {
            return null;
        }
        NamedNodeMap namedNodeMap = node.getAttributes();
        node = namedNodeMap.getNamedItem("Value");
        string = node.getNodeValue();
        return string;
    }

    public void e(jrw jrw2, String string) {
        if (!jrw2.exists()) {
            return;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            return;
        }
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            return;
        }
        if ((node = jsy.a("GameInfo", node)) == null) {
            return;
        }
        if ((node = jsy.a("ResourceType", node)) == null) {
            return;
        }
        NamedNodeMap namedNodeMap = node.getAttributes();
        node = namedNodeMap.getNamedItem("Value");
        node.setNodeValue(string);
        jsz.a(document, jrw2);
    }

    public void a(jrw jrw2, jrw jrw3, dsb dsb2) {
        if (!jrw2.exists()) {
            return;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            return;
        }
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            return;
        }
        if ((node = jsy.a("PhysicsInformation", node)) == null) {
            return;
        }
        Node node2 = jsy.a("ElevatorData", node);
        if (node2 != null) {
            node.removeChild(node2);
        }
        jta jta2 = new jta();
        node2 = document.createElement("ElevatorData");
        node.appendChild(node2);
        Object object = dsb2.gWV;
        List<ljq> list = dsb2.gWW;
        assert (object.size() == list.size());
        Element element = document.createElement("Points");
        node2.appendChild(element);
        for (int i2 = 0; i2 < object.size(); ++i2) {
            ljq ljq2 = object.get(i2);
            ljq ljq3 = list.get(i2);
            Element element2 = document.createElement("Point");
            element2.setAttribute("Index", Integer.toString(i2));
            element.appendChild(element2);
            Element element3 = jta2.a(document, ljq2, "Position");
            element2.appendChild(element3);
            Element element4 = jta2.a(document, ljq3, "Rotation");
            element2.appendChild(element4);
        }
        object = document.createElement("Looping");
        object.setAttribute("Value", Boolean.toString(dsb2.eMi));
        node2.appendChild((Node)object);
        object = document.createElement("MaxSpeed");
        object.setAttribute("Value", Float.toString(dsb2.dVN));
        node2.appendChild((Node)object);
        object = document.createElement("Acceleration");
        object.setAttribute("Value", Float.toString(dsb2.doQ));
        node2.appendChild((Node)object);
        object = document.createElement("PauseTime");
        object.setAttribute("Value", Float.toString(dsb2.gWX));
        node2.appendChild((Node)object);
        object = document.createElement("PauseTimeAlternate");
        object.setAttribute("Value", Float.toString(dsb2.gWY));
        node2.appendChild((Node)object);
        jsz.a(document, jrw3);
    }

    public dsb vb(String string) {
        dsb dsb2 = new dsb();
        if (!jry.tj(string)) {
            return dsb2;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return dsb2;
        }
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            return dsb2;
        }
        if ((node = jsy.a("PhysicsInformation", node)) == null) {
            return dsb2;
        }
        Node node2 = jsy.a("ElevatorData", node);
        if (node2 == null) {
            return dsb2;
        }
        node = jsy.a("Looping", node2);
        if (node == null) {
            return dsb2;
        }
        NamedNodeMap namedNodeMap = node.getAttributes();
        node = namedNodeMap.getNamedItem("Value");
        String string2 = node.getNodeValue();
        dsb2.eMi = Boolean.parseBoolean(string2);
        node = jsy.a("MaxSpeed", node2);
        if (node == null) {
            return dsb2;
        }
        namedNodeMap = node.getAttributes();
        node = namedNodeMap.getNamedItem("Value");
        String string3 = node.getNodeValue();
        dsb2.dVN = Float.parseFloat(string3);
        node = jsy.a("Acceleration", node2);
        if (node == null) {
            return dsb2;
        }
        namedNodeMap = node.getAttributes();
        node = namedNodeMap.getNamedItem("Value");
        String string4 = node.getNodeValue();
        dsb2.doQ = Float.parseFloat(string4);
        node = jsy.a("PauseTime", node2);
        if (node == null) {
            return dsb2;
        }
        namedNodeMap = node.getAttributes();
        node = namedNodeMap.getNamedItem("Value");
        String string5 = node.getNodeValue();
        dsb2.gWX = Float.parseFloat(string5);
        node = jsy.a("PauseTimeAlternate", node2);
        if (node == null) {
            return dsb2;
        }
        namedNodeMap = node.getAttributes();
        node = namedNodeMap.getNamedItem("Value");
        String string6 = node.getNodeValue();
        dsb2.gWY = Float.parseFloat(string6);
        node = jsy.a("Points", node2);
        if (node == null) {
            return dsb2;
        }
        List<Node> list = jsy.c("Point", node);
        ljq[] ljqArray = new ljq[list.size()];
        ljq[] ljqArray2 = new ljq[list.size()];
        for (Node node3 : list) {
            namedNodeMap = node3.getAttributes();
            node = namedNodeMap.getNamedItem("Index");
            int n = Integer.parseInt(node.getNodeValue());
            node = jsy.a("Position", node3);
            ljqArray[n] = jsy.w(node);
            node = jsy.a("Rotation", node3);
            ljqArray2[n] = jsy.w(node);
        }
        dsb2.gWV = new ArrayList<ljq>(Arrays.asList(ljqArray));
        dsb2.gWW = new ArrayList<ljq>(Arrays.asList(ljqArray2));
        return dsb2;
    }
}

