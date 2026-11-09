/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jvq {
    private static final String oUf = "territories_vector_info";
    private static final String oUg = "vertex_buffer";
    private static final String oUh = "vertex";
    private static final String oUi = "line_buffer";
    private static final String oUj = "line";
    private static final String oUk = "segments";
    private static final String oUl = "segment";
    private static final String oTQ = "territories";
    private static final String oTR = "territory";
    private static final String oUm = "resolution_width";
    private static final String oUn = "resolution_height";
    private static final String oUo = "length";
    private static final String oUp = "x";
    private static final String oUq = "y";
    private static final String oUr = "start";
    private static final String oUs = "end";
    private static final String oQd = "id";
    private static final String oUt = "indices";
    private static dmr oUu = null;

    private jvq() {
    }

    public static dmr dTB() {
        if (oUu == null) {
            String string = "xml-files/client/territories/territories_vector_info.xml";
            Document document = null;
            try {
                document = jsy.tJ(string);
            }
            catch (bo bo2) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
                assert (false);
                return null;
            }
            NodeList nodeList = document.getElementsByTagName(oUg);
            if (nodeList.getLength() != 1) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Unexpected Vertex-Buffer Node Count!!!... Expected 1... Got " + nodeList.getLength());
                assert (false);
                return null;
            }
            Node node = nodeList.item(0);
            if (node.getNodeType() != 1) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Vertex-Buffer is Not ELEMENT Type!!!");
                assert (false);
                return null;
            }
            Element element = (Element)node;
            int n = 0;
            int n2 = 0;
            try {
                n = Integer.parseInt(element.getAttribute(oUm));
                n2 = Integer.parseInt(element.getAttribute(oUn));
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Failed to Parse Resolution Attributes!!!... Exception Message = " + numberFormatException.getMessage());
                assert (false);
                return null;
            }
            int[] nArray = jvq.C(element);
            if (nArray == null) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Failed to Parse Vertex-Buffer!!!");
                assert (false);
                return null;
            }
            NodeList nodeList2 = document.getElementsByTagName(oUi);
            if (nodeList2.getLength() != 1) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Unexpected Line-Buffer Node Count!!!... Expected 1... Got " + nodeList2.getLength());
                assert (false);
                return null;
            }
            Node node2 = nodeList2.item(0);
            if (node2.getNodeType() != 1) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Line-Buffer is Not ELEMENT Type!!!");
                assert (false);
                return null;
            }
            Element element2 = (Element)node2;
            int[] nArray2 = jvq.D(element2);
            if (nArray2 == null) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Failed to Parse Line-Buffer!!!");
                assert (false);
                return null;
            }
            NodeList nodeList3 = document.getElementsByTagName(oUk);
            if (nodeList3.getLength() != 1) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Unexpected Segments Node Count!!!... Expected 1... Got " + nodeList3.getLength());
                assert (false);
                return null;
            }
            Node node3 = nodeList3.item(0);
            if (node3.getNodeType() != 1) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Segments is Not ELEMENT Type!!!");
                assert (false);
                return null;
            }
            Element element3 = (Element)node3;
            dms[] dmsArray = jvq.E(element3);
            if (dmsArray == null) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Failed to Parse Segments!!!");
                assert (false);
                return null;
            }
            NodeList nodeList4 = document.getElementsByTagName(oTQ);
            if (nodeList4.getLength() != 1) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Unexpected Territories Node Count!!!... Expected 1... Got " + nodeList4.getLength());
                assert (false);
                return null;
            }
            Node node4 = nodeList4.item(0);
            if (node4.getNodeType() != 1) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Territories is Not ELEMENT Type!!!");
                assert (false);
                return null;
            }
            Element element4 = (Element)node4;
            dmt[] dmtArray = jvq.G(element4);
            if (dmtArray == null) {
                lfn.b(5, jvq.class.getSimpleName(), "loadVectorGraphicInfo() : Failed to Parse Territories!!!");
                assert (false);
                return null;
            }
            oUu = new dmr(n, n2, nArray, nArray2, dmsArray, dmtArray);
        }
        return oUu;
    }

    private static int[] C(Element element) {
        if (element == null) {
            return null;
        }
        if (!element.getTagName().equals(oUg)) {
            return null;
        }
        String string = element.getAttribute(oUo);
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        int[] nArray = new int[n * 2];
        int n2 = 0;
        NodeList nodeList = element.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Element element2;
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1 || !(element2 = (Element)node).getTagName().equals(oUh)) continue;
            String string2 = element2.getAttribute(oUp);
            String string3 = element2.getAttribute(oUq);
            try {
                int n3 = Integer.parseInt(string2);
                int n4 = Integer.parseInt(string3);
                nArray[n2] = n3;
                nArray[n2 + 1] = n4;
                n2 += 2;
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        return nArray;
    }

    private static int[] D(Element element) {
        if (element == null) {
            return null;
        }
        if (!element.getTagName().equals(oUi)) {
            return null;
        }
        String string = element.getAttribute(oUo);
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        int[] nArray = new int[n * 2];
        int n2 = 0;
        NodeList nodeList = element.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Element element2;
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1 || !(element2 = (Element)node).getTagName().equals(oUj)) continue;
            String string2 = element2.getAttribute(oUr);
            String string3 = element2.getAttribute(oUs);
            try {
                int n3 = Integer.parseInt(string2);
                int n4 = string3 == null || string3.isEmpty() ? n3 + 1 : Integer.parseInt(string3);
                nArray[n2] = n3 * 2;
                nArray[n2 + 1] = n4 * 2;
                n2 += 2;
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        return nArray;
    }

    private static dms[] E(Element element) {
        if (element == null) {
            return null;
        }
        if (!element.getTagName().equals(oUk)) {
            return null;
        }
        String string = element.getAttribute(oUo);
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        dms[] dmsArray = new dms[n];
        int n2 = 0;
        NodeList nodeList = element.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Element element2;
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1 || !(element2 = (Element)node).getTagName().equals(oUl)) continue;
            dms dms2 = jvq.F(element2);
            if (dms2 == null) {
                return null;
            }
            dmsArray[n2++] = dms2;
        }
        return dmsArray;
    }

    private static dms F(Element element) {
        if (element == null) {
            return null;
        }
        if (!element.getTagName().equals(oUl)) {
            return null;
        }
        String string = element.getAttribute(oQd);
        String string2 = element.getAttribute(oUp);
        String string3 = element.getAttribute(oUq);
        String string4 = element.getAttribute(oUo);
        String string5 = element.getAttribute(oUt);
        try {
            int n = Integer.parseInt(string);
            int n2 = Integer.parseInt(string2);
            int n3 = Integer.parseInt(string3);
            int n4 = Integer.parseInt(string4);
            int[] nArray = jvq.b(n4, string5, true);
            if (nArray == null) {
                return null;
            }
            return new dms(n, n2, n3, nArray);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    private static dmt[] G(Element element) {
        if (element == null) {
            return null;
        }
        if (!element.getTagName().equals(oTQ)) {
            return null;
        }
        String string = element.getAttribute(oUo);
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        dmt[] dmtArray = new dmt[n];
        int n2 = 0;
        NodeList nodeList = element.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Element element2;
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1 || !(element2 = (Element)node).getTagName().equals(oTR)) continue;
            dmt dmt2 = jvq.H(element2);
            if (dmt2 == null) {
                return null;
            }
            dmtArray[n2++] = dmt2;
        }
        return dmtArray;
    }

    private static dmt H(Element element) {
        if (element == null) {
            return null;
        }
        if (!element.getTagName().equals(oTR)) {
            return null;
        }
        String string = element.getAttribute(oQd);
        String string2 = element.getAttribute(oUp);
        String string3 = element.getAttribute(oUq);
        String string4 = element.getAttribute(oUo);
        String string5 = element.getAttribute(oUt);
        try {
            int n = Integer.parseInt(string);
            int n2 = Integer.parseInt(string2);
            int n3 = Integer.parseInt(string3);
            int n4 = Integer.parseInt(string4);
            int[] nArray = jvq.b(n4, string5, false);
            if (nArray == null) {
                return null;
            }
            return new dmt(n, n2, n3, nArray);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    private static int[] b(int n, String string, boolean bl) {
        int n2;
        int[] nArray = new int[n];
        int n3 = 0;
        String[] stringArray = string.split(",");
        for (n2 = 0; n2 < stringArray.length; ++n2) {
            if (stringArray[n2].indexOf(45) >= 0) {
                String[] stringArray2 = stringArray[n2].split("-");
                try {
                    int n4 = Integer.parseInt(stringArray2[0]);
                    int n5 = Integer.parseInt(stringArray2[1]);
                    if (n4 >= n5) {
                        return null;
                    }
                    int n6 = n4;
                    while (n6 <= n5) {
                        nArray[n3++] = n6++;
                    }
                    continue;
                }
                catch (NumberFormatException numberFormatException) {
                    return null;
                }
            }
            try {
                nArray[n3++] = Integer.parseInt(stringArray[n2]);
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        if (n3 < nArray.length) {
            return null;
        }
        if (bl) {
            n2 = 0;
            while (n2 < nArray.length) {
                int n7 = n2++;
                nArray[n7] = nArray[n7] * 2;
            }
        }
        return nArray;
    }
}

