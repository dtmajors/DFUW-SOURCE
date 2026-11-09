/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class xz
extends xj {
    private static final int bbE = 1;
    private static final int bbF = 2;
    private int ResourceType = -1;
    private int asi = 0;
    private int aCH = 0;
    private jck bbG = null;

    public int az() {
        return this.ResourceType;
    }

    public int vf() {
        return this.asi;
    }

    public int wV() {
        return this.aCH;
    }

    public boolean wW() {
        return this.aCH == 1;
    }

    public boolean wX() {
        return this.aCH == 2;
    }

    public jck wY() {
        if (this.bbG == null) {
            this.bbG = new jck(this.ResourceType, this.asi);
        }
        return this.bbG;
    }

    protected xz(wy wy2, xl xl2, int n) {
        super(wy2, xl2, xm.bbm, n);
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("resource_name");
        if (string == null || string.isEmpty()) {
            return false;
        }
        this.ResourceType = lea.enW().getType(string);
        if (this.ResourceType < 0) {
            return false;
        }
        String string2 = element.getAttribute("quantity");
        if (string2 == null || string2.isEmpty()) {
            return false;
        }
        try {
            this.asi = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        if (this.asi <= 0) {
            return false;
        }
        String string3 = element.getAttribute("inventory_type");
        if (string3.toLowerCase().contains("backpack")) {
            this.aCH = 1;
        }
        if (string3.toLowerCase().contains("bank")) {
            this.aCH = 2;
        }
        return this.aCH != 0;
    }

    protected xz a(xz xz2) {
        if (xz2 != null) {
            xz2.ResourceType = this.ResourceType;
            xz2.asi = this.asi;
            xz2.aCH = this.aCH;
            xz2.bbG = this.bbG;
        }
        return xz2;
    }
}

