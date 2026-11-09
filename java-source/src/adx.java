/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class adx
extends acp {
    private float Magnitude = 0.0f;
    private float beF = 0.0f;

    public float uO() {
        return this.Magnitude;
    }

    protected adx(wy wy2, acr acr2, int n, int n2) {
        this(wy2, acr2, acs.bef, n, n2);
    }

    protected adx(wy wy2, acr acr2, int n, int n2, String string) {
        this(wy2, acr2, acs.bef, n, n2, string);
    }

    protected adx(wy wy2, acr acr2, acs acs2, int n, int n2) {
        super(wy2, acr2, acs2, n, n2);
    }

    protected adx(wy wy2, acr acr2, acs acs2, int n, int n2, String string) {
        super(wy2, acr2, acs2, n, n2, string);
    }

    @Override
    protected String yX() {
        return Float.toString(this.beF);
    }

    @Override
    protected boolean a(String[] stringArray, int n) {
        try {
            this.beF = Float.parseFloat(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    protected float zf() {
        return this.beF;
    }

    protected void W(float f) {
        if (this.beF == f) {
            return;
        }
        this.beF = f;
        if (this.zc() != null) {
            this.zc().JR((int)this.beF);
        }
    }

    @Override
    protected jcn zd() {
        return new jcn(this.getID(), this.yp(), (int)this.Magnitude);
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("magnitude");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.Magnitude = Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return !(this.Magnitude <= 0.0f);
    }

    protected adx a(adx adx2) {
        if (adx2 != null) {
            adx2.az(this.yo());
            adx2.Magnitude = this.Magnitude;
        }
        return adx2;
    }
}

