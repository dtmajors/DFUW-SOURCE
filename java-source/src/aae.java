/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class aae
extends yy
implements xh {
    private double bcI = 0.0;
    private double bcJ = 0.0;

    public double xF() {
        return this.bcI;
    }

    public double xG() {
        return this.bcJ;
    }

    @Override
    public boolean xm() {
        return true;
    }

    @Override
    public double v(ldz ldz2) {
        return ldz2.rgz + this.bcJ;
    }

    public aae(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcp, n, n2);
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
        this.bcJ = this.bcI;
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
    public boolean xr() {
        if (this.xn()) {
            this.av(this.bcJ > 0.0);
        }
        return this.xl();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.bcJ > 0.0) {
            this.bcJ -= ldz2.qwh;
            if (this.bcJ < 0.0) {
                this.bcJ = 0.0;
            }
            this.xr();
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
        String string = element.getAttribute("timer_length");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.bcI = Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return !(this.bcI <= 0.0);
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        aae aae2 = new aae(wy2, zb2, this.getID(), this.xk());
        aae2.bcI = this.bcI;
        aae2.bcJ = this.bcJ;
        return aae2;
    }
}

