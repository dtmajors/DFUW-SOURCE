/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adl
extends acp {
    private int beA = -1;

    @Override
    public boolean yU() {
        return true;
    }

    @Override
    public boolean yV() {
        return this.beA >= 0;
    }

    @Override
    public int xT() {
        return this.beA;
    }

    protected adl(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.beg, n, n2);
    }

    protected adl(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.beg, n, n2, string);
    }

    @Override
    public boolean xo() {
        return false;
    }

    @Override
    public boolean i(Element element) {
        String string = element.getAttribute("reward_node_id");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.beA = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    protected adl a(adl adl2) {
        if (adl2 != null) {
            adl2.az(this.yo());
            adl2.beA = this.beA;
        }
        return adl2;
    }
}

