/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class yj
extends xj {
    private int bbL = -1;
    private jck bbG = null;

    public int xf() {
        return this.bbL;
    }

    public jck wY() {
        if (this.bbG == null) {
            this.bbG = new jck(this.bbL);
        }
        return this.bbG;
    }

    public yj(wy wy2, xl xl2, int n) {
        super(wy2, xl2, xm.bbv, n);
    }

    @Override
    public void perform() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "perform() : Quest is Not Active!!!... Quest = " + this.wF() + ", Action = " + this);
            assert (false);
            return;
        }
        this.wF().dL(this.bbL);
        super.perform();
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
        String string = element.getAttribute("item_id");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.bbL = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return this.bbL >= 0;
    }

    @Override
    public xj a(wy wy2, xl xl2) {
        yj yj2 = new yj(wy2, xl2, this.getID());
        yj2.bbL = this.bbL;
        yj2.bbG = this.bbG;
        return yj2;
    }
}

