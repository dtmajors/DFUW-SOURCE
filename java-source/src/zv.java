/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class zv
extends yy {
    private int Race = 0;

    public int cB() {
        return this.Race;
    }

    protected zv(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcg, n, n2);
    }

    @Override
    public boolean xp() {
        return false;
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("race");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.Race = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return this.Race > 0 && this.Race <= 6;
    }

    protected zv a(zv zv2) {
        if (zv2 != null) {
            zv2.Race = this.Race;
        }
        return zv2;
    }
}

