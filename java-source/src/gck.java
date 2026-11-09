/*
 * Decompiled with CFR.
 */
public class gck
extends gch {
    private ljq Position;
    private float Radius;
    private int jdi;
    private int erv;
    private int jdh;
    private double erw;
    private double erx;

    gck() {
        super(32769);
    }

    public final ljq av() {
        return this.Position;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public final int bTx() {
        return this.jdi;
    }

    public final void IJ(int n) {
        this.jdi = n;
    }

    public final int bTt() {
        return this.erv;
    }

    public final void IH(int n) {
        this.erv = n;
    }

    public final int bTu() {
        return this.jdh;
    }

    public final void II(int n) {
        this.jdh = n;
    }

    public final float getRadius() {
        return this.Radius;
    }

    public final void setRadius(float f) {
        this.Radius = f;
    }

    public final double bTv() {
        return this.erw;
    }

    public final void cG(double d2) {
        this.erw = d2;
    }

    public final double bTw() {
        return this.erx;
    }

    public final void cH(double d2) {
        this.erx = d2;
    }
}

