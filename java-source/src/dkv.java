/*
 * Decompiled with CFR.
 */
public class dkv {
    private int dXk = 0;
    private int dRh = 0;

    public dkv(int n, int n2) {
        this.dXk = n;
        this.dRh = n2;
    }

    public dkv(dkv dkv2) {
        this.dXk = dkv2.dXk;
        this.dRh = dkv2.dRh;
    }

    public int vN() {
        return this.dXk;
    }

    public int vO() {
        return this.dRh;
    }

    public dkv bnX() {
        return new dkv(this.dXk, this.dRh);
    }

    public boolean equals(Object object) {
        dkv dkv2;
        return object instanceof dkv && this.dXk == (dkv2 = (dkv)object).vN() && this.dRh == dkv2.vO();
    }

    public int hashCode() {
        return this.dXk | this.dRh;
    }

    public String toString() {
        return "SFBobberKey: MovementMode=" + this.dXk + " PostureMode=" + this.dRh;
    }
}

