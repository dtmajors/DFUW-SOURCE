/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jxb
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jwy {
    lfn ga = lfn.eqw();
    lju fzk = new lju(0, 1);
    private ldv iRG = null;

    public drs uX(String string) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/light/" + string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        return this.m(document, jry.tn(string));
    }

    private drs m(Document document, String string) {
        drs drs2 = null;
        Node node = jsy.a("SFLightManagerSetup", (Node)document);
        if (node != null) {
            lju lju2 = jsy.c(document);
            if (lju2 != null && lju2.equals(this.fzk)) {
                jxb jxb2 = new jxb(this.iRG);
                drs2 = jxb2.bY(node);
            } else {
                lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            }
        } else {
            lfn.b(5, this.getClass().getName(), "SFLIGHTMANAGER [" + string + "] is invalid!");
        }
        return drs2;
    }

    public ldv bQp() {
        return this.iRG;
    }

    public void pL(ldv ldv2) {
        this.iRG = ldv2;
    }
}

