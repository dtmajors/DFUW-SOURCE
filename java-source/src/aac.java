/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class aac
extends yy
implements xh {
    private static final double bcE = 5.0;
    private ldz.a bcF = null;
    private ldz.a bcG = null;
    private double bcH = 0.0;

    public ldz.a xE() {
        return this.bcF;
    }

    @Override
    protected boolean wP() {
        return false;
    }

    public aac(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bct, n, n2);
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
            this.av(this.bcF != null && this.bcG != null && this.bcF == this.bcG);
        }
        return this.xl();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz - this.bcH < 5.0) {
            return;
        }
        this.bcG = ldz2.enQ();
        this.xr();
        this.bcH = ldz2.rgz;
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("day_period");
        if (string == null || string.isEmpty()) {
            return false;
        }
        this.bcF = ldz.a.getValue(string);
        return this.bcF != null;
    }

    @Override
    public yy a(wy wy2, zb zb2) {
        aac aac2 = new aac(wy2, zb2, this.getID(), this.xk());
        aac2.bcF = this.bcF;
        return aac2;
    }
}

