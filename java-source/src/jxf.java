/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
import org.w3c.dom.Document;

public class jxf
extends jsy {
    public cbx vd(String string) {
        lju lju2;
        cbx cbx2 = new cbx(true);
        Document document = this.ve(string);
        if (document == null || (lju2 = jsy.c(document)) == null || lju2.getMajor() != 0 || lju2.getMinor() == 1) {
            // empty if block
        }
        return cbx2;
    }

    public Document ve(String string) {
        Document document = jsy.tK("xml-files/object/physicalobject/" + string);
        return document;
    }
}

