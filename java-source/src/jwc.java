/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jwc {
    lju fzk = new lju(0, 1);

    public lll uG(String string) {
        if (!(string = string.toLowerCase()).endsWith(".xml")) {
            string = string + ".xml";
        }
        Document document = null;
        try {
            document = jsy.tJ("worldbuilder/camera paths/" + string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.g(document, string);
    }

    public lll p(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            return null;
        }
        return this.g(document, jrw2.getName());
    }

    private lll g(Document document, String string) {
        lll lll2 = null;
        Node node = jsy.a("CameraPath", (Node)document);
        if (node == null) {
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (lju2.equals(this.fzk)) {
            lll2 = this.a(node, lju2);
        }
        return lll2;
    }

    private lll a(Node node, lju lju2) {
        Object object;
        Object object2;
        lll lll2 = new lll();
        List<Node> list = jsy.c("SFPosition", node);
        ArrayList<ljq> arrayList = lcn.abH(list.size());
        for (Node node2 : list) {
            object2 = node2.getAttributes();
            object = object2.getNamedItem("Index");
            if (object == null) {
                assert (false);
                return lll2;
            }
            int bl = Integer.parseInt(object.getNodeValue());
            ljq ljq2 = jsy.w(node2);
            arrayList.add(bl, ljq2);
        }
        lll2.d(arrayList);
        Object object3 = jsy.a("Duration", node);
        float f = jsy.o((Node)object3);
        lll2.setDuration(f);
        object3 = jsy.a("RotationStart", node);
        object2 = jsy.w((Node)object3);
        lll2.eF((ljq)object2);
        object3 = jsy.a("RotationEnd", node);
        object = jsy.w((Node)object3);
        lll2.eE((ljq)object);
        object3 = jsy.a("DoRotation", node);
        boolean bl = jsy.t((Node)object3);
        lll2.yM(bl);
        return lll2;
    }
}

