/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class ado
extends acp {
    private int ResourceType = -1;
    private float mB = 0.0f;

    public int az() {
        return this.ResourceType;
    }

    public float xD() {
        return this.mB;
    }

    protected ado(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bej, n, n2);
    }

    protected ado(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bej, n, n2, string);
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
        String string2 = element.getAttribute("distance");
        if (string2 == null || string2.isEmpty()) {
            return false;
        }
        try {
            this.mB = Float.parseFloat(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return !(this.mB <= 0.0f);
    }

    protected ado a(ado ado2) {
        if (ado2 != null) {
            ado2.az(this.yo());
            ado2.ResourceType = this.ResourceType;
            ado2.mB = this.mB;
        }
        return ado2;
    }
}

