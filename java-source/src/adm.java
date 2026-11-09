/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adm
extends acp {
    private int ResourceType = -1;
    private int asi = -1;
    private int beB = 0;

    public int az() {
        return this.ResourceType;
    }

    public int vf() {
        return this.asi;
    }

    protected adm(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.beh, n, n2);
    }

    protected adm(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.beh, n, n2, string);
    }

    @Override
    protected String yX() {
        return Integer.toString(this.beB);
    }

    @Override
    protected boolean a(String[] stringArray, int n) {
        try {
            this.beB = Integer.parseInt(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    protected int ze() {
        return this.beB;
    }

    protected void eq(int n) {
        if (this.beB == n) {
            return;
        }
        this.beB = n;
        if (this.zc() != null) {
            this.zc().JR(this.beB);
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

    protected adm a(adm adm2) {
        if (adm2 != null) {
            adm2.az(this.yo());
            adm2.ResourceType = this.ResourceType;
            adm2.asi = this.asi;
        }
        return adm2;
    }
}

