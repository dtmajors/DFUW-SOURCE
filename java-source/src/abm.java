/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class abm
extends abj {
    private Set<Integer> bdB = null;

    @Override
    public boolean xX() {
        return false;
    }

    public abm(wy wy2, int n) {
        super(wy2, n, abo.bdH);
    }

    public abm(wy wy2, int n, String string) {
        super(wy2, n, abo.bdH, string);
    }

    protected abm(wy wy2, int n, abo abo2) {
        super(wy2, n, abo2);
    }

    protected abm(wy wy2, int n, abo abo2, String string) {
        super(wy2, n, abo2, string);
    }

    @Override
    public void c(acp acp2) {
        if (acp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "taskCompleted() : Task Parameter is Null!!!... Quest = " + this.wF() + ", Node = " + this);
            assert (false);
            return;
        }
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "taskCompleted() : Quest is Not Active!!!... Quest = " + this.wF() + ", Node = " + this + ", Task = " + acp2);
            assert (false);
            return;
        }
        ++this.bdc;
        if (this.bdc == this.xV()) {
            this.wF().b(this, true, false);
            this.wF().cj(this.ay(true));
            Set<acp> set = this.xY();
            for (acp acp3 : set) {
                if (this.bdB == null) {
                    this.bdB = lcn.emx();
                }
                if (this.bdB.contains(acp3.xk())) continue;
                this.bdB.add(acp3.xk());
                this.l(acp3.xk(), false);
            }
        }
    }

    @Override
    public aaz h(wy wy2) {
        return this.a(wy2, new abm(wy2, this.getID()));
    }
}

