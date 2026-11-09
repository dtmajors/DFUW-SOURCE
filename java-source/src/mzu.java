/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;

public class mzu {
    lfn ga = lfn.eqw();
    Document cn = null;

    public Document ax(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        return document;
    }
}

