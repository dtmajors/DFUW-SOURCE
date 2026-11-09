/*
 * Decompiled with CFR.
 */
public abstract class hrk<R, F>
implements hrs<R, F> {
    protected final ldl kMt = new ldl();
    public final lij<R> lai;

    public hrk(lij<R> lij2) {
        this.lai = lij2;
    }

    @Override
    public final lbl<lbn> cec() {
        return this.kMt;
    }

    public final void notifyChanged() {
        this.kMt.enp();
    }

    @Override
    public int g(R r, R r2) {
        return this.lai.l(r, r2);
    }

    @Override
    public R N(R r) {
        return this.lai.getParent(r);
    }

    @Override
    public boolean O(R r) {
        return this.lai.contains(r);
    }

    @Override
    public R P(R r) {
        return this.lai.ab(r);
    }

    @Override
    public R Q(R r) {
        return this.lai.ac(r);
    }

    @Override
    public abstract int getFieldCount();

    @Override
    public abstract F a(R var1, int var2);
}

