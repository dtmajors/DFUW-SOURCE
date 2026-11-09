/*
 * Decompiled with CFR.
 */
public abstract class dde {
    private float gec = 0.0f;
    private float ged = 1.0f;

    public float bjS() {
        return this.gec;
    }

    public void ge(float f2) {
        this.gec = f2;
    }

    public float bjT() {
        return this.ged;
    }

    public void gf(float f2) {
        this.ged = f2;
    }

    public final dde bjU() {
        dde dde2 = null;
        try {
            Class<?> clazz = this.getClass();
            dde2 = (dde)clazz.newInstance();
            this.a(dde2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return dde2;
    }

    public final String getName() {
        return this.bjR().name();
    }

    public abstract cxd.r bjR();

    protected void a(dde dde2) {
        assert (this.gec >= 0.0f && this.gec <= this.ged) : this.gec;
        assert (this.ged >= this.gec && (double)this.ged <= 1.0) : this.ged;
        dde2.ge(this.gec);
        dde2.gf(this.ged);
    }
}

