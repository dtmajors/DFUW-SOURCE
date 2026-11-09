/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class aea
extends acp {
    private int bcC = -1;

    public int xz() {
        return this.bcC;
    }

    protected aea(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.beu, n, n2);
    }

    protected aea(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.beu, n, n2, string);
    }

    @Override
    public boolean xo() {
        return false;
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

    protected aea a(aea aea2) {
        if (aea2 != null) {
            aea2.az(this.yo());
            aea2.bcC = this.bcC;
        }
        return aea2;
    }
}

