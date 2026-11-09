/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class aah
extends yy {
    private String bcN = null;

    public String xJ() {
        return this.bcN;
    }

    protected aah(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcl, n, n2);
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

    protected aah a(aah aah2) {
        if (aah2 != null) {
            aah2.bcN = this.bcN;
        }
        return aah2;
    }
}

