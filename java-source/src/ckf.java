/*
 * Decompiled with CFR.
 */
public class ckf {
    private boolean avz;
    private int eGl;
    private int eGm;
    private int eGn;

    public final int aQN() {
        return this.eGn;
    }

    public final void rc(int n) {
        this.eGn = n;
    }

    public final int aQO() {
        return this.eGl;
    }

    public final void rd(int n) {
        this.eGl = n;
    }

    public final int aQP() {
        return this.eGm;
    }

    public final void re(int n) {
        this.eGm = n;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }
}

