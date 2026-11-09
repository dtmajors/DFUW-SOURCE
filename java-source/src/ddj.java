/*
 * Decompiled with CFR.
 */
public abstract class ddj {
    public final cxd.s geh;
    public int bqK = 0;

    public ddj(cxd.s s2) {
        this.geh = s2;
    }

    public final ddj bka() {
        ddj ddj2 = null;
        try {
            Class<?> clazz = this.getClass();
            ddj2 = (ddj)clazz.newInstance();
            this.b(ddj2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return ddj2;
    }

    public boolean bkb() {
        return true;
    }

    public final boolean bkc() {
        return this instanceof ddp;
    }

    protected void b(ddj ddj2) {
        ddj2.bqK = this.bqK;
    }
}

