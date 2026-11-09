/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class abn
extends abm
implements za {
    private boolean bdA = false;
    private List<yy> bdy = lcn.emA();

    @Override
    public boolean xt() {
        return this.bdA;
    }

    @Override
    public void aw(boolean bl) {
        this.bdA = bl;
    }

    public abn(wy wy2, int n) {
        super(wy2, n, abo.bdI);
    }

    public abn(wy wy2, int n, String string) {
        super(wy2, n, abo.bdI, string);
    }

    @Override
    public boolean yw() {
        for (yy yy2 : this.bdy) {
            if (!yy2.xm()) continue;
            return false;
        }
        return true;
    }

    @Override
    protected String xU() {
        String string = this.yG();
        return string == null || string.isEmpty() ? super.xU() : string + ';' + super.xU();
    }

    @Override
    public void b(yy yy2) {
        this.bdy.add(yy2);
    }

    @Override
    public void c(yy yy2) {
        Set<Integer> set;
        Object object;
        if (yy2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "conditionChanged() : Condition Parameter is Null!!!... Quest = " + this.wF() + ", Node = " + this);
            assert (false);
            return;
        }
        if (yy2.xl()) {
            return;
        }
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "conditionChanged() : Quest is Not Active!!!... Quest = " + this.wF() + ", Node = " + this + ", Condition = " + yy2);
            assert (false);
            return;
        }
        if (!this.bdA) {
            object = this.bdy.iterator();
            while (object.hasNext()) {
                set = (yy)object.next();
                if (!yy2.xl()) continue;
                return;
            }
        }
        if ((object = this.xY()).isEmpty()) {
            if (this.bdA) {
                this.l(yy2.xk(), false);
            } else {
                this.wF().b(this, false, false);
                set = lcn.emx();
                for (yy yy3 : this.bdy) {
                    if (yy3.xl() || set.contains(yy3.xk())) continue;
                    set.add(yy3.xk());
                    this.l(yy3.xk(), false);
                }
            }
        } else {
            this.wF().b(this, true, false);
            this.wF().cj(this.ay(true));
            set = lcn.emx();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                acp acp2 = (acp)iterator.next();
                if (!acp2.isComplete() || set.contains(acp2.xk())) continue;
                set.add(acp2.xk());
                this.l(acp2.xk(), false);
            }
        }
    }

    private String yG() {
        String string = null;
        for (yy yy2 : this.bdy) {
            String string2 = yy2.wJ();
            if (string2 == null || string2.isEmpty()) continue;
            string = string == null ? string2 : string + ';' + string2;
        }
        return string;
    }

    @Override
    public void yh() {
        super.yh();
        for (yy yy2 : this.bdy) {
            yy2.at(true);
        }
    }

    @Override
    public void yi() {
        if (!this.isActive()) {
            return;
        }
        super.yi();
        if (!this.isActive()) {
            return;
        }
        for (yy yy2 : this.bdy) {
            if (yy2.xo() && yy2.xq()) {
                yy2.xr();
            }
            if (this.isActive()) continue;
            return;
        }
    }

    @Override
    public void yk() {
        super.yh();
        for (yy yy2 : this.bdy) {
            yy2.au(true);
        }
    }

    @Override
    public void yl() {
        for (yy yy2 : this.bdy) {
            yy2.deactivate();
        }
        super.yl();
    }

    @Override
    protected void c(aaz aaz2) {
        super.c(aaz2);
        if (!(aaz2 instanceof abn)) {
            return;
        }
        ((abn)aaz2).bdA = this.bdA;
    }

    @Override
    public aaz h(wy wy2) {
        return this.a(wy2, new abn(wy2, this.getID()));
    }

    @Override
    public void b(wy wy2, zb zb2) {
        if (zb2 == null) {
            return;
        }
        for (yy yy2 : this.bdy) {
            zb2.b(yy2.a(wy2, zb2));
        }
    }
}

