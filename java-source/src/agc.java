/*
 * Decompiled with CFR.
 */
public class agc
extends ahz {
    private String add;

    public agc() {
        super(2);
        this.bls = ahu.c.bmk;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "ClanName";
            }
        }
        return super.eB(n);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" '");
        stringBuilder.append(this.add);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.add;
                return uo2;
            }
        }
        return super.G(n, n2);
    }
}

