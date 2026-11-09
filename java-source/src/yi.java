/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class yi
extends xj {
    private static final int bbE = 1;
    private static final int bbF = 2;
    private int ResourceType = -1;
    private int asi = 0;
    private int aCH = 0;

    public int az() {
        return this.ResourceType;
    }

    public int vf() {
        return this.asi;
    }

    public int wV() {
        return this.aCH;
    }

    public boolean xd() {
        return (this.aCH & 1) == 1;
    }

    public boolean xe() {
        return (this.aCH & 2) == 2;
    }

    protected yi(wy wy2, xl xl2, int n) {
        super(wy2, xl2, xm.bbn, n);
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
            this.aCH |= 1;
        }
        if (string3.toLowerCase().contains("bank")) {
            this.aCH |= 2;
        }
        return this.aCH != 0;
    }

    protected yi a(yi yi2) {
        if (yi2 != null) {
            yi2.ResourceType = this.ResourceType;
            yi2.asi = this.asi;
            yi2.aCH = this.aCH;
        }
        return yi2;
    }
}

