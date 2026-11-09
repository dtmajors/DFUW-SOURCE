/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class jsy {
    protected static DocumentBuilder nWz = null;
    private static final Calendar nWA = Calendar.getInstance();
    private static final int nWB = nWA.get(1);
    private static final int nWC = nWA.get(2) + 1;
    private static final int nWD = nWA.get(5);
    public static final String nWE = String.format("_%04d_%02d_%02d", nWB, nWC, nWD);

    protected jsy() {
    }

    private static void dSA() {
        if (nWz == null) {
            try {
                nWz = jtf.dSE();
                String string = nWz.getClass().getCanonicalName();
                if (!string.startsWith("com.sun.")) assert (false);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Document a(InputSource inputSource) {
        if (nWz == null) {
            jsy.dSA();
        }
        try {
            Document document = null;
            DocumentBuilder documentBuilder = nWz;
            synchronized (documentBuilder) {
                document = nWz.parse(inputSource);
                nWz.reset();
            }
            return document;
        }
        catch (SAXException sAXException) {
            nWz.reset();
            throw new bo("<unknown>", sAXException);
        }
        catch (IOException iOException) {
            nWz.reset();
            throw new bo("<unknown>", iOException);
        }
    }

    private static String tH(String string) {
        assert (string.substring(string.length() - 4).equals(".xml"));
        String string2 = string.substring(0, string.length() - 4) + nWE + ".xml";
        return string2;
    }

    private static Document tI(String string) {
        String string2 = jsy.tH(string);
        byte[] byArray = null;
        if (jry.tj(string2)) {
            byArray = loi.exd().readFile(string2);
        }
        if (byArray == null) {
            byArray = loi.exd().readFile(string);
        }
        if (byArray == null) {
            throw new bo(string);
        }
        return jsy.a(new InputSource(new ByteArrayInputStream(byArray)));
    }

    public static Document tJ(String string) {
        string = jry.tp(string);
        if (jry.dRX()) {
            return jsy.tI(string);
        }
        return jsy.n(new jrw(lcw.qLb + "/" + string));
    }

    public static Document tK(String string) {
        try {
            return jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
    }

    public static Document tL(String string) {
        try {
            return jsy.a(new InputSource(new StringReader(string)));
        }
        catch (bo bo2) {
            return null;
        }
    }

    @Deprecated
    public static Document m(jrw jrw2) {
        if (!jry.dRX()) {
            return jsy.n(jrw2);
        }
        String string = jry.tr(jrw2.getAbsolutePath());
        if (string == null) {
            return jsy.n(jrw2);
        }
        int n = string.lastIndexOf(".");
        if (n <= 0 || !string.substring(n).equalsIgnoreCase(".xml")) {
            throw new bo("SFFile [" + string + "] has wrong extension.");
        }
        return jsy.tJ(string);
    }

    public static Document n(jrw jrw2) {
        String string = jry.tp(jrw2.getAbsolutePath());
        String string2 = jsy.tH(string);
        jrw2 = null;
        if (jry.to(string2).exists()) {
            jrw2 = jry.to(string2);
        }
        if (jrw2 == null) {
            jrw2 = jry.to(string);
        }
        Document document = null;
        int n = jrw2.getAbsolutePath().lastIndexOf(".");
        if (n <= 0 || !jrw2.getAbsolutePath().substring(n).equalsIgnoreCase(".xml")) {
            throw new bo("SFFile [" + jrw2.getAbsolutePath() + "] has wrong extension.");
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(jrw2);
            document = jsy.a(new InputSource(fileInputStream));
            fileInputStream.close();
        }
        catch (IOException iOException) {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
            catch (IOException iOException2) {
                iOException.printStackTrace(System.err);
            }
            throw new bo(jrw2.getAbsolutePath(), iOException);
        }
        return document;
    }

    public static void a(Document document, lju lju2) {
        lju lju3 = jsy.c(document);
        if (lju3 == null) {
            throw new bo("No 'VersionInformation' node found.");
        }
        if (!lju2.b(lju3)) {
            throw new bg("Too old version of document: " + lju3);
        }
    }

    public static String m(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFString")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                Node node3 = namedNodeMap.getNamedItem("Value");
                if (node3 != null) {
                    return node3.getNodeValue();
                }
                return null;
            }
        }
        return null;
    }

    public static String n(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("#cdata-section")) continue;
                return node2.getNodeValue();
            }
        }
        return "";
    }

    public static float o(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFFloat")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return Float.parseFloat(node.getNodeValue());
            }
        }
        return 0.0f;
    }

    public static lhf p(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFDimension")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Width");
                int n2 = Integer.parseInt(node.getNodeValue());
                node = namedNodeMap.getNamedItem("Height");
                int n3 = Integer.parseInt(node.getNodeValue());
                lhf lhf2 = new lhf(n2, n3);
                return lhf2;
            }
        }
        return null;
    }

    public static double q(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFDouble")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return Double.parseDouble(node.getNodeValue());
            }
        }
        return 0.0;
    }

    public static int r(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFInteger")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return Integer.parseInt(node.getNodeValue());
            }
        }
        return 0;
    }

    public static long s(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFLong")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return Long.parseLong(node.getNodeValue());
            }
        }
        return 0L;
    }

    public static boolean t(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equalsIgnoreCase("SFBool")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                Boolean bl = Boolean.valueOf(node.getNodeValue());
                return bl;
            }
        }
        return false;
    }

    public static ljp u(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFVector2")) continue;
                ljp ljp2 = new ljp();
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("X");
                ljp2.kl(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Y");
                ljp2.km(Float.parseFloat(node.getNodeValue()));
                return ljp2;
            }
        }
        return null;
    }

    public static ljr v(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFVector4")) continue;
                ljr ljr2 = new ljr();
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("X");
                ljr2.kl(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Y");
                ljr2.km(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Z");
                ljr2.fb(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("W");
                ljr2.nl(Float.parseFloat(node.getNodeValue()));
                return ljr2;
            }
        }
        return null;
    }

    public static ljq w(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFVector3")) continue;
                ljq ljq2 = new ljq();
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("X");
                ljq2.kl(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Y");
                ljq2.km(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Z");
                ljq2.fb(Float.parseFloat(node.getNodeValue()));
                return ljq2;
            }
        }
        return null;
    }

    public static lek x(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFInteger3")) continue;
                lek lek2 = new lek();
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("X");
                lek2.RH(Integer.parseInt(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Y");
                lek2.RI(Integer.parseInt(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Z");
                lek2.acs(Integer.parseInt(node.getNodeValue()));
                return lek2;
            }
        }
        return null;
    }

    public static lej y(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFInteger2")) continue;
                lej lej2 = new lej();
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("X");
                lej2.RH(Integer.parseInt(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Y");
                lej2.RI(Integer.parseInt(node.getNodeValue()));
                return lej2;
            }
        }
        return null;
    }

    public static lco z(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFColor")) continue;
                lco lco2 = new lco();
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("R");
                lco2.nb(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("G");
                lco2.nc(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("B");
                lco2.nd(Float.parseFloat(node.getNodeValue()));
                return lco2;
            }
        }
        return null;
    }

    public static lcq A(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFColor")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("R");
                float f = Float.parseFloat(node.getNodeValue());
                node = namedNodeMap.getNamedItem("G");
                float f2 = Float.parseFloat(node.getNodeValue());
                node = namedNodeMap.getNamedItem("B");
                float f3 = Float.parseFloat(node.getNodeValue());
                node = namedNodeMap.getNamedItem("A");
                float f4 = Float.parseFloat(node.getNodeValue());
                return new lcq(f, f2, f3, f4);
            }
        }
        return null;
    }

    public static ldz B(Node node) {
        Node node2;
        if (node != null && (node2 = jsy.a("SFTime", node)) != null) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("TotalTime");
            float f = Float.parseFloat(node3.getNodeValue());
            assert (f >= 0.0f) : "TotalTime is invalid!";
            node3 = namedNodeMap.getNamedItem("FrameTime");
            float f2 = Float.parseFloat(node3.getNodeValue());
            assert (f2 >= 0.0f) : "FrameTime is invalid!";
            node3 = namedNodeMap.getNamedItem("TickCount");
            int n = Integer.parseInt(node3.getNodeValue());
            assert (n >= 0) : "TickCount is invalid!";
            ldz ldz2 = new ldz(f2, f, n);
            return ldz2;
        }
        return null;
    }

    public static lju c(Document document) {
        lju lju2 = null;
        NodeList nodeList = document.getElementsByTagName("VersionInformation");
        Node node = null;
        try {
            node = nodeList.item(0);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (node != null) {
            try {
                lju2 = jsy.C(node);
            }
            catch (bg bg2) {
                return null;
            }
        }
        return lju2;
    }

    public static lju C(Node node) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem("Minor");
        if (node2 == null) {
            throw new bf(node, "Minor");
        }
        Node node3 = namedNodeMap.getNamedItem("Major");
        if (node3 == null) {
            throw new bf(node, "Major");
        }
        Node node4 = namedNodeMap.getNamedItem("Incremental");
        if (node4 != null) {
            return new lju(Integer.parseInt(node3.getNodeValue()), Integer.parseInt(node2.getNodeValue()), Integer.parseInt(node4.getNodeValue()));
        }
        return new lju(Integer.parseInt(node3.getNodeValue()), Integer.parseInt(node2.getNodeValue()));
    }

    public static Node a(String string, Document document) {
        if (document != null && string != null) {
            NodeList nodeList = document.getElementsByTagName(string);
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                if (!nodeList.item(i).getNodeName().equals(string)) continue;
                return nodeList.item(i);
            }
        }
        return null;
    }

    public static Node a(String string, String string2, String string3, Node node) {
        if (node != null && string != null && string2 != null && string3 != null && node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                String string4;
                Node node2;
                if (!nodeList.item(i).getNodeName().equals(string) || (node2 = nodeList.item(i)).getAttributes() == null || node2.getAttributes().getNamedItem(string2) == null || !(string4 = (node2 = node2.getAttributes().getNamedItem(string2)).getNodeValue()).equals(string3)) continue;
                return nodeList.item(i);
            }
        }
        return null;
    }

    public static Node a(String string, Node node) {
        if (node != null && string != null && node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                if (!nodeList.item(i).getNodeName().equals(string)) continue;
                return nodeList.item(i);
            }
        }
        return null;
    }

    public static Node b(String string, Node node) {
        if (node != null && string != null && node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                Node node2;
                Node node3 = nodeList.item(i);
                if (node3.getNodeName().equals(string)) {
                    return node3;
                }
                if (!node3.hasChildNodes() || (node2 = jsy.b(string, node3)) == null || !node2.getNodeName().equals(string)) continue;
                return node2;
            }
        }
        return null;
    }

    public static List<Node> c(String string, Node node) {
        ArrayList<Node> arrayList = lcn.emv();
        if (node != null && node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals(string)) continue;
                arrayList.add(nodeList.item(i));
            }
        }
        return arrayList;
    }

    public static Node d(String string, Node node) {
        if (node != null && string != null && node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                if (!nodeList.item(i).getNodeName().equals(string)) continue;
                return nodeList.item(i);
            }
        }
        throw new bg("'" + string + "' was not found");
    }

    public static Node e(String string, Node node) {
        if (node != null && string != null && node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                if (!nodeList.item(i).getNodeName().equals(string)) continue;
                return nodeList.item(i);
            }
        }
        return null;
    }

    public static ldv D(Node node) {
        if (node == null) {
            return null;
        }
        Node node2 = jsy.a("SFGUID", node);
        if (node2 == null) {
            return null;
        }
        NamedNodeMap namedNodeMap = node2.getAttributes();
        node2 = namedNodeMap.getNamedItem("NodeID");
        int n = Integer.parseInt(node2.getNodeValue());
        node2 = namedNodeMap.getNamedItem("ObjectSpaceGuid");
        int n2 = Integer.parseInt(node2.getNodeValue());
        node2 = namedNodeMap.getNamedItem("ObjectGuid");
        int n3 = Integer.parseInt(node2.getNodeValue());
        return new ldv(n, n2, n3);
    }

    public static lgl E(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFQuaternion")) continue;
                lgl lgl2 = new lgl();
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("X");
                lgl2.kl(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Y");
                lgl2.km(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("Z");
                lgl2.fb(Float.parseFloat(node.getNodeValue()));
                node = namedNodeMap.getNamedItem("W");
                lgl2.nl(Float.parseFloat(node.getNodeValue()));
                return lgl2;
            }
        }
        return null;
    }

    public static final String c(Node node, String string) {
        Node node2;
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node3 = node2 = namedNodeMap == null ? null : namedNodeMap.getNamedItem(string);
        if (node2 == null) {
            throw new bp("Node '" + node.getNodeName() + "' does not contain attribute '" + string + "'");
        }
        return node2.getNodeValue();
    }

    public static final int d(Node node, String string) {
        String string2 = jsy.c(node, string);
        try {
            return Integer.valueOf(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bp("Attribute '" + string + "' does not contain a valid integer value");
        }
    }

    public static final float e(Node node, String string) {
        String string2 = jsy.c(node, string);
        try {
            return Float.valueOf(string2).floatValue();
        }
        catch (NumberFormatException numberFormatException) {
            throw new bp("Attribute '" + string + "' does not contain a valid float value");
        }
    }

    public static final boolean f(Node node, String string) {
        String string2 = jsy.c(node, string);
        return string2.compareToIgnoreCase("DEBUG") != 0 ? Boolean.valueOf(string2) : false;
    }

    public static final Object a(Node node, String string, Class clazz) {
        String string2 = jsy.c(node, string);
        if (clazz.isAssignableFrom(String.class)) {
            return string2;
        }
        if (clazz.isAssignableFrom(Integer.class)) {
            return Integer.valueOf(string2);
        }
        if (clazz.isAssignableFrom(Float.class)) {
            return Float.valueOf(string2);
        }
        if (clazz.isAssignableFrom(Boolean.class)) {
            return Boolean.valueOf(string2);
        }
        throw new bs("unknown class: " + clazz.getName());
    }

    public static final boolean g(Node node, String string) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        if (namedNodeMap == null) {
            return false;
        }
        return namedNodeMap.getNamedItem(string) != null;
    }

    public static final String h(Node node, String string) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        if (namedNodeMap == null) {
            return null;
        }
        Node node2 = namedNodeMap.getNamedItem(string);
        if (node2 == null) {
            return null;
        }
        return node2.getNodeValue();
    }

    public static int F(Node node) {
        if (node != null) {
            NamedNodeMap namedNodeMap = node.getAttributes();
            node = namedNodeMap.getNamedItem("SFGUID");
            return Integer.parseInt(node.getNodeValue());
        }
        throw new bp("Could not parse SFGUID");
    }

    public static String i(Node node, String string) {
        if (node != null) {
            NamedNodeMap namedNodeMap = node.getAttributes();
            if ((node = namedNodeMap.getNamedItem(string)) == null) {
                return null;
            }
            return node.getNodeValue();
        }
        throw new bp("Could not parse " + string);
    }

    public static ljq G(Node node) {
        if (node == null) {
            throw new bp("Error parsing Node");
        }
        Node node2 = null;
        ljq ljq2 = new ljq();
        NamedNodeMap namedNodeMap = node.getAttributes();
        node2 = namedNodeMap.getNamedItem("SFType");
        if (!node.getNodeValue().equals("SFVector3")) {
            throw new bp("Error partsing node [" + node.getNodeName() + "], SFType did not match [" + "SFVector3" + "]");
        }
        node2 = namedNodeMap.getNamedItem("X");
        ljq2.kl(Float.parseFloat(node2.getNodeValue()));
        node2 = namedNodeMap.getNamedItem("Y");
        ljq2.km(Float.parseFloat(node2.getNodeValue()));
        node2 = namedNodeMap.getNamedItem("Z");
        ljq2.fb(Float.parseFloat(node2.getNodeValue()));
        return ljq2;
    }

    public static DocumentBuilder dSB() {
        return nWz;
    }
}

