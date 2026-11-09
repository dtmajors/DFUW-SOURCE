/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class acx
extends ado
implements aca {
    private float bcw = 0.0f;

    public acx(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public acx(wy wy2, acr acr2, int n, int n2, String string) {
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
        this.bcw = Float.MAX_VALUE;
        cew cew2 = this.wF().nY();
        if (cew2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew2.a((aca)this, this.az());
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
            lfn.b(5, this.getClass().getSimpleName(), "activate() : Player Object Client is Null!!!... Quest = " + this.wF() + ", Task = " + this);
            assert (false);
            return;
        }
        cew2.b((aca)this, this.az());
        super.deactivate();
    }

    @Override
    public boolean yZ() {
        if (this.xn()) {
            this.aC(this.bcw <= this.xD());
        }
        return this.isComplete();
    }

    @Override
    public void a(int n, float f, ldv ldv2, ljq ljq2) {
        this.bcw = f;
        this.yZ();
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new acx(wy2, acr2, this.getID(), this.xk()));
    }
}

