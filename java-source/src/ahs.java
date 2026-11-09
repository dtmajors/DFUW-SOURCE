/*
 * Decompiled with CFR.
 */
public class ahs
extends ahz {
    private dek blr = null;

    public ahs() {
        super(2);
        this.bls = ahu.c.bmI;
    }

    public dek Bv() {
        return this.blr;
    }

    public void b(dek dek2) {
        this.blr = dek2;
    }

    public final double Bw() {
        return this.blr.doT;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "SpecialEffectConfig";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" '");
        stringBuilder.append(this.blr.getSpecialEffectName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                un un2 = new un();
                un2.Uo = n;
                un2.aXk = this.blr;
                return un2;
            }
        }
        return super.G(n, n2);
    }
}

