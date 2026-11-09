/*
 * Decompiled with CFR.
 */
public abstract class age
extends ahl {
    private boolean bhI = false;
    private boolean bhJ = false;

    public age(int n) {
        super(n);
    }

    public void aH(boolean bl) {
        this.bhI = bl;
    }

    @Override
    public boolean AC() {
        return this.bhJ;
    }

    public void aI(boolean bl) {
        this.bhJ = bl;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "NotifyObjectsWhenCreated";
            }
        }
        return super.eB(n);
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 3: {
                tz tz2 = new tz();
                tz2.Uo = n;
                tz2.Pp = this.bhI;
                return tz2;
            }
        }
        return super.G(n, n2);
    }
}

