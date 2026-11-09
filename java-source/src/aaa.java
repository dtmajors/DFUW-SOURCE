/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class aaa
extends yy {
    private int ResourceType = -1;

    public int az() {
        return this.ResourceType;
    }

    protected aaa(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcm, n, n2);
    }

    @Override
    public boolean xo() {
        return false;
    }

    @Override
    public boolean i(Element element) {
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

    protected aaa a(aaa aaa2) {
        if (aaa2 != null) {
            aaa2.ResourceType = this.ResourceType;
        }
        return aaa2;
    }
}

