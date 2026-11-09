/*
 * Decompiled with CFR.
 */
public abstract class cyg
extends cye {
    public static final double fYb = 3.14496E7;
    public final double aXq;
    public double Up;

    public cyg(int n2, double d2, double d3) {
        super(n2);
        this.aXq = d2;
        this.Up = d3;
    }

    public abstract boolean yF(int var1);

    public final boolean gu() {
        return this.Up == 3.14496E7;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" TimeStart=");
        stringBuilder.append(this.aXq);
        stringBuilder.append(" Timeout=");
        stringBuilder.append(this.Up);
        return stringBuilder.toString();
    }
}

