/*
 * Decompiled with CFR.
 */
public class hro
extends hrm {
    private int kMy;

    public final void Oe(int n) {
        if (n == this.kMy) {
            return;
        }
        this.kMy = n;
        this.lak.enp();
    }

    @Override
    public int getSize() {
        return this.kMy;
    }
}

