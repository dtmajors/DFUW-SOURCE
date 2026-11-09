/*
 * Decompiled with CFR.
 */
public class lhw {
    protected double aAh;
    private double rnX;

    protected lhw() {
    }

    public lhw(double d2, double d3) {
        this.rnX = d3;
        this.ec(d2);
    }

    public boolean eb(double d2) {
        return d2 > this.aAh;
    }

    public void ec(double d2) {
        this.aAh = d2 + this.rnX;
    }

    public String ed(double d2) {
        return "EndTime = " + this.aAh + ", TimerDuration = " + this.rnX + ", TimeLeft = " + (this.aAh - d2);
    }

    public String toString() {
        return "EndTime = " + this.aAh + ", TimerDuration = " + this.rnX;
    }
}

