/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class yc
extends xj {
    private int bbK = -1;

    public int xc() {
        return this.bbK;
    }

    protected yc(wy wy2, xl xl2, xm xm2, int n) {
        super(wy2, xl2, xm2, n);
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
        String string = element.getAttribute("sfx_name");
        if (string == null || string.isEmpty()) {
            return false;
        }
        this.bbK = del.dr(string);
        return this.bbK >= 0;
    }

    protected yc a(yc yc2) {
        if (yc2 != null) {
            yc2.bbK = this.bbK;
        }
        return yc2;
    }
}

