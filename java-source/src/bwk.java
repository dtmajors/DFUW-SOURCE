/*
 * Decompiled with CFR.
 */
public abstract class bwk
extends btk {
    protected final bvd Uk;
    protected ldv dVj = null;

    public bwk(bvd bvd2) {
        assert (bvd2 != null);
        assert (bvd2.isInitialized());
        this.Uk = bvd2;
    }

    @Override
    public final void cleanUp() {
        super.cleanUp();
        if (this.dVj != null) {
            this.aAA();
            this.aAB();
        }
    }

    public abstract void aAy();

    public abstract void aAz();

    public abstract void aAA();

    public abstract void aAB();

    public abstract void d(lgj var1);

    public abstract void e(lgj var1);
}

