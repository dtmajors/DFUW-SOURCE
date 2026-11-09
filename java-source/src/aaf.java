/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class aaf
extends yy
implements xh {
    private int bcK = 0;
    private int bcL = -1;

    public int xH() {
        return this.bcK;
    }

    @Override
    protected boolean wP() {
        return false;
    }

    public aaf(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcq, n, n2);
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
        this.wF().wg().a(this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Condition Not Active!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        this.wF().wg().b(this);
        super.deactivate();
    }

    @Override
    public boolean xo() {
        return true;
    }

    @Override
    public boolean xr() {
        if (this.xn()) {
            this.av(this.bcK == this.bcL / 60 / 60);
        }
        return this.xl();
    }

    @Override
    public void doTick(ldz ldz2) {
        this.bcL = ldz2.enR();
        this.xr();
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("hour_of_day");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.bcK = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        aaf aaf2 = new aaf(wy2, zb2, this.getID(), this.xk());
        aaf2.bcK = this.bcK;
        return aaf2;
    }
}

