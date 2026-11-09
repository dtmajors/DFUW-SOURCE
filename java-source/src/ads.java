/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class ads
extends acp {
    private String bcN = null;

    public String xJ() {
        return this.bcN;
    }

    protected ads(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.ben, n, n2);
    }

    protected ads(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.ben, n, n2, string);
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
        this.bcN = element.getAttribute("vendor_id");
        return this.bcN != null && !this.bcN.isEmpty();
    }

    protected ads a(ads ads2) {
        if (ads2 != null) {
            ads2.az(this.yo());
            ads2.bcN = this.bcN;
        }
        return ads2;
    }
}

