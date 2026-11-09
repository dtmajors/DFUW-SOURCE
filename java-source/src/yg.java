/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class yg
extends yc {
    private int ResourceType = -1;

    public int az() {
        return this.ResourceType;
    }

    protected yg(wy wy2, xl xl2, xm xm2, int n) {
        super(wy2, xl2, xm2, n);
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

    protected yg a(yg yg2) {
        super.a(yg2);
        if (yg2 != null) {
            yg2.ResourceType = this.ResourceType;
        }
        return yg2;
    }
}

