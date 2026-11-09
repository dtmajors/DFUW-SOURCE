/*
 * Decompiled with CFR.
 */
public class cjl
extends cjf {
    public int dPu;

    public cjl() {
        super(cjo.LOCATION);
    }

    public boolean qb(int n) {
        return this.dPu == n;
    }

    public cjl aQf() {
        super.aPZ();
        cjl cjl2 = (cjl)super.aPZ();
        cjl2.dPu = this.dPu;
        cjl2.ayN = this.ayN;
        return cjl2;
    }

    @Override
    public /* synthetic */ cjf aPZ() {
        return this.aQf();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.aQf();
    }
}

