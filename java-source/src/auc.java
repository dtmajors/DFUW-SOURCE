/*
 * Decompiled with CFR.
 */
public class auc {
    private final int Type;
    private final String kW;

    public auc(String string) {
        this.kW = string;
        this.Type = aua.b.bZW.ordinal();
    }

    public auc(int n) {
        this.kW = Integer.toString(n);
        this.Type = aua.b.bZT.ordinal();
    }

    public auc(float f2) {
        this.kW = Float.toString(f2);
        this.Type = aua.b.bZV.ordinal();
    }

    public auc(double d2) {
        this.kW = Double.toString(d2);
        this.Type = aua.b.bZU.ordinal();
    }

    public auc(boolean bl) {
        this.kW = Boolean.toString(bl);
        this.Type = aua.b.bZS.ordinal();
    }

    public aua.b VU() {
        return aua.b.bZY[this.Type];
    }

    public String getStringValue() {
        return this.kW;
    }

    public Integer VV() {
        if (this.VU() == aua.b.bZT) {
            try {
                return Integer.parseInt(this.kW);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    public Float VW() {
        if (this.VU() == aua.b.bZV) {
            try {
                return Float.valueOf(Float.parseFloat(this.kW));
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    public Double VX() {
        if (this.VU() == aua.b.bZU) {
            try {
                return Double.parseDouble(this.kW);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    public Boolean VY() {
        if (this.VU() == aua.b.bZS) {
            try {
                return Boolean.parseBoolean(this.kW);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    public String toString() {
        return this.VU().toString() + ":" + this.kW;
    }
}

