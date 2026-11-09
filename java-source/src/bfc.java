/*
 * Decompiled with CFR.
 */
public abstract class bfc<E>
implements Comparable {
    protected int Uo;
    protected bfb des;
    protected int dgc = -1;
    protected int det;
    protected int dgd;
    protected boolean dev = true;

    public void anT() {
        assert (this.des != null) : "EnvironmentObjecType == null  for class =" + this.getClass().getSimpleName();
        this.dgc = this.des.ordinal();
    }

    public void anU() {
        assert (this.dgc != -1);
        this.des = bfb.values()[this.dgc];
    }

    public int anH() {
        return this.des.ordinal() << 16 | this.Uo;
    }

    public int compareTo(Object object) {
        if (!(object instanceof bfc)) {
            assert (false) : "Wrong type = " + object;
            return -1;
        }
        bfc bfc2 = (bfc)object;
        int n = bfc2.anE();
        int n2 = this.anE();
        if (n > 86400) {
            assert (false) : "Time is too big!";
            n -= 86400;
        }
        if (n2 > 86400) {
            assert (false) : "Time is too big!";
            n2 -= 86400;
        }
        if (n2 < n) {
            return -1;
        }
        if (n2 > n) {
            return 1;
        }
        if (this.Uo < bfc2.AJ()) {
            return -1;
        }
        if (this.Uo > bfc2.AJ()) {
            return 1;
        }
        if (this.des == bfc2.des) {
            lfn.b(5, this.getClass().getName(), "compareTo() : Cannot have two SFEnvironmentTimelineRecords that start at the same time, changing the same property!");
            lfn.b(5, this.getClass().getName(), "compareTo() : This record = " + this);
            lfn.b(5, this.getClass().getName(), "compareTo() : Other record = " + bfc2);
            return 0;
        }
        if (this.des.ordinal() > bfc2.des.ordinal()) {
            return 1;
        }
        return -1;
    }

    public int anE() {
        return this.det;
    }

    public final void kC(int n) {
        if (n < 0 || n > 86400) {
            lfn.b(0, this.getClass().getName(), "setStartTime() : Cannot set StartTime outside of boundaries!");
            assert (false);
            return;
        }
        this.det = n;
    }

    public final int anV() {
        return this.dgd;
    }

    public final void kD(int n) {
        this.dgd = n;
    }

    public final int AJ() {
        return this.Uo;
    }

    public final void eS(int n) {
        this.Uo = n;
    }

    public E getValue() {
        assert (false);
        return null;
    }

    public bfb anG() {
        return this.des;
    }

    public void b(bfb bfb2) {
        this.des = bfb2;
    }

    public boolean anI() {
        return this.dev;
    }

    public void dc(boolean bl) {
        this.dev = bl;
    }

    public String toString() {
        return "Type = " + (Object)((Object)this.des) + ", Property = " + this.Uo + ", StartTime = " + this.det;
    }
}

