/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class xy
extends xj {
    private int bbC = -1;
    private int bbD = 0;

    public int wT() {
        return this.bbC;
    }

    public int wU() {
        return this.bbD;
    }

    protected xy(wy wy2, xl xl2, int n) {
        super(wy2, xl2, xm.bbt, n);
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("faction");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.bbC = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        String string2 = element.getAttribute("standing");
        if (string2 == null || string2.isEmpty()) {
            return false;
        }
        try {
            this.bbD = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    protected xy a(xy xy2) {
        if (xy2 != null) {
            xy2.bbC = this.bbC;
            xy2.bbD = this.bbD;
        }
        return xy2;
    }
}

