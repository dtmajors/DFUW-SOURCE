/*
 * Decompiled with CFR.
 */
public class aie
extends ahh {
    private String bni = null;

    public aie() {
        super(4);
        this.bls = ahu.c.bmP;
    }

    public void cC(String string) {
        this.bni = string;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "TeleportChamberName";
            }
        }
        return super.eB(n);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" '");
        stringBuilder.append(this.bni);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 3: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.bni;
                return uo2;
            }
        }
        return super.G(n, n2);
    }
}

