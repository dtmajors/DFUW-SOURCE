/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class zs
extends yy {
    private boolean bcz = false;
    private boolean bcA = false;

    public boolean xw() {
        return this.bcz;
    }

    public boolean xx() {
        return this.bcA;
    }

    public zs(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcd, n, n2);
    }

    @Override
    public boolean xp() {
        return false;
    }

    @Override
    public boolean xr() {
        if (this.xn()) {
            this.av(this.bcA);
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
        String string = element.getAttribute("build_mode");
        if (string == null || string.isEmpty()) {
            return false;
        }
        this.bcz = string.toLowerCase().contains("debug");
        this.bcA = string.toLowerCase().contains("release");
        return true;
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        zs zs2 = new zs(wy2, zb2, this.getID(), this.xk());
        zs2.bcz = this.bcz;
        zs2.bcA = this.bcA;
        return zs2;
    }
}

