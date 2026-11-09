/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jzk {
    public static final lju oRy = new lju(0, 1, 0);

    public void vG(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            int n;
            Object object;
            Document document = jsy.tJ(string);
            jsy.a(document, oRy);
            Map map = lea.eoo();
            NodeList nodeList = document.getElementsByTagName("SFClass");
            if (nodeList.getLength() != 0) {
                object = null;
                for (n = 0; n < nodeList.getLength(); ++n) {
                    try {
                        object = this.cC(nodeList.item(n));
                        if (map.containsKey(((duf)object).getName())) {
                            throw new bg("A class with name='" + ((duf)object).getName() + "' already exist in the map.");
                        }
                        map.put(((duf)object).getName(), object);
                        map.put(((duf)object).bAZ(), object);
                        continue;
                    }
                    catch (bg bg2) {
                        throw new bg("Parsing of class " + n + " failed.", bg2);
                    }
                }
            }
            nodeList = document.getElementsByTagName("SFEnumeration");
            if (nodeList.getLength() != 0) {
                object = null;
                for (n = 0; n < nodeList.getLength(); ++n) {
                    try {
                        object = this.cE(nodeList.item(n));
                        if (map.containsKey(((dug)object).getName())) {
                            throw new bg("An enumeration with name='" + ((dug)object).getName() + "' already exist in the map.");
                        }
                        map.put(((dug)object).getName(), object);
                        continue;
                    }
                    catch (bg bg3) {
                        throw new bg("Parsing of enumeration " + n + " failed.", bg3);
                    }
                }
            }
        }
        catch (bg bg4) {
            throw new bg("Parsing of file '" + string + "' failed.", bg4);
        }
    }

    private duf cC(Node node) {
        List<Node> list;
        Node node2 = jsy.d("SFName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        node2 = jsy.d("SFPackageName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFPackageName' has invalid value.");
        }
        node2 = jsy.d("SFConstantName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFPackageName' has invalid value.");
        }
        if (string3.equalsIgnoreCase("NULL")) {
            string3 = null;
        }
        if ((list = jsy.c("SFField", node)).isEmpty()) {
            throw new bj("No 'SFField' nodes found for class '" + string + "'");
        }
        duj[] dujArray = new duj[list.size()];
        for (int i2 = 0; i2 < dujArray.length; ++i2) {
            dujArray[i2] = this.cD(list.get(i2));
        }
        duf duf2 = new duf();
        duf2.setName(string);
        duf2.setPackageName(string2);
        duf2.jy(string3);
        duf2.a(dujArray);
        return duf2;
    }

    private duj cD(Node node) {
        Node node2 = jsy.d("SFName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        node2 = jsy.d("SFValueName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFValueName' has invalid value.");
        }
        int n = duk.jA(string2);
        if (n <= 0) {
            throw new bj("ValueName '" + string2 + "' is invalid.");
        }
        node2 = jsy.d("SFConstraintName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFConstraintName' has invalid value.");
        }
        int n2 = duk.jB(string3);
        if (n2 <= 0) {
            throw new bj("ConstraintName '" + string3 + "' is invalid.");
        }
        duj duj2 = new duj();
        duj2.setName(string);
        duj2.Cp(n);
        duj2.Cq(n2);
        return duj2;
    }

    private dug cE(Node node) {
        Node node2 = jsy.d("SFName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        node2 = jsy.d("SFClassName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFClassName' has invalid value.");
        }
        node2 = jsy.d("SFValueName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFValueName' has invalid value.");
        }
        int n = duk.jA(string3);
        if (n <= 0) {
            throw new bj("ValueName '" + string3 + "' is invalid.");
        }
        if (n != 1 && n != 4 && n != 6) {
            throw new bj("ValueName '" + string3 + "' is invalid.");
        }
        List<Node> list = jsy.c("SFEnumerationItem", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFEnumerationItem' nodes found for enumeration '" + string + "'");
        }
        dui[] duiArray = new dui[list.size()];
        for (int i2 = 0; i2 < duiArray.length; ++i2) {
            duiArray[i2] = this.cF(list.get(i2));
        }
        dug dug2 = new dug();
        dug2.setName(string);
        dug2.setClassName(string2);
        dug2.Cp(n);
        dug2.a(duiArray);
        return dug2;
    }

    private dui cF(Node node) {
        Node node2 = jsy.d("SFName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        node2 = jsy.d("SFValue", node);
        int n = jsy.r(node2);
        if (n < 0) {
            throw new bj("Node 'SFValue' has invalid value.");
        }
        dui dui2 = new dui();
        dui2.setName(string);
        dui2.setValue(n);
        return dui2;
    }
}

