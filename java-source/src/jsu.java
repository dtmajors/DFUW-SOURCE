/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXParseException;

public class jsu
extends jsy {
    private static final lfo ct = new lfo("MB");

    public List a(String string, List<String> list, Map map, lju lju2, String string2) {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        Node node = this.a(string, list, lju2);
        if (node == null) {
            return linkedList;
        }
        if (!node.getNodeName().equalsIgnoreCase(string2)) {
            String string3 = "expected '" + string2 + "' root node, found '" + node.getNodeName() + "'";
            ct.error(string3);
            list.add(string3);
            return linkedList;
        }
        for (Node node2 = node.getFirstChild(); node2 != null; node2 = node2.getNextSibling()) {
            Object object;
            if (node2.getNodeType() != 1) continue;
            Object object2 = node2.getNodeName();
            amd amd2 = (amd)map.get(object2);
            if (amd2 == null) {
                object = "Unknown node: " + (String)object2;
                ct.error((String)object);
                list.add((String)object);
                continue;
            }
            object2 = amd2.FJ();
            object = node2.getAttributes();
            for (int i = 0; i < object.getLength(); ++i) {
                String string4;
                Object object3;
                Node node3 = object.item(i);
                String string5 = node3.getNodeName();
                int n = amd2.dm(string5);
                if (n == -1) {
                    object3 = "Unknown Attribute: Filename='" + string + "', AttributeName='" + string5 + "', AttributeValue='" + node3.getNodeValue() + "'";
                    ct.error((String)object3);
                    list.add((String)object3);
                    continue;
                }
                cqi cqi2 = ((amc)object2).FC().gH(n);
                String string6 = node3.getNodeValue();
                try {
                    object3 = cqi2.hP(string6);
                }
                catch (Exception exception) {
                    string4 = "Could not parse attribute: Filename='" + string + "', AttributeName='" + string5 + "', AttributeValue='" + node3.getNodeValue() + "': " + exception.toString();
                    ct.error(string4);
                    list.add(string4);
                    continue;
                }
                int n2 = cqi2.u(object3);
                if (n2 != 0) {
                    string4 = cqi2.sD(n2) + ": Filename='" + string + "', AttributeName='" + string5 + "', AttributeValue='" + node3.getNodeValue() + "'";
                    ct.error(string4);
                    list.add(string4);
                    continue;
                }
                if (object3 == null) continue;
                ((amc)object2).a(n, object3);
            }
            linkedList.add(object2);
        }
        return linkedList;
    }

    private Node a(String string, List<String> list, lju lju2) {
        Object object;
        Object object2;
        Document document;
        try {
            document = this.tG(string);
        }
        catch (Exception exception) {
            String string2 = exception.toString();
            ct.error(string2);
            list.add(string2);
            return null;
        }
        Node node = null;
        Object object3 = document.getChildNodes();
        for (int i = 0; i < object3.getLength(); ++i) {
            object2 = object3.item(i);
            if (object2.getNodeType() != 1) continue;
            node = object2;
            break;
        }
        if (node == null) {
            object3 = "missing root node";
            ct.error((String)object3);
            list.add((String)object3);
            return null;
        }
        object3 = null;
        for (object = node.getFirstChild(); object != null; object = object.getNextSibling()) {
            if (object.getNodeType() != 1 || !object.getNodeName().equalsIgnoreCase("VersionInformation")) continue;
            object3 = object;
            break;
        }
        if (object3 == null) {
            object = "no <VersionInformation> node!";
            ct.error((String)object);
            list.add((String)object);
        } else {
            try {
                object = jsu.C((Node)object3);
            }
            catch (bg bg2) {
                String string3 = "could not parse version node: " + bg2.toString();
                ct.error(string3);
                list.add(string3);
                return null;
            }
            if (!lju2.b((lju)object)) {
                object2 = "version mismatch: expected " + lju2 + ", found " + object;
                ct.error((String)object2);
                list.add((String)object2);
                return null;
            }
            node.removeChild((Node)object3);
        }
        return node;
    }

    private Document tG(String string) {
        Document document;
        try {
            document = nWz.parse(new File(jry.tp(string)));
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new bh(string, fileNotFoundException);
        }
        catch (SAXParseException sAXParseException) {
            throw new bv(string, sAXParseException.getLineNumber(), sAXParseException.getColumnNumber(), sAXParseException.getMessage(), sAXParseException);
        }
        catch (Exception exception) {
            throw new bg(exception);
        }
        return document;
    }

    public List a(String string, String string2, String[] stringArray, List<Object>[] listArray, amc[] amcArray, lju lju2) {
        Object object;
        List<Object> list;
        int n;
        NodeList nodeList;
        assert (stringArray.length == listArray[0].size());
        assert (listArray.length == amcArray.length);
        assert (!this.bu(stringArray));
        assert (!this.bu(listArray));
        assert (!this.bu(amcArray));
        LinkedList<String> linkedList = new LinkedList<String>();
        Class[] classArray = new Class[stringArray.length];
        for (int i = 0; i < classArray.length; ++i) {
            classArray[i] = listArray[0].get(i).getClass();
        }
        try {
            nodeList = this.a(string, string2, lju2);
        }
        catch (Exception exception) {
            linkedList.add(exception.toString() + ": " + exception.getMessage());
            return linkedList;
        }
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        for (n = 0; n < nodeList.getLength(); ++n) {
            list = nodeList.item(n);
            assert (list.getNodeName().equals(string2));
            object = new ArrayList(stringArray.length);
            for (int i = 0; i < stringArray.length; ++i) {
                Object object2 = null;
                try {
                    object2 = jsu.a((Node)((Object)list), stringArray[i], classArray[i]);
                }
                catch (bp bp2) {
                    linkedList.add(bp2.toString() + ": " + bp2.getMessage());
                }
                object.add(object2);
            }
            hashMap.put(object, list);
        }
        for (n = 0; n < listArray.length; ++n) {
            Object object3;
            list = listArray[n];
            object = (Node)hashMap.get(list);
            if (object == null) {
                object3 = new StringBuilder(4096);
                for (int i = 0; i < stringArray.length; ++i) {
                    if (((StringBuilder)object3).length() > 0) {
                        ((StringBuilder)object3).append(", ");
                    }
                    ((StringBuilder)object3).append(stringArray[i]);
                    ((StringBuilder)object3).append("=");
                    ((StringBuilder)object3).append(list.get(i));
                }
                linkedList.add("Node Not Found: Filename='" + string + "', NodeType='" + string2 + "': Keyset={" + ((StringBuilder)object3).toString() + "}");
                continue;
            }
            object3 = amcArray[n];
            NamedNodeMap namedNodeMap = object.getAttributes();
            for (int i = 0; i < namedNodeMap.getLength(); ++i) {
                String string3;
                Object object4;
                cqi cqi2;
                int n2;
                Node node = namedNodeMap.item(i);
                String string4 = node.getNodeName();
                int n3 = ((amc)object3).FC().dm(string4);
                if (n3 == -1) {
                    int n4;
                    for (n4 = 0; n4 < stringArray.length && !stringArray[n4].equalsIgnoreCase(string4); ++n4) {
                    }
                    if (n4 < stringArray.length) continue;
                    linkedList.add("Unknown Attribute: Filename='" + string + "', NodeType='" + string2 + "': AttributeName='" + string4 + "', AttributeValue='" + node.getNodeValue() + "'");
                }
                if ((n2 = (cqi2 = ((amc)object3).FC().gH(n3)).u(object4 = cqi2.hP(string3 = node.getNodeValue()))) != 0) {
                    linkedList.add(cqi2.sD(n2) + ": Filename='" + string + "', NodeType='" + string2 + "':  AttributeName='" + string4 + "', AttributeValue='" + node.getNodeValue() + "'");
                }
                ((amc)object3).a(n3, object4);
            }
        }
        return linkedList;
    }

    private NodeList a(String string, String string2, lju lju2) {
        Document document;
        try {
            document = nWz.parse(new File(jry.tp(string)));
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new bh(string);
        }
        catch (SAXParseException sAXParseException) {
            throw new bv(string, sAXParseException.getLineNumber(), sAXParseException.getColumnNumber(), sAXParseException.getMessage(), sAXParseException);
        }
        catch (Exception exception) {
            throw new bg(exception);
        }
        Object object = jsu.c(document);
        if (object == null) {
            throw new bn("VersionInformation");
        }
        if (!lju2.b((lju)object)) {
            throw new bk(lju2, (lju)object);
        }
        object = document.getElementsByTagName(string2);
        return object;
    }

    private boolean bu(Object[] objectArray) {
        for (int i = 0; i < objectArray.length; ++i) {
            if (objectArray[i] != null) continue;
            return true;
        }
        return false;
    }
}

