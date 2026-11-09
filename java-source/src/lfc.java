/*
 * Decompiled with CFR.
 */
public abstract class lfc {
    public abstract lfb acy(int var1);

    public abstract int getSelectionCount();

    public final lfb acz(int n) {
        return this.acy(n % this.getSelectionCount());
    }

    public final lfb eqt() {
        int n = (int)(lgp.erA().acI(1) * (float)this.getSelectionCount());
        return this.acy(n);
    }
}

