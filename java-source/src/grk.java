/*
 * Decompiled with CFR.
 */
public class grk
extends grb {
    public static final int jqj = 1;
    public static final int jqk = 2;
    private int jql = 0;
    private boolean Active = false;
    private boolean bdP = false;

    public grk() {
        super(11039);
    }

    public int bWV() {
        return this.jql;
    }

    public void Kz(int n) {
        this.jql = n;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public boolean isLocked() {
        return this.bdP;
    }

    public void aB(boolean bl) {
        this.bdP = bl;
    }
}

