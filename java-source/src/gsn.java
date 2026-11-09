/*
 * Decompiled with CFR.
 */
public class gsn
extends grb {
    public static final int jqT = 1;
    public static final int jqU = 2;
    public static final int jqV = 4;
    private int iFL = 0;
    private double jqW = 0.04;
    private boolean ags = false;
    private int jqX = 0;

    gsn() {
        super(11032);
    }

    public int bWY() {
        return this.iFL;
    }

    public void KA(int n) {
        this.iFL = n;
    }

    public double bWZ() {
        return this.jqW;
    }

    public void cJ(double d) {
        this.jqW = d;
    }

    public boolean bXa() {
        return this.ags;
    }

    public void mm(boolean bl) {
        this.ags = bl;
    }

    public int bXb() {
        return this.jqX;
    }

    public void KB(int n) {
        this.jqX = n;
    }
}

