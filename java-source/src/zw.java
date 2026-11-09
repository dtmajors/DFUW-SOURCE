/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class zw
extends yy {
    private int bbC = 0;
    private int bbD = 0;
    private xi bcy = xi.bbb;

    public int wT() {
        return this.bbC;
    }

    public int wU() {
        return this.bbD;
    }

    public xi xv() {
        return this.bcy;
    }

    protected zw(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bch, n, n2);
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
        String string3 = element.getAttribute("comparison_type");
        if (string3 == null || string3.isEmpty()) {
            return false;
        }
        this.bcy = xi.getValueByName(string3);
        return this.bcy != null;
    }

    protected zw a(zw zw2) {
        if (zw2 != null) {
            zw2.bbC = this.bbC;
            zw2.bbD = this.bbD;
            zw2.bcy = this.bcy;
        }
        return zw2;
    }
}

