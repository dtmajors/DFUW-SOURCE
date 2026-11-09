/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cwx
 *  cxd
 */
public class cej {
    private final double eql = 0.7;
    private final double eqm = 0.3;
    private final cew dLR;
    private double eqn = 0.0;
    private double eqo = 0.0;

    public cej(cew cew2) {
        this.dLR = cew2;
    }

    public boolean aLy() {
        double d2 = this.dLR.getMessageDelegator().arc().rgz;
        if (d2 < this.eqn) {
            return true;
        }
        this.eqn = d2 + 0.7;
        return false;
    }

    public boolean h(cwx cwx2) {
        assert (cwx2 != null);
        if (cwx2.zg() != cxd.fHu && cwx2.zg() != cxd.fHA) {
            return false;
        }
        double d2 = this.dLR.getMessageDelegator().arc().rgz;
        if (d2 < this.eqo) {
            return true;
        }
        this.eqo = d2 + 0.3;
        return false;
    }
}

