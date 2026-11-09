/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mzf {
    lfn ga = lfn.eqw();
    lju fzk = new lju(0, 1);

    public void eTu() {
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/worldbuilder/used_os_guids.xml");
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return;
        }
        this.h(document, jrw2.getName());
    }

    private void h(Document document, String string) {
        Node node = jsy.a("SFOSGUIDUsedList", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "Document [" + string + "] is invalid!");
            return;
        }
        lju lju2 = jsy.c(document);
        if (lju2 == null || !lju2.equals(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            return;
        }
        this.fr(node);
    }

    private void fr(Node node) {
        List<Node> list = jsy.c("OSGUID", node);
        for (Node node2 : list) {
            int n2 = jsy.r(node2);
            ldw ldw2 = ldx.enG().aci(n2);
            ldv ldv2 = new ldv(ldx.enG().ib(), n2, 0);
            ldw2.lK(ldv2);
            lfn.b(0, this.getClass().getSimpleName(), "getGUIDsAndAddThem() : Added Used OSGUID " + ldv2);
        }
    }
}

