/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class aai
extends yy {
    private a bcO = a.bcP;

    protected a xK() {
        return this.bcO;
    }

    protected aai(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcs, n, n2);
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("weather_state");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.bcO = a.valueOf(a.class, string);
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    protected aai a(aai aai2) {
        if (aai2 != null) {
            aai2.bcO = this.bcO;
        }
        return aai2;
    }
}

