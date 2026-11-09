/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class aed
extends aec {
    private int ResourceType = -1;

    public int az() {
        return this.ResourceType;
    }

    protected aed(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bew, n, n2);
    }

    protected aed(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bew, n, n2, string);
    }

    @Override
    public boolean xo() {
        return false;
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

    protected aed a(aed aed2) {
        super.a(aed2);
        if (aed2 != null) {
            aed2.ResourceType = this.ResourceType;
        }
        return aed2;
    }
}

