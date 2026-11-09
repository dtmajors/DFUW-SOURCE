/*
 * Decompiled with CFR.
 */
public class lmh
extends lmi {
    private double Pq = 0.0;

    public lmh() {
        super(5);
    }

    public double getValue() {
        return this.Pq;
    }

    public void cs(double d2) {
        this.Pq = d2;
    }

    public String toString() {
        return Double.toString(this.getValue());
    }
}

