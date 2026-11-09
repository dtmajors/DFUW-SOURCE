/*
 * Decompiled with CFR.
 */
public class cjm
extends cjf {
    public int dRh;

    public cjm() {
        super(cjo.POSTURE_MODE);
    }

    public boolean qb(int n) {
        return this.dRh == n;
    }

    public cjm aQg() {
        super.aPZ();
        cjm cjm2 = (cjm)super.aPZ();
        cjm2.dRh = this.dRh;
        cjm2.ayN = this.ayN;
        return cjm2;
    }

    @Override
    public /* synthetic */ cjf aPZ() {
        return this.aQg();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.aQg();
    }
}

