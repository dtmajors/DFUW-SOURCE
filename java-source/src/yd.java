/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class yd
extends yc {
    private ljq Position = null;

    public ljq av() {
        return this.Position;
    }

    protected yd(wy wy2, xl xl2, xm xm2, int n) {
        super(wy2, xl2, xm2, n);
    }

    @Override
    public boolean i(Element element) {
        if (super.i(element)) {
            if (element == null) {
                return false;
            }
            String string = element.getAttribute("world_x");
            if (string == null || string.isEmpty()) {
                return false;
            }
            float f2 = 0.0f;
            try {
                f2 = Float.parseFloat(string);
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
            String string2 = element.getAttribute("world_y");
            if (string2 == null || string2.isEmpty()) {
                return false;
            }
            float f3 = 0.0f;
            try {
                f3 = Float.parseFloat(string2);
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
            String string3 = element.getAttribute("world_z");
            if (string3 == null || string3.isEmpty()) {
                return false;
            }
            float f4 = 0.0f;
            try {
                f4 = Float.parseFloat(string3);
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
            this.Position = new ljq(f2, f3, f4);
            return true;
        }
        return false;
    }

    protected yd a(yd yd2) {
        super.a(yd2);
        if (yd2 != null) {
            yd2.Position = this.Position;
        }
        return yd2;
    }
}

