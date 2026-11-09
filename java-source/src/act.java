/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class act
extends adk
implements abw {
    private ldv bcv = null;

    public act(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public act(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, n, n2, string);
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
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew2.a((abw)this);
    }

    @Override
    public void deactivate() {
        if (!this.isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Task Not Active!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "deactivate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Condition = " + this);
            assert (false);
            return;
        }
        cew2.b((abw)this);
        super.deactivate();
    }

    @Override
    public void g(int n, ldv ldv2) {
        if (n != this.az()) {
            return;
        }
        this.bcv = ldv2;
        this.aC(true);
    }

    @Override
    protected void b(gec gec2) {
        gec2.qi(this.bcv);
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new act(wy2, acr2, this.getID(), this.xk()));
    }
}

