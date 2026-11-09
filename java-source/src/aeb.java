/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class aeb
extends acp
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

    public aeb(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bex, n, n2);
    }

    public aeb(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bex, n, n2, string);
    }

    @Override
    public void activate() {
        if (this.isActive()) {
            return;
        }
        super.activate();
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
    public boolean yZ() {
        if (this.xn()) {
            this.aC(this.bcK == this.bcL / 60 / 60);
        }
        return this.isComplete();
    }

    @Override
    public void doTick(ldz ldz2) {
        this.bcL = ldz2.enR();
        this.yZ();
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
    public acp b(wy wy2, acr acr2) {
        aeb aeb2 = new aeb(wy2, acr2, this.getID(), this.xk());
        aeb2.az(this.yo());
        aeb2.bcK = this.bcK;
        return aeb2;
    }
}

