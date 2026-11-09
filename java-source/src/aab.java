/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class aab
extends yy {
    private int ResourceType = -1;
    private float mB = 0.0f;

    public int az() {
        return this.ResourceType;
    }

    public float xD() {
        return this.mB;
    }

    protected aab(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcn, n, n2);
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
        if (this.ResourceType < 0) {
            return false;
        }
        String string2 = element.getAttribute("distance");
        if (string2 == null || string2.isEmpty()) {
            return false;
        }
        try {
            this.mB = Float.parseFloat(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return !(this.mB <= 0.0f);
    }

    protected aab a(aab aab2) {
        if (aab2 != null) {
            aab2.ResourceType = this.ResourceType;
            aab2.mB = this.mB;
        }
        return aab2;
    }
}

