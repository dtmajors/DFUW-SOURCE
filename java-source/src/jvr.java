/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvr {
    public static final lju oRy = new lju(0, 1, 0);

    public void ux(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFTimeStepList", node);
            if (list.isEmpty()) {
                return;
            }
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    Node node2 = list.get(i2);
                    String string2 = jsy.i(node2, "Name");
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Attribute 'Name' has invalid value.");
                    }
                    cxd.u u2 = cxd.u.getTimeStepListType(string2);
                    if (u2 == null) {
                        throw new bj("TimeStepListName '" + string2 + "' is invalid.");
                    }
                    List list2 = this.aC(node2);
                    if (cxj.a(u2)) {
                        throw new bg("A timesteplist already exists with type " + (Object)((Object)u2));
                    }
                    cxj.a(u2, list2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of timesteplist node " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private List aC(Node node) {
        List<Node> list = jsy.c("SFTimeStep", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFTimeStep' nodes found.");
        }
        ArrayList<ddw> arrayList = lcn.emv();
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                ddw ddw2 = this.aD(list.get(i2));
                arrayList.add(ddw2);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of propertyname node " + i2 + " failed.", bg2);
            }
        }
        return arrayList;
    }

    private ddw aD(Node node) {
        float f = jsy.e(node, "MinValue");
        float f2 = jsy.e(node, "MaxValue");
        float f3 = jsy.e(node, "TimeStepValue");
        String string = jsy.c(node, "CheckType");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'CheckType' has invalid value.");
        }
        ddw.a a2 = ddw.a.getCheckType(string);
        if (a2 == null) {
            throw new bj("CheckTypeName '" + string + "' is invalid.");
        }
        ddw ddw2 = new ddw(f, f2, f3, a2);
        return ddw2;
    }
}

