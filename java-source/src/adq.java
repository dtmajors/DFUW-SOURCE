/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adq
extends acp {
    private int ResourceType = -1;
    private int asi = 0;
    private int beD = 0;

    public int az() {
        return this.ResourceType;
    }

    public int vf() {
        return this.asi;
    }

    protected adq(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bel, n, n2);
    }

    protected adq(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bel, n, n2, string);
    }

    @Override
    protected String yX() {
        return Integer.toString(this.beD);
    }

    @Override
    protected boolean a(String[] stringArray, int n) {
        try {
            this.beD = Integer.parseInt(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    protected int ze() {
        return this.beD;
    }

    protected void eq(int n) {
        if (this.beD == n) {
            return;
        }
        this.beD = n;
        if (this.zc() != null) {
            this.zc().JR(this.beD);
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
        return this.asi > 0;
    }

    protected adq a(adq adq2) {
        if (adq2 != null) {
            adq2.az(this.yo());
            adq2.ResourceType = this.ResourceType;
            adq2.asi = this.asi;
        }
        return adq2;
    }
}

