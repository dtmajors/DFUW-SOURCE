/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kxp {
    private final lju oRy = new lju(0, 1, 0);
    private jzp oRz = new jzp();
    private les ResourceTree = lea.enW();
    private jta oQa = new jta();

    public Map<Integer, kxn> uH(String string) {
        if (string == null || string.trim().equals("")) {
            throw new bg("FileName is invalid.");
        }
        jrw jrw2 = jry.to(string);
        if (!jrw2.exists()) {
            throw new bg("SFFile '" + jrw2 + "' was not found.");
        }
        try {
            Object object;
            kxn kxn2;
            int n;
            int n2;
            Document document = jsy.n(jrw2);
            jsy.a(document, this.oRy);
            Map<Integer, kxn> map = lcn.emw();
            NodeList nodeList = document.getElementsByTagName("SFFilterRuleMulti");
            if (nodeList.getLength() > 0) {
                n2 = nodeList.getLength();
                for (n = 0; n < n2; ++n) {
                    try {
                        kxn2 = this.fi(nodeList.item(n));
                        object = ((kxo)kxn2).bqd;
                        for (int i = 0; i < ((int[])object).length; ++i) {
                            Integer n3 = new Integer(object[i]);
                            if (map.containsKey(n3)) {
                                throw new bg("FilterRule for resource '" + kxn2.fQ(object[i]) + "' already exist.");
                            }
                            map.put(n3, kxn2);
                        }
                        continue;
                    }
                    catch (bg bg2) {
                        throw new bg("Parsing of multi filterrule " + n + " failed.", bg2);
                    }
                }
            }
            if ((nodeList = document.getElementsByTagName("SFFilterRuleSingle")).getLength() > 0) {
                n2 = nodeList.getLength();
                for (n = 0; n < n2; ++n) {
                    try {
                        kxn2 = this.fj(nodeList.item(n));
                        object = new Integer(((kxq)kxn2).ResourceType);
                        if (map.containsKey(object)) {
                            throw new bg("FilterRule for resource '" + ((kxq)kxn2).pa() + "' already exist.");
                        }
                        map.put((Integer)object, kxn2);
                        continue;
                    }
                    catch (bg bg3) {
                        throw new bg("Parsing of single filterrule " + n + " failed.", bg3);
                    }
                }
            }
            return map;
        }
        catch (bg bg4) {
            throw new bg("Parsing of file '" + jrw2 + "' failed.", bg4);
        }
    }

    private kxo fi(Node node) {
        kxo kxo2 = new kxo();
        this.a(node, kxo2);
        List<Node> list = jsy.c("SFResource", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFResource' nodes found.");
        }
        int[] nArray = new int[list.size()];
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            try {
                Node node2 = list.get(i);
                String string = jsy.c(node2, "Name");
                if (string == null || string.trim().equals("")) {
                    throw new bg("Attribute 'Name' has invalid value.");
                }
                nArray[i] = this.ResourceTree.getType(string);
                if (nArray[i] > 0) continue;
                throw new bg("ResourceName '" + string + "' is invalid.");
            }
            catch (bg bg2) {
                throw new bg("Parsing of resourcename " + i + " failed.", bg2);
            }
        }
        kxo2.bqd = nArray;
        return kxo2;
    }

    private void a(Node node, kxn kxn2) {
        int n;
        String string;
        List<Node> list;
        Object object;
        List<Node> list2 = jsy.c("SFExceptionResource", node);
        int[] nArray = null;
        if (!list2.isEmpty()) {
            nArray = new int[list2.size()];
            int n2 = list2.size();
            for (int i = 0; i < n2; ++i) {
                try {
                    object = list2.get(i);
                    list = jsy.c((Node)object, "Name");
                    if (list == null || ((String)((Object)list)).trim().equals("")) {
                        throw new bg("Attribute 'Name' has invalid value.");
                    }
                    nArray[i] = this.ResourceTree.getType((String)((Object)list));
                    if (nArray[i] > 0) continue;
                    throw new bg("ExceptionResourceName '" + (String)((Object)list) + "' is invalid.");
                }
                catch (bg bg2) {
                    throw new bg("Parsing of exceptionresourcename " + i + " failed.", bg2);
                }
            }
        }
        if ((string = jsy.c(node, "AttributeConfigName")) == null || string.trim().equals("")) {
            throw new bg("Attribute 'AttributeConfigName' has invalid value.");
        }
        kxn.a a2 = kxn.a.getAttributeConfigType(string);
        if (a2 == null) {
            throw new bg("AttributeConfigName '" + string + "' is invalid.");
        }
        list2 = jsy.c("SFRuleForAttribute", node);
        if (list2.isEmpty()) {
            throw new bg("No 'SFRuleForAttribute' nodes found.");
        }
        object = jsy.c("SFRuleForEffect", node);
        list = jsy.c("SFRuleForProtection", node);
        if (list.size() > 1) {
            throw new bg("Too many 'SFRuleForProtection' nodes found: " + list.size());
        }
        kxt[] kxtArray = new kxt[list2.size() + object.size() + list.size()];
        int n3 = list2.size();
        int n4 = list2.size();
        for (n = 0; n < n4; ++n) {
            try {
                kxtArray[n] = this.fk(list2.get(n));
                continue;
            }
            catch (bg bg3) {
                throw new bg("Parsing of attribute " + n + " failed.", bg3);
            }
        }
        n4 = object.size();
        for (n = 0; n < n4; ++n) {
            try {
                kxtArray[n3 + n] = this.fl((Node)object.get(n));
                continue;
            }
            catch (bg bg4) {
                throw new bg("Parsing of effectrule " + n + " failed.", bg4);
            }
        }
        n3 = list2.size() + object.size();
        n4 = list.size();
        for (n = 0; n < n4; ++n) {
            try {
                kxtArray[n3 + n] = this.fm((Node)list.get(n));
                continue;
            }
            catch (bg bg5) {
                throw new bg("Parsing of protectionrule " + n + " failed.", bg5);
            }
        }
        kxn2.qgJ = nArray;
        kxn2.qgK = a2;
        kxn2.qgL = kxtArray;
    }

    private kxq fj(Node node) {
        kxq kxq2 = new kxq();
        this.a(node, kxq2);
        Node node2 = jsy.d("SFResource", node);
        String string = jsy.c(node2, "Name");
        if (string == null || string.trim().equals("")) {
            throw new bg("Attribute 'Name' has invalid value.");
        }
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bg("ResourceName '" + string + "' is invalid.");
        }
        kxq2.ResourceType = n;
        return kxq2;
    }

    private kxr fk(Node node) {
        String string = jsy.c(node, "Name");
        if (string == null || string.trim().equals("")) {
            throw new bg("Attribute 'Name' has invalid value.");
        }
        int n = ep.as((String)string);
        if (n <= 0) {
            throw new bg("AttributeName '" + string + "' is invalid.");
        }
        boolean bl = jsy.f(node, "SaveAttributeValue");
        kxr kxr2 = new kxr();
        kxr2.bnM = n;
        kxr2.qgQ = bl;
        return kxr2;
    }

    private kxs fl(Node node) {
        String string = jsy.c(node, "Name");
        if (string == null || string.trim().equals("")) {
            throw new bg("Effect 'Name' has invalid value.");
        }
        int n = lea.enT().getType(string);
        if (n <= 0) {
            throw new bg("EffectName '" + string + "' is invalid.");
        }
        boolean bl = jsy.f(node, "SaveAttributeValue");
        kxs kxs2 = new kxs();
        kxs2.aYG = n;
        kxs2.qgQ = bl;
        return kxs2;
    }

    private kxu fm(Node node) {
        boolean bl = jsy.f(node, "SaveAttributeValue");
        kxu kxu2 = new kxu();
        kxu2.qgQ = bl;
        return kxu2;
    }
}

