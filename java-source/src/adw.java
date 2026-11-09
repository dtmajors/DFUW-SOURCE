/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public class adw
extends acp
implements acc {
    private int aDf = -1;

    public int qS() {
        return this.aDf;
    }

    public adw(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, acs.beq, n, n2);
    }

    public adw(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, acs.beq, n, n2, string);
    }

    @Override
    public void activate() {
        if (this.isActive()) {
            return;
        }
        super.activate();
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        this.wF().wg().a(this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        this.wF().wg().b(this);
        super.deactivate();
    }

    @Override
    public void ej(int n) {
        this.aC(n == this.aDf);
    }

    @Override
    public void ek(int n) {
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
    public acp b(wy wy2, acr acr2) {
        adw adw2 = new adw(wy2, acr2, this.getID(), this.xk());
        adw2.az(this.yo());
        adw2.aDf = this.aDf;
        return adw2;
    }
}

