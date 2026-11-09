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

public class jvm {
    public static final lju oRy = new lju(0, 1, 0);

    public void uv(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFStateObjectDefinition", node);
            if (list.isEmpty()) {
                return;
            }
            Map<ie, id> map = lea.eoB();
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    id id2 = this.ax(list.get(i2));
                    ie ie2 = id2.na();
                    if (map.containsKey(ie2)) {
                        throw new bg("StateObjectDefinition with key=" + ie2 + " already exists.");
                    }
                    map.put(ie2, id2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of stateobjectdefinition node " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private id ax(Node node) {
        int n;
        int n2;
        hl hl2;
        hl[] hlArray;
        String string;
        Node node2 = jsy.d("SFStateObjectName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFStateObjectName' has invalid value.");
        }
        ahu.c c2 = ahu.c.getStateObjectType(string2);
        if (c2 == null) {
            throw new bj("StateObjectName '" + string2 + "' is invalid.");
        }
        node2 = jsy.a("SFObjectName", node);
        int n3 = 0;
        if (node2 != null) {
            string = jsy.m(node2);
            if (string == null || string.trim().equals("")) {
                throw new bj("Node 'SFObjectName' has invalid value.");
            }
            n3 = amh.dn(string);
            if (n3 <= 0) {
                throw new bj("ObjectName '" + string + "' is invalid.");
            }
        }
        if ((string = jsy.m(node2 = jsy.d("SFKeyName", node))) == null || string.trim().equals("")) {
            throw new bj("Node 'SFKeyName' has invalid value.");
        }
        int n4 = gk.aG(string);
        if (n4 <= 0) {
            throw new bj("KeyName '" + string + "' is invalid.");
        }
        id id2 = null;
        id2 = gk.bK(n4) ? new if() : new id();
        id2.afi = c2;
        id2.ObjectType = n3;
        id2.afj = n4;
        List<Node> list = jsy.c("SFPropertyDefinitionGeneral", node);
        if (!list.isEmpty()) {
            hlArray = new hm[list.size()];
            hl2 = null;
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                try {
                    hl2 = this.ay(list.get(n));
                    if (this.a(hl2, hlArray)) {
                        throw new bg("PropertyDefinition '" + ((hm)hl2).getEventPropertyName() + "' has already been added to GeneralPropertyDefinitions array.");
                    }
                    if (n != ((hm)hl2).adk) {
                        throw new bg("i=" + n + " PropertyDefinition.Index=" + ((hm)hl2).adk);
                    }
                    hlArray[n] = hl2;
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of propertydefinition node " + n + " failed for stateobjectdefinition '" + id2.nb() + "'", bg2);
                }
            }
            id2.afk = hlArray;
        }
        if (!(list = jsy.c("SFPropertyDefinitionSpecific", node)).isEmpty()) {
            hlArray = new hn[list.size()];
            hl2 = null;
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                try {
                    hl2 = this.az(list.get(n));
                    if (this.a(hl2, hlArray)) {
                        throw new bg("PropertyDefinition has already been added to SpecificPropertyDefinitions array.");
                    }
                    if (n != ((hn)hl2).adk) {
                        throw new bg("i=" + n + " PropertyDefinition.Index=" + ((hn)hl2).adk);
                    }
                    hlArray[n] = hl2;
                    continue;
                }
                catch (bg bg3) {
                    throw new bg("Parsing of propertydefinition node " + n + " failed for stateobjectdefinition '" + id2.nb() + "'", bg3);
                }
            }
            id2.afl = hlArray;
        }
        return id2;
    }

    private hm ay(Node node) {
        hm hm2 = new hm();
        this.a(node, hm2);
        Node node2 = jsy.d("SFEventPropertyName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFEventPropertyName' has invalid value.");
        }
        ahu.b b2 = ahu.b.getEventPropertyType(string);
        if (b2 == null) {
            throw new bj("EventPropertyName '" + string + "' is invalid.");
        }
        hm2.Ul = b2;
        return hm2;
    }

    private hn az(Node node) {
        hn hn2 = new hn();
        this.a(node, hn2);
        List<Node> list = jsy.c("SFEventPropertySet", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFEventPropertySet' nodes found.");
        }
        gc[] gcArray = new gc[list.size()];
        gc gc2 = null;
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                gc2 = this.aA(list.get(i2));
                if (this.a(gc2, gcArray)) {
                    throw new bg("EventPropertySet " + i2 + " has already been added to PropertySets array.");
                }
                gcArray[i2] = gc2;
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of eventpropertysets node " + i2 + " failed.", bg2);
            }
        }
        hn2.adm = gcArray;
        return hn2;
    }

    private void a(Node node, hl hl2) {
        Node node2 = jsy.d("SFIndex", node);
        int n = jsy.r(node2);
        if (n < 0) {
            throw new bj("Node 'SFIndex' has invalid value.");
        }
        List<Node> list = jsy.c("SFKeyName", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFKeyName' nodes found.");
        }
        int[] nArray = new int[list.size()];
        String string = null;
        int n2 = 0;
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            try {
                string = jsy.m(list.get(i2));
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node 'SFKeyName' at index " + i2 + " has invalid value.");
                }
                n2 = gk.aG(string);
                if (n2 <= 0) {
                    throw new bj("KeyName '" + string + "' is invalid.");
                }
                if (this.d(n2, nArray)) {
                    throw new bg("KeyType '" + string + "' has already been added to KeyTypes array.");
                }
                nArray[i2] = n2;
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of keyname node " + i2 + " failed.", bg2);
            }
        }
        hl2.adk = n;
        hl2.adl = nArray;
    }

    private gc aA(Node node) {
        Node node2 = jsy.d("SFEventPropertyName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFEventPropertyName' has invalid value.");
        }
        ahu.b b2 = ahu.b.getEventPropertyType(string);
        if (b2 == null) {
            throw new bj("EventPropertyName '" + string + "' is invalid.");
        }
        List<Node> list = jsy.c("SFPropertyName", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFPropertyName' nodes found.");
        }
        int[] nArray = new int[list.size()];
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                String string2 = jsy.m(list.get(i2));
                if (string2 == null || string2.trim().equals("")) {
                    throw new bj("Node 'SFPropertyName' at index " + i2 + " has invalid value.");
                }
                int n2 = this.a(b2, string2);
                if (n2 <= 0) {
                    throw new bg("PropertyName '" + string2 + "' for eventproperty '" + string + "' is invalid.");
                }
                if (this.d(n2, nArray)) {
                    throw new bg("PropertyID '" + string2 + "' has already been added to PropertyIDs array.");
                }
                nArray[i2] = n2;
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of propertyname node " + i2 + " failed.", bg2);
            }
        }
        return new gc(b2, nArray);
    }

    private boolean a(gc gc2, gc[] gcArray) {
        assert (gc2 != null);
        assert (gcArray != null);
        int n = gcArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (gcArray[i2] == null || !gcArray[i2].equals(gc2)) continue;
            return true;
        }
        return false;
    }

    private boolean a(hl hl2, hl[] hlArray) {
        assert (hl2 != null);
        assert (hlArray != null);
        int n = hlArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (hlArray[i2] == null || !hlArray[i2].equals(hl2)) continue;
            return true;
        }
        return false;
    }

    private boolean d(int n, int[] nArray) {
        assert (n > 0);
        assert (nArray != null);
        int n2 = nArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (nArray[i2] != n) continue;
            return true;
        }
        return false;
    }

    private int a(ahu.b b2, String string) {
        switch (b2) {
            case blP: {
                if (ep.at((String)string)) {
                    return ep.as((String)string);
                }
                throw new bg("AttributeName '" + string + "' is invalid.");
            }
        }
        throw new bg("EventPropertyType '" + b2.name() + "' is invalid.");
    }
}

