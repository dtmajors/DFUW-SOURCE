/*
 * Decompiled with CFR.
 */
public class lla
implements Cloneable {
    private int rDy = 1;
    private double rDz;
    private double rDD;
    private double rDE;
    private boolean rDF = false;
    private boolean rDG = false;
    private double rDH = 0.0;
    private double rDI = 0.0;

    public int euC() {
        return this.rDy;
    }

    public void adx(int n) {
        this.rDy = n;
    }

    public double euB() {
        return this.rDz;
    }

    public void er(double d2) {
        this.rDz = d2;
    }

    public double euA() {
        return this.rDD;
    }

    public void eq(double d2) {
        this.rDD = d2;
    }

    public double eux() {
        return this.rDE;
    }

    public void en(double d2) {
        this.rDE = d2;
    }

    public String toString() {
        return "Dur [" + this.rDz + "], Delay[" + this.rDD + ", StartPoint[" + this.rDE + "]";
    }

    public boolean euE() {
        return this.rDF;
    }

    public void yL(boolean bl) {
        this.rDF = bl;
    }

    public boolean euD() {
        return this.rDG;
    }

    public void yK(boolean bl) {
        this.rDG = bl;
    }

    public double euz() {
        return this.rDH;
    }

    public void ep(double d2) {
        this.rDH = d2;
    }

    public double euy() {
        return this.rDI;
    }

    public void eo(double d2) {
        this.rDI = d2;
    }

    protected final Object clone() {
        lla lla2 = (lla)super.clone();
        return lla2;
    }
}

