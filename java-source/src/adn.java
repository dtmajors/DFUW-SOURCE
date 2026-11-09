/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adn
extends acp {
    private static final int bbE = 1;
    private static final int bbF = 2;
    private int ResourceType = -1;
    private int asi = 0;
    private int aCH = 0;
    private int beC = 0;

    public int az() {
        return this.ResourceType;
    }

    public int vf() {
        return this.asi;
    }

    public int wV() {
        return this.aCH;
    }

    public boolean xB() {
        return (this.aCH & 1) == 1;
    }

    public boolean xC() {
        return (this.aCH & 2) == 2;
    }

    protected adn(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bei, n, n2);
    }

    protected adn(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bei, n, n2, string);
    }

    protected int ze() {
        return this.beC;
    }

    protected void eq(int n) {
        if (this.beC == n) {
            return;
        }
        this.beC = n;
        if (this.zc() != null) {
            this.zc().JR(this.beC);
        }
    }

    @Override
    protected jcn zd() {
        return new jcn(this.getID(), this.yp(), this.asi);
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

    protected adn a(adn adn2) {
        if (adn2 != null) {
            adn2.az(this.yo());
            adn2.ResourceType = this.ResourceType;
            adn2.asi = this.asi;
            adn2.aCH = this.aCH;
        }
        return adn2;
    }
}

