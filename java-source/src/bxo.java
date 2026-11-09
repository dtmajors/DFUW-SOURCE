/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
public class bxo {
    private byw.a dYS = null;
    private int aWe = 0;

    public bxo(byw.a a2, int n) {
        this.dYS = a2;
        this.aWe = n;
    }

    public byw.a aDH() {
        return this.dYS;
    }

    public int aDI() {
        return this.aWe;
    }

    public String aDJ() {
        assert (this.dYS != null);
        return this.dYS.name();
    }

    public String aDK() {
        assert (this.aWe > 0);
        return lkv.adr((int)this.aWe);
    }

    public String toString() {
        return "SFAnimationStateInfo: ActiveDirection='" + this.aDJ() + "' Animation='" + this.aDK() + "'";
    }
}

