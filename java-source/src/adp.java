/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adp
extends acp {
    private int bcC = -1;

    public int xz() {
        return this.bcC;
    }

    @Override
    protected boolean wP() {
        return false;
    }

    protected adp(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bek, n, n2);
    }

    protected adp(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bek, n, n2, string);
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

    protected adp a(adp adp2) {
        if (adp2 != null) {
            adp2.az(this.yo());
            adp2.bcC = this.bcC;
        }
        return adp2;
    }
}

