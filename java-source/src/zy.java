/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class zy
extends yy {
    private int ResourceType = -1;
    private boolean bcD = false;

    public int az() {
        return this.ResourceType;
    }

    public boolean xA() {
        return this.bcD;
    }

    protected zy(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bck, n, n2);
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

    protected zy a(zy zy2) {
        if (zy2 != null) {
            zy2.ResourceType = this.ResourceType;
            zy2.bcD = this.bcD;
        }
        return zy2;
    }
}

