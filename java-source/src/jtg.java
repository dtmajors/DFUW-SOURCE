/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jtg {
    public fv J(String string, boolean bl) {
        Document document = jsy.tJ(string);
        jsy.a(document, new lju(0, 2, 0));
        try {
            Node node = jsy.d("SFClientObject", document);
            fv fv2 = this.a(node, bl);
            return fv2;
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private fv a(Node node, boolean bl) {
        Object object;
        Object object2;
        Node node2;
        assert (node != null) : "CONode is null!";
        fv fv2 = new fv();
        if (!bl) {
            node2 = jsy.d("SFUserName", node);
            object2 = jsy.m(node2);
            if (object2 == null || ((String)object2).trim().equals("")) {
                throw new bj("Node 'SFUserName' has invalid value.");
            }
            node2 = jsy.d("SFPersistentSessionObjectGUID", node);
            object = jsy.D(node2);
            if (object == null) {
                throw new bj("Node 'SFPersistentSessionObjectGUID' has invalid value.");
            }
            if (((ldv)object).enx() != 50) {
                throw new bj("PersistentSessionObjectGUID=" + object + " has invalid objectGUID.");
            }
            node2 = jsy.d("SFSessionObjectGUID", node);
            ldv ldv2 = jsy.D(node2);
            if (ldv2 == null) {
                throw new bj("Node 'SFSessionObjectGUID' has invalid value.");
            }
            node2 = jsy.d("SFServerOSGUID", node);
            ldv ldv3 = jsy.D(node2);
            if (ldv3 == null) {
                throw new bj("Node 'SFServerOSGUID' has invalid value.");
            }
            node2 = jsy.d("SFClientOSGUID", node);
            ldv ldv4 = jsy.D(node2);
            if (ldv4 == null) {
                throw new bj("Node 'SFClientOSGUID' has invalid value.");
            }
            fv2.d((String)object2);
            fv2.af((ldv)object);
            fv2.ag(ldv2);
            fv2.ah(ldv3);
            fv2.ai(ldv4);
        }
        if ((object2 = jsy.w(node2 = jsy.d("SFPosition", node))) == null) {
            throw new bj("Node 'SFPosition' has invalid value.");
        }
        node2 = jsy.d("SFRotation", node);
        object = jsy.E(node2);
        if (object == null) {
            throw new bj("Node 'SFRotation' has invalid value.");
        }
        fv2.c((ljq)object2);
        fv2.a((lgl)object);
        lfn.b(0, "SFClientObjectParser", "parseSFClientObjectNode() Created " + fv2);
        return fv2;
    }
}

