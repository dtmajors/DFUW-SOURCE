/*
 * Decompiled with CFR.
 */
public class er
extends ej {
    private double Pq = 0.0;

    public er() {
        super(9);
        this.DP = 15;
    }

    public double fC() {
        return this.Pq;
    }

    @Override
    public Object getValue() {
        return this.Pq;
    }

    public void d(double d2) {
        if (Double.isNaN(d2)) {
            d2 = 1.0;
        }
        this.Pq = d2;
        if (this.DQ != null) {
            this.DQ.e(this);
        }
    }

    @Override
    public void setValue(Object object) {
        if (object == null) {
            lfn.b(5, "SFDoubleAttribute", "setValue() : Object is null");
            assert (false);
        } else if (!(object instanceof Double)) {
            lfn.b(5, "SFDoubleAttribute", "setValue() : Object is not an SFStringInstance, it is a " + object.getClass().getSimpleName());
            assert (false);
        } else {
            this.Pq = (Double)object;
            if (Double.isNaN(this.Pq)) {
                this.Pq = 1.0;
            }
            if (this.DQ != null) {
                this.DQ.e(this);
            }
        }
    }

    @Override
    public String fj() {
        return Double.toString(this.Pq);
    }

    @Override
    public boolean aq(String string) {
        try {
            this.Pq = Double.parseDouble(string);
            if (Double.isNaN(this.Pq)) {
                this.Pq = 1.0;
            }
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    @Override
    public ej fm() {
        er er2 = new er();
        er2.setType(this.Type);
        er2.d(this.Pq);
        return er2;
    }

    @Override
    public ej fn() {
        return this.fm();
    }
}

