/*
 * Decompiled with CFR.
 */
public class ckl {
    private int ID = -1;
    private boolean eGO = false;

    public void y(int n, boolean bl) {
        this.ID = n;
        this.eGO = bl;
    }

    public final boolean aQV() {
        return this.eGO;
    }

    public final void gj(boolean bl) {
        this.eGO = bl;
    }

    public ckl aQW() {
        ckl ckl2 = new ckl();
        ckl2.ID = this.ID;
        ckl2.eGO = this.eGO;
        return ckl2;
    }

    public final int getID() {
        return this.ID;
    }

    public final void hG(int n) {
        this.ID = n;
    }
}

