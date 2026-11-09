/*
 * Decompiled with CFR.
 */
public class dcm {
    public a gcV = null;
    public a gcW = null;

    public final dcm bjt() {
        dcm dcm2 = null;
        try {
            Class<?> clazz = this.getClass();
            dcm2 = (dcm)clazz.newInstance();
            this.b(dcm2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return dcm2;
    }

    protected void b(dcm dcm2) {
        assert (this.gcV != a.gda);
        dcm2.gcV = this.gcV;
        dcm2.gcW = this.gcW;
    }
}

