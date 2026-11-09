/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class zr
extends yy {
    private int Qw = 0;
    private xi bcy = xi.bbb;

    public int getAlignment() {
        return this.Qw;
    }

    public xi xv() {
        return this.bcy;
    }

    protected zr(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcc, n, n2);
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("alignment");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.Qw = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        String string2 = element.getAttribute("comparison_type");
        if (string2 == null || string2.isEmpty()) {
            return false;
        }
        this.bcy = xi.getValueByName(string2);
        return this.bcy != null;
    }

    protected zr a(zr zr2) {
        if (zr2 != null) {
            zr2.Qw = this.Qw;
            zr2.bcy = this.bcy;
        }
        return zr2;
    }
}

