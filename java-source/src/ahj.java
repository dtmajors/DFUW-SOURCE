/*
 * Decompiled with CFR.
 */
public class ahj
extends ahh {
    private String biK = null;

    public ahj() {
        super(4);
        this.bls = ahu.c.bmD;
    }

    public void cB(String string) {
        this.biK = string;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "PortalName";
            }
        }
        return super.eB(n);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" '");
        stringBuilder.append(this.biK);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 3: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.biK;
                return uo2;
            }
        }
        return super.G(n, n2);
    }
}

