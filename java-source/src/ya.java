/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class ya
extends xj {
    private float bbH = 0.0f;
    private float bbI = 0.0f;

    public float wZ() {
        return this.bbH;
    }

    public float xa() {
        return this.bbI;
    }

    protected ya(wy wy2, xl xl2, int n) {
        super(wy2, xl2, xm.bbo, n);
    }

    @Override
    public boolean wK() {
        return true;
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("world_x");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.bbH = Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        String string2 = element.getAttribute("world_z");
        if (string2 == null || string2.isEmpty()) {
            return false;
        }
        try {
            this.bbI = Float.parseFloat(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    protected ya a(ya ya2) {
        if (ya2 != null) {
            ya2.bbH = this.bbH;
            ya2.bbI = this.bbI;
        }
        return ya2;
    }
}

