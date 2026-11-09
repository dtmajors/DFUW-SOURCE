/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mzl {
    lfn ga = lfn.eqw();

    public moe at(jrw jrw2) {
        moe moe2 = new moe();
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        if (document != null) {
            moe2 = new moe();
            this.a(document, moe2);
        } else {
            lfn.b(5, "SFScatterConfigParser", "parseScatterConfigurationFile() : Invalid Document! [" + jrw2 + "]");
        }
        return moe2;
    }

    private void a(Document document, moe moe2) {
        Node node = jsy.a("SFScatterConfig", (Node)document);
        if (node == null) {
            return;
        }
        String string = "ScatterDescription";
        Node node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        moe2.setDescription(jsy.m(node2));
        string = "NumberOfObjects";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        moe2.aeZ(jsy.r(node2));
        string = "ScatterImageFilename";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        moe2.CG(jsy.m(node2));
        string = "AreaSize";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        moe2.k(jsy.y(node2));
        string = "ScatterObjectList";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        List<Node> list = jsy.c("SFScatterObject", node2);
        ArrayList<mof> arrayList = lcn.emv();
        assert (!list.isEmpty()) : "ScatterObjectList has no SFScatterObject!";
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            arrayList.add(this.ft(list.get(i)));
        }
        moe2.cw(arrayList);
    }

    private mof ft(Node node) {
        mof mof2 = new mof();
        String string = "MinDistanceToNextObject";
        Node node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        mof2.oB(jsy.o(node2));
        string = "WeightingPercent";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        mof2.afa(jsy.r(node2));
        string = "DescriptionFilename";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        mof2.CH(jsy.m(node2));
        string = "TypeColor";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        mof2.g(jsy.z(node2).emK());
        return mof2;
    }
}

