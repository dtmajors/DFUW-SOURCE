/*
 * Decompiled with CFR.
 */
public class esy
extends euk {
    public static final int eOD = 0;
    public static final int iBy = 1;
    public static final int iBz = 2;
    public static final int iBA = 3;
    public static final int iBB = 4;
    public static final int iBC = 5;
    public static final int izS = 6;
    private int ew = 0;
    private double aDX = 0.0;

    public boolean vA() {
        return this.ew == 6;
    }

    public int getResult() {
        return this.ew;
    }

    public void DR(int n) {
        this.ew = n;
    }

    public double bLn() {
        return this.aDX;
    }

    public void ck(double d2) {
        this.aDX = d2;
    }

    esy() {
        super(19995);
    }
}

