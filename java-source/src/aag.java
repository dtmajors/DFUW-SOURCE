/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class aag
extends yy {
    private int bcM = -1;

    public int xI() {
        return this.bcM;
    }

    protected aag(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcr, n, n2);
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("slide_id");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.bcM = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return this.bcM >= 0;
    }

    protected aag a(aag aag2) {
        if (aag2 != null) {
            aag2.bcM = this.bcM;
        }
        return aag2;
    }
}

