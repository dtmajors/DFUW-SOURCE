/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class jxc {
    lfn ga = lfn.eqw();

    public void z(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            // empty catch block
        }
        if (document != null) {
            this.h(document, jrw2.getName());
        }
    }

    private void h(Document document, String string) {
        int n;
        NodeList nodeList = document.getElementsByTagName("SFObjectSpace");
        Object var4_4 = null;
        if (nodeList != null && nodeList.getLength() != 1) {
            return;
        }
        lju lju2 = jsy.c(document);
        if (lju2.getMajor() != 0 || lju2.getMinor() != 1) {
            return;
        }
        ldv ldv2 = null;
        String string2 = "noname";
        nodeList = document.getElementsByTagName("ObjectSpaceGuid");
        for (n = 0; n < nodeList.getLength(); ++n) {
            ldv2 = ldx.enG().aci(jsy.r(nodeList.item(0))).enA();
        }
        nodeList = document.getElementsByTagName("ObjectSpaceName");
        for (n = 0; n < nodeList.getLength(); ++n) {
            string2 = jsy.m(nodeList.item(0));
        }
        if (ldv2 == null) {
            return;
        }
        ldx.enG().aci(ldv2.enw()).lK(ldv2);
    }
}

