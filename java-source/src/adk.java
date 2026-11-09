/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adk
extends acp {
    private int ResourceType = -1;
    private boolean bcD = false;

    public int az() {
        return this.ResourceType;
    }

    public boolean xA() {
        return this.bcD;
    }

    protected adk(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bef, n, n2);
    }

    protected adk(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bef, n, n2, string);
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
        String string = element.getAttribute("resource_name");
        if (string == null || string.isEmpty()) {
            return false;
        }
        this.ResourceType = lea.enW().getType(string);
        if (this.ResourceType < 0) {
            return false;
        }
        String string2 = element.getAttribute("consume");
        if (string2 == null || string2.isEmpty()) {
            return false;
        }
        this.bcD = Boolean.parseBoolean(string2);
        return true;
    }

    protected adk a(adk adk2) {
        if (adk2 != null) {
            adk2.az(this.yo());
            adk2.ResourceType = this.ResourceType;
            adk2.bcD = this.bcD;
        }
        return adk2;
    }
}

