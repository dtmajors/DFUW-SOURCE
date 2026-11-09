/*
 * Decompiled with CFR.
 */
public abstract class dcl {
    protected cxd.o gcU = null;

    public cxd.o bjq() {
        return this.gcU;
    }

    public final dcl bjr() {
        dcl dcl2 = null;
        try {
            Class<?> clazz = this.getClass();
            dcl2 = (dcl)clazz.newInstance();
            this.a(dcl2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return dcl2;
    }

    public abstract void Ca();

    public final String getName() {
        assert (this.gcU != null);
        return this.gcU.name();
    }

    public void bjs() {
    }

    protected void a(dcl dcl2) {
    }
}

