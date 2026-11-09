/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import org.w3c.dom.Element;

public class zt
extends yy {
    private int bcB = 0;

    public int xy() {
        return this.bcB;
    }

    public zt(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bce, n, n2);
    }

    @Override
    public boolean xp() {
        return false;
    }

    @Override
    public boolean xr() {
        if (this.xn()) {
            this.av((lcw.bcB & this.bcB) == lcw.bcB);
        }
        return this.xl();
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
        String string = element.getAttribute("build_type");
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (string.toLowerCase().contains("western")) {
            this.bcB |= 1;
        }
        if (string.toLowerCase().contains("korean")) {
            this.bcB |= 2;
        }
        return true;
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        zt zt2 = new zt(wy2, zb2, this.getID(), this.xk());
        zt2.bcB = this.bcB;
        return zt2;
    }
}

