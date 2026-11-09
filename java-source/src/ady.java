/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class ady
extends adx {
    private int ResourceType = -1;

    public int az() {
        return this.ResourceType;
    }

    protected ady(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bes, n, n2);
    }

    protected ady(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bes, n, n2, string);
    }

    @Override
    public boolean i(Element element) {
        if (super.i(element)) {
            if (element == null) {
                return false;
            }
            String string = element.getAttribute("resource_name");
            if (string == null || string.isEmpty()) {
                return false;
            }
            this.ResourceType = lea.enW().getType(string);
            return this.ResourceType >= 0;
        }
        return false;
    }

    protected ady a(ady ady2) {
        super.a(ady2);
        if (ady2 != null) {
            ady2.ResourceType = this.ResourceType;
        }
        return ady2;
    }
}

