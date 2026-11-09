/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class zx
extends yy {
    private int bcC = 0;

    public int xz() {
        return this.bcC;
    }

    protected zx(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bci, n, n2);
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
            this.bcC = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    protected zx a(zx zx2) {
        if (zx2 != null) {
            zx2.bcC = this.bcC;
        }
        return zx2;
    }
}

