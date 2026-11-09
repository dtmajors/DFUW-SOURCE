/*
 * Decompiled with CFR.
 */
public abstract class bzi {
    protected boolean edc = false;

    public final boolean aER() {
        return this.edc;
    }

    public final void fk(boolean bl) {
        this.edc = bl;
    }

    public final bzi aFo() {
        bzi bzi2 = null;
        try {
            Class<?> clazz = this.getClass();
            bzi2 = (bzi)clazz.newInstance();
            this.a(bzi2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return bzi2;
    }

    public boolean a(byx byx2) {
        return false;
    }

    public String toString() {
        return "CheckInverse=" + this.edc;
    }

    protected void a(bzi bzi2) {
        bzi2.fk(this.edc);
    }
}

