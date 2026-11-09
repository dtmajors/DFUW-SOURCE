/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  jzc
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class kap {
    private final lju paq = new lju(0, 1, 0);
    protected final jzc pbc = new jzc();

    public void dUX() {
        this.Y(lea.eoJ());
    }

    public void Y(Map<Integer, ctq> map) {
        try {
            for (Map.Entry<Integer, ctq> entry : map.entrySet()) {
                this.a(entry.getKey(), entry.getValue());
            }
        }
        catch (bg bg2) {
            lfn.print("Error writing inventories: " + bg2.getStackTrace());
        }
    }

    public void a(int n, ctq ctq2) {
        String string = cug.uQ((int)n);
        if (string == null || string.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "Resource type " + n + " has invalid inventory filename.");
            throw new bi("Resource type " + n + " has invalid inventory filename.");
        }
        Document document = this.pbc.dSD();
        Element element = document.createElement("XML");
        element.appendChild(this.pbc.b(document, this.paq));
        document.appendChild(element);
        Element element2 = document.createElement("SFLootInventory");
        this.a(document, string, element2, ctq2.fgc);
        element.appendChild(element2);
        Element element3 = document.createElement("SFSkinningInventory");
        this.a(document, string, element3, ctq2.fgg);
        element.appendChild(element3);
        String string2 = lcw.qLb + "xml-files/server/resourcecontainers/monster inventory/" + string;
        jsz.b(document, string2);
    }

    private void a(Document document, String string, Element element, List list) {
        for (Object e2 : list) {
            Object object;
            if (e2 instanceof cto) {
                object = (cto)e2;
                Element element2 = this.a(document, string, (cto)object, false);
                if (((cto)object).fgf != null) {
                    for (cto cto2 : ((cto)object).fgf) {
                        Element element3 = this.a(document, string, cto2, true);
                        element2.appendChild(element3);
                    }
                }
                element.appendChild(element2);
                continue;
            }
            if (e2 instanceof ArrayList) {
                if (((ArrayList)e2).size() < 1) {
                    lfn.b(5, this.getClass().getSimpleName(), "Empty random item  for '" + string + "'");
                    throw new bg(this.getClass().getSimpleName() + ": Empty random item  for '" + string + "'");
                }
                object = document.createElement("SFRandomItem");
                for (Object e3 : (ArrayList)e2) {
                    if (!(e3 instanceof cto)) continue;
                    Element element4 = this.a(document, string, (cto)e3, false);
                    object.appendChild(element4);
                }
                element.appendChild((Node)object);
                continue;
            }
            lfn.b(5, this.getClass().getSimpleName(), "Empty random item  for '" + string);
            throw new bg(this.getClass().getSimpleName() + ": Empty random item  for '" + string);
        }
    }

    private Element a(Document document, String string, cto cto2, boolean bl) {
        assert (cto2 != null);
        Element element = document.createElement("SFItem");
        if (!bl) {
            assert (cto2.Probability > 0.0f) : "Invalid probability item='" + cto2.pa() + "' inv='" + string + "'";
            if (cto2.Probability > 0.0f) {
                element.setAttribute("Probability", String.valueOf(cto2.Probability));
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "Invalid probability item=" + cto2.pa() + "' inv='" + string + "'");
                throw new bg(this.getClass().getSimpleName() + ": Invalid probability item='" + cto2.pa() + "' inv='" + string + "'");
            }
        }
        assert (cto2.asi > -1) : "Negative item '" + cto2.pa() + " quantity, inv='" + string + "'";
        if (cto2.asi > 0) {
            element.setAttribute("Quantity", String.valueOf(cto2.asi));
        } else if (cto2.asi == 0) {
            assert (cto2.dpS > -1) : "Negative item '" + cto2.pa() + " minquantity inv='" + string + "'";
            if (cto2.dpS > 0) {
                element.setAttribute("MinQuantity", String.valueOf(cto2.dpS));
            }
            assert (cto2.dpT > -1) : "Negative item '" + cto2.pa() + " maxquantity inv='" + string + "'";
            if (cto2.dpT > 0) {
                element.setAttribute("MaxQuantity", String.valueOf(cto2.dpT));
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "Negative item '" + cto2.pa() + " quantity inv='" + string + "'");
            throw new bg(this.getClass().getSimpleName() + ": Negative item '" + cto2.pa() + " quantity inv='" + string + "'");
        }
        element.setAttribute("Droppable", String.valueOf(cto2.fez));
        element.setAttribute("BuildType", String.valueOf(cto2.bcB));
        element.setAttribute("ResourceName", cto2.pa());
        return element;
    }
}

