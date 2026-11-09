/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class aad
extends yy
implements acc {
    private int aDf = -1;

    public int qS() {
        return this.aDf;
    }

    public aad(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bco, n, n2);
    }

    @Override
    public void at(boolean bl) {
        if (this.isActive()) {
            return;
        }
        super.at(bl);
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        xc xc2 = this.wF().wg();
        if (xc2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Quest Manager is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        xc2.a(this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        xc xc2 = this.wF().wg();
        if (xc2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Quest Manager is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        xc2.b(this);
        super.deactivate();
    }

    @Override
    public boolean xr() {
        if (this.xn()) {
            xc xc2 = this.wF().wg();
            if (xc2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "checkCondition() : Quest Manager is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
                assert (false);
                this.av(false);
            } else {
                this.av(xc2.dP(this.aDf));
            }
        }
        return this.xl();
    }

    @Override
    public void ej(int n) {
    }

    @Override
    public void ek(int n) {
        if (n == this.aDf) {
            this.av(true);
        }
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
        String string = element.getAttribute("quest_id");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.aDf = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return this.aDf >= 0;
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        aad aad2 = new aad(wy2, zb2, this.getID(), this.xk());
        aad2.aDf = this.aDf;
        return aad2;
    }
}

