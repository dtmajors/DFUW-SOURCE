/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class kaf {
    public void vQ(String string) {
        Document document = null;
        document = jsy.tK(string);
        if (document == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parsePlayerPhysicsFile: could not load file " + string);
            return;
        }
        Node node = jsy.a("XML", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parsePlayerPhysicsFile: could not find node XML");
            return;
        }
        Node node2 = jsy.a("SphereScale", node);
        if (node2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parsePlayerPhysicsFile: could not find node SphereScale");
            return;
        }
        if (!(node2 instanceof Element)) {
            lfn.b(5, this.getClass().getSimpleName(), "parsePlayerPhysicsFile: could not find element SphereScale");
            return;
        }
        String string2 = ((Element)node2).getAttribute("Value");
        if (string2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parsePlayerPhysicsFile: could not find value attribute in element SphereScale");
            return;
        }
        try {
            float f2 = Float.valueOf(string2).floatValue();
            lea.epS().ip(f2);
        }
        catch (Exception exception) {
            lfn.b(5, this.getClass().getSimpleName(), "parsePlayerPhysicsFile: exception " + exception);
            return;
        }
    }
}

