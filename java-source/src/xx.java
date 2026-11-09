/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class xx
extends xj {
    private int Qw = 0;

    public int getAlignment() {
        return this.Qw;
    }

    protected xx(wy wy2, xl xl2, int n) {
        super(wy2, xl2, xm.bbu, n);
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
        return true;
    }

    protected xx a(xx xx2) {
        if (xx2 != null) {
            xx2.Qw = this.Qw;
        }
        return xx2;
    }
}

