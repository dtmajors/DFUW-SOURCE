/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adr
extends acp {
    private int ResourceType = -1;

    public int az() {
        return this.ResourceType;
    }

    protected adr(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bem, n, n2);
    }

    protected adr(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bem, n, n2, string);
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
        return this.ResourceType >= 0;
    }

    protected adr a(adr adr2) {
        if (adr2 != null) {
            adr2.az(this.yo());
            adr2.ResourceType = this.ResourceType;
        }
        return adr2;
    }
}

