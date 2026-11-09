/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class adv
extends acp
implements xh {
    private ldz.a bcF = null;
    private ldz.a bcG = null;

    public ldz.a xE() {
        return this.bcF;
    }

    @Override
    protected boolean wP() {
        return false;
    }

    public adv(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.bey, n, n2);
    }

    public adv(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.bey, n, n2, string);
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
            this.aC(this.bcF != null && this.bcG != null && this.bcF == this.bcG);
        }
        return this.isComplete();
    }

    @Override
    public void doTick(ldz ldz2) {
        this.bcG = ldz2.enQ();
        this.yZ();
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
    public acp b(wy wy2, acr acr2) {
        adv adv2 = new adv(wy2, acr2, this.getID(), this.xk());
        adv2.az(this.yo());
        adv2.bcF = this.bcF;
        return adv2;
    }
}

