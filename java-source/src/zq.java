/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class zq
extends yy {
    private hc SC = hc.aaz;

    public hc hf() {
        return this.SC;
    }

    protected zq(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcb, n, n2);
    }

    @Override
    public boolean xp() {
        return false;
    }

    @Override
    protected boolean wP() {
        return false;
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("access_level");
        if (string == null || string.isEmpty()) {
            return false;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        if (n < 0) {
            return false;
        }
        this.SC = hc.getAccessLevelType(n);
        return this.SC != null;
    }

    protected zq a(zq zq2) {
        if (zq2 != null) {
            zq2.SC = this.SC;
        }
        return zq2;
    }
}

