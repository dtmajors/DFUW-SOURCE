/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class yb
extends xj {
    private int bbJ = -1;

    public int xb() {
        return this.bbJ;
    }

    protected yb(wy wy2, xl xl2, int n) {
        super(wy2, xl2, xm.bbp, n);
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
        String string = element.getAttribute("area_id");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.bbJ = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return this.bbJ >= 0;
    }

    protected yb a(yb yb2) {
        if (yb2 != null) {
            yb2.bbJ = this.bbJ;
        }
        return yb2;
    }
}

